package com.example.thanhjav.dto;

import com.example.thanhjav.entity.Cast;
import com.example.thanhjav.entity.Director;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class CastDTO {
    private int id;
    private String name;
    private String description;
    private String image;
    private Date createdAt;
    private Date updatedAt;

    public CastDTO(Cast cast) {
        this.id = cast.getId();
        this.name = cast.getName();
        this.image = cast.getImage();
        this.createdAt = cast.getCreatedAt();
        this.updatedAt = cast.getUpdatedAt();
        this.description = cast.getDescription();
    }
}
