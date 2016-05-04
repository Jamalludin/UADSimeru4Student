package com.android.jamalludin.uadsimeru4student;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jamal on 12/04/16.
 */
public class JadwalKuliahActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    private Spinner spinner2;
    private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_jadwalkuliah);

        spinner = (Spinner) findViewById(R.id.spinner);

        // Creating adapter for spinner
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.planets_array, android.R.layout.simple_spinner_item);
        // Drop down layout style - list view with radio button
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);


    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String item = parent.getItemAtPosition(position).toString();
        subMenu(item);
        Toast.makeText(parent.getContext(), "Selected: " + item, Toast.LENGTH_LONG).show();
    }

    public void subMenu(String param) {

        spinner2 = (Spinner) findViewById(R.id.spinner2);
        if (param.equals("Fakultas Ekonomi")) {
            ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.program_studi_ekonomi, android.R.layout.simple_spinner_item);

            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

            spinner2.setAdapter(adapter);

        } else if (param.equalsIgnoreCase("fakultas farmasi")) {
            ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.farmasi, android.R.layout.simple_spinner_item);

            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

            spinner2.setAdapter(adapter);

        } else if (param.equalsIgnoreCase("Fakultas Hukum")) {
            ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.Hukum, android.R.layout.simple_spinner_item);

            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

            spinner2.setAdapter(adapter);
        } else if (param.equalsIgnoreCase("Fakultas Keguruan Dan Ilmu Pendidikan")) {
            ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.keguruan, android.R.layout.simple_spinner_item);

            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

            spinner2.setAdapter(adapter);
        } else if (param.equalsIgnoreCase("Fakultas Kesehatan Masyarakat")) {
            ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.fkm, android.R.layout.simple_spinner_item);

            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

            spinner2.setAdapter(adapter);
        } else if (param.equalsIgnoreCase("Fakultas Psikologi")) {
            ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.psikologi, android.R.layout.simple_spinner_item);

            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

            spinner2.setAdapter(adapter);
        } else if (param.equalsIgnoreCase("Fakultas Teknologi Industri")) {
            ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.fti, android.R.layout.simple_spinner_item);

            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

            spinner2.setAdapter(adapter);
        }else if (param.equalsIgnoreCase("Fakultas Matematika Dan Ilmu Pengetahuan")) {
            ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.fmipa, android.R.layout.simple_spinner_item);

            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

            spinner2.setAdapter(adapter);
        }else if (param.equalsIgnoreCase("Pascasarjana Teknik")) {
            ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.sarjanateknik, android.R.layout.simple_spinner_item);

            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

            spinner2.setAdapter(adapter);
        }else if (param.equalsIgnoreCase("Fakultas Tarbiyah Dirasat Islamiyah")) {
            ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.tarbiyah, android.R.layout.simple_spinner_item);

            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

            spinner2.setAdapter(adapter);
        }

            else {
            ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.defaultt, android.R.layout.simple_spinner_item);

            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

            spinner2.setAdapter(adapter);

        }

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
