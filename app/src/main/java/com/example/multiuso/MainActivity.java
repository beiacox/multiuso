package com.example.multiuso;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickTabla(View v){
        Intent intent = new Intent(this, TablaDeMultiplica.class);
        startActivity(intent);
    };
    public void onClickMayorMenorPromedio(View v){
        Intent intent = new Intent(this, MayorMenorPromedio.class);
        startActivity(intent);
    };
}