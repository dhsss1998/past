package com.example.my1;

import android.app.AlertDialog;
import android.app.ListActivity;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;


public class CommonActivity extends ListActivity implements Runnable {
	private static final int INDEX = 1;
	private static final int SEARCH = 2;
	private static final int MORE = 3;
	private static final int RECORD = 4;
	private static final int ADVICE = 5;
	private static final int EXIT = 6;
	public static boolean exit;
	public Intent intent = new Intent();
	public ProgressDialog progressDialog = null;
	public Handler handler = new Handler();
	private int i = 0;
	public ImageView imageViewIndex = null ;
	public ImageView imageViewType = null ;
	public ImageView imageViewShooping = null ;
	public ImageView imageViewMyLetao = null ;
	public ImageView imageViewMore = null ;
	public ImageViewIndex  viewIndex = new ImageViewIndex();
	public ImageViewType viewTpe = new ImageViewType();
	public ImageViewShooping viewShooping = new ImageViewShooping();
	public ImageViewMyLetao viewMyLetao = new ImageViewMyLetao();
	public ImageViewMore viewMore = new ImageViewMore();
	public ListView listViewAll = null ;
	public TextView textViewTitle = null ;
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		menu.add(0, INDEX, 1, R.string.index);
		menu.add(0, SEARCH, 1, R.string.search);
		menu.add(0, MORE, 1, R.string.more);
		menu.add(0, RECORD, 1, R.string.record);
		menu.add(0, ADVICE, 1, R.string.advice);
		menu.add(0, EXIT, 1, R.string.exit);
		return super.onCreateOptionsMenu(menu);
	}
	public boolean onOptionsItemSelected(MenuItem item) {
		if (item.getItemId() == INDEX) {
			intent.setClass(this, MyFrament1.class);
			startActivity(intent);
		} else if (item.getItemId() == SEARCH) {
			intent.setClass(this, MyFrament3.class);
			startActivity(intent);
		} else if (item.getItemId() == MORE) {
			intent.setClass(this, MyFrament2.class);
			startActivity(intent);
		} else if (item.getItemId() == RECORD) {
			intent.setClass(this, MyFrament1.class);
			startActivity(intent);
		} else if (item.getItemId() == ADVICE) {
			intent.setClass(this, MainActivity.class);
			startActivity(intent);
		} else if (item.getItemId() == EXIT) {
			openQiutDialog();
		}
		return super.onOptionsItemSelected(item);
	}

	private void openQiutDialog() {
		new AlertDialog.Builder(this).setTitle("").setMessage("")
				.setPositiveButton("", new DialogInterface.OnClickListener() {

					@Override
					public void onClick(DialogInterface dialog, int which) {

						Intent intent = new Intent();
						exit = true;
						intent.setClass(CommonActivity.this,
								test.class);
						intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
						startActivity(intent);
						finish();
					}
				}).setNegativeButton("",
						new DialogInterface.OnClickListener() {

							@Override
							public void onClick(DialogInterface dialog,
                                                int which) {

							}
						}).show();
	}

	class ImageViewIndex implements OnTouchListener {

		@Override
		public boolean onTouch(View view, MotionEvent event) {
			if (event.getAction() == event.ACTION_DOWN) {
				imageViewIndex.setImageResource(R.drawable.menu_home_pressed);
				intent.setClass(CommonActivity.this,test.class);
				startActivity(intent);
			}
			return false;
		}

	}

	class ImageViewType implements OnTouchListener {

		@Override
		public boolean onTouch(View v, MotionEvent event) {
			if (event.getAction() == event.ACTION_DOWN) {
				startActivity(new Intent(getApplicationContext(),TypeLetaoActivity.class));
				imageViewType.setImageResource(R.drawable.menu_brand_pressed);
			}
			return false;
		}

	}
	class ImageViewShooping implements OnTouchListener {
		@Override
		public boolean onTouch(View v, MotionEvent event) {
			if (event.getAction() == event.ACTION_DOWN) {
				startActivity(new Intent(getApplicationContext(),detil.class));
				imageViewShooping.setImageResource(R.drawable.menu_shopping_cart_pressed);
			}
			return false;
		}

	}
	class ImageViewMyLetao implements OnTouchListener {
		@Override
		public boolean onTouch(View v, MotionEvent event) {
			if (event.getAction() == event.ACTION_DOWN) {
				intent.setClass(getApplicationContext(), CommonActivity.class);
				startActivity(intent);
				imageViewMyLetao.setImageResource(R.drawable.menu_my_letao_pressed);
			}
			return false;
		}
	}

	class ImageViewMore implements OnTouchListener {

		@Override
		public boolean onTouch(View v, MotionEvent event) {
			if (event.getAction() == event.ACTION_DOWN) {
				imageViewMore.setImageResource(R.drawable.menu_more_pressed);
				intent.setClass(CommonActivity.this, detil.class);
				startActivity(intent);
			}
			return false;
		}

	}

	public void run() {

		try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		if (i > 500) {
			progressDialog.dismiss();
			handler.removeCallbacks(this);
		} else {
			i = i + 10;
			handler.post(this);
		}

	}

}
