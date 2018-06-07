package com.example.mamun.recycleviewwithimageexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecycleAdapter adapter;
    private int[] movieImage ={R.drawable.pulp,R.drawable.titanic,R.drawable.knight,R.drawable.life,R.drawable.godfather,R.drawable.pulp,R.drawable.titanic,R.drawable.knight,R.drawable.life,R.drawable.godfather,R.drawable.pulp,R.drawable.titanic,R.drawable.knight,R.drawable.life,R.drawable.godfather};
    private String[] movie_name={"is","u","we","he","her","is","u","we","he","her","is","u","we","he","her"};
    private String[] director={"is","u","we","he","her","is","u","we","he","her","is","u","we","he","her"};
    private List<MovieList> movieLists = new ArrayList<MovieList>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycleView);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        //movie_name = getResources().getStringArray(R.array.film);
        //director = getResources().getStringArray(R.array.director);
        for(int i=0; i<director.length; i++){
            MovieList movie = new MovieList(movieImage[i],movie_name[i],director[i]);
            movieLists.add(movie);
        }


        adapter = new RecycleAdapter(movieLists);
        recyclerView.setAdapter(adapter);
        recyclerView.setHasFixedSize(true);




    }
}
