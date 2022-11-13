package be.jonasboon.airportmanager.service;

import be.jonasboon.airportmanager.dto.PilotDTO;
import be.jonasboon.airportmanager.exception.pilot.PilotNotFoundException;
import be.jonasboon.airportmanager.mapper.PilotMapper;
import be.jonasboon.airportmanager.model.Pilot;
import be.jonasboon.airportmanager.repository.PilotRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

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

    public List<PilotDTO> getAllPilots() {
        return pilotRepository.findAll().stream()
                .map(PilotMapper::toDto)
                .collect(Collectors.toList());
    }

    public PilotDTO createPilot(PilotDTO pilotDTO) {
        pilotDTO.hasNoNull();
        Pilot pilot = PilotMapper.toEntity(pilotDTO);
        return PilotMapper.toDto(pilotRepository.save(pilot));
    }

    public PilotDTO updatePilot(Integer id, PilotDTO pilotDTO) {
        if(pilotRepository.findById(id).isPresent()) {
            pilotDTO.hasNoNull();

            return PilotMapper.toDto(
                    pilotRepository.save(PilotMapper.toEntity(id, pilotDTO)));
        } throw new PilotNotFoundException(id);
    }

    public void deletePilot(Integer id) {
        if(pilotRepository.findById(id).isPresent()){
             pilotRepository.deleteById(id);
        } else throw new PilotNotFoundException(id);
    }
}
