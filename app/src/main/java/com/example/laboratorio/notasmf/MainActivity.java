package com.example.laboratorio.notasmf;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private EditText enota1;
    private EditText enota2;
    private EditText enota3;
    private TextView snota4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void onClickCalcular(View view) {

        enota1 = (EditText)findViewById(R.id.enota1);
        enota2 = (EditText)findViewById(R.id.enota2);
        enota3 = (EditText)findViewById(R.id.enota3);
        snota4 = (TextView)findViewById(R.id.snota4);


        if((enota1.getText()).toString().isEmpty() || (enota2.getText()).toString().isEmpty() || (enota3.getText()).toString().isEmpty()){
            Toast.makeText(this,"Ingresa todas las notas", Toast.LENGTH_LONG).show();
            snota4.setText("_______");
        }else{
            double n1= Double.parseDouble((enota1.getText()).toString());
            double n2= Double.parseDouble((enota2.getText()).toString());
            double n3= Double.parseDouble((enota3.getText()).toString());

            double tot = (3.5-((n1+n2+n3)*0.25))*4;

            if(tot<=0){
                snota4.setText("Usted no necesita nota para dejar la materia en 3,5");
            }
            else{
                snota4.setText("Usted necesita "+String.valueOf(tot)+" para dejar la materia con nota decente");
            }
        }



    }
}
