package com.nyash.app.springpractice;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Component
public class RockMusic implements Music {

    List<String> songs = new ArrayList<>();

    {
        songs.add("Smoke on the water");
        songs.add("Wind cries Mary");
        songs.add("Show must go on");
    }

    @Override
    public List<String> getSongs() {
        return songs;
    }
}
