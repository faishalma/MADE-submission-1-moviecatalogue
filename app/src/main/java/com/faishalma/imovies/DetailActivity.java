package com.faishalma.imovies;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    public static final String EXTRA_MOVIE = "extra_movie";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Movie selectedMovie = getIntent().getParcelableExtra(EXTRA_MOVIE);

        if (selectedMovie != null) {
            ImageView imgPhoto = findViewById(R.id.img_photo);
            imgPhoto.setImageResource(selectedMovie.getPhoto());
            imgPhoto.setScaleType(ImageView.ScaleType.CENTER_CROP);

            TextView txtName = findViewById(R.id.txt_name);
            txtName.setText(selectedMovie.getName());

            TextView txtDescription = findViewById(R.id.txt_description);
            txtDescription.setText(selectedMovie.getDescription());

            TextView txtDate = findViewById(R.id.txt_date);
            txtDate.setText(selectedMovie.getDate());

            TextView txtRating = findViewById(R.id.txt_rating);
            txtRating.setText(selectedMovie.getRating());

            TextView txtDirector1 = findViewById(R.id.txt_director1);
            txtDirector1.setText(selectedMovie.getDirector1());

            TextView txtDirector2 = findViewById(R.id.txt_director2);
            txtDirector2.setText(selectedMovie.getDirector2());

        }

    }
}
