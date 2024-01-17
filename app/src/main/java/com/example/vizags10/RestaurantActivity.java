package com.example.vizags10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class RestaurantActivity extends AppCompatActivity {
    public ArrayList<Content> words= new ArrayList<Content>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant);

        //ArrayList<Content> words= new ArrayList<Content>();
        words.add(new Content("Alpha Hotel",R.drawable.alphahotel));
        words.add(new Content("New Dhaba City Punjab",R.drawable.punjabidhaba));
        words.add(new Content("Barbeque Nation",R.drawable.bbqnation));
        words.add(new Content("Absolute Barbeques",R.drawable.absbbq));
        words.add(new Content("Kamat",R.drawable.kamat));
        words.add(new Content("CMR Central",R.drawable.cmrcentral));
        words.add(new Content("Tycoon",R.drawable.tycoon));
        words.add(new Content("Tandoori Inn",R.drawable.tandooriinn));
        words.add(new Content("Sai Ram Parlour",R.drawable.sairamparlour));

        ContentAdapter adapter = new ContentAdapter(this, words , R.color.restaurants_category);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Content inf = words.get(position);
                //Toast.makeText(this,words.get(0).getName(),Toast.LENGTH_LONG).show();
                Intent intent = new Intent(RestaurantActivity.this,InfoRestaurantActivity.class);
                intent.putExtra("pos",""+id);
                startActivity(intent);
            }
        });

    }
}