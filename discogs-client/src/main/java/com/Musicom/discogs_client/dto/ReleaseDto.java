package com.Musicom.discogs_client.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public record ReleaseDto(long id,
                         int year,
                         @JsonProperty("community")
                         CommunityDto community,
                         String country,
                         List<VideoDto> videos,
                         @JsonProperty("tracklist")
                         List<TrackDto> tracks,
                         @JsonProperty("artists")
                         List<BandSummaryDto> bands,
                         List<String> genres,
                         List<String> styles) {

    public record CommunityDto(RatingDto rating) {}

    public record BandSummaryDto(long id, String name) {}
}
