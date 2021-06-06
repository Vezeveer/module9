package com.example.module9;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.app.ListActivity;
import android.content.Intent;

public class Main extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.main);
        
        String[] browser = {"Yahoo.com", "Google.com"};
        setListAdapter(new ArrayAdapter<String>(this, R.layout.main, R.id.txtBrowser, browser));
    }
    
    protected void onListItemClick(ListView l, View v, int position, long id){
    	switch(position){
    	case 0:
    		startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://yahoo.com/")));
    		break;
    	case 1:
    		startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://google.com/")));
    		break;
    	}
    }

    
}
