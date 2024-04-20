package com.example.login;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);

        Button registrarButton = findViewById(R.id.regIniciar);
        registrarButton.setOnClickListener(v -> {
            // Crear un intent para la segunda actividad
            Intent intent = new Intent(MainActivity2.this, MainActivity.class);
            // Iniciar la segunda actividad
            startActivity(intent);
        });
    }
}