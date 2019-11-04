package com.ardakazanci.databinding_exercise_java_5.model;

import android.widget.ImageView;

import androidx.databinding.BindingAdapter;

import com.bumptech.glide.Glide;

public class User {

    String profileImage;

    public String getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(String profileImage) {
        this.profileImage = profileImage;
    }

    @BindingAdapter({"android:profileImage"})
    public static void loadImage(ImageView view,String imageUrl){
        Glide.with(view.getContext())
                .load(imageUrl)
                .into(view);
    }
}
