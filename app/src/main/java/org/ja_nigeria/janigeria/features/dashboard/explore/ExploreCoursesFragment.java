package org.ja_nigeria.janigeria.features.dashboard.explore;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.ja_nigeria.janigeria.R;
import org.ja_nigeria.janigeria.features.dashboard.explore.ProgramAdapter;

/**
 * A simple {@link Fragment} subclass.
 */
public class ExploreCoursesFragment extends Fragment {

    RecyclerView programRV;


    public static ExploreCoursesFragment newInstance() {
        ExploreCoursesFragment frag = new ExploreCoursesFragment();
        return frag;
    }

    public ExploreCoursesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.program_fragment, container, false);


        programRV = view.findViewById(R.id.program_recycler_view);
        programRV.setLayoutManager(new LinearLayoutManager(getContext()));
        programRV.setAdapter(new ProgramAdapter(getContext()));


        return view;
    }

}
