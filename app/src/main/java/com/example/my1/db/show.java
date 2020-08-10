/*package com.example.my1.db;

import android.database.Cursor;
package com.example.my1;

import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.my1.R;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Administrator on 2019/11/20.
 */

/*public class show extends Fragment {
    TextView textView;
    private ListView list;
    private String[] names ;
    Myopenhelper myHelper;
    SQLiteDatabase db;
    ArrayList<HashMap<String,Object>>list;
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View good=inflater.inflate(R.layout.new4_layout,container,false);


        BaseAdapter adapter;
        adapter=new BaseAdapter(){public int getCount() {
            return names.length;
        }

            @Override
            public Object getItem(int position) {
                return names[position];
            }

            @Override
            public long getItemId(int position) {
                return position;
            }

            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                View view = getActivity().getLayoutInflater().inflate(R.layout.list_item,null);
                TextView mTextView = (TextView) view.findViewById(R.id.item_tv);
                mTextView.setText(names[position]);
                ImageView imageView = (ImageView) view.findViewById(R.id.item_image);
                public class ArryList<goods> show() {
                    db = myHelper.getReadableDatabase();
                    ArryList<goods> good = new ArryList<goods>();
                    Cursor cursor = db.query("shangping", null, null, null, null, null, null);

                    if (cursor.moveToNext()) {
                        goods good=new goods();
                        good.setName(cursor.getString(1));
                        good.setPrice(cursor.getString(2));
                        good.add(good);
                    }
                }
                cursor.close();
                db.close()
                return goods;
            }
        }

      */

