package Week2.day7.movie;

import java.util.ArrayList;

public class Movie {
    private String title;
    private String studio;
    private String rating;

    public Movie(String title, String studio, String rating) {
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }

    public Movie(String title, String studio) {
        this.title = title;
        this.studio = studio;
        this.rating = "PG";
    }

    public  Movie[] getPG(Movie[] movies){
        ArrayList<Movie> movies2 = new ArrayList<>();
        for(Movie movie:movies){
            if(movie.rating.equals("PG")){
                movies2.add(movie);
            }
        }
        Movie[] mov = new Movie[movies2.size()];
        for (int i = 0;i< movies2.size();i++){
            mov[i] = movies2.get(i);
        }
        return mov;
    }

}
