package android3.ceva.com.ch06.ex2.cgf;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class activity_calculate extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculate);
        int bigno = 0;
        int smallno = 0;
        int rem = 1;

        TextView gcftext = (TextView) findViewById(R.id.textView);
        Intent intent = getIntent();
        /**
         * MainActivity pasa algunos datos usando Intent y Bundle object. Debemos extraer los datos del bundle y eventualmente
         * extraer los pares key/value de datos dentro del bundle
         */
        /*retornamos el bundle object el cual pasamos en el intent object*/
        Bundle bundle = intent.getBundleExtra("gcfdata");

        if((bundle != null) & !bundle.isEmpty())
        {
            /*fno key es igual al usado en MainActivity putInt(), el segundo parametro es un defaultValue*/
            int first = bundle.getInt("fno", 1);
            int second = bundle.getInt("sno", 1);

            if(first > second)
            {
                bigno = first;
                smallno = second;
            }
            else
            {
                bigno = second;
                smallno = first;
            }

            /**
             * Dividimos bigno / smallno y el residuo se almacena en rem. Luego testeamos la expresion para determinar si
             * el resultado es cero
             */
            while((rem = bigno % smallno) != 0)
            {
                bigno = smallno;
                smallno = rem;
            }

            gcftext.setText(String.format("GCF = %d", smallno));
        }
    }
}
