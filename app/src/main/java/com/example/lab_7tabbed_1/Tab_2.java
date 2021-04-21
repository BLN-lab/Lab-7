package com.example.lab_7tabbed_1;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Tab_2 extends Fragment {

    ArrayAdapter adapter;
    ListView lv;

    public Tab_2() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tab_1, container, false);
        String[] list={"Power Wolf","Sabaton","Disturbed"};
        adapter=new ArrayAdapter(getActivity(),android.R.layout.simple_list_item_1,list);
        lv=(ListView)view.findViewById(R.id.List);
        lv.setAdapter(adapter);
        return view;
    }
}