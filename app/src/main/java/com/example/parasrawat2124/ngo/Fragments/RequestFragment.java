package com.example.parasrawat2124.ngo.Fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.parasrawat2124.ngo.Adapters.RequestRecyclerAdapter;
import com.example.parasrawat2124.ngo.R;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class RequestFragment extends Fragment {
    ArrayList<Integer> photoarray=new ArrayList<>();
    ArrayList<String> description=new ArrayList<>();
    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    RequestRecyclerAdapter adapter;
    View view;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.requests,container,false);
        photoarray.add(R.drawable.poverty);
        description.add("Poverty Description \n One of the major cause for Indias high reputation");
        photoarray.add(R.drawable.childlabour);
        description.add("Child labour description \n Key factor to hamper tha hampers the youth of our country");
        photoarray.add(R.drawable.garbage);
        description.add("Garbage description \n The current issue targetted by our government under SWATCH BHARAT ABHIYAN");
        photoarray.add(R.drawable.women);
        description.add("Feminism description \n Need of equal rights for men and women");
        recyclerView=view.findViewById(R.id.requestrecyclerview);
        layoutManager=new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);
        adapter=new RequestRecyclerAdapter(photoarray,description,getContext());
        recyclerView.setAdapter(adapter);
        return view;
    }
}
