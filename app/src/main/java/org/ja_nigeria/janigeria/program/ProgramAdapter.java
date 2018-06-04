package org.ja_nigeria.janigeria.program;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.ja_nigeria.janigeria.R;

public class ProgramAdapter extends RecyclerView.Adapter<ProgramAdapter.ProgramHolder>{

    OnProgramClickedListener onProgramClickedListener;

    public ProgramAdapter(OnProgramClickedListener onProgramClickedListener) {
        this.onProgramClickedListener = onProgramClickedListener;
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
        return 3;
    }

    public class ProgramHolder extends RecyclerView.ViewHolder
            implements View.OnClickListener{

        public ProgramHolder(View itemView) {
            super(itemView);

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            onProgramClickedListener.ProgramClicked();
        }
    }



    public interface OnProgramClickedListener{
        void ProgramClicked();
    }
}
