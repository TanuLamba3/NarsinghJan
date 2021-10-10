package com.example.narsinghjan.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.example.narsinghjan.Adapters.MainAdapter;
import com.example.narsinghjan.Adapters.MainModel;
import com.example.narsinghjan.R;
import com.example.narsinghjan.databinding.FragmentGalleryBinding;
import com.example.narsinghjan.databinding.FragmentMemberListBinding;
import com.example.narsinghjan.ui.gallery.GalleryViewModel;

import java.util.ArrayList;


public class MemberListFragment extends Fragment {
    //private ArrayList<MainModel> list = new ArrayList<>();
//implements MainAdapter.viewholder
    private ArrayList<MainModel> list = new ArrayList<>();


    private GalleryViewModel slideshowViewModel;
    private FragmentMemberListBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

         View view = inflater.inflate(R.layout.fragment_member_list,container,false);
//         initRecyclerView(view);
//         buildListData();

        binding = FragmentMemberListBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

//        ArrayList<MainModel> list = new ArrayList<>();
//        list.add(new MainModel(R.drawable.memtwo,"Vijender singh verma"));
//        list.add(new MainModel(R.drawable.memtwo,"Rajni Pareshar"));
//        list.add(new MainModel(R.drawable.memtwo,"Dinesh Kumar Gupta"));
//        list.add(new MainModel(R.drawable.memtwo,"Bhagwatacharya vishal krishna sharma"));
//        list.add(new MainModel(R.drawable.memtwo,"Ashwani kumar sharma"));
//        list.add(new MainModel(R.drawable.memtwo,"ADV. Abhishek Bhatt"));
//        list.add(new MainModel(R.drawable.memtwo,"Deepak Sharma"));
//        list.add(new MainModel(R.drawable.memtwo,"Mr. Vinod kumar"));
//        list.add(new MainModel(R.drawable.memtwo,"Hiresh singh"));
//        list.add(new MainModel(R.drawable.memtwo,"Aditya Chaturvedi"));
//        list.add(new MainModel(R.drawable.memtwo,"Varun Shaurya"));
//        list.add(new MainModel(R.drawable.memtwo,"Sangeeta Sharma"));

//        MainAdapter adapter = new MainAdapter(list , GalleryFragment.this);
//        binding.recyclerViewAcc.setAdapter(adapter);
//        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
//        binding.recyclerViewAcc.setLayoutManager(layoutManager);

        // Inflate the layout for this fragment
        return view;
    }

//    private void initRecyclerView(View view){
//        RecyclerView recyclerView = view.findViewById(R.id.recyclerViewAcc);
//        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
//
//        recyclerView.setLayoutManager(layoutManager);
//        MainAdapter adapter = new MainAdapter(list,this);
//        recyclerView.setAdapter(adapter);
//    }
//    private void buildListData(){
//        list.add(new MainModel(R.drawable.memtwo,"Vijender singh verma"));
//        list.add(new MainModel(R.drawable.memtwo,"Rajni Pareshar"));
//        list.add(new MainModel(R.drawable.memtwo,"Dinesh Kumar Gupta"));
//        list.add(new MainModel(R.drawable.memtwo,"Bhagwatacharya vishal krishna sharma"));
//        list.add(new MainModel(R.drawable.memtwo,"Ashwani kumar sharma"));
//        list.add(new MainModel(R.drawable.memtwo,"ADV. Abhishek Bhatt"));
//        list.add(new MainModel(R.drawable.memtwo,"Deepak Sharma"));
//        list.add(new MainModel(R.drawable.memtwo,"Mr. Vinod kumar"));
//        list.add(new MainModel(R.drawable.memtwo,"Hiresh singh"));
//        list.add(new MainModel(R.drawable.memtwo,"Aditya Chaturvedi"));
//        list.add(new MainModel(R.drawable.memtwo,"Varun Shaurya"));
//        list.add(new MainModel(R.drawable.memtwo,"Sangeeta Sharma"));
//    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}