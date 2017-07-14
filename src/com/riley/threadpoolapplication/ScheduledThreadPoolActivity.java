package com.riley.threadpoolapplication;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import org.json.JSONObject;

import android.app.Activity;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ScheduledThreadPoolActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.schedule_layout);
		Button button = (Button) findViewById(R.id.schedule_button);
		button.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
//				ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 5, 5000, TimeUnit.SECONDS);
				ScheduledExecutorService schedulePool = Executors.newScheduledThreadPool(3);
//				for (int i = 0 ; i < 30; i ++) {
					Runnable runnable = new Runnable() {
						
						@Override
						public void run() {
							// TODO Auto-generated method stub
							SystemClock.sleep(1000);
							Log.i("riley", "threadName = " + Thread.currentThread().getName());
						}
					};
//					schedulePool.execute(runnable);
//					schedulePool.schedule(runnable, 1, TimeUnit.SECONDS);
//					schedulePool.scheduleAtFixedRate(runnable, 1, 7, TimeUnit.SECONDS);
//				}
			}
		});
		
	}
}
