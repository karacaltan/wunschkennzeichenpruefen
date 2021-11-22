package de.restapi.wunschkennzeichenpruefen.controller;

import de.restapi.wunschkennzeichenpruefen.response.Fahrzeug;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class WunschkennzeichenPruefenController {

    @GetMapping("/wunschenkennzeichenpruefen/{licensePlate}")
    @ResponseBody
    public ResponseEntity<Object> checkPlateAvailable(@PathVariable("licensePlate") String licensePlate) {
        Random randomCheck = new Random();
        Boolean checked = randomCheck.nextBoolean();
        Fahrzeug fahrzeug = new Fahrzeug();
        fahrzeug.setDesiredLicensePlate(licensePlate);
        fahrzeug.setIsDesiredLicensePlateFree(checked);
        return ResponseEntity.ok(fahrzeug);
    }
}
