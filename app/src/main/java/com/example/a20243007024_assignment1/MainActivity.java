package com.example.a20243007024_assignment1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

/**
 * Main entry activity of the CampusLife app.
 * Displays welcome banner and 4 navigation buttons for different sections.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Launches DetailActivity with index 0 for Facilities section.
     * @param view the clicked button view
     */
    public void onFacilitiesClick(View view) {
        Intent intent = new Intent(this, DetailActivity.class);
        intent.putExtra("item_index", 0);
        startActivity(intent);
    }

    /**
     * Launches DetailActivity with index 1 for Events section.
     * @param view the clicked button view
     */
    public void onEventsClick(View view) {
        Intent intent = new Intent(this, DetailActivity.class);
        intent.putExtra("item_index", 1);
        startActivity(intent);
    }

    /**
     * Launches DetailActivity with index 2 for Clubs section.
     * @param view the clicked button view
     */
    public void onClubsClick(View view) {
        Intent intent = new Intent(this, DetailActivity.class);
        intent.putExtra("item_index", 2);
        startActivity(intent);
    }

    /**
     * Launches DetailActivity with index 3 for Support section.
     * @param view the clicked button view
     */
    public void onSupportClick(View view) {
        Intent intent = new Intent(this, DetailActivity.class);
        intent.putExtra("item_index", 3);
        startActivity(intent);
    }
}
