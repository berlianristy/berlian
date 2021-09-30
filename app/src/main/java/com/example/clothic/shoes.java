package com.example.clothic;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class shoes extends AppCompatActivity {
    ImageButton arrow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shoes);

        arrow = (ImageButton) findViewById(R.id.arrow);


        arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (shoes.this, MainActivity2.class);

                startActivity(intent);
            }
        });




    }
}
