package com.practical3.vehicleregistory.entity.dto;

import com.practical3.vehicleregistory.entity.enums.VehicleCategory;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
    private int billNo;
    private String UserName;
    private String vehicleName;
    private String vehicleNumber;
    @Getter
    @Setter
    private VehicleCategory vehicleCategory;
}
