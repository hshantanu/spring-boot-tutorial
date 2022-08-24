package com.example.springboottutorial.demo;

public class BaseballCoach implements Coach{

    @Override
    public String getDailyWorkOut(){
        return "Spend 30 minutes batting.";
    }
}
