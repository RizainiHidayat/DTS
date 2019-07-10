package com.example.pertemuan7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView t_hasil;
    EditText t_input;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t_hasil =  findViewById(R.id.t_hasil);
        t_input = findViewById(R.id.i_text);
    }

    public void tampil(View v) {
    t_hasil.setText("Nama Anda Adalah : "+t_input.getText());
    }
}
