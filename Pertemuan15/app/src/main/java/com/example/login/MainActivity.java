package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.time.Instant;

public class MainActivity extends AppCompatActivity {

    EditText u,p;
    Button l,lg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        u = findViewById(R.id.E_user);
        p = findViewById(R.id.E_pas);
        l = findViewById(R.id.B_login);
        lg = findViewById(R.id.B_logout);
    }

    public void login(View view){
        if (u.getText().toString().equals("admin") && p.getText().toString().equals("admin")){
            Intent intent = new Intent(MainActivity.this, MenuUtama.class);
            startActivity(intent);
            Toast.makeText(MainActivity.this,"Berhasil...",Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(MainActivity.this,"id atau pas anda salah",Toast.LENGTH_SHORT).show();
        }
    }
    public void logout(View v){
        finish();
    }
}
