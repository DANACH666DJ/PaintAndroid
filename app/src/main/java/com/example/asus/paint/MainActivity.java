package com.example.asus.paint;

import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {
    Pizarra pizarra;
    Canvas canvas;
    Button btnYellow,btnRed,btnPistacho,btnEnsanch,btnDismin,btnReinicio;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RelativeLayout relativeLayout=(RelativeLayout)findViewById(R.id.relatLayout);
        pizarra = new Pizarra(this);
        relativeLayout.addView(pizarra);
        btnYellow=(Button)findViewById(R.id.btnYellow);
        btnRed=(Button)findViewById(R.id.btnRed);
        btnPistacho=(Button)findViewById(R.id.btnGreen);
        btnEnsanch=(Button)findViewById(R.id.btnEnsanchar);
        btnDismin=(Button)findViewById(R.id.btnDisminuir);
        btnReinicio=(Button)findViewById(R.id.btnReinicio);
        btnYellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pizarra.colorido=Color.YELLOW;

            }
        });


        btnRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pizarra.colorido=Color.RED;
            }
        });

        btnPistacho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pizarra.colorido=Color.GREEN;
            }
        });

        btnEnsanch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pizarra.ancho=16;
            }
        });

        btnDismin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pizarra.ancho=6;
            }
        });
        btnReinicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            pizarra.clearCanvas();

            }
        });

        //Pizarra pi =(Pizarra)findViewById(R.id.pizzara);
        //Pizarra view = new Pizarra(this);
        //setContentView(view);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.dibujar, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


}
