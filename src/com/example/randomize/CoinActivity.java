package com.example.randomize;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class CoinActivity extends ActionBarActivity {
	ImageView coin;
	TextView coinText;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_coin);
		setTitle("Coin Flipper");
		
		coin = (ImageView)findViewById(R.id.coin);
		coinText = (TextView)findViewById(R.id.coinText);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.coin, menu);
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
	
	public void flipCoin(View v){
		Coin c = new Coin();
		String flip = c.getFlip();
		if(flip == null){
			System.out.println("Error - flip is null.");
		}else{
			if(flip.equals("Heads")){
				coin.setImageDrawable(getResources().getDrawable(R.drawable.heads));
				coinText.setText("Heads!");
			}else{
				coin.setImageDrawable(getResources().getDrawable(R.drawable.tails));
				coinText.setText("Tails!");
			}
		}
	}

}
