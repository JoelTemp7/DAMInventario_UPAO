package com.example.joel.dam_inventario;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Class_Entradas3 extends AppCompatActivity {

    private Button btnEAtras3, btnEFinalizar3, btnECancelar3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entradas3);
        btnEAtras3 = (Button) findViewById(R.id.btnGuardarC);
        btnEFinalizar3 = (Button) findViewById(R.id.btnEFinalizar3);
        btnECancelar3 = (Button) findViewById(R.id.btnModificarC);
        btnEAtras3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                irEntrada2();
            }
        });
        btnECancelar3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                irMenu();
            }
        });
        btnEFinalizar3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    public void irEntrada2(){
        Intent i = new Intent(this, Class_Entradas2.class);
        startActivity(i);
    }

    public void irMenu(){
        Intent i = new Intent(this, Class_Menu.class);
        startActivity(i);
    }
}
