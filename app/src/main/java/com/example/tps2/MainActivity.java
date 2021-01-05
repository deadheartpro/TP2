package com.example.tps2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button raz,egal,quitter;
    RadioButton moins,plus,multiple,divise;
    TextView result;
    EditText val1,val2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        raz = (Button) findViewById(R.id.raz);
        egal = (Button) findViewById(R.id.egal);
        quitter = (Button) findViewById(R.id.quitter);
        moins = (RadioButton) findViewById(R.id.moins);
        plus = (RadioButton) findViewById(R.id.plus);
        multiple = (RadioButton) findViewById(R.id.multiplie);
        divise = (RadioButton) findViewById(R.id.divise);
        val1 = (EditText) findViewById(R.id.valeur1);
        val2 = (EditText) findViewById(R.id.valeur2);
        result = (TextView) findViewById(R.id.resultat);

        raz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                val2.setText("");
                val1.setText("");
                moins.setChecked(false);
                plus.setChecked(false);
                multiple.setChecked(false);
                divise.setChecked(false);
            }
        });
        egal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                float r ;
                if(moins.isChecked()){
                    r = Float.valueOf(val1.getText().toString()) - Float.valueOf(val2.getText().toString());
                    result.setText(String.valueOf(r));
                }
                else if(plus.isChecked()){
                    r = Float.valueOf(val1.getText().toString()) + Float.valueOf(val2.getText().toString());
                    result.setText(String.valueOf(r));
                }
                else if(multiple.isChecked()){
                    r = Float.valueOf(val1.getText().toString()) * Float.valueOf(val2.getText().toString());
                    result.setText(String.valueOf(r));
                }
                else if(divise.isChecked()){
                    r = Float.valueOf(val1.getText().toString()) / Float.valueOf(val2.getText().toString());
                    result.setText(String.valueOf(r));
                }
            }
        });
         quitter.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 finish();
             }
         });

    }
}