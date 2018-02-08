package com.example.vksoni.contextmenu;

import android.app.Activity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         tv=(TextView)findViewById(R.id.tv);
         registerForContextMenu(tv);
    }
    @Override
    public void onCreateContextMenu(ContextMenu m, View v, ContextMenu.ContextMenuInfo i){
        super.onCreateContextMenu(m,v,i);
        getMenuInflater().inflate(R.menu.context_menu,m);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        tv.setText("You have selected"+item.getTitle());
        if(item.getTitle().toString().equalsIgnoreCase("exit")){
            finish();
        }
        return super.onContextItemSelected(item);
    }
}
