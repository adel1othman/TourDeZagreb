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

public class SquaresFragment extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.squares, container, false);

        final ArrayList<MyTour> tours = new ArrayList<>();
        tours.add(new MyTour(R.string.bana, R.drawable.trg_bana_jelacica, R.string.banaLocation));
        tours.add(new MyTour(R.string.tomislav, R.drawable.trg_kralja_tomislava, R.string.tomislavLocation));
        tours.add(new MyTour(R.string.dzamija, R.drawable.dzamija, R.string.dzLocation));

        TourAdapter adapter = new TourAdapter(getContext(), tours);

        ListView listView = (ListView) rootView.findViewById(R.id.squareList);

        listView.setAdapter(adapter);

        return rootView;
    }
}