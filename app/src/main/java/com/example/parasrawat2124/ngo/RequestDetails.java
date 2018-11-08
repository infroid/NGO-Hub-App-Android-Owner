package com.example.parasrawat2124.ngo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class RequestDetails extends AppCompatActivity {
    String imagedescription;
    ArrayList<Integer> photolist;
    int positon;
    TextView requestdescription;
   ImageView circleImageView;
    public static final String TAG="MY ACTIVITY";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_request_details);
        imagedescription=getIntent().getStringExtra("description");
        photolist=getIntent().getIntegerArrayListExtra("imagearraylist");
        positon=getIntent().getIntExtra("position",0);
        Log.d(TAG, "onCreate: "+photolist+imagedescription+positon);
        requestdescription=findViewById(R.id.requestdescription);
       circleImageView=findViewById(R.id.requestimageview);


    }

    @Override
    protected void onStart() {
        super.onStart();
        requestdescription.setText(imagedescription);
        circleImageView.setImageResource(photolist.get(positon));
    }
}

