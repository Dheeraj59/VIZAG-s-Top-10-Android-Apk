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

public class InfoHotelsActivity extends HotelsActivity {
    public String title;
    public String description;
    public String location;
    public String url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_hotels);

        Intent open = getIntent();
        int x = Integer.valueOf(open.getStringExtra("pos"));
        Toast.makeText(this, words.get(x).getName(), Toast.LENGTH_SHORT).show();
        ImageView image = (ImageView) findViewById(R.id.imgh);
        Button btn = (Button) findViewById(R.id.loch);

        switch (x) {
            case 0:
                title = "Novotel";
                description = "Novotel Visakhapatnam Varun Beach Hotel\n" +
                        "Hotel that makes every moment matter\n" +
                        "\n" +
                        "Spoil yourself in 5-star seafront luxury at Novotel Visakhapatnam Varun Beach hotel. Spare contemporary design makes your room a calm haven, and picture windows offer you dazzling Bay of Bengal views. Rise and shine with a dip in the infinity pool and breakfast with an ocean backdrop at the lavish Indian and Western buffet at Novotel.\n" +
                        "\n" +
                        "The hotel shares a close proximity with the city railway station, Rushikonda Beach, Vizag Port and major hospitals. The popular Submarine Museum is just a walk away. The hotel's city centre location makes it approachable from industrial and business hubs. Novotel Vizag forms part of a complex consisting of an INOX multiplex, night club and mall. Novotel Visakhapatnam Varun Beach is among the only hotels in Visakhapatnam near a beach. The hotel offers calming views of the sea from every nook and corner.\n" +
                        "Hotel extras\n" +
                        "225 sea-facing modern rooms, largest convention center for weddings and MICE\n" +
                        "Poolside fine dining, rooftop lounge, bar & patisserie with a spectacular view of the sea\n" +
                        "Close to the RK & Varun Beach, Submarine Museum, famous TU 142 Aircraft Museum\n" +
                        "Rooftop jogging track, infinity pool with Jacuzzi, gym, children's play area, spa & salon\n" +
                        "30-min drive to airport, short distance away from tourist spots, nearby corporates";
                url = "https://all.accor.com/hotel/7535/index.en.shtml";
                location = "geo:17.7108,83.3162";
                break;
            case 1:
                title = "The Gateway Hotel";
                description = "The Gateway Hotel-Visakhapatnam has 95 Rooms including Deluxe Balcony Suites, offering panoramic view of the Bay of Bengal. Located 16kms from the Airport and 06 kms from Railway Station and 02 kms from city centre and shopping district.For Dining-GAD-The Coffee Shop offering Buffet Spread for Breakfast and Dinner and A la Carte for Lunch , Ming Garden-Chinese Specialty Restaurant opened for Lunch and Dinner and Lawson’s Lounge The BAR-opened from 1200hrs till 2300hrs.\n" +
                        "\n" +
                        "The Gateway Hotel Beach Road, Visakhapatnam is an ideal 5 star hotel in Visakhapatnam for both business travellers and leisure seekers. Close to the industrial hub, our luxury hotel in Visakhapatnam is also the perfect seaside retreat to unwind. Smart spacious rooms with modern amenities and panoramic views of the spectacular Bay of Bengal make The Gateway Hotel Visakhapatnam a sought-after business hotel in the city. ";
                url = "https://www.tajhotels.com/en-in/gateway/beach-road-visakhapatnam/";
                location = "geo:17.7113,83.3164";
                break;
            case 2:
                title = "Four Points";
                description = "Discover a combination of modern comfort and urban convenience at Four Points by Sheraton Visakhapatnam. Ideally situated near RK Beach in Vizag, India, our hotel places you moments from major corporate offices and local area attractions. After exploring your surroundings, go for a swim in the city's only ozonized pool, work out in our fully equipped, 24-hour fitness center or relax with a book in our Library. Enjoy delectable global cuisine during your Visakhapatnam visit in our hotel's all-day restaurant, or grab a cocktail and some light bites at Eatery & Best Brews bar, which also offers daily happy hours. If you're planning a meeting or social event in Vizag, we offer versatile, contemporary venues with ample natural lighting, free Wi-Fi and superb services. Look forward to experiencing a memorable stay in India at Four Points by Sheraton Visakhapatnam.\n" +
                        "\n" +
                        "Four Points by Sheraton – Marriott International Visakhapatnam is 25 minutes’ drive from Visakhapatnam Airport. Conveniently located in the city center with close proximity to the Ramakrishna beach, Business hub, and major shopping avenues. The hotel is located 600 meters from HSBC, 850 meters from WNS and less than 1 km from Concentrix. Located close to key business districts of Visakhapatnam such as Eastern Naval Command, Naval Dockyard & Hindustan Petroleum Corporation Limited. Four Points by Sheraton – Marriott Intl. Visakhapatnam is 5 mins drive from Ramakrishna Beach, 20 mins drive from Kailashgiri and 5 mins drive from Submarine Museum. The hotel is designed artistically with the lobby, open corridors, and unrestricted concept of height, light & space that gives a feeling of luxury. The hotel features a huge atrium lobby. It offers free parking, complimentary Wi-Fi, an ozonized outdoor pool and a separate kid’s pool, 24 hours fitness center with certified trainer & a 24 hours concierge service. The hotel offers the most spacious rooms in the city with the comfort of premium bedding, an armchair, and ample workspace. It comes with a tea & coffeemaker, Iron & Ironing board, Hairdryer, free daily newspapers, and luxury bath amenities. The hotel houses several meeting rooms, a business center, and a tour desk. The “Eatery” offers local and international cuisine while the “Best Brews” bar offers beverages and 24 hours in-room dining facility. The hotel is well known for its Culinary excellence, variety & exclusive dining options as the Poolside. Four Points Visakhapatnam prides itself on the elegance and uniqueness of a Four Points while assuring the quality and promise of Marriott Hotels.";
                url = "https://www.marriott.com/hotels/travel/vtzfp-four-points-visakhapatnam/";
                location = "geo:17.7209,83.3124";
                break;
            case 3:
                title = "Fairfield by Marriott";
                description = "Treat yourself to an exceptional stay at Fairfield by Marriott Visakhapatnam. Located in the heart of the city, our hotel is near NAD Junction, beautiful beaches, famous temples, numerous shops, and 3.8 Kms to the airport, 10 km from Ramakrishna Beach and 13 km from the Sri Varaha Lakshmi Narasimha Swamy hilltop Hindu temple, making it the perfect choice for every traveler. Recharge in upscale rooms and suites which feature allergy-friendly flooring, indulgent bedding, mini-refrigerators, complimentary Wi-Fi and floor-to-ceiling windows. Suites offer generous living rooms, marble bathrooms and grocery services, perfect for traveling families. Take advantage of our free Grab n' Go breakfast, complimentary parking and 24-hour fitness centre. Enjoy delicious international fare, including a popular buffet, at our sunlight-infused restaurant, or share appetizers and cocktails at our bar. If a business conference, wedding or social event brings you to our Visakhapatnam hotel, you'll be delighted with our versatile venues, our rooftop pool, and custom catering.";
                url = "https://www.marriott.com/hotels/travel/vtzfi-fairfield-visakhapatnam/";
                location = "geo:17.7480,83.2460";
                break;
            case 4:
                title = "Hotel Daspalla";
                description = "Daspalla Hotels Is A 4-Star Hotel Chain, With Magnanimous Hotels Providing Refined Service In Some Of The Major Cities Of Andhra Pradesh & Telangana Namely - Hyderabad, Visakhapatnam, Kakinada & Guntur. This Brilliant Structure Of Pure Leisure Comprises Of State-Of-Art Facilities, Polite And Amicable Staff As Well As Unmatched Hospitality. Sought After Highly By Both Corporate Workers As Well As Luxury Seekers, Our Chain Of Hotels Have Established Themselves As An Extraordinary Benchmark For Service And Style. The Hotel Has 125 Well-Furnished Rooms That Offer A Wide Array Of Accommodation Options. Room Categories Include Executive Club, Platinum Club, Deluxe And Suites. The Hotel Is Equipped With A Multi-Cuisine Cum Bar Serving Restaurant ‘Dimple’, A North India Restaurant ‘Vaisakhi’, A Non-Vegetarian Speciality Restaurant ‘Dakshin’ And An Exclusive Restaurant For South India Thalis & Snacks ‘Dharani’ .It Has Elegant Conferencing And Banqueting Space For All Kinds Of Events And Parties, A Well-Equipped Gymnasium With A Roof Top Pool Offers Breathtaking View Of The City, Our Hotels Adorned With Elegant Decor And Decked Their Indispensable Modern Amenities, Promising You A Comfortable Stay. The Hotel Is Ideal To Work And Wander Around The City Of Visakhapatnam.\n" +
                        "\n" +
                        "HIGHLIGHTS : \n" +
                        "Soak Your Feet At Ramakrishna Beach Or Pay A Visit To Ins Kursura Submarine Museum Is Just 4 Km Away From The Hotel\n" +
                        "Animal Lovers Can Visit The Indira Gandhi Zoological Park And Kailasagiri Park, Which Are About 9.4 Km Away From The Hotel\n" +
                        "The Hotel Shares A Close Proximity With Rushikonda Beach, Vizag Port And Major Hospitals. The Hotel's City Centre Location Makes It Approachable From Industrial And Business Hubs\n" +
                        "Situated In The Heart Of This Port City, Hotel Daspalla Is Just 13 Km From The Airport And 3 Km From The Railway Station Making It A Preferred Destination For Business And LeisureTransit Travelers For A Restful And Comfortable Stay In Vizag\n" +
                        "Daba Garden, Jagdamba (Shopping Area) – Within 1km Radius (Walk Able)\n" +
                        " Tourist Destinations: Araku Valley – 113 Km; Borra Caves – 90 Km\n" +
                        " Kambalakonda Wildlife Sanctuary – 25.8 Km\n" +
                        "The 11th-Century Simhachalam Temple – 19.5 Km\n" +
                        "Ancient Buddhist Sites Like Thotlakonda And Bavikonda – 19.7 Km\n" +
                        " Visakha Museum – 4.7 Km\n" +
                        " TU 142 Aircraft Museum – 4.1 Km\n" +
                        " Industries/Major Corporates Situated Near The Hotel: Wipro – 3.6 Km; Tech Mahindra – 3.6 Km; HSBC – 2.3 Km\n" +
                        "Steel Plant – 23 Km; Hpcl Refinery – 6.2 Km; Ship Building Center – 5.3 Km";
                url = "https://www.daspallahotels.com/visakhapatnam/";
                location = "geo:17.7106,83.3007";
                break;
            case 5:
                title = "WelcomHotel Grand Bay";
                description = "In a rare, quiet spot in Vishakhapatnam, 16 km away from the airport, this majestic 5 star hotel reaffirms the grandeur and ethos of hospitality. Visakhapatnam, “The city of destiny” encloses within itself beautiful beaches, vast blue sea, green-capped hills, breathtaking valleys, dense jungles , crystal clear cascades, million year old caves, an 11th century temple, ancient Buddhist sites, the first submarine museum in Asia, lush green park and wholesome climate coupled with industrial hub comprising a gigantic steel plant, a world class port and largest shipyard. With everything perfectly blended for leisure and business, Welcomhotel Grand Bay is one of the leading hotels in the city. Welcomhotel Grand Bay is perched on a hilltop, just 100 meters from the sea, offering a panaromic view of the Bay of Bengal and Vizag city in all its glory. Equipped with every facility and service for any discerning business traveler, WelcomHotel Grand Bay is the first choice for hotels in the city";
                url = "https://www.itchotels.com/in/en/welcomhoteldeveegrandbay-visakhapatnam?utm_source=google&utm_medium=cpc&utm_campaign=HQ%7CWH%7CWH_Devee_Grand_Bay%7CBrand%7CBMM&gclid=CjwKCAjwoNuGBhA8EiwAFxomA5NbVVhNo7sFTTaqCTnU3gsRs-0wHC2oxMw2-GPXJTXAd3iOeJfgeBoCKMUQAvD_BwE";
                location = "geo:17.7119,83.3154";
                break;
            case 6:
                title = "The Park";
                description = "The Park Visakhapatnam is an urban beach resort overlooking the Bay of Bengal. The surrounding scenic beauty is a treat to the senses and creates a very tranquil atmosphere ideal for unwinding after a hard day’s work. The resort has a private beach area and beautifully manicured gardens with tiled pavilions. One may be forgiven to think that this resort is primarily for the leisure tourist however this is not the case, in fact quite the opposite - majority of the hotel’s guests come on work-related activities. The hotel is conveniently located and offers swift access to the city’s local railway and airport facilities (15 and 30 mins away respectively by car). The dining experience that you get here offers an unparalleled experience enhanced by the backdrop of orange sunsets and the glittering calmness of the sea. Bamboo Bay in its refurbished avatar reflects the rich ethnic heritage of East Indian tribal culture in a uniquely chic way. While Vista offers a highly appetizing spread ranging from Pan-Indian to authentic Italian gourmet food.";
                url = "https://www.theparkhotels.com/visakhapatnam/";
                location = "geo:17.7214,83.3368";
                break;
            case 7:
                title = "Dolphin Hotel";
                description = "Welcome to Dolphin Hotel, your Visakhapatnam “home away from home.” Dolphin Hotel aims to make your visit as relaxing and enjoyable as possible, which is why so many guests continue to come back year after year.\n" +
                        "\n" +
                        "Given the close proximity of popular landmarks, such as Ross Hill Church (1.7 mi) and Andhra University (2.9 mi), guests of Dolphin Hotel can easily experience some of Visakhapatnam's most well known attractions.\n" +
                        "\n" +
                        "Guest rooms offer amenities such as a flat screen TV, a refrigerator, and a minibar, and guests can go online with free wifi offered by the hotel.\n" +
                        "\n" +
                        "Dolphin Hotel features a concierge, room service, and newspaper, to help make your stay more enjoyable. The property also boasts a pool and a rooftop bar. If you are driving to Dolphin Hotel, free parking is available.\n" +
                        "\n" +
                        "While in Visakhapatnam be sure to experience nearby Chinese restaurants such as Vista (The Park), Mekong-Pan Asian Restaurant, or The Residency Restaurant.\n" +
                        "\n" +
                        "If you’re looking for things to do, you can check out Vuda City Central Park (0.8 mi), Sri Kanaka Mahalakshmi Temple (0.9 mi), or Tyda Park (0.9 mi), which are popular attractions amongst tourists, and they are all within walking distance.\n" +
                        "\n" +
                        "Dolphin Hotel puts the best of Visakhapatnam at your fingertips, making your stay both relaxing and enjoyable.";
                url = "https://www.dolphinhotelsvizag.com/";
                location = "geo:17.7131,83.2975";
                break;
            case 8:
                title = "Green Park";
                description = "Green Park - Visakhapatnam is an excellent choice for travellers visiting Visakhapatnam, offering a trendy environment alongside many helpful amenities designed to enhance your stay.\n" +
                        "\n" +
                        "Green Park - Visakhapatnam offers guests an array of room amenities including a flat screen TV, air conditioning, and a minibar, and getting online is possible, as free wifi is available.\n" +
                        "\n" +
                        "The hotel offers 24 hour front desk, room service, and a concierge, to make your visit even more pleasant. The property also features an outdoor pool and breakfast. Guests arriving by vehicle have access to free parking.\n" +
                        "\n" +
                        "For those interested in checking out popular landmarks while visiting Visakhapatnam, Green Park - Visakhapatnam is located a short distance from Ross Hill Church (2.2 mi) and Andhra University (2.3 mi).\n" +
                        "\n" +
                        "While in Visakhapatnam be sure to experience nearby Italian restaurants such as Aqua (The Park), Flying Spaghetti Monster Restaurant, or Upland Bistro.\n" +
                        "\n" +
                        "If you’re looking for things to do, you can check out Vuda City Central Park (0.3 mi), Sri Kanaka Mahalakshmi Temple (1.2 mi), or Visakha Museum (1.1 mi), which are popular attractions amongst tourists, and they are all within walking distance.\n" +
                        "\n" +
                        "Enjoy your stay in Visakhapatnam!";
                url = "http://hotelgreenpark.com/greenpark/vizag/";
                location = "geo:17.7154,83.3062";
                break;
            case 9:
                title = "Hotel Meghalaya";
                description = "Meghalaya Hotel is an excellent choice for travellers visiting Visakhapatnam, offering many helpful amenities designed to enhance your stay.\n" +
                        "\n" +
                        "Free wifi is offered to guests, and rooms at Meghalaya Hotel offer air conditioning.\n" +
                        "\n" +
                        "During your stay, take advantage of some of the amenities offered, including 24 hour front desk and room service. Guests of Meghalaya Hotel are also welcome to enjoy free breakfast, located on site. For travellers arriving by car, free parking is available.\n" +
                        "\n" +
                        "Close to some of Visakhapatnam's most popular landmarks, such as Sri Kanaka Mahalakshmi Temple (1.7 mi) and Andhra University (1.9 mi), Meghalaya Hotel is a great destination for tourists.\n" +
                        "\n" +
                        "While in Visakhapatnam be sure to experience nearby Asian restaurants such as Barbeque Nation, Vista (The Park), or Sri Sairam Parlour.\n" +
                        "\n" +
                        "Best of all, Meghalaya Hotel makes it easy to experience some great Visakhapatnam attractions like Shilparamam - Jathara, which is a popular garden.\n" +
                        "\n" +
                        "Enjoy your stay in Visakhapatnam!";
                url = "http://hotelmeghalaya.com/";
                location = "geo:17.7235,83.3096";
                break;
        }
        image.setImageResource(words.get(x).getImageResourceId());

        TextView tit = (TextView) findViewById(R.id.titleh);
        tit.setText(title);

        TextView link = findViewById(R.id.urlh);
        link.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent webIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(webIntent);
            }
        });

        TextView info = (TextView) findViewById(R.id.infoh);
        info.setText(description);

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