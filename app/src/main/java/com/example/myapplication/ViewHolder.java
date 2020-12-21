package com.example.myapplication;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import de.hdodenhof.circleimageview.CircleImageView;

public class ViewHolder extends RecyclerView.ViewHolder{
public TextView txtName,descr;
public CircleImageView profileImage;
        public ViewHolder(@NonNull View itemView) {
        super(itemView);
        txtName = (TextView) itemView. findViewById (R.id.txtName);
        descr = (TextView) itemView.findViewById (R.id.description);
        profileImage = (CircleImageView) itemView.findViewById (R.id.profileImage);
        }
}


