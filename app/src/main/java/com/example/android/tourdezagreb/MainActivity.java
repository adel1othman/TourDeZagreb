package com.example.android.tourdezagreb;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    final FragmentManager fm = getSupportFragmentManager();
    Fragment selectedFragment;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_squares:
                    selectedFragment = new SquaresFragment();
                    /*fm.beginTransaction().replace(R.id.content, selectedFragment).commit();
                    return true;*/
                    break;
                case R.id.navigation_lakes:
                    selectedFragment = new LakesFragment();
                    /*fm.beginTransaction().replace(R.id.content, selectedFragment).commit();
                    return true;*/
                    break;
                case R.id.navigation_events:
                    selectedFragment = new EventsFragment();
                    /*fm.beginTransaction().replace(R.id.content, selectedFragment).commit();
                    return true;*/
                    break;
                case R.id.navigation_other:
                    selectedFragment = new OtherFragment();
                    /*fm.beginTransaction().replace(R.id.content, selectedFragment).commit();
                    return true;*/
                    break;
            }
            fm.beginTransaction().replace(R.id.content, selectedFragment).commit();
            return true;
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        navigation.setSelectedItemId(R.id.navigation_squares);
    }

}
