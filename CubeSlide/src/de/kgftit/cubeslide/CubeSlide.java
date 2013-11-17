package de.kgftit.cubeslide;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class CubeSlide extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_cube_slide);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.cube_slide, menu);
		return true;
	}

}
