package com.example.vizags10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class ShoppingActivity extends AppCompatActivity {
    public ArrayList<Content> words= new ArrayList<Content>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping);

        //ArrayList<Content> words= new ArrayList<Content>();
        words.add(new Content("CMR Central",R.drawable.cmrcentral));
        words.add(new Content("Vizag Central",R.drawable.visakhapatnamcentral));
        words.add(new Content("Shoppers Stop",R.drawable.shoppersstop));
        words.add(new Content("Chitralaya Mall",R.drawable.chitralaya));
        words.add(new Content("Lifestyle",R.drawable.lifestyle));
        words.add(new Content("South India Mall",R.drawable.southindiamall));
        words.add(new Content("RK Family Store",R.drawable.rkfamilystore));
        words.add(new Content("Spencers",R.drawable.spencer));
        words.add(new Content("D Mart",R.drawable.dmart));

        ContentAdapter adapter = new ContentAdapter(this, words , R.color.shopping_category);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Content inf = words.get(position);
                //Toast.makeText(this,words.get(0).getName(),Toast.LENGTH_LONG).show();
                Intent intent = new Intent(ShoppingActivity.this,InfoShoppingActivity.class);
                intent.putExtra("pos",""+id);
                startActivity(intent);
            }
        });
    }
}