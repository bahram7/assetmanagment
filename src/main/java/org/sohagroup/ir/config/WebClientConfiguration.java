package org.sohagroup.ir.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.ExchangeStrategies;
import org.springframework.web.reactive.function.client.WebClient;

@Component
public class WebClientConfiguration {

    @Bean
    @Qualifier("webClient")
    public WebClient webClient() {
        final int size = 32 * 1024 * 1024;
        final ExchangeStrategies strategies = ExchangeStrategies
            .builder()
            .codecs(codecs -> codecs.defaultCodecs().maxInMemorySize(size))
            .build();
        return WebClient.builder().exchangeStrategies(strategies).build();
    }
}
