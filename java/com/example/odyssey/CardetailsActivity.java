package com.example.odyssey;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class CardetailsActivity extends AppCompatActivity {

    private TextView title;
    private ImageView carImage;
    private ImageView thumbnail1, thumbnail2, thumbnail3, thumbnail4;
    private TextView carName;
    private TextView carRating;
    private ImageView ratingStar;
    private Button aboutButton;
    private Button reviewButton;
    private Button sendRequestButton;
    private LinearLayout reviewSection;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        ImageView backArrow = findViewById(R.id.back_arrow);
        title = findViewById(R.id.title);
        carImage = findViewById(R.id.carImage);
        thumbnail1 = findViewById(R.id.thumbnails).findViewById(R.id.image1);
        thumbnail2 = findViewById(R.id.thumbnails).findViewById(R.id.image2);
        thumbnail3 = findViewById(R.id.thumbnails).findViewById(R.id.image3);
        thumbnail4 = findViewById(R.id.thumbnails).findViewById(R.id.image4);
        carName = findViewById(R.id.carName);
        carRating = findViewById(R.id.carRating);
        ratingStar = findViewById(R.id.ratingStar);
        aboutButton = findViewById(R.id.aboutButton);
        reviewButton = findViewById(R.id.reviewButton);
        sendRequestButton = findViewById(R.id.send_request_button);
        reviewSection = findViewById(R.id.reviewSection);


        backArrow.setOnClickListener(v -> onBackPressed());

        aboutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(CardetailsActivity.this, "About Button Clicked", Toast.LENGTH_SHORT).show();
            }
        });

        reviewButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle review button click
                Toast.makeText(CardetailsActivity.this, "Review Button Clicked", Toast.LENGTH_SHORT).show();
            }
        });

        sendRequestButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(CardetailsActivity.this, "Booking Request Sent", Toast.LENGTH_SHORT).show();
            }
        });
    }
}

