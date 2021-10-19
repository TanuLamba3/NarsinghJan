package com.example.narsinghjan.Fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.narsinghjan.BecomeMem2;
import com.example.narsinghjan.BecomeMem3;
import com.example.narsinghjan.R;
import com.example.narsinghjan.databinding.FragmentBecomeMemberBinding;
import com.example.narsinghjan.upContActivity2;


public class BecomeMemberFragment extends Fragment {

    private FragmentBecomeMemberBinding binding;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentBecomeMemberBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        View view = inflater.inflate(R.layout.fragment_become_member,container,false);

        // Inflate the layout for this fragment
        EditText name=view.findViewById(R.id.Name);
        EditText email=view.findViewById(R.id.EmailAddress);
        EditText phone=view.findViewById(R.id.Phone);
        EditText Constituency=view.findViewById(R.id.Constituency);
        Button Next_become_member_1=view.findViewById(R.id.Next_become_member_1);
        Next_become_member_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BecomeMem3.p.setName(name.getText().toString());
                BecomeMem3.p.setEmail(email.getText().toString());
                BecomeMem3.p.setMobile(phone.getText().toString());
                BecomeMem3.p.setConstituency(Constituency.getText().toString());
                Intent intent = new Intent(getActivity(), BecomeMem2.class);
                startActivity(intent);
//                startActivity(new Intent(getActivity(),BecomeMem2.class));
            }
        });
        return view;
    }
}