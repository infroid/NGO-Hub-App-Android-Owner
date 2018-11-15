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

import com.example.parasrawat2124.ngo.Adapters.ReachAdaptor;
import com.example.parasrawat2124.ngo.R;

public class ReachFragment extends Fragment {
    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    ReachAdaptor reachAdaptor;
    View view;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.reach_out,container,false);
        recyclerView=view.findViewById(R.id.reachvolunteersrecyclerview);
        layoutManager=new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,true);
        recyclerView.setLayoutManager(layoutManager);
        reachAdaptor =new ReachAdaptor();
        recyclerView.setAdapter(reachAdaptor);

        return view;
    }
}
