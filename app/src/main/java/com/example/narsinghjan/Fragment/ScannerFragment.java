package com.example.narsinghjan.Fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import com.example.narsinghjan.databinding.FragmentScannerBinding;
import com.example.narsinghjan.scannerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.narsinghjan.R;
import com.example.narsinghjan.databinding.FragmentHomeBinding;


public class ScannerFragment extends Fragment {

    Button scanBtn;
    public static TextView scanTxt;

    private FragmentScannerBinding binding;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentScannerBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        View view = inflater.inflate(R.layout.fragment_scanner, container, false);

        scanBtn = view.findViewById(R.id.scanBtn);
        scanTxt = view.findViewById(R.id.scanTxt);
        scanBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), scannerView.class);
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