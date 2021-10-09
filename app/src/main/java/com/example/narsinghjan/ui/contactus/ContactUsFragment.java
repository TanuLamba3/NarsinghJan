package com.example.narsinghjan.ui.contactus;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.narsinghjan.FacebookActivity;
import com.example.narsinghjan.InstagramActivity;
import com.example.narsinghjan.R;
import com.example.narsinghjan.TwitterActivity;
import com.example.narsinghjan.databinding.FragmentContactusBinding;
import com.example.narsinghjan.databinding.FragmentGalleryBinding;

public class ContactUsFragment extends Fragment {

    private ContactUsViewModel galleryViewModel;
    private FragmentContactusBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
//        galleryViewModel =
//                new ViewModelProvider(this).get(GalleryViewModel.class);

        binding = FragmentContactusBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        ImageView facebook = root.findViewById(R.id.facebook);
        ImageView instagram = root.findViewById(R.id.instagram);
        ImageView twitter = root.findViewById(R.id.twitter);

//        final TextView textView = binding.textGallery;
//        galleryViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
//            @Override
//            public void onChanged(@Nullable String s) {
//                textView.setText(s);
//            }
//        });

        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), FacebookActivity.class);
                intent.putExtra("some", "some data");
                startActivity(intent);
            }
        });

        instagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), InstagramActivity.class);
                intent.putExtra("some", "some data");
                startActivity(intent);
            }
        });

        twitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), TwitterActivity.class);
                intent.putExtra("some", "some data");
                startActivity(intent);
            }
        });

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}