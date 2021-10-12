package com.example.narsinghjan;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {

    Context context;



        public int[] imageArray = {
            R.drawable.one,R.drawable.two,R.drawable.three,R.drawable.four,
            R.drawable.five,R.drawable.six,R.drawable.seven,R.drawable.eight,
            R.drawable.nine,R.drawable.ten,R.drawable.eleven,R.drawable.twelve,
            R.drawable.thirteen,R.drawable.fourteen,R.drawable.fifteen,R.drawable.sixteen,
            R.drawable.seventeen,R.drawable.eighteen
    };

    public ImageAdapter(Context context) {

        this.context = context;
    }

    @Override
    public int getCount() {
        return imageArray.length;
    }

    @Override
    public Object getItem(int i) {
        return imageArray[i];
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(imageArray[i]);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setLayoutParams(new GridView.LayoutParams(340,350));


        return imageView;
    }
}
