package com.example.funcionesmatematicas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActivityRespuesta extends AppCompatActivity {

    Button regresar;
    TextView respuesta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_respuesta);

        regresar = (Button) findViewById(R.id.AR_BtnRegresar);
        respuesta = (TextView) findViewById(R.id.AR_TxtRespuesta);

        Bundle resultado = getIntent().getExtras();
        respuesta.setText(resultado.getString("respuesta"));

        regresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

    }
}