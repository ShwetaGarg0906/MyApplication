package com.example.test.myapplication;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TransactionActivity extends AppCompatActivity {
    FragmentManager manager ;
    Button addfrag;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transaction);
        manager=getSupportFragmentManager();
    }
    public void add(View v){
        TransFragmentB transFragmentB = new TransFragmentB();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction .add(R.id.group,transFragmentB,"B");
        transaction.addToBackStack("addB");
        transaction.commit();
    }
    public void remove(View v){
        FragmentTransaction transaction =  manager.beginTransaction();
        transaction.remove(manager.findFragmentByTag("B"));
        transaction.addToBackStack("removeB");
        transaction.commit();
    }
    public void attach(View v){
        FragmentTransaction transaction =  manager.beginTransaction();
        transaction.attach(manager.findFragmentByTag("B"));
        transaction.addToBackStack("attachA");
        transaction.commit();
    }
    public void detach(View v){
        FragmentTransaction transaction =  manager.beginTransaction();
        transaction.detach(manager.findFragmentByTag("B"));
        transaction.addToBackStack("detachA");
        transaction.commit();
    }
}
