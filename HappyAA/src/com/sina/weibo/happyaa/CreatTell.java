package com.sina.weibo.happyaa;

import java.lang.reflect.Array;

import com.sina.weibo.happyaa.MyAdapter.ViewHolder;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
 
/**
 * 总结：
 * 1、数据可以在Activity中获取，在初始化Adapter的时候当做参数传递过去，这样就可以是list编程动态的。
 * 2、对MyAdapter中getview的理解不够，尤其是convertView.setTag(holder),
 * @author Administrator
 */

public class CreatTell extends Activity {
	public static boolean chbox[]=new boolean[1000];
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.creat_tell);
         
        final ListView list = (ListView)findViewById(R.id.ls_people);
        MyAdapter adapter = new MyAdapter(this);
        list.setAdapter(adapter);
        list.setItemsCanFocus(false);
        list.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
        list.setOnItemClickListener(new OnItemClickListener() {
 
            public void onItemClick(AdapterView<?> parent, View view, int position,
                    long id) {
                // TODO Auto-generated method stub
                ViewHolder vHolder = (ViewHolder)view.getTag();
                //在每次获取点击的item时将对应的checkBox状态改变，同时修改map的值
                vHolder.cBox.toggle();
                MyAdapter.isSelected.put(position, vHolder.cBox.isChecked());
               if (vHolder.cBox.isChecked()==true)  chbox[position]=true; 
                else chbox[position]=false;
            }
        });
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
        	Intent intent = new Intent(CreatTell.this, TableActivity.class);
			//intent.setClass(MainActivity.this, NewActivity.class);
			startActivity(intent);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
