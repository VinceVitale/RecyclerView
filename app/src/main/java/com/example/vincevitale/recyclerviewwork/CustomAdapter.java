package com.example.vincevitale.recyclerviewwork;

import android.support.v7.widget.RecyclerView;
import android.view.View;
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
}
