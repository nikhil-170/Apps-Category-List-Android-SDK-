package com.example.inclass05;
/*
HomeWork01
FileName - HW01
Group1B- Pramukh Nagendra &
         Nikhil Surya Petiti
 */

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.List;


public class AppListActivity extends AppCompatActivity {
    List<App> appList;
    AppAdapter appsAdapter;
    ListView appDisplay;
    public static String APP_DETAILS = "APP DETAILS";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_applist);

        appDisplay = findViewById(R.id.applistview);
        if(getIntent() != null && getIntent().hasExtra(MainActivity.APP_CATEGORY)){
            String key = getIntent().getStringExtra(MainActivity.APP_CATEGORY);
            appList = Data.apps.get(key);
            setTitle(key);
            appsAdapter = new AppAdapter(this,R.layout.activity_applist, appList);
            appDisplay.setAdapter(appsAdapter);

            appDisplay.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Intent intent = new Intent(AppListActivity.this, AppDetailsActivity.class);
                    App appDetails = appList.get(position);
                    intent.putExtra(APP_DETAILS, appDetails);
                    startActivity(intent);
                }
            });
        }


    }
}