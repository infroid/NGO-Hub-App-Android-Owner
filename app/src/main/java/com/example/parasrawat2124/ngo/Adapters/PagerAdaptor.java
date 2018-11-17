package com.example.parasrawat2124.ngo.Adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.parasrawat2124.ngo.Fragments.PermanentDetails;
import com.example.parasrawat2124.ngo.Fragments.SecondryDetails;

public class PagerAdaptor extends FragmentStatePagerAdapter {
    int numberoftabs;
    public PagerAdaptor(FragmentManager fm,int numberoftabs) {

        super(fm);
        this.numberoftabs=numberoftabs;
    }

    @Override
    public Fragment getItem(int i) {
        switch (i){
            case 0:
                PermanentDetails permanentDetails=new PermanentDetails();
                return permanentDetails;
            case 1:
                SecondryDetails secondryDetails=new SecondryDetails();
                return secondryDetails;

        }
        return null;
    }

    @Override
    public int getCount() {
        return numberoftabs;
    }
}
