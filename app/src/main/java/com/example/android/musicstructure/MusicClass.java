package com.example.android.musicstructure;

class MusicClass {
    private int imgRes;
    private String name;

    MusicClass(int imgRes, String name) {
        this.imgRes = imgRes;
        this.name = name;
    }

    int getImgRes() {
        return imgRes;
    }

    String getName() {
        return name;
    }
}
