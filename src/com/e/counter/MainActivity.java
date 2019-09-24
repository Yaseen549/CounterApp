package com.e.counter;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

	float count; 
	int b=1;
	int d=1;
	
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

	
	final TextView tv = (TextView) findViewById(R.id.textView1);
	Button btn1 = (Button) findViewById(R.id.button1);
	Button btn2 = (Button) findViewById(R.id.button2);
	final Button btn3 = (Button) findViewById(R.id.button3);
	final Button btn4 = (Button) findViewById(R.id.button4);
	Button btn5 = (Button) findViewById(R.id.button5);
	Button btn6 = (Button) findViewById(R.id.button6);
	Button btn7 = (Button) findViewById(R.id.button7);
	Button btn8 = (Button) findViewById(R.id.button8);
	Button btn9 = (Button) findViewById(R.id.button9);
	
	btn1.setOnClickListener(new View.OnClickListener() {
		public void onClick(View a) {
			
			count++;
			tv.setText("Count is : "+ count);
		}
	});
	btn2.setOnClickListener(new View.OnClickListener() {
		public void onClick(View a) {
			count--;
			tv.setText("Count is : "+ count);
		}
	});
	
	btn3.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View a) {
			// TODO Auto-generated method stub

			
			count=count*b;
			tv.setText("Count is : "+ count);
		}
	});
	
	btn4.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View a) {
			// TODO Auto-generated method stub
			
			count = count/d;
			tv.setText("Count is : "+ count);
		}
	});
		
	btn5.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View a) {
			// TODO Auto-generated method stub
			b++;
			btn3.setText("Multiply x "+ b);
		}
	});
	
	btn6.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View a) {
			// TODO Auto-generated method stub
			b--;
			btn3.setText("Multiply x "+ b);
		}
	});
	
	btn7.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View a) {
			// TODO Auto-generated method stub
			count=0;
			b=0;d=0;
			tv.setText("Count is : "+ count);
			btn3.setText("Multiply x "+ b);
			btn4.setText("Divide by "+ d);
		}
	});
	
	btn8.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View a) {
			// TODO Auto-generated method stub
			d++;
			btn4.setText("Divide by : "+ d);
		}
	});

	btn9.setOnClickListener(new View.OnClickListener() {

		@Override
		public void onClick(View a) {
			// TODO Auto-generated method stub
			d--;
			btn4.setText("Divide by :"+ d);
		}
	});
	
	
  }
}
