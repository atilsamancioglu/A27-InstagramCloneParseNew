package com.atilsamancioglu.instagramcloneparseexample;

import android.app.Activity;
import android.graphics.Bitmap;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class PostClass extends ArrayAdapter<String> {

    private final ArrayList<String> username;
    private final ArrayList<String> userComment;
    private final ArrayList<Bitmap> userImage;
    private final Activity context;

    public PostClass(ArrayList<String> username, ArrayList<String> userComment, ArrayList<Bitmap> userImage, Activity context) {
        super(context,R.layout.custom_view,username);
        this.username = username;
        this.userComment = userComment;
        this.userImage = userImage;
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater layoutInflater = context.getLayoutInflater();
        View customView = layoutInflater.inflate(R.layout.custom_view,null,true);
        TextView userNameText = customView.findViewById(R.id.custom_view_username_text);
        TextView commentText = customView.findViewById(R.id.custom_view_comment_text);
        ImageView imageView = customView.findViewById(R.id.custom_view_imageview);

        userNameText.setText(username.get(position));
        imageView.setImageBitmap(userImage.get(position));
        commentText.setText(userComment.get(position));

        return customView;
    }
}
