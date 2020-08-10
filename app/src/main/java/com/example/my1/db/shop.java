package com.example.my1.db;
import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.example.my1.MyFrament4;
import com.example.my1.R;
public class shop extends AppCompatActivity implements View.OnClickListener {
    TextView ed_name,ed_id,ed_price;
    Myopenhelper myHelper;
    SQLiteDatabase db;
    Button bt_1,bt_2;
    private int i = 1;
    Cursor cursor;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detil);
        myHelper=new Myopenhelper(this);
       init();
    }

    private void init() {
        ed_price=(TextView)findViewById(R.id.Price);
        ed_name=(TextView)findViewById(R.id.textView6);
        bt_1=findViewById(R.id.tvAddCart);
        bt_2=findViewById(R.id.tvCart);
        System.out.println(ed_price);
    }

    @Override
    public void onClick(View v) {
        String name;
        String price;
       SQLiteDatabase db;
       ContentValues values;
        switch(v.getId()) {
            case R.id.tvAddCart:
                 price = ed_price.getText().toString().trim();
                 name = ed_name.getText().toString().trim();
                 db=myHelper.getWritableDatabase();
                 values=new ContentValues();
                System.out.println(price);
                values.put("name",name);
                values.put("price",price);
                db.insert("shangping",null,values);
                Toast.makeText(this,"添加成功",Toast.LENGTH_SHORT).show();
                db.close();
                break;
            case R.id.tvCart:
                Intent intent_1=new Intent(shop.this, MyFrament4.class);
                startActivity(intent_1);
                break;
            }








    }

}

