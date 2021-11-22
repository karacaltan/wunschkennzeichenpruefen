package de.restapi.wunschkennzeichenpruefen.response;

import lombok.Data;

@Data
public class Fahrzeug {

    private Boolean isDesiredLicensePlateFree;
    private String desiredLicensePlate;

}
