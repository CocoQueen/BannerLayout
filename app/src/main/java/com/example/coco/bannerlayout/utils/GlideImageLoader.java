package com.example.coco.bannerlayout.utils;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.yyydjk.library.BannerLayout;

/**
 * Created by coco on 2017/11/20.
 */

public class GlideImageLoader implements BannerLayout.ImageLoader{
    @Override
    public void displayImage(Context context, String s, ImageView imageView) {
        Glide.with(context).load(s).into(imageView);
    }
}
