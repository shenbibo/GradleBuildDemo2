package com.sky.gradlebuilddemo.activity;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import com.sky.gradlebuilddemo.R;


/**
 * PACKAGE_NAME
 * [function]
 * [detail]
 * Created by Sky on 2016/10/24.
 * modify by
 */

public class HelpTestActivity extends AppCompatActivity {


    private ListView listView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help_test);
        listView = (ListView) findViewById(R.id.msgListView);
        String[] msgs = getResources().getStringArray(R.array.listMsg);
        listView.setAdapter(new SimpleListAdapter(this, msgs));
    }

    private static class SimpleListAdapter extends BaseAdapter{

        private String[] data;

        private Context context;

        SimpleListAdapter(Context context, String[]data){
            this.data = data;
            this.context = context;
        }

        @Override
        public int getCount() {
            return data.length;
        }

        @Override
        public Object getItem(int position) {
            return data[position];
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            if(convertView == null){
                convertView = LayoutInflater.from(context).inflate(R.layout.list_item_layout, null);
            }
            TextView  textView = (TextView) convertView.findViewById(R.id.itemTextView);
            textView.setText(data[position]);
            return convertView;
        }
    }


}
