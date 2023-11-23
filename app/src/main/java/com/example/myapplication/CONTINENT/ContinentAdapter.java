package com.example.myapplication.CONTINENT;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.OnClick;
import com.example.myapplication.R;

import java.util.ArrayList;

public class ContinentAdapter extends RecyclerView.Adapter<ContinentViewHolder> {
    private ArrayList<ContinentModel> continentModels;
    private OnClick onClick;

    public ContinentAdapter(ArrayList<ContinentModel> continentModels,OnClick onClick1) {
        this.continentModels = continentModels;
        this.onClick = onClick1;
    }


    @NonNull
    @Override
    public ContinentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ContinentViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_continent,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ContinentViewHolder holder, int position) {
        holder.bind(continentModels.get(position));
        holder.itemView.setOnClickListener(v -> {
            onClick.onClick(position);
        });
    }

    @Override
    public int getItemCount() {
        return continentModels.size();
    }
}
