package org.ja_nigeria.janigeria.features.download;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import org.ja_nigeria.janigeria.R;

import java.util.Arrays;

/**
 * A simple {@link Fragment} subclass.
 */
public class DownloadFragment extends Fragment {


    public DownloadFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_download, container, false);

        String [] downloaded_data  = {
         "introduction.pdf",
         "about the course.mp4",
         "recommended materials.pdf"
        };

        ListView listView = v.findViewById(R.id.download_list_view);

        ArrayAdapter<String> adapter =
                new ArrayAdapter<>(getContext(),
                        android.R.layout.simple_list_item_1, Arrays.asList(downloaded_data));

        listView.setAdapter(adapter);

        return v;
    }

}
