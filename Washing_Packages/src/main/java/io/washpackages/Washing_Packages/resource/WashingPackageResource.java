package io.washpackages.Washing_Packages.resource;

import io.washpackages.Washing_Packages.model.*;
import io.washpackages.Washing_Packages.repository.*;
import lombok.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/washingpackages")
@RequiredArgsConstructor
public class WashingPackageResource {
    //Repository need to inject
    @Autowired
    private final PackageRepository packageRepository;
    @GetMapping("/allpackackages")
    @ResponseStatus(HttpStatus.OK)
    public List<WashingPackages> getAll(){
        return packageRepository.findAll();
    }
    @GetMapping("package/{packageId}")
    @ResponseStatus(HttpStatus.OK)
    public void getPackageById(@PathVariable("packageId") String packageId){
                packageRepository.findById(packageId);
    }
    @PostMapping("/addpackage")
    @ResponseStatus(HttpStatus.CREATED)
    public WashingPackages addPackages(@RequestBody WashingPackages washingPackages){
            return packageRepository.save(washingPackages);
    }
    @DeleteMapping("/delete/{packageId}")
    public  String deletePackages(String packageId){
        packageRepository.deleteById(packageId);
        return "Package deleted with Id %s"+packageId;
    }
}
