package com.example.mayank.graphics;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by MAYANK on 3/27/2016.
 */
public class GFXSurface extends Activity {

    MyBringBackSurface ourSurfaceView;

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        ourSurfaceView=new MyBringBackSurface(this);
        setContentView(ourSurfaceView);
    }

    protected void onPause(){
        super.onPause();
        ourSurfaceView.pause();
    }
    protected void onResume(){
        super.onResume();
        ourSurfaceView.resume();
    }
}
