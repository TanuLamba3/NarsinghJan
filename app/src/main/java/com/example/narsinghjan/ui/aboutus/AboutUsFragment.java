package com.example.narsinghjan.ui.aboutus;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.narsinghjan.LinkActivity;
import com.example.narsinghjan.R;
import com.example.narsinghjan.databinding.FragmentAboutusBinding;
import com.example.narsinghjan.databinding.FragmentAboutusBinding;
import com.example.narsinghjan.databinding.FragmentHomeBinding;

public class AboutUsFragment extends Fragment {

    private AboutUsViewModel homeViewModel;
    private FragmentAboutusBinding binding;
    //private View view;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
//        homeViewModel =
//                new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentAboutusBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        TextView link = root.findViewById(R.id.link);

        link.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), LinkActivity.class);
                intent.putExtra("some", "some data");
                startActivity(intent);
            }
        });


//        final TextView textView = binding.textHome;
//        homeViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
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