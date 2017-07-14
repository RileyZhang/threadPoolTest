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

public class SingleThreadPoolActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.single_layout);
		Button button = (Button) findViewById(R.id.single_button);
		button.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				ExecutorService singlePool = Executors.newSingleThreadExecutor();
				for (int i = 0 ; i < 30; i++) {
					Runnable runnable = new Runnable() {
						
						@Override
						public void run() {
							// TODO Auto-generated method stub
							SystemClock.sleep(1000);
							Log.i("riley", "threadName = " + Thread.currentThread().getName());
						}
					};
					singlePool.execute(runnable);
				}
			}
		});
	}
}
