package com.example.lucasrestaurants;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class RestaurantActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant);
    }

    public void onClickBtnRegistrar(View view) {
        TextView vazio = findViewById(R.id.vazio);
        vazio.setText("Registrando Pedido...");
    }

    public void onClickBtnConsultar(View view) {
        TextView consulta = findViewById(R.id.vazio);
        consulta.setText("Total de Horas");
    }
}