package com.kwad.components.ad.splashscreen.widget;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class KsSplashSlidePathView extends android.widget.ImageView {
    private android.graphics.Path Li;
    private android.graphics.Paint Lj;
    private float Lk;
    private float Ll;
    private float Lm;
    private float Ln;
    private int Lo;
    private com.kwad.components.ad.splashscreen.widget.KsSplashSlidePathView.a Lp;
    private android.view.GestureDetector Lq;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface a {
        void a(float r1, float r2, float r3, float r4);

        void c(android.view.MotionEvent r1);
    }

    public KsSplashSlidePathView(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            java.lang.String r1 = "#66ffffff"
            int r1 = android.graphics.Color.parseColor(r1)
            r0.Lo = r1
            r0.init()
            return
    }

    public KsSplashSlidePathView(android.content.Context r1, @androidx.annotation.Nullable android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            java.lang.String r1 = "#66ffffff"
            int r1 = android.graphics.Color.parseColor(r1)
            r0.Lo = r1
            r0.init()
            return
    }

    static /* synthetic */ com.kwad.components.ad.splashscreen.widget.KsSplashSlidePathView.a a(com.kwad.components.ad.splashscreen.widget.KsSplashSlidePathView r0) {
            com.kwad.components.ad.splashscreen.widget.KsSplashSlidePathView$a r0 = r0.Lp
            return r0
    }

    private void b(float r7, float r8) {
            r6 = this;
            float r0 = r6.Lm
            float r0 = r7 - r0
            float r0 = java.lang.Math.abs(r0)
            float r1 = r6.Ln
            float r1 = r8 - r1
            float r1 = java.lang.Math.abs(r1)
            r2 = 1077936128(0x40400000, float:3.0)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L1c
            int r0 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r0 < 0) goto L1b
            goto L1c
        L1b:
            return
        L1c:
            android.graphics.Path r0 = r6.Li
            float r1 = r6.Lm
            float r2 = r6.Ln
            float r3 = r7 + r1
            r4 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 / r4
            float r5 = r8 + r2
            float r5 = r5 / r4
            r0.quadTo(r1, r2, r3, r5)
            r6.Lm = r7
            r6.Ln = r8
            return
    }

    private void d(android.view.MotionEvent r5) {
            r4 = this;
            android.view.GestureDetector r0 = r4.Lq
            boolean r0 = r0.onTouchEvent(r5)
            if (r0 == 0) goto L9
            goto L40
        L9:
            int r0 = r5.getActionMasked()
            if (r0 == 0) goto L41
            r1 = 1
            if (r0 == r1) goto L25
            r1 = 2
            if (r0 == r1) goto L16
            goto L40
        L16:
            float r0 = r5.getX()
            float r5 = r5.getY()
            r4.b(r0, r5)
            r4.invalidate()
            return
        L25:
            android.graphics.Path r0 = r4.Li
            r0.reset()
            r4.invalidate()
            com.kwad.components.ad.splashscreen.widget.KsSplashSlidePathView$a r0 = r4.Lp
            if (r0 == 0) goto L40
            float r1 = r4.Lk
            float r2 = r4.Ll
            float r3 = r5.getX()
            float r5 = r5.getY()
            r0.a(r1, r2, r3, r5)
        L40:
            return
        L41:
            android.graphics.Path r0 = r4.Li
            r0.reset()
            float r0 = r5.getX()
            r4.Lk = r0
            float r5 = r5.getY()
            r4.Ll = r5
            float r0 = r4.Lk
            r4.Lm = r0
            r4.Ln = r5
            android.graphics.Path r1 = r4.Li
            r1.moveTo(r0, r5)
            r4.invalidate()
            return
    }

    private void init() {
            r3 = this;
            android.graphics.Path r0 = new android.graphics.Path
            r0.<init>()
            r3.Li = r0
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            r3.Lj = r0
            android.graphics.Paint$Cap r1 = android.graphics.Paint.Cap.ROUND
            r0.setStrokeCap(r1)
            android.graphics.Paint r0 = r3.Lj
            android.content.Context r1 = r3.getContext()
            r2 = 1097859072(0x41700000, float:15.0)
            int r1 = com.kwad.sdk.c.a.a.a(r1, r2)
            float r1 = (float) r1
            r0.setStrokeWidth(r1)
            android.graphics.Paint r0 = r3.Lj
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.STROKE
            r0.setStyle(r1)
            android.graphics.Paint r0 = r3.Lj
            int r1 = r3.Lo
            r0.setColor(r1)
            android.graphics.Paint r0 = r3.Lj
            r1 = 1
            r0.setDither(r1)
            android.view.GestureDetector r0 = new android.view.GestureDetector
            com.kwad.components.ad.splashscreen.widget.KsSplashSlidePathView$1 r1 = new com.kwad.components.ad.splashscreen.widget.KsSplashSlidePathView$1
            r1.<init>(r3)
            r0.<init>(r1)
            r3.Lq = r0
            return
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(android.graphics.Canvas r3) {
            r2 = this;
            super.onDraw(r3)
            android.graphics.Path r0 = r2.Li
            android.graphics.Paint r1 = r2.Lj
            r3.drawPath(r0, r1)
            return
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent r1) {
            r0 = this;
            r0.d(r1)
            r1 = 1
            return r1
    }

    public void setOnSlideTouchListener(com.kwad.components.ad.splashscreen.widget.KsSplashSlidePathView.a r1) {
            r0 = this;
            r0.Lp = r1
            return
    }
}
