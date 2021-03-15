package com.github.prifiz.homestuffmaintenance.service;

import com.github.prifiz.homestuffmaintenance.web.response.StuffResponse;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.io.IOException;
import java.util.Optional;

@Service
public class StuffWebClient {

    WebClient client = WebClient.create("http://localhost:8080/api/v1");

    public Long findStuffId(String name, String manufacturer, String model) throws IOException {
        Optional<StuffResponse> response = client.get()
                .uri("/stuff/{name}/{manufacturer}/{model}", name, manufacturer, model)
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToMono(StuffResponse.class)
                .blockOptional();

        if (response.isPresent()) {
            return response.get().getId();
        } else {
            throw new IOException("FAIL");
        }
    }

}
