package com.example.stania_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Matchs extends AppCompatActivity {

    Button accueil, espace;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_matchs);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        accueil = (Button) findViewById(R.id.acceuil);
        espace = (Button) findViewById(R.id.espace);

        accueil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent acc = new Intent(Matchs.this, Acceuil.class);
                startActivity(acc);
            }
        });

        espace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent esp = new Intent(Matchs.this, Espace.class);
                startActivity(esp);
            }
        });
    }
}

