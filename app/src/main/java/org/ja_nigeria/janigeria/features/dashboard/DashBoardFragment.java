package org.ja_nigeria.janigeria.features.dashboard;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.ja_nigeria.janigeria.MainActivity;
import org.ja_nigeria.janigeria.PagerAdapter;
import org.ja_nigeria.janigeria.R;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class DashBoardFragment extends Fragment {

    private TabLayoutSetupCallback mToolbarSetupCallback;
    private ArrayList<String> mTabNamesList;

    public DashBoardFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mTabNamesList = new ArrayList<>();
        mTabNamesList.add(getString(R.string.enrolled));
        mTabNamesList.add(getString(R.string.explore));
    }

    public static DashBoardFragment newInstance() {
        DashBoardFragment frag = new DashBoardFragment();
        return frag;
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        if (context instanceof MainActivity) {
            mToolbarSetupCallback = (TabLayoutSetupCallback) context;
        } else {
            throw new ClassCastException(context.toString() + " must implement TabLayoutSetupCallback");
        }
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_dash_board, container, false);

        // Use PagerAdapter to manage page views in fragments.
        final PagerAdapter adapter = new PagerAdapter
                (getFragmentManager(),mTabNamesList );
        ViewPager viewPager = rootView.findViewById(R.id.view_pager);
        viewPager.setAdapter(adapter);

        mToolbarSetupCallback.setupTabLayout(viewPager);
        return rootView;
    }


    public interface TabLayoutSetupCallback {
        void setupTabLayout(ViewPager viewPager);
    }

}
