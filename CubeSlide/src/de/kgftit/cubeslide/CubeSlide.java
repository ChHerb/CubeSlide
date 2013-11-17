package de.kgftit.cubeslide;


import roboguice.activity.RoboActivity;
import roboguice.inject.InjectView;
import android.os.Bundle;
import android.view.Menu;
import android.widget.FrameLayout;

public class CubeSlide extends RoboActivity {
	@InjectView(R.id.spielbereich) FrameLayout spielfeld;
	
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
