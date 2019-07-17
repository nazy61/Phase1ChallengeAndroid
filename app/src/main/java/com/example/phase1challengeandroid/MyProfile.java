package com.example.phase1challengeandroid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.View;

public class MyProfile extends AppCompatActivity implements View.OnClickListener{

    private Toolbar btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        try
        {
            this.getSupportActionBar().hide();
        }
        catch (NullPointerException e){

        }

        setContentView(R.layout.activity_my_profile);

        btnBack = findViewById(R.id.toolbar);
        btnBack.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.toolbar){
            onBackPressed();
            finish();
        }
    }
}
