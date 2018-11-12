package com.example.joel.dam_inventario;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Class_Entradas1 extends AppCompatActivity {

    private Button btnSiguiente1, btnAtras1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entradas1);
        btnSiguiente1 = (Button) findViewById(R.id.btnModificarC);
        btnAtras1 = (Button) findViewById(R.id.btnGuardarC);
        btnSiguiente1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                irEntrada2();
            }
        });
        btnAtras1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                irMenu();
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
