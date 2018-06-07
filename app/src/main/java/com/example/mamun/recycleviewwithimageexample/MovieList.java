package com.example.mamun.recycleviewwithimageexample;

public class MovieList {

    private int movieImage;
    private String movieName;
    private String directorName;

    public MovieList(int movieImage, String movieName, String directorName) {
//        this.setMovieImage(movieImage);
//        this.setMovieName(movieName);
//        this.setDirectorName(directorName);

        this.movieImage = movieImage;
        this.movieName = movieName;
        this.directorName = directorName;

    }

    public int getMovieImage() {
        return movieImage;
    }

    public String getMovieName() {
        return movieName;
    }

    public String getDirectorName() {
        return directorName;
    }

    public void setMovieImage(int movieImage) {
        this.movieImage = movieImage;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public void setDirectorName(String directorName) {
        this.directorName = directorName;
    }
}
