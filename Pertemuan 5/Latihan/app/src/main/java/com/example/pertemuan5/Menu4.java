package com.example.pertemuan5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Menu4 extends AppCompatActivity {

    EditText Text_angka;
    TextView Hasil_angka;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu4);

        Text_angka = findViewById(R.id.Txt_angka);
        Hasil_angka = findViewById(R.id.Lbl_Hasil);
    }

    public void Tampil_Hasil(View v) {
        int a = Integer.parseInt(Text_angka.getText().toString());
        int x = 1;
        int y = 1;
        while(y != a) {
            x++;
            y = x * x;
            Hasil_angka.setText(Text_angka.getText()+" Adalah Angkar Dari : " + x);


        }
    }
}