package com.example.fragmentwithrv;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ShoesAdapter extends RecyclerView.Adapter<ShoesAdapter.ViewHolder>{

    private ArrayList<ShoesModel> ShoesList = new ArrayList<>();
    private Context context;

    public ShoesAdapter(Context context) {
        this.context = context;
    }

    public ArrayList<ShoesModel> getShoeList() {
        return ShoesList;
    }

    public void setShoeList(ArrayList<ShoesModel> shoesList) {
        this.ShoesList = shoesList;
    }

    @NonNull
    @Override
    public ShoesAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemRow = LayoutInflater.from(parent.getContext()).inflate(R.layout.shoes_stock, parent, false);
        return new ViewHolder(itemRow);
    }


    @Override
    public void onBindViewHolder(@NonNull ShoesAdapter.ViewHolder holder, final int position) {
        holder.ivShoes.setImageResource(getShoeList().get(position).getShoesImage());
        holder.tvName.setText(getShoeList().get(position).getShoesName());
        holder.btnView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, ShoesDetail.class);
                intent.putExtra("img_url", getShoeList().get(position).getShoesImage());
                intent.putExtra("title", getShoeList().get(position).getShoesName());
                intent.putExtra("detail", getShoeList().get(position).getShoesDetail());
                context.startActivity(intent);
            }
        });

        holder.btnShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                String shoesName = "Merk Sepatu " + getShoeList().get(position).getShoesName();
                intent.putExtra(Intent.EXTRA_TEXT, shoesName);
                context.startActivity(Intent.createChooser(intent, "Share"));
            }
        });
    }

    @Override
    public int getItemCount() {
        return getShoeList().size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView ivShoes;
        TextView tvName;
        Button btnView, btnShare;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ivShoes = itemView.findViewById(R.id.shoes_img);
            tvName = itemView.findViewById(R.id.shoes_tv_nama);
            btnView = itemView.findViewById(R.id.btn_view);
            btnShare = itemView.findViewById(R.id.btn_share);
        }
    }
}
