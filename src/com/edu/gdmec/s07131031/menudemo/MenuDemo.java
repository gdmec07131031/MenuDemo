package com.edu.gdmec.s07131031.menudemo;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MenuDemo extends Activity {
	TextView mtv;

    @Override
	public boolean onMenuItemSelected(int featureId, MenuItem item) {
		// TODO Auto-generated method stub
    	switch (item.getItemId()) {
		case R.id.item1:
			mtv.setText("你选中了hellow");
			break;
		case R.id.item2:  
			mtv.setText("你选中了sayhellow");
			break;
	case R.id.item3:    
		mtv.setText("你选中了control");
		break;	}

		return super.onMenuItemSelected(featureId, item);
	}


	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_demo);
        mtv=(TextView) findViewById(R.id.textView1);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_demo, menu);
        return true;
    }
    
}
