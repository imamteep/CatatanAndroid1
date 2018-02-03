package com.example.asus.foodcost;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by ASUS on 03/02/2018.
 */
public class result extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result);
        TextView txtTempatMakan = (TextView) findViewById(R.id.txtTempatMakan);
        TextView txtMenu = (TextView) findViewById(R.id.txtMenu);
        TextView txtPorsi = (TextView) findViewById(R.id.txtPorsi);
        TextView txtHarga = (TextView) findViewById(R.id.txtHarga);


        Intent intent =getIntent();
        txtTempatMakan.setText(getIntent().getStringExtra("txtResto"));
        txtMenu.setText(getIntent().getStringExtra("edMenu"));
        txtHarga.setText(getIntent().getStringExtra("edHarga"));
        txtPorsi.setText(getIntent().getStringExtra("edPorsi"));










    }
}
