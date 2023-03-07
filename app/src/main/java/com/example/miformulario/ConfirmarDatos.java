package com.example.miformulario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ConfirmarDatos extends AppCompatActivity {

    private TextView tvNombre;
    private TextView tvFecha;
    private TextView tvTelefono;
    private TextView tvEmail;
    private TextView tvDescripcion;
    private Button btnEditar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmar_datos);
        btnEditar = findViewById(R.id.btnEditar);



        Bundle parametros = getIntent().getExtras();
        String nombre_recibido = parametros.getString("nombre_ingresado");
        String fecha_recibido = parametros.getString("fecha_ingresado");
        String telefono_recibido = parametros.getString("telefono_ingresado");
        String email_recibido = parametros.getString("email_ingresado");
        String descripcion_recibido = parametros.getString("descripcion_ingresado");



        tvNombre   = (TextView) findViewById(R.id.tvNombre);
        tvFecha = (TextView)findViewById(R.id.tvFecha);
        tvTelefono= (TextView)findViewById(R.id.tvTelefono);
        tvEmail= (TextView)findViewById(R.id.tvEmail);
        tvDescripcion= (TextView)findViewById(R.id.tvDescripcion);

        tvNombre.setText(nombre_recibido);
        tvFecha.setText(fecha_recibido);
        tvTelefono.setText(telefono_recibido);
        tvEmail.setText(email_recibido);
        tvDescripcion.setText(descripcion_recibido);



        btnEditar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}