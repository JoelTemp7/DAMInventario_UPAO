package com.example.joel.dam_inventario;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Class_Entradas2 extends AppCompatActivity {

    private Button btnESiguiente2, btnECancelar2, btnEAñadir2, btnEAtras2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entradas2);
        btnESiguiente2 = (Button) findViewById(R.id.btnCancelarProd);
        btnEAtras2 = (Button) findViewById(R.id.btnEAtras2);
        btnEAñadir2 = (Button) findViewById(R.id.btnGuardarProd);
        btnECancelar2 = (Button) findViewById(R.id.btnModificarProd);
        btnESiguiente2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                irEntrada3();
            }
        });
        btnEAtras2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                irEntrada1();
            }
        });
        btnECancelar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                irMenu();
            }
        });
        btnEAñadir2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // operaciones para añadir entrada de productos
            }
        });
    }
    public void irEntrada3(){
        Intent i = new Intent(this, Class_Entradas3.class);
        startActivity(i);
    }
    public void irEntrada1(){
        Intent i = new Intent(this, Class_Entradas1.class);
        startActivity(i);
    }
    public void irMenu(){
        Intent i = new Intent(this, Class_Menu.class);
        startActivity(i);
    }
}
