package com.example.kalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnLicz, button, button2, button3, button4;
    private EditText editTextNumberDecimal, editTextNumberDecimal2;

    private int dzialanie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextNumberDecimal = findViewById(R.id.editTextNumberDecimal);
        editTextNumberDecimal2 = findViewById(R.id.editTextNumberDecimal2);
        btnLicz = findViewById(R.id.btnLicz);
        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dzialanie = 1;
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dzialanie = 2;
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dzialanie = 3;
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dzialanie = 4;
            }
        });

        btnLicz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                licz();
            }
        });
    }
    private void licz()
    {
        Double liczba1 =Double.parseDouble(String.valueOf(editTextNumberDecimal.getText()));
        Double liczba2 =Double.parseDouble(String.valueOf(editTextNumberDecimal2.getText()));

        double wynik;

        if (dzialanie == 1)
        {
            wynik = liczba1 + liczba2;
            Toast.makeText(this, "Wynik to: " + wynik, Toast.LENGTH_SHORT).show();
        }
        else if (dzialanie == 2)
        {
            wynik = liczba1 - liczba2;
            Toast.makeText(this, "Wynik to: " + wynik, Toast.LENGTH_SHORT).show();
        }
        else if (dzialanie == 3)
        {
            wynik = liczba1 * liczba2;
            Toast.makeText(this, "Wynik to: " + wynik, Toast.LENGTH_SHORT).show();
        }
        else
        {
            wynik = liczba1 / liczba2;
            Toast.makeText(this, "Wynik to: " + wynik, Toast.LENGTH_SHORT).show();
        }
    }
}