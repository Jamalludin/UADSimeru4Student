package com.android.jamalludin.uadsimeru4student;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jamal on 12/04/16.
 */
public class JadwalRuangActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jadwalruang);

        Spinner spinner3 = (Spinner) findViewById(R.id.spinner3);
        // Spinner click listener
        spinner3.setOnItemSelectedListener(this);

        // Spinner Drop down elements
        List<String> categories3 = new ArrayList<String>();
        categories3.add("Pilih Kampus");
        categories3.add("Kampus I");
        categories3.add("Kampus II");
        categories3.add("Kampus III");
        categories3.add("Kampus IV");
        categories3.add("Kampus V");
        categories3.add("Kampus VI");
        // Creating adapter for spinner
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categories3);

        // Drop down layout style - list view with radio button
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        spinner3.setAdapter(dataAdapter);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
