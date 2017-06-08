package com.tarek360.easyjsonprocessor;


import com.tarek30.annotation.EasyJSON;

import org.json.JSONObject;

@EasyJSON
public class Car {
    long modelNumber;
    int maxSpeed;
    String color;
    String manufacturer;
    String style;
    String price;

    public JSONObject toJson() {
        return EasyJsonCar.asJSON(this);
    }
}
