package org.ja_nigeria.janigeria;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import org.ja_nigeria.janigeria.features.dashboard.enrolled_courses.EnrolledCoursesFragment;
import org.ja_nigeria.janigeria.features.dashboard.explore.ExploreCoursesFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ofoegbu Valentine on 27/04/2018.
 */

public class PagerAdapter extends FragmentStatePagerAdapter {

    private List<String> mTabs = new ArrayList<>();

    public PagerAdapter(FragmentManager fm, List<String> mTabs) {
        super(fm);
        this.mTabs = mTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return EnrolledCoursesFragment.newInstance();
            case 1:
                return ExploreCoursesFragment.newInstance();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mTabs.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mTabs.get(position);
    }
}
