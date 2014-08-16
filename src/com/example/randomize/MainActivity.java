package com.example.randomize;

import android.app.ActionBar;


public class MainActivity extends ActionBar {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
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
	
	public void launchNumbers(View v){
		Intent i = new Intent(this, NumberActivity.class);
		startActivity(i);
	}
	
	public void launchDice(View v){
		Intent i = new Intent(this, DiceActivity.class);
		startActivity(i);
	}
	
	public void launchCoin(View v){
		Intent i = new Intent(this, CoinActivity.class);
		startActivity(i);
	}

}
