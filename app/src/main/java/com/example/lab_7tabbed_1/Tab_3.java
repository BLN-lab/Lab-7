package com.example.lab_7tabbed_1;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Tab_3 extends Fragment {

    ArrayAdapter adapter;
    ListView lv;

    public Tab_3() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tab_1, container, false);
        String[] list={"Godzilla king of the monsters","Pasific Rim 1 & 2","Twilight(1-5)","Underground(1-4)","Avengers(1-5)","Spider man","Iron man","How to train your dragon"};
        adapter=new ArrayAdapter(getActivity(),android.R.layout.simple_list_item_1,list);
        lv=(ListView)view.findViewById(R.id.List);
        lv.setAdapter(adapter);
        return view;
    }
}