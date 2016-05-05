package com.example.mayank.graphics;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;

import java.lang.reflect.InvocationTargetException;

/**
 * Created by MAYANK on 4/13/2016.
 */
public class Vector extends Activity {
    ImageView imageView;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vector);
        try {
            imageView = (ImageView) findViewById(R.id.vectorr);
        } catch (Exception e) {

        }
    }
}
