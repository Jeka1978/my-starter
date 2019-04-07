package com.jpoint.mystarter;/**
 * @author Evgeny Borisov
 */

import org.springframework.context.annotation.Import;

import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Retention(RUNTIME)
@Import(Conf.class)
public @interface EnableMyStarter {
}
