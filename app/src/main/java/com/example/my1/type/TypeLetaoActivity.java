package com.example.my1.type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.AdapterView.OnItemClickListener;
import com.example.my1.BoyShoesActivity;
import com.example.my1.CommonActivity;
import com.example.my1.GirlShoesActivity;
import com.example.my1.R;
import com.example.my1.detil;

public class TypeLetaoActivity extends CommonActivity implements OnItemClickListener {
	private int BOYSHOES = 0;
	private int GIRLSHOES = 1;
	private int MORESHOES = 2;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.letao_type_sreach);


		super.setContentView(findViewById(R.id.title));
		super.setTitle(R.string.title_myletao_type);
		super.listViewAll= (ListView)findViewById(android.R.id.list);
		setListAdapter(new SimpleAdapter(TypeLetaoActivity.this, getDate(), R.layout.common_listview_text, new String[]{"img","text","img_pre"}, new int[]{R.id.img,R.id.text,R.id.img_pre}));
		super.listViewAll.setOnItemClickListener(this);

		super.progressDialog = ProgressDialog.show(this, "", "",
				true);
		super.progressDialog.show();
		super.handler.post(this);

	}
	

	private List<Map<String, Object>> getDate() {
		List<Map<String, Object>> listLitong = new ArrayList<Map<String, Object>>();
		for (int i = 0; i < TYPE.length; i++) {
			Map<String, Object> maplitong = new HashMap<String, Object>();
			maplitong.put("text", TYPE[i]);
			maplitong.put("img", R.drawable.toright_mark);
			maplitong.put("img_pre", R.drawable.paopao);
			listLitong.add(maplitong);
		}

		return listLitong;
	}
	static final String[] TYPE = {"1","2","3"};




	@Override
	public void onItemClick(AdapterView<?> arg0, View arg1, int position, long id) {
		if (position == BOYSHOES) {
			intent.setClass(TypeLetaoActivity.this, BoyShoesActivity.class);
			startActivity(intent);
		}
		 else if (position == MORESHOES) {
			intent.setClass(TypeLetaoActivity.this, detil.class);
			startActivity(intent);
		}
		
	}     
}
