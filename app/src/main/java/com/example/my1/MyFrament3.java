package com.example.my1;
import android.app.Fragment;
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
import static com.example.my1.R.id.item_tv;
public class MyFrament3 extends Fragment {
    TextView textView;
    private ListView list;
    private String[] names = new String[]{"京东上城","qq","天猫","微信","京东上城","qq"};
    private int[] icons={R.drawable.img_1,R.drawable.img_2,R.drawable.img_3,
            R.drawable.img_4,R.drawable.img_1,
            R.drawable.img_2};
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View root=inflater.inflate(R.layout.new3_layout,container,false);
        list = (ListView) root.findViewById(R.id.lv);
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
                TextView mTextView = (TextView) view.findViewById(item_tv);
                mTextView.setText(names[position]);
                ImageView imageView = (ImageView) view.findViewById(R.id.item_image);
                imageView.setBackgroundResource(icons[position]);
                return view;}
    };
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent();
                if (position ==0 ) {
                    intent.setClass(getActivity(),BoyShoesActivity.class);
                    System.out.println(names[position]);
                    startActivity(intent);
                } else if (position == 1) {
                    startActivity(intent);
                } else if (position == 2) {
                    intent.setClass(MyFrament3.super.getActivity(),detil.class);
                    startActivity(intent);
                }else {
                    intent.setClass(MyFrament3.super.getActivity(), NewProMarketActivity.class);
                    startActivity(intent);
                }
            }
        });
     return root;
    }
}
