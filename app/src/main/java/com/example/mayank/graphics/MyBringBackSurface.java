package com.example.mayank.graphics;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

/**
 * Created by MAYANK on 3/27/2016.
 */
public class MyBringBackSurface extends SurfaceView implements Runnable {
    SurfaceHolder surfaceHolder;
    Thread thread=null;
    boolean isRunning=true;
    public MyBringBackSurface(Context context) {
        super(context);
        surfaceHolder=getHolder();

    }

    public void pause(){
        isRunning=false;
        while (true){
            try {
                thread.join();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            break;
        }
        thread=null;

    }

    public void resume(){
        isRunning=true;
        thread=new Thread(this);
        thread.start();
    }
    @Override
    public void run() {
        while (isRunning){
            if (!surfaceHolder.getSurface().isValid())
                continue;

            Canvas canvas=surfaceHolder.lockCanvas();
            canvas.drawColor(Color.BLUE);
            surfaceHolder.unlockCanvasAndPost(canvas);
        }

    }
}
