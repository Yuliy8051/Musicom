package com.Musicom.discogs_client.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public record TrackDto(String position,
                       @JsonProperty("title")
                       String name,
                       String duration) {
}
