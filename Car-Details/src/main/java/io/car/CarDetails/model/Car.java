package io.car.CarDetails.model;

import lombok.*;
import org.springframework.data.annotation.*;
import org.springframework.data.mongodb.core.mapping.*;

@Document(value = "car-details")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Car {
    @Id
    private String carId;
    private String carNum;
    private String carModel;
    private String carColour;
    private String carImgUri;
    private String carDetailsStatus;
}
