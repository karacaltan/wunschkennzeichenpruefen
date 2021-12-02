package de.restapi.wunschkennzeichenpruefen.response;

import lombok.Data;

@Data
public class KennzeichenPruefen {

    private Boolean isDesiredLicensePlateFree;
    private String desiredLicensePlate;

}
