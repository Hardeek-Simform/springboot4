package com.practical4.vehicleregistory.entity.dto;

import com.practical4.vehicleregistory.entity.enums.VehicleCategory;
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
