package com.example.everpresentwindow;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

import com.jawsware.interactiveoverlay.SampleOverlayHideActivity;
import com.jawsware.interactiveoverlay.SampleOverlayShowActivity;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button showOverlayButton = (Button) findViewById(R.id.show_overlay);
        showOverlayButton.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
            startActivity(new Intent(MainActivity.this, SampleOverlayShowActivity.class));
          }
        });

        Button hideOverlayButton = (Button) findViewById(R.id.hide_overlay);
        hideOverlayButton.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
            startActivity(new Intent(MainActivity.this, SampleOverlayHideActivity.class));
          }
        });
        Button myActivityButton = (Button) findViewById(R.id.my_activity);
        myActivityButton.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
            startActivity(new Intent(MainActivity.this, MyActivity.class));
          }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
