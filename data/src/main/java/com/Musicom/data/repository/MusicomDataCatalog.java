package com.Musicom.data.repository;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.stereotype.Repository;

@Repository
@Getter
@AllArgsConstructor
public class MusicomDataCatalog {
    private BandRepository bands;
    private CountryRepository countries;
    private GenreRepository genres;
    private MemberRepository members;
    private RatingRepository ratings;
    private ReleaseRepository releases;
    private StatsRepository stats;
    private StyleRepository styles;
    private TrackRepository tracks;
    private VideoRepository videos;
}
