package controllers;
import models.Movie;
public class MovieController {

    public void sortByTitle(Movie[] movies){
        for(int i = 1; i < movies.length; i++){
            Movie aux = movies[i];
            for(int j= 0; j < movies.length; j++){
                while(j >= 0 && movies[j].getName().compareToIgnoreCase(movies[j+1].getName()) > 0){
                    movies[j+1] = movies[j];
                    j--;
                }
                movies[j] = aux;
            }
            
        }
        
        
    }

}
