package com.example.my1.db;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
public class Myopenhelper extends SQLiteOpenHelper {
    public Myopenhelper(Context context) {super
        (context, "shop.db", null, 2);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table shangping(id INTEGER PRIMARY KEY AUTOINCREMENT,name varchar(255),price varchar(255))");
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
