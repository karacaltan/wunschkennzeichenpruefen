package de.restapi.wunschkennzeichenpruefen.controller;

import de.restapi.wunschkennzeichenpruefen.response.KennzeichenPruefen;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class WunschkennzeichenPruefenController {

    @GetMapping("/wunschenkennzeichenpruefen/{licensePlate}")
    @ResponseBody
    public KennzeichenPruefen checkPlateAvailable(@PathVariable("licensePlate") String licensePlate) {
        Random randomCheck = new Random();
        Boolean checked = randomCheck.nextBoolean();
        KennzeichenPruefen kennzeichenPruefen = new KennzeichenPruefen();
        kennzeichenPruefen.setDesiredLicensePlate(licensePlate);
        kennzeichenPruefen.setIsDesiredLicensePlateFree(checked);
        return kennzeichenPruefen;
    }
}
