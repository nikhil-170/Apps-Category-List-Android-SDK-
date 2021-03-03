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
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView appCategories;
    ArrayAdapter<String> adapter;
    ArrayList<String> data = new ArrayList<>(Data.apps.keySet());
    public static String APP_CATEGORY = "APP CATEGORY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle(getResources().getString(R.string.app_Category));

        appCategories = findViewById(R.id.appCategoriesid);
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, data);
        appCategories.setAdapter(adapter);

        appCategories.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this, AppListActivity.class);
                String pos = data.get(position);
                intent.putExtra(APP_CATEGORY,pos);
                startActivity(intent);
            }
        });
    }
}