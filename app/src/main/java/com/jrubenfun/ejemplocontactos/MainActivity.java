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
    EditText name;
    EditText date;
    EditText telf;
    EditText mail;
    EditText info;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.name);


        mBtLaunchActivity = findViewById(R.id.bt_launch_activity);

        mBtLaunchActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, DetalleContacto.class);

                intent.putExtra("key", "name");
                intent.putExtra("key1", "date");
                intent.putExtra("key2", "telf");
                intent.putExtra("key3", "mail");
                intent.putExtra("key4", "info");

                startActivity(intent);
            }
        });


    }




}
