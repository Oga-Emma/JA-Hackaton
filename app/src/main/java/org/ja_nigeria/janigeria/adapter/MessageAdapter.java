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
import org.ja_nigeria.janigeria.model.Message;

import java.util.List;

public class MessageAdapter extends RecyclerView.Adapter<MessageAdapter.MessageViewHolder> {
    private Context mContext;
    private List<Message> messageList;


    public MessageAdapter(Context context, List<Message> messageList) {
        this.mContext = context;
        this.messageList = messageList;
    }

    @NonNull
    @Override
    public MessageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Inflate the task_layout to a view
        View view = LayoutInflater.from(mContext)
                .inflate(R.layout.message_item, parent, false);
        return new MessageViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MessageViewHolder holder, int position) {
        Message message = messageList.get(position);
        holder.profileName.setText(message.getSenderName());
        holder.messageBody.setText(message.getMessageBody());
        holder.timestamp.setText(message.getMessageDate());

        //load the message using Glide into the ImageView

    }

    @Override
    public int getItemCount() {
        if (messageList == null) {
            return 0;
        }
        return messageList.size();
    }

    public List<Message> getMessageList() {
        return messageList;
    }

    public void setMessageList(List<Message> messageList) {
        this.messageList = messageList;
        notifyDataSetChanged();
    }

    public class MessageViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private TextView profileName;
        private TextView messageBody;
        private TextView timestamp;
        private ImageView imageView;

        public MessageViewHolder(View itemView) {
            super(itemView);
            profileName = itemView.findViewById(R.id.message_sender_name);
            messageBody = itemView.findViewById(R.id.message_body);
            timestamp = itemView.findViewById(R.id.message_date);
            imageView = itemView.findViewById(R.id.message_profile_image);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {

        }
    }
}
