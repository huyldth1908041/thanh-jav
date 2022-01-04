package com.example.thanhjav.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private Date createdAt;
    private Date updatedAt;
    private String thumbnail;
    private String description;
    private double duration;
    private int view;
    private String url;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinColumn(name = "categoryId")
    private Category category;

    @Column(insertable = false, updatable = false)
    private int categoryId;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinColumn(name = "directorId")
    private Director director;

    @Column(insertable = false, updatable = false)
    private int directorId;


    @ManyToMany(cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH},
            fetch = FetchType.EAGER)

    @JoinTable(
            name = "movie_cast",
            joinColumns = @JoinColumn(name = "movie_id"),
            inverseJoinColumns = @JoinColumn(name = "cast_id"))
    private Set<Cast> casts;

}
