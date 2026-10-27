package com.bxkj.student.v2.common.view;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class CircleProgressView extends android.view.View {
    private float a;
    private float b;
    private java.lang.String c;
    private float d;
    private float e;
    private float f;
    private int g;
    private int h;
    private float i;
    private float j;
    private float k;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements android.animation.ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ com.bxkj.student.v2.common.view.CircleProgressView a;

        a(com.bxkj.student.v2.common.view.CircleProgressView r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(android.animation.ValueAnimator r2) {
                r1 = this;
                com.bxkj.student.v2.common.view.CircleProgressView r0 = r1.a
                java.lang.Object r2 = r2.getAnimatedValue()
                java.lang.Float r2 = (java.lang.Float) r2
                float r2 = r2.floatValue()
                com.bxkj.student.v2.common.view.CircleProgressView.a(r0, r2)
                com.bxkj.student.v2.common.view.CircleProgressView r2 = r1.a
                r2.invalidate()
                return
        }
    }

    public CircleProgressView(android.content.Context r2) {
            r1 = this;
            r1.<init>(r2)
            r2 = 1094713344(0x41400000, float:12.0)
            int r2 = r1.b(r2)
            float r2 = (float) r2
            r1.a = r2
            r2 = 0
            r1.b = r2
            java.lang.String r0 = "0"
            r1.c = r0
            r0 = 1127481344(0x43340000, float:180.0)
            r1.d = r0
            r0 = 1135869952(0x43b40000, float:360.0)
            r1.e = r0
            r1.f = r2
            r0 = 500(0x1f4, float:7.0E-43)
            r1.g = r0
            r0 = -16776961(0xffffffffff0000ff, float:-1.7014636E38)
            r1.h = r0
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1.i = r0
            r1.j = r2
            r1.k = r2
            return
    }

    public CircleProgressView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r1.<init>(r2, r3)
            r2 = 1094713344(0x41400000, float:12.0)
            int r2 = r1.b(r2)
            float r2 = (float) r2
            r1.a = r2
            r2 = 0
            r1.b = r2
            java.lang.String r0 = "0"
            r1.c = r0
            r0 = 1127481344(0x43340000, float:180.0)
            r1.d = r0
            r0 = 1135869952(0x43b40000, float:360.0)
            r1.e = r0
            r1.f = r2
            r0 = 500(0x1f4, float:7.0E-43)
            r1.g = r0
            r0 = -16776961(0xffffffffff0000ff, float:-1.7014636E38)
            r1.h = r0
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1.i = r0
            r1.j = r2
            r1.k = r2
            r1.h(r3)
            return
    }

    public CircleProgressView(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r1 = 1094713344(0x41400000, float:12.0)
            int r1 = r0.b(r1)
            float r1 = (float) r1
            r0.a = r1
            r1 = 0
            r0.b = r1
            java.lang.String r3 = "0"
            r0.c = r3
            r3 = 1127481344(0x43340000, float:180.0)
            r0.d = r3
            r3 = 1135869952(0x43b40000, float:360.0)
            r0.e = r3
            r0.f = r1
            r3 = 500(0x1f4, float:7.0E-43)
            r0.g = r3
            r3 = -16776961(0xffffffffff0000ff, float:-1.7014636E38)
            r0.h = r3
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0.i = r3
            r0.j = r1
            r0.k = r1
            r0.h(r2)
            return
    }

    static /* bridge */ /* synthetic */ void a(com.bxkj.student.v2.common.view.CircleProgressView r0, float r1) {
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
            int r0 = r6.h
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
            java.lang.String r0 = "#e2e2e2"
            int r0 = android.graphics.Color.parseColor(r0)
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
            r3 = 2131099718(0x7f060046, float:1.7811797E38)
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

    private void f(android.graphics.Canvas r5, float r6) {
            r4 = this;
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            r1 = 1098907648(0x41800000, float:16.0)
            int r1 = r4.b(r1)
            float r1 = (float) r1
            r0.setTextSize(r1)
            android.graphics.Paint$Align r1 = android.graphics.Paint.Align.CENTER
            r0.setTextAlign(r1)
            r1 = 1
            r0.setAntiAlias(r1)
            android.content.res.Resources r1 = r4.getResources()
            r2 = 2131099816(0x7f0600a8, float:1.7811996E38)
            int r1 = r1.getColor(r2)
            r0.setColor(r1)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r2 = 0
            java.lang.String r3 = ""
            r0.getTextBounds(r3, r2, r2, r1)
            int r2 = r4.getHeight()
            int r2 = r2 / 2
            int r1 = r1.height()
            int r2 = r2 + r1
            float r1 = r4.b
            int r1 = r4.g(r1)
            int r2 = r2 + r1
            float r1 = (float) r2
            r5.drawText(r3, r6, r1, r0)
            return
    }

    private void h(android.util.AttributeSet r4) {
            r3 = this;
            android.content.Context r0 = r3.getContext()
            int[] r1 = com.bxkj.student.R.styleable.StepArcView
            android.content.res.TypedArray r4 = r0.obtainStyledAttributes(r4, r1)
            android.content.res.Resources r0 = r3.getResources()
            r1 = 2131100710(0x7f060426, float:1.781381E38)
            int r0 = r0.getColor(r1)
            r1 = 1
            int r0 = r4.getColor(r1, r0)
            r3.h = r0
            r0 = 8
            r1 = 0
            int r0 = r4.getInt(r0, r1)
            float r0 = (float) r0
            r3.j = r0
            r0 = 6
            r2 = -1
            int r0 = r4.getInt(r0, r2)
            float r0 = (float) r0
            r3.i = r0
            r0 = 2
            int r0 = r4.getInt(r0, r1)
            float r0 = (float) r0
            r3.k = r0
            r0 = 7
            r1 = 180(0xb4, float:2.52E-43)
            int r4 = r4.getInt(r0, r1)
            float r4 = (float) r4
            r3.d = r4
            return
    }

    private void i(float r3, float r4, int r5) {
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
            com.bxkj.student.v2.common.view.CircleProgressView$a r4 = new com.bxkj.student.v2.common.view.CircleProgressView$a
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

    public com.bxkj.student.v2.common.view.CircleProgressView j(float r1) {
            r0 = this;
            r0.j = r1
            return r0
    }

    public com.bxkj.student.v2.common.view.CircleProgressView k(float r1) {
            r0 = this;
            r0.k = r1
            return r0
    }

    public com.bxkj.student.v2.common.view.CircleProgressView l(float r1) {
            r0 = this;
            r0.i = r1
            return r0
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
            r6.f(r7, r0)
            float r7 = r6.k
            r6.setCurrentCount(r7)
            return
    }

    public void setCurrentCount(float r6) {
            r5 = this;
            float r0 = r5.j
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 <= 0) goto L16
            float r2 = r5.i
            int r3 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r3 == 0) goto L15
            int r6 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r6 <= 0) goto L15
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L16
        L15:
            r6 = r0
        L16:
            float r2 = r5.e
            r3 = 0
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 == 0) goto L31
            java.lang.String r0 = r5.c
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            float r0 = r0.floatValue()
            float r2 = r5.j
            float r0 = r0 / r2
            float r4 = r5.e
            float r0 = r0 * r4
            float r2 = r6 / r2
            goto L36
        L31:
            r0 = 1065353216(0x3f800000, float:1.0)
            r0 = r2
            r2 = 1065353216(0x3f800000, float:1.0)
        L36:
            float r4 = r5.i
            int r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r4 == 0) goto L42
            int r1 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r1 != 0) goto L42
            r0 = 0
            goto L43
        L42:
            r3 = r2
        L43:
            float r1 = r5.e
            float r3 = r3 * r1
            int r1 = r5.g
            r5.i(r0, r3, r1)
            java.lang.String r6 = java.lang.String.valueOf(r6)
            r5.c = r6
            return
    }

    public void setTextSize(int r3) {
            r2 = this;
            java.lang.String r3 = java.lang.String.valueOf(r3)
            int r3 = r3.length()
            r0 = 4
            if (r3 > r0) goto L15
            r3 = 1112014848(0x42480000, float:50.0)
            int r3 = r2.b(r3)
            float r3 = (float) r3
            r2.b = r3
            return
        L15:
            r1 = 6
            if (r3 <= r0) goto L24
            if (r3 > r1) goto L24
            r3 = 1109393408(0x42200000, float:40.0)
            int r3 = r2.b(r3)
            float r3 = (float) r3
            r2.b = r3
            return
        L24:
            r0 = 8
            if (r3 <= r1) goto L34
            if (r3 > r0) goto L34
            r3 = 1106247680(0x41f00000, float:30.0)
            int r3 = r2.b(r3)
            float r3 = (float) r3
            r2.b = r3
            return
        L34:
            if (r3 <= r0) goto L3f
            r3 = 1103626240(0x41c80000, float:25.0)
            int r3 = r2.b(r3)
            float r3 = (float) r3
            r2.b = r3
        L3f:
            return
    }
}
