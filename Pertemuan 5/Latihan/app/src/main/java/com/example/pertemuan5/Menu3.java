package com.example.pertemuan5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Menu3 extends AppCompatActivity {

    EditText Text_nama;
    TextView Hasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu3);

    Text_nama = findViewById(R.id.Txt_Nama);
    Hasil = findViewById(R.id.Lbl_Hasil);
    }

    public void Tampil_Hasil(View v) {

        Hasil.setText("Nama Anda adalah : "+Text_nama.getText());
    }
}
