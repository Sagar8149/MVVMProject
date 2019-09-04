package com.example.mvvmproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.example.mvvmproject.databinding.ActivityMainBinding;
import com.example.mvvmproject.model.User;

public class MainActivity extends AppCompatActivity {

    private User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


//        setContentView(R.layout.activity_main);


        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);


        user = new User();
        user.setName("Ravi Tamada");
        user.setEmail("ravi@androidhive.info");

        binding.setUser(user);

//this is coment 1
        //this is coment 1
        //this is coment 1
        //this is coment 1//this is coment 1//this is coment 1
        //this is coment 1
        //this is coment 1
        //this is coment 1
        //this is coment 1//this is coment 1
        //this is coment 1
        //this is coment 1//this is coment 1
        //this is coment 1
        user.getEmail();



    }
}
