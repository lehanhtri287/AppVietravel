package com.example.trile.appvietravel;

/**
 * Created by trile on 3/30/2018.
 */

public class TourInfo {
    private String names;
    private int image;

    public TourInfo(String names, int image) {
        this.names = names;
        this.image = image;
    }

    public TourInfo() {
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "TourInfo{" +
                "names='" + names + '\'' +
                ", image=" + image +
                '}';
    }
}
