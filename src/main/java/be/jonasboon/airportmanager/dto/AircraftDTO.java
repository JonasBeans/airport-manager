package be.jonasboon.airportmanager.dto;

import lombok.Builder;
import lombok.Value;

import java.time.Year;

@Value
@Builder(setterPrefix = "with")
public class AircraftDTO {

    String callSign;
    String model;
    String type;
    String modelYear;
}
