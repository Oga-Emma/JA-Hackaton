package org.ja_nigeria.janigeria.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.ja_nigeria.janigeria.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class AnnouncementsFragment extends Fragment {


    public AnnouncementsFragment() {
        // Required empty public constructor
    }

    public static AnnouncementsFragment newInstance() {
        AnnouncementsFragment frag = new AnnouncementsFragment();
        return frag;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_announcements, container, false);
    }

}
