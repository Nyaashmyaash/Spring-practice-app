package com.nyash.app.springpractice;

public class ClassicalMusic implements Music{
    public void doMyInit() {
        System.out.println("Doing my initialization");
    }

    public void doingMyDestroy(){
        System.out.println("Doing my destruction");
    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
