package com.example.android_final_18;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    private ListView lvShow;
    private String[] item_name=new String[]{"item1","item2","item3","item4"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
        setAdapter();

        lvShow.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String msg=item_name[position];
                setToast(MainActivity.this,"你選擇了:"+msg);
            }
        });
    }
    public void setToast(Context context, String text){
        Toast.makeText(context,text,Toast.LENGTH_SHORT).show();
    }

    private void setAdapter() {
        ArrayAdapter<String> adapter=
                new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,item_name);
        lvShow.setAdapter(adapter);
    }
    private void findViews() {
        lvShow=(ListView)findViewById(R.id.lvShow);
    }
}