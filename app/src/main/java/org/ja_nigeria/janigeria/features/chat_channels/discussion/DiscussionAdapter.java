package org.ja_nigeria.janigeria.features.chat_channels.discussion;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.ja_nigeria.janigeria.R;

public class DiscussionAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new DiscussionHolder(LayoutInflater.from(parent.getContext())
        .inflate(R.layout.discussion_rv_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 20;
    }

    public class DiscussionHolder extends RecyclerView.ViewHolder{

        public DiscussionHolder(View itemView) {
            super(itemView);
        }
    }
}
