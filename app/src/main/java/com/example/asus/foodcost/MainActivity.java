package com.example.asus.foodcost;

import android.content.Intent;
import android.renderscript.Double2;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText edMenu = (EditText) findViewById(R.id.edMenu);
        final EditText edPorsi = (EditText) findViewById(R.id.edPorsi);
        final TextView edHarga = (TextView) findViewById(R.id.edHarga);
        final TextView txtResto = (TextView) findViewById(R.id.txtResto);
        Button btEatbus = (Button) findViewById(R.id.btEatbus);
        Button btAbnormal = (Button) findViewById(R.id.btAbnormal);



        btAbnormal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                double vPorsi, vTotalBayar;
                double vAbnormal = 30000;
                vPorsi = Double.valueOf(edPorsi.getText().toString().trim());
                vTotalBayar = vAbnormal * vPorsi;
                edHarga.setText(String.valueOf(vTotalBayar));
                txtResto.setText("Abnormal");

                Intent intent = new Intent(MainActivity.this, result.class);
                intent.putExtra("edHarga", edHarga.getText().toString());
                intent.putExtra("edMenu", edMenu.getText().toString());
                intent.putExtra("edPorsi", edPorsi.getText().toString());
                intent.putExtra("txtResto", txtResto.getText().toString());
                startActivity(intent);

                Toast.makeText(MainActivity.this, "disini aja makan malamnya", Toast.LENGTH_LONG).show();
            }});


        btEatbus.setOnClickListener(new View.OnClickListener()

            {
                @Override
                public void onClick (View v){

                double vPorsi, vTotalBayar;
                double vEatbus = 50000;
                vPorsi = Double.valueOf(edPorsi.getText().toString().trim());
                vTotalBayar = vEatbus * vPorsi;
                edHarga.setText(String.valueOf(vTotalBayar));
                txtResto.setText("Eatbus");


                Intent intent = new Intent(MainActivity.this, result.class);
                intent.putExtra("edHarga", edHarga.getText().toString());
                intent.putExtra("edMenu", edMenu.getText().toString());
                intent.putExtra("edPorsi", edPorsi.getText().toString());
                intent.putExtra("txtResto", txtResto.getText().toString());
                startActivity(intent);

                    Toast.makeText(MainActivity.this, "Jangan disini makan malamnya, uang kamu tidak cukup", Toast.LENGTH_LONG).show();



            }

            }
        );



    }
}
