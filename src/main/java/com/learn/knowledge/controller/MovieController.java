package com.learn.knowledge.controller;

import com.learn.knowledge.model.Movie;
import com.learn.knowledge.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api")
@RestController
public class MovieController {

    @Autowired
    private MovieService movieService;

    @Value("${app.message}")
    private String message;

    @GetMapping("/{id}")
    public Movie getMovieById(@PathVariable("id") Integer id) {
        System.out.println(message);
        return movieService.getMovieById(id);

    }

    @PostMapping("/save")
    public Movie createMovie(@RequestBody Movie movie) {
        return movieService.saveMovie(movie);
    }

}
