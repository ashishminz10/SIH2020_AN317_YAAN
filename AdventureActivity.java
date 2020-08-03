package com.example.yaan;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class AdventureActivity extends AppCompatActivity {

    TextView himachal, sikkim, jnk;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adventure);


        sikkim = findViewById(R.id.sikkim);
        himachal = findViewById(R.id.himachal);
        jnk = findViewById(R.id.jnk);

        sikkim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdventureActivity.this, sikkimActivity.class);
                startActivity(intent);
            }
        });

        himachal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdventureActivity.this, himachalActivity.class);
                startActivity(intent);
            }
        });

        jnk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdventureActivity.this, jandkActivity.class);
                startActivity(intent);
            }
        });

    }
}
