package com.example.pertemuan8;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView bersih;
    TextView btambah;
    TextView bkurang;
    TextView bkali;
    TextView bbagi;
    EditText text1;
    EditText text2;
    TextView lhasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bersih = findViewById(R.id.bbersih);
        text1 = findViewById(R.id.tinput);
        text2 = findViewById(R.id.tiput2);
        lhasil = findViewById(R.id.thasil);
        btambah = findViewById(R.id.btambah);
        bkurang = findViewById(R.id.bkurang);
        bkali = findViewById(R.id.bkali);
        bbagi = findViewById(R.id.bbagi);
    }
    public void tambah(View v){

        if(text1.getText().length()>0 && text2.getText().length()>0){
            int input1 = Integer.parseInt(text1.getText().toString());
            int input2 = Integer.parseInt(text2.getText().toString());
            int hasil = input1 + input2;
            lhasil.setText(Integer.toString(hasil));
        }else{
            Toast toast = Toast.makeText( MainActivity.this, "Mohon Masukkan", Toast.LENGTH_LONG );
            toast.show();
        }
    }

    public void kurang(View v){

        if(text1.getText().length()>0 && text2.getText().length()>0){
            int input1 = Integer.parseInt(text1.getText().toString());
            int input2 = Integer.parseInt(text2.getText().toString());
            int hasil = input1 - input2;
            lhasil.setText(Integer.toString(hasil));
        }else{
            Toast toast = Toast.makeText( MainActivity.this, "Mohon Masukkan", Toast.LENGTH_LONG );
            toast.show();
        }
    }
    public void kali(View v){

        if(text1.getText().length()>0 && text2.getText().length()>0){
            int input1 = Integer.parseInt(text1.getText().toString());
            int input2 = Integer.parseInt(text2.getText().toString());
            int hasil = input1 * input2;
            lhasil.setText(Integer.toString(hasil));
        }else{
            Toast toast = Toast.makeText( MainActivity.this, "Mohon Masukkan", Toast.LENGTH_LONG );
            toast.show();
        }
    }
    public void bagi(View v){

        if(text1.getText().length()>0 && text2.getText().length()>0){
            int input1 = Integer.parseInt(text1.getText().toString());
            int input2 = Integer.parseInt(text2.getText().toString());
            int hasil = input1 / input2;
            lhasil.setText(Integer.toString(hasil));
        }else{
            Toast toast = Toast.makeText( MainActivity.this, "Mohon Masukkan", Toast.LENGTH_LONG );
            toast.show();
        }
    }
    public void bersih(View v){

        text1.setText("");
        text2.setText("");
        lhasil.setText("");
    }
}
