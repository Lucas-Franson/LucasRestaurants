package com.example.lucasrestaurants;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

// Author: Lucas

public class MensagemActivity extends AppCompatActivity {

    //Método Main
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mensagem);
    }

    //Método para envio de pedido pelo zap
    public void onEnviarPedidoZap(View view) {

        //Obtem edit text da tela
        EditText editText = (EditText) findViewById(R.id.txtMensagem);
        //Obtem valor do edit text
        String mensagem = editText.getText().toString();

        //Inicia activity para compartilhamento externo
        Intent intencao = new Intent(Intent.ACTION_SEND);
        //Ajusta tipo de mensagem a ser enviada
        intencao.setType("text/plain");
        //Adiciona como parametro a mensagem digitada pelo usuário
        intencao.putExtra(Intent.EXTRA_TEXT, mensagem);
        //Adiciona texto de exibição do usuário
        intencao.putExtra(Intent.EXTRA_SUBJECT, "Assunto");

        //Inicia compartilhamento da mensagem
        startActivity(intencao);
    }

}