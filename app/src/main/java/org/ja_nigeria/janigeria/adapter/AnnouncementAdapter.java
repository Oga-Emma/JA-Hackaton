package org.ja_nigeria.janigeria.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import org.ja_nigeria.janigeria.R;
import org.ja_nigeria.janigeria.model.Notification;

import java.util.List;

public class AnnouncementAdapter extends RecyclerView.Adapter<AnnouncementAdapter.AnnouncementViewHolder> {

    private Context mContext;
    private List<Notification> notificationList;

    public AnnouncementAdapter(Context context, List<Notification> notifications) {
        this.mContext = context;
        this.notificationList = notifications;
    }

    @NonNull
    @Override
    public AnnouncementViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Inflate the task_layout to a view
        View view = LayoutInflater.from(mContext)
                .inflate(R.layout.notification_item, parent, false);

        return new AnnouncementViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AnnouncementViewHolder holder, int position) {
        Notification notification = notificationList.get(position);
        holder.announcementMessage.setText(notification.getMessage());
        holder.announcementDate.setText(notification.getDate());

        //Use Glide to load the profile Image from firebase storage or use cached photo


    }

    @Override
    public int getItemCount() {
        if (notificationList == null) return 0;

        return notificationList.size();
    }

    public List<Notification> getNotificationList() {
        return notificationList;
    }

    public void setNotificationList(List<Notification> notificationList) {
        this.notificationList = notificationList;
        notifyDataSetChanged();
    }

    public class AnnouncementViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        private ImageView mProfileImage;
        private TextView announcementMessage;
        private TextView announcementDate;

        public AnnouncementViewHolder(View itemView) {
            super(itemView);
            mProfileImage = itemView.findViewById(R.id.noti_profile_image);
            announcementMessage = itemView.findViewById(R.id.announcement_message);
            announcementDate = itemView.findViewById(R.id.announcement_date);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {

        }
    }
}
