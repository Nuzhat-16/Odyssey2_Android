package com.example.odyssey;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private ImageView backArrow;
    private TextView notificationsTitle;
    private TextView today;
    private TextView markAllAsRead;
    private TextView notificationMessage1;
    private TextView notificationMessage2;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        backArrow = findViewById(R.id.back_arrow);
        notificationsTitle = findViewById(R.id.notificationsTitle);
        today = findViewById(R.id.today);
        markAllAsRead = findViewById(R.id.mark_all_as_read);
        notificationMessage1 = findViewById(R.id.notification_message_1);
        notificationMessage2 = findViewById(R.id.notification_message_2);

        backArrow.setOnClickListener(v -> onBackPressed());
        markAllAsRead.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle mark all as read click
                Toast.makeText(MainActivity.this, "All notifications marked as read", Toast.LENGTH_SHORT).show();
            }
        });


        notificationMessage1.setText("Imran Hasan accept your booking request");
        notificationMessage2.setText("Inara Chowdhury reject your booking request");
    }
}
