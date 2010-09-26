package com.github.ymasory.androidio;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class Main extends Activity {
	/** Called when the activity is first created. */
	
	TextView stats = null;
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
//		setContentView(R.layout.main);
		
		Button startButton = new Button(this);
		startButton.setText("START");
		startButton.setEnabled(true);
		
		LinearLayout layout = new LinearLayout(this);
		layout.addView(startButton);
		
		startButton.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				toast("HELLO");
			}
		});
		
		setContentView(layout);
	}
	
	private void toast(String message) {
		Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
	}
}