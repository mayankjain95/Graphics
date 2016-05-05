package com.example.mayank.graphics;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by MAYANK on 3/27/2016.
 */
public class ActivityB extends Activity {
    MyBringBack ourView;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ourView=new MyBringBack(this);
        setContentView(ourView);
    }
}
