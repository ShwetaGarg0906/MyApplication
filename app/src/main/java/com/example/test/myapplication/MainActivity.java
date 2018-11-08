package com.example.test.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView list;
    String arr[];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = (ListView) findViewById(R.id.lv);
        arr = new String[]{"abc","def","gfh"};
        ArrayAdapter<String> adap = new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,arr);
        list.setAdapter(adap);
        /*list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
             String   val = arr[position];
             switch(position){
                 case 0:
                     Toast.makeText(MainActivity.this,val,Toast.LENGTH_SHORT).show();
                     break;
                 case 1:
                     Toast.makeText(MainActivity.this,val,Toast.LENGTH_SHORT).show();
                     break;
                 case 2:
                     Toast.makeText(MainActivity.this,val,Toast.LENGTH_SHORT).show();
                     break;
             }
            }
        });*/

    }
}
