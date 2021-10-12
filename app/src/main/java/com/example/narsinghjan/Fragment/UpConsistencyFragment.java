package com.example.narsinghjan.Fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.narsinghjan.R;
import com.example.narsinghjan.databinding.FragmentUpConsistencyBinding;
import com.example.narsinghjan.upContActivity2;

public class UpConsistencyFragment extends Fragment {

    Button selectBtn;

    private FragmentUpConsistencyBinding binding;

    public UpConsistencyFragment() {
        //constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentUpConsistencyBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        View view = inflater.inflate(R.layout.fragment_up_consistency, container, false);
        selectBtn = view.findViewById(R.id.selectBtn);

        selectBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), upContActivity2.class);
                startActivity(intent);
            }
        });

        // Inflate the layout for this fragment
        return view;
    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}