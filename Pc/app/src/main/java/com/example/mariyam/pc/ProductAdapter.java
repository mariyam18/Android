package com.example.mariyam.pc;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductViewholder> {

    private Context mCtx;
    private List<product> productList;

    public ProductAdapter(Context mCtx, List<product> productList) {
        this.mCtx = mCtx;
        this.productList = productList;
    }

    @NonNull
    @Override
    public ProductViewholder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater= LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.cardview,null);
        return new ProductViewholder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull ProductViewholder holder, int i) {
            product product = productList.get(i);
            holder.Name.setText(product.getName());
            holder.ID.setText(product.getID());
            holder.no.setText(product.getNo());

    }

    @Override
    public int getItemCount() {
        return productList.size();
    }

    class ProductViewholder extends RecyclerView.ViewHolder{

        TextView Name, ID,no;

        public ProductViewholder(@NonNull View itemView) {
            super(itemView);

            ID = itemView.findViewById(R.id.txtID);
            no = itemView.findViewById(R.id.txtNo);
            Name = itemView.findViewById(R.id.txtName);
        }
    }
}
