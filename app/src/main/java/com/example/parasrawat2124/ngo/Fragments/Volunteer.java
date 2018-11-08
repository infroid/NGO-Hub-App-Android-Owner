package com.example.parasrawat2124.ngo.Fragments;

import android.location.Location;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.parasrawat2124.ngo.Adapters.VolunteerAdaptor;
import com.example.parasrawat2124.ngo.R;

import java.util.ArrayList;

public class Volunteer extends Fragment {
    RecyclerView recyclerView;
    VolunteerAdaptor volunteerAdaptor;
    RecyclerView.LayoutManager layoutManager;
    ArrayList<String> names=new ArrayList<>();
    ArrayList<String> location=new ArrayList<>();
    ArrayList<String> status=new ArrayList<>();
    ArrayList<Integer> photolist=new ArrayList<>();


    View view;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.volunteer,container,false);
        photolist.add(R.drawable.people1);
        names.add("George");
        names.add("Gaile");
        names.add("Gemanei");
        names.add("Gasmine");
        names.add("Sorty");
        names.add("Helina");
        names.add("Mister");
        names.add("Mistress");
        photolist.add(R.drawable.people2);
        location.add("United Arab");
        location.add("Germany");
        location.add("Indonesia");
        location.add("India");
        location.add("France");
        location.add("USA");
        location.add("America");
        location.add("India");
        status.add("Busy");
        status.add("Inactive");
        status.add("Busy");
        status.add("Active");
        status.add("Busy");
        status.add("Free");
        status.add("Active");
        status.add("Free");
        photolist.add(R.drawable.people3);
        photolist.add(R.drawable.people4);
        photolist.add(R.drawable.people6);
        photolist.add(R.drawable.people7);
        photolist.add(R.drawable.people5);
        recyclerView=view.findViewById(R.id.volunteerrecyclerview);
        layoutManager=new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);
        volunteerAdaptor=new VolunteerAdaptor(names,location,status,photolist,getContext());
        recyclerView.setAdapter(volunteerAdaptor);
        return view;
    }
}
