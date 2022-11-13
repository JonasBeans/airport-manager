package be.jonasboon.airportmanager.mapper;

import be.jonasboon.airportmanager.dto.AircraftDTO;
import be.jonasboon.airportmanager.model.Aircraft;
import lombok.experimental.UtilityClass;

@UtilityClass
public class AircraftMapper {

    public static AircraftDTO toDTO(Aircraft aircraft){
        return AircraftDTO.builder()
                .withCallSign(aircraft.getId())
                .withModel(aircraft.getModel())
                .withType(aircraft.getType())
                .withModelYear(aircraft.getModelYear())
                .build();
    }
}
