package com.jrubenfun.ejemplocontactos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class DetalleContacto extends AppCompatActivity {

    private Button mBtGoBack;

    String name;
    String date;
    String telf;
    String mail;
    String info;

    //String name = getIntent().getStringExtra("key");
    //String value = extras.getString("key");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_contacto);

        Bundle extras = getIntent().getExtras();

        name = extras.getString("key");
        date = extras.getString("key1");
        telf = extras.getString("key2");
        mail = extras.getString("key3");
        info = extras.getString("key4");


        mBtGoBack = (Button) findViewById(R.id.bt_go_back);

        mBtGoBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                finish();
            }
        });
    }


}
