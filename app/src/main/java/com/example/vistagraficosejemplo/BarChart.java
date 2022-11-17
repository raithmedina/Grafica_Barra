package com.example.vistagraficosejemplo;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;

import java.util.ArrayList;

public class BarChart extends View {
    private Paint textPaint;
    private Paint grayPaint;
    private Paint bluePaint;
    float scaleFactor;
    ArrayList<Data> dataList;
    public BarChart(Context context, ArrayList<Data> dataList) {
        super(context);
        this.dataList=dataList;
        init();
    }
    private void init() {
        DisplayMetrics matrices=getResources().getDisplayMetrics();
        scaleFactor=matrices.density;
        textPaint=new Paint();
        grayPaint=new Paint();
        bluePaint =new Paint();
        grayPaint.setColor(Color.DKGRAY);
        bluePaint.setColor(Color.BLUE);
        textPaint.setColor(Color.DKGRAY);
        textPaint.setTextSize(30);
        textPaint.setTypeface(Typeface.create(Typeface.DEFAULT_BOLD,Typeface.BOLD));
    }

    public BarChart(Context context, AttributeSet attrs) {
        super(context, attrs);
    }
    @Override
    protected void onDraw(Canvas canvas) {

        final int margin = 10;

        super.onDraw(canvas);
        int left= (int) (margin*scaleFactor);
        int limiteBarra,inicioTexto;
        int right=70;
        int textLeft= (int) ((margin+7)*scaleFactor);

        canvas.drawLine(left,520,getWidth(),520,grayPaint);

        for(int i=0;i<dataList.size();i++){

            limiteBarra=500-scale(dataList.get(i).getValueAlturaY());
            canvas.drawRect(left,limiteBarra,right,500, bluePaint);

            inicioTexto= (int) (limiteBarra-5*scaleFactor);
            canvas.drawText(dataList.get(i).getNameStringY(),left-5*scaleFactor,inicioTexto,textPaint);

            canvas.drawText(dataList.get(i).getNameX(), textLeft, 550, textPaint);
            textLeft= (int) (textLeft+40*scaleFactor);
            left= (int) (left+40*scaleFactor);
            right= (int) (right+40*scaleFactor);
        }
    }

    private int scale(float firstVal) {
        int result= (int) ((500/200)*firstVal);
        return result;
    }
}
