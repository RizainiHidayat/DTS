package com.example.pertemuan8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class GanjilGenap extends AppCompatActivity {

    EditText inbilangan;
    TextView dtbilangan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ganjil_genap);

        inbilangan = findViewById(R.id.tinput);
        dtbilangan = findViewById(R.id.thasil);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.optionmenu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        if (item.getItemId()==R.id.menu1){
            startActivity(new Intent(this, GanjilGenap.class));
        }
        return true;
    }

    public void aksi(View v){

        int angka = Integer.parseInt(inbilangan.getText().toString());
        if((angka % 2) == 0){
            dtbilangan.setText("Nilai " +angka+ " Adalah genap");
        } else {
            dtbilangan.setText("Nilai " +angka+ " Adalah ganjil");
        }
    }
}
