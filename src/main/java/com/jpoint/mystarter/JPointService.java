package com.jpoint.mystarter;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Evgeny Borisov
 */
public class JPointService {
    @EventListener(ContextRefreshedEvent.class)
    public void printMessage(){
        System.out.println("Да здравствует JPOINT!!!");
    }
}
