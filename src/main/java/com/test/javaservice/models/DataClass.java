/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.javaservice.models;

/**
 *
 * @author dogor-Igbosuah
 */
public class DataClass {

    private String tag;
    private String count;
    private String companyCode;

    /**
     * @return the tag
     */
    public String getTag() {
        return tag;
    }

    @Override
    public String toString() {
        return "DataClass{" + "tag=" + tag + ", count=" + count + ", companyCode=" + companyCode + '}';
    }

    /**
     * @return the count
     */
    public String getCount() {
        return count;
    }

    /**
     * @return the companyCode
     */
    public String getCompanyCode() {
        return companyCode;
    }

    /**
     * @param tag the tag to set
     */
    public void setTag(String tag) {
        this.tag = tag;
    }

    /**
     * @param count the count to set
     */
    public void setCount(String count) {
        this.count = count;
    }

    /**
     * @param companyCode the companyCode to set
     */
    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }


   
}
