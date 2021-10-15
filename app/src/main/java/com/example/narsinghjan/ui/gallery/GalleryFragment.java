package com.example.narsinghjan.ui.gallery;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import com.example.narsinghjan.Adapters.GalleryRecyclerViewAdapter;
import com.example.narsinghjan.Adapters.MainAdapter;
import com.example.narsinghjan.Adapters.MainModel;
import com.example.narsinghjan.Adapters.images;
import com.example.narsinghjan.FullImageActivity;
import com.example.narsinghjan.ImageAdapter;
import com.example.narsinghjan.R;
import com.example.narsinghjan.databinding.FragmentGalleryBinding;
import com.example.narsinghjan.databinding.FragmentGalleryBinding;

import java.util.ArrayList;
import java.util.List;

public class GalleryFragment extends Fragment {
    GridView gridView;

    private GalleryViewModel slideshowViewModel;
    private FragmentGalleryBinding binding;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        //slideshowViewModel =
              //  new ViewModelProvider(this).get(GalleryViewModel.class);

        binding = FragmentGalleryBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        View view = inflater.inflate(R.layout.fragment_gallery, container, false);

        RecyclerView galleryRecyclerView =view.findViewById(R.id.galleryRecyclerView);
        galleryRecyclerView.setLayoutManager(new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL));
        List<images> imagesList=new ArrayList<>();
        imagesList.add(new images(R.drawable.backgroundimage));
        imagesList.add(new images(R.drawable.eight));
        imagesList.add(new images(R.drawable.eighteen));
        imagesList.add(new images(R.drawable.eleven));
        imagesList.add(new images(R.drawable.facebook));
        imagesList.add(new images(R.drawable.fifteen));
        imagesList.add(new images(R.drawable.five));
        imagesList.add(new images(R.drawable.four));
        imagesList.add(new images(R.drawable.backgroundimage));
        imagesList.add(new images(R.drawable.eight));
        imagesList.add(new images(R.drawable.eighteen));
        imagesList.add(new images(R.drawable.eleven));
        imagesList.add(new images(R.drawable.facebook));
        imagesList.add(new images(R.drawable.fifteen));
        imagesList.add(new images(R.drawable.five));
        imagesList.add(new images(R.drawable.four));
        imagesList.add(new images(R.drawable.backgroundimage));
        imagesList.add(new images(R.drawable.eight));
        imagesList.add(new images(R.drawable.eighteen));
        imagesList.add(new images(R.drawable.eleven));
        imagesList.add(new images(R.drawable.facebook));
        imagesList.add(new images(R.drawable.fifteen));
        imagesList.add(new images(R.drawable.five));
        imagesList.add(new images(R.drawable.four));
        galleryRecyclerView.setAdapter(new GalleryRecyclerViewAdapter(imagesList));
        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}