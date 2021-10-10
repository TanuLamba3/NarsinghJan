package com.example.narsinghjan.Fragment;

import static android.content.Context.MODE_PRIVATE;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.content.res.Configuration;
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

import com.example.narsinghjan.MainActivity;
import com.example.narsinghjan.R;
import com.example.narsinghjan.databinding.FragmentHomeBinding;
import com.example.narsinghjan.databinding.FragmentLanguageBinding;
import com.example.narsinghjan.ui.LocalHelper;

import java.util.Locale;


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
                showChangeLanguageDialog();
            }
        });
        return root;
    }
    private void showChangeLanguageDialog() {
        final String[] listItems = {"English","हिंदी"};
        AlertDialog.Builder mBuilder = new AlertDialog.Builder(getContext());
        mBuilder.setTitle("Choose Language...");
        mBuilder.setSingleChoiceItems(listItems,-1, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                if(i == 1){
                    setLocale("hi");
                    getActivity().recreate();
                }
                else if(i == 0){
                    setLocale("en");
                    getActivity().recreate();
                }
                dialogInterface.dismiss();
            }
        });
        AlertDialog mDialog = mBuilder.create();
        mDialog.show();

    }
    private void setLocale(String lang){
        Locale locale = new Locale(lang);
        Locale.setDefault(locale);
        Configuration config = new Configuration();
        config.locale=locale;
        getContext().getResources().updateConfiguration(config,getContext().getResources().getDisplayMetrics());
        SharedPreferences.Editor editor = getContext().getSharedPreferences("Settings",MODE_PRIVATE).edit();
        editor.putString("My_Lang",lang);
        editor.apply();

    }
    public void loadLocale(){
        SharedPreferences prefs = getContext().getSharedPreferences("Settings", MODE_PRIVATE);
        String language = prefs.getString("My_Lang","");
        setLocale(language);
    }

}