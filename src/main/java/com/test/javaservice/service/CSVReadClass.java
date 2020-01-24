/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.javaservice.service;

import com.test.javaservice.models.DBConnector;
import com.test.javaservice.models.DataClass;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

/**
 *
 * @author dogor-Igbosuah
 */
@Component
public class CSVReadClass {

    public void InsertData(String filename) {

        DataClass d = new DataClass();

        try {

            //String FILE_NAME = "service.csv";
            //String FILE_NAME = "C:\\Users\\dogor-Igbosuah\\Desktop\\service.csv";
            // List<DataClass> alldata = new ArrayList<>();
            //Scanner scan = new Scanner(new FileInputStream(FILE_NAME));
            BufferedReader buffReader = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\Users\\dogor-Igbosuah\\Documents\\NetBeansProjects\\NIPInwardService\\servicedata.csv")));
            String line = buffReader.readLine();

            while (line != null) {

                String[] data = line.split(",");

                d.setTag(data[0]);
                d.setCompanyCode(data[1]);
                d.setCount(data[2]);

                System.out.println(d.toString());

                List<Object> nipvalues = new ArrayList<>();
                List<String> nipheaders = new ArrayList<>();

                nipvalues.add(d.getTag());
                nipheaders.add("TAG");

                nipvalues.add(d.getCompanyCode());
                nipheaders.add("CompanyCode");

                nipvalues.add(d.getCount());
                nipheaders.add("Count");

                DBConnector db = new DBConnector("localhost", "dannyboy", "123456", "NIPLogs");
                db.insertData(nipheaders, nipvalues.toArray(), "ServiceTable");
                line = buffReader.readLine();
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
