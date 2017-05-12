package com.example.android.tourdezagreb;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Adel on 5/13/2017.
 */

public class TourAdapter extends ArrayAdapter<MyTour> {

    public TourAdapter(Context context, ArrayList<MyTour> tours) {
        super(context, 0, tours);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        MyTour currentItem = getItem(position);

        TextView txtTitle = (TextView) listItemView.findViewById(R.id.txtTitle);
        txtTitle.setText(currentItem.getmTitle());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.img);
        imageView.setImageResource(currentItem.getmImageResource());

        TextView txtLocation = (TextView) listItemView.findViewById(R.id.txtLocation);
        txtLocation.setText(currentItem.getmLocation());

        return listItemView;
    }
}
