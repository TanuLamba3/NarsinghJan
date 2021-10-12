package com.example.narsinghjan.Fragment;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;

import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.narsinghjan.LocaleHelper;
import com.example.narsinghjan.R;
import com.example.narsinghjan.databinding.FragmentLanguageBinding;
import com.example.narsinghjan.databinding.FragmentScannerBinding;
import com.example.narsinghjan.scannerView;

import org.intellij.lang.annotations.Language;


public class LanguageFragment extends Fragment {
    TextView helloworld, dialog_language;
    int lang_selected;
    RelativeLayout show_lan_dialog;
    private FragmentLanguageBinding binding;

    Context context;
    Resources resources;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentLanguageBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        View view = inflater.inflate(R.layout.fragment_scanner, container, false);

        helloworld = view.findViewById(R.id.helloworld);
        dialog_language = view.findViewById(R.id.dialog_language);
        show_lan_dialog = view.findViewById(R.id.showlangdialog);

        if(LocaleHelper.getLanguage(getContext()).equalsIgnoreCase("en")){
            context = LocaleHelper.setLocale(getContext(),"en");
            resources = context.getResources();
            lang_selected = 0;
            dialog_language.setText("ENGLISH");
            helloworld.setText(resources.getString(R.string.about_us));
            //setTitle(resources.getString(R.string.app_name));
        }else if (LocaleHelper.getLanguage(getContext()).equalsIgnoreCase("en")){
            context = LocaleHelper.setLocale(getContext(),"en");
            resources = context.getResources();
            lang_selected = 1;
            dialog_language.setText("हिन्दी");
            helloworld.setText(resources.getString(R.string.about_us));
            //setTitle(resources.getString(R.string.app_name));
        }

        show_lan_dialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String[] Language = {"English","हिन्दी"};
                final AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                builder.setTitle("SELECT A LANGUAGE")
                        .setSingleChoiceItems(Language, lang_selected, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                dialog_language.setText(Language[i]);

                                if(Language[i].equals("ENGLISH")){
                                    context = LocaleHelper.setLocale(getContext(),"en");
                                    resources = context.getResources();
                                    lang_selected = 0;
                                    helloworld.setText(resources.getString(R.string.about_us));
                                    //setTitle(resources.getString(R.string.app_name));
                                }
                                if(Language[i].equals("हिन्दी")){
                                    context = LocaleHelper.setLocale(getContext(),"hi");
                                    resources = context.getResources();
                                    lang_selected = 1;
                                    helloworld.setText(resources.getString(R.string.about_us));
                                    //setTitle(resources.getString(R.string.app_name));
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
        // Inflate the layout for this fragment
        return view;
    }
}