package com.github.mikephil.charting.listener;

import com.github.mikephil.charting.charts.Chart;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public abstract class ChartTouchListener<T extends com.github.mikephil.charting.charts.Chart<?>> extends android.view.GestureDetector.SimpleOnGestureListener implements android.view.View.OnTouchListener {
    protected static final int DRAG = 1;
    protected static final int NONE = 0;
    protected static final int PINCH_ZOOM = 4;
    protected static final int POST_ZOOM = 5;
    protected static final int ROTATE = 6;
    protected static final int X_ZOOM = 2;
    protected static final int Y_ZOOM = 3;
    protected T mChart;
    protected android.view.GestureDetector mGestureDetector;
    protected com.github.mikephil.charting.listener.ChartTouchListener.ChartGesture mLastGesture;
    protected com.github.mikephil.charting.highlight.Highlight mLastHighlighted;
    protected int mTouchMode;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum ChartGesture extends java.lang.Enum<com.github.mikephil.charting.listener.ChartTouchListener.ChartGesture> {
        private static final /* synthetic */ com.github.mikephil.charting.listener.ChartTouchListener.ChartGesture[] $VALUES = null;
        public static final com.github.mikephil.charting.listener.ChartTouchListener.ChartGesture DOUBLE_TAP = null;
        public static final com.github.mikephil.charting.listener.ChartTouchListener.ChartGesture DRAG = null;
        public static final com.github.mikephil.charting.listener.ChartTouchListener.ChartGesture FLING = null;
        public static final com.github.mikephil.charting.listener.ChartTouchListener.ChartGesture LONG_PRESS = null;
        public static final com.github.mikephil.charting.listener.ChartTouchListener.ChartGesture NONE = null;
        public static final com.github.mikephil.charting.listener.ChartTouchListener.ChartGesture PINCH_ZOOM = null;
        public static final com.github.mikephil.charting.listener.ChartTouchListener.ChartGesture ROTATE = null;
        public static final com.github.mikephil.charting.listener.ChartTouchListener.ChartGesture SINGLE_TAP = null;
        public static final com.github.mikephil.charting.listener.ChartTouchListener.ChartGesture X_ZOOM = null;
        public static final com.github.mikephil.charting.listener.ChartTouchListener.ChartGesture Y_ZOOM = null;

        static {
                com.github.mikephil.charting.listener.ChartTouchListener$ChartGesture r0 = new com.github.mikephil.charting.listener.ChartTouchListener$ChartGesture
                java.lang.String r1 = "NONE"
                r2 = 0
                r0.<init>(r1, r2)
                com.github.mikephil.charting.listener.ChartTouchListener.ChartGesture.NONE = r0
                com.github.mikephil.charting.listener.ChartTouchListener$ChartGesture r1 = new com.github.mikephil.charting.listener.ChartTouchListener$ChartGesture
                java.lang.String r3 = "DRAG"
                r4 = 1
                r1.<init>(r3, r4)
                com.github.mikephil.charting.listener.ChartTouchListener.ChartGesture.DRAG = r1
                com.github.mikephil.charting.listener.ChartTouchListener$ChartGesture r3 = new com.github.mikephil.charting.listener.ChartTouchListener$ChartGesture
                java.lang.String r5 = "X_ZOOM"
                r6 = 2
                r3.<init>(r5, r6)
                com.github.mikephil.charting.listener.ChartTouchListener.ChartGesture.X_ZOOM = r3
                com.github.mikephil.charting.listener.ChartTouchListener$ChartGesture r5 = new com.github.mikephil.charting.listener.ChartTouchListener$ChartGesture
                java.lang.String r7 = "Y_ZOOM"
                r8 = 3
                r5.<init>(r7, r8)
                com.github.mikephil.charting.listener.ChartTouchListener.ChartGesture.Y_ZOOM = r5
                com.github.mikephil.charting.listener.ChartTouchListener$ChartGesture r7 = new com.github.mikephil.charting.listener.ChartTouchListener$ChartGesture
                java.lang.String r9 = "PINCH_ZOOM"
                r10 = 4
                r7.<init>(r9, r10)
                com.github.mikephil.charting.listener.ChartTouchListener.ChartGesture.PINCH_ZOOM = r7
                com.github.mikephil.charting.listener.ChartTouchListener$ChartGesture r9 = new com.github.mikephil.charting.listener.ChartTouchListener$ChartGesture
                java.lang.String r11 = "ROTATE"
                r12 = 5
                r9.<init>(r11, r12)
                com.github.mikephil.charting.listener.ChartTouchListener.ChartGesture.ROTATE = r9
                com.github.mikephil.charting.listener.ChartTouchListener$ChartGesture r11 = new com.github.mikephil.charting.listener.ChartTouchListener$ChartGesture
                java.lang.String r13 = "SINGLE_TAP"
                r14 = 6
                r11.<init>(r13, r14)
                com.github.mikephil.charting.listener.ChartTouchListener.ChartGesture.SINGLE_TAP = r11
                com.github.mikephil.charting.listener.ChartTouchListener$ChartGesture r13 = new com.github.mikephil.charting.listener.ChartTouchListener$ChartGesture
                java.lang.String r15 = "DOUBLE_TAP"
                r16 = 0
                r2 = 7
                r13.<init>(r15, r2)
                com.github.mikephil.charting.listener.ChartTouchListener.ChartGesture.DOUBLE_TAP = r13
                com.github.mikephil.charting.listener.ChartTouchListener$ChartGesture r15 = new com.github.mikephil.charting.listener.ChartTouchListener$ChartGesture
                r17 = 7
                java.lang.String r2 = "LONG_PRESS"
                r18 = 1
                r4 = 8
                r15.<init>(r2, r4)
                com.github.mikephil.charting.listener.ChartTouchListener.ChartGesture.LONG_PRESS = r15
                com.github.mikephil.charting.listener.ChartTouchListener$ChartGesture r2 = new com.github.mikephil.charting.listener.ChartTouchListener$ChartGesture
                r19 = 8
                java.lang.String r4 = "FLING"
                r20 = 2
                r6 = 9
                r2.<init>(r4, r6)
                com.github.mikephil.charting.listener.ChartTouchListener.ChartGesture.FLING = r2
                r4 = 10
                com.github.mikephil.charting.listener.ChartTouchListener$ChartGesture[] r4 = new com.github.mikephil.charting.listener.ChartTouchListener.ChartGesture[r4]
                r4[r16] = r0
                r4[r18] = r1
                r4[r20] = r3
                r4[r8] = r5
                r4[r10] = r7
                r4[r12] = r9
                r4[r14] = r11
                r4[r17] = r13
                r4[r19] = r15
                r4[r6] = r2
                com.github.mikephil.charting.listener.ChartTouchListener.ChartGesture.$VALUES = r4
                return
        }

        ChartGesture(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.github.mikephil.charting.listener.ChartTouchListener.ChartGesture valueOf(java.lang.String r1) {
                java.lang.Class<com.github.mikephil.charting.listener.ChartTouchListener$ChartGesture> r0 = com.github.mikephil.charting.listener.ChartTouchListener.ChartGesture.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.github.mikephil.charting.listener.ChartTouchListener$ChartGesture r1 = (com.github.mikephil.charting.listener.ChartTouchListener.ChartGesture) r1
                return r1
        }

        public static com.github.mikephil.charting.listener.ChartTouchListener.ChartGesture[] values() {
                com.github.mikephil.charting.listener.ChartTouchListener$ChartGesture[] r0 = com.github.mikephil.charting.listener.ChartTouchListener.ChartGesture.$VALUES
                java.lang.Object r0 = r0.clone()
                com.github.mikephil.charting.listener.ChartTouchListener$ChartGesture[] r0 = (com.github.mikephil.charting.listener.ChartTouchListener.ChartGesture[]) r0
                return r0
        }
    }

    public ChartTouchListener(T r2) {
            r1 = this;
            r1.<init>()
            com.github.mikephil.charting.listener.ChartTouchListener$ChartGesture r0 = com.github.mikephil.charting.listener.ChartTouchListener.ChartGesture.NONE
            r1.mLastGesture = r0
            r0 = 0
            r1.mTouchMode = r0
            r1.mChart = r2
            android.view.GestureDetector r0 = new android.view.GestureDetector
            android.content.Context r2 = r2.getContext()
            r0.<init>(r2, r1)
            r1.mGestureDetector = r0
            return
    }

    protected static float distance(float r0, float r1, float r2, float r3) {
            float r0 = r0 - r1
            float r2 = r2 - r3
            float r0 = r0 * r0
            float r2 = r2 * r2
            float r0 = r0 + r2
            double r0 = (double) r0
            double r0 = java.lang.Math.sqrt(r0)
            float r0 = (float) r0
            return r0
    }

    public void endAction(android.view.MotionEvent r3) {
            r2 = this;
            T extends com.github.mikephil.charting.charts.Chart<?> r0 = r2.mChart
            com.github.mikephil.charting.listener.OnChartGestureListener r0 = r0.getOnChartGestureListener()
            if (r0 == 0) goto Ld
            com.github.mikephil.charting.listener.ChartTouchListener$ChartGesture r1 = r2.mLastGesture
            r0.onChartGestureEnd(r3, r1)
        Ld:
            return
    }

    public com.github.mikephil.charting.listener.ChartTouchListener.ChartGesture getLastGesture() {
            r1 = this;
            com.github.mikephil.charting.listener.ChartTouchListener$ChartGesture r0 = r1.mLastGesture
            return r0
    }

    public int getTouchMode() {
            r1 = this;
            int r0 = r1.mTouchMode
            return r0
    }

    protected void performHighlight(com.github.mikephil.charting.highlight.Highlight r2, android.view.MotionEvent r3) {
            r1 = this;
            r3 = 1
            if (r2 == 0) goto L14
            com.github.mikephil.charting.highlight.Highlight r0 = r1.mLastHighlighted
            boolean r0 = r2.equalTo(r0)
            if (r0 == 0) goto Lc
            goto L14
        Lc:
            T extends com.github.mikephil.charting.charts.Chart<?> r0 = r1.mChart
            r0.highlightValue(r2, r3)
            r1.mLastHighlighted = r2
            return
        L14:
            T extends com.github.mikephil.charting.charts.Chart<?> r2 = r1.mChart
            r0 = 0
            r2.highlightValue(r0, r3)
            r1.mLastHighlighted = r0
            return
    }

    public void setLastHighlighted(com.github.mikephil.charting.highlight.Highlight r1) {
            r0 = this;
            r0.mLastHighlighted = r1
            return
    }

    public void startAction(android.view.MotionEvent r3) {
            r2 = this;
            T extends com.github.mikephil.charting.charts.Chart<?> r0 = r2.mChart
            com.github.mikephil.charting.listener.OnChartGestureListener r0 = r0.getOnChartGestureListener()
            if (r0 == 0) goto Ld
            com.github.mikephil.charting.listener.ChartTouchListener$ChartGesture r1 = r2.mLastGesture
            r0.onChartGestureStart(r3, r1)
        Ld:
            return
    }
}
