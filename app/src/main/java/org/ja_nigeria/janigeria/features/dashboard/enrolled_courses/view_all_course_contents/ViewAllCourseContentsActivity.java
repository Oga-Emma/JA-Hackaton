package org.ja_nigeria.janigeria.features.dashboard.enrolled_courses.view_all_course_contents;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import org.ja_nigeria.janigeria.R;

public class ViewAllCourseContentsActivity extends AppCompatActivity {

    private RecyclerView allCoursesRV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_all_course_contents);

        allCoursesRV = findViewById(R.id.recycler_view);
        allCoursesRV.setLayoutManager(new LinearLayoutManager(this));

    }
}
