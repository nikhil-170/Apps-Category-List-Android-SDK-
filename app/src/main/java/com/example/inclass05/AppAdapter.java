package com.example.inclass05;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class AppAdapter extends android.widget.ArrayAdapter<App> {

    public AppAdapter(AppListActivity applistActivity, int activity_apps_list, List<App> applist) {
        super(applistActivity, activity_apps_list, applist);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.cardviewlayout,parent, false);
        }

        App app = getItem(position);
        TextView appName = convertView.findViewById(R.id.appname);
        TextView artistName = convertView.findViewById(R.id.artistName);
        TextView releaseDate = convertView.findViewById(R.id.releaseDate);

        appName.setText(app.name);
        artistName.setText(app.artistName);
        releaseDate.setText(app.releaseDate);

        return convertView;
    }
}
