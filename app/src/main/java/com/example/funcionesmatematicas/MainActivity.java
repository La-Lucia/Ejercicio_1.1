package com.example.funcionesmatematicas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button sumar, restar, multiplicar, dividir;
    TextView n1, n2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sumar = (Button) findViewById(R.id.MA_BtnSumar);
        restar = (Button) findViewById(R.id.MA_BtnRestar);
        multiplicar = (Button) findViewById(R.id.MA_BtnMultiplicar);
        dividir = (Button) findViewById(R.id.MA_BtnDividir);
        n1 = (TextView) findViewById(R.id.MA_TxtNum1);
        n2 = (TextView) findViewById(R.id.MA_TxtNum2);

        sumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (validar() ==  true){

                    Intent intent = new Intent(getApplicationContext(), ActivityRespuesta.class);

                    intent.putExtra("respuesta", "La suma es: " + sumar());

                    startActivity(intent);
                }
            }
        });

        restar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (validar() == true){
                    Intent intent = new Intent(getApplicationContext(), ActivityRespuesta.class);

                    intent.putExtra("respuesta", "La resta es: " + restar());

                    startActivity(intent);
                }
            }
        });

        multiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (validar() == true){
                    Intent intent = new Intent(getApplicationContext(), ActivityRespuesta.class);

                    intent.putExtra("respuesta", "La multiplicacion es: " + multiplicar());

                    startActivity(intent);
                }
            }
        });

        dividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (validar() == true){
                    Intent intent = new Intent(getApplicationContext(), ActivityRespuesta.class);

                    intent.putExtra("respuesta", "La division es: " + dividir());

                    startActivity(intent);
                }
            }
        });



    }

    private double sumar(){

        Double s1 = Double.parseDouble(n1.getText().toString());
        Double s2 = Double.parseDouble(n2.getText().toString());

        double s = s1+s2;

        return s;

    }

    private double restar(){

        Double s1 = Double.parseDouble(n1.getText().toString());
        Double s2 = Double.parseDouble(n2.getText().toString());

        double s = s1-s2;

        return s;

    }

    private double dividir(){

        Double s1 = Double.parseDouble(n1.getText().toString());
        Double s2 = Double.parseDouble(n2.getText().toString());

        double s = s1/s2;

        return s;

    }

    private double multiplicar(){

        Double s1 = Double.parseDouble(n1.getText().toString());
        Double s2 = Double.parseDouble(n2.getText().toString());

        double s = s1*s2;

        return s;

    }

    private boolean validar(){

        Boolean sn = false;

        if (n1.getText().toString().equals("")){

            sn = false;
            Toast.makeText(getApplicationContext(),"Llena todos los campos para realizar una operacion", Toast.LENGTH_SHORT).show();

        } else if (n2.getText().toString().equals("")){

            sn = false;
            Toast.makeText(getApplicationContext(),"Llena todos los campos para realizar una operacion", Toast.LENGTH_SHORT).show();

        } else {

            if (n1.getText().toString().matches("[0-9]*")){

                sn = true;

            }else if (n2.getText().toString().matches("[0-9]*")){

                sn = true;

            }

        }

        return sn;

    }

}