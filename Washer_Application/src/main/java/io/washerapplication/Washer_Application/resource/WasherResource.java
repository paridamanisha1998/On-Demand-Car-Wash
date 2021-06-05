package io.washerapplication.Washer_Application.resource;

import io.washerapplication.Washer_Application.model.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/washer")
public class WasherResource {
    @RequestMapping("/{washerId}")
    public Washer getWasherDetails(@PathVariable("washerId")String washerId){
        return new Washer(washerId,"pohgn1");
    }
}
