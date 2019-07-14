package com.example.mariyam.dineout;

//import android.app.Fragment;
import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toolbar;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.vectordrawable.graphics.drawable.ArgbEvaluator;
import androidx.viewpager.widget.ViewPager;


public class MainActivity extends AppCompatActivity {

//    ViewPager viewPager;
//    Adapter adapter;
//    List<Model> models;
//    Integer[] colors = null;
//    @SuppressLint("RestrictedApi")
//    ArgbEvaluator argbEvaluator = new ArgbEvaluator();


    //@RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        models = new ArrayList<>();
//        models.add(new Model(R.drawable.swiggy_coupons));
//        models.add(new Model(R.drawable.zomatoexistinguseroffers_1530610267));
//
//
//        adapter = new Adapter(models, this);
//
//        viewPager = findViewById(R.id.viewPager);
//        viewPager.setAdapter(adapter);
//        viewPager.setPadding(130, 0, 130, 0);
//
//        Integer[] colors_temp = {
//                getResources().getColor(R.color.color1),
//                getResources().getColor(R.color.color2),
//                getResources().getColor(R.color.color3),
//                getResources().getColor(R.color.color4)
//        };
//
//        colors = colors_temp;
//
//        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
//            @SuppressLint("RestrictedApi")
//            @Override
//            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
//
//                if (position < (adapter.getCount() -1) && position < (colors.length - 1)) {
//                    viewPager.setBackgroundColor(
//
//                            (Integer) argbEvaluator.evaluate(
//                                    positionOffset,
//                                    colors[position],
//                                    colors[position + 1]
//                            )
//                    );
//                }
//
//                else {
//                    viewPager.setBackgroundColor(colors[colors.length - 1]);
//                }
//            }
//
//            @Override
//            public void onPageSelected(int position) {
//
//            }
//
//            @Override
//            public void onPageScrollStateChanged(int state) {
//
//            }
//        });

    }
//        BottomNavigationView navigationView = findViewById(R.id.bottomNav);

//        final AccountFrag accountFrag = new AccountFrag();
//        final BillFrag billFrag = new BillFrag();
//        final offerFrag offerFrag = new offerFrag();
//        final HomeFrag homeFrag = new HomeFrag();
//
//        androidx.appcompat.widget.Toolbar toolbar = findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);




    }


