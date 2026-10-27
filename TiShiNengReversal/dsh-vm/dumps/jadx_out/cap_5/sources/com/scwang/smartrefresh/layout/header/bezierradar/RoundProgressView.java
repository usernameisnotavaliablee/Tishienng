package com.scwang.smartrefresh.layout.header.bezierradar;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class RoundProgressView extends android.view.View {
    private android.graphics.Paint a;
    private android.graphics.Paint b;
    private android.animation.ValueAnimator c;
    private int d;
    private int e;
    private int f;
    private int g;
    private android.graphics.RectF h;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements android.animation.ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ com.scwang.smartrefresh.layout.header.bezierradar.RoundProgressView a;

        a(com.scwang.smartrefresh.layout.header.bezierradar.RoundProgressView r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(android.animation.ValueAnimator r2) {
                r1 = this;
                com.scwang.smartrefresh.layout.header.bezierradar.RoundProgressView r0 = r1.a
                java.lang.Object r2 = r2.getAnimatedValue()
                java.lang.Integer r2 = (java.lang.Integer) r2
                int r2 = r2.intValue()
                com.scwang.smartrefresh.layout.header.bezierradar.RoundProgressView.a(r0, r2)
                com.scwang.smartrefresh.layout.header.bezierradar.RoundProgressView r2 = r1.a
                r2.postInvalidate()
                return
        }
    }

    public RoundProgressView(android.content.Context r2) {
            r1 = this;
            r1.<init>(r2)
            r2 = 0
            r1.d = r2
            r0 = 270(0x10e, float:3.78E-43)
            r1.e = r0
            r1.f = r2
            r1.g = r2
            android.graphics.RectF r2 = new android.graphics.RectF
            r0 = 0
            r2.<init>(r0, r0, r0, r0)
            r1.h = r2
            r1.b()
            return
    }

    static /* synthetic */ int a(com.scwang.smartrefresh.layout.header.bezierradar.RoundProgressView r0, int r1) {
            r0.d = r1
            return r1
    }

    private void b() {
            r5 = this;
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            r5.a = r0
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            r5.b = r0
            android.graphics.Paint r0 = r5.a
            r1 = 1
            r0.setAntiAlias(r1)
            android.graphics.Paint r0 = r5.b
            r0.setAntiAlias(r1)
            android.graphics.Paint r0 = r5.a
            r1 = -1
            r0.setColor(r1)
            android.graphics.Paint r0 = r5.b
            r2 = 1426063360(0x55000000, float:8.796093E12)
            r0.setColor(r2)
            com.scwang.smartrefresh.layout.util.c r0 = new com.scwang.smartrefresh.layout.util.c
            r0.<init>()
            r2 = 1101004800(0x41a00000, float:20.0)
            int r2 = r0.a(r2)
            r5.f = r2
            r2 = 1088421888(0x40e00000, float:7.0)
            int r2 = r0.a(r2)
            r5.g = r2
            android.graphics.Paint r2 = r5.a
            r3 = 1077936128(0x40400000, float:3.0)
            int r4 = r0.a(r3)
            float r4 = (float) r4
            r2.setStrokeWidth(r4)
            android.graphics.Paint r2 = r5.b
            int r0 = r0.a(r3)
            float r0 = (float) r0
            r2.setStrokeWidth(r0)
            r0 = 0
            r2 = 360(0x168, float:5.04E-43)
            int[] r0 = new int[]{r0, r2}
            android.animation.ValueAnimator r0 = android.animation.ValueAnimator.ofInt(r0)
            r5.c = r0
            r2 = 720(0x2d0, double:3.557E-321)
            r0.setDuration(r2)
            android.animation.ValueAnimator r0 = r5.c
            r0.setRepeatCount(r1)
            android.animation.ValueAnimator r0 = r5.c
            android.view.animation.AccelerateDecelerateInterpolator r1 = new android.view.animation.AccelerateDecelerateInterpolator
            r1.<init>()
            r0.setInterpolator(r1)
            return
    }

    public void c() {
            r1 = this;
            android.animation.ValueAnimator r0 = r1.c
            if (r0 == 0) goto L7
            r0.start()
        L7:
            return
    }

    public void d() {
            r1 = this;
            android.animation.ValueAnimator r0 = r1.c
            if (r0 == 0) goto Lf
            boolean r0 = r0.isRunning()
            if (r0 == 0) goto Lf
            android.animation.ValueAnimator r0 = r1.c
            r0.cancel()
        Lf:
            return
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
            r2 = this;
            super.onAttachedToWindow()
            android.animation.ValueAnimator r0 = r2.c
            com.scwang.smartrefresh.layout.header.bezierradar.RoundProgressView$a r1 = new com.scwang.smartrefresh.layout.header.bezierradar.RoundProgressView$a
            r1.<init>(r2)
            r0.addUpdateListener(r1)
            return
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
            r1 = this;
            super.onDetachedFromWindow()
            android.animation.ValueAnimator r0 = r1.c
            r0.removeAllUpdateListeners()
            return
    }

    @Override // android.view.View
    protected void onDraw(android.graphics.Canvas r10) {
            r9 = this;
            super.onDraw(r10)
            int r1 = r9.getWidth()
            int r2 = r9.getHeight()
            boolean r3 = r9.isInEditMode()
            if (r3 == 0) goto L18
            r3 = 0
            r9.e = r3
            r3 = 270(0x10e, float:3.78E-43)
            r9.d = r3
        L18:
            android.graphics.Paint r3 = r9.a
            android.graphics.Paint$Style r4 = android.graphics.Paint.Style.FILL
            r3.setStyle(r4)
            int r6 = r1 / 2
            float r1 = (float) r6
            int r7 = r2 / 2
            float r2 = (float) r7
            int r3 = r9.f
            float r3 = (float) r3
            android.graphics.Paint r5 = r9.a
            r10.drawCircle(r1, r2, r3, r5)
            android.graphics.Paint r3 = r9.a
            android.graphics.Paint$Style r8 = android.graphics.Paint.Style.STROKE
            r3.setStyle(r8)
            int r3 = r9.f
            int r5 = r9.g
            int r3 = r3 + r5
            float r3 = (float) r3
            android.graphics.Paint r5 = r9.a
            r10.drawCircle(r1, r2, r3, r5)
            android.graphics.Paint r1 = r9.b
            r1.setStyle(r4)
            android.graphics.RectF r1 = r9.h
            int r2 = r9.f
            int r3 = r6 - r2
            float r3 = (float) r3
            int r4 = r7 - r2
            float r4 = (float) r4
            int r5 = r6 + r2
            float r5 = (float) r5
            int r2 = r2 + r7
            float r2 = (float) r2
            r1.set(r3, r4, r5, r2)
            android.graphics.RectF r1 = r9.h
            int r2 = r9.e
            float r2 = (float) r2
            int r3 = r9.d
            float r3 = (float) r3
            r4 = 1
            android.graphics.Paint r5 = r9.b
            r0 = r10
            r0.drawArc(r1, r2, r3, r4, r5)
            int r0 = r9.f
            int r1 = r9.g
            int r0 = r0 + r1
            r9.f = r0
            android.graphics.Paint r0 = r9.b
            r0.setStyle(r8)
            android.graphics.RectF r0 = r9.h
            int r1 = r9.f
            int r2 = r6 - r1
            float r2 = (float) r2
            int r3 = r7 - r1
            float r3 = (float) r3
            int r6 = r6 + r1
            float r4 = (float) r6
            int r7 = r7 + r1
            float r1 = (float) r7
            r0.set(r2, r3, r4, r1)
            android.graphics.RectF r1 = r9.h
            int r0 = r9.e
            float r2 = (float) r0
            int r0 = r9.d
            float r3 = (float) r0
            r4 = 0
            android.graphics.Paint r5 = r9.b
            r0 = r10
            r0.drawArc(r1, r2, r3, r4, r5)
            int r0 = r9.f
            int r1 = r9.g
            int r0 = r0 - r1
            r9.f = r0
            return
    }

    @Override // android.view.View
    protected void onMeasure(int r2, int r3) {
            r1 = this;
            int r0 = r1.getSuggestedMinimumWidth()
            int r2 = android.view.View.resolveSize(r0, r2)
            int r0 = r1.getSuggestedMinimumHeight()
            int r3 = android.view.View.resolveSize(r0, r3)
            r1.setMeasuredDimension(r2, r3)
            return
    }

    public void setBackColor(@androidx.annotation.ColorInt int r3) {
            r2 = this;
            android.graphics.Paint r0 = r2.b
            r1 = 16777215(0xffffff, float:2.3509886E-38)
            r3 = r3 & r1
            r1 = 1426063360(0x55000000, float:8.796093E12)
            r3 = r3 | r1
            r0.setColor(r3)
            return
    }

    public void setFrontColor(@androidx.annotation.ColorInt int r2) {
            r1 = this;
            android.graphics.Paint r0 = r1.a
            r0.setColor(r2)
            return
    }
}
