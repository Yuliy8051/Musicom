package com.Musicom.discogs_client.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public record MemberDto(long id,
                        String name,
                        @JsonProperty("active")
                        boolean isActive) {
}
