package com.example.ted.basics1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /*Metodo void ya que no retorna un objeto al caller. metodo sayHello igual al atributo onClick del archivo .xml*/
    void sayHello(View v)
    {
        System.out.println("Hello");
    }
}
