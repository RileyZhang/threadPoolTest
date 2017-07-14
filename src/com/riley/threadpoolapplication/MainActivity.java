package com.riley.threadpoolapplication;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener{

	private TextView mCacheText;
	private TextView mFixedText;
	private TextView mSingleText;
	private TextView mScheduledText;
	private Context mContext;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mContext = this;
		mCacheText = (TextView)findViewById(R.id.cache_thread_pool);
		mCacheText.setOnClickListener(this);
		mFixedText = (TextView)findViewById(R.id.fixed_thread_pool);
		mFixedText.setOnClickListener(this);
		mSingleText = (TextView)findViewById(R.id.single_thread_pool);
		mSingleText.setOnClickListener(this);
		mScheduledText = (TextView)findViewById(R.id.scheduled_thread_pool);
		mScheduledText.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.cache_thread_pool:
			Intent intent = new Intent(mContext, CacheThreadPoolActivity.class);
			startActivity(intent);
			break;
		case R.id.fixed_thread_pool:
			Intent fixedIntent = new Intent(mContext, FixedThreadPoolActivity.class);
			startActivity(fixedIntent);
			break;
		case R.id.single_thread_pool:
			Intent singleIntent = new Intent(mContext, SingleThreadPoolActivity.class);
			startActivity(singleIntent);
			break;
		case R.id.scheduled_thread_pool:
			Intent scheduleIntent = new Intent(mContext, ScheduledThreadPoolActivity.class);
			startActivity(scheduleIntent);
			break;
		default:
			break;
		}
	}

	
}
