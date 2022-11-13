package be.jonasboon.airportmanager.dto;

import be.jonasboon.airportmanager.exception.common.NullFromDTO;
import lombok.*;

@Value
@Builder(setterPrefix = "with", access = AccessLevel.PUBLIC)
public class PilotDTO {

    int id;
    String firstName;
    String lastName;

    public boolean hasNoNull(){
        if(this.getFirstName() == null){
            throw new NullFromDTO("first name");
        }
        if(this.getLastName() == null){
            throw new NullFromDTO("last name");
        }
        return true;
    }
}
