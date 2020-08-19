package com.example.elegant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class UserPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_page);
    }

    public void gotoLoginActivity(View view) {
        Intent intent = new Intent(UserPage.this, LoginActivity.class);
        startActivity(intent);
    }

    public void gotoRegistrationActivity(View view) {
        Intent intent = new Intent(UserPage.this, RegisterActivity.class);
        startActivity(intent);

    }
}
