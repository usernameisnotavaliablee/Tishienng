package com.scwang.smartrefresh.header.fungame;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public abstract class FunGameView extends com.scwang.smartrefresh.header.fungame.FunGameHeader {
    protected static final int G = 0;
    protected static final int H = 1;
    protected static final int I = 2;
    protected static final int J = 3;
    protected static final int K = 4;
    protected static final float L = 0.161f;
    public static java.lang.String M = "游戏结束";
    public static java.lang.String N = "玩个游戏解解闷";
    public static java.lang.String O = "刷新完成";
    public static java.lang.String P = "刷新失败";
    protected int A;
    protected int B;
    protected int C;
    protected int D;
    protected int E;
    protected int F;
    protected android.graphics.Paint w;
    protected android.text.TextPaint x;
    protected float y;
    protected int z;

    static {
            return
    }

    public FunGameView(android.content.Context r2) {
            r1 = this;
            r1.<init>(r2)
            r0 = 0
            r1.A = r0
            r0 = -10461088(0xffffffffff606060, float:-2.9824748E38)
            r1.F = r0
            r0 = 0
            r1.H(r2, r0)
            return
    }

    public FunGameView(android.content.Context r2, @androidx.annotation.Nullable android.util.AttributeSet r3) {
            r1 = this;
            r1.<init>(r2, r3)
            r0 = 0
            r1.A = r0
            r0 = -10461088(0xffffffffff606060, float:-2.9824748E38)
            r1.F = r0
            r1.H(r2, r3)
            return
    }

    public FunGameView(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r3 = 0
            r0.A = r3
            r3 = -10461088(0xffffffffff606060, float:-2.9824748E38)
            r0.F = r3
            r0.H(r1, r2)
            return
    }

    @androidx.annotation.RequiresApi(21)
    public FunGameView(android.content.Context r1, @androidx.annotation.Nullable android.util.AttributeSet r2, int r3, int r4) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            r3 = 0
            r0.A = r3
            r3 = -10461088(0xffffffffff606060, float:-2.9824748E38)
            r0.F = r3
            r0.H(r1, r2)
            return
    }

    private void H(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            int[] r0 = com.scwang.smartrefresh.header.R.styleable.FunGameView
            android.content.res.TypedArray r2 = r2.obtainStyledAttributes(r3, r0)
            int r3 = com.scwang.smartrefresh.header.R.styleable.FunGameView_fgvBackColor
            r0 = 0
            int r3 = r2.getColor(r3, r0)
            r1.E = r3
            int r3 = com.scwang.smartrefresh.header.R.styleable.FunGameView_fgvLeftColor
            int r0 = android.graphics.Color.rgb(r0, r0, r0)
            int r3 = r2.getColor(r3, r0)
            r1.B = r3
            int r3 = com.scwang.smartrefresh.header.R.styleable.FunGameView_fgvMiddleColor
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            int r3 = r2.getColor(r3, r0)
            r1.D = r3
            int r3 = com.scwang.smartrefresh.header.R.styleable.FunGameView_fgvRightColor
            java.lang.String r0 = "#A5A5A5"
            int r0 = android.graphics.Color.parseColor(r0)
            int r3 = r2.getColor(r3, r0)
            r1.C = r3
            int r3 = com.scwang.smartrefresh.header.R.styleable.FunGameView_fgvTextGameOver
            boolean r0 = r2.hasValue(r3)
            if (r0 == 0) goto L41
            java.lang.String r0 = r2.getString(r3)
            com.scwang.smartrefresh.header.fungame.FunGameView.M = r0
        L41:
            boolean r0 = r2.hasValue(r3)
            if (r0 == 0) goto L4f
            int r0 = com.scwang.smartrefresh.header.R.styleable.FunGameView_fgvTextLoading
            java.lang.String r0 = r2.getString(r0)
            com.scwang.smartrefresh.header.fungame.FunGameView.N = r0
        L4f:
            boolean r3 = r2.hasValue(r3)
            if (r3 == 0) goto L5d
            int r3 = com.scwang.smartrefresh.header.R.styleable.FunGameView_fgvTextLoadingFinished
            java.lang.String r3 = r2.getString(r3)
            com.scwang.smartrefresh.header.fungame.FunGameView.O = r3
        L5d:
            r2.recycle()
            r1.Q()
            r1.P()
            r1.R()
            return
    }

    private void L(android.graphics.Canvas r9, int r10, int r11) {
            r8 = this;
            android.graphics.Paint r0 = r8.w
            int r1 = r8.E
            r0.setColor(r1)
            float r5 = (float) r10
            float r6 = (float) r11
            android.graphics.Paint r7 = r8.w
            r3 = 0
            r4 = 0
            r2 = r9
            r2.drawRect(r3, r4, r5, r6, r7)
            r9 = r6
            android.graphics.Paint r10 = r8.w
            int r11 = r8.F
            r10.setColor(r11)
            r6 = 0
            android.graphics.Paint r7 = r8.w
            r2.drawLine(r3, r4, r5, r6, r7)
            float r10 = r8.l
            float r4 = r9 - r10
            float r6 = r9 - r10
            android.graphics.Paint r7 = r8.w
            r2.drawLine(r3, r4, r5, r6, r7)
            return
    }

    private void N(android.graphics.Canvas r4, int r5, int r6) {
            r3 = this;
            int r0 = r3.A
            r1 = 1103626240(0x41c80000, float:25.0)
            if (r0 == 0) goto L45
            r2 = 1
            if (r0 == r2) goto L45
            r2 = 2
            if (r0 == r2) goto L35
            r1 = 3
            r2 = 1101004800(0x41a00000, float:20.0)
            if (r0 == r1) goto L25
            r1 = 4
            if (r0 == r1) goto L15
            return
        L15:
            android.text.TextPaint r0 = r3.x
            int r1 = com.scwang.smartrefresh.layout.util.c.b(r2)
            float r1 = (float) r1
            r0.setTextSize(r1)
            java.lang.String r0 = com.scwang.smartrefresh.header.fungame.FunGameView.P
            r3.U(r4, r0, r5, r6)
            return
        L25:
            android.text.TextPaint r0 = r3.x
            int r1 = com.scwang.smartrefresh.layout.util.c.b(r2)
            float r1 = (float) r1
            r0.setTextSize(r1)
            java.lang.String r0 = com.scwang.smartrefresh.header.fungame.FunGameView.O
            r3.U(r4, r0, r5, r6)
            return
        L35:
            android.text.TextPaint r0 = r3.x
            int r1 = com.scwang.smartrefresh.layout.util.c.b(r1)
            float r1 = (float) r1
            r0.setTextSize(r1)
            java.lang.String r0 = com.scwang.smartrefresh.header.fungame.FunGameView.M
            r3.U(r4, r0, r5, r6)
            return
        L45:
            android.text.TextPaint r0 = r3.x
            int r1 = com.scwang.smartrefresh.layout.util.c.b(r1)
            float r1 = (float) r1
            r0.setTextSize(r1)
            java.lang.String r0 = com.scwang.smartrefresh.header.fungame.FunGameView.N
            r3.U(r4, r0, r5, r6)
            return
    }

    private android.util.DisplayMetrics O(android.content.Context r2) {
            r1 = this;
            java.lang.String r0 = "window"
            java.lang.Object r2 = r2.getSystemService(r0)
            android.view.WindowManager r2 = (android.view.WindowManager) r2
            android.util.DisplayMetrics r0 = new android.util.DisplayMetrics
            r0.<init>()
            android.view.Display r2 = r2.getDefaultDisplay()
            r2.getMetrics(r0)
            return r0
    }

    private void U(android.graphics.Canvas r4, java.lang.String r5, int r6, int r7) {
            r3 = this;
            float r6 = (float) r6
            android.text.TextPaint r0 = r3.x
            float r0 = r0.measureText(r5)
            float r6 = r6 - r0
            r0 = 1056964608(0x3f000000, float:0.5)
            float r6 = r6 * r0
            float r7 = (float) r7
            float r7 = r7 * r0
            android.text.TextPaint r1 = r3.x
            float r1 = r1.ascent()
            android.text.TextPaint r2 = r3.x
            float r2 = r2.descent()
            float r1 = r1 + r2
            float r1 = r1 * r0
            float r7 = r7 - r1
            android.text.TextPaint r0 = r3.x
            r4.drawText(r5, r6, r7, r0)
            return
    }

    @Override // com.scwang.smartrefresh.header.fungame.FunGameHeader
    protected void I() {
            r1 = this;
            r0 = 1
            r1.T(r0)
            return
    }

    protected abstract void M(android.graphics.Canvas r1, int r2, int r3);

    protected void P() {
            r1 = this;
            float r0 = r1.l
            r1.y = r0
            return
    }

    protected void Q() {
            r3 = this;
            android.text.TextPaint r0 = new android.text.TextPaint
            r1 = 1
            r0.<init>(r1)
            r3.x = r0
            java.lang.String r2 = "#C1C2C2"
            int r2 = android.graphics.Color.parseColor(r2)
            r0.setColor(r2)
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>(r1)
            r3.w = r0
            float r1 = r3.l
            r0.setStrokeWidth(r1)
            return
    }

    protected abstract void R();

    public void S(float r4) {
            r3 = this;
            int r0 = r3.b
            float r0 = (float) r0
            r1 = 1073741824(0x40000000, float:2.0)
            float r2 = r3.l
            float r2 = r2 * r1
            float r0 = r0 - r2
            int r1 = r3.z
            float r1 = (float) r1
            float r0 = r0 - r1
            int r1 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r1 <= 0) goto L13
            r4 = r0
        L13:
            r3.y = r4
            r3.postInvalidate()
            return
    }

    public void T(int r1) {
            r0 = this;
            r0.A = r1
            if (r1 != 0) goto L7
            r0.V()
        L7:
            r0.postInvalidate()
            return
    }

    protected abstract void V();

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(android.graphics.Canvas r3) {
            r2 = this;
            int r0 = r2.getWidth()
            int r1 = r2.b
            r2.L(r3, r0, r1)
            r2.N(r3, r0, r1)
            r2.M(r3, r0, r1)
            super.dispatchDraw(r3)
            return
    }

    @Override // com.scwang.smartrefresh.header.fungame.FunGameHeader, com.scwang.smartrefresh.header.fungame.FunGameBase
    public void f(l2.g r1, int r2, int r3) {
            r0 = this;
            super.f(r1, r2, r3)
            r0.R()
            r1 = 0
            r0.T(r1)
            return
    }

    public int getCurrStatus() {
            r1 = this;
            int r0 = r1.A
            return r0
    }

    public java.lang.String getTextGameOver() {
            r1 = this;
            java.lang.String r0 = com.scwang.smartrefresh.header.fungame.FunGameView.M
            return r0
    }

    public java.lang.String getTextLoading() {
            r1 = this;
            java.lang.String r0 = com.scwang.smartrefresh.header.fungame.FunGameView.N
            return r0
    }

    public java.lang.String getTextLoadingFinished() {
            r1 = this;
            java.lang.String r0 = com.scwang.smartrefresh.header.fungame.FunGameView.O
            return r0
    }

    @Override // com.scwang.smartrefresh.header.fungame.FunGameBase
    protected void n(float r1, int r2, int r3, int r4) {
            r0 = this;
            r1 = 0
            int r1 = java.lang.Math.max(r2, r1)
            float r1 = (float) r1
            r0.S(r1)
            return
    }

    @Override // com.scwang.smartrefresh.header.fungame.FunGameHeader, com.scwang.smartrefresh.header.fungame.FunGameBase
    @java.lang.Deprecated
    public void setPrimaryColors(@androidx.annotation.ColorInt int... r4) {
            r3 = this;
            super.setPrimaryColors(r4)
            int r0 = r4.length
            if (r0 <= 0) goto L3e
            r0 = 0
            r0 = r4[r0]
            r3.E = r0
            r3.F = r0
            if (r0 == 0) goto L12
            r1 = -1
            if (r0 != r1) goto L17
        L12:
            r0 = -10461088(0xffffffffff606060, float:-2.9824748E38)
            r3.F = r0
        L17:
            int r0 = r4.length
            r1 = 1
            if (r0 <= r1) goto L3e
            r0 = r4[r1]
            r3.D = r0
            r2 = 225(0xe1, float:3.15E-43)
            int r0 = com.scwang.smartrefresh.layout.util.a.A(r0, r2)
            r3.B = r0
            r0 = r4[r1]
            r2 = 200(0xc8, float:2.8E-43)
            int r0 = com.scwang.smartrefresh.layout.util.a.A(r0, r2)
            r3.C = r0
            android.text.TextPaint r0 = r3.x
            r4 = r4[r1]
            r1 = 150(0x96, float:2.1E-43)
            int r4 = com.scwang.smartrefresh.layout.util.a.A(r4, r1)
            r0.setColor(r4)
        L3e:
            return
    }

    public void setTextGameOver(java.lang.String r1) {
            r0 = this;
            com.scwang.smartrefresh.header.fungame.FunGameView.M = r1
            return
    }

    public void setTextLoading(java.lang.String r1) {
            r0 = this;
            com.scwang.smartrefresh.header.fungame.FunGameView.N = r1
            return
    }

    public void setTextLoadingFinished(java.lang.String r1) {
            r0 = this;
            com.scwang.smartrefresh.header.fungame.FunGameView.O = r1
            return
    }

    @Override // com.scwang.smartrefresh.header.fungame.FunGameHeader, com.scwang.smartrefresh.header.fungame.FunGameBase
    public int w(l2.h r2, boolean r3) {
            r1 = this;
            boolean r0 = r1.g
            if (r0 == 0) goto Ld
            if (r3 == 0) goto L8
            r0 = 3
            goto L9
        L8:
            r0 = 4
        L9:
            r1.T(r0)
            goto L11
        Ld:
            r0 = 0
            r1.T(r0)
        L11:
            int r2 = super.w(r2, r3)
            return r2
    }
}
