package com.example.elegant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Catagory extends AppCompatActivity {

    private Button mBut3;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catagory);

        mBut3 = findViewById(R.id.but3);

        mBut3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openImagesActivity();
            }
        });
    }
    private void openImagesActivity()
    {
        Intent intent = new Intent(Catagory.this,imageActivity.class);
        startActivity(intent);
    }
}
