package com.scwang.smartrefresh.header.waterdrop;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class WaterDropView extends android.view.View {
    private static int g = 2;
    private static final int h = 180;
    private com.scwang.smartrefresh.header.waterdrop.a a;
    private com.scwang.smartrefresh.header.waterdrop.a b;
    private android.graphics.Path c;
    private android.graphics.Paint d;
    private int e;
    private int f;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements android.animation.ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ com.scwang.smartrefresh.header.waterdrop.WaterDropView a;

        a(com.scwang.smartrefresh.header.waterdrop.WaterDropView r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(android.animation.ValueAnimator r2) {
                r1 = this;
                com.scwang.smartrefresh.header.waterdrop.WaterDropView r0 = r1.a
                java.lang.Object r2 = r2.getAnimatedValue()
                java.lang.Float r2 = (java.lang.Float) r2
                float r2 = r2.floatValue()
                r0.d(r2)
                com.scwang.smartrefresh.header.waterdrop.WaterDropView r2 = r1.a
                r2.postInvalidate()
                return
        }
    }

    static {
            return
    }

    public WaterDropView(android.content.Context r2) {
            r1 = this;
            r1.<init>(r2)
            r0 = 0
            r1.b(r2, r0)
            return
    }

    public WaterDropView(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.b(r1, r2)
            return
    }

    public WaterDropView(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r0.b(r1, r2)
            return
    }

    private void b(android.content.Context r5, android.util.AttributeSet r6) {
            r4 = this;
            com.scwang.smartrefresh.header.waterdrop.a r5 = new com.scwang.smartrefresh.header.waterdrop.a
            r5.<init>()
            r4.a = r5
            com.scwang.smartrefresh.header.waterdrop.a r5 = new com.scwang.smartrefresh.header.waterdrop.a
            r5.<init>()
            r4.b = r5
            android.graphics.Path r5 = new android.graphics.Path
            r5.<init>()
            r4.c = r5
            android.graphics.Paint r5 = new android.graphics.Paint
            r5.<init>()
            r4.d = r5
            r6 = -7829368(0xffffffffff888888, float:NaN)
            r5.setColor(r6)
            android.graphics.Paint r5 = r4.d
            r0 = 1
            r5.setAntiAlias(r0)
            android.graphics.Paint r5 = r4.d
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.FILL_AND_STROKE
            r5.setStyle(r1)
            android.graphics.Paint r5 = r4.d
            r1 = 1056964608(0x3f000000, float:0.5)
            int r1 = com.scwang.smartrefresh.layout.util.c.b(r1)
            com.scwang.smartrefresh.header.waterdrop.WaterDropView.g = r1
            float r1 = (float) r1
            r5.setStrokeWidth(r1)
            android.graphics.Paint r5 = r4.d
            int r1 = com.scwang.smartrefresh.header.waterdrop.WaterDropView.g
            float r1 = (float) r1
            r2 = 0
            r3 = -872415232(0xffffffffcc000000, float:-3.3554432E7)
            r5.setShadowLayer(r1, r2, r2, r3)
            r5 = 0
            r4.setLayerType(r0, r5)
            int r5 = com.scwang.smartrefresh.header.waterdrop.WaterDropView.g
            int r5 = r5 * 4
            r4.setPadding(r5, r5, r5, r5)
            android.graphics.Paint r5 = r4.d
            r5.setColor(r6)
            r5 = 1101004800(0x41a00000, float:20.0)
            int r5 = com.scwang.smartrefresh.layout.util.c.b(r5)
            r4.e = r5
            int r6 = r5 / 5
            r4.f = r6
            com.scwang.smartrefresh.header.waterdrop.a r6 = r4.a
            float r0 = (float) r5
            r6.c = r0
            com.scwang.smartrefresh.header.waterdrop.a r0 = r4.b
            float r1 = (float) r5
            r0.c = r1
            int r1 = com.scwang.smartrefresh.header.waterdrop.WaterDropView.g
            int r2 = r1 + r5
            float r2 = (float) r2
            r6.a = r2
            int r2 = r1 + r5
            float r2 = (float) r2
            r6.b = r2
            int r6 = r1 + r5
            float r6 = (float) r6
            r0.a = r6
            int r1 = r1 + r5
            float r5 = (float) r1
            r0.b = r5
            return
    }

    private void c() {
            r13 = this;
            android.graphics.Path r0 = r13.c
            r0.reset()
            android.graphics.Path r0 = r13.c
            com.scwang.smartrefresh.header.waterdrop.a r1 = r13.a
            float r2 = r1.a
            float r3 = r1.b
            float r1 = r1.c
            android.graphics.Path$Direction r4 = android.graphics.Path.Direction.CCW
            r0.addCircle(r2, r3, r1, r4)
            com.scwang.smartrefresh.header.waterdrop.a r0 = r13.b
            float r0 = r0.b
            com.scwang.smartrefresh.header.waterdrop.a r1 = r13.a
            float r1 = r1.b
            r2 = 1065353216(0x3f800000, float:1.0)
            int r2 = com.scwang.smartrefresh.layout.util.c.b(r2)
            float r2 = (float) r2
            float r1 = r1 + r2
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto Ld4
            android.graphics.Path r0 = r13.c
            com.scwang.smartrefresh.header.waterdrop.a r1 = r13.b
            float r2 = r1.a
            float r3 = r1.b
            float r1 = r1.c
            r0.addCircle(r2, r3, r1, r4)
            double r0 = r13.getAngle()
            com.scwang.smartrefresh.header.waterdrop.a r2 = r13.a
            float r3 = r2.a
            double r3 = (double) r3
            float r2 = r2.c
            double r5 = (double) r2
            double r7 = java.lang.Math.cos(r0)
            double r5 = r5 * r7
            double r3 = r3 - r5
            float r2 = (float) r3
            com.scwang.smartrefresh.header.waterdrop.a r3 = r13.a
            float r4 = r3.b
            double r4 = (double) r4
            float r3 = r3.c
            double r6 = (double) r3
            double r8 = java.lang.Math.sin(r0)
            double r6 = r6 * r8
            double r4 = r4 + r6
            float r3 = (float) r4
            com.scwang.smartrefresh.header.waterdrop.a r4 = r13.a
            float r5 = r4.a
            double r5 = (double) r5
            float r4 = r4.c
            double r7 = (double) r4
            double r9 = java.lang.Math.cos(r0)
            double r7 = r7 * r9
            double r5 = r5 + r7
            float r4 = (float) r5
            com.scwang.smartrefresh.header.waterdrop.a r5 = r13.b
            float r6 = r5.a
            double r6 = (double) r6
            float r5 = r5.c
            double r8 = (double) r5
            double r10 = java.lang.Math.cos(r0)
            double r8 = r8 * r10
            double r6 = r6 - r8
            float r5 = (float) r6
            com.scwang.smartrefresh.header.waterdrop.a r6 = r13.b
            float r7 = r6.b
            double r7 = (double) r7
            float r6 = r6.c
            double r9 = (double) r6
            double r11 = java.lang.Math.sin(r0)
            double r9 = r9 * r11
            double r7 = r7 + r9
            float r6 = (float) r7
            com.scwang.smartrefresh.header.waterdrop.a r7 = r13.b
            float r8 = r7.a
            double r8 = (double) r8
            float r7 = r7.c
            double r10 = (double) r7
            double r0 = java.lang.Math.cos(r0)
            double r10 = r10 * r0
            double r8 = r8 + r10
            float r0 = (float) r8
            android.graphics.Path r1 = r13.c
            com.scwang.smartrefresh.header.waterdrop.a r7 = r13.a
            float r8 = r7.a
            float r7 = r7.b
            r1.moveTo(r8, r7)
            android.graphics.Path r1 = r13.c
            r1.lineTo(r2, r3)
            android.graphics.Path r1 = r13.c
            com.scwang.smartrefresh.header.waterdrop.a r2 = r13.b
            float r7 = r2.a
            float r8 = r2.c
            float r7 = r7 - r8
            float r2 = r2.b
            com.scwang.smartrefresh.header.waterdrop.a r8 = r13.a
            float r8 = r8.b
            float r2 = r2 + r8
            r8 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r8
            r1.quadTo(r7, r2, r5, r6)
            android.graphics.Path r1 = r13.c
            r1.lineTo(r0, r6)
            android.graphics.Path r0 = r13.c
            com.scwang.smartrefresh.header.waterdrop.a r1 = r13.b
            float r2 = r1.a
            float r5 = r1.c
            float r2 = r2 + r5
            float r1 = r1.b
            float r1 = r1 + r3
            float r1 = r1 / r8
            r0.quadTo(r2, r1, r4, r3)
        Ld4:
            android.graphics.Path r0 = r13.c
            r0.close()
            return
    }

    private double getAngle() {
            r5 = this;
            com.scwang.smartrefresh.header.waterdrop.a r0 = r5.b
            float r1 = r0.c
            com.scwang.smartrefresh.header.waterdrop.a r2 = r5.a
            float r3 = r2.c
            int r4 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r4 > 0) goto L19
            float r3 = r3 - r1
            float r0 = r0.b
            float r1 = r2.b
            float r0 = r0 - r1
            float r3 = r3 / r0
            double r0 = (double) r3
            double r0 = java.lang.Math.asin(r0)
            return r0
        L19:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "bottomCircle's radius must be less than the topCircle's"
            r0.<init>(r1)
            throw r0
    }

    public android.animation.Animator a() {
            r3 = this;
            r0 = 2
            float[] r0 = new float[r0]
            r0 = {x0022: FILL_ARRAY_DATA , data: [1065353216, 981668463} // fill-array
            android.animation.ValueAnimator r0 = android.animation.ValueAnimator.ofFloat(r0)
            r1 = 180(0xb4, double:8.9E-322)
            android.animation.ValueAnimator r0 = r0.setDuration(r1)
            android.view.animation.DecelerateInterpolator r1 = new android.view.animation.DecelerateInterpolator
            r1.<init>()
            r0.setInterpolator(r1)
            com.scwang.smartrefresh.header.waterdrop.WaterDropView$a r1 = new com.scwang.smartrefresh.header.waterdrop.WaterDropView$a
            r1.<init>(r3)
            r0.addUpdateListener(r1)
            return r0
    }

    public void d(float r8) {
            r7 = this;
            int r0 = r7.e
            double r1 = (double) r0
            r3 = 4598175219545276416(0x3fd0000000000000, double:0.25)
            double r5 = (double) r8
            double r5 = r5 * r3
            double r3 = (double) r0
            double r5 = r5 * r3
            double r1 = r1 - r5
            float r1 = (float) r1
            int r2 = r7.f
            int r2 = r2 - r0
            float r2 = (float) r2
            float r2 = r2 * r8
            float r3 = (float) r0
            float r2 = r2 + r3
            r3 = 1082130432(0x40800000, float:4.0)
            float r8 = r8 * r3
            float r0 = (float) r0
            float r8 = r8 * r0
            com.scwang.smartrefresh.header.waterdrop.a r0 = r7.a
            r0.c = r1
            com.scwang.smartrefresh.header.waterdrop.a r1 = r7.b
            r1.c = r2
            float r0 = r0.b
            float r0 = r0 + r8
            r1.b = r0
            return
    }

    public void e(int r9) {
            r8 = this;
            int r0 = r8.getPaddingTop()
            int r1 = r8.getPaddingBottom()
            int r2 = r8.e
            int r3 = r2 * 2
            int r3 = r3 + r0
            int r3 = r3 + r1
            float r3 = (float) r3
            float r4 = (float) r9
            int r5 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r5 >= 0) goto L23
            com.scwang.smartrefresh.header.waterdrop.a r9 = r8.a
            float r0 = (float) r2
            r9.c = r0
            com.scwang.smartrefresh.header.waterdrop.a r0 = r8.b
            float r1 = (float) r2
            r0.c = r1
            float r9 = r9.b
            r0.b = r9
            return
        L23:
            int r5 = r8.f
            int r2 = r2 - r5
            float r2 = (float) r2
            r5 = 0
            float r4 = r4 - r3
            float r3 = java.lang.Math.max(r5, r4)
            double r4 = (double) r2
            float r2 = -r3
            r3 = 1128792064(0x43480000, float:200.0)
            int r3 = com.scwang.smartrefresh.layout.util.c.b(r3)
            float r3 = (float) r3
            float r2 = r2 / r3
            double r2 = (double) r2
            r6 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r2 = java.lang.Math.pow(r6, r2)
            r6 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r6 = r6 - r2
            double r4 = r4 * r6
            float r2 = (float) r4
            com.scwang.smartrefresh.header.waterdrop.a r3 = r8.a
            int r4 = r8.e
            float r5 = (float) r4
            r6 = 1082130432(0x40800000, float:4.0)
            float r6 = r2 / r6
            float r5 = r5 - r6
            r3.c = r5
            com.scwang.smartrefresh.header.waterdrop.a r3 = r8.b
            float r4 = (float) r4
            float r4 = r4 - r2
            r3.c = r4
            int r9 = r9 - r0
            int r9 = r9 - r1
            float r9 = (float) r9
            float r9 = r9 - r4
            r3.b = r9
            return
    }

    public void f(int r1, int r2) {
            r0 = this;
            return
    }

    public com.scwang.smartrefresh.header.waterdrop.a getBottomCircle() {
            r1 = this;
            com.scwang.smartrefresh.header.waterdrop.a r0 = r1.b
            return r0
    }

    public int getIndicatorColor() {
            r1 = this;
            android.graphics.Paint r0 = r1.d
            int r0 = r0.getColor()
            return r0
    }

    public int getMaxCircleRadius() {
            r1 = this;
            int r0 = r1.e
            return r0
    }

    public com.scwang.smartrefresh.header.waterdrop.a getTopCircle() {
            r1 = this;
            com.scwang.smartrefresh.header.waterdrop.a r0 = r1.a
            return r0
    }

    @Override // android.view.View
    protected void onDraw(android.graphics.Canvas r8) {
            r7 = this;
            super.onDraw(r8)
            int r0 = r7.getPaddingTop()
            int r1 = r7.getPaddingLeft()
            int r2 = r7.getPaddingBottom()
            int r3 = r7.getHeight()
            r8.save()
            float r3 = (float) r3
            com.scwang.smartrefresh.header.waterdrop.a r4 = r7.a
            float r4 = r4.c
            r5 = 1073741824(0x40000000, float:2.0)
            float r6 = r4 * r5
            float r0 = (float) r0
            float r6 = r6 + r0
            float r2 = (float) r2
            float r6 = r6 + r2
            int r6 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r6 > 0) goto L3d
            float r0 = (float) r1
            float r4 = r4 * r5
            float r3 = r3 - r4
            float r3 = r3 - r2
            r8.translate(r0, r3)
            com.scwang.smartrefresh.header.waterdrop.a r0 = r7.a
            float r1 = r0.a
            float r2 = r0.b
            float r0 = r0.c
            android.graphics.Paint r3 = r7.d
            r8.drawCircle(r1, r2, r0, r3)
            goto L4b
        L3d:
            float r1 = (float) r1
            r8.translate(r1, r0)
            r7.c()
            android.graphics.Path r0 = r7.c
            android.graphics.Paint r1 = r7.d
            r8.drawPath(r0, r1)
        L4b:
            r8.restore()
            return
    }

    @Override // android.view.View
    protected void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            super.onLayout(r1, r2, r3, r4, r5)
            r1 = r0
            int r2 = r0.getHeight()
            r0.e(r2)
            return
    }

    @Override // android.view.View
    protected void onMeasure(int r4, int r5) {
            r3 = this;
            int r4 = r3.e
            int r0 = com.scwang.smartrefresh.header.waterdrop.WaterDropView.g
            int r4 = r4 + r0
            int r4 = r4 * 2
            com.scwang.smartrefresh.header.waterdrop.a r1 = r3.b
            float r2 = r1.b
            float r1 = r1.c
            float r2 = r2 + r1
            int r0 = r0 * 2
            float r0 = (float) r0
            float r2 = r2 + r0
            double r0 = (double) r2
            double r0 = java.lang.Math.ceil(r0)
            int r0 = (int) r0
            int r1 = r3.getPaddingLeft()
            int r4 = r4 + r1
            int r1 = r3.getPaddingRight()
            int r4 = r4 + r1
            int r1 = r3.getPaddingTop()
            int r0 = r0 + r1
            int r1 = r3.getPaddingBottom()
            int r0 = r0 + r1
            int r5 = android.view.View.resolveSize(r0, r5)
            r3.setMeasuredDimension(r4, r5)
            return
    }

    public void setIndicatorColor(@androidx.annotation.ColorInt int r2) {
            r1 = this;
            android.graphics.Paint r0 = r1.d
            r0.setColor(r2)
            return
    }
}
