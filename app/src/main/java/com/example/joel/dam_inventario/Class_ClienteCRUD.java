package com.example.joel.dam_inventario;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

public class Class_ClienteCRUD extends AppCompatActivity {

    private Button btnGuardarC, btnModificarC, btnEliminarC, btnCancelarC;
    private ImageView btnBuscarC2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cliente_crud);
        btnGuardarC = (Button) findViewById(R.id.btnGuardarC);
        btnModificarC = (Button) findViewById(R.id.btnModificarC);
    }
}
