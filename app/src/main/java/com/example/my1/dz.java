package com.example.my1;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;

import java.util.HashMap;
import java.util.Map;

public class  dz {

    static String name;
    public static boolean saveUserInfo(Context context, String userName, String password) {//注册
        SharedPreferences sp=context.getSharedPreferences("data",Context.MODE_PRIVATE);
        SharedPreferences.Editor edit=sp.edit();
        edit.putString("userName","password");
        name=userName;
        edit.commit();
        return true;
    }

    public static String getpassword(Context context) {//登录
        SharedPreferences sp = context.getSharedPreferences("data", Context.MODE_PRIVATE);
        String password = sp.getString("name","");
        return password;
    }


}









