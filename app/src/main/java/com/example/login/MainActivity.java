package com.example.login;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button registrarButton = findViewById(R.id.reg);
        registrarButton.setOnClickListener(v -> {
            // Crear un intent para la segunda actividad
            Intent intent = new Intent(MainActivity.this, MainActivity2.class);
            // Iniciar la segunda actividad
            startActivity(intent);
        });
    }
}



