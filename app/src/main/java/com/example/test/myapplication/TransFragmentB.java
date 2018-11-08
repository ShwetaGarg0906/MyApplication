package com.example.test.myapplication;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class TransFragmentB extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_trans_fragment_b,container,false);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("fragmentB","onCreate");
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d("fragmentB","onActivtyCreated");
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.d("fragmentB","onAttach");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("fragmentB","onDestroy");
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        Log.d("fragmentB","onAttach");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d("fragmentB","onResume");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d("fragmentB","onDestroyView");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d("fragmentB","onStart");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d("fragmentB","onStop");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d("fragmentB","onPause");
    }
}
