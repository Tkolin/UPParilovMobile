package com.example.up;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CartActivity extends AppCompatActivity {

    ArrayList<Rock> rocks = new ArrayList<Rock>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);
        // начальная инициализация списка
        setInitialData();
        RecyclerView recyclerView = findViewById(R.id.list);
        // создаем адаптер
        RockCartRecyclerAdapter adapter = new RockCartRecyclerAdapter(this, rocks);
        // устанавливаем для списка адаптер
        recyclerView.setAdapter(adapter);
    }
    private void setInitialData(){

        rocks.add(new Rock (5672l, 3000, 0,"Булыжник","Простой булыжник"));
        rocks.add(new Rock (5672l, 5000, 0,"Рубин","Рубин из черногорска"));
        rocks.add(new Rock (5672l, 4000, 0,"Оникс","Сахарный камень"));
    }
}