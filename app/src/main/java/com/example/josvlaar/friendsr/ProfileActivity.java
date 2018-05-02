package com.example.josvlaar.friendsr;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ProfileActivity extends AppCompatActivity {

    Friend friend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        Intent intent = getIntent();
        friend = (Friend) intent.getSerializableExtra("friend");

        SharedPreferences prefs = getSharedPreferences("settings", MODE_PRIVATE);

        TextView name = findViewById(R.id.name);
        name.setText(friend.getName());

        TextView bio = findViewById(R.id.bio);
        bio.setText(friend.getBio());

        RatingBar ratingBar = findViewById(R.id.ratingBar);
        ratingBar.setRating(prefs.getFloat(friend.getName(), 0.0f));
        Log.d("DEBUG", "onCreate: Loaded rating from prefs!");
        Log.d("DEBUG", friend.getName());
        Log.d("DEBUG", prefs.getFloat(friend.getName(), 0.0f) + "");
        ratingBar.setOnRatingBarChangeListener(new OnRatingBarChangeListener());

        ImageView picture = findViewById(R.id.imageView);
        picture.setImageResource(friend.getDrawableId());
    }

    private class OnRatingBarChangeListener implements RatingBar.OnRatingBarChangeListener {
        @Override
        public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
            SharedPreferences.Editor editor = getSharedPreferences("settings", MODE_PRIVATE).edit();
            editor.putFloat(friend.getName(), rating);
            editor.apply();
            Log.d("DEBUG", "onRatingChanged: Saved rating!");
            Log.d("DEBUG", friend.getName());
            Log.d("DEBUG", rating + "");
        }
    }
}
