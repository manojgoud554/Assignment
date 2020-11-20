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
        movies.add(new Movies("Movie Name: Annihilation","IMDb: 8.2/10 ‧ 2 hours","Plot:\n " +
                "A mysterious quarantined zone of mutating plants and animals caused by an alien presence. Annihilation was released theatrically in Canada and the United States by Paramount Pictures on February 23, 2018, and in China on April 13, 2018.",images ));
        movies.add(new Movies("Movie Name: Kabir singh","IMDb: 8.0/5‧ 2h 52m","Plot:\n " +
                "Kabir, a genius yet hostile medical student, falls in love with Preeti from his college. When Preeti's father spots the couple kissing, he opposes their relationship and decides to marry her off.",images ));
        movies.add(new Movies("Movie Name: Deadpool 2","IMDb: 7.5/10 ‧ 2h 14m","Plot:\n " +
                "Deadpool protects a young mutant Russell from the authorities and gets thrown in prison. However, he escapes and forms a team of mutants to prevent a time-travelling mercenary from killing Russell.",images ));
        movies.add(new Movies("Movie Name: URI","IMDb: 8.3/10 ‧ 2h 18m","Plot:\n " +
                "Major Vihaan Singh Shergill of the Indian Army leads a covert operation against a group of militants who attacked a base in Uri, Kashmir, in 2016 and killed many soldiers.",images));
        movies.add(new Movies("Movie Name: Jersey","IMDb: 9/10 ‧ 2h 40m","Plot:\n " +
                "Jersey 2019 was a Telugu sports drama film that starred actor Nani in the lead role. The plot of this film revolved around a cricketer who tried to revive his career even after he failed.",images));
        movies.add(new Movies("Movie Name: K.G.F (CH 1)","IMDb: 9/10 ‧ 2h 50m","Plot:\n " +
                "The film centres around Raja Krishnappa Bairya \"Rocky\", born into poverty, who arrives in Bombay (now Mumbai) in the 1960s, on a quest for power and wealth as desired by his dying mother. Involved with the gold mafia there, he is recruited to kill Garuda, the oppressive heir-in-waiting, in Kolar Gold Fields.",images));
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