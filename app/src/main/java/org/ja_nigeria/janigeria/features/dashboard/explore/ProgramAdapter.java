package org.ja_nigeria.janigeria.features.dashboard.explore;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.ja_nigeria.janigeria.R;
import org.ja_nigeria.janigeria.features.dashboard.enrolled_courses.view_all_course_contents.ViewAllCourseContentsActivity;
import org.ja_nigeria.janigeria.features.dashboard.explore.courses.CoursePreviewActivity;

public class ProgramAdapter extends RecyclerView.Adapter<ProgramAdapter.ProgramHolder>{

    Context context;

    String [] programs = {
            "Primary",
            "Junior Secondary",
            "Senior Secondary",
            "Lead Camp",
            "Out of School Program",
            "Vimp"
    };

    public ProgramAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public ProgramHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ProgramHolder(LayoutInflater.from(parent.getContext())
        .inflate(R.layout.program_recycler_view_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ProgramHolder holder, int position) {
        holder.titleTV.setText(programs[position].toUpperCase());
    }

    @Override
    public int getItemCount() {
        return 6;
    }

    public class ProgramHolder extends RecyclerView.ViewHolder
            implements ProgramCoursesAdapter.OnProgramCourseClickedListener, View.OnClickListener{

        RecyclerView programCoursesRV;
        TextView titleTV;

        public ProgramHolder(View itemView) {
            super(itemView);
            programCoursesRV = itemView.findViewById(R.id.program_courses_recycler_view);
            programCoursesRV.setLayoutManager(new LinearLayoutManager(context,
                    LinearLayoutManager.HORIZONTAL, false));
            programCoursesRV.setAdapter(new ProgramCoursesAdapter(context,this));

            titleTV = itemView.findViewById(R.id.program_title_tV);
            itemView.findViewById(R.id.view_all_button).setOnClickListener(this);

        }

        @Override
        public void ProgramClicked() {
            context.startActivity(new Intent(context, CoursePreviewActivity.class));
        }

        @Override
        public void onClick(View v) {
//            context.startActivity(new Intent(context, ViewAllCourseContentsActivity.class));
        }
    }


}
