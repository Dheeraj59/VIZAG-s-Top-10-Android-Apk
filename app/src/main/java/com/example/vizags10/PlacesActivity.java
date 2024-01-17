package com.example.vizags10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class PlacesActivity extends AppCompatActivity {

    public ArrayList<Content> words= new ArrayList<Content>();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places);

      //  ArrayList<Content> words= new ArrayList<Content>();
        words.add(new Content("Borra Caves",R.drawable.borracaves)) ;
        words.add(new Content("Araku Valley",R.drawable.aruku));
        words.add(new Content("Lambasingi",R.drawable.lambasingi));
        words.add(new Content("Rushikonda Beach",R.drawable.rushikondabeach));
        words.add(new Content("INS Kurusura Submarine Museum",R.drawable.submarinevizag));
        words.add(new Content("TU 142 Air Craft Museum",R.drawable.aircraftvizag));
        words.add(new Content("Dolphin's Nose",R.drawable.dolphinnose));
        words.add(new Content("Kailasagiri",R.drawable.kailasagiri));
        words.add(new Content("Varaha Lakshmi Narasimha Temple(Simhachalam Temple)",R.drawable.simhachalam));
        words.add(new Content("Rama Krishna Beach",R.drawable.rkbeach));



        ContentAdapter adapter = new ContentAdapter(this, words , R.color.places_category);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Content inf = words.get(position);
                //Toast.makeText(this,words.get(0).getName(),Toast.LENGTH_LONG).show();
                Intent intent = new Intent(PlacesActivity.this,Info.class);
                intent.putExtra("pos",""+id);
                startActivity(intent);
            }
        });
    }
}