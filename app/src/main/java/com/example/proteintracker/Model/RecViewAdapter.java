package com.example.proteintracker.Model;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.proteintracker.R;

import java.util.ArrayList;

public class RecViewAdapter extends RecyclerView.Adapter<RecViewAdapter.ViewHolder> {

    private final ArrayList<Mahasiswa> dataList;

    public RecViewAdapter(ArrayList<Mahasiswa> dataList){
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater =  LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.card_view_mhs, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position)
    {
        holder.nama.setText(dataList.get(position).getNama());
        holder.npm.setText(dataList.get(position).getNpm());
        holder.nohp.setText(dataList.get(position).getNohp());
    }

    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView nama,npm,nohp;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            nama = itemView.findViewById(R.id.txt_nama_mahasiswa);
            npm  = itemView.findViewById(R.id.txt_npm_mahasiswa);
            nohp = itemView.findViewById(R.id.txt_nohp_mahasiswa);
        }
    }
}
