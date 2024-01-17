package com.example.vizags10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class HotelsActivity extends AppCompatActivity {
    public ArrayList<Content> words= new ArrayList<Content>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotels);

        //final ArrayList<Content> words= new ArrayList<Content>();
        words.add(new Content("Novotel",R.drawable.novotel));
        words.add(new Content("The Gateway Hotel",R.drawable.gatewayhotel));
        words.add(new Content("Four Points",R.drawable.fourpoints));
        words.add(new Content("Fairfield by Marriott",R.drawable.fairfield));
        words.add(new Content("Hotel Daspalla",R.drawable.daspalla));
        words.add(new Content("WelcomHotel Grand Bay",R.drawable.grandbay));
        words.add(new Content("The Park",R.drawable.thepark));
        words.add(new Content("Dolphin Hotel",R.drawable.dolphinhotel));
        words.add(new Content("Green Park",R.drawable.greenpark));
        words.add(new Content("Hotel Meghalaya",R.drawable.meghalaya));

        ContentAdapter adapter = new ContentAdapter(this, words , R.color.hotels_category);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Content inf = words.get(position);
                //Toast.makeText(this,words.get(0).getName(),Toast.LENGTH_LONG).show();
                Intent intent = new Intent(HotelsActivity.this,InfoHotelsActivity.class);
                intent.putExtra("pos",""+id);
                startActivity(intent);
            }
        });

    }

}