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
import android.widget.EditText;
import android.widget.TextView;
import android.os.Build;

public class NumberActivity extends ActionBarActivity {
	String generatedNumber;
	TextView outputString;
	EditText leftBound, rightBound;
	int gNum;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_number);
		setTitle("Number Generator");
		
		outputString = (TextView)findViewById(R.id.outputString);
		leftBound = (EditText)findViewById(R.id.leftBound);
		rightBound = (EditText)findViewById(R.id.rightBound);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.number, menu);
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
	
	public void generateNumber(View v){
		if(leftBound.getText().toString().equals("-") || rightBound.getText().toString().equals("-")){
			outputString.setText("Please enter a valid integer, or leave the space blank.");
		}else{
			//Check to see if fields are empty.
			if(leftBound.getText().toString().equals("") && rightBound.getText().toString().equals("")){
				Numbers n = new Numbers();
				gNum = n.getInt();

				//Right bound & no left bound	
			}else if(leftBound.getText().toString().equals("") && !rightBound.getText().toString().equals("")){
				int lBound = -2147483646;
				int rBound = Integer.parseInt(rightBound.getText().toString());
				Numbers n = new Numbers();
				gNum = n.getInt(lBound, rBound);

				//Left bound & no right bound	
			}else if(!leftBound.getText().toString().equals("") && rightBound.getText().toString().equals("")){
				int rBound = 2147483646;
				int lBound = Integer.parseInt(leftBound.getText().toString());
				Numbers n = new Numbers();
				gNum = n.getInt(lBound, rBound);

			}else{
				int lBound = Integer.parseInt(leftBound.getText().toString());
				int rBound = Integer.parseInt(rightBound.getText().toString());

				//Check to see if left and right bound make sense, otherwise switch them.
				if(lBound > rBound){
					int temp = lBound;
					lBound = rBound;
					rBound = temp;
				}
				Numbers n = new Numbers();
				gNum = n.getInt(lBound, rBound);

			}
			generatedNumber = Integer.toString(gNum);
			outputString.setText(generatedNumber);
		}
	}

}
