package com.example.phase1challengeandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button btnAbout;
    private Button btnProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAbout = findViewById(R.id.btn_about);
        btnProfile = findViewById(R.id.btn_profile);

        btnAbout.setOnClickListener(this);
        btnProfile.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.btn_about){
            Intent intent = new Intent(MainActivity.this, AboutALC.class);
            startActivity(intent);
        } else if(view.getId() == R.id.btn_profile){
            Intent intent = new Intent(MainActivity.this, MyProfile.class);
            startActivity(intent);
        }
    }
}
