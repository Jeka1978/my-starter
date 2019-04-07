package com.jpoint.mystarter;/**
 * @author Evgeny Borisov
 */

import org.springframework.context.annotation.Conditional;

import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Retention(RUNTIME)
@Conditional(ConditionalOnProd.class)
public @interface OnProdCondition {
}
