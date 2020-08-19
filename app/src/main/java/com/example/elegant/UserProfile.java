package com.example.elegant;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class UserProfile extends AppCompatActivity {

    FirebaseUser user;
    DatabaseReference reff;
    FirebaseAuth auth;
    FirebaseDatabase firebaseDatabase;

    TextView uName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_profile);




        auth = FirebaseAuth.getInstance();
        user = auth.getCurrentUser();
        firebaseDatabase = FirebaseDatabase.getInstance();

        uName = findViewById(R.id.pName);



        reff = FirebaseDatabase.getInstance().getReference("Users").child(user.getUid());

        reff.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String username = dataSnapshot.child("username").getValue().toString();
                uName.setText(username);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });




    }

    public void goToAbout(View view) {
        Intent intent = new Intent(UserProfile.this, AboutActivity.class);
        startActivity(intent);
    }

    public void gototakeAPhoto(View view) {
        Intent intent = new Intent(UserProfile.this, CameraActivity.class);
        startActivity(intent);
    }

    public void goToUpload(View view) {
        Intent intent = new Intent(UserProfile.this, UploadPic.class);
        startActivity(intent);
    }

    public void gotoCatagory(View view) {
        Intent intent = new Intent(UserProfile.this, Catagory.class);
        startActivity(intent);
    }

    public void logOut(View view) {
        Intent intent = new Intent(UserProfile.this,SignInSelection.class);
        startActivity(intent);
    }
}
