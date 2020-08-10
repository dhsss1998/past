package com.example.my1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

import com.example.my1.R;
import com.example.my1.db.shop;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;

public class NewProMarketActivity extends CommonActivity implements OnItemClickListener , OnClickListener {
    /**
     * 新品
     */
    private TextView NewTextView = null;
    /**
     * 价格
     */
    private TextView ProTextView = null;
    /**
     * 热销
     */
    private TextView HotTextView = null;
    private GridView ImagegridView = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 去除手机界面默认标题
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.letao_new_pro_market);
        // 手机界面标题设置
        super.textViewTitle = (TextView) findViewById(R.id.title);
        super.textViewTitle.setText(R.string.app_name);


        ImagegridView = (GridView) findViewById(R.id.grid1);
        ImagegridView.setOnItemClickListener(this);
        //新品
        NewTextView = (TextView) findViewById(R.id.commoditysort_product_lefttab_btn);
        NewTextView.setOnClickListener(this);
        //价格
        ProTextView = (TextView) findViewById(R.id.commoditysort_product_righttab_btn);
        ProTextView.setOnClickListener(this);
        //热销
        HotTextView = (TextView) findViewById(R.id.commoditysort_product_centertab_btn);
        HotTextView.setOnClickListener(this);
        this.NewOrProAndHot(R.drawable.about_sina_log, "跑鞋", 9);
        this.ProgressDialog();

    }

    @Override
    public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
        intent.setClass(getApplicationContext(), shop.class);
        startActivity(intent);
    }

    @Override
    public void onClick(View view) {
        if (view == NewTextView) {
            this.ProgressDialog();
            this.NewOrProAndHot(R.drawable.about_sina_log, "跑鞋", 9);
        } else if (view == ProTextView) {
            this.ProgressDialog();
            this.NewOrProAndHot(R.drawable.about_logo, "运动鞋", 10);
        } else if (view == HotTextView) {
            this.ProgressDialog();
            this.NewOrProAndHot(R.drawable.product_specialprice_image, "篮球鞋", 12);
        }
    }

    /**
     * 虚拟进度条
     */
    private void ProgressDialog() {
        // 进入该界面时,模仿从服务器加载数据时的虚拟进度条
        super.progressDialog = android.app.ProgressDialog.show(this, "历通购物", "数据获取中....",
                true);
        super.progressDialog.show();
        // 通过线程来循环调用进度条
        super.handler.post(this);
    }

    private void NewOrProAndHot(Object object, String type, int price) {
        List<HashMap<String, Object>> mapsList = new ArrayList<HashMap<String, Object>>();
        for (int i = 0; i < 60; i++) {
            HashMap<String, Object> hashMap = new HashMap<String, Object>();
            hashMap.put("Image", object);
            hashMap.put("text", type + i);
            hashMap.put("pro", "$" + price + i);
            mapsList.add(hashMap);
        }
        SimpleAdapter adapter = new SimpleAdapter(getApplicationContext(),
                mapsList, R.layout.common_gridview_text, new String[]{
                "Image", "text", "pro"}, new int[]{R.id.ItemImage, R.id.ItemText, R.id.proText});
        ImagegridView.setAdapter(adapter);
    }

}