package com.ch05.eventhandling.v2;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

// Trabajando con un EventHandler externo con un MainActivity

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener
{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onClick(View view)
    {
        switch (view.getId())
        {
            case R.id.button1:
                show("Button One");
                break;
            case R.id.button2:
                show("Button two");
                break;
            case R.id.button3:
                show("Button three");
                break;
             default:
                 show("This should not happend");
        }
    }

    void show(String message)
    {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
        Log.i(getClass().getName(), message);
    }
}
