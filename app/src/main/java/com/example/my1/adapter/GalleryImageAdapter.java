package com.example.my1.adapter;

import android.content.Context;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.Gallery.LayoutParams;
import android.widget.ImageView;

import com.example.my1.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.Gallery.LayoutParams;
public class GalleryImageAdapter extends BaseAdapter {
	private int GalleryItemBackground ;
	private Context context  = null ;
	public int [] images ={
			R.drawable.xiezi1,
			R.drawable.xiezi2,
			R.drawable.xiezi3,
			R.drawable.xiezi4,
			R.drawable.xiezi5,
			R.drawable.xiezi6,
			R.drawable.xiezi7,
			R.drawable.xiezi8,
	};
	public GalleryImageAdapter(Context context){
		this.context = context ;
		TypedArray typedArray = context.obtainStyledAttributes(R.styleable.GradientColorItem);

	}
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return images.length;
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		ImageView imageView = new ImageView(context);
		imageView.setImageResource(images[position%images.length]);
		imageView.setScaleType(ImageView.ScaleType.FIT_XY);
		imageView.setLayoutParams(new Gallery.LayoutParams(LayoutParams.FILL_PARENT,LayoutParams.WRAP_CONTENT));
		imageView.setBackgroundResource(GalleryItemBackground);
		return imageView;
	}

}

