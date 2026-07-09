package com.example.villageos;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import java.util.ArrayList;



public class healthadadapter extends RecyclerView.Adapter<healthadadapter.ViewHolder>{


    ArrayList<healthmodel> list;



    public healthadadapter(ArrayList<healthmodel> list)
    {
        this.list=list;
    }



    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {

        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.healthcamp,parent,false);


        return new ViewHolder(view);

    }



    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position)
    {


        healthmodel model=list.get(position);


        holder.name.setText("🏥 "+model.getCampName());

        holder.date.setText("📅 "+model.getDate());

        holder.location.setText("📍 "+model.getLocation());

        holder.desc.setText(model.getDescription());


    }



    @Override
    public int getItemCount()
    {
        return list.size();
    }




    public class ViewHolder extends RecyclerView.ViewHolder{


        TextView name,date,location,desc;


        public ViewHolder(@NonNull View itemView)
        {
            super(itemView);


            name=itemView.findViewById(R.id.campName);

            date=itemView.findViewById(R.id.campDate);

            location=itemView.findViewById(R.id.campLocation);

            desc=itemView.findViewById(R.id.campDescription);


        }
    }

}