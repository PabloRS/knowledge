package com.learn.knowledge.service;

import com.learn.knowledge.model.Movie;

public interface MovieService {

    Movie getMovieById(Integer id);

    Movie saveMovie(Movie movie);
}
