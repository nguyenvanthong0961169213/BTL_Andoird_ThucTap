package com.example.btl_android_thuctap;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Sign_Up_Fragment extends Fragment {



    public Sign_Up_Fragment() {
        // Required empty public constructor
    }
    public static Sign_Up_Fragment newInstance(String param1, String param2) {
        Sign_Up_Fragment fragment = new Sign_Up_Fragment();
        return fragment;
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sign_up, container, false);
    }
}