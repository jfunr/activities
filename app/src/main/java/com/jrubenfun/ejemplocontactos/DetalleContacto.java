package com.jrubenfun.ejemplocontactos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DetalleContacto extends AppCompatActivity {

    private Button mBtGoBack;

    TextView nameD;
    TextView dateD;
    TextView telfD;
    TextView mailD;
    TextView infoD;

    //String name = getIntent().getStringExtra("key");
    //String value = extras.getString("key");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_contacto);

        Bundle extras = getIntent().getExtras();

        nameD=(TextView)findViewById(R.id.nameValue);

        telfD=(TextView)findViewById(R.id.telfValue);
        mailD=(TextView)findViewById(R.id.mailValue);
        infoD=(TextView)findViewById(R.id.descripcionValue);

        if (extras!=null){

            String name1=extras.getString("name1");

            String telf1=extras.getString("telf1");
            String mail1=extras.getString("mail1");
            String info1=extras.getString("info1");



            nameD.setText(name1);

            telfD.setText(telf1);
            mailD.setText(mail1);
            infoD.setText(info1);
        }

        mBtGoBack = (Button) findViewById(R.id.bt_go_back);

        mBtGoBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                finish();
            }
        });
    }


}




