package com.Musicom.data.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Release {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long sourceId;

    private int year;

    private String title;

    private LocalDate releaseDate;

    @OneToOne
    private Rating rating;

    @OneToOne
    private Stats stats;

    @ManyToOne
    private Country country;

    @OneToMany(mappedBy = "release")
    private Set<Video> videos;

    @OneToMany(mappedBy = "release")
    private Set<Track> tracks;

    @ManyToMany
    private Set<Band> bands;

    @ManyToMany
    private Set<Genre> genres;

    @ManyToMany
    private Set<Style> styles;

}
