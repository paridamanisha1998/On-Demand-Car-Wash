package io.car.CarDetails.repository;

import io.car.CarDetails.model.*;
import org.springframework.data.mongodb.repository.*;

public interface CarRepository extends MongoRepository<Car,String> {

}
