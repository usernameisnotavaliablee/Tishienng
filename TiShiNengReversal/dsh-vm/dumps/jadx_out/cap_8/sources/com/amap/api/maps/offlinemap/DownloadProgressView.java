package com.amap.api.maps.offlinemap;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class DownloadProgressView extends android.view.View {
    private java.lang.String a;

    /* renamed from: b, reason: collision with root package name */
    private int f5021b;

    /* renamed from: c, reason: collision with root package name */
    private int f5022c;

    /* renamed from: d, reason: collision with root package name */
    private float f5023d;

    /* renamed from: e, reason: collision with root package name */
    private float f5024e;

    /* renamed from: f, reason: collision with root package name */
    private android.text.TextPaint f5025f;

    /* renamed from: g, reason: collision with root package name */
    private android.text.TextPaint f5026g;

    /* renamed from: h, reason: collision with root package name */
    private float f5027h;

    /* renamed from: i, reason: collision with root package name */
    private float f5028i;

    public DownloadProgressView(android.content.Context r2) {
            r1 = this;
            r1.<init>(r2)
            r2 = -65536(0xffffffffffff0000, float:NaN)
            r1.f5021b = r2
            r1.f5022c = r2
            r2 = 0
            r1.f5023d = r2
            r2 = 1058642330(0x3f19999a, float:0.6)
            r1.f5024e = r2
            r2 = 0
            r0 = 0
            r1.a(r2, r0)
            return
    }

    public DownloadProgressView(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r1 = -65536(0xffffffffffff0000, float:NaN)
            r0.f5021b = r1
            r0.f5022c = r1
            r1 = 0
            r0.f5023d = r1
            r1 = 1058642330(0x3f19999a, float:0.6)
            r0.f5024e = r1
            r1 = 0
            r0.a(r2, r1)
            return
    }

    public DownloadProgressView(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r1 = -65536(0xffffffffffff0000, float:NaN)
            r0.f5021b = r1
            r0.f5022c = r1
            r1 = 0
            r0.f5023d = r1
            r1 = 1058642330(0x3f19999a, float:0.6)
            r0.f5024e = r1
            r0.a(r2, r3)
            return
    }

    private void a() {
            r2 = this;
            android.text.TextPaint r0 = r2.f5025f
            float r1 = r2.f5023d
            r0.setTextSize(r1)
            android.text.TextPaint r0 = r2.f5025f
            int r1 = r2.f5021b
            r0.setColor(r1)
            android.text.TextPaint r0 = r2.f5026g
            int r1 = r2.f5022c
            r0.setColor(r1)
            android.text.TextPaint r0 = r2.f5025f
            java.lang.String r1 = r2.a
            float r0 = r0.measureText(r1)
            r2.f5027h = r0
            android.text.TextPaint r0 = r2.f5025f
            android.graphics.Paint$FontMetrics r0 = r0.getFontMetrics()
            float r0 = r0.bottom
            r2.f5028i = r0
            return
    }

    private void a(android.util.AttributeSet r4, int r5) {
            r3 = this;
            android.content.Context r0 = r3.getContext()
            int[] r1 = com.amap.api.map3d.R.styleable.a
            r2 = 0
            android.content.res.TypedArray r4 = r0.obtainStyledAttributes(r4, r1, r5, r2)
            java.lang.String r5 = r4.getString(r2)
            r3.a = r5
            r5 = 3
            int r0 = r3.f5021b
            int r5 = r4.getColor(r5, r0)
            r3.f5021b = r5
            float r5 = r3.f5023d
            r0 = 1
            float r5 = r4.getDimension(r0, r5)
            r3.f5023d = r5
            r5 = 2
            int r1 = r3.f5022c
            int r5 = r4.getColor(r5, r1)
            r3.f5022c = r5
            r4.recycle()
            android.text.TextPaint r4 = new android.text.TextPaint
            r4.<init>()
            r3.f5025f = r4
            r4.setFlags(r0)
            android.text.TextPaint r4 = r3.f5025f
            android.graphics.Paint$Align r5 = android.graphics.Paint.Align.RIGHT
            r4.setTextAlign(r5)
            android.text.TextPaint r4 = new android.text.TextPaint
            r4.<init>()
            r3.f5026g = r4
            android.graphics.Paint$Style r5 = android.graphics.Paint.Style.FILL
            r4.setStyle(r5)
            r3.a()
            return
    }

    @Override // android.view.View
    protected void onDraw(android.graphics.Canvas r12) {
            r11 = this;
            super.onDraw(r12)
            int r0 = r11.getPaddingLeft()
            int r1 = r11.getPaddingTop()
            int r2 = r11.getPaddingRight()
            int r3 = r11.getPaddingBottom()
            int r4 = r11.getWidth()
            int r4 = r4 - r0
            int r4 = r4 - r2
            int r0 = r11.getHeight()
            int r0 = r0 - r1
            int r0 = r0 - r3
            float r1 = (float) r0
            r2 = 1061997773(0x3f4ccccd, float:0.8)
            float r1 = r1 * r2
            double r1 = (double) r1
            float r3 = (float) r4
            float r4 = r11.f5024e
            float r4 = r4 * r3
            double r4 = (double) r4
            r6 = 4613937818241073152(0x4008000000000000, double:3.0)
            double r6 = r1 - r6
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            float r9 = r11.f5024e
            r10 = 1120403456(0x42c80000, float:100.0)
            float r9 = r9 * r10
            int r9 = (int) r9
            java.lang.String r9 = java.lang.String.valueOf(r9)
            r8.append(r9)
            java.lang.String r9 = "%"
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            android.graphics.Rect r9 = new android.graphics.Rect
            int r1 = (int) r1
            float r2 = r11.f5024e
            float r3 = r3 * r2
            int r2 = (int) r3
            r3 = 0
            r9.<init>(r3, r1, r2, r0)
            android.text.TextPaint r0 = r11.f5026g
            r12.drawRect(r9, r0)
            int r0 = (int) r4
            float r0 = (float) r0
            int r1 = (int) r6
            float r1 = (float) r1
            android.text.TextPaint r2 = r11.f5025f
            r12.drawText(r8, r0, r1, r2)
            return
    }

    public void setProgress(int r2) {
            r1 = this;
            r0 = 100
            if (r2 > r0) goto L10
            if (r2 >= 0) goto L7
            goto L10
        L7:
            float r2 = (float) r2
            r0 = 1120403456(0x42c80000, float:100.0)
            float r2 = r2 / r0
            r1.f5024e = r2
            r1.invalidate()
        L10:
            return
    }
}
