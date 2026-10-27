package com.github.mikephil.charting.listener;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public interface OnChartGestureListener {
    void onChartDoubleTapped(android.view.MotionEvent r1);

    void onChartFling(android.view.MotionEvent r1, android.view.MotionEvent r2, float r3, float r4);

    void onChartGestureEnd(android.view.MotionEvent r1, com.github.mikephil.charting.listener.ChartTouchListener.ChartGesture r2);

    void onChartGestureStart(android.view.MotionEvent r1, com.github.mikephil.charting.listener.ChartTouchListener.ChartGesture r2);

    void onChartLongPressed(android.view.MotionEvent r1);

    void onChartScale(android.view.MotionEvent r1, float r2, float r3);

    void onChartSingleTapped(android.view.MotionEvent r1);

    void onChartTranslate(android.view.MotionEvent r1, float r2, float r3);
}
