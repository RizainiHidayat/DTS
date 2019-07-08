package com.example.pertemuan5;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu1 extends AppCompatActivity {

    //deklarasi object java
    Button BtnOK;
    Button BtnOK2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu1);

        //hubungkan object java dengan ID XML
        BtnOK = findViewById(R.id.Btn1);
        BtnOK2 = findViewById(R.id.Btn2);
    }
    //code merubah warna
    public void Rubah_Warna(View v){
        BtnOK.setBackgroundColor(Color.RED);
    }
    public void Rubah_Warna1(View v){
        BtnOK2.setBackgroundColor(Color.GREEN);
    }
}
