package com.example.android.tourdezagreb;

/**
 * Created by Adel on 5/13/2017.
 */

public class MyTour {

    private int mTitleResourceId;
    private int mImageResourceId;
    private int mLocationResourceId;

    int getmTitle(){
        return mTitleResourceId;
    }

    int getmLocation(){
        return mLocationResourceId;
    }

    int getmImageResource(){
        return mImageResourceId;
    }

    public MyTour(int title, int imageResource, int location){
        mTitleResourceId = title;
        mImageResourceId = imageResource;
        mLocationResourceId = location;
    }
}
