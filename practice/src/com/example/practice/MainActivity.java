package com.example.practice;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.widget.TextView;


public class MainActivity extends Activity {
	private static int FIRST = Menu.FIRST;
	private static int SECOND = Menu.FIRST+1;
	private static int THREE = Menu.FIRST+2;
	//private static int FOUR = Menu.FIRST+3;

	private TextView textview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        //getMenuInflater().inflate(R.menu.main, menu);
        
        menu.add(0,FIRST,1,"开始游戏");
        menu.add(0,SECOND,2,"暂停游戏");
        menu.add(0,THREE,3,"关于游戏");
        final SubMenu sub = menu.addSubMenu(1,100,100,"退出游戏");
        sub.add(2,101,101,"确定");
        sub.add(2,102,102,"取消");
        return super.onCreateOptionsMenu(menu);
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
        if(id == 1){
        	textview.setText("login");
        }
        if(id == 101){
        	textview.setText("login");
        }

        return super.onOptionsItemSelected(item);
    }
}
