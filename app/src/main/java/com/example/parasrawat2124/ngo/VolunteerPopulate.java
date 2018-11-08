package com.example.parasrawat2124.ngo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class VolunteerPopulate extends AppCompatActivity {
    String volunteername;
    String volunteerlocation;
    String volunteerstatus;
    TextView vdesc;
    ArrayList<Integer> photoarray;
    ArrayList<String> volunteerdescription;
    int imagePosition;
    TextView vname;
    TextView vcountry;
    TextView vstatus;
    CircleImageView circleImageView;
    public static final String TAG="VOLUNTEER POPULATE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volunteer_populate);
        volunteerdescription=new ArrayList<>();
        volunteername=getIntent().getStringExtra("name");
        volunteerlocation=getIntent().getStringExtra("location");
        photoarray=getIntent().getIntegerArrayListExtra("imagelist");
        volunteerstatus=getIntent().getStringExtra("status");
        vdesc=findViewById(R.id.volunteerdescription);
        imagePosition=getIntent().getIntExtra("position",0);
        Log.d(TAG, "onCreate: ========================"+volunteerstatus + volunteername+volunteerlocation+imagePosition);

        Log.d(TAG, "onCreate: ===================+++++++____+++__====="+photoarray);

        circleImageView=findViewById(R.id.volunteerpopulateimageview);
        vname=findViewById(R.id.name);
        vcountry=findViewById(R.id.country);
        volunteerdescription.add(volunteername+" is As a form of social manipulation, praise is a form of reward and furthers behavioral reinforcement by conditioning. The influence of praise on an individual can depend on many factors, including the context, the meanings the praise may convey, and the characteristics and interpretations of the recipient.[2] ");

        vstatus=findViewById(R.id.currentstatus);

    }

    @Override
    protected void onStart() {
        super.onStart();

        vname.setText(volunteername);
        vstatus.setText(volunteerstatus);
        vcountry.setText(volunteerlocation);
        circleImageView.setImageResource(photoarray.get(imagePosition));
        vdesc.setText(volunteerdescription.get(0));

    }
}
