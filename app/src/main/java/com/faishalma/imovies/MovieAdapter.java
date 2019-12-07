package com.faishalma.imovies;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MovieAdapter extends BaseAdapter {

    Context context;
    ArrayList<Movie> movies;

    public MovieAdapter(Context context, ArrayList<Movie> ourMovies) {
        this.context = context;
        this.movies = ourMovies;
    }

    @Override
    public int getCount() {
        return movies.size();
    }

    @Override
    public Object getItem(int i) {
        return movies.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder = null;
        if (view == null) {
            holder = new ViewHolder();
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.item_movie, null);

            holder.imgPhoto = view.findViewById(R.id.img_photo);
            holder.txtName = view.findViewById(R.id.txt_name);
            holder.txtDescription = view.findViewById(R.id.txt_description);
            holder.txtDate = view.findViewById(R.id.txt_date);
            holder.txtRating = view.findViewById(R.id.txt_rating);
            holder.txtDirector1 = view.findViewById(R.id.txt_director1);
            holder.txtDirector2 = view.findViewById(R.id.txt_director2);
            view.setTag(holder);
        } else {
            holder = (ViewHolder) view.getTag();
        }

        holder.imgPhoto.setImageResource(movies.get(i).getPhoto());
        holder.imgPhoto.setScaleType(ImageView.ScaleType.CENTER_CROP);
        holder.txtName.setText(movies.get(i).getName());
        holder.txtDescription.setText(movies.get(i).getDescription());
        holder.txtDate.setText(movies.get(i).getDate());
        holder.txtRating.setText(movies.get(i).getRating());

        return view;
    }

    static class ViewHolder {
        ImageView imgPhoto;
        TextView txtName;
        TextView txtDescription;
        TextView txtDate;
        TextView txtRating;
        TextView txtDirector1;
        TextView txtDirector2;
    }
}
