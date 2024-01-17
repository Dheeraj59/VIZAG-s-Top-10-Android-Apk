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

public class InfoShoppingActivity extends ShoppingActivity {
    public String title;
    public String description;
    public String location;
    public String url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_shopping);

        Intent open = getIntent();
        int x = Integer.valueOf(open.getStringExtra("pos"));
        Toast.makeText(this, words.get(x).getName(), Toast.LENGTH_SHORT).show();
        ImageView image = (ImageView) findViewById(R.id.imgs);
        Button btn = (Button) findViewById(R.id.locs);

        switch (x) {
            case 0:
                title = "CMR Central";
                description = "“CHANDANA BROTHERS (CB) GROUP”, the most admired brand name in the state of A.P with a strong presence in the state in the fields of Textiles, Jewellery & construction, was established in the year 1975 by Chandana Mohan Rao. C.B. Group presently consists of a chain of 22 large and modern textiles and 9 jewelry showrooms in the state of AP. The annual turnover of the group is about Rs 300.00 the state of AP in textiles and 50 Crores in Jewellery. The chief promoter CHANDANA MOHAN RAO has got more than 3 decades of experience in the textile business and Jewellery, the group is about Rs. 300.00 Crores in textiles and Rs.50 Crores in Jewellery. The chief promoter CHANDANA MOHAN RAO has got more than 3decades of experience in the textile business and is the brain behind all the ventures of the group. Besides the main activity of textiles and Jewellery, the group has, in the recent past, entered into the other areas like Investments in Real Estates and Construction activities through various corporate entities. CB Group is one of the professionally managed Groups in A.P. the Group enjoys reputation for honoring the commitments in time and credit worthiness in the business community in India.";
                url = "http://www.cmrcentral.in/";
                location = "geo:18.2807,83.0397";
                break;
            case 1:
                title = "Vizag Central";
                description = "Home to more than 500 fashion labels, Central is the go-to fashion destination for all occasions.\n" +
                        "\n" +
                        "With 48 stores across India, we serve our customers with the latest fashion pieces.";
                url = "https://centralandme.com/";
                location = "geo:18.2807,83.0397";
                break;
            case 2:
                title = "Shoppers Stop";
                description = "Shoppers Stop: Founded in 1991 and headquartered in Mumbai it is an India’s well-known retailing company. The store has marked its presence in 36 cities, and there are over 76 stores all over India.\n" +
                        "\n" +
                        "Shopper Stop is one of the best known retailers in India. With their department store format, ShopperStop stores house everything you could want under one roof.\n" +
                        "As well as being famous for their impressive seasonal Shoppers Stop sale, continuously run offers, deals and discounts. These can range from rupees off to coupon codes which can be used at the online checkout. Loyal customers can register for a Shoppers Stop First Citizen card which offers discounts and money back on purchases.\n" +
                        "\n" +
                        "Shoppers Stop online launched with delivery across major cities in India in 2008.\n" +
                        "\n" +
                        "Shoppers Stop retails merchandise under its own labels, such as STOP, Kashish, LIFE and Vettorio Fratini, Elliza Donatein, Acropolis etc.\n" +
                        "\n" +
                        "Shoppers Stop is an Indian retailing company promoted by the K Raheja Corp Group, started in the year 1991 with its first store inAndheri, Mumbai.\n" +
                        "\n" +
                        "They have over 60 Shoppers stop stores across the country as well as a website.\n" +
                        "\n" +
                        "Shoppers Stop Ltd has been awarded \"the Hall of Fame\" and won \"the Emerging Market Retailer of the Year Award\", by World Retail Congress at Barcelona.";
                url = "https://www.shoppersstop.com/storecode/199/Ssl-Vizag-Vip_Road";
                location = "geo:18.2807,83.0397";
                break;
            case 3:
                title = "Chitralaya Mall";
                description = "Confidence and comfort are faces of the same coin.\n" +
                        "Wear your confidence with the latest from the fashion industry, at Chitralaya. Shop now and have a great time with our varied variety of choices!\n" +
                        "Elegant & Classy, the new fashionista is here at Trends, Chitralaya! Look trendy now with our latest, trendy collections in our showrooms. Trust Chitralaya to get you the best and the latest from the world of fashion!";
                url = "https://www.tiendeo.in/stores/vizag/max-chitralaya-mall-jagdamba-centre/129869";
                location = "geo:18.2807,83.0397";
                break;
            case 4:
                title = "Lifestyle";
                description = "Lifestyle is India's leading fashion destination for the latest trends. Part of Dubai based retail and hospitality conglomerate - The Landmark Group, Lifestyle brings multiple categories including men, women and kids’ apparel, footwear, handbags, fashion accessories and beauty under the convenience of a single roof. It provides convenience of a true omni-channel experience with its online store lifestylestores.com. Currently, Lifestyle is present across 77 stores, 44 cities and delivers to over 26000 pin codes. The address of this store is D No 10/28/1, Waltair Uplands, Opposite Circuit House, Waltair Ward, Visakhapatnam, Andhra Pradesh - 530023.";
                url = "https://www.lifestylestores.com/in/en/";
                location = "geo:18.2807,83.0397";
                break;
            case 5:
                title = "South India Mall";
                description = "South India Shopping Mall is South India's Fashion Capital, especially if you are buying Indian Wear, bridal wear, casual wear, workwear, nightwear, Sarees, Kurthas, Kurthis, Chudidhars, Dress Materials, Jeans, Night Wears, Shirts, T-Shirts and much more. SISMO.in has all your fashion requirements for Men and Women. With hundreds of options to choose from, SISMO.in's online catalogue is unique and exclusive to online shoppers. From Bridal wear to Workwear, you can rely on us for an ethnic wardrobe that is up to date. Explore our in-house exclusive brands Hosh, Alena, Adamparker, Vencarlos, Megha, Miss South, and many more which are carefully selected designs that will make you ethnic collection unique.\n" +
                        "\n" +
                        "If your wardrobe has been craving for Pattu Saree collection, then you can feast your eyes on our Pattu Saree Collections on SISMO.in. Also, take a look at our fashion blog for fashion tips and latest trends in ethnic fashion and be a trendsetter among your office crowd and family functions." ;
                url = "https://www.southindiaeshop.com/";
                location = "geo:18.2807,83.0397";
                break;
            case 6:
                title = "RK Family Store";
                description = "RK Battala Dhukanam\n" +
                        "R.k. Family Stores Private Limited is a Non-govt company, incorporated on 28 May, 2003. It's a private unlisted company and is classified as'company limited by shares'.\n" +
                        "\n" +
                        "Company's authorized capital stands at Rs 5.0 lakhs and has 0.0% paid-up capital which is Rs 0.0 lakhs. \n" +
                        "\n" +
                        "R.k. Family Stores Private Limited is majorly in Trading business from last 18 years and currently, company operations are strike off. ";
                location = "geo:18.2807,83.0397";
                break;
            case 7:
                title = "Spencers";
                description = "Spencer’s Retail Ltd – a part of the RP Sanjiv Goenka Group, was one of the earliest entrants into the retail space in India. Not only this, it is the retail chain that introduced the concept of organized retailing to the Indian consumer.\n" +
                        "\n" +
                        "With an extensive range of products in various categories ranging from food, personal care, fashion and home essentials, to even electricals, and electronics, all your needs are taken care of at a single point of purchase.\n" +
                        "\n" +
                        "While our first ever hypermarket was launched in 2000, as of today, we have expanded to the entire country. Not only do we run 120 brick-and-mortar stores in over 35 cities in the country, but now our customers also have the convenience of purchasing online grocery in Vizag.\n" +
                        "\n" +
                        "Our delivery team makes it possible to serve you your groceries within 3 hours right at your doorstep.\n" +
                        "\n" +
                        "We take our proposition of Making Fine Living Affordable by making online grocery shopping in Vishakhapatnam a seamless experience. We embody this principle right into your experience of easily being able to purchase the best products when you’re shopping for grocery online.";
                url = "https://www.spencers.in/";
                location = "geo:18.2807,83.0397";
                break;
            case 8:
                title = "D Mart";
                description = "DMart is a one-stop supermarket chain that aims to offer customers a wide range of basic home and personal products under one roof. Each DMart store stocks home utility products - including food, toiletries, beauty products, garments, kitchenware, bed and bath linen, home appliances and more - available at competitive prices that our customers appreciate. Our core objective is to offer customers good products at great value.\n" +
                        "\n" +
                        "DMart was started by Mr. Radhakishan Damani and his family to address the growing needs of the Indian family. From the launch of its first store in Powai in 2002, DMart today has a well-established presence in 234 locations across Maharashtra, Gujarat, Andhra Pradesh, Madhya Pradesh, Karnataka, Telangana, Chhattisgarh, NCR, Tamil Nadu, Punjab and Rajasthan. With our mission to be the lowest priced retailer in the regions we operate, our business continues to grow with new locations planned in more cities.\n" +
                        "\n" +
                        "The supermarket chain of DMart stores is owned and operated by Avenue Supermarts Ltd. (ASL). The company has its headquarters in Mumbai.";
                url = "https://www.dmart.in/";
                location = "geo:18.2807,83.0397";
                break;
        }
        image.setImageResource(words.get(x).getImageResourceId());

        TextView tit = (TextView) findViewById(R.id.titles);
        tit.setText(title);

        TextView info = (TextView) findViewById(R.id.infos);
        info.setText(description);

        TextView link = findViewById(R.id.urls);
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