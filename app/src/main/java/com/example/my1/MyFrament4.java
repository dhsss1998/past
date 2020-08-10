package com.example.my1;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import android.widget.ViewFlipper;

/**
 * Created by Administrator on 2019/11/20.
 */

public class MyFrament4 extends Fragment {
    TextView textView;
    ViewFlipper flipper;
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){


        View view=inflater.inflate(R.layout.new4_layout,null);
        textView=(TextView)view.findViewById(R.id.textView);
        return view;
    }
}
