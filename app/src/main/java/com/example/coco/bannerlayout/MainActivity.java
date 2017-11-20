package com.example.coco.bannerlayout;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.coco.bannerlayout.utils.GlideImageLoader;
import com.yyydjk.library.BannerLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private BannerLayout banner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        banner = findViewById(R.id.banner);


        final List<String> urls = new ArrayList<>();//存放轮播图片的集合
        urls.add("http://p0.so.qhimgs1.com/t016e00c9485326b764.jpg");
        urls.add("http://p0.so.qhimgs1.com/t01dc3718ec509e0050.jpg");
        urls.add("http://p0.so.qhimgs1.com/t0124a6870f243a4be4.jpg");
        urls.add("http://p2.so.qhimgs1.com/t014bb11b1742a1998e.jpg");
        urls.add("http://p1.so.qhimgs1.com/t01443fc83ad628a72d.jpg");
//设置加载器
        banner.setImageLoader(new GlideImageLoader());

//网络地址
        banner.setViewUrls(urls);


//添加点击监听
        banner.setOnBannerItemClickListener(new BannerLayout.OnBannerItemClickListener() {
            @Override
            public void onItemClick(int position) {
//                Intent intent = new Intent();
//                intent.setData(Uri.parse("http://p0.so.qhimgs1.com/t016e00c9485326b764.jpg"));//Url 就是你要打开的网址
//                intent.setAction(Intent.ACTION_VIEW);
//                startActivity(intent); //启动浏览器
            }
        });


    }
}
