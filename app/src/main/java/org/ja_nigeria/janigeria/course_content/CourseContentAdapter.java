package org.ja_nigeria.janigeria.course_content;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.ja_nigeria.janigeria.R;
import org.ja_nigeria.janigeria.course_content.course_content_sub_content.SubContentAdapter;

public class CourseContentAdapter extends
        RecyclerView.Adapter<CourseContentAdapter.CourseContentHolder>{

    private Context context;

    public CourseContentAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public CourseContentHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.course_content_recycler_view_item, parent, false);
        return new CourseContentHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CourseContentHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 5;
    }

    public class CourseContentHolder extends RecyclerView.ViewHolder{

        RecyclerView subContentRV;
        public CourseContentHolder(View itemView) {
            super(itemView);

            subContentRV = itemView.findViewById(R.id.sub_content_RV);
            subContentRV.setLayoutManager(new LinearLayoutManager(context));
            subContentRV.setAdapter(new SubContentAdapter());

        }
    }
}
