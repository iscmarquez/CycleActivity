package com.example.cycleactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG,"Je viens d'exécuter la méthode onCreate");

    }

    public void gotoActivity2 (View view) {
        Intent intent = new Intent(this, text.class);
        startActivity(intent);

    }

    protected void onStart(){
        super.onStart();
        Log.i(TAG,"Je viens d'exécuter la méthode onStart");
    }
    protected void onResume(){
        super.onResume();
        Log.i(TAG,"Je viens d'exécuter la méthode onResume");
    }
    protected void onDestroy(){
        super.onDestroy();
        Log.i(TAG,"Je viens d'exécuter la méthode onDestroy");
    }
    protected void onStop(){
        super.onStop();
        Log.i(TAG,"Je viens d'exécuter la méthode onStop");
    }
    protected void onPause(){
        super.onPause();
        Log.i(TAG,"Je viens d'exécuter la méthode onPause");
    }
}
