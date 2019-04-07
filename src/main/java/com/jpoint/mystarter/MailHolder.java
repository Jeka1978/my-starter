package com.jpoint.mystarter;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author Evgeny Borisov
 */

@ConfigurationProperties("mails")
@Data
public class MailHolder {
    private String dba;
}
