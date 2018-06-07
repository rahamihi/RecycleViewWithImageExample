package com.example.mamun.recycleviewwithimageexample;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class RecycleAdapter extends RecyclerView.Adapter<RecycleAdapter.RecycleViewHolder> {
    private List<MovieList> movieLists;

    public RecycleAdapter(List<MovieList> movieLists) {
        this.movieLists = movieLists;
    }

    @NonNull
    @Override
    public RecycleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        //View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.movie_list,parent,false);
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.movie_list,parent,false);
        RecycleViewHolder recycleViewHolder = new RecycleViewHolder(v);

        return recycleViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecycleViewHolder holder, int position) {

        MovieList movieList = movieLists.get(position);
        holder.imageView.setImageResource(movieList.getMovieImage());
        holder.movie_name.setText(movieList.getMovieName());
        holder.director.setText(movieList.getDirectorName());

    }

    @Override
    public int getItemCount() {
        return movieLists.size();
    }

    public static class RecycleViewHolder extends RecyclerView.ViewHolder{

        ImageView imageView;
        TextView movie_name,director;
        public RecycleViewHolder(View itemView) {
            super(itemView);
            imageView = (ImageView) itemView.findViewById(R.id.imageView);
            movie_name = (TextView) itemView.findViewById(R.id.movie_name);
            director = (TextView) itemView.findViewById(R.id.director);

        }
    }


}
