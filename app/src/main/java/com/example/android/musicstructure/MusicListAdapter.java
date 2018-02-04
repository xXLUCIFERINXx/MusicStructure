package com.example.android.musicstructure;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MusicListAdapter extends ArrayAdapter<MusicClass> {


    public MusicListAdapter(@NonNull Context context, ArrayList<MusicClass> listView) {
        super(context, 0, listView);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        MusicClass listView = getItem(position);

        ImageView img = convertView.findViewById(R.id.listImg);
        TextView name = convertView.findViewById(R.id.listName);
        if (listView != null) {
            img.setImageResource(listView.getImgRes());
            name.setText(listView.getName());
        }
        return convertView;
    }
}
