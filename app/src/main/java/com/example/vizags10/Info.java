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

public class Info extends PlacesActivity {
    public String title;
    public String description;
    public String location;
    public String url;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        Intent open = getIntent();
        int x = Integer.valueOf(open.getStringExtra("pos"));
        Toast.makeText(this, words.get(x).getName(), Toast.LENGTH_SHORT).show();
        ImageView image = (ImageView) findViewById(R.id.imgp);
        Button btn = (Button) findViewById(R.id.loc);

        switch (x) {
            case 0:
                title = "Borra Caves";
                description = "The Borra Caves, also called Borra Guhalu, are located on the East Coast of India, in the Ananthagiri hills of the Araku Valley (with hill ranges elevation varying from 800 to 1,300 m (2,600 to 4,300 ft)) of the Visakhapatnam district in Andhra Pradesh. The caves, one of the largest in the country, at an elevation of about 705 m (2,313 ft), distinctly exhibit a variety of speleothems ranging in size and irregularly shaped stalactites and stalagmites. The caves are basically karstic limestone structures extending to a depth of 80 m (260 ft), and are considered the deepest caves in India.";
                //  image.setImageResource(R.drawable.borracaves);
                url = "https://en.wikipedia.org/wiki/Borra_Caves";
                location = "geo:18.2807,83.0397";
                break;
            case 1:
                title = "Araku Valley";
                description = "Vizag is a popular tourist destination mainly known for its beaches. Located at a distance of 120 km from Vizag is a beautiful hill station called Araku which is as popular as the beaches of Vizag.\n" +
                        "\n" +
                        "Blessed with enchanting streams, lush green forests, beautiful waterfalls, sprawling coffee plantations, rich landscape and wonderful weather, Araku valley is no doubt a famous tourist destination attracting nature lovers, honeymoon couples, and adventure enthusiasts from all over the country.\n" +
                        "\n" +
                        "The journey to Araku valley by train is something that everyone should experience with tunnels, hill sides, streams, waterfalls making your journey truly mesmerising. The ride through the road is equally enchanting with sharp curves and beautiful sceneries along the way.\n" +
                        "\n" +
                        "Located at an altitude of 911 m above sea level, Araku is a must visit destination for tourists visiting Vizag. Araku valley is mainly inhabited by tribals and the Tribal museum is one of the main attractions here. It houses tribal handicrafts and several artifacts depicting the lifestyle of tribal people. The tribal dance known as Dhimsa dance with tribals dressed in colorful attire is a must see for visitors coming to Araku.\n" +
                        "\n" +
                        "Araku is also known for its coffee plantations and boasts of manufacturing India’s first tribal growers’ organic coffee brand. Another major attraction of Araku valley, Padmapuram Gardens is widely visited by the tourists coming to Araku. The hanging cottages are one of the top attractions of Padmapuram gardens. The garden has a wide variety of beautiful plants and flowers and the toy train ride around the garden is quite popular among the kids.\n" +
                        "\n" +
                        "Araku is also blessed with beautiful waterfalls like Sangda waterfalls and Dumbriguda waterfalls. Araku doesn’t disappoint adventure lovers either as it is a famous trekking spot attracting adventure seekers from all over the country.\n" +
                        "\n" +
                        "A place of immense scenic beauty, Araku valley is a must visit tourist destination for every nature lover. The picturesque view of the landscape, the enchanting waterfalls, the amazing tribal culture, and the lush green forests makes this scenic hill station a place worth visiting by each and everyone.";
                //   image.setImageResource(R.drawable.aruku);
                url = "https://vizagtourism.org.in/araku-valley-vizag";
                location = "geo:18.3273,82.8775";
                break;
            case 2:
                title = "Lambasingi";
                description = "Lambasingi (or Lammasingi) is a small village in the Eastern Ghats of Chintapalli Mandal of Visakhapatnam district in the Indian state of Andhra Pradesh. With an altitude that of 1000 m above sea level, the area is cooler than the surrounding plains and is covered in moist deciduous forest cover. There are several coffee, pine, and eucalyptus plantations around the area and some small attempts to grow apple and strawberry.\n" +
                        "\n" +
                        "The region was formerly densely covered in forests and known in the past to have supported tigers.[1] The large wildlife in the region includes gaur";
                url = "https://www.tourism-of-india.com/blog/places-to-visit-in-lambasingi/";
                location = "geo:17.8186,82.4922";
                break;
            case 3:
                title = "Rushikonda Beach";
                description = "The beach city of Andhra Pradesh, Visakhapatnam attracts huge number of tourists from all over the country looking to spend some relaxed moments amidst the pristine sandy beaches located here. Situated at around 8 km from the Vizag city is the beautiful Rushikonda beach, a popular beach of Vizag that attracts tourists as well as the locals here.\n" +
                        "\n" +
                        "Rushikonda beach is widely known for its golden sands and tidy waves of Bay of Bengal. Surrounded by green plants, Rushikonda beach looks picture perfect attracting nature lovers in huge numbers. With its vast stretch of waters, Rushikonda beach is the perfect place to enjoy water sports like swimming, water skiing and wind surfing.\n" +
                        "\n" +
                        "Known as one of the virgin beaches of South India, Rushikonda beach is no doubt one of the best beaches of Vizag. During the evening time, this beach is surrounded by nature lovers and adventure enthusiasts enjoying some beautiful moments amidst the scenic view of the beach with cool breeze caressing them.\n" +
                        "\n" +
                        "Tourists indulging in water sports in the clear waters of the beach is a regular sight here. Additionally, AP Tourism has built up cottages around the beach along with restaurants and other amenities making it an attractive tourist spot.";
                url = "https://vizagtourism.org.in/rushikonda-beach-vizag";
                location = "geo:17.7825,83.3851";
                break;
            case 4:
                title = "INS Kurusura Submarine Museum";
                description =  "INS Kursura (S20) was a Kalvari-class (variant of the Foxtrot-class) diesel-electric submarine of the Indian Navy. She was India's fourth submarine. Kursura was commissioned on 18 December 1969 and was decommissioned on 27 February 2001 after 31 years of service. She participated in the Indo-Pakistani War of 1971, where she played a key role in patrol missions. She later participated in naval exercises with other nations and made many goodwill visits to other countries.\n" +
                        "\n" +
                        "After decommissioning, It was dedicated to the Nation by the Chief minister N. Chandrababu Naidu on 9 August 2002[1][2] and was preserved as a museum for public access from 24 August 2002 making its final journey to Visakhapatnam on RK Beach. Kursura has the distinction of being one of the very few submarine museums to retain originality and has been called a \"must-visit destination\" of Visakhapatnam. Despite being a decommissioned submarine, she still receives the navy's \"Dressing Ship\" honour, which is usually awarded only to active ships.";
                url = "https://en.wikipedia.org/wiki/INS_Kursura_(S20)";
                location = "geo:17.7172,83.3301";
                break;
            case 5:
                title = "TU 142 Air Craft Museum";
                description = "The Tupolev Tu-142 (Russian: Туполев Ту-142; NATO reporting name: Bear F/J) is a Soviet/Russian maritime reconnaissance and anti-submarine warfare (ASW) aircraft derived from the Tu-95 turboprop strategic bomber. A specialised communications variant designated Tu-142MR was tasked with long-range communications duties with Soviet ballistic missile submarines. The Tu-142 was designed by the Tupolev design bureau, and manufactured by the Kuibyshev Aviation and Taganrog Machinery Plants from 1968 to 1994. Formerly operated by the Soviet Navy and Ukrainian Air Force, the Tu-142 currently serves with the Russian Navy.\n" +
                        "\n" +
                        "Developed in response to the American Polaris programme, the Tu-142 grew out of the need for a viable Soviet ASW platform. It succeeded the failed Tu-95PLO project, Tupolev's first attempt at modifying the Tu-95 for maritime use. The Tu-142 differed from the Tu-95 in having a stretched fuselage to accommodate specialised equipment for its ASW and surveillance roles, a reinforced undercarriage to support rough-field capability, improved avionics and weapons, and enhancements to general performance. The Tu-142's capability was incrementally improved while the type was in service, eventually resulting in the Tu-142MZ, the final long-range Tu-142 with highly sophisticated combat avionics and a large payload. Tupolev also converted a number of Tu-142s as avionics (Tu-142MP) and engine (Tu-142LL) testbeds.";
                url = "https://en.wikipedia.org/wiki/Tupolev_Tu-142";
                location = "geo:17.7180,83.3299";
                break;
            case 6:
                title = "Dolphin's Nose";
                description = "A hidden gem nestled in the southern part of the city, Dolphin’s Nose is one of the popular tourist places to visit in Visakhapatnam that treats your eyes with an enchanting view of the breathtaking landscapes, lush-greenery, harbour and the entire city from the top of the hill.\n" +
                        "\n" +
                        "Positioned at a height of 358 meters above the sea level, Dolphin’s Nose boasts of an amazing location with a cool and breezy atmosphere where you can relax, rejuvenate and soothe your senses with a view to die for.\n" +
                        "\n" +
                        "Owing to its scenic beauty, surreal setting and tranquil environment, this attraction has become a must-visit place for holiday makers of all ages. It is a paradise for nature lovers and is no less than a heaven for instagrammers.\n" +
                        "\n" +
                        "Do not forget to pay a visit to the Dolphin’s Nose Lighthouse, which is located above the Dolphin’s Nose hill. Else, you will miss regretting your trip after coming back home.";
                url = "https://vizagtourism.org.in/dolphin-s-nose-vizag";
                location = "geo:17.6765,83.2926";
                break;
            case 7:
                title = "Kailasagiri";
                description = "One place in Visakhapatnam which is as famous as the sprawling beaches here is the Kailasagiri Park situated on a hilltop. Kailasagiri is one of the prime attractions and a popular picnic spot for all the tourists visiting the beautiful city of Vizag.\n" +
                        "\n" +
                        "Spread over 100 acres on a hilltop, Kailasagiri offers a panoramic view of the surroundings that every nature lover craves for. A well-maintained park, Kailasagiri is always bustling with people enjoying the tranquil atmosphere and scenic beauty around.\n" +
                        "\n" +
                        "The major attraction of Kailasagiri is the 40 feet tall statue of Shiva and Parvathi. Kailasagiri derives its name from this statue depicting the abode of Lord Shiva and Parvathi. This hilltop can be reached by ropeway as well as by road.\n" +
                        "\n" +
                        "The experience of taking a ropeway while enjoying the breathtaking view of the city is something that everyone should cherish.\n" +
                        "\n" +
                        "The journey through the curved roads around the hill is also equally enjoyable. Along with this, there are a number of other attractions in and around Kailasagiri park like the Floral clock, Titanic viewpoint, Jungle trails, Shanthi Ashram, and Shanku Chakra Nama.\n" +
                        "\n" +
                        "Another remarkable attraction popular among the kids is the Toy train. This train gives a circular tour of the park and is thoroughly enjoyed by the tiny tots.The children's play park and horse rides are also equally popular among the kids.\n" +
                        "\n" +
                        "Kailasagiri is also a famous place for paragliding with excellent gliding facilities. To satisfy one’s hunger pangs there are a number of eateries around this park.";
                url = "https://vizagtourism.org.in/kailasagiri-park-vizag";
                location = "geo:17.7489,83.3422";
                break;
            case 8:
                title = "Varaha Lakshmi Narasimha Temple(Simhachalam Temple)";
                description = "Sri Varaha Lakshmi Narasimha temple, Simhachalam is a Hindu temple situated on the Simhachalam Hill Range, which is 300 metres above the sea level in Visakhapatnam, Andhra Pradesh. It is dedicated to Vishnu, who is worshipped there as Varaha Narasimha. As per the temple's legend, Vishnu manifested in this form (lion's head and human body) after saving his devotee Prahlada from a murder attempt by the latter's father Hiranyakashipu. Except on Akshaya Trutiya, the idol of Varaha Narasimha is covered with sandalwood paste throughout the year, which makes it resemble a linga.\n" +
                        "\n" +
                        "Simhachalam is one of the 32 Narasimha temples in Andhra Pradesh which are important pilgrimage centres. It was regarded as an important centre of Vaishnavism in the medieval period along with Srikurmam and others. The earliest inscription at the temple belongs to 11th-century CE recording the gift by a private individual in the era of Chalukya Chola king Kulottunga I. In the later half of the 13th century, the temple complex underwent radical physical changes during the reign of the Eastern Ganga king Narasimhadeva I. Narahari Tirtha, a Dvaita philosopher and Eastern Ganga minister converted the Simhachalam temple into an educational establishment of renown and a religious centre for Vaishnavism.[1] It later received patronage from many royal families, of which Tuluva dynasty of Vijayanagara Empire is a notable one. The temple underwent 40 years of religious inactivity from 1564 to 1604 CE. In 1949, the temple came under the purview of the state government and is currently administered by the Simhachalam Devasthanam Board.";
                url = "https://en.wikipedia.org/wiki/Varaha_Lakshmi_Narasimha_temple,_Simhachalam";
                location = "geo:17.7664,83.2506";
                break;
            case 9:
                title = "Rama Krishna Beach";
                description = "Visakhapatnam is known as the beach city of Andhra Pradesh with its alluring beaches attracting hordes of visitors every day. One of the most popular beaches of Vizag is Ramakrishna beach, more commonly known as RK beach bustling with young and old people alike.\n" +
                        "\n" +
                        "RK Beach gets its name from the Ramakrishna Mission ashram situated near the beach. With its serene waters and cool atmosphere, the beach offers a wonderful view of the countryside.\n" +
                        "\n" +
                        "The view of the sunset from this beach is truly mesmerizing and one can find a number of people enjoying some relaxed moments in this beautiful beach enjoying the perfect view.\n" +
                        "\n" +
                        "Ramakrishna Beach is popular not just among the tourists but the locals as well. In the evening time this beach gets crowded with people having a fun time on the sands. Swimming, sunbathing, surfing and playing beach volleyball are some of the popular activities that can be seen here.\n" +
                        "\n" +
                        "One can also enjoy a camel ride on the sands of the beach. There are a number of boats and ships operating on one side of the shore and one can go for a ride in the traditional fishing boat arranged by the fishers or can take a local cruise to enjoy the beautiful view of the sunset.";
                url = "https://vizagtourism.org.in/rama-krishna-beach-vizag";
                location = "geo:17.7142,83.3237";
                break;

        }
        image.setImageResource(words.get(x).getImageResourceId());

        TextView tit = (TextView) findViewById(R.id.titlep);
        tit.setText(title);

        TextView info = (TextView) findViewById(R.id.infop);
        info.setText(description);

        TextView link = findViewById(R.id.urlp);
        link.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent webIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(webIntent);
            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the location is clicked on.
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(android.content.Intent.ACTION_VIEW );
                intent.setData(Uri.parse(location));
                intent.setPackage("com.google.android.apps.maps");
                if (intent.resolveActivity(getPackageManager()) == null) {
                    startActivity(intent);}
            }
        });
    }

}