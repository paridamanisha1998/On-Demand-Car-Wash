package com.casestudy.User_Application.model;

import org.springframework.data.annotation.*;
import org.springframework.data.mongodb.core.mapping.*;

@Document
public class CarDetails {
    @Id
    private String carId;
    private String carNumber;
    private String carModel;
    private String carColor;
    public CarDetails(){
    }
    public CarDetails(String carId, String carNumber, String carModel, String carColor) {
        this.carId = carId;
        this.carNumber = carNumber;
        this.carModel = carModel;
        this.carColor = carColor;
    }

    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }
}
