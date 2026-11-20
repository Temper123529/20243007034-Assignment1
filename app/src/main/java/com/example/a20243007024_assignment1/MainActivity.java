package com.example.a20243007024_assignment1;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

/**
 * Main entry activity of the CampusLife app.
 * Displays welcome banner and 4 navigation buttons for different sections.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Load main layout file
        setContentView(R.layout.activity_main);
    }

    /**
     * Click handler for Facilities button.
     * Shows a short toast message as feedback.
     * @param view the clicked button view
     */
    public void onFacilitiesClick(View view) {
        Toast.makeText(this, "Facilities clicked", Toast.LENGTH_SHORT).show();
    }

    /**
     * Click handler for Events button.
     * Shows a short toast message as feedback.
     * @param view the clicked button view
     */
    public void onEventsClick(View view) {
        Toast.makeText(this, "Events clicked", Toast.LENGTH_SHORT).show();
    }

    /**
     * Click handler for Clubs button.
     * Shows a short toast message as feedback.
     * @param view the clicked button view
     */
    public void onClubsClick(View view) {
        Toast.makeText(this, "Clubs clicked", Toast.LENGTH_SHORT).show();
    }

    /**
     * Click handler for Support button.
     * Shows a short toast message as feedback.
     * @param view the clicked button view
     */
    public void onSupportClick(View view) {
        Toast.makeText(this, "Support clicked", Toast.LENGTH_SHORT).show();
    }
}
