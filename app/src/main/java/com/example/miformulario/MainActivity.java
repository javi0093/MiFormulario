package com.example.miformulario;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import com.google.android.material.datepicker.MaterialDatePicker;
import com.google.android.material.datepicker.MaterialPickerOnPositiveButtonClickListener;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    private EditText etFecha;
    private ImageButton imgbtnFecha;
    private DatePicker dpFecha;

    private EditText etEmail;
    private Button btnSiguiente;
    private EditText etNombre;
    private EditText etTelefono;
    private EditText etDescripcion;

    private Button btnAceptar;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        etNombre= (EditText) findViewById(R.id.etNombre);
        etFecha= findViewById(R.id.etFecha);
        etTelefono = findViewById(R.id.etTelefono);
        //imgbtnFecha = findViewById(R.id.imgbtnFecha);
        etEmail = findViewById(R.id.etEmail);
        dpFecha= findViewById(R.id.dpFecha);
        etDescripcion = findViewById(R.id.etDescripcion);
        btnSiguiente = findViewById(R.id.btnSiguiente);
        btnAceptar = findViewById(R.id.btnAceptar);



        //esto es por si quiero cambiar el formato del calendario a uno en el que aparezca el calendario al apretar un botón


       /* MaterialDatePicker.Builder materialDateBuilder = MaterialDatePicker.Builder.datePicker();
        materialDateBuilder.setTitleText("Seleccione una fecha");
        final MaterialDatePicker materialDatePicker = materialDateBuilder.build();
        imgbtnFecha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                materialDatePicker.show(getSupportFragmentManager(), "MATERIAL_DATE_PICKER");
            }
        });

        materialDatePicker.addOnPositiveButtonClickListener(new MaterialPickerOnPositiveButtonClickListener() {
            //@SuppressLint("SetTextI18n")
            @Override
            public void onPositiveButtonClick(Object selection) {
                etFecha.setText(materialDatePicker.getHeaderText());
            }
        });*/



        btnAceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder fechaElegida = new StringBuilder();
                int mes = dpFecha.getMonth() + 1;
                fechaElegida.append(dpFecha.getDayOfMonth() + "/" + mes + "/" + dpFecha.getYear() );
                fechaElegida.toString();
                etFecha.setText(fechaElegida);

            }
        });



        btnSiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, ConfirmarDatos.class);
                intent.putExtra("nombre_ingresado", etNombre.getText().toString());
                intent.putExtra("fecha_ingresado", etFecha.getText().toString());
                intent.putExtra("telefono_ingresado", etTelefono.getText().toString());
                intent.putExtra("email_ingresado", etEmail.getText().toString());
                intent.putExtra("descripcion_ingresado", etDescripcion.getText().toString());

                startActivity(intent);
            }
        });




    }




}