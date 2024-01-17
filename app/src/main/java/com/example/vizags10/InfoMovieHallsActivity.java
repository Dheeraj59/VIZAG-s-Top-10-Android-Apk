package com.example.vizags10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class InfoMovieHallsActivity extends MovieHallsActivity {
    public String title;
    public String description;
    public String location;
    public String url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_movie_halls);

        Intent open = getIntent();
        int x = Integer.valueOf(open.getStringExtra("pos"));
        Toast.makeText(this, words.get(x).getName(), Toast.LENGTH_SHORT).show();
        ImageView image = (ImageView) findViewById(R.id.imgm);
        Button btn = (Button) findViewById(R.id.locm);


        switch (x) {
            case 0:
                title = "Melody Theatre";
                description = "Melody Theater - Jagdamba Junction is a popular theatre located at Suryabagh, Near Chermas Shopping Mall, Jagdamba Junction, East, Vizag. Melody Theater - Jagdamba Junction has 1 screen. ";
                url = "https://in.bookmyshow.com/vizag-visakhapatnam/cinemas/sri-melody-4k-dolby-atmos-vizag/MELD";
                location = "geo:17.7114,83.3005";
                break;
            case 1:
                title = "Jagadamba Cinema Hall";
                description = "Jagadamba Cinemas - Jagdamba Junction is a popular theatre located at Daba Gardens, Chitralaya Road, Opposite Alpha Hotel, Jagdamba Junction, East, Vizag. Jagadamba Cinemas - Jagdamba Junction has 2 screens.";
                url = "https://in.bookmyshow.com/vizag-visakhapatnam/cinemas/jagadamba-4k-vizag/JGDM";
                location = "geo:17.7123,83.3020";
                break;
            case 2:
                title = "INOX (CMR Central)";
                description = "INOX - CMR Central Mall, Maddilappalem is a popular theatre located at CMR Central Mall, 9-1-47, 4th Floor, Ramatalkies Road, Near Canara Bank, Maddilapalem, East, Vizag. INOX - CMR Central Mall, Maddilappalem has 4 screens. Facilities available at INOX - CMR Central Mall, Maddilappalem are Parking Facility, Recliner Seats, Dolby Atmos and Food And Beverage.";
                url = "https://in.bookmyshow.com/vizag-visakhapatnam/cinemas/inox-cmr-central-maddilapalem/INCM";
                location = "geo:17.7341,83.3184";
                break;
            case 3:
                title = "Mukta A2 Cinemas(Vizag Central)";
                description = "Mukta A2 Cinemas - Jagdamba Junction is a popular theatre located at 4th Floor, Cental Building, Town Main Road, Near Super Bazaar, Jagdamba Junction, East, Vizag. Mukta A2 Cinemas - Jagdamba Junction has 3 screens. Facilities available at Mukta A2 Cinemas - Jagdamba Junction are Parking Facility, Dolby Atmos and Food And Beverage";
                url = "https://in.bookmyshow.com/buytickets/mukta-a2-cinemas-vizag-central-vizag/cinema-viza-MAVC-MT/";
                location = "geo:17.7088,83.3001";
                break;
            case 4:
                title = "Varun INOX";
                description = "INOX - Varun Beach Mall, Beach Road is a popular theatre located at Varun Beach Mall, 4th Floor, Rama Krishna Beach Road, Near Hotel Novotel, Beach Road, East, Vizag. INOX - Varun Beach Mall, Beach Road has 6 screens. Facilities available at INOX - Varun Beach Mall, Beach Road are Parking Facility, Dolby Atmos and Food And Beverage.";
                url = "https://in.bookmyshow.com/vizag-visakhapatnam/cinemas/inox-varun-beach-beach-road/INVB";
                location = "geo:17.7108,83.3158";
                break;
            case 5:
                title = "Sangam sarat";
                description ="Sangam Cinema Hall - Dwaraka Nagar is a popular theatre located at Railway Station Road, Opposite Vizag Steel Plant, Dwaraka Nagar, East, Vizag. Sangam Cinema Hall - Dwaraka Nagar has 2 screens. Movies now showing at Sangam Cinema Hal";
                url = "https://in.bookmyshow.com/vizag-visakhapatnam/cinemas/sarat-theater-4k-dolby-atmos-vizag/STTR";
                location = "geo:17.7254,83.3024";
                break;
            case 6:
                title = "INOX (Chitralaya)";
                description = "INOX - Chitralaya Mall, Jagdamba Junction is a popular theatre located at Chitralaya Mall, 4th Floor, Suryabagh, Opposite Alpha Hotel, Jagdamba Junction, East, Vizag. INOX - Chitralaya Mall, Jagdamba Junction has 6 screens. Facilities available at INOX - Chitralaya Mall, Jagdamba Junction are Parking Facility, Recliner Seats, Dolby Atmos and Food And Beverage.";
                url = "https://in.bookmyshow.com/vizag-visakhapatnam/cinemas/inox-vizag-chitralaya-mall/INVC";
                location = "geo:17.7125,83.3013";
                break;
            case 7:
                title = "STBL Cine World";
                description = "STBL Cine World - Gajuwaka is a popular theatre located at Vizag - Srikakulam Highway, Sheela Nagar, Near Yamaha Showroom, Gajuwaka, West, Vizag. STBL Cine World - Gajuwaka has 3 screens";
                url = "https://in.bookmyshow.com/vizag-visakhapatnam/cinemas/stbl-cine-world-sheelanagar-vizag/JTBL";
                location = "geo:17.7234,83.2031";
                break;
        }
        image.setImageResource(words.get(x).getImageResourceId());

        TextView tit = (TextView) findViewById(R.id.titlem);
        tit.setText(title);

        TextView info = (TextView) findViewById(R.id.infom);
        info.setText(description);

        TextView link = findViewById(R.id.urlm);
        link.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent webIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(webIntent);
            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the places category is clicked on.
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW , Uri.parse(location));
                startActivity(intent);
            }
        });
    }
}