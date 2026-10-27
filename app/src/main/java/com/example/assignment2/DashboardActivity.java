package com.example.assignment2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class DashboardActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        int[] cardIds = {R.id.card1, R.id.card2, R.id.card3, R.id.card4, R.id.card5, R.id.card6};
        int[] names = {R.string.m_courses, R.string.m_schedule, R.string.m_grades,
                R.string.m_messages, R.string.m_library, R.string.m_settings};

        for (int i = 0; i < cardIds.length; i++) {
            final int n = names[i];
            View card = findViewById(cardIds[i]);
            card.setOnClickListener(v ->
                    Toast.makeText(this, getString(n) + " clicked", Toast.LENGTH_SHORT).show());
        }

        findViewById(R.id.btnProfile).setOnClickListener(v ->
                startActivity(new Intent(this, ProfileActivity.class)));
    }
}