package com.example.narsinghjan.Fragment;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;

import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.narsinghjan.R;
import com.example.narsinghjan.databinding.FragmentHomeBinding;
import com.example.narsinghjan.databinding.FragmentLanguageBinding;
import com.example.narsinghjan.ui.LocalHelper;


public class LanguageFragment extends Fragment {

    int lang_selected;
    private FragmentLanguageBinding binding;
    TextView Helloworld;

    Context context;
    Resources resources;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentLanguageBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        //language converter
        TextView dialog_language = root.findViewById(R.id.dialog_language);
        RelativeLayout show_lan_dialog = root.findViewById(R.id.showlangdialog);

        show_lan_dialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String[] Language = {"English","हिंदी"};

                final AlertDialog.Builder builder = new AlertDialog.Builder(LanguageFragment.this);

                builder.setTitle("SELECT A LANGUAGE")
                        .setSingleChoiceItems(Language, lang_selected, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                dialog_language.setText(Language[i]);

                                if(Language[i].equals("ENGLISH"))
                                {
                                    context = LocalHelper.setLocale(LanguageFragment.this,"en");
                                    resources = context.getResources();

                                    lang_selected = 0;
                                }
                                if(Language[i].equals("हिंदी"))
                                {

                                }
                            }
                        })
                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                dialogInterface.dismiss();
                            }
                        });
                builder.create().show();
            }
        });
        return root;
    }
}