package com.nyash.app.springpractice.genres;

import com.nyash.app.springpractice.Music;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class ClassicalMusic implements Music {

    @PostConstruct
    public void doMyInit() {
        System.out.println("Doing my initialization");
    }

    // Для Prototype бинов не вызывается destroy-метод!
    @PreDestroy
    public void doMyDestroy() {
        System.out.println("Doing my destruction");
    }

    @Override
    public String getSongs() {
        return "Hungarian Rhapsody";
    }

}
