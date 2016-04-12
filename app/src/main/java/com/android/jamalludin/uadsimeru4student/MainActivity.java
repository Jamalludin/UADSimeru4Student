package com.android.jamalludin.uadsimeru4student;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    ImageView btn_jadwal_kuliah, btn_jadwal_dosen, btn_jadwal_ruang, btn_pengumuman;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_jadwal_kuliah = (ImageView) findViewById(R.id.img_kuliah);
        btn_jadwal_dosen = (ImageView) findViewById(R.id.img_dosen);
        btn_jadwal_ruang = (ImageView) findViewById(R.id.img_ruang);
        btn_pengumuman = (ImageView) findViewById(R.id.img_pengumuman);

        btn_pengumuman.setOnClickListener(this);
        btn_jadwal_ruang.setOnClickListener(this);
        btn_jadwal_dosen.setOnClickListener(this);
        btn_jadwal_kuliah.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch(v.getId()) {
            case R.id.img_ruang:
                startActivity(new Intent(MainActivity.this, JadwalRuangActivity.class));
                break;
            case R.id.img_dosen:
                startActivity(new Intent(MainActivity.this, JadwalDosenActivity.class));
                break;
            case R.id.img_kuliah:
                startActivity(new Intent(MainActivity.this, JadwalKuliahActivity.class));
                break;
            case R.id.img_pengumuman:
                startActivity(new Intent(MainActivity.this, PengumumanActivity.class));
                break;
        }

    }
}
