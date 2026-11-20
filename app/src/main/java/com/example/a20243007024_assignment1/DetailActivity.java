package com.example.a20243007024_assignment1;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

/**
 * Detail screen that displays content for the selected section.
 * All data is loaded from arrays.xml using array index mapping.
 * No if/switch statements are used per assignment requirements.
 */
public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        // Retrieve section index passed from MainActivity
        int sectionIndex = getIntent().getIntExtra("item_index", 0);

        // Load data arrays from the resource file
        String[] sectionTitles = getResources().getStringArray(R.array.string_array_images);
        String[] sectionContents = getResources().getStringArray(R.array.string_array_titles);
        String[] sectionImageNames = getResources().getStringArray(R.array.string_array_content);

        // Get references to all UI elements
        TextView titleView = findViewById(R.id.tv_detail_title);
        ImageView imageView = findViewById(R.id.iv_detail_image);
        TextView contentView = findViewById(R.id.tv_detail_content);

        // Populate UI directly by array index (no conditional logic)
        titleView.setText(sectionTitles[sectionIndex]);
        contentView.setText(sectionContents[sectionIndex]);

        // Resolve drawable resource ID from image name string
        int imageResId = getResources().getIdentifier(
                sectionImageNames[sectionIndex],
                "drawable",
                getPackageName()
        );
        imageView.setImageResource(imageResId);
    }
}
