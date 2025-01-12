package com.Musicom.data.repository;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.stereotype.Repository;

@Repository
@Getter
@AllArgsConstructor
public class MusicomDataCatalog {
    private final BandRepository bands;
    private final CountryRepository countries;
    private final GenreRepository genres;
    private final MemberRepository members;
    private final RatingRepository ratings;
    private final ReleaseRepository releases;
    private final StyleRepository styles;
    private final TrackRepository tracks;
    private final VideoRepository videos;
}
