package org.ja_nigeria.janigeria.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;

import org.ja_nigeria.janigeria.R;
import org.ja_nigeria.janigeria.adapter.AnnouncementAdapter;
import org.ja_nigeria.janigeria.model.Notification;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class AnnouncementsFragment extends Fragment {
    private RecyclerView mRecyclerView;
    private LinearLayoutManager mLayoutManager;
    private AnnouncementAdapter mAdapter;
    private ProgressBar mProgress;
    private TextView mTextView;
    private List<Notification> mList;


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
        View rootView = inflater.inflate(R.layout.fragment_announcements, container, false);
        mRecyclerView = rootView.findViewById(R.id.announcement_recycler_view);
        mRecyclerView.setHasFixedSize(true);

        // use a linear layout manager
        mLayoutManager = new LinearLayoutManager(getContext());
        mRecyclerView.setLayoutManager(mLayoutManager);

        // specify an adapter (see also next example)
        mAdapter = new AnnouncementAdapter(getContext(), mList);
        mRecyclerView.setAdapter(mAdapter);
        fetchNotifications();
        mAdapter.setNotificationList(mList);
        return rootView;
    }

    private void fetchNotifications() {

        mList = new ArrayList<>();
        mList.add(new Notification("Emma Eze your classmate announced that all assignments were updated.",
                "6th June, 2018", "www.google.com"));
        mList.add(new Notification("Mr. Okeke has posted a new material for his course. Check it out.",
                "24th May, 2018", "www.google.com"));
        mList.add(new Notification("JA CITY course will be closed for the summer next week.",
                "29th May, 2018", "www.google.com"));
        mList.add(new Notification("All Students have been instructed to update their Apps.",
                "2nd June, 2018", "www.google.com"));
    }

}
