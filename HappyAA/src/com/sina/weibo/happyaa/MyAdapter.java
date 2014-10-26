package com.sina.weibo.happyaa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
 
import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
 
public class MyAdapter extends BaseAdapter {
 
    private LayoutInflater mInflater;
    private List<Map<String, Object>> mData;
    public static Map<Integer, Boolean> isSelected;
     
    public MyAdapter(Context context) {
        mInflater = LayoutInflater.from(context);
        init();
    }
    //初始化
    @SuppressLint("UseSparseArrays") private void init() {
        mData = new ArrayList<Map<String,Object>>();
        for (int i=0; i<15; i++) {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("img", R.drawable.f045);
            map.put("title", "第" + (i+1) + "行的标题");
            mData.add(map);
        }
        //定义isSelected这个map是记录每个listItem的状态，初始状态全部为false
        isSelected = new HashMap<Integer, Boolean>();
        for (int i=0; i<mData.size(); i++) {
            isSelected.put(i, false); 
        }
    }
     
    public int getCount() {
        // TODO Auto-generated method stub
        return mData.size();
    }
 
    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return null;
    }
 
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return 0;
    }
 
    @SuppressLint("InflateParams") public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;
        //convertView为null的时候初始化convertView
        if (convertView == null) {
            holder = new ViewHolder();
            convertView = mInflater.inflate(R.layout.people_main, null);
            holder.img = (ImageView)convertView.findViewById(R.id.tellpic1);
            holder.title = (TextView)convertView.findViewById(R.id.tellname1);
            holder.cBox = (CheckBox)convertView.findViewById(R.id.checkBox1);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder)convertView.getTag();
        }
        holder.img.setBackgroundResource((Integer)mData.get(position).get("img"));
        holder.title.setText(mData.get(position).get("title").toString());
        holder.cBox.setChecked(isSelected.get(position));
        return convertView;
    }
     
    public final class ViewHolder {
        public ImageView img;
        public TextView title;
        public CheckBox cBox;
    }
}
