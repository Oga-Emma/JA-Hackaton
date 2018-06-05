package org.ja_nigeria.janigeria.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;

import org.ja_nigeria.janigeria.R;
import org.ja_nigeria.janigeria.adapter.AnnouncementAdapter;
import org.ja_nigeria.janigeria.adapter.MessageAdapter;
import org.ja_nigeria.janigeria.model.Message;
import org.ja_nigeria.janigeria.model.Notification;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class MessagesFragment extends Fragment {
    private RecyclerView mRecyclerView;
    private LinearLayoutManager mLayoutManager;
    private ProgressBar mProgressBar;
    private MessageAdapter mAdapter;
    private List<Message> mList;

    public MessagesFragment() {
        // Required empty public constructor
    }

    public static MessagesFragment newInstance() {
        MessagesFragment frag = new MessagesFragment();
        return frag;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_messages, container, false);
        mRecyclerView = rootView.findViewById(R.id.message_recycler_view);
        mProgressBar = rootView.findViewById(R.id.messagePbLoading);

        mRecyclerView.setHasFixedSize(true);

        // use a linear layout manager
        mLayoutManager = new LinearLayoutManager(getContext());
        mRecyclerView.setLayoutManager(mLayoutManager);

        // specify an adapter (see also next example)
        mAdapter = new MessageAdapter(getContext(), mList);
        mRecyclerView.setAdapter(mAdapter);
        fetchMessages();
        mAdapter.setMessageList(mList);
        return rootView;
    }

    private void fetchMessages() {
        mList = new ArrayList<>();

        mList.add(new Message("Ofoegbu Valentine", "12:08AM", "Hi, Help me out with this problem", "www.google.com"));
        mList.add(new Message("Okey Martins", "02:10AM", "WhatsUp Guy, where are you", "www.google.com"));
        mList.add(new Message("Emmanuel", "04:08AM", "Hey dude, are you thru?", "www.google.com"));
        mList.add(new Message("Emeka Eze", "12:08PM", "Am through with the Assignment", "www.google.com"));
    }
}
