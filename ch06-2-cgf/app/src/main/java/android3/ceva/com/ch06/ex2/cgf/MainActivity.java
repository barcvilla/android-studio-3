package android3.ceva.com.ch06.ex2.cgf;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/***
 * MainActivity es el Listener
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    /*Definimos los miembros de clase*/
    private EditText fno;
    private EditText sno;
    private Button btn;

    private final String TAG = "GCF app";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fno = (EditText)findViewById(R.id.firstno);
        sno = (EditText)findViewById(R.id.secondno);
        btn = (Button)findViewById(R.id.button);
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v)
    {
        Log.i(TAG, "onClick of button");

        /*Verificamos si los TextView no tiene texto dentro*/
        boolean a = TextUtils.isEmpty(fno.getText());
        boolean b = TextUtils.isEmpty(sno.getText());

        /*Verificamos que los text fields no esten vacios. Si uno de ellos esta vacio no se ejecuta el codigo*/
        if(!a & !b)
        {
            /*EditText objeto retorna un objeto String por lo que debemos hacer un Integer.parseInt()*/
            int firstnumber = Integer.parseInt(fno.getText().toString());
            int secondnumber = Integer.parseInt(sno.getText().toString());

            /*Creamos el objeto Intent con los parametros: context objet y la clase que se lanza*/
            Intent intent = new Intent(this, activity_calculate.class);
            /*Preparamos el bundle que recibira los datos. Un bundle es como un diccionario almacena key/value*/
            Bundle bundle = new Bundle();
            /*Transladamos los datos al bundle*/
            bundle.putInt("fno", firstnumber);
            bundle.putInt("sno", secondnumber);
            /*trasladamos el bundle al intent objet*/
            intent.putExtra("gcfdata", bundle);
            /*Lanzamos el activity*/
            startActivity(intent);

            Log.i(TAG, "" + firstnumber);
            Log.i(TAG, "" + secondnumber);
        }
    }

    /**
     * metodo onStart es llamado cuando se lanza la app y tambien cada vez que se retorne y se coloque el foco en el Activity.
     */
    @Override
    public void onStart()
    {
        super.onStart();
        fno.setText("");
        sno.setText("");
    }
}
