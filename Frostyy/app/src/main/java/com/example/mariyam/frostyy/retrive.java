package com.example.mariyam.frostyy;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class retrive extends AppCompatActivity {

    ListView listView;
    FirebaseDatabase database = FirebaseDatabase.getInstance();
    ArrayList<User> List;
    ArrayAdapter<User> adapter;
    User user;
    final DatabaseReference myRef = database.getReferenceFromUrl("https://frostyy-1e92e.firebaseio.com/");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retrive);

        user = new User();
        listView = (ListView) findViewById(R.id.listView);
        List = new ArrayList<>();
        adapter = new ArrayAdapter<User>(this,R.layout.order_detail,R.id.Order_detail,List);
    myRef.addValueEventListener(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            for(DataSnapshot d1 : dataSnapshot.getChildren()){

                user =d1.getValue(User.class);
                List.add(user);
            }
            listView.setAdapter(adapter);
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    }
}
