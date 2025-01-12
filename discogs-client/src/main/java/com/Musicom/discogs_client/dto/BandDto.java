package com.Musicom.discogs_client.dto;

import java.util.List;

public record BandDto(long id,
                      String name,
                      List<MemberDto> members) {
}
