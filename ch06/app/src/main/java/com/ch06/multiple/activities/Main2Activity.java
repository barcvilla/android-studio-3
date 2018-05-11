package com.ch06.multiple.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button secondButton = (Button)findViewById(R.id.button2);
        assert secondButton != null;
        secondButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                finish();
            }
        });
    }
}
