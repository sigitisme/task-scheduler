package com.github.sigitisme.taskscheduler.scheduler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class Scheduler {

    private static final Logger log = LoggerFactory.getLogger(Scheduler.class);

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-YY HH:mm:ss");

    @Scheduled(cron = "*/1 * * * * *")
    public void perSecondTask(){
        log.info("perSecondTask {}", dateFormat.format(new Date()));
    }

    @Scheduled(cron = "0 */1 * * * *")
    public void perMinuteTask(){
        log.info("perMinuteTask {}", dateFormat.format(new Date()));
    }


}
