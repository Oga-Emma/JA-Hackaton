package org.ja_nigeria.janigeria.features.chat_channels;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.ja_nigeria.janigeria.R;

public class ChatChannelAdapter extends RecyclerView.Adapter<ChatChannelAdapter.ChatChannelHolder>{

    private ChatItemClickListener chatItemClickListener;

    public ChatChannelAdapter(ChatItemClickListener chatItemClickListener) {
        this.chatItemClickListener = chatItemClickListener;
    }

    @NonNull
    @Override
    public ChatChannelHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ChatChannelHolder(LayoutInflater.from(parent.getContext())
        .inflate(R.layout.channels_recycler_view_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ChatChannelHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }

    public class ChatChannelHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        public ChatChannelHolder(View itemView) {
            super(itemView);

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            chatItemClickListener.onChatItemClicked(getAdapterPosition());
        }
    }


    public interface ChatItemClickListener{
        void onChatItemClicked(int position);
    }
}
