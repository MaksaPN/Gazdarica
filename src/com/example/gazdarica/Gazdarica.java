package com.example.gazdarica;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Gazdarica extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gazdarica);
        
        Button dugme = (Button) findViewById(R.id.button1);
        dugme.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				Intent i = new Intent(Gazdarica.this, MapResult.class);
				startActivity(i);
				
			}
		});
        
        
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_gazdarica, menu);
        return true;
    }
}
