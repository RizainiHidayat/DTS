package com.example.pertemuan7b;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText tinput;
    TextView thasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        thasil = findViewById(R.id.hasil);
        tinput = findViewById(R.id.input);
    }

    public void tampil(View v){
        thasil.setText("Nama Anda Adalah : "+tinput.getText());
    }
}
