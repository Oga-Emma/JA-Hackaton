package org.ja_nigeria.janigeria.features.course_content.course_content_sub_content;

import android.support.annotation.NonNull;
import android.support.v7.view.menu.MenuView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import org.ja_nigeria.janigeria.R;
import org.ja_nigeria.janigeria.model.ModuleContent;
import org.ja_nigeria.janigeria.utils.ModuleStatus;
import org.ja_nigeria.janigeria.utils.ModuleType;

import java.util.List;
import java.util.Random;

public class SubContentAdapter extends RecyclerView.Adapter<SubContentAdapter.SubContentHolder>{

    private List<ModuleContent> moduleContents;

    public SubContentAdapter(List<ModuleContent> moduleContents) {
        this.moduleContents = moduleContents;
    }

    @NonNull
    @Override
    public SubContentHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.course_content_sub_contents, parent, false);

        return new SubContentHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull SubContentHolder holder, int position) {
        holder.bindView(moduleContents.get(position));

    }

    @Override
    public int getItemCount() {
        return 3;
    }

    public class SubContentHolder extends RecyclerView.ViewHolder{

        private ImageView courseType, courseStatus;
        private TextView title;

        public SubContentHolder(View itemView) {
            super(itemView);

            title = itemView.findViewById(R.id.title_text_view);
            courseType = itemView.findViewById(R.id.type_image_view);
            courseStatus = itemView.findViewById(R.id.status_image_view);
        }

        public void bindView(ModuleContent moduleContent) {
            title.setText(moduleContent.getTitle());
            if(moduleContent.getStatus() == ModuleStatus.SEEN){
                courseStatus.setImageResource(R.drawable.checked_icon);
            }else{
                courseStatus.setImageResource(R.drawable.ic_chevron_right_black_24dp);
            }

            if(moduleContent.getType() == ModuleType.PDF){
                courseType.setImageResource(R.drawable.ic_file);

            }else if(moduleContent.getType() == ModuleType.VIDEO){
                courseType.setImageResource(R.drawable.video_icon);
            }else{
                courseType.setImageResource(R.drawable.question_test_icon);
            }

        }
    }
}
