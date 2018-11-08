package com.example.test.myapplication;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.test.myapplication.Student;

import java.util.ArrayList;

public class MyRecyclerAdapter extends RecyclerView.Adapter<MyRecyclerAdapter.VH> {
    ArrayList<Student> students;

    public MyRecyclerAdapter(ArrayList<Student> students) {
        this.students = students;
    }

    @NonNull
    @Override
    public MyRecyclerAdapter.VH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View root =
        LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item,parent,false);
        return new VH(root);
    }
    @Override
    public void onBindViewHolder(@NonNull MyRecyclerAdapter.VH holder, int position) {
        holder.setup(students.get(position));

    }

    @Override
    public int getItemCount() {
        return students.size();
    }
    public class VH extends RecyclerView.ViewHolder {

        private final TextView studentName;
        private final TextView studentRoll;
        private final TextView studentYear;

        public VH(View itemView) {
            super(itemView);
            studentName = (TextView)itemView.findViewById(R.id.student_name);
            studentRoll = (TextView)itemView.findViewById(R.id.student_roll);
            studentYear = (TextView)itemView.findViewById(R.id.student_year);
        }

        public void setup(Student student) {
            studentName.setText(student.getName());
            studentRoll.setText(""+student.getRollno());
            studentYear.setText(student.getEmail_id());
        }
    }
}
