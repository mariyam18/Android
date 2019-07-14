package com.example.mariyam.recyclerview;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.jar.Attributes;

public class MainActivity extends AppCompatActivity {

    DatabaseReference myRef;
    RecyclerView myRecycle;
    ArrayList<user> list;
    MyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            myRecycle =  findViewById(R.id.myRecycle);

            myRecycle.setLayoutManager(new LinearLayoutManager(this));

            list= new ArrayList<user>();
        myRef= FirebaseDatabase.getInstance().getReference().child("USER");



        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                for(DataSnapshot dataSnapshot1:dataSnapshot.getChildren()){

                    user u = dataSnapshot1.getValue(user.class);
                    list.add(u);
                }

                adapter = new MyAdapter(MainActivity.this,list);
                myRecycle.setAdapter(adapter);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
                Toast.makeText(MainActivity.this,"something wrong",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
