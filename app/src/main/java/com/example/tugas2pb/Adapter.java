package com.example.tugas2pb;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    private ArrayList<Model> model;


    public Adapter(ArrayList<Model> model) {
        this.model = model;
    }

    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
       ViewHolder vh = new ViewHolder(view);

        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position) {
        holder.namaM.setText(model.get(position).getNamaM());
        holder.fotoM.setImageResource(model.get(position).getFotoM());
    }

    @Override
    public int getItemCount() {
        return model.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {



        TextView namaM;
        ImageView fotoM;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            namaM = itemView.findViewById(R.id.nama);
            fotoM = itemView.findViewById(R.id.foto);
        }
    }
}
