package com.example.attractienl;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        final Context context = this;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPagerAdapter view = new viewPagerAdapter(context);
       final String[] itemname = view.getNamen();
        String[] plaats = view.getPlaats();
        Integer[] images = view.getImages();

        listAdapter lis = new listAdapter(this,itemname,plaats,images);

        ListView list;



        list = findViewById(R.id.list);
        list.setAdapter(lis);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Intent intent = new Intent(MainActivity.this, beschrijving.class);
                String itemClicked = itemname[position];
                intent.putExtra("itemname", itemClicked);
                startActivity(intent);
            }
        });
    }
}
