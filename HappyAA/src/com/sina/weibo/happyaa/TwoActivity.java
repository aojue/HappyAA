package com.sina.weibo.happyaa;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.ImageButton;
import android.widget.TabHost;
import android.widget.TextView;

import com.sina.weibo.happyaa.*;


public class TwoActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.two_activity);
        String str1 = NewActivity.Title;
        TextView myTextView = (TextView)findViewById(R.id.text1);
        myTextView.setText(str1);
        
        str1 =NewActivity.Kouhao;
        myTextView = (TextView)findViewById(R.id.text2);
        myTextView.setText(str1);
        
        str1 = NewActivity.date;
        myTextView = (TextView)findViewById(R.id.text3);
        myTextView.setText(str1);
    }
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.creat_tell, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.creat_tell) {
        	//Intent intent = new Intent(CreatTell.this, TableActivity.class);
			//intent.setClass(MainActivity.this, NewActivity.class);
			//startActivity(intent);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
