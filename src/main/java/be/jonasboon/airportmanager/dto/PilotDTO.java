package be.jonasboon.airportmanager.dto;

import lombok.*;

@Value
@Builder(setterPrefix = "with", access = AccessLevel.PUBLIC)
public class PilotDTO {

    int id;
    String first_name;
    String last_name;

    public boolean hasNoNull(){
        return !(this.getFirst_name() == null) && !(this.getLast_name() == null);
    }
}
