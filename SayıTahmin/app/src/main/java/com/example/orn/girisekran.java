package com.example.orn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class girisekran extends AppCompatActivity {

    EditText kullanıcı, sifresi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_girisekran);
        kullanıcı=findViewById(R.id.kad);
        sifresi=findViewById(R.id.sifregirs);
    }

    public void giris(View view) {
        String sfresi;
        String kadi;
        kadi= kullanıcı.getText().toString();
        sfresi=sifresi.getText().toString();

        if(kadi.equals("Admin") && sfresi.equals("0000"))
        {
            Intent intent = new Intent(girisekran.this, OyunSf.class);
            startActivity(intent);
        }
        else{
            Toast.makeText(this,"Hatalı Giriş Yaptınız",Toast.LENGTH_LONG).show();
        }
    }
}