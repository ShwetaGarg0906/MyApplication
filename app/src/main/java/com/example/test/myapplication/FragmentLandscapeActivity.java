package com.example.test.myapplication;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class FragmentLandscapeActivity extends AppCompatActivity {

    FragmentB fragmentB;
    FragmentManager manager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_landscape);
        Intent i = getIntent();
        int position = i.getIntExtra("index",0);
        manager = getSupportFragmentManager();
        fragmentB = (FragmentB) manager.findFragmentById(R.id.fragment2);

        if (fragmentB!=null)
            fragmentB.changeText(position);
    }
}
