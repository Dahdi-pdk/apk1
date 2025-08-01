package com.appawal;

import android.app.Activity;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;




public class MainActivity extends Activity {
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_main);
        
        Button button = findViewById(R.id.button);
        TextView textview = findViewById(R.id.textView);
        
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                textview.setText("Tombol diklik");
            }
        });
    }
    
}