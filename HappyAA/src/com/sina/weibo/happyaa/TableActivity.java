package com.sina.weibo.happyaa;

import android.app.Activity;
import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.*;

import com.sina.weibo.happyaa.NewActivity;


@SuppressWarnings("deprecation")
public class TableActivity extends TabActivity {

    @SuppressWarnings("deprecation")
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.table_acyivity);
       /* TabHost tabhost = (TabHost)findViewById(android.R.id.tabhost);
        tabhost.setup();
        
        tabhost.addTab(tabhost.newTabSpec("tab1").setIndicator(null,getResources().getDrawable(R.drawable.f055)).setContent(new Intent(TableActivity.this, OneActivity.class)));
        tabhost.addTab(tabhost.newTabSpec("tab2").setIndicator(null,getResources().getDrawable(R.drawable.chat_expression_bg)).setContent(new Intent(TableActivity.this, TwoActivity.class)));
        tabhost.addTab(tabhost.newTabSpec("tab3").setIndicator(null,getResources().getDrawable(R.drawable.bg_button)).setContent(new Intent(TableActivity.this, ThreeActivity.class)));
       */
        Resources res = getResources(); // Resource object to get Drawables  
        
        TabHost tabHost = getTabHost();  // The activity TabHost  
      
        TabHost.TabSpec spec;  // Resusable TabSpec for each tab  
      
        Intent intent;  // Reusable Intent for each tab  
      
       
      
        // Create an Intent to launch an Activity for the tab (to be reused)  
      
        intent = new Intent().setClass(this, OneActivity.class);  
      
       
      
        // Initialize a TabSpec for each tab and add it to the TabHost  
      
        spec = tabHost.newTabSpec("tab1").setIndicator("会话",  
      
                          res.getDrawable(R.drawable.bg_button))  
      
                      .setContent(intent);  
      
        tabHost.addTab(spec);  
      
       
      
        // Do the same for the other tabs  
      
        intent = new Intent().setClass(this, TwoActivity.class);  
      
        spec = tabHost.newTabSpec("tab2").setIndicator("活动",  
      
                          res.getDrawable(R.drawable.d1))  
      
                      .setContent(intent);  
      
        tabHost.addTab(spec);  
      
       
      
        intent = new Intent().setClass(this, ThreeActivity.class);  
      
        spec = tabHost.newTabSpec("tab3").setIndicator("AA",  
      
                          res.getDrawable(R.drawable.btn_intercom))  
      
                      .setContent(intent);  
      
        tabHost.addTab(spec); 
        
        
        tabHost.setCurrentTab(0);
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
