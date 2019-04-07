package com.jpoint.mystarter;

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
    public MailSender mailSender(){
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










