package com.nyash.app.springpractice;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music {

    public List<String> songs = new ArrayList<>();
    {
        songs.add("Hungarian Rhapsody");
        songs.add("Fly Away");
        songs.add("TULULU TULALA");
    }

    @Override

    public List<String> getSongs() {
        return songs;
    }
}
