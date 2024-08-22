package com.utils;

import java.io.*;
import java.util.*;

public class LoginAction {
    public void loadProperty() {
        Properties properties = new Properties();
        try {
            FileInputStream fileInput = new FileInputStream("config.properties");
            properties.load(fileInput);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Constants.APP_URL= properties.getProperty("APP_URL");
        Constants.USERNAME = properties.getProperty("USERNAME");
        Constants.PASSWORD = properties.getProperty("PASSWORD");
        Constants.INVALIDUSERNAME = properties.getProperty("INVALIDUSERNAME");
        Constants.INVALIDPASSWORD = properties.getProperty("INVALIDPASSWORD");
        Constants.FIRSTNAME = properties.getProperty("FIRSTNAME");
        Constants.LASTNAME = properties.getProperty("LASTNAME");
        Constants.ZIPCODE = properties.getProperty("ZIPCODE");
    }
}
