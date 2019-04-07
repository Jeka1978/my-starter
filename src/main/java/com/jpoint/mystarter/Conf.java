package com.jpoint.mystarter;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author Evgeny Borisov
 */
@Configuration
@EnableAspectJAutoProxy
@EnableConfigurationProperties(MailHolder.class)
public class Conf {


    @Bean
    @ConditionalOnMissingBean
    public MailSender mailSender(){
        System.out.println("Mail sender was created in starter");
        return new MailSender();
    }

    @Bean
    @ConditionalOnProperty("mails.dba")
    public DbExceptionsHandler exceptionsHandler(){
        return new DbExceptionsHandler();
    }

    @Bean
    @OnProdCondition
    public JPointService jPointService(){
        return new JPointService();
    }
}










