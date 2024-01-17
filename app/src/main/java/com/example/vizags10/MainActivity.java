package com.example.vizags10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the View that shows the places category
        TextView places = (TextView) findViewById(R.id.places);

        // Set a click listener on that View
        places.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the places category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link PlacesActivity}
                Intent placesIntent = new Intent(MainActivity.this, PlacesActivity.class);

                // Start the new activity
                startActivity(placesIntent);
            }
        });

        // Find the View that shows the shopping category
        TextView shopping = (TextView) findViewById(R.id.shopping);

        // Set a click listener on that View
        shopping.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the shopping category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link ShoppingActivity}
                Intent shoppingIntent = new Intent(MainActivity.this, ShoppingActivity.class);

                // Start the new activity
                startActivity(shoppingIntent);
            }
        });

        // Find the View that shows the restaurant category
        TextView restaurant = (TextView) findViewById(R.id.restaurant);

        // Set a click listener on that View
        restaurant.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the restaurant category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link RestaurantActivity}
                Intent restaurantIntent = new Intent(MainActivity.this, RestaurantActivity.class);

                // Start the new activity
                startActivity(restaurantIntent);
            }
        });

        // Find the View that shows the movieHalls category
        TextView movieHalls = (TextView) findViewById(R.id.movieHalls);

        // Set a click listener on that View
        movieHalls.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the movie_halls category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link MovieHallsActivity}
                Intent movieHallIntent = new Intent(MainActivity.this, MovieHallsActivity.class);

                // Start the new activity
                startActivity(movieHallIntent);
            }
        });

        // Find the View that shows the movieHalls category
        TextView hotels = (TextView) findViewById(R.id.hotels);

        // Set a click listener on that View
        hotels.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the movie_halls category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link MovieHallsActivity}
                Intent hotelIntent = new Intent(MainActivity.this, HotelsActivity.class);

                // Start the new activity
                startActivity(hotelIntent);
            }
        });
    }
}