package bitchassgroceries.happymilk;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Andrew on 2/7/2017.
 */

public class ViewPagerAdapter extends FragmentPagerAdapter{

    public ViewPagerAdapter(FragmentManager fm){
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Bundle bundle = new Bundle();
        Fragment frag;
        switch (position){
            case 0:
                bundle.putString("NAME", "Stuff I need");
                frag = new ListFragment();
                frag.setArguments(bundle);
                return frag;
            case 1:
                bundle.putString("NAME", "Stuff I have");
                frag = new ListFragment();
                frag.setArguments(bundle);
                return frag;
            default:
                return null;
        }

    }

    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position){
        switch(position){
            case 0: return "Stuff I Have";
            case 1: return "Stuff I Need";
            default: return null;
        }
    }
}
