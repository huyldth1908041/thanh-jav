package com.example.thanhjav.dto;

import com.example.thanhjav.entity.Category;
import com.example.thanhjav.entity.Director;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class DirectorDTO {
    private int id;
    private String name;
    private String image;
    private String description;
    private Date createdAt;
    private Date updatedAt;
    public DirectorDTO(Director director) {
        this.id = director.getId();
        this.name = director.getName();
        this.image = director.getImage();
        this.createdAt = director.getCreatedAt();
        this.updatedAt = director.getUpdatedAt();
        this.description = director.getDescription();
    }
}
