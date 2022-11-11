package be.jonasboon.airportmanager.controller;

import be.jonasboon.airportmanager.dto.PilotDTO;
import be.jonasboon.airportmanager.service.PilotService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import static java.lang.Integer.valueOf;
import static java.lang.String.format;
import static org.springframework.http.HttpStatus.NOT_FOUND;

@RestController
@RequestMapping("api/v1/pilot")
public class PilotController {

    private final PilotService pilotServie;


    public PilotController(PilotService pilotServie) {
        this.pilotServie = pilotServie;
    }

    @GetMapping("/get")
    public PilotDTO getPilotById(@RequestParam(name = "pilot_id") String id){
        return pilotServie.getPilotFromId(valueOf(id))
                .orElseThrow(() -> new ResponseStatusException(NOT_FOUND, format("No pilot data found for pilot with id: %s", id)));
    }
}
