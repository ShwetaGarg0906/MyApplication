package com.example.test.myapplication;

import android.content.Context;
import android.graphics.ImageDecoder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class CustomAdaptor extends BaseAdapter{
    private ArrayList<Student> students;
    private Context mycontext;

    public CustomAdaptor(Context context,ArrayList<Student> students) {
        this.students = students;
        this.mycontext = context;
    }

    @Override
    public int getCount() {
        return students.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(final int i, View convertView, final ViewGroup parent) {
        View rootView;
        rootView= LayoutInflater.from(mycontext).inflate(R.layout.custom_list,parent,false);
        TextView rollno = (TextView) rootView.findViewById(R.id.rollno);
        Button btn = (Button) rootView.findViewById(R.id. button);
        //ImageView img = (ImageView) rootView.findViewById(R.id.image);
        //img.setImageResource(students.get(i).getImage());
        rollno.setText(""+students.get(i).getRollno());

        /*btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(parent.getContext()," "+students.get(i).getName(),Toast.LENGTH_SHORT).show();
            }
        });*/
        return rootView;
    }
}
