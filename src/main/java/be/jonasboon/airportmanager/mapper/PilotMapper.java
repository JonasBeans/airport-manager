package be.jonasboon.airportmanager.mapper;

import be.jonasboon.airportmanager.dto.PilotDTO;
import be.jonasboon.airportmanager.model.Pilot;
import lombok.experimental.UtilityClass;

@UtilityClass
public class PilotMapper {

    public static PilotDTO toDto(Pilot pilot){
        return PilotDTO.builder()
                .withId(pilot.getId())
                .withFirst_name(pilot.getFirstName())
                .withLast_name(pilot.getLastName())
                .build();
    }

}
