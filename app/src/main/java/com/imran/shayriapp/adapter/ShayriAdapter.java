package com.imran.shayriapp.adapter;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.imran.shayriapp.R;
import com.imran.shayriapp.model.ShayriModel;

import java.util.ArrayList;

public class ShayriAdapter extends RecyclerView.Adapter<ShayriAdapter.viewHolder> {
    Context context;
    ArrayList<ShayriModel>list;

    public ShayriAdapter(Context context,ArrayList<ShayriModel>list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.item_shayri,parent,false);
        return new viewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        final ShayriModel model = list.get(position);
        holder.tvShayri.setText(model.getShayri());

        holder.ivShare.setOnClickListener(view -> {
            Intent intent = new Intent();
            intent.setAction(Intent.ACTION_SEND);
            intent.putExtra(Intent.EXTRA_TEXT,model.getShayri() );
            intent.setType("text/plain");

            Intent shareIntent = Intent.createChooser(intent,null );
            context.startActivity(shareIntent);
        });

        holder.ivCopy.setOnClickListener(view -> {
            ClipboardManager manager = (ClipboardManager) context.getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData data = ClipData.newPlainText("Data",model.getShayri());
            assert manager != null;
            manager.setPrimaryClip(data);
            Toast.makeText(context, "Shayri Copied", Toast.LENGTH_SHORT).show();
        });
        holder.ivWhatsapp.setOnClickListener(view -> {
            Intent whtasappIntent = new Intent(Intent.ACTION_SEND);
            whtasappIntent.setPackage("com.whatsapp");
            whtasappIntent.putExtra(Intent.EXTRA_TEXT,model.getShayri());

            try{
                context.startActivity(whtasappIntent);
            }catch (android.content.ActivityNotFoundException e){
                Toast.makeText(context, e.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder{
        ImageView ivShare ,ivCopy,ivWhatsapp;
        TextView tvShayri;
        public viewHolder(@NonNull View itemView) {
            super(itemView);

            tvShayri = itemView.findViewById(R.id.tvShayri);
            ivShare = itemView.findViewById(R.id.ivShare);
            ivCopy = itemView.findViewById(R.id.ivCopy);
            ivWhatsapp = itemView.findViewById(R.id.ivWhatsapp);
        }
    }
}
