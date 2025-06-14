package org.javaclass.solutions;

//!                             Declare the appropriate accessors, mutators,
//!                             and constructors for this class.
class Movie {
    String title;
    boolean isStreaming;
    char rating;
    double runtime;
    int views;

    public Movie() {
    }

    public Movie(String title, boolean isStreaming, char rating, double runtime, int views) {
        this.title = title;
        this.isStreaming = isStreaming;
        this.rating = rating;
        this.runtime = runtime;
        this.views = views;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isStreaming() {
        return isStreaming;
    }

    public void setStreaming(boolean streaming) {
        isStreaming = streaming;
    }

    public char getRating() {
        return rating;
    }

    public void setRating(char rating) {
        this.rating = rating;
    }

    public double getRuntime() {
        return runtime;
    }

    public void setRuntime(double runtime) {
        this.runtime = runtime;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", isStreaming=" + isStreaming +
                ", rating=" + rating +
                ", runtime=" + runtime +
                ", views=" + views +
                '}';
    }
}
