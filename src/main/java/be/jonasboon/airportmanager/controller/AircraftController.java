package be.jonasboon.airportmanager.controller;

import be.jonasboon.airportmanager.dto.AircraftDTO;
import be.jonasboon.airportmanager.service.AircraftService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

import static java.lang.String.format;

@RestController
@RequestMapping("api/v1/aircraft")
public class AircraftController {

    private final AircraftService aircraftService;

    public AircraftController(AircraftService aicraftService) {
        this.aircraftService = aicraftService;
    }

    @GetMapping("/{aircraft_callsign}")
    public AircraftDTO getAircraftByCallsign(@PathVariable("aircraft_callsign") String aircraftCallsign){
        return aircraftService.getAircraftById(aircraftCallsign)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, format("No aircraft found with id: %s", aircraftCallsign)));
    }

    @GetMapping("/all")
    public List<AircraftDTO> getAllAircrafts(){
        return aircraftService.getAllAircrafts();
    }

    @PostMapping
    public AircraftDTO createAircraft(@RequestBody AircraftDTO aircraftDTO){
        return aircraftService.createAircraft(aircraftDTO);
    }
}
