package com.Musicom.discogs_client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DiscogsClientConfig {
    @Bean
    public DiscogsClientUrlBuilderProvider discogsClientUrlBuilderProvider(
            @Value("${discogs.api.consumer_key}") String consumerKey,
            @Value("${discogs.api.consumer_secret}") String consumerSecret,
            @Value("${discogs.api.host}") String host) {
        return new DiscogsClientUrlBuilderProvider(consumerKey, consumerSecret, host);
    }
}
