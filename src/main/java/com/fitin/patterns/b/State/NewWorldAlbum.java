package com.fitin.patterns.b.State;

import java.util.ArrayList;
import java.util.List;

public class NewWorldAlbum implements Album {
    private final List<String> songs = new ArrayList<>();

    public NewWorldAlbum() {
        songs.add("1. Berlin song");
        songs.add("2. Dog March");
        songs.add("3. Go To The Cinema");
        songs.add("4. I'm uzbek");
        songs.add("5. Seva is uzbek too");
        songs.add("6. MagavaCavalaTumTumOo");
    }

    @Override
    public List<String> getSongs() {
        return songs;
    }
}
