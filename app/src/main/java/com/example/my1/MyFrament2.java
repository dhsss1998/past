package com.example.my1;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

/**
 * Created by Administrator on 2019/11/20.
 */

public class MyFrament2 extends Fragment {
    TextView textView;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view=inflater.inflate(R.layout.login,null);
        textView=(TextView)view.findViewById(R.id.textView);
        return view;
    }


}
