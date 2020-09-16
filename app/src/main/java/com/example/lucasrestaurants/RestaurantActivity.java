package com.example.lucasrestaurants;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

//Author: Lucas

public class RestaurantActivity extends AppCompatActivity {

    //Método main
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant);
    }

    //Método para evento click do botão de registrar
    public void onClickBtnRegistrar(View view) {
        //Obtem o objeto text da atividade
        TextView vazio = findViewById(R.id.vazio);

        //Altera o texto do objeto text da atividade
        vazio.setText("Registrando Pedido...");
    }

    //Método para evento click do botão de consultar
    public void onClickBtnConsultar(View view) {
        //Obtem uma nova activity
        Intent intencao = new Intent(this, CronometroActivity.class);

        //Inicia essa nova activity no projeto
        startActivity(intencao);
    }

    //Método para evento click do botão de enviar mensagem
    public void onClickBtnEnviarMensagem(View view) {
        //Obtem uma nova activity
        Intent intencao = new Intent(this, MensagemActivity.class);

        //Inicia essa nova activity no projeto
        startActivity(intencao);
    }
}