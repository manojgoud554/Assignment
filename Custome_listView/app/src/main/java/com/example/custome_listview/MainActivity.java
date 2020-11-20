package com.example.custome_listview;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.widget.ListView;

import com.example.custome_listview.Models.Movies;
import com.example.custome_listview.adpaters.MoviesCustomAdpater;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    ArrayList<Movies> movies;
    Integer[] images={
            R.drawable.annihilation,
            R.drawable.kabir_singh,
            R.drawable.deadpool2,
            R.drawable.uri,R.drawable.jersey,
            R.drawable.kgf,
    };

    public ArrayList<Movies> getArrayMovies(){
        ArrayList<Movies> movies=new ArrayList<>();
        movies.add(new Movies("Annihilation","8.2/10","New Movie",images ));
        movies.add(new Movies("Kabir singh","8.0/5","New Movie",images ));
        movies.add(new Movies("Deadpool 2","7.5/10","New Movie",images ));
        movies.add(new Movies("URI","8.3/10","New Movie",images));
        movies.add(new Movies("Jersey","9/10","New Movie",images));
        movies.add(new Movies("K.G.F (CH 1)","9/10","New Movie",images));
        return movies;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=findViewById(R.id.MoviesListView);
        movies=getArrayMovies();
        MoviesCustomAdpater adpater=new MoviesCustomAdpater(movies);
        listView.setAdapter(adpater);
    }
}