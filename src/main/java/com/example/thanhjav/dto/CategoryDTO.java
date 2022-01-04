package com.example.thanhjav.dto;

import com.example.thanhjav.entity.Category;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class CategoryDTO {
    private int id;
    private String name;
    private String image;
    private Date createdAt;
    private Date updatedAt;

    public CategoryDTO(Category category) {
        this.id = category.getId();
        this.name = category.getName();
        this.image = category.getImage();
        this.createdAt = category.getCreatedAt();
        this.updatedAt = category.getUpdatedAt();
    }
}
