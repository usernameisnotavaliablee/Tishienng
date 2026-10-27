package com.scwang.smartrefresh.layout.header.bezierradar;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class RippleView extends android.view.View {
    private int a;
    private android.graphics.Paint b;
    private android.animation.ValueAnimator c;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements android.animation.ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ com.scwang.smartrefresh.layout.header.bezierradar.RippleView a;

        a(com.scwang.smartrefresh.layout.header.bezierradar.RippleView r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(android.animation.ValueAnimator r2) {
                r1 = this;
                com.scwang.smartrefresh.layout.header.bezierradar.RippleView r0 = r1.a
                java.lang.Object r2 = r2.getAnimatedValue()
                java.lang.Integer r2 = (java.lang.Integer) r2
                int r2 = r2.intValue()
                com.scwang.smartrefresh.layout.header.bezierradar.RippleView.a(r0, r2)
                com.scwang.smartrefresh.layout.header.bezierradar.RippleView r2 = r1.a
                r2.invalidate()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b extends android.animation.AnimatorListenerAdapter {
        final /* synthetic */ com.scwang.smartrefresh.layout.header.bezierradar.RippleView a;

        b(com.scwang.smartrefresh.layout.header.bezierradar.RippleView r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator r1) {
                r0 = this;
                return
        }
    }

    public RippleView(android.content.Context r2) {
            r1 = this;
            r1.<init>(r2)
            android.graphics.Paint r2 = new android.graphics.Paint
            r2.<init>()
            r1.b = r2
            r0 = 1
            r2.setAntiAlias(r0)
            android.graphics.Paint r2 = r1.b
            r0 = -1
            r2.setColor(r0)
            android.graphics.Paint r2 = r1.b
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.FILL
            r2.setStyle(r0)
            return
    }

    static /* synthetic */ int a(com.scwang.smartrefresh.layout.header.bezierradar.RippleView r0, int r1) {
            r0.a = r1
            return r1
    }

    public void b() {
            r6 = this;
            android.animation.ValueAnimator r0 = r6.c
            if (r0 != 0) goto L42
            int r0 = r6.getHeight()
            double r0 = (double) r0
            r2 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r0 = java.lang.Math.pow(r0, r2)
            int r4 = r6.getWidth()
            double r4 = (double) r4
            double r2 = java.lang.Math.pow(r4, r2)
            double r0 = r0 + r2
            double r0 = java.lang.Math.sqrt(r0)
            int r0 = (int) r0
            r1 = 0
            int[] r0 = new int[]{r1, r0}
            android.animation.ValueAnimator r0 = android.animation.ValueAnimator.ofInt(r0)
            r6.c = r0
            r1 = 400(0x190, double:1.976E-321)
            r0.setDuration(r1)
            android.animation.ValueAnimator r0 = r6.c
            com.scwang.smartrefresh.layout.header.bezierradar.RippleView$a r1 = new com.scwang.smartrefresh.layout.header.bezierradar.RippleView$a
            r1.<init>(r6)
            r0.addUpdateListener(r1)
            android.animation.ValueAnimator r0 = r6.c
            com.scwang.smartrefresh.layout.header.bezierradar.RippleView$b r1 = new com.scwang.smartrefresh.layout.header.bezierradar.RippleView$b
            r1.<init>(r6)
            r0.addListener(r1)
        L42:
            android.animation.ValueAnimator r0 = r6.c
            r0.start()
            return
    }

    @Override // android.view.View
    protected void onDraw(android.graphics.Canvas r5) {
            r4 = this;
            super.onDraw(r5)
            int r0 = r4.getWidth()
            int r0 = r0 / 2
            float r0 = (float) r0
            int r1 = r4.getHeight()
            int r1 = r1 / 2
            float r1 = (float) r1
            int r2 = r4.a
            float r2 = (float) r2
            android.graphics.Paint r3 = r4.b
            r5.drawCircle(r0, r1, r2, r3)
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

    public void setFrontColor(@androidx.annotation.ColorInt int r2) {
            r1 = this;
            android.graphics.Paint r0 = r1.b
            r0.setColor(r2)
            return
    }
}
