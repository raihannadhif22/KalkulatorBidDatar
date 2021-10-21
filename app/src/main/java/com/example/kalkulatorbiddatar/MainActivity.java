package com.example.kalkulatorbiddatar;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText ePAD,eLT;
    Button bpersegi,bsegitiga,blingkaran;
    TextView tvhasil1,tvhasil2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ePAD=(EditText)findViewById(R.id.editTextPAD);
        eLT=(EditText)findViewById(R.id.editTextLT);
        tvhasil1=(TextView)findViewById(R.id.textViewhasil1);
        tvhasil2=(TextView)findViewById(R.id.textViewhasil2);
        bpersegi=(Button)findViewById(R.id.buttonPersegi);
        bsegitiga=(Button)findViewById(R.id.buttonsegitiga);
        blingkaran=(Button)findViewById(R.id.buttonlingkaran);

        bsegitiga.setOnClickListener(v -> {
            double bill1,bill2,luas;
            bill1=Double.parseDouble(ePAD.getText().toString().trim());
            bill2=Double.parseDouble(eLT.getText().toString().trim());
            luas=(bill1 * bill2)/2;
            String luas1= String.valueOf(luas);
            tvhasil1.setText(luas1);

            double bilangan1,keliling;
            bilangan1=Double.parseDouble(ePAD.getText().toString().trim());
            keliling=(bilangan1+bilangan1+bilangan1);

            String keliling1= String.valueOf(keliling);
            tvhasil2.setText(keliling1);
        });

        bpersegi.setOnClickListener(v -> {
            double bill1,bill2,luas;
            bill1=Double.parseDouble(ePAD.getText().toString().trim());
            bill2=Double.parseDouble(eLT.getText().toString().trim());
            luas=(bill1 * bill2);
            String luas1= String.valueOf(luas);
            tvhasil1.setText(luas1);

            double bilangan1,bilangan2,keliling;
            bilangan1=Double.parseDouble(ePAD.getText().toString().trim());
            bilangan2=Double.parseDouble(eLT.getText().toString().trim());
            keliling=(bilangan1+ bilangan2)*2;

            String keliling1= String.valueOf(keliling);
            tvhasil2.setText(keliling1);
        });

        blingkaran .setOnClickListener(v -> {
            double bill1,jari,luas;
            bill1=Double.parseDouble(ePAD.getText().toString().trim());
            jari=bill1 * 0.5;
            luas=Math.PI * Math.pow(jari,2);
            String luas1=String.valueOf(luas);
            tvhasil1.setText(luas1);


            double bilangan1,keliling;
            bilangan1=Double.parseDouble(ePAD.getText().toString().trim());

            keliling=Math.PI * bilangan1;
            String keliling1= String.valueOf(keliling);
            tvhasil2.setText(keliling1);
        });

    }
}