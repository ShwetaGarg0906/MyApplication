package com.example.test.myapplication;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class FragmentA extends Fragment implements AdapterView.OnItemClickListener{
   /*
    //on button click counter is incremented

   Button clickMe;
    int counter=0;
    Communicator communicator;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(savedInstanceState==null){
            counter=0;
        }
        else {
            counter=savedInstanceState.getInt("counter");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_a, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        clickMe = getActivity().findViewById(R.id.button);
        communicator= (Communicator) getActivity();
        clickMe.setOnClickListener(this);
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("counter",counter);
    }

    @Override
    public void onClick(View v) {

        counter++;
        communicator.respond(""+counter);
    }
    */
   /* example 2 *********activity containing potrait and lanscape fragments in one
   int pos=0;
    ListView list;
    Communicator communicator;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_a,container,false);

    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("position",pos);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {

        super.onActivityCreated(savedInstanceState);
        communicator = (Communicator) getActivity();
        list = getActivity().findViewById(R.id.list_view);
        ArrayAdapter adapter = ArrayAdapter.createFromResource(getActivity(),R.array.title,android.R.layout.simple_list_item_1);
        list.setAdapter(adapter);
        list.setOnItemClickListener(this);
        if(savedInstanceState==null){
            pos=0;
        }else{
            pos = savedInstanceState.getInt("position");
            Log.d("----",""+pos);
            //communicator.respond(pos);
        }
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
       pos=position;
        communicator.respond(position);
    }
    */
   static Communicator comm;
    ListView list;

    @Override
   public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
       View view = inflater.inflate(R.layout.fragment_a,container,false);
       list  = view.findViewById(R.id.list_view);
        ArrayAdapter adapter = ArrayAdapter.createFromResource(getActivity(), R.array.title,android.R.layout.simple_list_item_1);
        list.setAdapter(adapter);
        list.setOnItemClickListener(this);
       return view;
   }

   public static void getCommInstance(Communicator c){
       comm = c;
   }
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        comm.respond(position);
    }


    public  interface  Communicator{
       public  void respond(int position);
   }
}
