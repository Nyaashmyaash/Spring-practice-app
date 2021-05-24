package com.nyash.app.springpractice.genres;


import com.nyash.app.springpractice.Music;


import java.util.List;


public class RapMusic implements Music {

    @Override
    public String getSongs() {
        return "99 problems";
    }
}
