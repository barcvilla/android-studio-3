package com.ch06.multiple.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button objButton = (Button)findViewById(R.id.button);
    }

    public void launchSecondActivity(View view)
    {
        /*referencia del obj que lanza el intent, el segundo argumento es la activity que queremos lanzar*/
        Intent i = new Intent(this, Main2Activity.class);
        startActivity(i); // lanzamos la segunda actividad
    }
}
