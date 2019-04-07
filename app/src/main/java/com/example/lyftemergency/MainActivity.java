package com.example.lyftemergency;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the user taps the Send button */


        public void getARide(View view) {
            Intent start = new Intent(this, GetARide.class);
            startActivity(start);
        }
        public void goToSmile(View view) {
            Intent start = new Intent(this, Smile.class);
            startActivity(start);
        }
    }

