package com.sina.weibo.happyaa;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.format.Time;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;


public class NewActivity extends Activity {
	public static String Title ="";
	public static String Kouhao="";
	public static String date="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_activity);
        
        TextView myTextView = (TextView)findViewById(R.id.textView4);      
        Time time = new Time();       
        time.setToNow();      
        int year = time.year;      
        int month = time.month+1;      
        int day = time.monthDay;          
        date=" "+year +       
             "年 " + month +       
             "月 " + day +       
             "日 ";
        myTextView.setText(date);
       
        ImageButton button1 = (ImageButton)findViewById(R.id.imageButton2);
        button1.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				 EditText editText1 =(EditText)findViewById(R.id.editText1);  
			        Title=editText1.getText().toString();
			        
			        EditText editText2 =(EditText)findViewById(R.id.editText2);  
			        Kouhao=editText2.getText().toString(); 
			       
				Intent intent = new Intent(NewActivity.this, TellHistory.class);
				//intent.setClass(MainActivity.this, NewActivity.class);
				startActivity(intent);
			}
        	
        });
    }
    
}

