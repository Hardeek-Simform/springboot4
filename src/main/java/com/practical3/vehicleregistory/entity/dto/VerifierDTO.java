package com.practical3.vehicleregistory.entity.dto;

import com.practical3.vehicleregistory.entity.enums.VehicleCategory;
import lombok.*;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class VerifierDTO {
    private VehicleCategory vehicleCategory;
    private String UserName;
    private String vehicleName;
    @Getter
    @Setter
    private String vehicleNumber;

}
