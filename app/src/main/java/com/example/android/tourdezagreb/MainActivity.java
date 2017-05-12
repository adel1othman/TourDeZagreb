package com.example.android.tourdezagreb;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView image1, image2, image3;
    TextView txtView1, txtView2, txtView3;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_squares:
                    image3.setVisibility(View.VISIBLE);
                    txtView3.setVisibility(View.VISIBLE);
                    image1.setImageResource(R.drawable.trg_bana_jelacica);
                    image2.setImageResource(R.drawable.trg_kralja_tomislava);
                    image3.setImageResource(R.drawable.dzamija);
                    txtView1.setText(R.string.bana);
                    txtView2.setText(R.string.tomislav);
                    txtView3.setText(R.string.dzamija);
                    return true;
                case R.id.navigation_lakes:
                    image3.setVisibility(View.VISIBLE);
                    txtView3.setVisibility(View.VISIBLE);
                    image1.setImageResource(R.drawable.jarun);
                    image2.setImageResource(R.drawable.maksimir);
                    image3.setImageResource(R.drawable.bundek);
                    txtView1.setText(R.string.jarun);
                    txtView2.setText(R.string.maksimir);
                    txtView3.setText(R.string.bundek);
                    return true;
                case R.id.navigation_events:
                    image1.setImageResource(R.drawable.sljeme);
                    image2.setImageResource(R.drawable.inmusic);
                    image3.setVisibility(View.GONE);
                    txtView1.setText(R.string.sljeme);
                    txtView2.setText(R.string.inmusic);
                    txtView3.setVisibility(View.GONE);
                    return true;
                case R.id.navigation_other:
                    image1.setImageResource(R.drawable.arena);
                    image2.setImageResource(R.drawable.cibona);
                    image3.setVisibility(View.GONE);
                    txtView1.setText(R.string.arena);
                    txtView2.setText(R.string.cibona);
                    txtView3.setVisibility(View.GONE);
                    return true;
            }
            return false;
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        image1 = (ImageView)findViewById(R.id.image1);
        image2 = (ImageView)findViewById(R.id.image2);
        image3 = (ImageView)findViewById(R.id.image3);
        txtView1 = (TextView)findViewById(R.id.txtView1);
        txtView2 = (TextView)findViewById(R.id.txtView2);
        txtView3 = (TextView)findViewById(R.id.txtView3);

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        navigation.setSelectedItemId(R.id.navigation_squares);
    }

}
