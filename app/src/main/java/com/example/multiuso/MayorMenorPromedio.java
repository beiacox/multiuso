package com.example.multiuso;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MayorMenorPromedio extends AppCompatActivity {

    //Declarando las variables que representaran las vistas
    EditText num1, num2, num3;
    TextView resultadoT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mayor_menor_promedio);

        //inicializamos las variable
        num1 = findViewById(R.id.number1EditText);
        num2 = findViewById(R.id.number2EditText);
        num3 = findViewById(R.id.number3EditText);
        resultadoT = findViewById(R.id.statisticsTextView);
    }

    public void onClickCalcularEstadisticas(View v){
        //Capturando el numero entero desde el editText
        String numero1Str = num1.getText().toString();
        String numero2Str = num2.getText().toString();
        String numero3Str = num3.getText().toString();

        //convertir los numeros de string a int
        int numero1Int = Integer.parseInt(numero1Str);
        int numero2Int = Integer.parseInt(numero2Str);
        int numero3Int = Integer.parseInt(numero3Str);

        //calcular el menor o el mayor y el promedio
        int mayor =Math.max(Math.max(numero1Int,numero2Int), numero3Int);
        int menor =Math.min(Math.min(numero1Int,numero2Int), numero3Int);
        double promedio = (numero1Int + numero2Int + numero3Int)/3;

        //no se complico la vida en efecto deja que mi cel vea si carga
        // Mostrar los resultados en el TextView
        String resultado = "Mayor: " + mayor + "\nMenor: " + menor + "\nPromedio: " + promedio;
        resultadoT.setText(resultado);
    };

    public void onClickRegresar(View v){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    };
}