package com.nyash.app.springpractice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.lang.management.MemoryUsage;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class MusicPlayer {

    private RockMusic rockMusic;
    private ClassicalMusic classicalMusic;

    @Autowired

    public MusicPlayer(@Qualifier("rockMusic") RockMusic rockMusic, @Qualifier("classicalMusic") ClassicalMusic classicalMusic) {
        this.rockMusic = rockMusic;
        this.classicalMusic = classicalMusic;
    }

    public void playMusic(MusicGenre musicGenre) {
        Random random = new Random();
        int randomNumber = random.nextInt(3);
        if (musicGenre == MusicGenre.CLASSICAL){
            System.out.println(classicalMusic.getSongs().get(randomNumber));
        } else {
            System.out.println(rockMusic.getSongs().get(randomNumber));
        }
    }
}