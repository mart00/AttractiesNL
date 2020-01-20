package com.example.attractienl;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class beschrijving extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.bes_layout);
        String posi = getIntent().getStringExtra("itemname");
        TextView t = findViewById(R.id.textView);
        t.setText(posi);
    }
}

