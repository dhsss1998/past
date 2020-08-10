package com.example.my1;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.ViewFlipper;

import androidx.fragment.app.Fragment;

import org.w3c.dom.Text;

import java.util.logging.Handler;

public class MainActivity extends Activity {
    FragmentManager manager;
    FragmentTransaction transaction;
    MyFrament1 myFrament1;
    MyFrament2 myFrament2;
    MyFrament3 myFrament3;
    MyFrament4 myFrament4;


    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         manager=getFragmentManager();
         }



    public void butOnclick(View v){
        switch (v.getId()){
            case R.id.button6:
                transaction=manager.beginTransaction();
                myFrament1=new MyFrament1();
                transaction.replace(R.id.right, myFrament1);

                transaction.commit();

                break;
            case R.id.button5:
                transaction=manager.beginTransaction();
                myFrament2=new MyFrament2();
                transaction.replace(R.id.right,myFrament2);

                transaction.commit();
                break;
            case R.id.button4:
                transaction=manager.beginTransaction();
                myFrament3=new MyFrament3();
                transaction.replace(R.id.right,myFrament3);

                transaction.commit();
                break;
            case R.id.button3:
                transaction=manager.beginTransaction();
                myFrament4=new MyFrament4();
                transaction.replace(R.id.right,myFrament4);
                transaction.commit();
                break;
            case R.id.button2:
                break;

        }

    }


}

