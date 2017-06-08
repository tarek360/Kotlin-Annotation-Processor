package com.tarek360.easyjsonprocessor;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Car car = new Car();
        car.color = "Red";
        car.maxSpeed = 380;

        try {
            JSONObject carJSONObject = car.toJson();
            String text = "color " + carJSONObject.getString("color")
                    + ", maxSpeed " + carJSONObject.getInt("maxSpeed");

            TextView textView = (TextView) findViewById(R.id.textView);
            textView.setText(text);

        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
