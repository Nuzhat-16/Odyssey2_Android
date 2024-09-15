package com.example.odyssey;

import android.annotation.SuppressLint;
import android.app.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

    public class HomeActivity extends Activity {

    private ImageButton menuButton, notificationIcon, profileButton, historyButton, homeButton, settingsButton, productButton;
    private ImageView locationIcon, profileImage, searchIcon, filterIcon, carImage1, carImage2, starIcon1, starIcon2;
    private TextView odysseyTitle, locationText, browseBrandsTitle, seeMoreBrands, availableCarsTitle, seeMoreCars;
    private EditText searchInput;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);


        menuButton = findViewById(R.id.menuButton);
        notificationIcon = findViewById(R.id.notification_icon);
        odysseyTitle = findViewById(R.id.odysseyTitle);


        locationIcon = findViewById(R.id.ic_location);
        locationText = findViewById(R.id.location_text);
        profileImage = findViewById(R.id.profile_image);


        searchIcon = findViewById(R.id.search_icon);
        searchInput = findViewById(R.id.search_input);
        filterIcon = findViewById(R.id.filter_icon);


        browseBrandsTitle = findViewById(R.id.browse_brands_title);
        seeMoreBrands = findViewById(R.id.see_more_brands);


        availableCarsTitle = findViewById(R.id.available_cars_title);
        seeMoreCars = findViewById(R.id.see_more_cars);


        carImage1 = findViewById(R.id.carImage1);
        carImage2 = findViewById(R.id.carImage2);
        starIcon1 = findViewById(R.id.carRating1);
        starIcon2 = findViewById(R.id.carRating2);


        profileButton = findViewById(R.id.profileButton);
        historyButton = findViewById(R.id.historyButton);
        homeButton = findViewById(R.id.ic_home);
        settingsButton = findViewById(R.id.settingsButton);
        productButton = findViewById(R.id.productButton);


        menuButton.setOnClickListener(view -> Toast.makeText(HomeActivity.this, "Menu clicked", Toast.LENGTH_SHORT).show());
        notificationIcon.setOnClickListener(view -> Toast.makeText(HomeActivity.this, "Notifications clicked", Toast.LENGTH_SHORT).show());
        profileButton.setOnClickListener(view -> Toast.makeText(HomeActivity.this, "Profile clicked", Toast.LENGTH_SHORT).show());
        historyButton.setOnClickListener(view -> Toast.makeText(HomeActivity.this, "History clicked", Toast.LENGTH_SHORT).show());
        homeButton.setOnClickListener(view -> Toast.makeText(HomeActivity.this, "Home clicked", Toast.LENGTH_SHORT).show());
        settingsButton.setOnClickListener(view -> Toast.makeText(HomeActivity.this, "Settings clicked", Toast.LENGTH_SHORT).show());
        productButton.setOnClickListener(view -> Toast.makeText(HomeActivity.this, "Products clicked", Toast.LENGTH_SHORT).show());


        homeButton.setOnClickListener(v -> {

        });

        profileButton.setOnClickListener(v -> {

        });



        searchIcon.setOnClickListener(v -> {
            String query = searchInput.getText().toString();
            if (!query.isEmpty()) {

                Toast.makeText(HomeActivity.this, "Searching for: " + query, Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(HomeActivity.this, "Search query is empty", Toast.LENGTH_SHORT).show();
            }
        });

        filterIcon.setOnClickListener(v -> {

            Toast.makeText(HomeActivity.this, "Filter clicked", Toast.LENGTH_SHORT).show();
        });

        seeMoreBrands.setOnClickListener(v -> {

            Toast.makeText(HomeActivity.this, "See more brands", Toast.LENGTH_SHORT).show();
        });

        seeMoreCars.setOnClickListener(v -> {

            Toast.makeText(HomeActivity.this, "See more cars", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(HomeActivity.this, CardetailsActivity.class);
            startActivity(intent);
        });
    }
}

