package com.example.translator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@SpringBootApplication
@EnableScheduling
public class TranslatorApplication {

    private static final Logger logger = LoggerFactory.getLogger(TranslatorApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(TranslatorApplication.class, args);
        logger.info("GP2GP Translator started successfully");
    }

    // Logs a message every 10 seconds so you can easily see if logs are being written
    @Scheduled(fixedRate = 10000)
    public void heartbeat() {
        logger.info("[TRANSLATOR] v2 - Heartbeat - service is running. Working dir: {}", System.getProperty("user.dir"));
    }
}
