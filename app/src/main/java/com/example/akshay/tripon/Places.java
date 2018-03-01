package com.example.akshay.tripon;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ScrollView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

/**
 * Created by akshay on 11/6/2017.
 */
public class Places extends AppCompatActivity {

    TextView tv1;
    ImageButton firstbutton,spot2,spot3,spot4,spot5,spot6,spot7,spot8,spot9;
    ScrollView scroll;
    String a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.places);
        scroll=(ScrollView)findViewById(R.id.scroll);
        Bundle extras = getIntent().getExtras();
        tv1 = (TextView) findViewById(R.id.tv1places);
        spot2=(ImageButton)findViewById(R.id.spot2);
        spot3=(ImageButton)findViewById(R.id.spot3);
        spot4=(ImageButton)findViewById(R.id.spot4);
        spot5=(ImageButton)findViewById(R.id.spot5);
        spot6=(ImageButton)findViewById(R.id.spot6);
        spot7=(ImageButton)findViewById(R.id.spot7);
        spot8=(ImageButton)findViewById(R.id.spot8);
        String value1 = extras.getString("value1");
        String value2 = extras.getString("value2");
        String value3 = extras.getString("value3");
        /*Toast.makeText(getApplicationContext(), "Values are:\n First value: " + value1, Toast.LENGTH_LONG).show();*/
        tv1.setText(value1);
        a=tv1.getText().toString();

       if(a==value1){
           Picasso.with(getBaseContext()).load("https://firebasestorage.googleapis.com/v0/b/nav2-872d6.appspot.com/o/banghydgoa%2Fnew%2Fcollege%2Fgoa1.jpg?alt=media&token=6a0a6e0c-883f-430e-be10-cc1b539434e4").into(spot2);
           Picasso.with(getBaseContext()).load("https://firebasestorage.googleapis.com/v0/b/nav2-872d6.appspot.com/o/banghydgoa%2Fnew%2Fcollege%2Fcoorg1.jpg?alt=media&token=6db64b6e-f712-4c1a-adb1-8198850144b4").into(spot3);
           Picasso.with(getBaseContext()).load("https://firebasestorage.googleapis.com/v0/b/nav2-872d6.appspot.com/o/banghydgoa%2Fnew%2Fcollege%2Fhyder1.jpg?alt=media&token=b05301b9-ed9a-4e12-938c-127e53b0470b").into(spot4);
           Picasso.with(getBaseContext()).load("https://firebasestorage.googleapis.com/v0/b/nav2-872d6.appspot.com/o/banghydgoa%2Fnew%2Fcollege%2Fdandeli1.jpg?alt=media&token=fb5cce8b-528e-4cab-bd72-5de3d33973c1").into(spot5);
           Picasso.with(getBaseContext()).load("https://firebasestorage.googleapis.com/v0/b/nav2-872d6.appspot.com/o/banghydgoa%2Fnew%2Fcollege%2Fkodai1.jpg?alt=media&token=e916d30b-687c-40a2-9349-c50885e89217").into(spot6);
           Picasso.with(getBaseContext()).load("https://firebasestorage.googleapis.com/v0/b/nav2-872d6.appspot.com/o/banghydgoa%2Fnew%2Fcollege%2Fchik1.jpg?alt=media&token=a87ef548-a916-4dc8-9683-cab5e653d0cb").into(spot7);
           Picasso.with(getBaseContext()).load("https://firebasestorage.googleapis.com/v0/b/nav2-872d6.appspot.com/o/banghydgoa%2Fnew%2Fcollege%2Fmain.jpg?alt=media&token=29c4f8a6-ee9a-46e2-be32-a074f0f14b6a").into(spot8);
           spot2.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   Intent i=new Intent(Places.this,Booking.class);
                   i.putExtra("value1","1");
                   startActivity(i);
               }
           });
           spot3.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   Intent i=new Intent(Places.this,Booking.class);
                   i.putExtra("value2","2");
                   startActivity(i);
               }
           });
           spot4.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   Intent i=new Intent(Places.this,Booking.class);
                   i.putExtra("value3","3");
                   startActivity(i);
               }
           });
           spot5.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   Intent i=new Intent(Places.this,Booking.class);
                   i.putExtra("value4","4");
                   startActivity(i);
               }
           });
           spot6.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   Intent i=new Intent(Places.this,Booking.class);
                   i.putExtra("value5","5");
                   startActivity(i);
               }
           });
           spot7.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   Intent i=new Intent(Places.this,Booking.class);
                   i.putExtra("value6","6");
                   startActivity(i);
               }

           });
           spot8.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   Intent i=new Intent(Places.this,Booking.class);
                   i.putExtra("value7","7");
                   startActivity(i);
               }
           });
          



       }
        tv1.setText(value2);
        a=tv1.getText().toString();
        if(a==value2){
            Picasso.with(getBaseContext()).load("https://firebasestorage.googleapis.com/v0/b/nav2-872d6.appspot.com/o/banghydgoa%2Fbhgsecond.jpg?alt=media&token=5e8961f1-b2cb-44d2-931e-bd0e9573f8c6").into(spot2);

        }
        tv1.setText(value3);
        a=tv1.getText().toString();
        if(a==value3){
            Picasso.with(getBaseContext()).load("https://firebasestorage.googleapis.com/v0/b/nav2-872d6.appspot.com/o/banghydgoa%2Fbhgsecond.jpg?alt=media&token=5e8961f1-b2cb-44d2-931e-bd0e9573f8c6").into(spot2);
        }



    }

}