package com.example.trent.paintmeister;

import android.content.ClipData;
import android.os.Bundle;
import android.app.ActionBar;
import android.app.Activity;
import android.app.Fragment;
import android.app.TabActivity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;
import android.widget.Toast;
import android.support.v7.app.ActionBarActivity;

public class TabScreen extends ActionBarActivity {
	
	// Declare Tab Variable
    ActionBar.Tab Tab1, Tab2, Tab3;
    Fragment fragmentTab1 = new ButtonsActivity();
    Fragment fragmentTab2 = new PlaceList();
    Fragment fragmentTab3 = new PictureFragment();
    

    //==============================================================================================
    /**
     * Use the onCreate to build the action bar tabs.
     * @param savedInstanceState
     */
    //==============================================================================================
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tab);
		
		
		ActionBar actionBar = getActionBar();
     
        // Hide Actionbar Icon
        //actionBar.setDisplayShowHomeEnabled(false);
 
        // Hide Actionbar Title
        //actionBar.setDisplayShowTitleEnabled(false);
 
        // Create Actionbar Tabs

        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
 
        // Set Tab Icon and Titles
        Tab1 = actionBar.newTab().setIcon(R.drawable.ic_tab_calc);
        Tab2 = actionBar.newTab().setIcon(R.drawable.ic_tab_list);
        Tab3 = actionBar.newTab().setIcon(R.drawable.ic_tab_map);
 
        // Set Tab Listeners
        Tab1.setTabListener(new TabListener(fragmentTab1));
        Tab2.setTabListener(new TabListener(fragmentTab2));
        Tab3.setTabListener(new TabListener(fragmentTab3));
 
        // Add tabs to actionbar
        actionBar.addTab(Tab1);
        actionBar.addTab(Tab2);
        actionBar.addTab(Tab3);

	
	}//=============================================================================================


    @Override
    public  boolean onCreateOptionsMenu(Menu menu)
    {
            //Group id, item id, order, title
        MenuItem mnu1 = menu.add(0, 0, 0, "Item 1");
        {
            mnu1.setIcon(R.drawable.ic_launcher);
            mnu1.setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM);
        }
        MenuItem mnu2 = menu.add(0, 1, 1, "Item 2");
        {
            mnu2.setIcon(R.drawable.ic_launcher);
            mnu2.setShowAsAction(MenuItem.SHOW_AS_ACTION_ALWAYS);
        }
        MenuItem mnu3 = menu.add(0, 2, 2, "Item 3");
        {
            mnu3.setIcon(R.drawable.ic_launcher);
            mnu3.setShowAsAction(MenuItem.SHOW_AS_ACTION_NEVER);
        }
        MenuItem mnu4 = menu.add(0, 3, 3, "Item 4");
        {
            mnu4.setShowAsAction(MenuItem.SHOW_AS_ACTION_WITH_TEXT);
        }
        MenuItem mnu5 = menu.add(0, 4, 4, "Item 5");
        {
            mnu5.setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM);
        }

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        switch (item.getItemId()) {
            case 0:
                Toast.makeText(this, "You clicked on Item 1",
                        Toast.LENGTH_LONG).show();
                return true;
            case 1:
                Toast.makeText(this, "You clicked on Item 2",
                        Toast.LENGTH_LONG).show();
                return true;
            case 2:
                Toast.makeText(this, "You clicked on Item 3",
                        Toast.LENGTH_LONG).show();
                return true;
            case 3:
                Toast.makeText(this, "You clicked on Item 4",
                        Toast.LENGTH_LONG).show();
                return true;
            case 4:
                Toast.makeText(this, "You clicked on Item 5",
                        Toast.LENGTH_LONG).show();
                return true;
        }
        return false;
    }

}//#################################################################################################
