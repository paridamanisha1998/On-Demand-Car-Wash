package io.car.CarDetails.service;

import io.car.CarDetails.model.*;
import io.car.CarDetails.repository.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

import java.util.*;

@Service
public class CarService {
    @Autowired
       private CarRepository carRepository;
       public Car addCar(Car car){
           return carRepository.insert(car);
       }
       public List<Car> getAllCarDetails(Car car){
           car.setCarDetailsStatus(isCarDetailsAdded());
           return carRepository.findAll();

       }
        public Optional<Car> carDetailsById(String carId){
            return carRepository.findById(carId);
        }
        public Car updateCarDetails(Car car){
           Car savedCars= carRepository.findById(car.getCarId()).orElseThrow(()->new RuntimeException(
               String.format("Cannot find car by Id %s"+car.getCarId())));
           savedCars.setCarId(car.getCarId());
           savedCars.setCarNum(car.getCarNum());
           savedCars.setCarModel(car.getCarModel());
           savedCars.setCarColour(car.getCarColour());
           return carRepository.save(car);
        }
        public String deleteCar(String carId){
            carRepository.deleteById(carId);
            return "The Car Details are deleted with id:"+carId;
        }
        public Car addNewCar(Car car){
               return carRepository.insert(car);

        }
        public String isCarDetailsAdded(){
            return new Random().nextBoolean()?"Successfully Added":"Not added Yet";
        }
}
