package org.ja_nigeria.janigeria.features.dashboard.enrolled_courses.view_all_course_contents;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.ja_nigeria.janigeria.R;

public class ViewAllAdapter extends RecyclerView.Adapter<ViewAllAdapter.ViewAllHolder>{

    @NonNull
    @Override
    public ViewAllHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewAllHolder(LayoutInflater.from(parent.getContext())
        .inflate(R.layout.view_all_recycler_view_holder, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewAllHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 5;
    }

    public class ViewAllHolder extends RecyclerView.ViewHolder{

        public ViewAllHolder(View itemView) {
            super(itemView);
        }
    }
}
