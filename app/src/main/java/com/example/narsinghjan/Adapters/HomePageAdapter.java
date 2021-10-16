package com.example.narsinghjan.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.example.narsinghjan.Fragment.NewsArtFragment;
import com.example.narsinghjan.R;


public class HomePageAdapter extends PagerAdapter {

    private Context context;
    private LayoutInflater layoutInflater;
    private Integer[] images;
    private String[] Articles;

    public HomePageAdapter(Context context, Integer[] images, String[] Articles) {
        this.context = context;
        this.images = images;
        this.Articles=Articles;
    }




    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view==object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        layoutInflater=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view=layoutInflater.inflate(R.layout.article_layout,null);

        ImageView imageView=view.findViewById(R.id.Article_img);
        TextView textView=view.findViewById(R.id.Article_txt);

        imageView.setImageResource(images[position]);
        textView.setText(Articles[position]);

        ViewPager viewPager=(ViewPager) container;
        viewPager.addView(view,0);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        ViewPager viewPager = (ViewPager) container;
        View view=(View) object;
        viewPager.removeView(view);
    }

}
