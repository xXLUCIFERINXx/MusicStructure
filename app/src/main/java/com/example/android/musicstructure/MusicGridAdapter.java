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

public class MusicGridAdapter extends ArrayAdapter<MusicClass> {

    MusicGridAdapter(@NonNull Context context, ArrayList<MusicClass> gridView) {
        super(context, 0, gridView);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.grid_item, parent, false);
        }

        MusicClass gridView = getItem(position);

        ImageView img = convertView.findViewById(R.id.gridImg);
        TextView name = convertView.findViewById(R.id.gridName);

        if (gridView != null) {

            img.setImageResource(gridView.getImgRes());
            name.setText(gridView.getName());
        }
        return convertView;
    }
}
