package com.example.test.myapplication;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class DialogFragment extends android.support.v4.app.DialogFragment implements View.OnClickListener{
    Button yes,no;
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view;
        setCancelable(false);
        view=inflater.inflate(R.layout.dialog_fragment,null);
        yes=(Button) view.findViewById(R.id.yes);
        no = (Button)view.findViewById(R.id.no);
        yes.setOnClickListener(this);
        no.setOnClickListener(this);
        no.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.yes){
            Toast.makeText(getActivity(), "yes is clicked", Toast.LENGTH_SHORT).show();
            this.dismiss();
        }
        else
            Toast.makeText(getActivity(),"no is clicked",Toast.LENGTH_SHORT).show();
            this.dismiss();
    }
}
