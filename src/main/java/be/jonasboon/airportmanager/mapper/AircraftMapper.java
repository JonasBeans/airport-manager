package be.jonasboon.airportmanager.mapper;

import be.jonasboon.airportmanager.dto.AircraftDTO;
import be.jonasboon.airportmanager.model.Aircraft;
import lombok.experimental.UtilityClass;

@UtilityClass
public class AircraftMapper {

    public static AircraftDTO toDTO(Aircraft aircraft){
        return AircraftDTO.builder()
                .withCallSign(aircraft.getCallSign())
                .withModel(aircraft.getModel())
                .withType(aircraft.getType())
                .withModelYear(aircraft.getModelYear())
                .build();
    }

    public static Aircraft toEntity(AircraftDTO aircraftDTO){
        return Aircraft.builder()
                .withCallSign(aircraftDTO.getCallSign())
                .withModel(aircraftDTO.getModel())
                .withType(aircraftDTO.getType())
                .withModelYear(aircraftDTO.getModelYear())
                .build();
    }
}
