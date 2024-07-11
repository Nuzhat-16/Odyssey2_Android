package com.example.odyssey;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class PaymentDetailsActivity extends AppCompatActivity {

    private TextView title;
    private TextView returnDateTime;
    private TextView totalDistance;
    private TextView amount;
    private TextView acAmount;
    private TextView distance;
    private TextView distanceAmount;
    private TextView total;
    private TextView advanceAmount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView
                (R.layout.activity_main);

        ImageView backArrow = findViewById(R.id.back_arrow);
        title = findViewById(R.id.title);
        TextView pickupDateTime = findViewById(R.id.pickup_date_time);
        returnDateTime = findViewById(R.id.return_date_time);
        TextView totalDuration = findViewById(R.id.total_duration);
        totalDistance = findViewById(R.id.total_distance);
        TextView numberOfPassenger = findViewById(R.id.number_of_passenger);
        TextView features = findViewById(R.id.features);
        amount = findViewById(R.id.amount);
        TextView ac = findViewById(R.id.ac);
        acAmount = findViewById(R.id.ac_amount);
        distance = findViewById(R.id.distance);
        distanceAmount = findViewById(R.id.distance_amount);
        total = findViewById(R.id.total);
        TextView totalAmount = findViewById(R.id.total_amount);
        advanceAmount = findViewById(R.id.advance_amount);
        TextView advanceAmountValue = findViewById(R.id.advance_amount_value);
        Button sendRequestButton = findViewById(R.id.send_request_button);


        title.setText("Payment Details - Advance");
        pickupDateTime.setText("Pickup Date and Time: 18 Sept, 2024");
        returnDateTime.setText("Return Date and Time: 18 Sept, 2024");
        totalDuration.setText("Total Duration: 5 Hour");
        totalDistance.setText("Total Distance: 30 Km");
        numberOfPassenger.setText("Number of Passenger: 5");
        ac.setText("AC");
        acAmount.setText("20*5=100 ৳");
        distance.setText("Distance");
        distanceAmount.setText("100*30=3000 ৳");
        total.setText("Total");
        totalAmount.setText("3100 ৳");
        advanceAmount.setText("Advance Amount");
        advanceAmountValue.setText("3100*50%=1600 ৳");

        backArrow.setOnClickListener(v -> onBackPressed());

        sendRequestButton.setOnClickListener(v -> {

            Toast.makeText(PaymentDetailsActivity.this, "Request Sent", Toast.LENGTH_SHORT).show();

        });
    }
}

