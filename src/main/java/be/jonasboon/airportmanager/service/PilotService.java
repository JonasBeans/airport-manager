package be.jonasboon.airportmanager.service;

import be.jonasboon.airportmanager.dto.PilotDTO;
import be.jonasboon.airportmanager.mapper.PilotMapper;
import be.jonasboon.airportmanager.repository.PilotRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PilotService {

   private final PilotRepository pilotRepository;

   public PilotService(PilotRepository pilotRepository) {
      this.pilotRepository = pilotRepository;
   }

   public Optional<PilotDTO> getPilotFromId(Integer id){
      return pilotRepository.findById(id)
              .map(PilotMapper::toDto);
   }
}
