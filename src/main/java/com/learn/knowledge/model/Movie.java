package com.learn.knowledge.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Movie {

    @Id
    private Integer id;
    private String title;
    private String releaseDate;
    private String director;
    private String studio;

}
