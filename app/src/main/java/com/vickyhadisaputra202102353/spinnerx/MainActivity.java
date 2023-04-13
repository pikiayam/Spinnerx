package com.vickyhadisaputra202102353.spinnerx;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private Spinner _spinnerx, _spinnerxi, _spinnerxii, _spinnerxiii;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        _spinnerx = (Spinner)findViewById(R.id.spinnerx);
        _spinnerxi = (Spinner)findViewById(R.id.spinnerxi);
        _spinnerxii = (Spinner)findViewById(R.id.spinnerxii);
        _spinnerxiii = (Spinner)findViewById(R.id.spinnerxiii);

        initSpinnerx();
        initSpinnerxi();
        initSpinnerxii();
        initSpinnerxiii();
    }
    private void initSpinnerx(){
        List<String> buahList = new ArrayList<>();
        buahList.add("Mangga");
        buahList.add("Jeruk");
        buahList.add("Pear");
        buahList.add("Lengkeng");

        ArrayAdapter<String> arrayAdapterx = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, buahList);
        _spinnerx.setAdapter(arrayAdapterx);
    }

    private void initSpinnerxi(){
        List<String> mahasiswaList = new ArrayList<>();

        for (int i = 1; i <= 1000; i++) {
            mahasiswaList.add("Mahasiswa ke- " + i);
        }

        ArrayAdapter<String> arrayAdapterxi = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, mahasiswaList);
        _spinnerxi.setAdapter(arrayAdapterxi);
    }

    private void initSpinnerxii(){
        List<String> ganjilList = new ArrayList<>();

        for (int i = 1; i <= 999; i+=2) {
            ganjilList.add("Bilangan ke- " + i);
        }

        ArrayAdapter<String> arrayAdapterxii = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, ganjilList);
        _spinnerxii.setAdapter(arrayAdapterxii);
    }

    private void initSpinnerxiii(){
        List<String> genapList = new ArrayList<>();

        for (int i = 2; i <= 1000; i+=2) {
            genapList.add("Bilangan ke- " + i);
        }

        ArrayAdapter<String> arrayAdapterxiii = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, genapList);
        _spinnerxiii.setAdapter(arrayAdapterxiii);
    }
}