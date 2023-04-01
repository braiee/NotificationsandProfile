package com.example.products;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton notifbutton = findViewById(R.id.notif);
        setOnClick(notifbutton, View.VISIBLE);

        ImageButton hidebutton = findViewById(R.id.hideButton);
        setOnClick(hidebutton, View.INVISIBLE);

        button = (Button) findViewById(R.id.profile);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               profile();
            }
        });


    }

    public void profile (){
        Intent intent = new Intent(this, ProfilePage.class);
        startActivity(intent);
    }

    private void setOnClick(ImageButton imageButton,  int visibility) {
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView textView = findViewById(R.id.noti_change);
                textView.setVisibility(visibility);
                ImageView imageView = findViewById(R.id.notifbackground);
                imageView.setVisibility(visibility);
                ImageButton hidebutton = findViewById(R.id.hideButton);
                hidebutton.setVisibility(visibility);

            }
        });

    }
        }


