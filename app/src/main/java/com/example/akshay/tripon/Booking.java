package com.example.akshay.tripon;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

/**
 * Created by akshay on 12/23/2017.
 */
public class Booking extends AppCompatActivity {
    TextView tv1,tvbooking,weprovidetext,placestovisit,placestext1,placestext2,placestext3,placestext4,placestext5,placestext6,placestext7,placestext8,placestext9,placestext10,custom1,placestext11,placestext12,placestext13,placestext14;
    String a;
    ImageView image1,places1,places2,places3,places4,places5,places6,places7,places8,places9,places10,places11,places12,places13,places14;
    CardView card1,card2,card3,card4,card5,card6,card7,card8,card9,card10,card11,card12,card13,card14;
    Button home;
    CollapsingToolbarLayout title;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.booking);
        Toolbar toolbar=(Toolbar)findViewById(R.id.toolbar);
        title=(CollapsingToolbarLayout)findViewById(R.id.collapseToolbar);

        setSupportActionBar(toolbar);
        if(getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        card1=(CardView)findViewById(R.id.card1);
        card2=(CardView)findViewById(R.id.card2);
        card3=(CardView)findViewById(R.id.card3);
        card4=(CardView)findViewById(R.id.card4);
        card5=(CardView)findViewById(R.id.card5);
        card6=(CardView)findViewById(R.id.card6);
        card7=(CardView)findViewById(R.id.card7);
        card8=(CardView)findViewById(R.id.card8);
        card9=(CardView)findViewById(R.id.card9);
        card10=(CardView)findViewById(R.id.card10);
        card11=(CardView)findViewById(R.id.card11);
        card12=(CardView)findViewById(R.id.card12);
        card13=(CardView)findViewById(R.id.card13);
        card14=(CardView)findViewById(R.id.card14);
        tv1=(TextView)findViewById(R.id.tv1);
        image1=(ImageView)findViewById(R.id.image1);
        weprovidetext=(TextView)findViewById(R.id.weprovidetext);
        placestovisit=(TextView)findViewById(R.id.placestovisit);
        placestext1=(TextView)findViewById(R.id.placestext1);
        placestext2=(TextView)findViewById(R.id.placestext2);
        placestext3=(TextView)findViewById(R.id.placestext3);
        placestext4=(TextView)findViewById(R.id.placestext4);
        placestext5=(TextView)findViewById(R.id.placestext5);
        placestext6=(TextView)findViewById(R.id.placestext6);
        placestext7=(TextView)findViewById(R.id.placestext7);
        placestext8=(TextView)findViewById(R.id.placestext8);
        placestext9=(TextView)findViewById(R.id.placestext9);
        placestext10=(TextView)findViewById(R.id.placestext10);
        placestext11=(TextView)findViewById(R.id.placestext11);
        placestext12=(TextView)findViewById(R.id.placestext12);
        placestext13=(TextView)findViewById(R.id.placestext13);
        placestext14=(TextView)findViewById(R.id.placestext14);
        places1=(ImageView)findViewById(R.id.places1);
        places2=(ImageView)findViewById(R.id.places2);
        places3=(ImageView)findViewById(R.id.places3);
        places4=(ImageView)findViewById(R.id.places4);
        places5=(ImageView)findViewById(R.id.places5);
        places6=(ImageView)findViewById(R.id.places6);
        places7=(ImageView)findViewById(R.id.places7);
        places8=(ImageView)findViewById(R.id.places8);
        places9=(ImageView)findViewById(R.id.places9);
        places10=(ImageView)findViewById(R.id.places10);
        places11=(ImageView)findViewById(R.id.places11);
        places12=(ImageView)findViewById(R.id.places12);
        places13=(ImageView)findViewById(R.id.places13);
        places14=(ImageView)findViewById(R.id.places14);

        Bundle extras = getIntent().getExtras();

        tvbooking=(TextView)findViewById(R.id.tvbooking);
        Typeface typeface=Typeface.createFromAsset(getAssets(), "ARIALNB.TTF");
        tvbooking.setTypeface(typeface);
        placestovisit.setTypeface(typeface);
        weprovidetext.setTypeface(typeface);
        String value1 = extras.getString("value1");
        tv1.setText(value1);
        a=tv1.getText().toString();
        if(a==value1){
            Picasso.with(getBaseContext()).load("https://firebasestorage.googleapis.com/v0/b/nav2-872d6.appspot.com/o/banghydgoa%2Fnew%2Fcollege%2Fgoachikcoo%2Fgoachikcoomain.jpg?alt=media&token=802485b1-0f9a-4b9d-9ee1-e8d97d1745c3").into(image1);
            tvbooking.setText("Goa-Chikmagaluru-Coorg");
            title.setTitle("Goa-Chikmagaluru-Coorg");
            placestext1.setText("Baga Beach");
            Picasso.with(getBaseContext()).load("https://firebasestorage.googleapis.com/v0/b/nav2-872d6.appspot.com/o/banghydgoa%2Fnew%2Fcollege%2Fgoachikcoo%2FBaga1.jpg?alt=media&token=7c7f7214-d22f-4959-8376-ac41490ce2ce").into(places1);
            placestext2.setText("Anjuna Beach");
            Picasso.with(getBaseContext()).load("https://firebasestorage.googleapis.com/v0/b/nav2-872d6.appspot.com/o/banghydgoa%2Fnew%2Fcollege%2Fgoachikcoo%2Fanjuna1.jpg?alt=media&token=571cd082-5469-43cd-a69f-e19489739ca6").into(places2);
            placestext3.setText("Chapora Fort");
            Picasso.with(getBaseContext()).load("https://firebasestorage.googleapis.com/v0/b/nav2-872d6.appspot.com/o/banghydgoa%2Fnew%2Fcollege%2Fgoachikcoo%2Fchapora1.jpg?alt=media&token=75861450-14ea-46e5-ad2c-818057c2252c").into(places3);
            placestext4.setText("St. Francis Church");
            Picasso.with(getBaseContext()).load("https://firebasestorage.googleapis.com/v0/b/nav2-872d6.appspot.com/o/banghydgoa%2Fnew%2Fcollege%2Fgoachikcoo%2FSt%20francis.jpg?alt=media&token=64a2cc2a-70ef-4744-8a80-bd3095d91461").into(places4);
            placestext5.setText("Cruise boat");
            Picasso.with(getBaseContext()).load("https://firebasestorage.googleapis.com/v0/b/nav2-872d6.appspot.com/o/banghydgoa%2Fnew%2Fcollege%2Fgoachikcoo%2Fgoa-cruise-tour.jpg?alt=media&token=33cf6c32-5efd-45e0-9480-95c0d260ab2e").into(places5);
            placestext6.setText("Calangute Beach");
            Picasso.with(getBaseContext()).load("https://firebasestorage.googleapis.com/v0/b/nav2-872d6.appspot.com/o/banghydgoa%2Fnew%2Fcollege%2Fgoachikcoo%2Fcalangute.jpg?alt=media&token=230c4753-34b4-4848-9838-0cfeba673ad4").into(places6);
            placestext7.setText("Chikmagalur Jeep Trekking");
            Picasso.with(getBaseContext()).load("https://firebasestorage.googleapis.com/v0/b/nav2-872d6.appspot.com/o/banghydgoa%2Fnew%2Fcollege%2Fgoachikcoo%2Fchiktrekking.jpg?alt=media&token=18c993ac-ac00-4133-bade-4d0987aa5717").into(places7);
            placestext8.setText("Namdroling Monastry");
            Picasso.with(getBaseContext()).load("https://firebasestorage.googleapis.com/v0/b/nav2-872d6.appspot.com/o/banghydgoa%2Fnew%2Fcollege%2Fgoachikcoo%2Fnamdroling.jpg?alt=media&token=d6c95f06-6c86-49d4-99e7-bd5fbfbaf7a6").into(places8);
            placestext9.setText("River rafting Coorg");
            Picasso.with(getBaseContext()).load("https://firebasestorage.googleapis.com/v0/b/nav2-872d6.appspot.com/o/banghydgoa%2Fnew%2Fcollege%2Fgoachikcoo%2Frafting.jpg?alt=media&token=3b8d4609-03ee-4ca9-8128-f030b93e3def").into(places9);
            placestext10.setText("DJ");
            Picasso.with(getBaseContext()).load("https://firebasestorage.googleapis.com/v0/b/nav2-872d6.appspot.com/o/banghydgoa%2Fnew%2Fcollege%2Fgoachikcoo%2Fdj.jpg?alt=media&token=5ae51858-fe9b-485e-9b0b-2171c7c0802d").into(places10);
            card11.setVisibility(View.GONE);
            card12.setVisibility(View.GONE);
            card13.setVisibility(View.GONE);
            card14.setVisibility(View.GONE);
        }
        String value2=extras.getString("value2");
        tv1.setText(value2);
        a=tv1.getText().toString();
        if(a==value2){
            tvbooking.setText("Coorg-Chikmagalur-Mysore");
            title.setTitle("Coorg-Chikmagalur-Mysore");
            Picasso.with(getBaseContext()).load("https://firebasestorage.googleapis.com/v0/b/nav2-872d6.appspot.com/o/banghydgoa%2Fnew%2Fcollege%2Fcoorgchikmysore%2Fcoorgchikmysoremain2.jpg?alt=media&token=306681fd-bf49-4a7c-b791-3200c844b8e2").into(image1);
            placestext1.setText("Mysore Zoo");
            Picasso.with(getBaseContext()).load("https://firebasestorage.googleapis.com/v0/b/nav2-872d6.appspot.com/o/banghydgoa%2Fnew%2Fcollege%2Fcoorgchikmysore%2Fmysorezoo1.jpg?alt=media&token=b06669e9-e400-4655-905a-3347d3ba58eb").into(places1);
            placestext2.setText("Mysore Palace");
            Picasso.with(getBaseContext()).load("https://firebasestorage.googleapis.com/v0/b/nav2-872d6.appspot.com/o/banghydgoa%2Fnew%2Fcollege%2Fcoorgchikmysore%2Fmysorepalace1.jpg?alt=media&token=346f7981-7a7b-4b8b-886e-4c28bf98f095").into(places2);
            placestext3.setText("Brindavan Garden");
            Picasso.with(getBaseContext()).load("https://firebasestorage.googleapis.com/v0/b/nav2-872d6.appspot.com/o/banghydgoa%2Fnew%2Fcollege%2Fcoorgchikmysore%2Fbrindavan1.jpg?alt=media&token=7acd74dd-d2e8-4699-99ad-0555c332de7c").into(places3);
            placestext4.setText("Chamundi Hills");
            Picasso.with(getBaseContext()).load("https://firebasestorage.googleapis.com/v0/b/nav2-872d6.appspot.com/o/banghydgoa%2Fnew%2Fcollege%2Fcoorgchikmysore%2Fchamundi1.jpg?alt=media&token=f78ca766-51d4-40c6-9a73-3a2798593740").into(places4);
            placestext5.setText("River Rafting");
            Picasso.with(getBaseContext()).load("https://firebasestorage.googleapis.com/v0/b/nav2-872d6.appspot.com/o/banghydgoa%2Fnew%2Fcollege%2Fcoorgchikmysore%2Frafting.jpg?alt=media&token=d8692e6c-1054-4f31-b9f8-e48f2367b98e").into(places5);
            placestext6.setText("Namdroling Monastry");
            Picasso.with(getBaseContext()).load("https://firebasestorage.googleapis.com/v0/b/nav2-872d6.appspot.com/o/banghydgoa%2Fnew%2Fcollege%2Fcoorgchikmysore%2Fnamdroling.jpg?alt=media&token=e5e58974-6c86-4439-a001-57aa83e169ac").into(places6);
            placestext7.setText("DJ Campfire");
            Picasso.with(getBaseContext()).load("https://firebasestorage.googleapis.com/v0/b/nav2-872d6.appspot.com/o/banghydgoa%2Fnew%2Fcollege%2Fcoorgchikmysore%2Fdj.jpg?alt=media&token=e9ece3b9-7710-455f-b4ae-461df61a3d73").into(places7);
            placestext8.setText("Jeep Trekking Chikmagalur");
            Picasso.with(getBaseContext()).load("https://firebasestorage.googleapis.com/v0/b/nav2-872d6.appspot.com/o/banghydgoa%2Fnew%2Fcollege%2Fcoorgchikmysore%2Fchiktrekking.jpg?alt=media&token=a92fcbc0-37ca-43b8-94fb-8ea99fdbad71").into(places8);
            card9.setVisibility(View.GONE);
            card10.setVisibility(View.GONE);
            card11.setVisibility(View.GONE);
            card12.setVisibility(View.GONE);
            card13.setVisibility(View.GONE);
            card14.setVisibility(View.GONE);

        }
        String value3=extras.getString("value3");
        tv1.setText(value3);
        a=tv1.getText().toString();
        if(a==value3){
            tvbooking.setText("Hyderabad-Bangalore");
            title.setTitle("Hyderabad-Bangalore");
            Picasso.with(getBaseContext()).load("https://firebasestorage.googleapis.com/v0/b/nav2-872d6.appspot.com/o/banghydgoa%2Fnew%2Fcollege%2Fhyderbang%2Fhydbanmain.jpg?alt=media&token=a29ef97a-d781-43b7-ab9c-0f8732ffcb79").into(image1);
            placestext1.setText("Ramoji Film City");
            Picasso.with(getBaseContext()).load("https://firebasestorage.googleapis.com/v0/b/nav2-872d6.appspot.com/o/banghydgoa%2Fnew%2Fcollege%2Fhyderbang%2Framoji1.jpg?alt=media&token=c2b567ac-e2b5-4f12-8d91-131540ca1f5a").into(places1);
            placestext2.setText("Golkonda Fort");
            Picasso.with(getBaseContext()).load("https://firebasestorage.googleapis.com/v0/b/nav2-872d6.appspot.com/o/banghydgoa%2Fnew%2Fcollege%2Fhyderbang%2FGolconda-Fort1.jpg?alt=media&token=e0056975-c9e3-46ea-904e-94ada8bdc4dd").into(places2);
            placestext3.setText("Charminar");
            Picasso.with(getBaseContext()).load("https://firebasestorage.googleapis.com/v0/b/nav2-872d6.appspot.com/o/banghydgoa%2Fnew%2Fcollege%2Fhyderbang%2Fcharminar1.jpg?alt=media&token=bface92b-a6ed-4a8a-b4fc-3fdec4c02f06").into(places3);
            placestext4.setText("Mecca Masjid");
            Picasso.with(getBaseContext()).load("https://firebasestorage.googleapis.com/v0/b/nav2-872d6.appspot.com/o/banghydgoa%2Fnew%2Fcollege%2Fhyderbang%2Fmecca-masjid1.jpg?alt=media&token=9aeb15d2-4e78-4b61-ada3-03f7debbe932").into(places4);
            placestext5.setText("Birla Mandir");
            Picasso.with(getBaseContext()).load("https://firebasestorage.googleapis.com/v0/b/nav2-872d6.appspot.com/o/banghydgoa%2Fnew%2Fcollege%2Fhyderbang%2Fbirla%20mandir1.jpg?alt=media&token=6d7a781f-af67-47d1-b6bc-96d514b0c275").into(places5);
            placestext6.setText("Hussain Sagar");
            Picasso.with(getBaseContext()).load("https://firebasestorage.googleapis.com/v0/b/nav2-872d6.appspot.com/o/banghydgoa%2Fnew%2Fcollege%2Fhyderbang%2Fhussain%20sagar1.jpg?alt=media&token=34f2c978-a170-4152-9cee-30a92b735a6a").into(places6);
            placestext7.setText("NTR Garden");
            Picasso.with(getBaseContext()).load("https://firebasestorage.googleapis.com/v0/b/nav2-872d6.appspot.com/o/banghydgoa%2Fnew%2Fcollege%2Fhyderbang%2Fntrgarden1.jpg?alt=media&token=88bc6eef-f306-4ec6-a98c-2fc8c93d0265").into(places7);
            placestext8.setText("Lal Bagh");
            Picasso.with(getBaseContext()).load("https://firebasestorage.googleapis.com/v0/b/nav2-872d6.appspot.com/o/banghydgoa%2Fnew%2Fcollege%2Fhyderbang%2Flalbagh1.jpg?alt=media&token=e5eef833-a0d9-4715-bac2-988822fa9630").into(places8);
            placestext9.setText("Banagalore Palace");
            Picasso.with(getBaseContext()).load("https://firebasestorage.googleapis.com/v0/b/nav2-872d6.appspot.com/o/banghydgoa%2Fnew%2Fcollege%2Fhyderbang%2Fbanagalorepalace.jpg?alt=media&token=4aa7138e-769a-4bfc-a953-b11871961571").into(places9);
            placestext10.setText("Wonderla");
            Picasso.with(getBaseContext()).load("https://firebasestorage.googleapis.com/v0/b/nav2-872d6.appspot.com/o/banghydgoa%2Fnew%2Fcollege%2Fhyderbang%2Fwonderla1.jpg?alt=media&token=30cd432d-fa6b-4c86-96ee-38e5e45eff15").into(places10);
            card11.setVisibility(View.GONE);
            card12.setVisibility(View.GONE);
            card13.setVisibility(View.GONE);
            card14.setVisibility(View.GONE);
        }
        String value4=extras.getString("value4");
        tv1.setText(value4);
        a=tv1.getText().toString();
        if(a==value4){
            tvbooking.setText("Dandeli-Hampi-Goa");
            title.setTitle("Dandeli-Hampi-Goa");
            Picasso.with(getBaseContext()).load("https://firebasestorage.googleapis.com/v0/b/nav2-872d6.appspot.com/o/banghydgoa%2Fnew%2Fcollege%2FHampidandgoa%2FHampidangoa.jpg?alt=media&token=a588344a-1ca3-4c92-980e-c719408ab6f8").into(image1);
            placestext1.setText("Vithala Temple");
            Picasso.with(getBaseContext()).load("https://firebasestorage.googleapis.com/v0/b/nav2-872d6.appspot.com/o/banghydgoa%2Fnew%2Fcollege%2FHampidandgoa%2Fvithalatemple.jpg?alt=media&token=f6b9c63f-1945-4917-9881-e0f66fb91905").into(places1);
            placestext2.setText("Elephant Stables");
            Picasso.with(getBaseContext()).load("https://firebasestorage.googleapis.com/v0/b/nav2-872d6.appspot.com/o/banghydgoa%2Fnew%2Fcollege%2FHampidandgoa%2FElephantstable.jpg?alt=media&token=cb7abfd2-4710-4e17-ba18-d9a41d31e937").into(places2);
            placestext3.setText("Kali River Rafting");
            Picasso.with(getBaseContext()).load("https://firebasestorage.googleapis.com/v0/b/nav2-872d6.appspot.com/o/banghydgoa%2Fnew%2Fcollege%2FHampidandgoa%2Frafting%20kali.jpg?alt=media&token=ed59f599-cdf5-4257-b647-3ad7fb48ba40").into(places3);
            placestext4.setText("Kayaking");
            Picasso.with(getBaseContext()).load("https://firebasestorage.googleapis.com/v0/b/nav2-872d6.appspot.com/o/banghydgoa%2Fnew%2Fcollege%2FHampidandgoa%2Fkayaking.jpg?alt=media&token=f39a08b6-3956-48d3-ba61-d54f695d227c").into(places4);
            placestext5.setText("Baga Beach");
            Picasso.with(getBaseContext()).load("https://firebasestorage.googleapis.com/v0/b/nav2-872d6.appspot.com/o/banghydgoa%2Fnew%2Fcollege%2FHampidandgoa%2FBaga1.jpg?alt=media&token=2c7c93ba-fec3-4b30-886e-3d1e29337e16").into(places5);
            placestext6.setText("Anjuna Beach");
            Picasso.with(getBaseContext()).load("https://firebasestorage.googleapis.com/v0/b/nav2-872d6.appspot.com/o/banghydgoa%2Fnew%2Fcollege%2FHampidandgoa%2Fanjuna1.jpg?alt=media&token=80b845ad-b207-4aea-8bcd-42c9f0f9e95f").into(places6);
            placestext7.setText("St Francis Church");
            Picasso.with(getBaseContext()).load("https://firebasestorage.googleapis.com/v0/b/nav2-872d6.appspot.com/o/banghydgoa%2Fnew%2Fcollege%2FHampidandgoa%2FSt%20francis.jpg?alt=media&token=62b69390-cc10-4228-b2e2-4528fccdeca6").into(places7);
            placestext8.setText("Chapora Fort");
            Picasso.with(getBaseContext()).load("https://firebasestorage.googleapis.com/v0/b/nav2-872d6.appspot.com/o/banghydgoa%2Fnew%2Fcollege%2FHampidandgoa%2Fchapora1.jpg?alt=media&token=ea52a6b6-5fd4-41e4-9cee-56a38fa8e8b5").into(places8);
            placestext9.setText("DJ Cruise Boat");
            Picasso.with(getBaseContext()).load("https://firebasestorage.googleapis.com/v0/b/nav2-872d6.appspot.com/o/banghydgoa%2Fnew%2Fcollege%2FHampidandgoa%2Fgoacruise.jpg?alt=media&token=e5af5379-43df-4368-87e0-d4d70ed7d1bf").into(places9);
            placestext10.setText("Callangutta Beach");
            Picasso.with(getBaseContext()).load("https://firebasestorage.googleapis.com/v0/b/nav2-872d6.appspot.com/o/banghydgoa%2Fnew%2Fcollege%2FHampidandgoa%2Fcalangute.jpg?alt=media&token=8280d6e5-4899-4ce1-acd0-04ba590dae64").into(places10);
            card11.setVisibility(View.GONE);
            card12.setVisibility(View.GONE);
            card13.setVisibility(View.GONE);
            card14.setVisibility(View.GONE);
        }
        String value5=extras.getString("value5");
        tv1.setText(value5);
        a=tv1.getText().toString();
        if(a==value5){
            tvbooking.setText("Kodaikanal-Munnar");
            title.setTitle("Kodaikanal-Munnar");
            Picasso.with(getBaseContext()).load("https://firebasestorage.googleapis.com/v0/b/nav2-872d6.appspot.com/o/banghydgoa%2Fnew%2Fcollege%2FKodaikanalmunnar%2Fkodailwall.jpg?alt=media&token=b2e8a54e-44d3-4819-b425-e2ace33284b0").into(image1);
            placestext1.setText("Kodaikanal Lake");
            Picasso.with(getBaseContext()).load("https://firebasestorage.googleapis.com/v0/b/nav2-872d6.appspot.com/o/banghydgoa%2Fnew%2Fcollege%2FKodaikanalmunnar%2Fkodaikanal%20lake-1.jpg?alt=media&token=3c2f422e-ef61-4ad6-8e01-8792703c2c0e").into(places1);
            placestext2.setText("Pillar Rocks");
            Picasso.with(getBaseContext()).load("https://firebasestorage.googleapis.com/v0/b/nav2-872d6.appspot.com/o/banghydgoa%2Fnew%2Fcollege%2FKodaikanalmunnar%2FPillar-Rocks_Kodaikanal-Tourist-Places.jpg?alt=media&token=80803e3b-80ae-422a-9531-4c627e9becca").into(places2);
            placestext3.setText("Coakers walk");
            Picasso.with(getBaseContext()).load("https://firebasestorage.googleapis.com/v0/b/nav2-872d6.appspot.com/o/banghydgoa%2Fnew%2Fcollege%2FKodaikanalmunnar%2Fcoakers%20walk.jpg?alt=media&token=5c87fa91-def1-4bb5-b0ec-4429f13ae256").into(places3);
            placestext4.setText("Pine Forest");
            Picasso.with(getBaseContext()).load("https://firebasestorage.googleapis.com/v0/b/nav2-872d6.appspot.com/o/banghydgoa%2Fnew%2Fcollege%2FKodaikanalmunnar%2Fpine-forest-.jpg?alt=media&token=c95c52a2-027a-4c39-b03b-732e2934a454").into(places4);
            placestext5.setText("Tea Gardens");
            Picasso.with(getBaseContext()).load("https://firebasestorage.googleapis.com/v0/b/nav2-872d6.appspot.com/o/banghydgoa%2Fnew%2Fcollege%2FKodaikanalmunnar%2FTea_Gardens_.jpg?alt=media&token=b419386f-c828-4d3b-b166-6d0e95c48dae").into(places5);
            placestext6.setText("Mattupetty Dam");
            Picasso.with(getBaseContext()).load("https://firebasestorage.googleapis.com/v0/b/nav2-872d6.appspot.com/o/banghydgoa%2Fnew%2Fcollege%2FKodaikanalmunnar%2FMattupetty-Dam-Munnar-2.jpg?alt=media&token=f4bce74f-63e0-46a0-bb0e-067840545c09").into(places6);
            placestext7.setText("Photo Point");
            Picasso.with(getBaseContext()).load("https://firebasestorage.googleapis.com/v0/b/nav2-872d6.appspot.com/o/banghydgoa%2Fnew%2Fcollege%2FKodaikanalmunnar%2Fphotopoint.jpg?alt=media&token=7ea127f6-9ffd-40fc-83bb-811dc4a7e082").into(places7);
            placestext8.setText("Eravikulam National Park");
            Picasso.with(getBaseContext()).load("https://firebasestorage.googleapis.com/v0/b/nav2-872d6.appspot.com/o/banghydgoa%2Fnew%2Fcollege%2FKodaikanalmunnar%2Feravikulam.jpg?alt=media&token=98797feb-86e7-41f6-93f9-5015970d1afe").into(places8);
            card9.setVisibility(View.GONE);
            card10.setVisibility(View.GONE);
            card11.setVisibility(View.GONE);
            card12.setVisibility(View.GONE);
            card13.setVisibility(View.GONE);
            card14.setVisibility(View.GONE);

        }
        String value6=extras.getString("value6");
        tv1.setText(value6);
        a=tv1.getText().toString();
        if(a==value6){
            tvbooking.setText("Coorg-Chikmagalur-Dandeli-Goa");
            title.setTitle("Coorg-Chikmagalur-Dandeli-Goa");
            Picasso.with(getBaseContext()).load("https://firebasestorage.googleapis.com/v0/b/nav2-872d6.appspot.com/o/banghydgoa%2Fnew%2Fcollege%2Fcoorg-Chikmagalur-Dandeli-Goa%2FIMG_20180105_204041756.jpg?alt=media&token=41b64704-b58c-46df-9531-2a675735bd10").into(image1);
            placestext1.setText("River Rafting");
            Picasso.with(getBaseContext()).load("https://firebasestorage.googleapis.com/v0/b/nav2-872d6.appspot.com/o/banghydgoa%2Fnew%2Fcollege%2Fcoorg-Chikmagalur-Dandeli-Goa%2Frafting.jpg?alt=media&token=05667ce1-2f06-4b6e-b7bc-bad04b4acec5").into(places1);
            placestext2.setText("Namdroling Monastry");
            Picasso.with(getBaseContext()).load("https://firebasestorage.googleapis.com/v0/b/nav2-872d6.appspot.com/o/banghydgoa%2Fnew%2Fcollege%2Fcoorg-Chikmagalur-Dandeli-Goa%2Fnamdroling.jpg?alt=media&token=17b4a660-1114-40be-9573-3341c1b8a95e").into(places2);
            placestext3.setText("Jeep Trekking");
            Picasso.with(getBaseContext()).load("https://firebasestorage.googleapis.com/v0/b/nav2-872d6.appspot.com/o/banghydgoa%2Fnew%2Fcollege%2Fcoorg-Chikmagalur-Dandeli-Goa%2Fchiktrekking.jpg?alt=media&token=f2165b4a-9da7-43fb-aa85-9f9f6058c1f6").into(places3);
            placestext4.setText("Kayaking");
            Picasso.with(getBaseContext()).load("https://firebasestorage.googleapis.com/v0/b/nav2-872d6.appspot.com/o/banghydgoa%2Fnew%2Fcollege%2Fcoorg-Chikmagalur-Dandeli-Goa%2Fkayaking.jpg?alt=media&token=f3ffd52e-e9cc-40e5-8252-43a9389fd6ae").into(places4);
            placestext5.setText("Kali River");
            Picasso.with(getBaseContext()).load("https://firebasestorage.googleapis.com/v0/b/nav2-872d6.appspot.com/o/banghydgoa%2Fnew%2Fcollege%2Fcoorg-Chikmagalur-Dandeli-Goa%2Fkali%20river.jpg?alt=media&token=56be7305-48ba-4dd7-a07e-bcf4feb990f1").into(places5);
            placestext6.setText("Rafting Kali");
            Picasso.with(getBaseContext()).load("https://firebasestorage.googleapis.com/v0/b/nav2-872d6.appspot.com/o/banghydgoa%2Fnew%2Fcollege%2Fcoorg-Chikmagalur-Dandeli-Goa%2Frafting%20kali.jpg?alt=media&token=cc0958fa-2eef-43e9-ad56-e0c210c7bc95").into(places6);
            placestext7.setText("Baga Beach");;
            Picasso.with(getBaseContext()).load("https://firebasestorage.googleapis.com/v0/b/nav2-872d6.appspot.com/o/banghydgoa%2Fnew%2Fcollege%2Fcoorg-Chikmagalur-Dandeli-Goa%2FBaga1.jpg?alt=media&token=e0cd74ff-5dca-4de2-80db-d6062e16e409").into(places7);
            placestext8.setText("Anjuna Beach");
            Picasso.with(getBaseContext()).load("https://firebasestorage.googleapis.com/v0/b/nav2-872d6.appspot.com/o/banghydgoa%2Fnew%2Fcollege%2Fcoorg-Chikmagalur-Dandeli-Goa%2Fanjuna1.jpg?alt=media&token=5caeb106-a94d-4ee8-9ea8-887850062b96").into(places8);
            placestext9.setText("St Francis Church");
            Picasso.with(getBaseContext()).load("https://firebasestorage.googleapis.com/v0/b/nav2-872d6.appspot.com/o/banghydgoa%2Fnew%2Fcollege%2Fcoorg-Chikmagalur-Dandeli-Goa%2FSt%20francis.jpg?alt=media&token=4ef11dd0-f5d5-4105-9f7a-c6269006028a").into(places9);
            placestext10.setText("Chapora Fort");
            Picasso.with(getBaseContext()).load("https://firebasestorage.googleapis.com/v0/b/nav2-872d6.appspot.com/o/banghydgoa%2Fnew%2Fcollege%2Fcoorg-Chikmagalur-Dandeli-Goa%2Fchapora1.jpg?alt=media&token=c72b95df-5a53-41b7-8a03-28017e7790ed").into(places10);
            placestext11.setText("Cruise Boat");
            Picasso.with(getBaseContext()).load("https://firebasestorage.googleapis.com/v0/b/nav2-872d6.appspot.com/o/banghydgoa%2Fnew%2Fcollege%2Fcoorg-Chikmagalur-Dandeli-Goa%2Fgoacruise.jpg?alt=media&token=f6357ba2-d17d-4ab5-a362-732d54d1643e").into(places11);
            placestext12.setText("Calangute");
            Picasso.with(getBaseContext()).load("https://firebasestorage.googleapis.com/v0/b/nav2-872d6.appspot.com/o/banghydgoa%2Fnew%2Fcollege%2Fcoorg-Chikmagalur-Dandeli-Goa%2Fcalangute.jpg?alt=media&token=273cd0a8-bb80-46b6-bf42-461671104929").into(places12);
            placestext13.setText("DJ Parties");
            Picasso.with(getBaseContext()).load("https://firebasestorage.googleapis.com/v0/b/nav2-872d6.appspot.com/o/banghydgoa%2Fnew%2Fcollege%2Fcoorg-Chikmagalur-Dandeli-Goa%2Fdj.jpg?alt=media&token=066284d6-e568-4261-8189-6274811bb264").into(places12);
            card13.setVisibility(View.GONE);
            card14.setVisibility(View.GONE);
        }
        String value7=extras.getString("value7");
        tv1.setText(value7);
        a=tv1.getText().toString();
        if(a==value7){
            tvbooking.setText("Delhi-Agra-Kullu-Manali");
            title.setTitle("Delhi-Agra-Kullu-Manali");
            Picasso.with(getBaseContext()).load("https://firebasestorage.googleapis.com/v0/b/nav2-872d6.appspot.com/o/banghydgoa%2Fnew%2Fcollege%2Fmanali1.jpg?alt=media&token=638395d1-2f73-41a8-b9b3-fe8800f15ee4").into(image1);
            placestext1.setText("Humayuns Tomb");
            Picasso.with(getBaseContext()).load("https://firebasestorage.googleapis.com/v0/b/nav2-872d6.appspot.com/o/banghydgoa%2Fnew%2Fcollege%2FDelhi-Agra-Manali%2Fhumayuns-tomb.jpg?alt=media&token=35e7c814-dc8d-4518-a5c6-63638f4cf77d").into(places1);
            placestext2.setText("Red Fort");
            Picasso.with(getBaseContext()).load("https://firebasestorage.googleapis.com/v0/b/nav2-872d6.appspot.com/o/banghydgoa%2Fnew%2Fcollege%2FDelhi-Agra-Manali%2FRedFort.jpg?alt=media&token=f8b73292-90e4-4b95-bdcc-0ae6f017b500").into(places2);
            placestext3.setText("Lotus Temple");
            Picasso.with(getBaseContext()).load("https://firebasestorage.googleapis.com/v0/b/nav2-872d6.appspot.com/o/banghydgoa%2Fnew%2Fcollege%2FDelhi-Agra-Manali%2Flotus%20temple.jpg?alt=media&token=3f53ae6a-b149-4fc9-baa2-734977d4968d").into(places3);
            placestext4.setText("Taj Mahal");
            Picasso.with(getBaseContext()).load("https://firebasestorage.googleapis.com/v0/b/nav2-872d6.appspot.com/o/banghydgoa%2Fnew%2Fcollege%2Fcoorg-Chikmagalur-Dandeli-Goa%2Fkayaking.jpg?alt=media&token=f3ffd52e-e9cc-40e5-8252-43a9389fd6ae").into(places4);
            placestext5.setText("Solang Valley");
            Picasso.with(getBaseContext()).load("https://firebasestorage.googleapis.com/v0/b/nav2-872d6.appspot.com/o/banghydgoa%2Fnew%2Fcollege%2FDelhi-Agra-Manali%2FSolang-Valley-1.jpg?alt=media&token=c690562e-a004-4cde-9cb7-57c0738066e3").into(places5);
            placestext6.setText("Rothang Pass");
            Picasso.with(getBaseContext()).load("https://firebasestorage.googleapis.com/v0/b/nav2-872d6.appspot.com/o/banghydgoa%2Fnew%2Fcollege%2FDelhi-Agra-Manali%2Frothang%20pass.JPG?alt=media&token=d19086b1-e656-4b68-ba24-66fb4f187482").into(places6);
            placestext7.setText("River Rafting");;
            Picasso.with(getBaseContext()).load("https://firebasestorage.googleapis.com/v0/b/nav2-872d6.appspot.com/o/banghydgoa%2Fnew%2Fcollege%2FDelhi-Agra-Manali%2Frafting.jpg?alt=media&token=2141fc21-029d-4762-a7a5-773e7b70ebdb").into(places7);
            placestext8.setText("Para gliding");
            Picasso.with(getBaseContext()).load("https://firebasestorage.googleapis.com/v0/b/nav2-872d6.appspot.com/o/banghydgoa%2Fnew%2Fcollege%2FDelhi-Agra-Manali%2Fpara.jpg?alt=media&token=e468df0d-4777-4be0-82cb-b5c11713b2ba").into(places8);
            placestext9.setText("Raghunath Temple");
            Picasso.with(getBaseContext()).load("https://firebasestorage.googleapis.com/v0/b/nav2-872d6.appspot.com/o/banghydgoa%2Fnew%2Fcollege%2FDelhi-Agra-Manali%2Fraghunath-temple-of-kullu.jpg?alt=media&token=880e57df-103f-453b-9ce7-380f38c985b6").into(places9);
            placestext10.setText("Friendship Peak");
            Picasso.with(getBaseContext()).load("https://firebasestorage.googleapis.com/v0/b/nav2-872d6.appspot.com/o/banghydgoa%2Fnew%2Fcollege%2FDelhi-Agra-Manali%2Fon-top-friendship-peak-trek-india-PdH_1300px.jpg?alt=media&token=e83c1bdc-564d-4f3e-be62-2611ed3dc404").into(places10);
           card11.setVisibility(View.GONE);
            card12.setVisibility(View.GONE);
            card13.setVisibility(View.GONE);
            card14.setVisibility(View.GONE);
        }
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == android.R.id.home) {
            onBackPressed();
            return true;
        }
        //noinspection SimplifiableIfStatement

        return super.onOptionsItemSelected(item);
    }
    ///////////////////
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}