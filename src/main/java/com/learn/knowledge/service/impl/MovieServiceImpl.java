package com.learn.knowledge.service.impl;

import com.learn.knowledge.exceptions.MovieNotFoundException;
import com.learn.knowledge.model.Movie;
import com.learn.knowledge.repository.MovieRepository;
import com.learn.knowledge.service.MovieService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class MovieServiceImpl implements MovieService {

    @Autowired
    private MovieRepository movieRepository;

    @Override
    public Movie getMovieById(Integer id) {
        log.traceEntry("Searching for movie: {}", id);
        Movie response = movieRepository.findById(id).orElseThrow(() -> new MovieNotFoundException());
        return log.traceExit(response);
    }

    @Override
    public Movie saveMovie(Movie movie) {
        log.traceEntry("Saving movie: {}", movie);
        return movieRepository.save(movie);
    }
}
