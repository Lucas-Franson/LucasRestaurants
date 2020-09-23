package com.example.lucasrestaurants;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class CriarEmailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_criar_email);
    }

    public void onClickEnviar(View view){
        /*Quando o botão enviar for clicado devemos criar uma intenção para abrir qualquer
         * aplicativo/atividade que consiga processar nosso texto. Temos que montar a mensagem que
         * será enviada pegando os dados da tela, colocar na intenção e enviar de forma que
         * o android posso perguntar qual aplicativo o usuario vai querer usar para tratar aquela informação*/

        //Obtem edit text da tela
        EditText editProduto = (EditText) findViewById(R.id.edtProduto);
        EditText editQtd = (EditText) findViewById(R.id.edtQtd);

        //Obtem valor do edit text
        String produto = editProduto.getText().toString();
        String qtd = editQtd.getText().toString();

        String mensagem = "SOLICITAÇÃO DE ESTOQUE \nProduto: " + produto + " \nQuantidade: " + qtd;

        //Inicia activity para compartilhamento externo
        Intent intencao = new Intent(Intent.ACTION_SEND);
        //Ajusta tipo de mensagem a ser enviada
        intencao.setType("text/plain");
        //Adiciona como parametro a mensagem digitada pelo usuário
        intencao.putExtra(Intent.EXTRA_TEXT, mensagem);
        //Adiciona texto de exibição do usuário
        intencao.putExtra(Intent.EXTRA_SUBJECT, "Fornecedor");

        Intent shareIntent = Intent.createChooser(intencao, null);

        //Inicia compartilhamento da mensagem
        startActivity(shareIntent);

    }

}