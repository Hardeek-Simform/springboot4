package com.practical3.vehicleregistory.service;

import com.practical3.vehicleregistory.entity.UserVehicle;
import com.practical3.vehicleregistory.entity.dto.VerifierDTO;
import com.practical3.vehicleregistory.repository.UserVehicleRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class VehicleRegistryService {
    @Autowired
    private ModelMapper modelMapper;

    public VerifierDTO getVehicleVerification(String vehicleNo) {
        Optional<UserVehicle> optionalUserDTO = UserVehicleRepo.getUsersVehList().stream().filter(user -> user.getVehicleNumber().equalsIgnoreCase(vehicleNo)).findFirst();
        if (optionalUserDTO.isPresent()) {
            UserVehicle vehicle = optionalUserDTO.get();
            VerifierDTO verifierDTO = modelMapper.map(vehicle, VerifierDTO.class);
            //        verifierDTOMapper.apply(vehicle);
            return verifierDTO;
        } else {
            return null;
        }
    }
}
