package com.example.android.tourdezagreb;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Adel on 5/13/2017.
 */

public class LakesFragment extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.lakes, container, false);

        final ArrayList<MyTour> tours = new ArrayList<>();
        tours.add(new MyTour(R.string.jarun, R.drawable.jarun, R.string.jarunLocation));
        tours.add(new MyTour(R.string.maksimir, R.drawable.maksimir, R.string.maksimirLocation));
        tours.add(new MyTour(R.string.bundek, R.drawable.bundek, R.string.bundekLocation));

        TourAdapter adapter = new TourAdapter(getContext(), tours);

        ListView listView = (ListView) rootView.findViewById(R.id.lakesList);

        listView.setAdapter(adapter);

        return rootView;
    }
}