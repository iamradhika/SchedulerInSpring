package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class DemoService {
    private static  final Logger log = LoggerFactory.getLogger(DemoService.class);

    @Scheduled(fixedRate = 2000)
    public void scheduledTask1(){

        log.info("This is a reminder for task1!!");
    }


    @Scheduled(fixedRate = 4000)
    public void scheduledTask2(){

        log.info("This is a reminder for task2!!");
    }
}
