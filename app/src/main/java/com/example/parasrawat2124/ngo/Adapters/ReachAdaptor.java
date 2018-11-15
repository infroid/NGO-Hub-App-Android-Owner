package com.example.parasrawat2124.ngo.Adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.parasrawat2124.ngo.R;

import java.util.ArrayList;

public class ReachAdaptor extends RecyclerView.Adapter<ReachAdaptor.Viewholder> {
    ArrayList<String> arrayList=new ArrayList<>();
    @NonNull
    @Override
    public ReachAdaptor.Viewholder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        arrayList.add("hu");
        arrayList.add("hu");
        arrayList.add("hu");
        arrayList.add("hu");
        arrayList.add("hu");
        arrayList.add("hu");
        arrayList.add("hu");
        arrayList.add("hu");
        arrayList.add("hu");
        arrayList.add("hu");
        View view=LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.reachrecyclerlayout,viewGroup,false);
        ReachAdaptor.Viewholder viewHolder=new ReachAdaptor.Viewholder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ReachAdaptor.Viewholder viewholder, final int i) {
        viewholder.publish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                arrayList.remove(i);
                notifyItemRemoved(i);
                notifyItemRangeChanged(i,arrayList.size());
            }
        });

    }

    @Override
    public int getItemCount() {
        return 10;
    }

    public class Viewholder extends RecyclerView.ViewHolder {
        TextView publish;
        public Viewholder(@NonNull View itemView) {
            super(itemView);
            publish=itemView.findViewById(R.id.publish);
        }
    }
}
