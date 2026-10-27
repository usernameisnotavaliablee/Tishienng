package com.bxkj.base.view;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class SideBar extends androidx.appcompat.widget.AppCompatTextView {
    private java.lang.String[] c;
    private android.graphics.Paint d;
    private android.graphics.Paint e;
    private android.graphics.Paint f;
    private android.graphics.Canvas g;
    private int h;
    private int i;
    private int j;
    float k;

    /* renamed from: l, reason: collision with root package name */
    private float f632l;

    /* renamed from: m, reason: collision with root package name */
    private float f633m;

    /* renamed from: n, reason: collision with root package name */
    private int f634n;

    /* renamed from: o, reason: collision with root package name */
    private int f635o;

    /* renamed from: p, reason: collision with root package name */
    private com.bxkj.base.view.SideBar.a f636p;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface a {
        void a(int r1, java.lang.String r2);
    }

    public SideBar(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public SideBar(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public SideBar(android.content.Context r29, android.util.AttributeSet r30, int r31) {
            r28 = this;
            r0 = r28
            r28.<init>(r29, r30, r31)
            java.lang.String r26 = "Z"
            java.lang.String r27 = "#"
            java.lang.String r1 = "A"
            java.lang.String r2 = "B"
            java.lang.String r3 = "C"
            java.lang.String r4 = "D"
            java.lang.String r5 = "E"
            java.lang.String r6 = "F"
            java.lang.String r7 = "G"
            java.lang.String r8 = "H"
            java.lang.String r9 = "I"
            java.lang.String r10 = "J"
            java.lang.String r11 = "K"
            java.lang.String r12 = "L"
            java.lang.String r13 = "M"
            java.lang.String r14 = "N"
            java.lang.String r15 = "O"
            java.lang.String r16 = "P"
            java.lang.String r17 = "Q"
            java.lang.String r18 = "R"
            java.lang.String r19 = "S"
            java.lang.String r20 = "T"
            java.lang.String r21 = "U"
            java.lang.String r22 = "V"
            java.lang.String r23 = "W"
            java.lang.String r24 = "X"
            java.lang.String r25 = "Y"
            java.lang.String[] r1 = new java.lang.String[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27}
            r0.c = r1
            r1 = 0
            r0.f633m = r1
            r1 = 1
            r0.f634n = r1
            r1 = 6
            r0.f635o = r1
            r1 = r30
            r0.d(r1)
            return
    }

    private void a(float r8) {
            r7 = this;
            r0 = 0
            r1 = -1
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r0 == 0) goto L54
            r0 = 0
        L7:
            java.lang.String[] r2 = r7.c
            int r3 = r2.length
            if (r0 >= r3) goto L54
            int r3 = r7.h
            int r4 = r3 * r0
            float r4 = (float) r4
            int r5 = r0 + 1
            int r3 = r3 * r5
            float r3 = (float) r3
            int r4 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r4 < 0) goto L52
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 >= 0) goto L52
            com.bxkj.base.view.SideBar$a r1 = r7.f636p
            if (r1 == 0) goto L27
            r2 = r2[r0]
            r1.a(r0, r2)
        L27:
            android.graphics.Paint r1 = r7.e
            android.graphics.Paint$FontMetrics r1 = r1.getFontMetrics()
            float r2 = r1.descent
            float r1 = r1.ascent
            float r2 = r2 - r1
            android.graphics.Canvas r1 = r7.g
            java.lang.String[] r3 = r7.c
            r3 = r3[r0]
            int r4 = r7.i
            int r6 = r7.getPaddingRight()
            int r4 = r4 - r6
            float r4 = (float) r4
            float r6 = r7.f632l
            float r4 = r4 - r6
            float r4 = r4 - r2
            float r2 = r7.k
            int r6 = r7.h
            int r6 = r6 * r0
            float r6 = (float) r6
            float r2 = r2 + r6
            android.graphics.Paint r6 = r7.e
            r1.drawText(r3, r4, r2, r6)
            r1 = r0
        L52:
            r0 = r5
            goto L7
        L54:
            r7.c(r8, r1)
            return
    }

    private int b(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r2 = (float) r2
            float r2 = r2 * r0
            r0 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 + r0
            int r2 = (int) r2
            return r2
    }

    private void c(float r7, int r8) {
            r6 = this;
            r0 = -1
            r1 = 0
            if (r8 != r0) goto L44
            int r7 = r6.getMeasuredWidth()
            r6.i = r7
            int r7 = r6.getMeasuredHeight()
            r6.j = r7
            java.lang.String[] r8 = r6.c
            int r8 = r8.length
            int r7 = r7 / r8
            r6.h = r7
            android.graphics.Paint r7 = r6.d
            android.graphics.Paint$FontMetrics r7 = r7.getFontMetrics()
            float r8 = r7.descent
            float r7 = r7.ascent
            float r8 = r8 - r7
            r6.k = r8
        L23:
            java.lang.String[] r7 = r6.c
            int r8 = r7.length
            if (r1 >= r8) goto Lb7
            android.graphics.Canvas r8 = r6.g
            r7 = r7[r1]
            int r0 = r6.i
            int r2 = r6.getPaddingRight()
            int r0 = r0 - r2
            float r0 = (float) r0
            float r2 = r6.k
            int r3 = r6.h
            int r3 = r3 * r1
            float r3 = (float) r3
            float r2 = r2 + r3
            android.graphics.Paint r3 = r6.d
            r8.drawText(r7, r0, r2, r3)
            int r1 = r1 + 1
            goto L23
        L44:
            java.lang.String[] r0 = r6.c
            int r0 = r0.length
            if (r1 >= r0) goto Lb7
            float r0 = r6.k
            int r2 = r6.h
            int r3 = r2 * r1
            float r3 = (float) r3
            float r3 = r3 + r0
            if (r8 >= r1) goto L5b
            int r4 = r6.f635o
            int r4 = r4 + r8
        L56:
            int r2 = r2 * r4
            float r2 = (float) r2
            float r0 = r0 + r2
            goto L60
        L5b:
            int r4 = r6.f635o
            int r4 = r8 - r4
            goto L56
        L60:
            float r2 = r7 - r3
            float r0 = r0 - r3
            float r2 = r2 / r0
            float r0 = java.lang.Math.abs(r2)
            r2 = 1065353216(0x3f800000, float:1.0)
            float r2 = r2 - r0
            int r0 = r6.i
            int r3 = r6.getPaddingRight()
            int r0 = r0 - r3
            float r0 = (float) r0
            android.graphics.Paint r3 = r6.f
            float r4 = r6.getTextSize()
            float r5 = r6.getTextSize()
            float r5 = r5 * r2
            float r4 = r4 + r5
            r3.setTextSize(r4)
            float r3 = r6.f632l
            float r3 = r3 * r2
            float r2 = r0 - r3
            int r3 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r3 <= 0) goto La1
            android.graphics.Canvas r2 = r6.g
            java.lang.String[] r3 = r6.c
            r3 = r3[r1]
            float r4 = r6.k
            int r5 = r6.h
            int r5 = r5 * r1
            float r5 = (float) r5
            float r4 = r4 + r5
            android.graphics.Paint r5 = r6.d
            r2.drawText(r3, r0, r4, r5)
            goto Lb4
        La1:
            android.graphics.Canvas r0 = r6.g
            java.lang.String[] r3 = r6.c
            r3 = r3[r1]
            float r4 = r6.k
            int r5 = r6.h
            int r5 = r5 * r1
            float r5 = (float) r5
            float r4 = r4 + r5
            android.graphics.Paint r5 = r6.f
            r0.drawText(r3, r2, r4, r5)
        Lb4:
            int r1 = r1 + 1
            goto L44
        Lb7:
            return
    }

    private void d(android.util.AttributeSet r5) {
            r4 = this;
            r0 = 1
            if (r5 == 0) goto L30
            android.content.Context r1 = r4.getContext()
            int[] r2 = com.bxkj.base.R.styleable.SideBar
            android.content.res.TypedArray r5 = r1.obtainStyledAttributes(r5, r2)
            int r1 = com.bxkj.base.R.styleable.SideBar_scaleSize
            int r1 = r5.getInteger(r1, r0)
            r4.f634n = r1
            int r1 = com.bxkj.base.R.styleable.SideBar_scaleItemCount
            r2 = 6
            int r1 = r5.getInteger(r1, r2)
            r4.f635o = r1
            int r1 = com.bxkj.base.R.styleable.SideBar_scaleWidth
            r2 = 100
            int r2 = r4.b(r2)
            int r1 = r5.getDimensionPixelSize(r1, r2)
            float r1 = (float) r1
            r4.f632l = r1
            r5.recycle()
        L30:
            android.graphics.Paint r5 = new android.graphics.Paint
            r5.<init>(r0)
            r4.d = r5
            int r1 = r4.getCurrentTextColor()
            r5.setColor(r1)
            android.graphics.Paint r5 = r4.d
            float r1 = r4.getTextSize()
            r5.setTextSize(r1)
            android.graphics.Paint r5 = r4.d
            android.graphics.Paint$Align r1 = android.graphics.Paint.Align.CENTER
            r5.setTextAlign(r1)
            android.graphics.Paint r5 = new android.graphics.Paint
            r5.<init>(r0)
            r4.e = r5
            int r2 = r4.getCurrentTextColor()
            r5.setColor(r2)
            android.graphics.Paint r5 = r4.e
            float r2 = r4.getTextSize()
            int r3 = r4.f634n
            int r3 = r3 + 3
            float r3 = (float) r3
            float r2 = r2 * r3
            r5.setTextSize(r2)
            android.graphics.Paint r5 = r4.e
            r5.setTextAlign(r1)
            android.graphics.Paint r5 = new android.graphics.Paint
            r5.<init>(r0)
            r4.f = r5
            int r2 = r4.getCurrentTextColor()
            r5.setColor(r2)
            android.graphics.Paint r5 = r4.f
            float r2 = r4.getTextSize()
            int r3 = r4.f634n
            int r3 = r3 + r0
            float r0 = (float) r3
            float r2 = r2 * r0
            r5.setTextSize(r2)
            android.graphics.Paint r5 = r4.f
            r5.setTextAlign(r1)
            return
    }

    protected void onDraw(android.graphics.Canvas r1) {
            r0 = this;
            r0.g = r1
            float r1 = r0.f633m
            r0.a(r1)
            return
    }

    public boolean onTouchEvent(android.view.MotionEvent r7) {
            r6 = this;
            int r0 = r7.getAction()
            r1 = 1092616192(0x41200000, float:10.0)
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L33
            if (r0 == r3) goto L19
            r4 = 2
            if (r0 == r4) goto L33
            r1 = 3
            if (r0 == r1) goto L13
            goto L56
        L13:
            r6.f633m = r2
            r6.invalidate()
            return r3
        L19:
            float r0 = r7.getX()
            int r4 = r6.i
            int r5 = r6.getPaddingRight()
            int r4 = r4 - r5
            float r4 = (float) r4
            float r5 = r6.k
            float r4 = r4 - r5
            float r4 = r4 - r1
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 <= 0) goto L56
            r6.f633m = r2
            r6.invalidate()
            return r3
        L33:
            float r0 = r7.getX()
            int r4 = r6.i
            int r5 = r6.getPaddingRight()
            int r4 = r4 - r5
            float r4 = (float) r4
            float r5 = r6.k
            float r4 = r4 - r5
            float r4 = r4 - r1
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 <= 0) goto L51
            float r7 = r7.getY()
            r6.f633m = r7
            r6.invalidate()
            return r3
        L51:
            r6.f633m = r2
            r6.invalidate()
        L56:
            boolean r7 = super/*android.widget.TextView*/.onTouchEvent(r7)
            return r7
    }

    public void setDataResource(java.lang.String[] r1) {
            r0 = this;
            r0.c = r1
            r0.invalidate()
            return
    }

    public void setOnStrSelectCallBack(com.bxkj.base.view.SideBar.a r1) {
            r0 = this;
            r0.f636p = r1
            return
    }

    public void setScaleItemCount(int r1) {
            r0 = this;
            r0.f635o = r1
            r0.invalidate()
            return
    }

    public void setScaleSize(int r1) {
            r0 = this;
            r0.f634n = r1
            r0.invalidate()
            return
    }
}
