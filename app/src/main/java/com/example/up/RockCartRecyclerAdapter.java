package com.example.up;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RockCartRecyclerAdapter extends RecyclerView.Adapter<RockCartRecyclerAdapter.ViewHolder>{

    private final LayoutInflater inflater;
    private final List<Rock> rocks;

    RockCartRecyclerAdapter(Context context, List<Rock> states) {
        this.rocks = states;
        this.inflater = LayoutInflater.from(context);
    }
    @Override
    public RockCartRecyclerAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.rock2_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RockCartRecyclerAdapter.ViewHolder holder, int position) {
        Rock rock = rocks.get(position);

        //holder.imgView.setImageResource(rock.getImage());
        holder.titleView.setText(rock.getTitle());
        holder.priceView.setText(rock.getPrice().toString()+" руб.");
        holder.descriptView.setText(rock.getDescription());
    }

    @Override
    public int getItemCount() {
        return rocks.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        //final ImageView imgView;
        final TextView titleView, priceView, descriptView;
        ViewHolder(View view){
            super(view);
            //imgView = view.findViewById(R.id.image);
            titleView = view.findViewById(R.id.title);
            priceView = view.findViewById(R.id.price);
            descriptView = view.findViewById(R.id.description);
        }
    }
}