package com.beizi.fusion.widget;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class BackArrowView extends android.view.View {
    private int a;
    private int b;
    private float c;
    private float d;
    private int e;
    private float f;
    private int g;
    private android.graphics.Paint h;
    private android.graphics.Path i;

    public BackArrowView(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public BackArrowView(android.content.Context r2, @androidx.annotation.Nullable android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public BackArrowView(android.content.Context r1, @androidx.annotation.Nullable android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r0.a(r1, r2, r3)
            return
    }

    private int a(int r4) {
            r3 = this;
            int r0 = android.view.View.MeasureSpec.getMode(r4)
            int r4 = android.view.View.MeasureSpec.getSize(r4)
            r1 = 1073741824(0x40000000, float:2.0)
            if (r0 != r1) goto Ld
            return r4
        Ld:
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = 150(0x96, float:2.1E-43)
            if (r0 != r1) goto L18
            int r4 = java.lang.Math.min(r2, r4)
            return r4
        L18:
            return r2
    }

    private void a(android.content.Context r1, @androidx.annotation.Nullable android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.b(r1, r2, r3)
            android.graphics.Paint r1 = new android.graphics.Paint
            r1.<init>()
            r0.h = r1
            int r2 = r0.e
            r1.setColor(r2)
            android.graphics.Paint r1 = r0.h
            android.graphics.Paint$Style r2 = android.graphics.Paint.Style.STROKE
            r1.setStyle(r2)
            android.graphics.Paint r1 = r0.h
            r2 = 1
            r1.setAntiAlias(r2)
            android.graphics.Paint r1 = r0.h
            float r2 = r0.f
            r1.setStrokeWidth(r2)
            android.graphics.Paint r1 = r0.h
            android.graphics.Paint$Join r2 = android.graphics.Paint.Join.ROUND
            r1.setStrokeJoin(r2)
            return
    }

    private void b(android.content.Context r3, @androidx.annotation.Nullable android.util.AttributeSet r4, int r5) {
            r2 = this;
            int[] r0 = com.beizi.fusion.R.styleable.BeiZi_BackArrowView
            r1 = 0
            android.content.res.TypedArray r4 = r3.obtainStyledAttributes(r4, r0, r5, r1)
            int r5 = com.beizi.fusion.R.styleable.BeiZi_BackArrowView_beizi_bav_color
            r0 = 255(0xff, float:3.57E-43)
            int r0 = android.graphics.Color.argb(r0, r1, r1, r1)
            int r5 = r4.getColor(r5, r0)
            r2.e = r5
            int r5 = com.beizi.fusion.R.styleable.BeiZi_BackArrowView_beizi_bav_stroke_width
            r0 = 1073741824(0x40000000, float:2.0)
            int r3 = dip2px(r3, r0)
            float r3 = (float) r3
            float r3 = r4.getDimension(r5, r3)
            r2.f = r3
            int r3 = com.beizi.fusion.R.styleable.BeiZi_BackArrowView_beizi_bav_arrow_style
            r5 = 1
            int r3 = r4.getInt(r3, r5)
            r2.g = r3
            r4.recycle()
            return
    }

    public static int dip2px(android.content.Context r0, float r1) {
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r1 = r1 * r0
            r0 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r0
            int r0 = (int) r1
            return r0
    }

    @Override // android.view.View
    protected void onDraw(android.graphics.Canvas r4) {
            r3 = this;
            super.onDraw(r4)
            int r0 = r3.a
            float r0 = (float) r0
            r1 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r1
            float r1 = r3.c
            float r0 = r0 - r1
            int r1 = r3.b
            int r1 = r1 / 2
            float r1 = (float) r1
            r4.translate(r0, r1)
            r0 = 1110704128(0x42340000, float:45.0)
            r4.rotate(r0)
            android.graphics.Path r0 = r3.i
            if (r0 != 0) goto L24
            android.graphics.Path r0 = new android.graphics.Path
            r0.<init>()
            r3.i = r0
        L24:
            android.graphics.Path r0 = r3.i
            r0.reset()
            android.graphics.Path r0 = r3.i
            float r1 = r3.d
            r2 = 0
            r0.lineTo(r2, r1)
            android.graphics.Path r0 = r3.i
            r0.moveTo(r2, r2)
            android.graphics.Path r0 = r3.i
            float r1 = r3.d
            float r1 = -r1
            r0.lineTo(r1, r2)
            int r0 = r3.g
            r1 = 1
            if (r0 != r1) goto L50
            android.graphics.Path r0 = r3.i
            r0.moveTo(r2, r2)
            android.graphics.Path r0 = r3.i
            float r1 = r3.d
            float r2 = -r1
            r0.lineTo(r1, r2)
        L50:
            android.graphics.Path r0 = r3.i
            r0.close()
            android.graphics.Path r0 = r3.i
            android.graphics.Paint r1 = r3.h
            r4.drawPath(r0, r1)
            return
    }

    @Override // android.view.View
    protected void onMeasure(int r1, int r2) {
            r0 = this;
            super.onMeasure(r1, r2)
            int r1 = r0.a(r1)
            int r2 = r0.a(r2)
            r0.setMeasuredDimension(r1, r2)
            return
    }

    @Override // android.view.View
    protected void onSizeChanged(int r1, int r2, int r3, int r4) {
            r0 = this;
            super.onSizeChanged(r1, r2, r3, r4)
            r0.a = r1
            r0.b = r2
            int r1 = java.lang.Math.min(r1, r2)
            float r1 = (float) r1
            r2 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r2
            int r2 = r0.g
            r3 = 1
            if (r2 != r3) goto L1b
            r2 = 1077936128(0x40400000, float:3.0)
            float r2 = r1 / r2
            r0.c = r2
            goto L24
        L1b:
            r3 = 2
            if (r2 != r3) goto L24
            r2 = 1082130432(0x40800000, float:4.0)
            float r2 = r1 / r2
            r0.c = r2
        L24:
            r2 = 1059145646(0x3f2147ae, float:0.63)
            float r1 = r1 * r2
            r0.d = r1
            return
    }

    public void setViewColor(int r2) {
            r1 = this;
            android.graphics.Paint r0 = r1.h
            if (r0 == 0) goto La
            r0.setColor(r2)
            r1.invalidate()
        La:
            return
    }
}
