package com.example.randomize;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.os.Build;

public class DiceActivity extends ActionBarActivity {
	ImageView dice;
	TextView diceText;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_dice);
		setTitle("Dice Roller");
		
		dice = (ImageView)findViewById(R.id.dice);
		diceText = (TextView)findViewById(R.id.diceText);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.dice, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	
	public void rollDice(View v){
		Dice d = new Dice();
		int roll = d.getRoll();
		String rText = null;
		switch (roll){
		case 1:
			rText = "1";
			dice.setImageDrawable(getResources().getDrawable(R.drawable.one));
			break;
		case 2:
			rText = "2";
			dice.setImageDrawable(getResources().getDrawable(R.drawable.two));
			break;
		case 3:
			rText = "3";
			dice.setImageDrawable(getResources().getDrawable(R.drawable.three));
			break;
		case 4:
			rText = "4";
			dice.setImageDrawable(getResources().getDrawable(R.drawable.four));
			break;
		case 5:
			rText = "5";
			dice.setImageDrawable(getResources().getDrawable(R.drawable.five));
			break;
		case 6:
			rText = "6";
			dice.setImageDrawable(getResources().getDrawable(R.drawable.six));
			break;
		}
		
		diceText.setText(rText);
	}

}
