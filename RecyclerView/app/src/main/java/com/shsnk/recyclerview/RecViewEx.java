package com.shsnk.recyclerview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Locale;

public class RecViewEx extends RecyclerView.Adapter<RecViewEx.ViewHolder>{

    ArrayList<Names> names = new ArrayList<>();

    public void setNames(ArrayList<Names> names) {
        this.names = names;
        notifyDataSetChanged();
    }
    Context context;

    public RecViewEx(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.rec_view,parent,false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, @SuppressLint("RecyclerView") final int position) {
        holder.txt.setText(names.get(position).getNames().toUpperCase(Locale.ROOT));
        holder.lyout.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(context, names.get(position).getNames() + " Selected", Toast.LENGTH_SHORT).show();
                return true;
            }
        });
    }

    @Override
    public int getItemCount() {
        return names.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {
        TextView txt;
        LinearLayout lyout;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txt=itemView.findViewById(R.id.text);
            lyout=itemView.findViewById(R.id.LLayout);
        }
    }
}
