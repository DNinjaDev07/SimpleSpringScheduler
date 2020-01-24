/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.javaservice.models;

import com.test.javaservice.service.CSVReadClass;

/**
 *
 * @author dogor-Igbosuah
 */
public class ServiceImpl {

    public static void main(String[] args) {
        String FILE_NAME = "service.csv";
        
        CSVReadClass csv = new CSVReadClass();
        csv.InsertData(FILE_NAME);
    }

}
