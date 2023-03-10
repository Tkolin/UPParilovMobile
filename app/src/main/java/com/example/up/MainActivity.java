package com.example.up;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import java.math.BigDecimal;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Rock> rocks = new ArrayList<Rock>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // начальная инициализация списка
        setInitialData();
        RecyclerView recyclerView = findViewById(R.id.list);
        // создаем адаптер
        RockRecyclerAdapter adapter = new RockRecyclerAdapter(this, rocks);
        // устанавливаем для списка адаптер
        recyclerView.setAdapter(adapter);
    }
    private void setInitialData(){

        rocks.add(new Rock (5672l, 3000, 0,"Булыжник","Простой булыжник"));
        rocks.add(new Rock (5672l, 5000, 0,"Рубин","Рубин из черногорска"));
        rocks.add(new Rock (5672l, 4000, 0,"Оникс","Сахарный камень"));

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    public void onClick(View view) {
        Intent intent = new Intent(this, UserActivity.class);
        startActivity(intent);
        Toast.makeText(this, "fafdfadfadf", Toast.LENGTH_SHORT).show();
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        switch(id){
            case R.id.cart:
                Intent intent2 = new Intent(this, CartActivity.class);
                startActivity(intent2);

            case R.id.lk:
                Intent intent1 = new Intent(this, UserActivity.class);
                startActivity(intent1);

        }
        return super.onOptionsItemSelected(item);

    }
}