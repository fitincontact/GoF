package com.fitin.patterns.b.State;

public class Player {
    private final Album album;
    private final int size;
    private int current = 0;

    public Player(Album album) {
        this.album = album;
        this.size = album.getSongs().size();
    }

    public String exec(PlayerState state) {
        switch (state) {
            case NEXT -> {
                current = current == size ? 0 : current + 1;
                return album.getSongs().get(current);
            }
            case PREVIOUS -> {
                current = current == 0 ? size - 1 : current - 1;
                return album.getSongs().get(current);
            }
            case PLAY -> {
                return album.getSongs().get(current) + ": la-la-la!";
            }
            default -> {
                return "";
            }
        }
    }
}
