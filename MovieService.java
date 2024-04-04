package com.example.moviesweb;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    @Autowired
    private MoviesRepository moviesRepository;

    public List<Movie> allMovies(){
        return moviesRepository.findAll();
    }


    public Optional<Movie> singleMovie(ObjectId id) {
        return moviesRepository.findById(id);
    }
    public Optional<Movie> singleMovieByImdbId(String imdbId){
        return moviesRepository.findMovieByImdbId(imdbId);
    }
}
