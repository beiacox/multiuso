package com.example.multiuso;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class TablaDeMultiplica extends AppCompatActivity {

    //Declarando las variable que representan las visata que se usaran
    EditText numero;
    TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabla_de_multiplica);
        numero = findViewById(R.id.numberEditText);
        resultado = findViewById(R.id.resultTextView);
    }
    public void onClickRegresar(View v){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    };

    public void onClickCalcular(View v){
        //Capturando el numero entero desde el editText
        String numeroStr = numero.getText().toString();
        int numeroInt = Integer.parseInt(numeroStr);


        // Calcular y mostrar la tabla de multiplicar
        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= 14; i++) {
            result.append(numeroInt).append(" x ").append(i).append(" = ").append(numeroInt * i).append("\n");
        }
        resultado.setText(result.toString());
    };
}