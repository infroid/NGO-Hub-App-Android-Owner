package com.example.parasrawat2124.ngo.Adapters;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.parasrawat2124.ngo.R;
import com.example.parasrawat2124.ngo.VolunteerPopulate;

import org.w3c.dom.Text;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class VolunteerAdaptor extends RecyclerView.Adapter<VolunteerAdaptor.ViewHolder> {
    ArrayList<String> names;
    ArrayList<String> location;
    ArrayList<String> status;
    ArrayList<Integer> photolist;
    Context context;

    public VolunteerAdaptor(ArrayList<String> names, ArrayList<String> location, ArrayList<String> status, ArrayList<Integer> photolist, Context context) {
        this.names = names;
        this.location = location;
        this.status = status;
        this.photolist = photolist;
        this.context = context;
    }

    @NonNull
    @Override
    public VolunteerAdaptor.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.volunteer_list,viewGroup,false);
        VolunteerAdaptor.ViewHolder viewHolder=new VolunteerAdaptor.ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull final VolunteerAdaptor.ViewHolder viewHolder, final int i) {

        viewHolder.Name.setText(names.get(i));
        viewHolder.Location.setText(location.get(i));
        viewHolder.Status.setText(status.get(i));
        viewHolder.imageView.setImageResource(photolist.get(i));
        viewHolder.relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name=names.get(i);
                String loc=location.get(i);
                String stat=status.get(i);
                int pos=i;
                Intent intent=new Intent(context,VolunteerPopulate.class);
                intent.putExtra("name",name);
                intent.putExtra("location",loc);
                intent.putExtra("status",stat);
                intent.putExtra("position",i);
                intent.putExtra("imagelist",photolist);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return photolist.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView Name;
        TextView Status;
        TextView Location;
        RelativeLayout relativeLayout;
        CircleImageView imageView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            Name=itemView.findViewById(R.id.volunteername);
            Status=itemView.findViewById(R.id.status);
            Location=itemView.findViewById(R.id.location);
            imageView=itemView.findViewById(R.id.circularimageview);
            relativeLayout=itemView.findViewById(R.id.VolunteerRelativeLa);

        }
    }
}
