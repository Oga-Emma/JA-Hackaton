package org.ja_nigeria.janigeria.fragments;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.ja_nigeria.janigeria.MainActivity;
import org.ja_nigeria.janigeria.PagerAdapter;
import org.ja_nigeria.janigeria.R;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

/**
 * A simple {@link Fragment} subclass.
 */
public class NotificationFragment extends Fragment {

    private NotificationFragment.TabLayoutSetupCallbackNotifications mToolbarSetupCallback;
    private ArrayList<String> mTabNamesList;

    public NotificationFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mTabNamesList = new ArrayList<>();
        mTabNamesList.add(getString(R.string.messages));
        mTabNamesList.add(getString(R.string.announcements));
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        if (context instanceof MainActivity) {
            mToolbarSetupCallback = (NotificationFragment.TabLayoutSetupCallbackNotifications) context;
        } else {
            throw new ClassCastException(context.toString() + " must implement TabLayoutSetupCallback");
        }
    }

    public static NotificationFragment newInstance() {
        NotificationFragment frag = new NotificationFragment();
        return frag;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_notification, container, false);


        // Use PagerAdapter to manage page views in fragments.
        final NotificationsPagerAdapter adapter = new NotificationsPagerAdapter
                (getFragmentManager(), mTabNamesList);
        ViewPager viewPager = rootView.findViewById(R.id.view_pager_notification);
        viewPager.setAdapter(adapter);

        mToolbarSetupCallback.setupNotificationTabLayout(viewPager);

        return rootView;
    }


    //Inner Class extending PagerAdapter
    public class NotificationsPagerAdapter extends FragmentStatePagerAdapter {

        private List<String> mTabs = new ArrayList<>();

        public NotificationsPagerAdapter(FragmentManager fm, List<String> mTabs) {
            super(fm);
            this.mTabs = mTabs;
        }

        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    return MessagesFragment.newInstance();
                case 1:
                    return AnnouncementsFragment.newInstance();
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

    public interface TabLayoutSetupCallbackNotifications {
        void setupNotificationTabLayout(ViewPager viewPager);
    }

}
