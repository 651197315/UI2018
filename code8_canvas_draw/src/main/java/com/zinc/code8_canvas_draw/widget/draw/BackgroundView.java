package com.zinc.code8_canvas_draw.widget.draw;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.support.annotation.Nullable;
import android.util.AttributeSet;

import com.zinc.code8_canvas_draw.R;

/**
 * author       : zinc
 * time         : 2019/4/22 上午9:23
 * desc         : 画背景
 * version      : 1.2.0
 */
public class BackgroundView extends BaseDrawView {

    protected Bitmap mBitmap;

    private Matrix mMatrix;

    public BackgroundView(Context context) {
        super(context);
    }

    public BackgroundView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public BackgroundView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void init(Context context) {
        super.init(context);
        mBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.logo);

        mMatrix = new Matrix();
        mMatrix.setScale(0.25f, 0.25f);
    }

    @Override
    protected void onDraw(Canvas canvas) {

        canvas.drawBitmap(mBitmap, mMatrix, mPaint);

        canvas.drawColor(Color.parseColor("#88880000"),
                PorterDuff.Mode.DST_ATOP);

    }
}
