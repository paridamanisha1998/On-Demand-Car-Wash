package io.washpackages.Washing_Packages.repository;

import io.washpackages.Washing_Packages.model.*;
import org.springframework.data.mongodb.repository.*;
//String is the type of packageId of our class
public interface PackageRepository extends MongoRepository<WashingPackages,String>  {
}
