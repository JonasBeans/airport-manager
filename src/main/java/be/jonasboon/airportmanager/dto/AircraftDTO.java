package be.jonasboon.airportmanager.dto;

import be.jonasboon.airportmanager.exception.common.NullFromDTO;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Setter;
import lombok.Value;

import java.time.Year;

@Value
@Builder(setterPrefix = "with")
public class AircraftDTO {

    @JsonProperty("callsign")
    String callSign;
    @JsonProperty("model")
    String model;
    @JsonProperty("type")
    String type;
    @JsonProperty("model_year")
    String modelYear;

    /**
     * @description: Method to check if new incoming DTO has no null values
     * @return true if DTO has no Null values
     */
    public boolean hasNoNull(){
        //todo: find way around because when updating dto will have no callsign
        /*if(this.getCallSign() == null){
            throw new NullFromDTO("call sign");
        }*/
        if(this.getModel() == null){
            throw new NullFromDTO("model");
        }
        if(this.getType() == null){
            throw new NullFromDTO("type");
        }
        /*if(this.getModelYear() == null){
            throw new NullFromDTO("model year");
        }*/ return true;
    }

    /**
     * @description: Method to check if incoming DTO has no null values
     * @return true if DTO has no Null values
     */
    public boolean hasNoNullForUpdate(){
        if(this.getModel() == null){
            throw new NullFromDTO("model");
        }
        if(this.getType() == null){
            throw new NullFromDTO("type");
        }
        if(this.getModelYear() == null){
            throw new NullFromDTO("model year");
        } return true;
    }


}
