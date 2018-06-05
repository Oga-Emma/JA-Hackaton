package org.ja_nigeria.janigeria.features.chat_channels;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.ja_nigeria.janigeria.R;
import org.ja_nigeria.janigeria.features.chat_channels.discussion.DiscussionActivity;
import org.jetbrains.annotations.Nullable;

/**
 * A simple {@link Fragment} subclass.
 */
public class ChatChannelFragment extends Fragment implements ChatChannelAdapter.ChatItemClickListener{

    private RecyclerView chatChannelsRV;

    public ChatChannelFragment() {
        // Required empty public constructor
    }


    @Nullable
    public static Fragment newInstance() {
        return new ChatChannelFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_chat_channel, container, false);

        chatChannelsRV = v.findViewById(R.id.chant_channels_frame_layout);
        chatChannelsRV.setLayoutManager(new LinearLayoutManager(getContext()));
        chatChannelsRV.setAdapter(new ChatChannelAdapter(this));


        return v;
    }


    @Override
    public void onChatItemClicked(int position) {
        DiscussionActivity.launchActivity(getContext());
    }
}
