package com.casestudy.User_Application.resource;

import com.casestudy.User_Application.model.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/userdata")
public class UserResource {
    @RequestMapping("/{userId}")
    public Users  getUserdata(@PathVariable("userId") String userId){
        return new Users(userId,"helloworld");
    }
}
