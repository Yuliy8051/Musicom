package com.Musicom.discogs_client.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public record PagedResultDto(
        @JsonProperty("pagination")
        PagesDto pagesDto,
        @JsonProperty("results")
        List<ReleaseIdDto> releasesIdDto) {

        public record PagesDto (int pages) {}

        public record ReleaseIdDto (long id) {}
}
