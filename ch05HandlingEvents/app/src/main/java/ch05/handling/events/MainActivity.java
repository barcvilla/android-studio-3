package ch05.handling.events;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    int numberToGuess = 0;
    EditText e;
    TextView t;

    int intNumberToGuess()
    {
        Random r = new Random();
        numberToGuess = r.nextInt(100) + 50; /*set random range from 100 to 150*/
        Log.i("Ted", numberToGuess + "");
        return numberToGuess;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numberToGuess = intNumberToGuess();
        e = (EditText)findViewById(R.id.editText);
        t = (TextView)findViewById(R.id.textView);
        Button b = (Button)findViewById(R.id.button);
        b.setOnClickListener(this);
    }

    @Override
    public void onClick(View view)
    {
        int number = Integer.parseInt(e.getText().toString());
        if(number == numberToGuess)
        {
            t.setText(number + " is the right number");
        }
        else if(number < numberToGuess)
        {
            t.setText("Guess higher");
        }
        else if(number > numberToGuess)
        {
            t.setText("Guess lower");
        }
        Log.i("Ted", numberToGuess + "");
    }
}
