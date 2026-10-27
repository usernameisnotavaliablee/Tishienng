package com.bxkj.base.view;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class CountDownTimeView extends android.view.View {
    private float a;
    private float b;
    private java.lang.String c;
    private float d;
    private float e;
    private float f;
    private int g;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements android.animation.ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ com.bxkj.base.view.CountDownTimeView a;

        a(com.bxkj.base.view.CountDownTimeView r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(android.animation.ValueAnimator r2) {
                r1 = this;
                com.bxkj.base.view.CountDownTimeView r0 = r1.a
                java.lang.Object r2 = r2.getAnimatedValue()
                java.lang.Float r2 = (java.lang.Float) r2
                float r2 = r2.floatValue()
                com.bxkj.base.view.CountDownTimeView.a(r0, r2)
                com.bxkj.base.view.CountDownTimeView r2 = r1.a
                r2.invalidate()
                return
        }
    }

    public CountDownTimeView(android.content.Context r2) {
            r1 = this;
            r1.<init>(r2)
            r2 = 1092616192(0x41200000, float:10.0)
            r1.a = r2
            r2 = 0
            r1.b = r2
            java.lang.String r0 = "0"
            r1.c = r0
            r0 = 1132920832(0x43870000, float:270.0)
            r1.d = r0
            r0 = 1135869952(0x43b40000, float:360.0)
            r1.e = r0
            r1.f = r2
            r2 = 0
            r1.g = r2
            return
    }

    public CountDownTimeView(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r1 = 1092616192(0x41200000, float:10.0)
            r0.a = r1
            r1 = 0
            r0.b = r1
            java.lang.String r2 = "0"
            r0.c = r2
            r2 = 1132920832(0x43870000, float:270.0)
            r0.d = r2
            r2 = 1135869952(0x43b40000, float:360.0)
            r0.e = r2
            r0.f = r1
            r1 = 0
            r0.g = r1
            return
    }

    public CountDownTimeView(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r1 = 1092616192(0x41200000, float:10.0)
            r0.a = r1
            r1 = 0
            r0.b = r1
            java.lang.String r2 = "0"
            r0.c = r2
            r2 = 1132920832(0x43870000, float:270.0)
            r0.d = r2
            r2 = 1135869952(0x43b40000, float:360.0)
            r0.e = r2
            r0.f = r1
            r1 = 0
            r0.g = r1
            return
    }

    static /* bridge */ /* synthetic */ void a(com.bxkj.base.view.CountDownTimeView r0, float r1) {
            r0.f = r1
            return
    }

    private int b(float r3) {
            r2 = this;
            android.content.Context r0 = r2.getContext()
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r0 = r0 * r3
            r1 = 0
            int r3 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r3 < 0) goto L17
            r3 = 1
            goto L18
        L17:
            r3 = -1
        L18:
            float r3 = (float) r3
            r1 = 1056964608(0x3f000000, float:0.5)
            float r3 = r3 * r1
            float r0 = r0 + r3
            int r3 = (int) r0
            return r3
    }

    private void c(android.graphics.Canvas r7, android.graphics.RectF r8) {
            r6 = this;
            android.graphics.Paint r5 = new android.graphics.Paint
            r5.<init>()
            android.graphics.Paint$Join r0 = android.graphics.Paint.Join.ROUND
            r5.setStrokeJoin(r0)
            android.graphics.Paint$Cap r0 = android.graphics.Paint.Cap.ROUND
            r5.setStrokeCap(r0)
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.STROKE
            r5.setStyle(r0)
            r0 = 1
            r5.setAntiAlias(r0)
            float r0 = r6.a
            r5.setStrokeWidth(r0)
            android.content.res.Resources r0 = r6.getResources()
            int r1 = com.bxkj.base.R.color.color_red
            int r0 = r0.getColor(r1)
            r5.setColor(r0)
            float r2 = r6.d
            float r3 = r6.f
            r4 = 0
            r0 = r7
            r1 = r8
            r0.drawArc(r1, r2, r3, r4, r5)
            return
    }

    private void d(android.graphics.Canvas r7, android.graphics.RectF r8) {
            r6 = this;
            android.graphics.Paint r5 = new android.graphics.Paint
            r5.<init>()
            android.content.res.Resources r0 = r6.getResources()
            int r1 = com.bxkj.base.R.color.yellow
            int r0 = r0.getColor(r1)
            r5.setColor(r0)
            android.graphics.Paint$Join r0 = android.graphics.Paint.Join.ROUND
            r5.setStrokeJoin(r0)
            android.graphics.Paint$Cap r0 = android.graphics.Paint.Cap.ROUND
            r5.setStrokeCap(r0)
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.STROKE
            r5.setStyle(r0)
            r0 = 1
            r5.setAntiAlias(r0)
            float r0 = r6.a
            r5.setStrokeWidth(r0)
            float r2 = r6.d
            float r3 = r6.e
            r4 = 0
            r0 = r7
            r1 = r8
            r0.drawArc(r1, r2, r3, r4, r5)
            return
    }

    private void e(android.graphics.Canvas r6, float r7) {
            r5 = this;
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            android.graphics.Paint$Align r1 = android.graphics.Paint.Align.CENTER
            r0.setTextAlign(r1)
            r1 = 1
            r0.setAntiAlias(r1)
            float r1 = r5.b
            r0.setTextSize(r1)
            android.graphics.Typeface r1 = android.graphics.Typeface.SANS_SERIF
            r2 = 0
            android.graphics.Typeface r1 = android.graphics.Typeface.create(r1, r2)
            r0.setTypeface(r1)
            android.content.res.Resources r1 = r5.getResources()
            int r3 = com.bxkj.base.R.color.color_red
            int r1 = r1.getColor(r3)
            r0.setColor(r1)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            java.lang.String r3 = r5.c
            int r4 = r3.length()
            r0.getTextBounds(r3, r2, r4, r1)
            java.lang.String r2 = r5.c
            int r3 = r5.getHeight()
            int r3 = r3 / 2
            int r1 = r1.height()
            int r1 = r1 / 2
            int r3 = r3 + r1
            float r1 = (float) r3
            r6.drawText(r2, r7, r1, r0)
            return
    }

    private void f(android.graphics.Canvas r6, float r7) {
            r5 = this;
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            r1 = 1098907648(0x41800000, float:16.0)
            int r1 = r5.b(r1)
            float r1 = (float) r1
            r0.setTextSize(r1)
            android.graphics.Paint$Align r1 = android.graphics.Paint.Align.CENTER
            r0.setTextAlign(r1)
            r1 = 1
            r0.setAntiAlias(r1)
            android.content.res.Resources r1 = r5.getResources()
            int r2 = com.bxkj.base.R.color.color_red
            int r1 = r1.getColor(r2)
            r0.setColor(r1)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            java.lang.String r2 = "步数"
            r3 = 0
            r4 = 2
            r0.getTextBounds(r2, r3, r4, r1)
            int r3 = r5.getHeight()
            int r3 = r3 / r4
            int r1 = r1.height()
            int r3 = r3 + r1
            float r1 = r5.b
            int r1 = r5.g(r1)
            int r3 = r3 + r1
            float r1 = (float) r3
            r6.drawText(r2, r7, r1, r0)
            return
    }

    private void h(float r3, float r4, int r5) {
            r2 = this;
            r0 = 2
            float[] r0 = new float[r0]
            r1 = 0
            r0[r1] = r3
            r3 = 1
            r0[r3] = r4
            android.animation.ValueAnimator r3 = android.animation.ValueAnimator.ofFloat(r0)
            long r4 = (long) r5
            r3.setDuration(r4)
            float r4 = r2.f
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            r3.setTarget(r4)
            com.bxkj.base.view.CountDownTimeView$a r4 = new com.bxkj.base.view.CountDownTimeView$a
            r4.<init>(r2)
            r3.addUpdateListener(r4)
            r3.start()
            return
    }

    public int g(float r5) {
            r4 = this;
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            r0.setTextSize(r5)
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>()
            java.lang.String r1 = r4.c
            r2 = 0
            int r3 = r1.length()
            r0.getTextBounds(r1, r2, r3, r5)
            int r5 = r5.height()
            return r5
    }

    public void i(int r3, int r4) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            java.lang.String r1 = ""
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r2.c = r0
            if (r4 <= r3) goto L16
            r4 = r3
        L16:
            float r4 = (float) r4
            float r3 = (float) r3
            float r4 = r4 / r3
            float r3 = r2.e
            float r4 = r4 * r3
            r3 = 0
            int r0 = r2.g
            r2.h(r3, r4, r0)
            return
    }

    @Override // android.view.View
    protected void onDraw(android.graphics.Canvas r7) {
            r6 = this;
            super.onDraw(r7)
            int r0 = r6.getWidth()
            int r0 = r0 / 2
            float r0 = (float) r0
            android.graphics.RectF r1 = new android.graphics.RectF
            float r2 = r6.a
            r3 = 0
            float r3 = r3 + r2
            r4 = 1073741824(0x40000000, float:2.0)
            float r4 = r4 * r0
            float r5 = r4 - r2
            float r4 = r4 - r2
            r1.<init>(r3, r2, r5, r4)
            r6.d(r7, r1)
            r6.c(r7, r1)
            r6.e(r7, r0)
            return
    }

    public void setText(java.lang.String r1) {
            r0 = this;
            r0.c = r1
            return
    }

    public void setTextSize(int r1) {
            r0 = this;
            float r1 = (float) r1
            r0.b = r1
            return
    }
}
