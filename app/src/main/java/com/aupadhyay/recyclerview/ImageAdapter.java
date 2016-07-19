package com.aupadhyay.recyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by aupadhyay on 7/19/16.
 */
public class ImageAdapter extends RecyclerView.Adapter<ImageAdapter.ViewHolder> {

    private int resource;
    private ArrayList<ImageDetails> arrayList;
    private Context context;

    public ImageAdapter(Context context, int resource, ArrayList<ImageDetails> object)
    {
        this.context = context;
        this.resource = resource;
        arrayList = object;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View myView = LayoutInflater.from(context).inflate(resource, parent, false);

        return new ViewHolder(myView);
    }

    // gets called n number of times | n is the size of arrayList.
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        ImageDetails id = arrayList.get(position);

        holder.getImageView().setImageResource(id.getImage());
        holder.getTextView().setText(id.getImageDetails());
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder
    {
        private ImageView image;
        private TextView imageDetails;

        public ViewHolder(View itemView) {
            super(itemView);

            image = (ImageView) itemView.findViewById(R.id.imageView);
            imageDetails = (TextView) itemView.findViewById(R.id.imageDetails);
        }

        public ImageView getImageView()
        {
            return image;
        }

        public TextView getTextView()
        {
            return imageDetails;
        }

    }

}
