package com.jpoint.mystarter;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @author Evgeny Borisov
 */
public class ConditionalOnProd implements Condition {
    private static Boolean answer;
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        if (answer == null) {
            answer=!System.getenv().get("OS").toLowerCase().contains("windows");
            System.out.println("2 часа прошло и мы выяснили какая у на OS");
        }
        return answer;

    }
}
