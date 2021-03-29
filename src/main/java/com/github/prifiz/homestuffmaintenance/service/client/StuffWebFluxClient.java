package com.github.prifiz.homestuffmaintenance.service.client;

import com.github.prifiz.homestuffmaintenance.web.response.StuffResponse;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.io.IOException;
import java.util.Optional;

@Service
@Qualifier("stuffWebFluxClient")
public class StuffWebFluxClient implements StuffClient {

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
