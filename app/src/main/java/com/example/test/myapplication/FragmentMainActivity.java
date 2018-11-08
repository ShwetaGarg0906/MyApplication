package com.example.test.myapplication;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class FragmentMainActivity extends AppCompatActivity implements FragmentA.Communicator{
/* for onclick button counter example
    FragmentManager manager;
    FragmentTransaction transaction;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_main);
        manager =getSupportFragmentManager();
    }

    @Override
    public void respond(String data) {
       // transaction = manager.beginTransaction();
        FragmentB fragmentB= (FragmentB) manager.findFragmentById(R.id.fragment_b);
        fragmentB.changeText("the value of counter is"+data);
    }
    */
   /* FragmentManager manager ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_main);
        manager =getSupportFragmentManager();
    }

    @Override
    public void respond(int position) {
        FragmentB fragmentB = (FragmentB) manager.findFragmentById(R.id.fragment_b);
        fragmentB.changeText(position);
    }
    */
FragmentB fragmentB;
   //FragmentA fragmentA;
   FragmentManager manager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_main);
        manager =getSupportFragmentManager();
        FragmentA.getCommInstance(this);
    }

    @Override
    public void respond(int position) {
        fragmentB = (FragmentB) manager.findFragmentById(R.id.fragment_b);
        if (fragmentB!=null&&fragmentB.isVisible()){
            fragmentB.changeText(position);
        }else{
            Intent i = new Intent(getApplicationContext(),FragmentLandscapeActivity.class);
            i.putExtra("index",position);
            startActivity(i);

        }

    }
}
