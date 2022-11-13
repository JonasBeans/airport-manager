package be.jonasboon.airportmanager.service;

import be.jonasboon.airportmanager.dto.AircraftDTO;
import be.jonasboon.airportmanager.mapper.AircraftMapper;
import be.jonasboon.airportmanager.model.Aircraft;
import be.jonasboon.airportmanager.repository.AircraftRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class AircraftService {

    private final AircraftRepository aircraftRepository;

    public AircraftService(AircraftRepository aircraftRepository) {
        this.aircraftRepository = aircraftRepository;
    }

    public Optional<AircraftDTO> getAircraftById(String id) {
        return aircraftRepository.findById(id)
                .map(AircraftMapper::toDTO);
    }

    public List<AircraftDTO> getAllAircrafts() {
        return aircraftRepository.findAll().stream()
                .map(AircraftMapper::toDTO)
                .collect(Collectors.toList());
    }

    public AircraftDTO createAircraft(AircraftDTO aircraftDTO) {
        aircraftDTO.hasNoNull();
        Aircraft aircraft = aircraftRepository.save(AircraftMapper.toEntity(aircraftDTO));
        return AircraftMapper.toDTO(aircraft);
    }
}
