package org.ja_nigeria.janigeria.course_content;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import org.ja_nigeria.janigeria.R;

public class CourseContentActivity extends AppCompatActivity {

    private RecyclerView courseContentRV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.course_content_activity);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        courseContentRV = findViewById(R.id.course_content_recycler_view);
        courseContentRV.setLayoutManager(new LinearLayoutManager(this));
        courseContentRV.setAdapter(new CourseContentAdapter(this));

    }
}
