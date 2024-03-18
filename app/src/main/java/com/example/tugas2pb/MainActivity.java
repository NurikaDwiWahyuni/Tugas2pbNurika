package com.example.tugas2pb;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private Adapter adapter;
    private ArrayList<Model> model;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getData();

        recyclerView = findViewById(R.id.recycleview);
        adapter = new Adapter(model);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);


    }

    private void getData() {
        model = new ArrayList<>();
        model.add(new Model("Abmi Sukma Edri 12250120341", R.drawable.abmi));
        model.add(new Model("Ahmad Kurniawan 12250111514", R.drawable.ahmad));
        model.add(new Model("Aufa Hajati 12250120338", R.drawable.aufa));
        model.add(new Model("Daffa Finanda 12250111603", R.drawable.dafin));
        model.add(new Model("Daffa Ikhwan 12250110979", R.drawable.dafa));
        model.add(new Model("Dwi Jelita Adhliyah 12250120331", R.drawable.jelita));
        model.add(new Model("Dwi Mahdini 12250111298", R.drawable.dwim));
        model.add(new Model("Fajri      12250110382", R.drawable.fajri));
        model.add(new Model("Fakhri 12250111381", R.drawable.fakhri));
        model.add(new Model("Farras Lathief 12250111328", R.drawable.farras));
        model.add(new Model("Gilang Ramadhan 12250111323", R.drawable.gilang));
        model.add(new Model("Hafidz Alhadid 12250111794", R.drawable.hafidz));
        model.add(new Model("Haritsah Naufaldy 12250110361", R.drawable.aldy));
        model.add(new Model("M. Nabil Dawami 12250111527", R.drawable.nabil));
        model.add(new Model("Muh. Zaki Erbai 12250111134", R.drawable.zaki));
        model.add(new Model("Muhammad Aditya 12250111048", R.drawable.adit));
        model.add(new Model("Muhammad Dhimas 12250111231", R.drawable.dimas));
        model.add(new Model("Muhammad Faruq 12250111791", R.drawable.faruq));
        model.add(new Model("Muhammaad Rafly 12250111489", R.drawable.rafly));
        model.add(new Model("Nurika Dwi Wahyuni 12250120360", R.drawable.nurika));
        model.add(new Model("Ogya Secio 12250111346", R.drawable.ogya));
        model.add(new Model("Rahma Laksita 12250124357", R.drawable.rahma));
        model.add(new Model("Surya Hidayatullah  12250111759", R.drawable.surya));



    }
}