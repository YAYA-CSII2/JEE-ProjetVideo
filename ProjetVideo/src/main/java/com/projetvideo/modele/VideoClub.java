package com.projetvideo.modele;

public class VideoClub {

    private static VideoClub instance = null;

    public static VideoClub getInstance() {
        if (instance == null) {
            instance = new VideoClub();
        }
        return instance;
    }
}
