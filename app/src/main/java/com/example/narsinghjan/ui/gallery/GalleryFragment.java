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

import com.example.narsinghjan.Adapters.MainAdapter;
import com.example.narsinghjan.Adapters.MainModel;
import com.example.narsinghjan.FullImageActivity;
import com.example.narsinghjan.ImageAdapter;
import com.example.narsinghjan.R;
import com.example.narsinghjan.databinding.FragmentGalleryBinding;
import com.example.narsinghjan.databinding.FragmentGalleryBinding;

import java.util.ArrayList;

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
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        gridView = view.findViewById(R.id.grid_view);


        //gridView.setAdapter(new ImageAdapter(getContext()));

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getActivity(), FullImageActivity.class);
                intent.putExtra("l", i);
                startActivity(intent);
            }
        });



//        ImageAdapter adapter = new ImageAdapter(getContext());
//        binding.gridView.setAdapter(adapter);
//        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        //binding.gridView.setLayoutManager(layoutManager);

        //setContentView(R.layout.activity_account);


//        final TextView textView = binding.textSlideshow;
//        GalleryViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
//            @Override
//            public void onChanged(@Nullable String s) {
//                textView.setText(s);
//            }
//        });
        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}