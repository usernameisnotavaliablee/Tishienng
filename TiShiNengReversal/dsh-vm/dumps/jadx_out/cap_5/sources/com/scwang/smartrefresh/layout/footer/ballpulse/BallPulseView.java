package com.scwang.smartrefresh.layout.footer.ballpulse;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class BallPulseView extends android.view.View {
    public static final int i = 50;
    private android.graphics.Paint a;
    private int b;
    private int c;
    private float d;
    private float[] e;
    private boolean f;
    private java.util.ArrayList<android.animation.ValueAnimator> g;
    private java.util.Map<android.animation.ValueAnimator, android.animation.ValueAnimator.AnimatorUpdateListener> h;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements android.animation.ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ int a;
        final /* synthetic */ com.scwang.smartrefresh.layout.footer.ballpulse.BallPulseView b;

        a(com.scwang.smartrefresh.layout.footer.ballpulse.BallPulseView r1, int r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(android.animation.ValueAnimator r3) {
                r2 = this;
                com.scwang.smartrefresh.layout.footer.ballpulse.BallPulseView r0 = r2.b
                float[] r0 = com.scwang.smartrefresh.layout.footer.ballpulse.BallPulseView.a(r0)
                int r1 = r2.a
                java.lang.Object r3 = r3.getAnimatedValue()
                java.lang.Float r3 = (java.lang.Float) r3
                float r3 = r3.floatValue()
                r0[r1] = r3
                com.scwang.smartrefresh.layout.footer.ballpulse.BallPulseView r3 = r2.b
                r3.postInvalidate()
                return
        }
    }

    public BallPulseView(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public BallPulseView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public BallPulseView(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r1 = -1118482(0xffffffffffeeeeee, float:NaN)
            r0.b = r1
            r1 = -1615546(0xffffffffffe75946, float:NaN)
            r0.c = r1
            r1 = 3
            float[] r1 = new float[r1]
            r1 = {x0042: FILL_ARRAY_DATA , data: [1065353216, 1065353216, 1065353216} // fill-array
            r0.e = r1
            r1 = 0
            r0.f = r1
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r0.h = r1
            r1 = 1082130432(0x40800000, float:4.0)
            int r1 = com.scwang.smartrefresh.layout.util.c.b(r1)
            float r1 = (float) r1
            r0.d = r1
            android.graphics.Paint r1 = new android.graphics.Paint
            r1.<init>()
            r0.a = r1
            r2 = -1
            r1.setColor(r2)
            android.graphics.Paint r1 = r0.a
            android.graphics.Paint$Style r2 = android.graphics.Paint.Style.FILL
            r1.setStyle(r2)
            android.graphics.Paint r1 = r0.a
            r2 = 1
            r1.setAntiAlias(r2)
            return
    }

    static /* synthetic */ float[] a(com.scwang.smartrefresh.layout.footer.ballpulse.BallPulseView r0) {
            float[] r0 = r0.e
            return r0
    }

    private void b() {
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r5.g = r0
            r0 = 240(0xf0, float:3.36E-43)
            r1 = 360(0x168, float:5.04E-43)
            r2 = 120(0x78, float:1.68E-43)
            int[] r0 = new int[]{r2, r0, r1}
            r1 = 0
        L12:
            r2 = 3
            if (r1 >= r2) goto L3f
            float[] r2 = new float[r2]
            r2 = {x0040: FILL_ARRAY_DATA , data: [1065353216, 1050253722, 1065353216} // fill-array
            android.animation.ValueAnimator r2 = android.animation.ValueAnimator.ofFloat(r2)
            r3 = 750(0x2ee, double:3.705E-321)
            r2.setDuration(r3)
            r3 = -1
            r2.setRepeatCount(r3)
            r3 = r0[r1]
            long r3 = (long) r3
            r2.setStartDelay(r3)
            java.util.Map<android.animation.ValueAnimator, android.animation.ValueAnimator$AnimatorUpdateListener> r3 = r5.h
            com.scwang.smartrefresh.layout.footer.ballpulse.BallPulseView$a r4 = new com.scwang.smartrefresh.layout.footer.ballpulse.BallPulseView$a
            r4.<init>(r5, r1)
            r3.put(r2, r4)
            java.util.ArrayList<android.animation.ValueAnimator> r3 = r5.g
            r3.add(r2)
            int r1 = r1 + 1
            goto L12
        L3f:
            return
    }

    private boolean c() {
            r1 = this;
            boolean r0 = r1.f
            return r0
    }

    public void d() {
            r3 = this;
            java.util.ArrayList<android.animation.ValueAnimator> r0 = r3.g
            if (r0 != 0) goto L7
            r3.b()
        L7:
            java.util.ArrayList<android.animation.ValueAnimator> r0 = r3.g
            if (r0 != 0) goto Lc
            goto L12
        Lc:
            boolean r0 = r3.c()
            if (r0 == 0) goto L13
        L12:
            return
        L13:
            r0 = 0
        L14:
            java.util.ArrayList<android.animation.ValueAnimator> r1 = r3.g
            int r1 = r1.size()
            if (r0 >= r1) goto L37
            java.util.ArrayList<android.animation.ValueAnimator> r1 = r3.g
            java.lang.Object r1 = r1.get(r0)
            android.animation.ValueAnimator r1 = (android.animation.ValueAnimator) r1
            java.util.Map<android.animation.ValueAnimator, android.animation.ValueAnimator$AnimatorUpdateListener> r2 = r3.h
            java.lang.Object r2 = r2.get(r1)
            android.animation.ValueAnimator$AnimatorUpdateListener r2 = (android.animation.ValueAnimator.AnimatorUpdateListener) r2
            if (r2 == 0) goto L31
            r1.addUpdateListener(r2)
        L31:
            r1.start()
            int r0 = r0 + 1
            goto L14
        L37:
            r0 = 1
            r3.f = r0
            int r0 = r3.c
            r3.setIndicatorColor(r0)
            return
    }

    public void e() {
            r2 = this;
            java.util.ArrayList<android.animation.ValueAnimator> r0 = r2.g
            if (r0 == 0) goto L2c
            boolean r1 = r2.f
            if (r1 == 0) goto L2c
            r1 = 0
            r2.f = r1
            java.util.Iterator r0 = r0.iterator()
        Lf:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L24
            java.lang.Object r1 = r0.next()
            android.animation.ValueAnimator r1 = (android.animation.ValueAnimator) r1
            if (r1 == 0) goto Lf
            r1.removeAllUpdateListeners()
            r1.end()
            goto Lf
        L24:
            r0 = 3
            float[] r0 = new float[r0]
            r0 = {x0032: FILL_ARRAY_DATA , data: [1065353216, 1065353216, 1065353216} // fill-array
            r2.e = r0
        L2c:
            int r0 = r2.b
            r2.setIndicatorColor(r0)
            return
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
            r2 = this;
            super.onDetachedFromWindow()
            java.util.ArrayList<android.animation.ValueAnimator> r0 = r2.g
            if (r0 == 0) goto L1e
            r0 = 0
        L8:
            java.util.ArrayList<android.animation.ValueAnimator> r1 = r2.g
            int r1 = r1.size()
            if (r0 >= r1) goto L1e
            java.util.ArrayList<android.animation.ValueAnimator> r1 = r2.g
            java.lang.Object r1 = r1.get(r0)
            android.animation.ValueAnimator r1 = (android.animation.ValueAnimator) r1
            r1.cancel()
            int r0 = r0 + 1
            goto L8
        L1e:
            return
    }

    @Override // android.view.View
    protected void onDraw(android.graphics.Canvas r9) {
            r8 = this;
            int r0 = r8.getWidth()
            int r1 = r8.getHeight()
            int r0 = java.lang.Math.min(r0, r1)
            float r0 = (float) r0
            float r1 = r8.d
            r2 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 * r2
            float r0 = r0 - r1
            r1 = 1086324736(0x40c00000, float:6.0)
            float r0 = r0 / r1
            int r1 = r8.getWidth()
            int r1 = r1 / 2
            float r1 = (float) r1
            float r2 = r2 * r0
            float r3 = r8.d
            float r3 = r3 + r2
            float r1 = r1 - r3
            int r3 = r8.getHeight()
            int r3 = r3 / 2
            float r3 = (float) r3
            r4 = 0
        L2c:
            r5 = 3
            if (r4 >= r5) goto L51
            r9.save()
            float r5 = (float) r4
            float r6 = r2 * r5
            float r6 = r6 + r1
            float r7 = r8.d
            float r7 = r7 * r5
            float r6 = r6 + r7
            r9.translate(r6, r3)
            float[] r5 = r8.e
            r5 = r5[r4]
            r9.scale(r5, r5)
            android.graphics.Paint r5 = r8.a
            r6 = 0
            r9.drawCircle(r6, r6, r0, r5)
            r9.restore()
            int r4 = r4 + 1
            goto L2c
        L51:
            return
    }

    @Override // android.view.View
    protected void onMeasure(int r2, int r3) {
            r1 = this;
            r0 = 1112014848(0x42480000, float:50.0)
            int r0 = com.scwang.smartrefresh.layout.util.c.b(r0)
            int r2 = android.view.View.resolveSize(r0, r2)
            int r3 = android.view.View.resolveSize(r0, r3)
            r1.setMeasuredDimension(r2, r3)
            return
    }

    public void setAnimatingColor(@androidx.annotation.ColorInt int r1) {
            r0 = this;
            r0.c = r1
            return
    }

    public void setIndicatorColor(@androidx.annotation.ColorInt int r2) {
            r1 = this;
            android.graphics.Paint r0 = r1.a
            r0.setColor(r2)
            return
    }

    public void setNormalColor(@androidx.annotation.ColorInt int r1) {
            r0 = this;
            r0.b = r1
            return
    }
}
