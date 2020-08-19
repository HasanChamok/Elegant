package com.example.elegant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SignInSelection extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in_selection);
    }

    public void gotoDesignerLoginActivity(View view) {
        Intent intent = new Intent(SignInSelection.this, DesignerLoginActivity.class);
        startActivity(intent);
    }

    public void gotoUserPage(View view) {
        Intent intent = new Intent(SignInSelection.this, UserPage.class);
        startActivity(intent);

    }
}
