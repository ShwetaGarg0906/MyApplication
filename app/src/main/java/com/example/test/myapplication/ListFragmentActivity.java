package com.example.test.myapplication;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ListFragmentActivity extends AppCompatActivity {

    FragmentManager manager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_fragment);
        manager=getSupportFragmentManager();
        attachFragment();
    }

    private void attachFragment() {
        MyListFragment myListFragment = new MyListFragment();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.list_fragment,myListFragment);
        transaction.commit();
    }
}
