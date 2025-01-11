package com.Musicom.discogs_client;

import org.springframework.web.util.UriComponentsBuilder;

public record DiscogsClientUrlBuilderProvider (String consumerKey, String consumerSecret, String host) {
    public UriComponentsBuilder builder() {
        return UriComponentsBuilder.newInstance()
                .scheme("https")
                .host(host())
                .queryParam("key", consumerKey())
                .queryParam("secret", consumerSecret());
    }
}
