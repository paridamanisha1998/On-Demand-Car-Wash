package io.washpackages.Washing_Packages.resource;

import io.washpackages.Washing_Packages.model.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/washingpackages")
public class WashingPackageResource {
    @RequestMapping("/{packagename}")
    public WashingPackages getPackages(@PathVariable("packagename")String packageName){
           return new WashingPackages(750,packageName,5000.00);
    }
}
