package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<ViewHolder> {
private List<ItemList> itemNames;
public Adapter(List<ItemList> itemNames){
        this.itemNames = itemNames;
        }

@NonNull
@Override
public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
        .inflate(R.layout.items, parent, false);
        return new ViewHolder(itemView);
        }

        @Override
public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ItemList item= itemNames.get(position);
        holder.txtName.setText(item.getName());
        holder.descr.setText(item.getDiscreption());
        Picasso.with(holder.txtName.getContext()).load(item.getProfilePhotoLocation()).into(holder.profileImage);

        }
        @Override
        public int getItemCount() {
                return itemNames.size();
        }
}

