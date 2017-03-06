package com.example.vincevitale.recyclerviewwork;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder> {



    public static class ViewHolder extends RecyclerView.ViewHolder{

        TextView textViewName;
        TextView textViewVersion;
        ImageView imageViewIcon;

        public ViewHolder(View itemView){
            super(itemView);
            textViewName = (TextView) itemView.findViewById(R.id.textViewName);
            textViewVersion = (TextView) itemView.findViewById(R.id.textViewVersion);
            imageViewIcon = (ImageView) itemView.findViewById(R.id.imageView);
        }

    }

    private ArrayList<DataModel> dataSet;

    public CustomAdapter(ArrayList<DataModel> data){
        dataSet = data;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cards_layout, parent, false);

        view.setOnClickListener(MainActivity.myClickLinstener);

        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, final int listPosition){
        TextView textViewName = holder.textViewName;
        TextView textViewVersion = holder.textViewVersion;
        ImageView imageView = holder.imageViewIcon;

        textViewName.setText(dataSet.get(listPosition).getName());
        textViewVersion.setText(dataSet.get(listPosition).getName());
        imageView.setImageResource(dataSet.get(listPosition).getImage());
    }

    @Override
    public int getItemCount(){
        return dataSet.size();
    }
}
