package de.kgftit.cubeslide;



import de.kgftit.game.Spiel;

import roboguice.activity.RoboActivity;
import roboguice.inject.InjectView;
import android.content.res.Configuration;
import android.graphics.Point;
import android.os.Bundle;
import android.view.Display;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.FrameLayout;

public class CubeSlide extends RoboActivity implements OnClickListener{
	@InjectView(R.id.spielbereich) FrameLayout spielfeld;
	@InjectView(R.id.button1) Button b1;
	
	private Spiel spiel;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_cube_slide);
		b1.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.cube_slide, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		b1.setVisibility(View.GONE);
		// Orientierung gesetzt
		this.getResources().getConfiguration().orientation = Configuration.ORIENTATION_PORTRAIT;
		//Display d = getWindowManager().getDefaultDisplay();
		Point size = new Point();
		size.x = spielfeld.getMeasuredWidth();
		size.y = spielfeld.getMeasuredHeight();
		//d.getSize(size);
		spiel = new Spiel(spielfeld, size);
		
	}

}
