package com.example.coco.bannerlayout2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import cn.bingoogolapple.bgabanner.BGABanner;

public class MainActivity extends AppCompatActivity {


    private BGABanner banner_bottom;
    private BGABanner banner_top;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        banner_bottom = findViewById(R.id.banner_guide_background);
        banner_top = findViewById(R.id.banner_guide_foreground);

        banner_top.setEnterSkipViewIdAndDelegate(R.id.btn_guide_enter, R.id.tv_guide_skip, new BGABanner.GuideDelegate() {
            @Override
            public void onClickEnterOrSkip() {
                startActivity(new Intent(MainActivity.this, Two.class));
            }
        });
        banner_bottom.setData(R.drawable.uoko_guide_background_1, R.drawable.uoko_guide_background_2, R.drawable.uoko_guide_background_3);
//       banner_bottom.setData(R.mipmap.m1,R.mipmap.m2,R.mipmap.m3);
        banner_top.setData(R.drawable.uoko_guide_foreground_1, R.drawable.uoko_guide_foreground_2, R.drawable.uoko_guide_foreground_3);
    }

    @Override
    protected void onResume() {
        super.onResume();
        banner_bottom.setBackgroundResource(android.R.color.white);
    }
}
