package com.example.mayank.graphics;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.view.View;

/**
 * Created by MAYANK on 3/27/2016.
 */
public class MyBringBack extends View{
    Bitmap ball;
    float changingY;
    //Typeface font;

    public MyBringBack(Context context) {
        super(context);
        ball= BitmapFactory.decodeResource(getResources(),R.drawable.ball);
        changingY=0;
     //   font=Typeface.createFromAsset(context.getAssets(),"");
    }

    protected void onDraw(Canvas canvas){
        super.onDraw(canvas);
        canvas.drawColor(Color.WHITE);

        Paint textPaint=new Paint();
        textPaint.setARGB(50,254,10,50);
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setTextSize(200);
        canvas.drawText("Mayank",canvas.getWidth()/2,600,textPaint);

        canvas.drawBitmap(ball, (canvas.getWidth()) / 2, changingY, null);
        if (changingY<canvas.getHeight()){
            changingY+=10;
        }else {
            changingY=0;
        }
        Rect rect=new Rect();
        rect.set(0, 800, canvas.getWidth(),1100);
        Paint ourBlue=new Paint();
        ourBlue.setColor(Color.BLUE);
        canvas.drawRect(rect,ourBlue);
        invalidate();
    }
}
