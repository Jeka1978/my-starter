package com.jpoint.mystarter;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author Evgeny Borisov
 */

@ConfigurationProperties("mails")
@Data
public class MailHolder {
    private String dba;
}
