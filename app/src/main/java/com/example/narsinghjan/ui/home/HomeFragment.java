package com.example.narsinghjan.ui.home;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.narsinghjan.LinkActivity;
import com.example.narsinghjan.R;
import com.example.narsinghjan.databinding.FragmentAboutusBinding;
import com.example.narsinghjan.databinding.FragmentHomeBinding;
import com.example.narsinghjan.ui.aboutus.AboutUsFragment;


public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        View view = inflater.inflate(R.layout.fragment_home,container,false);
        TextView moreTxt = view.findViewById(R.id.moreTxt);

        moreTxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                bundle.putString("key",moreTxt.getText().toString());
                AboutUsFragment aboutUsFragment = new AboutUsFragment();
                aboutUsFragment.setArguments(bundle);
                getFragmentManager().beginTransaction().replace(R.id.moreTxt,aboutUsFragment).commit();
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