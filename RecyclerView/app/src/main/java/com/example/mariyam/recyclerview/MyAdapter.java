package com.example.mariyam.recyclerview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;



public class MyAdapter extends RecyclerView.Adapter<MyAdapter.myViewHolder> {


    Context context;
    ArrayList<user> users;

    public MyAdapter(Context c,ArrayList<user> u){
        context= c;
        users = u;
    }

    //LayoutInflater inflater = (LayoutInflater) context.getSystemService( Context.LAYOUT_INFLATER_SERVICE );
    @NonNull
    @Override
    public MyAdapter.myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // return new MyAdapter(inflater.inflate(R.layout.cardview,parent,false));
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cardview, parent, false);

        myViewHolder vh = new myViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolder holder, int position) {
        holder.name.setText(users.get(position).getName());
        holder.age.setText(users.get(position).getAge());

    }

    @Override
    public int getItemCount() {
        return users.size();
    }

    class myViewHolder extends  RecyclerView.ViewHolder
    {
            TextView name,age;
        public myViewHolder(View itemView) {
            super(itemView);
                name = (TextView) itemView.findViewById(R.id.txtName);

            age = (TextView) itemView.findViewById(R.id.txtAge);

        }

    }
}
