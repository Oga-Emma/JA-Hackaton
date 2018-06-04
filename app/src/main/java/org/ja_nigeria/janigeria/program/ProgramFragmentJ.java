package org.ja_nigeria.janigeria.program;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.ja_nigeria.janigeria.R;
import org.ja_nigeria.janigeria.courses.CoursePreviewActivity;

/**
 * A simple {@link Fragment} subclass.
 */
public class ProgramFragmentJ extends Fragment implements ProgramAdapter.OnProgramClickedListener {

    RecyclerView primaryRV;
    RecyclerView JuniorSecRV;

    RecyclerView secondaryRV;
    RecyclerView outOfSchoolRV;

    RecyclerView leadCampRV;
    RecyclerView vimpRV;


    public ProgramFragmentJ() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.program_fragment, container, false);


        primaryRV = view.findViewById(R.id.primary_recycler_view);
        primaryRV.setLayoutManager(new LinearLayoutManager(getContext(),
                LinearLayoutManager.HORIZONTAL, false));
        primaryRV.setAdapter(new ProgramAdapter(this));

        JuniorSecRV = view.findViewById(R.id.junior_secondary_recycler_view);
        JuniorSecRV.setLayoutManager(new LinearLayoutManager(getContext(),
                LinearLayoutManager.HORIZONTAL, false));
        JuniorSecRV.setAdapter(new ProgramAdapter(this));

        secondaryRV = view.findViewById(R.id.senior_secondary_recycler_view);
        secondaryRV.setLayoutManager(new LinearLayoutManager(getContext(),
                LinearLayoutManager.HORIZONTAL, false));
        secondaryRV.setAdapter(new ProgramAdapter(this));

        outOfSchoolRV = view.findViewById(R.id.out_of_school_recycler_view);
        outOfSchoolRV.setLayoutManager(new LinearLayoutManager(getContext(),
                LinearLayoutManager.HORIZONTAL, false));
        outOfSchoolRV.setAdapter(new ProgramAdapter(this));

        leadCampRV = view.findViewById(R.id.lead_recycler_view);
        leadCampRV.setLayoutManager(new LinearLayoutManager(getContext(),
                LinearLayoutManager.HORIZONTAL, false));
        leadCampRV.setAdapter(new ProgramAdapter(this));

        vimpRV = view.findViewById(R.id.vimp_recycler_view);
        vimpRV.setLayoutManager(new LinearLayoutManager(getContext(),
                LinearLayoutManager.HORIZONTAL, false));
        vimpRV.setAdapter(new ProgramAdapter(this));

        return view;
    }


    @Override
    public void ProgramClicked() {
        startActivity(new Intent(getContext(), CoursePreviewActivity.class));
    }
}
