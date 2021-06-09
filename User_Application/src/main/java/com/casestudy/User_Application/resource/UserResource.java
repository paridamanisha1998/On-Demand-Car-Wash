package com.casestudy.User_Application.resource;
import com.casestudy.User_Application.model.*;
import com.casestudy.User_Application.repository.*;
import lombok.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import java.util.*;
@RestController
@RequestMapping("/userdata")
@RequiredArgsConstructor
public class UserResource {
      @Autowired
      private UserRepository userRepository;
      @Autowired
      private CarRepository carRepository;
      @PostMapping("/register")
      @ResponseStatus(HttpStatus.CREATED)
      public  void registerUser(@RequestBody Users users){
            userRepository.save(users);
      }
      @GetMapping("/profile/{userId}")
      @ResponseStatus(HttpStatus.OK)
      public List<Users> getUsersById(@PathVariable("userId") String userId){
            return userRepository.findAll();
      }
      @PutMapping("/update/{userId}")
      public void updateProfile(@RequestBody Users users ){

      }
      @GetMapping("/getcardetails")
      @ResponseStatus(HttpStatus.OK)
      public List<CarRepository> getCarDetails(){
            return carRepository.findAll();
      }

}
