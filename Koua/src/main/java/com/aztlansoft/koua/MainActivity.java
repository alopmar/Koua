package com.aztlansoft.koua;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;

/**
 * Main Activity used to start the ServiceCommunication service
 */
public class MainActivity extends Activity {

    /**
     * Event invoked on create
     * @param savedInstanceState keeps the state
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = new Intent(this, ServiceCommunicator.class);
        startService(intent);
    }

    /**
     * On create event for the options menu
     * @param menu
     * @return
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
