package com.example.retrofitapi;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.bumptech.glide.Glide;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class AdapterRv extends RecyclerView.Adapter<AdapterRv.MyViewHolder>
{


    List<Result> ResultList;
    Context context;

    public AdapterRv(List<Result> resultList, Context context) {
        ResultList = resultList;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.row,parent,false);
        return new MyViewHolder(view);

    }

    @SuppressLint("CheckResult")
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position)
    {

        Result result = ResultList.get(position);
        holder.email.setText(result.getEmail());
        holder.phone.setText(result.getPhone());
        Glide.with(context).load(result.getPicture().getThumbnail()).into(holder.imageView);

    }

    @Override
    public int getItemCount() {
        return ResultList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder
    {
        TextView email,phone;
        CircleImageView imageView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);


            email = itemView.findViewById(R.id.email);
            phone = itemView.findViewById(R.id.phone);
            imageView = itemView.findViewById(R.id.imageview);



        }
    }
}
