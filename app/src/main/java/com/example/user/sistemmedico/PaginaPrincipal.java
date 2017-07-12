package com.example.user.sistemmedico;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class PaginaPrincipal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina_principal);
    }

    public void clique(View view){

        Intent intencao = new Intent(this, MarcarExame.class);
        startActivity(intencao);

    }

    public void cliqueCadastro(View view){

        Intent intencao = new Intent(this, CadastroUsuario.class);
        startActivity(intencao);

    }

    public void cliquePerfil(View view){

        Intent intencao = new Intent(this, EditarPerfil.class);
        startActivity(intencao);

    }
}
