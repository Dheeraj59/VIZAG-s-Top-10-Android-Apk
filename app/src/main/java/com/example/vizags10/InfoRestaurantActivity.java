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

public class InfoRestaurantActivity extends RestaurantActivity {
    public String title;
    public String descriptionr;
    public String location;
    public String url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_restaurant);

        Intent open = getIntent();
        int x = Integer.valueOf(open.getStringExtra("pos"));
        Toast.makeText(this, words.get(x).getName(), Toast.LENGTH_SHORT).show();
        ImageView image = (ImageView) findViewById(R.id.imgr);
        Button btn = (Button) findViewById(R.id.locr);

        switch (x) {
            case 0:
                title = "Alpha Hotel";
                descriptionr = "Popular Dishes\n" +
                        "Chicken Masala Curry, Ginger Chicken, Chicken Biriyani, Dum Biryani\n" +
                        "People Say This Place Is Known For\n" +
                        "Nice Crowd, Portion Size, Good Quantity, Prompt Service, Table, Excellent Service\n" +
                        "ADDRESS : 28-10-33/6, Jagdamba Commercial Complex, Chitralaya Cinema Hall, Jagadamba Junction, Vizag\n" +
                        "CALL : +918912797533";
                url = "https://www.zomato.com/visakhapatnam/alpha-hotel-jagadamba-junction-vizag";
                location = "geo:17.7122,83.3018";
                break;
            case 1:
                title = "New Dhaba City Punjab";
                descriptionr = "Making way for a hearty meal is Dhaba City Punjab in Visakhapatnam. This place is synonymous with delicious food that can satiate all food cravings. It is home to some of the most appreciated cuisines. Courtesy to this strategic location, foodies in and around the neighborhood can walk in to this eating house conveniently without facing any hassles related to commuting to this part of the city. It is one of the most sought after Restaurants in Nad Kotha Road. For people in other parts, the restaurant also has branches at other locations which include Poorna Market and can also be visited for an appetizing meal. This is a one of the renowned Restaurants in Visakhapatnam.\n" +
                        "Dhaba City Punjab at Nad Kotha Road makes sure one has a great food experience by offering highly palatable food.\n" +
                        "ADDRESS: Vizag - Srikakulam Hwy, Near Airport, Sakethapuram, Kakani Nagar, Visakhapatnam, Andhra Pradesh 530009\n" +
                        "CALL : +9177993 34695";
                url = "https://www.swiggy.com/restaurants/new-dhaba-city-punjab-gajuwaka-vizag-187587";
                location = "geo:18.2807,83.0397";
                break;
            case 2:
                title = "Barbeque Nation";
                descriptionr = "Established in the year 1991, Barbeque Nations in Panduranga Puram, Visakhapatnam is a top player in the category North Indian Restaurants in the Visakhapatnam. This well-known establishment acts as a one-stop destination servicing customers both local and from other parts of Visakhapatnam. Over the course of its journey, this business has established a firm foothold in it’s industry. The belief that customer satisfaction is as important as their products and services, have helped this establishment garner a vast base of customers, which continues to grow by the day. This business employs individuals that are dedicated towards their respective roles and put in a lot of effort to achieve the common vision and larger goals of the company. In the near future, this business aims to expand its line of products and services and cater to a larger client base. In Visakhapatnam, this establishment occupies a prominent location in Panduranga Puram. It is an effortless task in commuting to this establishment as there are various modes of transport readily available. It is at Harbour Park Road, Near Harbour Park, which makes it easy for first-time visitors in locating this establishment. It is known to provide top service in the following categories: Restaurants, Fine Dining Restaurants (Rs 1000 To Rs 2000), Barbeque Restaurants, Restaurants With Offers, North Indian Restaurants, Indian Restaurants, Fine Dining Barbeque Restaurants (Rs 1000 To Rs 2000), Mughlai Restaurants\n" +
                        "ADDRESS : 1st Floor, ATR Towers, East Wing, Harbour Park Road, Panduranga Puram, Visakhapatnam - 530003, Near Harbour Park\n" +
                        "CALL : +919711726060";
                url = "https://www.barbequenation.com/";
                location = "geo:18.2807,83.0397";
                break;
            case 3:
                title = "Absolute Barbeques";
                descriptionr = "A unique 'do-it-yourself' dining experience where diners grill on the Table, their choice of Meat, Seafood and Vegetables starters served on skewers to their preference. A central live grill \"Wish Grill\" dishing out exotic varieties of veggies and game birds take the experience of dining to a while new level.\n" +
                        "ADDRESS : FOURTH FLOOR, Plot No. 244A UMA VINAYAGAR, Dwaraka Nagar, Visakhapatnam, Andhra Pradesh 530016\n" +
                        "CALL : +917337336719";
                url = "https://www.absolutebarbecues.com/";
                location = "geo:18.2807,83.0397";
                break;
            case 4:
                title = "Kamat";
                descriptionr = "Popular Dishes\n" +
                        "Tandoori Pomfret, Chicken Majestic, Starter, Biryani\n" +
                        "People Say This Place Is Known For\n" +
                        "Rooftop Ambience, Good View, Quality of Food, Great Value, Comfortable Seating Area, Beach View\n" +
                        "ADDRESS : 4-72-10/10, Roof Top Restaurant, Beach Road, Lawsons bay Colony, Visakhapatnam\n" +
                        "CALL : +916301126653";
                url = "https://www.zomato.com/visakhapatnam/kamat-restaurant-lawsons-bay-vizag";
                location = "geo:18.2807,83.0397";
                break;
            case 5:
                title = "CMR Central";
                descriptionr = " The entire 4th Floor is their Food Court area. \n" +
                        "Food Court has local food chains along with popular fast food outlets such as KFC, Mc Donalds, Pizza Hut, Dominos etc. \n" +
                        "There are tiny food counters that serve ice cream, pop corn, coffee on the ground floor which is yummy. Do try them out. ";
                url = "https://www.zomato.com/visakhapatnam/restaurants/in/cmr-central-mall-maddilapalem";
                location = "geo:18.2807,83.0397";
                break;
            case 6:
                title = "Tycoon";
                descriptionr = "Popular Dishes\n" +
                        "Malai Kofta, Chicken 65, Egg Fried Rice, Thali, Fish, Soup\n" +
                        "People Say This Place Is Known For\n" +
                        "Worth the Price, Great Service, Main Course, Hospitality, Food Quality, Good Place\n" +
                        "ADDRESS : Door 28-2-48, Daspalla Complex, Suryabagh, Asilmetta, Vizag\n" +
                        "CALL : +918912540202";
                url = "https://www.zomato.com/visakhapatnam/tycoon-multicuisine-restaurant-asilmetta-vizag";
                location = "geo:18.2807,83.0397";
                break;
            case 7:
                title = "Tandoori Inn";
                descriptionr = "Popular Dishes\n" +
                        "North Indian, Chinese ,Biryani\n" +
                        "People Say This Place Is Known For\n" +
                        "Good Place, Prices, Ambience, Spicy, Good Food, Staff\n" +
                        "ADDRESS : Shop No - 6 &amp; 7, Diamond Park, Dwaraka Nagar, Visakhapatnam.\n" +
                        "CALL : +919346212111";
                location = "geo:18.2807,83.0397";
                break;
            case 8:
                title = "Sai Ram Parlour";
                descriptionr = "Popular Dishes\n" +
                        "Pesarattu Upma, Mla Dosa, Sambhar, Chutneys, Idli, Thali\n" +
                        "People Say This Place Is Known For\n" +
                        "Packed on Weekends, Ample Seating Area, Breakfast, Awesome Place, Perfect Place, Quality Food\n" +
                        "ADDRESS : 47-11-9, Vamsi Complex, near Diamond Park, Dwaraka Nagar, Visakhapatnam.\n" +
                        "CALL : +918106798484";
                url = "https://www.zomato.com/visakhapatnam/sri-sairam-parlour-dwaraka-nagar-vizag";
                location = "geo:18.2807,83.0397";
                break;
        }
        image.setImageResource(words.get(x).getImageResourceId());

        TextView tit = (TextView) findViewById(R.id.titler);
        tit.setText(title);

        TextView info = (TextView) findViewById(R.id.infor);
        info.setText(descriptionr);

        TextView link = findViewById(R.id.urlr);
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