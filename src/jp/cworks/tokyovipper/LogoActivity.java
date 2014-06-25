package jp.cworks.tokyovipper;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class LogoActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_logo);

//		ImageView logo = (ImageView) findViewById(R.id.logo);
//		Animation logoanim = AnimationUtils.loadAnimation(this, R.anim.alpha);
//		logo.startAnimation(logoanim);

//		ImageView logomoji = (ImageView) findViewById(R.id.logomoji);
//		Animation logoanimmoji = AnimationUtils.loadAnimation(this,
//				R.anim.alpha);
//		logomoji.startAnimation(logoanimmoji);
		Button b = (Button) findViewById(R.id.logobtn);
        b.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent i = new Intent(getApplicationContext(), StartActivity.class);
				startActivity(i);
				finish();
			}
		});
	}
/*
	@Override
	public boolean onTouchEvent(MotionEvent event) {
		switch (event.getAction()) {
		default:
			runOnUiThread(new Runnable(){
		        @Override
		        public void run() {
					Intent intent = new Intent(getApplicationContext(), StartActivity.class);
					startActivity(intent);
		        }
		    });
			break;
		}
//		return super.onTouchEvent(event);
		return super.onTouchEvent(event);
	}
*/
}
