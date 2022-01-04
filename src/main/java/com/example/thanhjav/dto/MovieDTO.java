package com.example.thanhjav.dto;

import com.example.thanhjav.entity.Movie;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
public class MovieDTO {
    private int id;
    private String name;
    private Date createdAt;
    private Date updatedAt;
    private String thumbnail;
    private String description;
    private double duration;
    private int view;
    private String url;
    private int categoryId;
    private int directorId;
    private CategoryDTO category;
    private DirectorDTO director;
    private List<CastDTO> casts;

    public MovieDTO(Movie movie) {
        this.id = movie.getId();
        this.name = movie.getName();
        this.createdAt = movie.getCreatedAt();
        this.updatedAt = movie.getUpdatedAt();
        this.thumbnail = movie.getThumbnail();
        this.description = movie.getDescription();
        this.duration = movie.getDuration();
        this.view = movie.getView();
        this.url = movie.getUrl();
        this.categoryId = movie.getCategory().getId();
        this.directorId = movie.getDirector().getId();
        this.category = new CategoryDTO(movie.getCategory());
        this.director = new DirectorDTO(movie.getDirector());
        this.casts = movie.getCasts().stream().map(CastDTO::new).collect(Collectors.toList());
    }
}
