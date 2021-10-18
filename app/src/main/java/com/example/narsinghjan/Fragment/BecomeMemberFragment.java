package com.example.narsinghjan.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.example.narsinghjan.BecomeMem2;
import com.example.narsinghjan.BecomeMem3;
import com.example.narsinghjan.Classes.Portfolio;
import com.example.narsinghjan.R;
import com.example.narsinghjan.databinding.FragmentBecomeMemberBinding;
import com.example.narsinghjan.databinding.FragmentLanguageBinding;


public class BecomeMemberFragment extends Fragment {

    private FragmentBecomeMemberBinding binding;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentBecomeMemberBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        // Inflate the layout for this fragment
//        EditText name=root.findViewById(R.id.Name);
//        EditText email=root.findViewById(R.id.EmailAddress);
//        EditText phone=root.findViewById(R.id.Phone);
//        BecomeMem3.p.setName(name.getText().toString());
//        BecomeMem3.p.setEmail(email.getText().toString());
//        BecomeMem3.p.setPhone(phone.getText().toString());
        return root;
    }
}