package com.Musicom.discogs_client;

import com.Musicom.discogs_client.dto.BandDto;
import com.Musicom.discogs_client.dto.PagedResultDto;
import com.Musicom.discogs_client.dto.ReleaseDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;
import org.springframework.web.util.UriComponentsBuilder;

@Component
@AllArgsConstructor
public class DiscogsClient {
    private final RestClient restClient;

    private final DiscogsClientUrlBuilderProvider urlBuilder;

    public PagedResultDto getPageByYear(int year) {
        return getPageByYear(year, null);
    }

    public PagedResultDto getPageByYear(int year, Integer page) {
        UriComponentsBuilder builder = urlBuilder
                .builder()
                .pathSegment("database", "search")
                .queryParam("year", year);

        if (page != null)
            builder.queryParam("page", page);

        String url = builder.toUriString();

        return restClient
                .get()
                .uri(url)
                .retrieve()
                .body(PagedResultDto.class);
    }

    public ReleaseDto getRelease(long id) {
        String url = urlBuilder
                .builder()
                .pathSegment("releases", id+"")
                .toUriString();
        return restClient
                .get()
                .uri(url)
                .retrieve()
                .body(ReleaseDto.class);
    }

    public BandDto getBand(long id) {
        String url = urlBuilder
                .builder()
                .pathSegment("artists", id+"")
                .toUriString();
        return restClient
                .get()
                .uri(url)
                .retrieve()
                .body(BandDto.class);
    }
}
