package jp.cworks.tokyovipper;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class LogoActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_logo);

		ImageView logo = (ImageView) findViewById(R.id.logo);
		Animation logoanim = AnimationUtils.loadAnimation(this, R.anim.alpha);
		logo.startAnimation(logoanim);

		ImageView logomoji = (ImageView) findViewById(R.id.logomoji);
		Animation logoanimmoji = AnimationUtils.loadAnimation(this,
				R.anim.alpha);
		logomoji.startAnimation(logoanimmoji);
	}

	@Override
	public boolean onTouchEvent(MotionEvent event) {
		switch (event.getAction()) {
		default:
			Intent intent = new Intent(this, StartActivity.class);
			startActivity(intent);
			finish();
			break;
		}
		return super.onTouchEvent(event);
	}

}
