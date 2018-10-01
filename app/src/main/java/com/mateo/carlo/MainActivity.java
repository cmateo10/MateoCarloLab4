package com.mateo.carlo;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("4ITB", "Batch 2019");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("4ITB", "GRADUATED");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("4ITB", "EZ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("4ITB", "No to CINCO");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("4ITB", "UNO");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("4ITB", "DOS");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("4ITB", "TRES");
    }
    public void show(View v){
        Toast.makeText(this, "4ITB is the best", Toast.LENGTH_LONG).show();

    }
    public void display(View V){
        Snackbar.make(V, "SNACKBAR IS DISPLAYED", Snackbar.LENGTH_SHORT).show();
    }
}


