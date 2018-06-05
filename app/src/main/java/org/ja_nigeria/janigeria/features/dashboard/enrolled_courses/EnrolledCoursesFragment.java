package org.ja_nigeria.janigeria.features.dashboard.enrolled_courses;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.ja_nigeria.janigeria.R;
import org.ja_nigeria.janigeria.features.dashboard.enrolled_courses.course_content.CourseContentActivity;
import org.ja_nigeria.janigeria.model.EnrolledCourse;
import org.ja_nigeria.janigeria.repository.EnrolledCourseRepository;

/**
 * A simple {@link Fragment} subclass.
 */
public class EnrolledCoursesFragment extends Fragment
        implements EnrolledCoursesAdapter.OnEnrrolledCourseClickedListener{


    private String TAG = EnrolledCoursesFragment.class.getSimpleName();
    EnrolledCoursesAdapter adapter;

    private RecyclerView enrolledCoursesRecyclerView;


    public EnrolledCoursesFragment() {
        // Required empty public constructor
    }

    public static EnrolledCoursesFragment newInstance() {
        EnrolledCoursesFragment frag = new EnrolledCoursesFragment();
        return frag;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_enrolled_courses, container, false);


        adapter = new EnrolledCoursesAdapter(EnrolledCourseRepository
                .getInstance().getEnrolledCourses(), this);
        enrolledCoursesRecyclerView = view.findViewById(R.id.enrolled_recycler_view);
        enrolledCoursesRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        enrolledCoursesRecyclerView.setAdapter(adapter);

        return view;
    }

    @Override
    public void onEnrolledCourseClicked(EnrolledCourse enrolledCourse) {

        CourseContentActivity.startActivity(enrolledCourse, getContext());
//        startActivity(new Intent(getContext(), CourseContentActivity.class));
    }
}
