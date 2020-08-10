package com.example.my1;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
public class login extends Activity {
    private SharedPreferences.Editor editor;
    private Button bt_1,bt_2;
    public EditText ex,ex_1;
    private SharedPreferences preferences;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.login);
        ex_1=findViewById(R.id.editText);
        ex = findViewById(R.id.etuserName);
        bt_1=findViewById(R.id.button16);
        bt_2=findViewById(R.id.button17);
        //得到preferences对象
        preferences= PreferenceManager.getDefaultSharedPreferences(login.this);
        editor=preferences.edit();//得到编译器对象
        bt_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //上传数据
                editor.putString("number",ex.getText().toString());
                editor.putString("password",ex_1.getText().toString());
                editor.commit();//提交
                Toast.makeText(login.this,"注册成功",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(login.this,login.class);
                ex.setText(ex.getText());
                startActivity(intent);
            }
        });
        bt_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(preferences.getString("number","").equals(ex.getText().toString().trim())
                        &&preferences.getString("password","").equals(ex_1.getText().toString().trim()))
                //是否匹配,去掉空格
                {
                    Toast.makeText(login.this,"登陆成功",Toast.LENGTH_SHORT).show();
                    //Intent intent_1=new Intent(test_register.this,BTClient.class);
                    Intent intent_1=new Intent(login.this,MainActivity.class);
                    startActivity(intent_1);
                }
                else
                {
                    Toast.makeText(login.this,"登录失败，请重新登陆",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
