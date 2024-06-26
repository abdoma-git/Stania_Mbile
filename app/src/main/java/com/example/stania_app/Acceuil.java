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

public class Acceuil extends AppCompatActivity {

    Button espace, matchs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_acceuil);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        espace = (Button) findViewById(R.id.espace);
        matchs = (Button) findViewById(R.id.matchs);

        espace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent profile = new Intent(Acceuil.this, Espace.class);
                startActivity(profile);
            }
        });

        matchs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mtch = new Intent(Acceuil.this, Matchs.class);
                startActivity(mtch);
            }
        });
    }
}