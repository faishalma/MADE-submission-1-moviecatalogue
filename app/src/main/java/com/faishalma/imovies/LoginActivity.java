package com.faishalma.imovies;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button btnStart = findViewById(R.id.btn_start);
        btnStart.setOnClickListener(this);

        Button btnAbout = findViewById(R.id.btn_about);
        btnAbout.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_start:
                Intent moveIntent = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(moveIntent);
                break;

            case R.id.btn_about:
                moveIntent = new Intent(LoginActivity.this, AboutActivity.class);
                startActivity(moveIntent);
                break;
        }

    }
}
