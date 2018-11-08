package com.example.parasrawat2124.ngo.Adapters;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.parasrawat2124.ngo.R;
import com.example.parasrawat2124.ngo.RequestDetails;

import java.util.ArrayList;

public class RequestRecyclerAdapter extends RecyclerView.Adapter<RequestRecyclerAdapter.ViewHolder> {
    ArrayList<Integer> immagearraylist;
    ArrayList<String> descriptionarraylit;
    Context context;

    public RequestRecyclerAdapter(ArrayList<Integer> immagearraylist, ArrayList<String> descriptionarraylit,Context context) {
        this.context=context;
        this.immagearraylist = immagearraylist;
        this.descriptionarraylit = descriptionarraylit;
    }

    @NonNull
    @Override
    public RequestRecyclerAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.request_recyclerview_layout,viewGroup,false);
        ViewHolder viewHolder=new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RequestRecyclerAdapter.ViewHolder viewHolder, final int i) {
        viewHolder.imageView.setImageResource(immagearraylist.get(i));
        viewHolder.desc.setText(descriptionarraylit.get(i));
        viewHolder.requestrelativelayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int pos=i;
                String description=descriptionarraylit.get(i);
                Intent intent=new Intent(context,RequestDetails.class);
                intent.putExtra("description",description);
                intent.putExtra("position",pos);
                intent.putIntegerArrayListExtra("imagearraylist",immagearraylist);
                context.startActivity(intent);


            }
        });

    }

    @Override
    public int getItemCount() {
        return immagearraylist.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        CardView requestrelativelayout;
        TextView desc;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.recyclerimageview);
            desc=itemView.findViewById(R.id.recyclerdescription);
            requestrelativelayout=itemView.findViewById(R.id.requestrelativelayout);
        }
    }
}
