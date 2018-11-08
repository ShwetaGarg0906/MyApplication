package com.example.test.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Arrays;

public class RecyclerViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
        RecyclerView r= findViewById(R.id.recview);
        ArrayList<Student> students= new ArrayList<>(Arrays.asList(
                new Student(1,"shweta","shwetagarg0906@gmail.com"),
                new Student(2,"mamta","mamta@gmail.com")
        ));
        MyRecyclerAdapter adapter = new MyRecyclerAdapter(students);
        r.setLayoutManager(new LinearLayoutManager(this));
        r.setAdapter(adapter);
    }
}
