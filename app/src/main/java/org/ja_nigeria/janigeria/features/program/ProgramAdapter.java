package org.ja_nigeria.janigeria.features.program;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.ja_nigeria.janigeria.R;
import org.ja_nigeria.janigeria.features.courses.CoursePreviewActivity;

public class ProgramAdapter extends RecyclerView.Adapter<ProgramAdapter.ProgramHolder>{

    Context context;

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

    }

    @Override
    public int getItemCount() {
        return 6;
    }

    public class ProgramHolder extends RecyclerView.ViewHolder
            implements ProgramCoursesAdapter.OnProgramCourseClickedListener{

        RecyclerView programCoursesRV;

        public ProgramHolder(View itemView) {
            super(itemView);
            programCoursesRV = itemView.findViewById(R.id.program_courses_recycler_view);
            programCoursesRV.setLayoutManager(new LinearLayoutManager(context,
                    LinearLayoutManager.HORIZONTAL, false));
            programCoursesRV.setAdapter(new ProgramCoursesAdapter(context,this));

        }

        @Override
        public void ProgramClicked() {
            context.startActivity(new Intent(context, CoursePreviewActivity.class));
        }
    }


}
