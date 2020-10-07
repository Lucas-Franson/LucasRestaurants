package com.example.lucasrestaurants;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {

    private static final String DB_NAME = "lucasrestaurants";
    private static final int DB_VERSION = 1;

    DatabaseHelper(Context context){
        super(context, DB_NAME, null, DB_VERSION);

    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        atualizarBanco(sqLiteDatabase, 0, DB_VERSION);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        atualizarBanco(sqLiteDatabase, i, i1);
    }

    public static void insertProduto(SQLiteDatabase db, String nome, String descricao, double preco_unitario) {

        ContentValues produto = new ContentValues();

        produto.put("nome", nome);
        produto.put("descricao", descricao);
        produto.put("preco_unitario", preco_unitario);

        db.insert("PRODUTO", null, produto);
    }

    private void atualizarBanco(SQLiteDatabase db, int oldVersion, int newVersion){
        String sql;

        if(oldVersion < 1){

            sql = "CREATE TABLE PRODUTO (" +
                    "_id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    "nome TEXT, " +
                    "descricao TEXT, " +
                    "preco_unitario REAL" +
                    ");";

            db.execSQL(sql);

            insertProduto(db, "Camiseta", "Camiseta polo branca", 29.90);
            insertProduto(db, "Tenis", "Tenis de caminhada", 123.99);
            insertProduto(db, "Carteira", "Carteira de couro de jacaré", 59.99);
        }

    }

}
