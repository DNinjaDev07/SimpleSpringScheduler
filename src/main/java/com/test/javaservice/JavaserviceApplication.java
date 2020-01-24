package com.test.javaservice;

import com.test.javaservice.service.CSVReadClass;
import com.test.javaservice.service.Scheduler;
import java.sql.SQLException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class JavaserviceApplication {

    public static void main(String[] args) throws SQLException {
    SpringApplication.run(JavaserviceApplication.class, args);

//       Scheduler csv = ct.getBean(Scheduler.class);
//
//        csv.dataserv();
    }

}
