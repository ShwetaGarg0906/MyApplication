package com.example.test.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

public class Main2Activity extends AppCompatActivity {
    ListView list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        list = (ListView) findViewById(R.id.list);
        ArrayList<Student> students= new ArrayList<>(Arrays.asList(
                new Student(1,"shweta","shwetagarg0906@gmail.com"),
                new Student(2,"mamta","mamta@gmail.com")
        ));
        CustomAdaptor myadaptor= new CustomAdaptor(this,students);
        list.setAdapter(myadaptor);

    }
}
