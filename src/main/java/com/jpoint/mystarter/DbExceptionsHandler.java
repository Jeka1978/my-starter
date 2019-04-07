package com.jpoint.mystarter;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;

/**
 * @author Evgeny Borisov
 */
@Aspect
public class DbExceptionsHandler {

    @Autowired
    private MailSender mailSender;



    @Pointcut("execution(* com.jpoint.business.dao.*.*(..))")
    public void allBusinessMethods() {
    }

    @PostConstruct
    public void init() {
        System.out.println("Aspect created");
    }


    @AfterThrowing(value = "allBusinessMethods()", throwing = "ex")
    public void handleDbExceptions(MyDbException ex) {
        mailSender.sendMail(ex);
    }

}
