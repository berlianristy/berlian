package com.example.clothic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity2 extends AppCompatActivity {
    ImageButton imageclothes;
    Button imageShoes;
    ImageButton imageskrit;
    ImageButton imageAccessories;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        imageclothes.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity2.this, layout2.class);

                startActivity(intent);

            }

        });


        imageShoes.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                Intent intent = new Intent(MainActivity2.this, shoes.class);

                startActivity(intent);

            }

        });


        imageskrit.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                Intent intent = new Intent(MainActivity2.this, rokdancelana.class);

                startActivity(intent);

            }

        });
        imageAccessories.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                Intent intent = new Intent(MainActivity2.this, accesorries.class);

                startActivity(intent);

            }
        });


    }


}
    }
}