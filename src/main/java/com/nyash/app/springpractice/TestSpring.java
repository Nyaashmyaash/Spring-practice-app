package com.nyash.app.springpractice;

import com.nyash.app.springpractice.config.SpringConfig;
import com.nyash.app.springpractice.genres.RockMusic;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                SpringConfig.class
        );

//        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        System.out.println(musicPlayer.getName());
//        System.out.println(musicPlayer.getVolume());
//        musicPlayer.playMusic(MusicGenre.CLASSICAL);

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        musicPlayer.playMusic();



            context.close();
    }
}
