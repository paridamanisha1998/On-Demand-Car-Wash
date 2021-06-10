package io.car.CarDetails.resource;

import io.car.CarDetails.model.*;
import io.car.CarDetails.service.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/cars")
public class CarResource {
    @Autowired
    private CarService carService;
    private Car car;
    @PostMapping("/addcar")
    public Car addDetails(@RequestBody Car car){
        return carService.addCar(car);
    }
    @GetMapping("/allcars")
    public List<Car> getCar(@RequestBody Car car){
        return carService.getAllCarDetails(car);
    }
    @GetMapping("/{carid}")
    public Optional<Car> getCarById(@PathVariable("carid") String carId){
         return carService.carDetailsById(carId);
    }
    @PutMapping("/update")
    public Car updateCarDetails(@RequestBody Car car){

           return carService.updateCarDetails(car);
    }
    @DeleteMapping("/delete/{carId}")
    public String deleteById(@PathVariable("carid") String carId){
         carService.deleteCar(carId);
         return "Car Details Deleted";
    }
    @PostMapping("/addnewcar")
    public Car addNewCar(@RequestBody Car car){
       return carService.addNewCar(car);
    }


}
