package com.nyash.app.springpractice.genres;

import com.nyash.app.springpractice.Music;

public class RockMusic implements Music {

    @Override
    public String getSongs() {
        return "Smoke on the water";
    }
}
