package com.example.trile.appvietravel;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by trile on 3/30/2018.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.TourViewHolder> {
    private Context context;
    private List<TourInfo> tourInfos;

    public RecyclerAdapter(Context context, List<TourInfo> tourInfos) {
        this.context = context;
        this.tourInfos = tourInfos;
    }

    @Override
    public TourViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.layout_tour, null);
        TourViewHolder tourViewHolder = new TourViewHolder(view);
        return tourViewHolder;
    }

    @Override
    public void onBindViewHolder(TourViewHolder holder, int position) {
        TourInfo tourInfo = tourInfos.get(position);

        holder.textView.setText(tourInfo.getNames());
        holder.imageView.setImageDrawable(context.getResources().getDrawable(tourInfo.getImage()));
    }

    @Override
    public int getItemCount() {
        return tourInfos.size();
    }

    public class TourViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView;

        public TourViewHolder(View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.imageTour);
            textView = itemView.findViewById(R.id.txtTour);
        }
    }
}
