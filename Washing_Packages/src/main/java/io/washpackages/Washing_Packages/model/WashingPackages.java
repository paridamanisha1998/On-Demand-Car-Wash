package io.washpackages.Washing_Packages.model;
import lombok.*;
import org.springframework.data.annotation.*;
import org.springframework.data.mongodb.core.mapping.*;

@Document(value = "washingpackages")
public class WashingPackages {
       //Unique identifier for our product
       @Id
       private String packageId;
       private String packageName;
       private double packagePrice;
       private String offer;
       public WashingPackages(){

       }
       public WashingPackages(String packageId, String packageName, double packagePrice, String offer) {
              this.packageId = packageId;
              this.packageName = packageName;
              this.packagePrice = packagePrice;
              this.offer = offer;
       }

       public String getPackageId() {
              return packageId;
       }

       public void setPackageId(String packageId) {
              this.packageId = packageId;
       }

       public String getPackageName() {
              return packageName;
       }

       public void setPackageName(String packageName) {
              this.packageName = packageName;
       }

       public double getPackagePrice() {
              return packagePrice;
       }

       public void setPackagePrice(double packagePrice) {
              this.packagePrice = packagePrice;
       }

       public String getOffer() {
              return offer;
       }

       public void setOffer(String offer) {
              this.offer = offer;
       }
}
