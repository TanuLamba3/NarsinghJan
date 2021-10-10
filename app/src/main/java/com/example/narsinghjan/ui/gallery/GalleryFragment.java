package com.example.narsinghjan.ui.gallery;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.narsinghjan.Adapters.MainAdapter;
import com.example.narsinghjan.Adapters.MainModel;
import com.example.narsinghjan.R;
import com.example.narsinghjan.databinding.FragmentGalleryBinding;
import com.example.narsinghjan.databinding.FragmentGalleryBinding;

import java.util.ArrayList;

public class GalleryFragment extends Fragment {

    private GalleryViewModel slideshowViewModel;
    private FragmentGalleryBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        //slideshowViewModel =
              //  new ViewModelProvider(this).get(GalleryViewModel.class);

        binding = FragmentGalleryBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        ArrayList<MainModel> list = new ArrayList<>();
        list.add(new MainModel(R.drawable.memtwo,"Vijender singh verma"));
        list.add(new MainModel(R.drawable.memtwo,"Rajni Pareshar"));
        list.add(new MainModel(R.drawable.memtwo,"Dinesh Kumar Gupta"));
        list.add(new MainModel(R.drawable.memtwo,"Bhagwatacharya vishal krishna sharma"));
        list.add(new MainModel(R.drawable.memtwo,"Ashwani kumar sharma"));
        list.add(new MainModel(R.drawable.memtwo,"ADV. Abhishek Bhatt"));
        list.add(new MainModel(R.drawable.memtwo,"Deepak Sharma"));
        list.add(new MainModel(R.drawable.memtwo,"Mr. Vinod kumar"));
        list.add(new MainModel(R.drawable.memtwo,"Hiresh singh"));
        list.add(new MainModel(R.drawable.memtwo,"Aditya Chaturvedi"));
        list.add(new MainModel(R.drawable.memtwo,"Varun Shaurya"));
        list.add(new MainModel(R.drawable.memtwo,"Sangeeta Sharma"));

        MainAdapter adapter = new MainAdapter(list , GalleryFragment.this);
        binding.gridView.setAdapter(adapter);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        binding.gridView.setLayoutManager(layoutManager);

        //setContentView(R.layout.activity_account);


//        final TextView textView = binding.textSlideshow;
//        GalleryViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
//            @Override
//            public void onChanged(@Nullable String s) {
//                textView.setText(s);
//            }
//        });
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}