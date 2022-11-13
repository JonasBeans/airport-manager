package be.jonasboon.airportmanager.dto;

import be.jonasboon.airportmanager.exception.NullFromDTO;
import lombok.*;

@Value
@Builder(setterPrefix = "with", access = AccessLevel.PUBLIC)
public class PilotDTO {

    int id;
    String first_name;
    String last_name;

    public boolean hasNoNull(){
        if(this.getFirst_name() == null){
            throw new NullFromDTO(this.getFirst_name());
        }
        if(this.getLast_name() == null){
            throw new NullFromDTO(this.getLast_name());
        }
        return true;
    }
}
