package com.example.villageos;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import java.util.ArrayList;



public class noticeAdapter extends RecyclerView.Adapter<noticeAdapter.ViewHolder>{


    ArrayList<NoticeModel> list;



    public noticeAdapter(ArrayList<NoticeModel> list)
    {
        this.list=list;
    }




    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {

        View view= LayoutInflater.from(parent.getContext())
                .inflate(R.layout.noticecard,parent,false);


        return new ViewHolder(view);

    }





    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position)
    {

        NoticeModel model=list.get(position);


        holder.title.setText("📢 "+model.getTitle());

        holder.desc.setText(model.getDesc());

        holder.date.setText("📅 "+model.getDate());


    }





    @Override
    public int getItemCount()
    {
        return list.size();
    }





    public class ViewHolder extends RecyclerView.ViewHolder{


        TextView title,desc,date;


        public ViewHolder(@NonNull View itemView)
        {
            super(itemView);


            title=itemView.findViewById(R.id.title);

            desc=itemView.findViewById(R.id.desc);

            date=itemView.findViewById(R.id.date);

        }

    }

}