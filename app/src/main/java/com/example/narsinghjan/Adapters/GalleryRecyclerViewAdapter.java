package com.example.narsinghjan.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.narsinghjan.R;
import com.makeramen.roundedimageview.RoundedImageView;

import java.util.List;

public class GalleryRecyclerViewAdapter extends RecyclerView.Adapter<GalleryRecyclerViewAdapter.GalleryRecyclerViewHolder>{

    private List<images> imagesList;

    public GalleryRecyclerViewAdapter(List<images> imagesList) {
        this.imagesList = imagesList;
    }

    @NonNull
    @Override
    public GalleryRecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new GalleryRecyclerViewHolder(LayoutInflater.from(parent.getContext()).inflate(
                R.layout.post_item_container,
                parent,
                false
        ));
    }

    @Override
    public void onBindViewHolder(@NonNull GalleryRecyclerViewHolder holder, int position) {
        holder.setGalleryImage(imagesList.get(position));
    }

    @Override
    public int getItemCount() {
        return imagesList.size();
    }

    class GalleryRecyclerViewHolder extends RecyclerView.ViewHolder{

        RoundedImageView roundedImageView;

        public GalleryRecyclerViewHolder(@NonNull View itemView) {
            super(itemView);
            roundedImageView=itemView.findViewById(R.id.imageGallery);
        }

        void setGalleryImage(images image){
            roundedImageView.setImageResource(image.getImage());
        }
    }
}
