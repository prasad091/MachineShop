package com.acceedo.machineshop.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.acceedo.machineshop.ProductListActivity;
import com.acceedo.machineshop.R;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductViewHolder> {
    private Context context;
    private List<String> productList;
    public ProductAdapter(Context context, List<String> productList){
        this.context = context;
        this.productList = productList;
    }
    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_product_layout, parent, false);
        return new ProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder holder, int position) {
        String s = productList.get(position);
        holder.productName.setText(s);
        if (position ==0)  holder.card.setCardBackgroundColor(context.getResources().getColor(R.color.colorPrimary));
        if (position ==1)  holder.card.setCardBackgroundColor(context.getResources().getColor(R.color.colorPrimary));
        if (position ==2)  holder.card.setCardBackgroundColor(context.getResources().getColor(R.color.colorPrimary));
        if (position ==3)  holder.card.setCardBackgroundColor(context.getResources().getColor(R.color.colorPrimary));
        if (position ==4)  holder.card.setCardBackgroundColor(context.getResources().getColor(R.color.colorPrimary));
        if (position ==5)  holder.card.setCardBackgroundColor(context.getResources().getColor(R.color.colorPrimary));
    }

    @Override
    public int getItemCount() {
        return productList.size();
    }

    class ProductViewHolder extends RecyclerView.ViewHolder{

        @BindView(R.id.productName)
        TextView productName;
        @BindView(R.id.card)
        CardView card;
        public ProductViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    context.startActivity(new Intent(context, ProductListActivity.class));
                }
            });
        }
    }
}