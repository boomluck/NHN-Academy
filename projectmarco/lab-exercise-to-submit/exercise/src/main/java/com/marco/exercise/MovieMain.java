package com.marco.exercise;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Set;
import java.io.FileReader;
import java.io.BufferedReader;

class Movie {
  private final long movieId;
  private final String title;
  private final Set<String> genres;
}

class MovieParser {
    String MOVIE_FILE_NAME= "movies.csv";
    List<Movie> parse() throws IOException;
    List<Movie> list = new ArrayList<>();

    BufferedReader reader = new BufferedReader(new FileReader(MOVIE_FILE_NAME));
    String line;
    while ((line = reader.readLine()) != null) {
      String[] parts = line.split(",");
      String[] genre = parts[2].split("|");
      list.add(new Movie(parts[0], parts[1], parts[2]));
    }
    
    default InputStream getMovieFileAsStream(){
        return getClass().getClassLoader().getResourceAsStream(MOVIE_FILE_NAME);
    }
}

class ApacheCommonsCsvMovieParser implements MovieParser {
  @Override
  public List<Movie> parse() throws IOException {
      return null;
  }
}

public class MovieMain {
  public static void main(String[] args) {
    //MovieParser movieParser = new BasicMovieParser();
    MovieParser movieParser = new ApacheCommonsCsvMovieParser();

    try {
      List<Movie> movieList = movieParser.parse();
      for(Movie movie : movieList){
        System.out.println(movie);
      }
    }catch (Exception e){
      System.out.println(e.getMessage());
    }

  }
}