package com.nyash.app.springpractice.config;

import com.nyash.app.springpractice.Computer;
import com.nyash.app.springpractice.Music;
import com.nyash.app.springpractice.MusicPlayer;
import com.nyash.app.springpractice.genres.ClassicalMusic;
import com.nyash.app.springpractice.genres.RapMusic;
import com.nyash.app.springpractice.genres.RockMusic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Configuration
@ComponentScan("com.nyash.app.springpractice")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {

    @Bean
    public ClassicalMusic classicalMusic(){
        return new ClassicalMusic();
    }

    @Bean
    public RockMusic rockMusic(){
        return new RockMusic();
    }

    @Bean
    public RapMusic rapMusic(){
        return new RapMusic();
    }

    @Bean
    public List<Music> musicList(){
        return Arrays.asList(classicalMusic(), rockMusic(),rapMusic());
    }

    @Bean
    public MusicPlayer musicPlayer(){
        return  new MusicPlayer(musicList());
    }

    @Bean
    public Computer computer(){
        return  new Computer(musicPlayer());
    }
}
