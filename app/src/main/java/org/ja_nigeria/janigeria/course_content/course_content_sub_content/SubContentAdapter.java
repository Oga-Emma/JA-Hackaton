package org.ja_nigeria.janigeria.course_content.course_content_sub_content;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.ja_nigeria.janigeria.R;

public class SubContentAdapter extends RecyclerView.Adapter<SubContentAdapter.SubContentHolder>{

    @NonNull
    @Override
    public SubContentHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.course_content_sub_contents, parent, false);

        return new SubContentHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull SubContentHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 3;
    }

    public class SubContentHolder extends RecyclerView.ViewHolder{

        public SubContentHolder(View itemView) {
            super(itemView);
        }
    }
}
