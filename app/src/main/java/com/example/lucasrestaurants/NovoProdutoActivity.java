package com.example.lucasrestaurants;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class NovoProdutoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_novo_produto);
    }

    public void onClickSalvar(View view){
        /*Quando o botão de salvar for clicado, esse código será executado.
         * Para esse exemplo, a unica coisa que esse código deve fazer é iniciar
         * a atividade ExibirProdutoActivity*/
        Intent intencao = new Intent(this, ExibirProdutoActivity.class);

        startActivity(intencao);
    }

}