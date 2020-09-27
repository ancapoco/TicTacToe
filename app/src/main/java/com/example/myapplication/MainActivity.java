package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void onButtonTap(View v){
        Toast myToast = Toast.makeText(getApplicationContext(), "Ceva", Toast.LENGTH_SHORT);
        myToast.show();
    }
}