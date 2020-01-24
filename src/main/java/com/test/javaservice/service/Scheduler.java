/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.javaservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 *
 * @author dogor-Igbosuah
 */
@EnableScheduling
@Component
public class Scheduler {

    @Autowired
    private CSVReadClass csv;

    @Scheduled(fixedDelay = 3000, initialDelay = 60000)
    public synchronized void dataserv() {
        System.out.println(" =========== STARTING FROM SCRATCH ==========");
        String filename = "servicedata.csv";
        int i = 0;
        while(i < 25){
        csv.InsertData(filename);
        System.out.println(" ============ RUNNING " + i + "th TIME ================");
        i++;
        }
    }

}
