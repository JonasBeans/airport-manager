package be.jonasboon.airportmanager.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import java.time.Year;

import static lombok.AccessLevel.*;

@Entity
@Table(name = "aircraft", schema = "application")
@Getter
@Builder(setterPrefix = "with")
@NoArgsConstructor(access = PROTECTED)
@AllArgsConstructor(access = PRIVATE)
public class Aircraft {

    @Id
    @Column(name = "callsign")
    String id;

    @Column(name = "model")
    String model;

    @Column(name = "modeltype")
    String type;

    @Column(name = "modelyear")
    String modelYear;
}
