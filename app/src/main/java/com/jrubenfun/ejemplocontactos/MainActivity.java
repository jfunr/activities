package com.jrubenfun.ejemplocontactos;

import android.content.Intent;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public Button mBtLaunchActivity;
    EditText nameM;
    EditText dateM;
    EditText telfM;
    EditText mailM;
    EditText infoM;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameM = (EditText) findViewById(R.id.maname);
        //nameM = (EditText) findViewById(R.id.maname);
        telfM = (EditText) findViewById(R.id.matelf);
        mailM = (EditText) findViewById(R.id.maemail);
        infoM = (EditText) findViewById(R.id.madescripcion);


        mBtLaunchActivity = findViewById(R.id.bt_launch_activity);

        mBtLaunchActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name1 = nameM.getText().toString();

                String telf1 = telfM.getText().toString();
                String mail1 = mailM.getText().toString();
                String info1 = infoM.getText().toString();

                Intent intent = new Intent(MainActivity.this, DetalleContacto.class);

                intent.putExtra("name1", name1);
                intent.putExtra("key1", "date");
                intent.putExtra("telf1", telf1);
                intent.putExtra("mail1", mail1);
                intent.putExtra("info1", info1);

                startActivity(intent);
            }
        });


    }












}
