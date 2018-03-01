package com.example.akshay.tripon;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

/**
 * Created by akshay on 11/3/2017.
 */

public class Categories_fragment extends Fragment {


    View view;
    ImageButton im,im2,im3,im4;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
// Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_categories, container, false);
// get the reference of Button
        im=(ImageButton) view.findViewById(R.id.im1);
        Picasso.with(getActivity()).load("https://firebasestorage.googleapis.com/v0/b/nav2-872d6.appspot.com/o/banghydgoa%2Fnew%2Fcategories%2Fcollege1.jpg?alt=media&token=b0afe998-1251-4917-b530-3b24d456c6ee").into(im);
// perform setOnClickListener on first Button

        im.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getActivity(),Places.class);
                i.putExtra("value1","first");
                startActivity(i);
            }
        });
        im2=(ImageButton)view.findViewById(R.id.im2);
        Picasso.with(getActivity()).load("https://firebasestorage.googleapis.com/v0/b/nav2-872d6.appspot.com/o/banghydgoa%2Fnew%2Fcategories%2Fsouth1.jpg?alt=media&token=c6478632-084d-4fe8-9eb3-f9d6746f6fdc").into(im2);
        im2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getActivity(),Places.class);
                i.putExtra("value2","2");
                startActivity(i);
            }
        });
        im3=(ImageButton)view.findViewById(R.id.im3);
        Picasso.with(getActivity()).load("https://firebasestorage.googleapis.com/v0/b/nav2-872d6.appspot.com/o/banghydgoa%2Fnew%2Fcategories%2Fnorth.jpg?alt=media&token=a0fcde9c-6ba9-4aaf-a9c7-f453989dd3f7").into(im3);
        im3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getActivity(),Places.class);
                i.putExtra("value3","3");
                startActivity(i);
            }
        });
        im4=(ImageButton) view.findViewById(R.id.im4);
        Picasso.with(getActivity()).load("https://firebasestorage.googleapis.com/v0/b/nav2-872d6.appspot.com/o/banghydgoa%2Fnew%2Fcategories%2Fgoan.jpg?alt=media&token=bd176438-e78c-4bff-bc6e-f35556b2f278").into(im4);
        im4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"yoyo",Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }
}

