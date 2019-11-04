package com.ardakazanci.databinding_exercise_java_5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.ardakazanci.databinding_exercise_java_5.databinding.ActivityMainBinding;
import com.ardakazanci.databinding_exercise_java_5.model.User;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        ActivityMainBinding mainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);

        User u = new User();
        u.setProfileImage("https://image.shutterstock.com/image-vector/sample-stamp-grunge-texture-vector-260nw-1389188336.jpg");

        mainBinding.setUser(u);




    }
}
