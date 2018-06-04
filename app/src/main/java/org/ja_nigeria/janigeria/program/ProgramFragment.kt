package org.ja_nigeria.janigeria.program

import android.content.Context
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import kotlinx.android.synthetic.main.program_fragment.*

import org.ja_nigeria.janigeria.R

class ProgramFragment : Fragment(), ProgramAdapter.OnProgramClickedListener {
    override fun ProgramClicked() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        var view = inflater.inflate(R.layout.program_fragment, container, false)

//        primary_recycler_view.layoutManager(LinearLayout)
        primary_recycler_view.adapter = ProgramAdapter(this)


        return view
    }

}
