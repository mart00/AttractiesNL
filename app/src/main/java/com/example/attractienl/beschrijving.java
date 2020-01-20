package com.example.attractienl;

import android.app.Activity;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.viewpager.widget.ViewPager;

public class beschrijving extends Activity {
    Database thedb;
    ImageView imageView;
    private Context context;
    private SQLiteDatabase database;
    private Sql dbHandler;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.bes_layout);
        Context c = getApplicationContext();
        Integer posi = getIntent().getIntExtra("itemname",0);
        TextView t = findViewById(R.id.textView);
        Database database = new Database(this);
        String doot =  database.getRoute(posi);
        t.setText(doot);
        int resourceId = c.getResources().getIdentifier(doot,null,c.getPackageName());


        imageView = findViewById(R.id.imageView);
        imageView.setImageResource(resourceId);
    }
}

