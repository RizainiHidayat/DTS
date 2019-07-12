package com.example.pertemuan9a;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText b1;
    EditText b2;
    EditText b3;
    TextView h1;
    TextView h2;
    TextView h3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = findViewById(R.id.EdNIM);
        b2 = findViewById(R.id.EdNAMA);
        b3 = findViewById(R.id.EdKAMPUS);
    }
    public void OK(View v){
        h1.setText("NIM = "+b1.getText());
        h2.setText("Nama = "+b2.getText());
        h3.setText("Kampus = "+b3.getText());
    }
}
