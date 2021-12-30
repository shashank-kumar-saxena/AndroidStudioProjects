package com.shsnk.recviewwithimg;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class RecViewAdapter extends RecyclerView.Adapter<RecViewAdapter.ViewHolder> {

    private ArrayList<Content> contents=new ArrayList<>();
    private Context context;
    public void setContents(ArrayList<Content> contents) {
        this.contents = contents;
        notifyDataSetChanged();
    }

    public RecViewAdapter(Context context) {
        this.context=context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view =LayoutInflater.from(parent.getContext()).inflate(R.layout.items,parent,false);
       ViewHolder holder =new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.Names.setText(contents.get(position).getName());
        holder.Emails.setText(contents.get(position).getEmail());
        Glide.with(context)
                .asBitmap()
                .load(contents.get(position)
                        .getImgURL())
                .into(holder.image);
        /*
        after it we use user condition in manifests Folder
         */
    }

    @Override
    public int getItemCount() {
        return contents.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView Names, Emails;
        private ImageView image;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            Names = itemView.findViewById(R.id.names);
            Emails = itemView.findViewById(R.id.email);
            image = itemView.findViewById(R.id.images);
        }
    }
}
