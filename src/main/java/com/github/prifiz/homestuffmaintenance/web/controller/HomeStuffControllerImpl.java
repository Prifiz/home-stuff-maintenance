package com.github.prifiz.homestuffmaintenance.web.controller;

import com.github.prifiz.homestuffmaintenance.model.HomeStuff;
import com.github.prifiz.homestuffmaintenance.service.HomeStuffService;
import com.github.prifiz.homestuffmaintenance.service.client.StuffClient;
import com.github.prifiz.homestuffmaintenance.web.request.CreateHomeStuffRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequiredArgsConstructor
public class HomeStuffControllerImpl implements HomeStuffController {

    @Autowired
    @Qualifier("stuffWebFluxClient")
//    @Qualifier("stuffRabbitClient")
    private StuffClient client;

    private final HomeStuffService homeStuffService;

    @Override
    public ResponseEntity<?> create(CreateHomeStuffRequest request) {
        try {
            Long id = client.findStuffId(request.getName(), request.getManufacturer(), request.getModel());
            HomeStuff homeStuff = new HomeStuff();
            homeStuff.setStuffId(id);
            homeStuff.setBuyDate(request.getBuyDate());
            homeStuff.setGuaranteeExpirationDate(request.getGuaranteeExpirationDate());
            homeStuff.setManufacturingDate(request.getManufacturingDate());

            if (homeStuffService.findAllByStuffId(id).isEmpty()) {
                homeStuffService.create(homeStuff);
                return ResponseEntity.ok("Successfully created");
            } else {
                throw new IOException("Already exists!");
            }
        } catch (IOException ex) {
            return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
        }
    }
}
