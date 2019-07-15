package com.example.pertemuan10a;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Tampilan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampilan);

    }

    public void internal(View v){
        Intent i = new Intent (Tampilan.this, MainActivity.class);
        startActivity(i);
    }

    public void external(View v){
        Intent ex = new Intent( Tampilan.this, External.class);
        startActivity(ex);
    }
}
