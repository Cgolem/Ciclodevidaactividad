package com.example.carlo.ciclodevidaactividad;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    // ESTADOS DE ACTIVIDAD
    /*
    *  Running: el usuario ve e interactua con la app
    *  Paused: pasa a segundo plano pero sigue visible
    *  Stopped: la actividad es tapada por otra
    *  Destroyed: finaliza el ciclo de la actividad
    *  */

    // Prepara la interfaz grafica
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("ciclovida", "Entro a metodo onCreate");
    }

    // Se ejecuta cuando una actividad parada vuelve a estar activa
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("ciclovida", "Entro a metodo onRestart");
    }

    //Se ejecuta justo antes de que la app sea visuble
    @Override
    protected void onStart() {
        super.onStart();
        Log.i("ciclovida", "Entro a metodo onStart");
    }

    //Se ejecuta justo antes de que el usuario interactue con la app
    @Override
    protected void onResume() {
        super.onResume();
        Log.i("ciclovida", "Entro a metodo onResume");
    }

    //Se ejecuta cuando la actividad actual va a ser tapada por otro proceso
    @Override
    protected void onPause() {
        super.onPause();
        Log.i("ciclovida", "Entro a metodo onPause");
    }

    //Se ejecuta cuando la actividad se hace invisible al usuario
    @Override
    protected void onStop() {
        super.onStop();
        Log.i("ciclovida", "Entro a metodo onStop");
    }

    //Se llama justo antes de liberar los recursos y destruir la actividad
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("ciclovida", "Entro a metodo onDestroy");
    }
}
