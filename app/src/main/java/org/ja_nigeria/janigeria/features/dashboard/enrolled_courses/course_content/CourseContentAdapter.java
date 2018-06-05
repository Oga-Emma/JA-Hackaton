package org.ja_nigeria.janigeria.features.dashboard.enrolled_courses.course_content;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.ja_nigeria.janigeria.R;
import org.ja_nigeria.janigeria.features.dashboard.enrolled_courses.course_content.course_content_sub_content.SubContentAdapter;
import org.ja_nigeria.janigeria.model.CourseModules;

import java.util.List;

public class CourseContentAdapter extends
        RecyclerView.Adapter<CourseContentAdapter.CourseContentHolder>{

    private List<CourseModules> modules;
    private Context context;

    public CourseContentAdapter(List<CourseModules> modules, Context context) {
        this.modules = modules;
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
        holder.bindView(modules.get(position));
    }

    @Override
    public int getItemCount() {
        return modules.size();
    }

    public class CourseContentHolder extends RecyclerView.ViewHolder{

        RecyclerView subContentRV;
        TextView moduleTitleTV;

        public CourseContentHolder(View itemView) {
            super(itemView);

            moduleTitleTV = itemView.findViewById(R.id.module_title_text_view);

            subContentRV = itemView.findViewById(R.id.sub_content_RV);
            subContentRV.setLayoutManager(new LinearLayoutManager(context));

        }

        public void bindView(CourseModules courseModules) {
            moduleTitleTV.setText(courseModules.getHeading());
            subContentRV.setAdapter(new SubContentAdapter(courseModules.getModuleContents()));
        }
    }
}
