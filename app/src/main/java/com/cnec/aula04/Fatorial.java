package com.cnec.aula04;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Fatorial extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fatorial);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText numero = (EditText) findViewById(R.id.numero);
                TextView mensagem = (TextView) findViewById(R.id.mensagem);

                Integer num = Integer.parseInt(numero.getText().toString());


                mensagem.setText(fatorial(num));

            }
        });


    }

    public int fatorial(Integer num) {
        if (num <=1 )  return 1;
        else  return num * fatorial(num - 1);
    }

}
