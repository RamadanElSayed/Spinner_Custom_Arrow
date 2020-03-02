package com.example.parsaniahardik.spinner_custom_arrow;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    private String[] country = {"India","USA","Canada"};
    private Spinner spCountry;

    private String[] cars = {"Ferrari","Lamborghini","Rolls Roys"};
    private Spinner spCars;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spCountry = findViewById(R.id.spCountry);
        spCountry.setAdapter(new ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item,country));

        spCars = findViewById(R.id.spCars);
        spCars.setAdapter(new ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item,cars));

    }
}
