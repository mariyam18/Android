package com.example.mariyam.pc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.List;

public class ParticipateList extends AppCompatActivity {

    RecyclerView myRecycle;
    ProductAdapter adapter;
    List<product> productList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_participate_list);


        myRecycle =  findViewById(R.id.myRecycle);
        myRecycle.setHasFixedSize(true);
        myRecycle.setLayoutManager(new LinearLayoutManager(this));

    }
}
