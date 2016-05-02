package com.android.jamalludin.uadsimeru4student;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jamal on 12/04/16.
 */
public class JadwalKuliahActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_jadwalkuliah);

        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        // Spinner click listener
        spinner.setOnItemSelectedListener(this);

        // Spinner Drop down elements
        List<String> categories = new ArrayList<String>();
        categories.add("Pilih Fakultas");
        categories.add("Fakultas Ekonomi");
        categories.add("Fakultas Hukum");
        categories.add("Fakultas Farmasi");
        categories.add("Fakultas Keguruan Dan Ilmu Pendidikan");
        categories.add("Fakultas Kesehatan Masyarakat");
        categories.add("Fakultas Psikologi");
        categories.add("Fakultas Sastra");
        categories.add("Fakultas Teknologi Industri");
        categories.add("Fakultas Matematika Dan Ilmu Pengetahuan");
        categories.add("Pascasarjana Teknik");
        categories.add("Fakultas Tarbiyah Dirasat Islamiyah");

        // Creating adapter for spinner
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categories);

        // Drop down layout style - list view with radio button
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        spinner.setAdapter(dataAdapter);


        Spinner spinner2 = (Spinner) findViewById(R.id.spinner2);
        // Spinner click listener
        spinner2.setOnItemSelectedListener(this);

        // Spinner Drop down elements
        List<String> categories2 = new ArrayList<String>();
        categories2.add("Program Studi");
        categories2.add("Fakultas Ekonomi");

        // Creating adapter for spinner
        ArrayAdapter<String> dataAdapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categories2);

        // Drop down layout style - list view with radio button
        dataAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        spinner2.setAdapter(dataAdapter2);
    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String item = parent.getItemAtPosition(position).toString();
        //Toast.makeText(parent.getContext(), "Selected: " + item, Toast.LENGTH_LONG).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
