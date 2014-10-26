package com.sina.weibo.happyaa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ImageButton;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;



public class TellHistory extends Activity {
	 private ListView lv;
	
	private List<Map<String,Object>> slist = new ArrayList<Map<String,Object>>();
	
	public List<String> users = new ArrayList<String>();
	public List<String> chats = new ArrayList<String>();
	
	
	private String name[]={
			"tianyin","huxianwei","liulu","wangjiawei","dsajdgsa","dsahgd","dgsahd","qwebswiw","werehw","28724"		
	};
	private String num[]={
			"123445","213813","72974","72947829","4242974","82942493","443443","2479247","37827324","723724"
	};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
    	
    	/**
    	final SQLiteDatabase database = SQLiteDatabase.openOrCreateDatabase("/data/com.sina.weibo.happyaa/database.db",null);
        Cursor c = database.query("bigtable",null,null,null,null,null,null);
        if(c.moveToFirst())
        {
        	for(int i=0;i<c.getCount();i++){
        		c.move(i);
        		name[i] = c.getString(1);
        		num[i]=c.getString(2);
        	}
        		
        }
        */
        
    	super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);
        
       lv = (ListView) findViewById(R.id.ls_message);/*定义一个动态数组*/
       for(int i=0;i<name.length;i++){
    	   Map<String,Object> map=new HashMap<String,Object>();
    	   map.put("usepic", R.drawable.copyright);
    	   map.put("usename", name[i]);
    	   map.put("usenum", num[i]);
    	   slist.add(map);
       }
       ListAdapter listadapter=new SimpleAdapter(this,slist,R.layout.tell_history,
    	       new String[]{"usepic","usename","usenum"},
    		   new int[]{R.id.tellpic,R.id.tellname,R.id.telldate});
       lv.setAdapter(listadapter);
       
       lv.setOnItemClickListener(new  OnItemClickListener() {
    	   @Override
           public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
                   long arg3) {
               setTitle("你点击了第"+arg2+"行");//设置标题栏显示点击的行 
              /** String sql = name[arg2];
               Cursor c = database.query(sql,null,null,null,null,null,null);
               if(c.moveToFirst())
               {
               	for(int i=0;i<c.getCount();i++){
               		c.move(i);
               		users.add(c.getString(1));
               		chats.add(c.getString(2));
               	}
               		
               }*/
               
               Intent intent = new Intent(TellHistory.this, TableActivity.class);
				//intent.setClass(MainActivity.this, NewActivity.class);
				startActivity(intent);
               
           }
       });

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.tell_his, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.tell_his) {
        	Intent intent = new Intent(TellHistory.this, CreatTell.class);
			//intent.setClass(MainActivity.this, NewActivity.class);
			startActivity(intent);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}