package com.jpoint.mystarter;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Evgeny Borisov
 */
public class MailSender {

    @Autowired
    private MailHolder mailHolder;

    public void sendMail(MyDbException ex){
        String mailOfDba = mailHolder.getDba();
        System.out.println("mail was sent to "+mailOfDba+" message: "+ex.getMessage());

    }
}
