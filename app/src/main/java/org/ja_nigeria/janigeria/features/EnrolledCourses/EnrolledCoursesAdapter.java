package org.ja_nigeria.janigeria.features.EnrolledCourses;

import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.ja_nigeria.janigeria.R;
import org.ja_nigeria.janigeria.model.EnrolledCourse;

import java.util.List;

public class EnrolledCoursesAdapter extends RecyclerView.Adapter<EnrolledCoursesAdapter.EnrolledCoursesHolder> {

    private List<EnrolledCourse> enrolledCourses;
    private OnEnrrolledCourseClickedListener listener;

    public EnrolledCoursesAdapter(List<EnrolledCourse> enrolledCourses,
                                  OnEnrrolledCourseClickedListener listener) {
        this.enrolledCourses = enrolledCourses;
        this.listener = listener;
    }

    @NonNull
    @Override
    public EnrolledCoursesHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new EnrolledCoursesHolder(LayoutInflater.from(parent.getContext())
        .inflate(R.layout.enrolled_course_recycler_view_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull EnrolledCoursesHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return enrolledCourses.size();
    }

    public class EnrolledCoursesHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        private CardView cardView;
        public EnrolledCoursesHolder(View itemView) {
            super(itemView);

            cardView = itemView.findViewById(R.id.card_view);
            cardView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            listener.onEnrolledCourseClicked(enrolledCourses.get(
                    getAdapterPosition()));
        }
    }


    public interface OnEnrrolledCourseClickedListener{
        void onEnrolledCourseClicked(EnrolledCourse position);
    }
}
