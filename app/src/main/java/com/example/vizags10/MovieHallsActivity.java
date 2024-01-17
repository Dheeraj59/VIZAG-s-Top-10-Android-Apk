package com.example.vizags10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MovieHallsActivity extends AppCompatActivity {
    public ArrayList<Content> words= new ArrayList<Content>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_halls);

        //final ArrayList<Content> words= new ArrayList<Content>();
        words.add(new Content("Melody Theatre",R.drawable.melodytheatre));
        words.add(new Content("Jagadamba Cinema Hall",R.drawable.jagadambatheatre));
        words.add(new Content("INOX (CMR Central)",R.drawable.cmrcentral));
        words.add(new Content("Mukta A2 Cinemas(Vizag Central)",R.drawable.visakhapatnamcentral));
        words.add(new Content("Varun INOX",R.drawable.varuninox));
        words.add(new Content("Sangam sarat",R.drawable.sangamsarattheatre));
        words.add(new Content("INOX (Chitralaya)",R.drawable.chitralaya));
        words.add(new Content("STBL Cine World",R.drawable.stbl));

        ContentAdapter adapter = new ContentAdapter(this, words , R.color.movie_halls_category);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Content inf = words.get(position);
                //Toast.makeText(this,words.get(0).getName(),Toast.LENGTH_LONG).show();
                Intent intent = new Intent(MovieHallsActivity.this,InfoMovieHallsActivity.class);
                intent.putExtra("pos",""+id);
                startActivity(intent);
            }
        });

    }
}