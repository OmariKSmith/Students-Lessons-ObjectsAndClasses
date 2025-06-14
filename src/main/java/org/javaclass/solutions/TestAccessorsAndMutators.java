package org.javaclass.solutions;
//!                             Create an instance of Movie and TV using
//!                             no-arg constructors.
//!
//!                             Use mutators to initialize instance variables.
//!                             Use accessors to output instance values to console.

public class TestAccessorsAndMutators {

    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.setRating('R');
        movie.setRuntime(1.50);
        movie.setStreaming(true);
        movie.setTitle("SuperMan");
        movie.setViews(200000);

        System.out.println(movie.getTitle());
        System.out.println(movie.getRating());
        System.out.println(movie.getRuntime());
        System.out.println(movie.isStreaming());
        System.out.println(movie.getViews());

        System.out.println();

        TV tv = new TV();
        tv.setBrand("Samsung");
        tv.setOn(true);
        tv.setChannel(12);
        tv.setVolume(10);
        tv.setWifiEnabled(true);

        System.out.println(tv.getBrand());
        System.out.println(tv.isOn());
        System.out.println(tv.getChannel());
        System.out.println(tv.getVolume());
        System.out.println(tv.isWifiEnabled());

    }
}
