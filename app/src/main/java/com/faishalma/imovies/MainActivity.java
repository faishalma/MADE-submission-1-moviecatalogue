package com.faishalma.imovies;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView listMovie;

    private ArrayList<Movie> movies;

    AdapterView.OnItemClickListener listener = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
            Intent detailIntent = new Intent(MainActivity.this, DetailActivity.class);
            detailIntent.putExtra(DetailActivity.EXTRA_MOVIE, movies.get(position));
            startActivity(detailIntent);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listMovie = findViewById(R.id.lv_list);

        movies = generateMovieData();

        MovieAdapter adapter = new MovieAdapter(this, movies);

        listMovie.setAdapter(adapter);

        listMovie.setOnItemClickListener(listener);
    }

    private ArrayList<Movie> generateMovieData() {
        ArrayList<Movie> dataMovies = new ArrayList<>();

        //Movie 1
        Movie movie = new Movie();
        movie.setName("Avengers: Infinity War");
        movie.setDescription("As the Avengers and their allies have continued to protect the world from threats too large for any one hero to handle, a new danger has emerged from the cosmic shadows: Thanos. A despot of intergalactic infamy, his goal is to collect all six Infinity Stones, artifacts of unimaginable power, and use them to inflict his twisted will on all of reality. Everything the Avengers have fought for has led up to this moment - the fate of Earth and existence itself has never been more uncertain.");
        movie.setRating("83%");
        movie.setDate("04-25-2018");
        movie.setDirector1("Jor Russo");
        movie.setDirector2("Anthony Russo");
        movie.setPhoto(R.drawable.poster_avengerinfinity);

        dataMovies.add(movie);

        //Movie 2 :
        movie = new Movie();
        movie.setName("Spider-Man: Into the Spider-Verse");
        movie.setDescription("Miles Morales is juggling his life between being a high school student and being a spider-man. When Wilson \"Kingpin\" Fisk uses a super collider, others from across the Spider-Verse are transported to this dimension.");
        movie.setRating("84%");
        movie.setDate("12-06-2018");
        movie.setDirector1("Peter Ramsey");
        movie.setDirector2("Bob Persichetti");
        movie.setPhoto(R.drawable.poster_spiderman);

        dataMovies.add(movie);

        //Movie 3 :
        movie = new Movie();
        movie.setName("Dragon Ball Super: Broly");
        movie.setDescription("Earth is peaceful following the Tournament of Power. Realizing that the universes still hold many more strong people yet to see, Goku spends all his days training to reach even greater heights. Then one day, Goku and Vegeta are faced by a Saiyan called \"Broly\" who they\\'ve never seen before.");
        movie.setRating("75%");
        movie.setDate("12-14-2018");
        movie.setDirector1("Tatsuya Nagamine");
        movie.setDirector2("-");
        movie.setPhoto(R.drawable.poster_dragonball);

        dataMovies.add(movie);

        //Movie 4 :
        movie = new Movie();
        movie.setName("Deadpool");
        movie.setDescription("Deadpool tells the origin story of former Special Forces operative turned mercenary Wade Wilson, who after being subjected to a rogue experiment that leaves him with accelerated healing powers, adopts the alter ego Deadpool. Armed with his new abilities and a dark, twisted sense of humor, Deadpool hunts down the man who nearly destroyed his life");
        movie.setRating("76%");
        movie.setDate("02-09-2016");
        movie.setDirector1("Tim Miller");
        movie.setDirector2("-");
        movie.setPhoto(R.drawable.poster_deadpool);

        dataMovies.add(movie);

        //Movie 5 :
        movie = new Movie();
        movie.setName("Aquaman");
        movie.setDescription("Once home to the most advanced civilization on Earth, Atlantis is now an underwater kingdom ruled by the power-hungry King Orm. With a vast army at his disposal, Orm plans to conquer the remaining oceanic people and then the surface world. Standing in his way is Arthur Curry, Orm\\'s half-human, half-Atlantean brother and true heir to the throne.");
        movie.setRating("68%");
        movie.setDate("12-07-2018");
        movie.setDirector1("James Wan");
        movie.setDirector2("-");
        movie.setPhoto(R.drawable.poster_aquaman);

        dataMovies.add(movie);

        //Movie 6 :
        movie = new Movie();
        movie.setName("How to Train Your Dragon: The Hidden World");
        movie.setDescription("As Hiccup fulfills his dream of creating a peaceful dragon utopia, Toothless’ discovery of an untamed, elusive mate draws the Night Fury away. When danger mounts at home and Hiccup’s reign as village chief is tested, both dragon and rider must make impossible decisions to save their kind.");
        movie.setRating("77%");
        movie.setDate("01-03-2019");
        movie.setDirector1("Dean DeBlois");
        movie.setDirector2("-");
        movie.setPhoto(R.drawable.poster_dragon);

        dataMovies.add(movie);

        //Movie 7 :
        movie = new Movie();
        movie.setName("Venom");
        movie.setDescription("Investigative journalist Eddie Brock attempts a comeback following a scandal, but accidentally becomes the host of Venom, a violent, super powerful alien symbiote. Soon, he must rely on his newfound powers to protect the world from a shadowy organization looking for a symbiote of their own.");
        movie.setRating("66%");
        movie.setDate("09-28-2018");
        movie.setDirector1("Ruben Fleischer");
        movie.setDirector2("-");
        movie.setPhoto(R.drawable.poster_venom);

        dataMovies.add(movie);

        //Movie 8 :
        movie = new Movie();
        movie.setName("Glass");
        movie.setDescription("In a series of escalating encounters, former security guard David Dunn uses his supernatural abilities to track Kevin Wendell Crumb, a disturbed man who has twenty-four personalities. Meanwhile, the shadowy presence of Elijah Price emerges as an orchestrator who holds secrets critical to both men.");
        movie.setRating("66%");
        movie.setDate("01-16-2019");
        movie.setDirector1("M. Night Shyamalan");
        movie.setDirector2("-");
        movie.setPhoto(R.drawable.poster_glass);

        dataMovies.add(movie);

        //Movie 9 :
        movie = new Movie();
        movie.setName("A Star Is Born");
        movie.setDescription("Seasoned musician Jackson Maine discovers — and falls in love with — struggling artist Ally. She has just about given up on her dream to make it big as a singer — until Jack coaxes her into the spotlight. But even as Ally\\'s career takes off, the personal side of their relationship is breaking down, as Jack fights an ongoing battle with his own internal demons.");
        movie.setRating("75%");
        movie.setDate("01-03-2018");
        movie.setDirector1("Bradley Cooper");
        movie.setDirector2("-");
        movie.setPhoto(R.drawable.poster_a_star);

        dataMovies.add(movie);

        //Movie 10 :
        movie = new Movie();
        movie.setName("Bumblebee");
        movie.setDescription("On the run in the year 1987, Bumblebee finds refuge in a junkyard in a small Californian beach town. Charlie, on the cusp of turning 18 and trying to find her place in the world, discovers Bumblebee, battle-scarred and broken. When Charlie revives him, she quickly learns this is no ordinary yellow VW bug.");
        movie.setRating("65%");
        movie.setDate("12-15-2018");
        movie.setDirector1("Travis Knight");
        movie.setDirector2("-");
        movie.setPhoto(R.drawable.poster_bumblebee);

        dataMovies.add(movie);

        return dataMovies;
    }


}
