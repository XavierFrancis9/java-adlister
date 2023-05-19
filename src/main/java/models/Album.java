package models;

import java.io.Serializable;

public class Album implements Serializable {
    private String artist_name;
    private String album_name;
    private int release_date;
    private String genre;
    private double sales;

    public Album() {};

    public Album(String artist_name, String album_name, int release_date, String genre, double sales) {
        this.artist_name = artist_name;
        this.album_name = album_name;
        this.release_date = release_date;
        this.genre = genre;
        this.sales = sales;
    }

    public String getArtist_name() {
        return artist_name;
    }

    public void setArtist_name(String artist_name) {
        this.artist_name = artist_name;
    }

    public String getAlbum_name() {
        return album_name;
    }

    public void setAlbum_name(String album_name) {
        this.album_name = album_name;
    }

    public int getRelease_date() {
        return release_date;
    }

    public void setRelease_date(int release_date) {
        this.release_date = release_date;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public double getSales() {
        return sales;
    }

    public void setSales(double sales) {
        this.sales = sales;
    }
}
