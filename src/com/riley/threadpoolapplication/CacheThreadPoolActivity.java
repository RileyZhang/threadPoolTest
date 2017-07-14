package com.riley.threadpoolapplication;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import android.app.Activity;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class CacheThreadPoolActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.cache_layout);
		Button cacheButton = (Button) findViewById(R.id.cache_pool_button);
		cacheButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				ExecutorService cachePool = Executors.newCachedThreadPool();
				for (int i = 0; i < 30; i++) {
					Runnable runnable = new Runnable() {
						
						@Override
						public void run() {
							// TODO Auto-generated method stub
							SystemClock.sleep(1000);
							Log.i("riley", "threadName = " + Thread.currentThread().getName());
						}
					};
					cachePool.execute(runnable);
//					SystemClock.sleep(1000);
				}
			}
		});
	}
}
