package com.example.orn;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class OyunSf extends AppCompatActivity {

    EditText sayı;
    TextView sonuc;
    Random rnd=new Random();
    Button grs,tmn;
    int hak=3;
    int rndsayı=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oyun_sf);
        sayı=findViewById(R.id.tahmin);
        grs=findViewById(R.id.button2);
        tmn=findViewById(R.id.button4);
        sonuc=findViewById(R.id.textView);

    }

    public void basla(View view) {
        hak=3;
        rndsayı=rnd.nextInt(10);
        tmn.setEnabled(true);
        sonuc.setText("Hakkınız="+hak);
    }

    public void tahmin(View view) {
        int kgiris=Integer.parseInt(sayı.getText().toString());
        if(kgiris==rndsayı){
            sonuc.setText("Doğru Cevapladınız!");

        }
        else{
            hak=hak-1;
            if(hak>0){

                sonuc.setText("Yanlış Cevapladınız! Kalan Hakkınız="+hak);
            }
            else{

                tmn.setEnabled(false);
                sonuc.setText("Hakklarınız bitti:( Cevbınız="+rndsayı);
            }
        }
    }
}