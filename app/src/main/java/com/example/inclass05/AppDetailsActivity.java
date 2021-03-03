package com.example.inclass05;
/*
HomeWork01
FileName - HW01
Group1B- Pramukh Nagendra &
         Nikhil Surya Petiti
 */

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class AppDetailsActivity extends AppCompatActivity {
    ListView genreListView;
    ArrayAdapter stringArrayAdapter;
    App app;
    TextView appName, artistName, releaseDate;
    ArrayList<String> genreList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_appdetails);
        setTitle(getResources().getString(R.string.app_details));

        appName = findViewById(R.id.applistAppname);
        artistName = findViewById(R.id.appListArtistName);
        releaseDate = findViewById(R.id.appListReleaseDate);
        genreListView = findViewById(R.id.genreList);

        if(getIntent() != null && getIntent().hasExtra(AppListActivity.APP_DETAILS)){

            app = (App) getIntent().getSerializableExtra(AppListActivity.APP_DETAILS);
            appName.setText(app.name);
            artistName.setText(app.artistName);
            releaseDate.setText(app.releaseDate);
            genreList = app.genres;
            stringArrayAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,android.R.id.text1,genreList);
            genreListView.setAdapter(stringArrayAdapter);
        }

    }
}