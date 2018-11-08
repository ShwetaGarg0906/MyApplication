package com.example.test.myapplication;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

public class FragmentB extends Fragment {
   /* TextView showText;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_b, container, false);

    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("text_item",showText.getText().toString());
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        showText=getActivity().findViewById(R.id.show_text);
        if(savedInstanceState==null){
            showText.setText("empty textView");
        }
        else{
            showText.setText(savedInstanceState.getString("text_item"));
        }
    }
    public void changeText(String text){
        showText.setText(text);
    }*/

   /*  example 2 main activity contains two fragments
   TextView textView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_b,container,false);
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("text",textView.getText().toString());
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        textView = getActivity().findViewById(R.id.show_text);
        if (savedInstanceState==null){
            textView.setText("hello!! empty text there....");
        }else {
            textView.setText(savedInstanceState.getString("text"));
        }
    }
    public void changeText(int pos){
        Resources resources = getResources();
        String[] description =resources.getStringArray(R.array.description);
        textView.setText(description[pos]);
    }
    */
   TextView textView;
   @Override
   public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       View view= inflater.inflate(R.layout.fragment_b,container,false);
       textView = view.findViewById(R.id.show_text);
       return view;
   }

    public void changeText(int pos){
        Resources resources = getResources();
        String[] description =resources.getStringArray(R.array.description);
        textView.setText(description[pos]);
    }

}
