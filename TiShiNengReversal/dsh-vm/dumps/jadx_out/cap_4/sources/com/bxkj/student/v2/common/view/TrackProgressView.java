package com.bxkj.student.v2.common.view;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class TrackProgressView extends android.view.View {
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private java.lang.String k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f1379l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f1380m;

    /* renamed from: n, reason: collision with root package name */
    private float f1381n;

    /* renamed from: o, reason: collision with root package name */
    private int f1382o;

    /* renamed from: p, reason: collision with root package name */
    private android.graphics.Paint f1383p;

    /* renamed from: q, reason: collision with root package name */
    private android.graphics.Paint f1384q;

    /* renamed from: r, reason: collision with root package name */
    private android.graphics.Paint f1385r;

    /* renamed from: s, reason: collision with root package name */
    private android.graphics.Paint f1386s;

    /* renamed from: t, reason: collision with root package name */
    private java.util.List<com.bxkj.student.v2.common.view.TrackProgressView.a> f1387t;

    /* renamed from: u, reason: collision with root package name */
    private android.graphics.Path f1388u;

    /* renamed from: v, reason: collision with root package name */
    private java.util.List<com.bxkj.student.v2.common.view.TrackProgressView.a> f1389v;

    /* renamed from: w, reason: collision with root package name */
    private android.graphics.Path f1390w;

    /* renamed from: x, reason: collision with root package name */
    private android.graphics.Path f1391x;

    /* renamed from: y, reason: collision with root package name */
    private int f1392y;

    /* renamed from: z, reason: collision with root package name */
    private int f1393z;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class a {
        private float a;
        private float b;

        public a(float r1, float r2) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.b = r2
                return
        }

        public float a() {
                r1 = this;
                float r0 = r1.a
                return r0
        }

        public float b() {
                r1 = this;
                float r0 = r1.b
                return r0
        }
    }

    public TrackProgressView(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public TrackProgressView(android.content.Context r2, @androidx.annotation.Nullable android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public TrackProgressView(android.content.Context r11, @androidx.annotation.Nullable android.util.AttributeSet r12, int r13) {
            r10 = this;
            r10.<init>(r11, r12, r13)
            r0 = 100
            r10.a = r0
            r1 = 50
            r10.b = r1
            r2 = 20
            r10.c = r2
            r3 = 0
            r10.d = r3
            r10.e = r3
            r10.f = r3
            r10.g = r3
            r10.h = r0
            r4 = 10
            r10.i = r4
            r10.j = r3
            java.lang.String r5 = "未来3天预约率"
            r10.k = r5
            r6 = 1
            r10.f1379l = r6
            r10.f1380m = r6
            r7 = 0
            r10.f1381n = r7
            r10.f1382o = r3
            android.graphics.Paint r8 = new android.graphics.Paint
            r8.<init>()
            r10.f1383p = r8
            android.graphics.Paint r8 = new android.graphics.Paint
            r8.<init>()
            r10.f1384q = r8
            android.graphics.Paint r8 = new android.graphics.Paint
            r8.<init>()
            r10.f1385r = r8
            android.graphics.Paint r8 = new android.graphics.Paint
            r8.<init>()
            r10.f1386s = r8
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r10.f1387t = r8
            android.graphics.Path r8 = new android.graphics.Path
            r8.<init>()
            r10.f1388u = r8
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r10.f1389v = r8
            android.graphics.Path r8 = new android.graphics.Path
            r8.<init>()
            r10.f1390w = r8
            android.graphics.Path r8 = new android.graphics.Path
            r8.<init>()
            r10.f1391x = r8
            r10.f1392y = r3
            r10.f1393z = r3
            int[] r8 = com.bxkj.student.R.styleable.TrackProgressView
            android.content.res.TypedArray r11 = r11.obtainStyledAttributes(r12, r8, r13, r3)
            android.content.res.Resources r12 = r10.getResources()
            r13 = 2131099718(0x7f060046, float:1.7811797E38)
            int r12 = r12.getColor(r13)
            int r12 = r11.getColor(r3, r12)
            r10.d = r12
            r12 = 6
            int r12 = r11.getDimensionPixelSize(r12, r1)
            r10.b = r12
            r12 = 2
            int r13 = r11.getDimensionPixelSize(r12, r0)
            r10.a = r13
            android.content.res.Resources r13 = r10.getResources()
            android.util.DisplayMetrics r13 = r13.getDisplayMetrics()
            int r13 = r13.widthPixels
            r1 = 13
            int r1 = r11.getDimensionPixelSize(r1, r2)
            r10.c = r1
            r1 = 3
            int r1 = r11.getDimensionPixelSize(r1, r2)
            int r8 = r10.b
            int r9 = r10.c
            int r8 = r8 + r9
            int r8 = r8 * 2
            int r13 = r13 - r8
            int r13 = r13 - r1
            r10.a = r13
            android.content.res.Resources r12 = r10.getResources()
            r13 = 2131099734(0x7f060056, float:1.781183E38)
            int r12 = r12.getColor(r13)
            r13 = 12
            int r12 = r11.getColor(r13, r12)
            r10.e = r12
            android.content.res.Resources r12 = r10.getResources()
            r13 = 2131100716(0x7f06042c, float:1.7813821E38)
            int r12 = r12.getColor(r13)
            r1 = 5
            int r12 = r11.getColor(r1, r12)
            r10.f = r12
            r12 = 4
            int r12 = r11.getInteger(r12, r0)
            r10.h = r12
            int r12 = r11.getInteger(r6, r4)
            r10.i = r12
            int r12 = r11.getDimensionPixelSize(r4, r2)
            r10.j = r12
            android.content.res.Resources r12 = r10.getResources()
            int r12 = r12.getColor(r13)
            r13 = 9
            int r12 = r11.getColor(r13, r12)
            r10.g = r12
            r12 = 7
            boolean r12 = r11.getBoolean(r12, r6)
            r10.f1379l = r12
            r12 = 8
            boolean r12 = r11.getBoolean(r12, r6)
            r10.f1380m = r12
            r12 = 11
            java.lang.String r12 = r11.getString(r12)
            r10.k = r12
            boolean r12 = android.text.TextUtils.isEmpty(r12)
            if (r12 == 0) goto L11f
            r10.k = r5
        L11f:
            r11.recycle()
            r10.b()
            r10.a()
            r11 = 0
            r12 = 0
        L12a:
            java.util.List<com.bxkj.student.v2.common.view.TrackProgressView$a> r13 = r10.f1387t
            int r13 = r13.size()
            if (r12 >= r13) goto L161
            java.util.List<com.bxkj.student.v2.common.view.TrackProgressView$a> r13 = r10.f1387t
            java.lang.Object r13 = r13.get(r12)
            com.bxkj.student.v2.common.view.TrackProgressView$a r13 = (com.bxkj.student.v2.common.view.TrackProgressView.a) r13
            if (r12 != 0) goto L149
            float r7 = r13.a()
            float r11 = r13.b()
            android.graphics.Path r0 = r10.f1388u
            r0.moveTo(r7, r11)
        L149:
            android.graphics.Path r0 = r10.f1388u
            float r1 = r13.a()
            float r2 = r13.b()
            r0.quadTo(r7, r11, r1, r2)
            float r7 = r13.a()
            float r11 = r13.b()
            int r12 = r12 + 1
            goto L12a
        L161:
            r12 = 0
        L162:
            java.util.List<com.bxkj.student.v2.common.view.TrackProgressView$a> r13 = r10.f1389v
            int r13 = r13.size()
            if (r12 >= r13) goto L199
            java.util.List<com.bxkj.student.v2.common.view.TrackProgressView$a> r13 = r10.f1389v
            java.lang.Object r13 = r13.get(r12)
            com.bxkj.student.v2.common.view.TrackProgressView$a r13 = (com.bxkj.student.v2.common.view.TrackProgressView.a) r13
            if (r12 != 0) goto L181
            float r7 = r13.a()
            float r11 = r13.b()
            android.graphics.Path r0 = r10.f1390w
            r0.moveTo(r7, r11)
        L181:
            android.graphics.Path r0 = r10.f1390w
            float r1 = r13.a()
            float r2 = r13.b()
            r0.quadTo(r7, r11, r1, r2)
            float r7 = r13.a()
            float r11 = r13.b()
            int r12 = r12 + 1
            goto L162
        L199:
            int r11 = r10.h
            r10.setMaxProgress(r11)
            int r11 = r10.i
            r10.d(r11, r3)
            return
    }

    private void a() {
            r14 = this;
            r0 = -180(0xffffffffffffff4c, float:NaN)
            r1 = -180(0xffffffffffffff4c, float:NaN)
        L4:
            r2 = 180(0xb4, float:2.52E-43)
            if (r1 > r2) goto L10e
            int r3 = r14.b
            int r4 = r14.c
            int r4 = r4 + r3
            double r4 = (double) r4
            double r6 = (double) r3
            double r8 = (double) r1
            double r10 = java.lang.Math.toRadians(r8)
            double r10 = java.lang.Math.cos(r10)
            double r6 = r6 * r10
            double r6 = r6 + r4
            float r3 = (float) r6
            int r6 = r14.b
            double r6 = (double) r6
            double r10 = java.lang.Math.toRadians(r8)
            double r10 = java.lang.Math.sin(r10)
            double r6 = r6 * r10
            double r6 = r6 + r4
            float r6 = (float) r6
            int r7 = r14.b
            int r10 = r14.c
            int r10 = r10 / 2
            int r7 = r7 + r10
            double r10 = (double) r7
            double r12 = java.lang.Math.toRadians(r8)
            double r12 = java.lang.Math.cos(r12)
            double r10 = r10 * r12
            double r10 = r10 + r4
            float r7 = (float) r10
            int r10 = r14.b
            int r11 = r14.c
            int r11 = r11 / 2
            int r10 = r10 + r11
            double r10 = (double) r10
            double r8 = java.lang.Math.toRadians(r8)
            double r8 = java.lang.Math.sin(r8)
            double r10 = r10 * r8
            double r4 = r4 + r10
            float r4 = (float) r4
            r5 = -90
            if (r1 < r0) goto L8f
            if (r1 > r5) goto L8f
            if (r1 != r5) goto L7b
            r2 = 0
        L5c:
            int r5 = r14.a
            if (r2 > r5) goto L10a
            java.util.List<com.bxkj.student.v2.common.view.TrackProgressView$a> r5 = r14.f1387t
            com.bxkj.student.v2.common.view.TrackProgressView$a r8 = new com.bxkj.student.v2.common.view.TrackProgressView$a
            float r9 = (float) r2
            float r10 = r3 + r9
            r8.<init>(r10, r6)
            r5.add(r8)
            java.util.List<com.bxkj.student.v2.common.view.TrackProgressView$a> r5 = r14.f1389v
            com.bxkj.student.v2.common.view.TrackProgressView$a r8 = new com.bxkj.student.v2.common.view.TrackProgressView$a
            float r9 = r9 + r7
            r8.<init>(r9, r4)
            r5.add(r8)
            int r2 = r2 + 1
            goto L5c
        L7b:
            java.util.List<com.bxkj.student.v2.common.view.TrackProgressView$a> r8 = r14.f1387t
            com.bxkj.student.v2.common.view.TrackProgressView$a r9 = new com.bxkj.student.v2.common.view.TrackProgressView$a
            r9.<init>(r3, r6)
            r8.add(r9)
            java.util.List<com.bxkj.student.v2.common.view.TrackProgressView$a> r8 = r14.f1389v
            com.bxkj.student.v2.common.view.TrackProgressView$a r9 = new com.bxkj.student.v2.common.view.TrackProgressView$a
            r9.<init>(r7, r4)
            r8.add(r9)
        L8f:
            if (r1 < r5) goto Laf
            if (r1 > 0) goto Laf
            java.util.List<com.bxkj.student.v2.common.view.TrackProgressView$a> r5 = r14.f1387t
            com.bxkj.student.v2.common.view.TrackProgressView$a r8 = new com.bxkj.student.v2.common.view.TrackProgressView$a
            int r9 = r14.a
            float r9 = (float) r9
            float r9 = r9 + r3
            r8.<init>(r9, r6)
            r5.add(r8)
            java.util.List<com.bxkj.student.v2.common.view.TrackProgressView$a> r5 = r14.f1389v
            com.bxkj.student.v2.common.view.TrackProgressView$a r8 = new com.bxkj.student.v2.common.view.TrackProgressView$a
            int r9 = r14.a
            float r9 = (float) r9
            float r9 = r9 + r7
            r8.<init>(r9, r4)
            r5.add(r8)
        Laf:
            r5 = 90
            if (r1 < 0) goto Lf2
            if (r1 > r5) goto Lf2
            if (r1 != r5) goto Ld6
            int r2 = r14.a
        Lb9:
            if (r2 < 0) goto L10a
            java.util.List<com.bxkj.student.v2.common.view.TrackProgressView$a> r5 = r14.f1387t
            com.bxkj.student.v2.common.view.TrackProgressView$a r8 = new com.bxkj.student.v2.common.view.TrackProgressView$a
            float r9 = (float) r2
            float r10 = r3 + r9
            r8.<init>(r10, r6)
            r5.add(r8)
            java.util.List<com.bxkj.student.v2.common.view.TrackProgressView$a> r5 = r14.f1389v
            com.bxkj.student.v2.common.view.TrackProgressView$a r8 = new com.bxkj.student.v2.common.view.TrackProgressView$a
            float r9 = r9 + r7
            r8.<init>(r9, r4)
            r5.add(r8)
            int r2 = r2 + (-1)
            goto Lb9
        Ld6:
            java.util.List<com.bxkj.student.v2.common.view.TrackProgressView$a> r8 = r14.f1387t
            com.bxkj.student.v2.common.view.TrackProgressView$a r9 = new com.bxkj.student.v2.common.view.TrackProgressView$a
            int r10 = r14.a
            float r10 = (float) r10
            float r10 = r10 + r3
            r9.<init>(r10, r6)
            r8.add(r9)
            java.util.List<com.bxkj.student.v2.common.view.TrackProgressView$a> r8 = r14.f1389v
            com.bxkj.student.v2.common.view.TrackProgressView$a r9 = new com.bxkj.student.v2.common.view.TrackProgressView$a
            int r10 = r14.a
            float r10 = (float) r10
            float r10 = r10 + r7
            r9.<init>(r10, r4)
            r8.add(r9)
        Lf2:
            if (r1 < r5) goto L10a
            if (r1 > r2) goto L10a
            java.util.List<com.bxkj.student.v2.common.view.TrackProgressView$a> r2 = r14.f1387t
            com.bxkj.student.v2.common.view.TrackProgressView$a r5 = new com.bxkj.student.v2.common.view.TrackProgressView$a
            r5.<init>(r3, r6)
            r2.add(r5)
            java.util.List<com.bxkj.student.v2.common.view.TrackProgressView$a> r2 = r14.f1389v
            com.bxkj.student.v2.common.view.TrackProgressView$a r3 = new com.bxkj.student.v2.common.view.TrackProgressView$a
            r3.<init>(r7, r4)
            r2.add(r3)
        L10a:
            int r1 = r1 + 1
            goto L4
        L10e:
            return
    }

    private void b() {
            r4 = this;
            android.graphics.Paint r0 = r4.f1383p
            int r1 = r4.d
            r0.setColor(r1)
            android.graphics.Paint r0 = r4.f1383p
            r1 = 1
            r0.setFlags(r1)
            android.graphics.Paint r0 = r4.f1384q
            int r2 = r4.e
            r0.setColor(r2)
            android.graphics.Paint r0 = r4.f1384q
            r0.setFlags(r1)
            android.graphics.Paint r0 = r4.f1384q
            android.graphics.Paint$Style r2 = android.graphics.Paint.Style.STROKE
            r0.setStyle(r2)
            android.graphics.Paint r0 = r4.f1384q
            int r3 = r4.c
            float r3 = (float) r3
            r0.setStrokeWidth(r3)
            android.graphics.Paint r0 = r4.f1385r
            int r3 = r4.f
            r0.setColor(r3)
            android.graphics.Paint r0 = r4.f1385r
            r0.setFlags(r1)
            android.graphics.Paint r0 = r4.f1385r
            r0.setStyle(r2)
            android.graphics.Paint r0 = r4.f1385r
            int r1 = r4.c
            float r1 = (float) r1
            r0.setStrokeWidth(r1)
            android.graphics.Paint r0 = r4.f1386s
            int r1 = r4.g
            r0.setColor(r1)
            android.graphics.Paint r0 = r4.f1386s
            r1 = 33
            r0.setFlags(r1)
            android.graphics.Paint r0 = r4.f1386s
            int r1 = r4.j
            float r1 = (float) r1
            r0.setTextSize(r1)
            return
    }

    private void d(int r8, boolean r9) {
            r7 = this;
            int r0 = r7.h
            if (r8 <= r0) goto L7
            r7.i = r0
            goto L9
        L7:
            r7.i = r8
        L9:
            if (r8 != 0) goto Lf
            r7.c()
            return
        Lf:
            android.graphics.Paint r8 = r7.f1385r
            int r0 = r7.f
            r8.setColor(r0)
            int r8 = r7.i
            float r8 = (float) r8
            float r0 = r7.f1381n
            float r8 = r8 * r0
            int r8 = (int) r8
            java.util.List<com.bxkj.student.v2.common.view.TrackProgressView$a> r0 = r7.f1389v
            int r0 = r0.size()
            if (r8 < r0) goto L2e
            java.util.List<com.bxkj.student.v2.common.view.TrackProgressView$a> r8 = r7.f1389v
            int r8 = r8.size()
            int r8 = r8 + (-1)
        L2e:
            int r0 = r7.f1382o
            r1 = 0
            r2 = 0
        L32:
            if (r0 > r8) goto L65
            java.util.List<com.bxkj.student.v2.common.view.TrackProgressView$a> r3 = r7.f1389v
            java.lang.Object r3 = r3.get(r0)
            com.bxkj.student.v2.common.view.TrackProgressView$a r3 = (com.bxkj.student.v2.common.view.TrackProgressView.a) r3
            int r4 = r7.f1382o
            if (r0 != r4) goto L4d
            float r1 = r3.a()
            float r2 = r3.b()
            android.graphics.Path r4 = r7.f1391x
            r4.moveTo(r1, r2)
        L4d:
            android.graphics.Path r4 = r7.f1391x
            float r5 = r3.a()
            float r6 = r3.b()
            r4.quadTo(r1, r2, r5, r6)
            float r1 = r3.a()
            float r2 = r3.b()
            int r0 = r0 + 1
            goto L32
        L65:
            r7.f1382o = r8
            if (r9 == 0) goto L6c
            r7.invalidate()
        L6c:
            return
    }

    public void c() {
            r3 = this;
            r0 = 0
            r3.f1382o = r0
            r3.i = r0
            android.graphics.Path r1 = new android.graphics.Path
            r1.<init>()
            r3.f1391x = r1
            java.util.List<com.bxkj.student.v2.common.view.TrackProgressView$a> r1 = r3.f1389v
            java.lang.Object r0 = r1.get(r0)
            com.bxkj.student.v2.common.view.TrackProgressView$a r0 = (com.bxkj.student.v2.common.view.TrackProgressView.a) r0
            android.graphics.Path r1 = r3.f1391x
            float r2 = r0.a()
            float r0 = r0.b()
            r1.moveTo(r2, r0)
            r3.invalidate()
            return
    }

    @Override // android.view.View
    protected void onDraw(android.graphics.Canvas r9) {
            r8 = this;
            super.onDraw(r9)
            android.graphics.Path r0 = r8.f1388u
            android.graphics.Paint r1 = r8.f1383p
            r9.drawPath(r0, r1)
            android.graphics.Path r0 = r8.f1390w
            android.graphics.Paint r1 = r8.f1384q
            r9.drawPath(r0, r1)
            android.graphics.Paint r0 = r8.f1385r
            int r1 = r8.f
            r0.setColor(r1)
            android.graphics.Path r0 = r8.f1391x
            android.graphics.Paint r1 = r8.f1385r
            r9.drawPath(r0, r1)
            boolean r0 = r8.f1379l
            r1 = 0
            if (r0 == 0) goto L9a
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            int r3 = r8.i
            float r3 = (float) r3
            r4 = 1065353216(0x3f800000, float:1.0)
            float r3 = r3 * r4
            int r4 = r8.h
            float r4 = (float) r4
            float r3 = r3 / r4
            double r3 = (double) r3
            r5 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r3 = r3 * r5
            java.lang.Double r3 = java.lang.Double.valueOf(r3)
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r1] = r3
            java.lang.String r3 = "%.2f"
            java.lang.String r3 = java.lang.String.format(r3, r4)
            r2.append(r3)
            java.lang.String r3 = "%"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            android.graphics.Paint r3 = r8.f1386s
            int r4 = r8.j
            float r4 = (float) r4
            r3.setTextSize(r4)
            android.graphics.Paint r3 = r8.f1386s
            int r4 = r2.length()
            r3.getTextBounds(r2, r1, r4, r0)
            boolean r3 = r8.f1380m
            if (r3 == 0) goto L81
            int r3 = r8.f1392y
            int r0 = r0.width()
            int r0 = r0 / 2
            int r3 = r3 - r0
            float r0 = (float) r3
            int r3 = r8.f1393z
            float r3 = (float) r3
            android.graphics.Paint r4 = r8.f1386s
            r9.drawText(r2, r0, r3, r4)
            goto L9a
        L81:
            int r3 = r8.f1392y
            int r4 = r0.width()
            int r4 = r4 / 2
            int r3 = r3 - r4
            float r3 = (float) r3
            int r4 = r8.f1393z
            int r0 = r0.height()
            int r0 = r0 / 2
            int r4 = r4 + r0
            float r0 = (float) r4
            android.graphics.Paint r4 = r8.f1386s
            r9.drawText(r2, r3, r0, r4)
        L9a:
            boolean r0 = r8.f1380m
            if (r0 == 0) goto Lf7
            android.graphics.Paint r0 = r8.f1386s
            int r2 = r8.j
            int r2 = r2 / 2
            float r2 = (float) r2
            r0.setTextSize(r2)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            android.graphics.Paint r2 = r8.f1386s
            java.lang.String r3 = r8.k
            int r4 = r3.length()
            r2.getTextBounds(r3, r1, r4, r0)
            boolean r1 = r8.f1379l
            if (r1 == 0) goto Ldc
            java.lang.String r1 = r8.k
            int r2 = r8.f1392y
            int r3 = r0.width()
            int r3 = r3 / 2
            int r2 = r2 - r3
            float r2 = (float) r2
            int r3 = r8.f1393z
            int r0 = r0.height()
            double r4 = (double) r0
            r6 = 4609434218613702656(0x3ff8000000000000, double:1.5)
            double r4 = r4 * r6
            int r0 = (int) r4
            int r3 = r3 + r0
            float r0 = (float) r3
            android.graphics.Paint r3 = r8.f1386s
            r9.drawText(r1, r2, r0, r3)
            return
        Ldc:
            java.lang.String r1 = r8.k
            int r2 = r8.f1392y
            int r3 = r0.width()
            int r3 = r3 / 2
            int r2 = r2 - r3
            float r2 = (float) r2
            int r3 = r8.f1393z
            int r0 = r0.height()
            int r0 = r0 / 2
            int r3 = r3 + r0
            float r0 = (float) r3
            android.graphics.Paint r3 = r8.f1386s
            r9.drawText(r1, r2, r0, r3)
        Lf7:
            return
    }

    @Override // android.view.View
    protected void onMeasure(int r6, int r7) {
            r5 = this;
            super.onMeasure(r6, r7)
            int r0 = android.view.View.MeasureSpec.getMode(r6)
            int r6 = android.view.View.MeasureSpec.getSize(r6)
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            int r7 = android.view.View.MeasureSpec.getSize(r7)
            int r2 = r5.b
            int r3 = r5.c
            int r2 = r2 + r3
            r3 = 1073741824(0x40000000, float:2.0)
            if (r0 != r3) goto L1d
            goto L30
        L1d:
            int r6 = r5.getPaddingLeft()
            int r0 = r5.a
            int r4 = r2 * 2
            int r0 = r0 + r4
            int r6 = r6 + r0
            int r0 = r5.getPaddingRight()
            int r6 = r6 + r0
            int r0 = r6 / 2
            r5.f1392y = r0
        L30:
            if (r1 != r3) goto L33
            goto L43
        L33:
            int r7 = r5.getPaddingTop()
            int r2 = r2 * 2
            int r7 = r7 + r2
            int r0 = r5.getPaddingBottom()
            int r7 = r7 + r0
            int r0 = r7 / 2
            r5.f1393z = r0
        L43:
            r5.setMeasuredDimension(r6, r7)
            return
    }

    public void setMaxProgress(int r3) {
            r2 = this;
            r2.h = r3
            java.util.List<com.bxkj.student.v2.common.view.TrackProgressView$a> r3 = r2.f1389v
            int r3 = r3.size()
            float r3 = (float) r3
            r0 = 1065353216(0x3f800000, float:1.0)
            float r3 = r3 * r0
            int r1 = r2.h
            float r1 = (float) r1
            float r3 = r3 / r1
            float r3 = r3 * r0
            r2.f1381n = r3
            r3 = 0
            r2.f1382o = r3
            return
    }

    public void setProgress(int r2) {
            r1 = this;
            r0 = 1
            r1.d(r2, r0)
            return
    }

    public void setShowText(boolean r1) {
            r0 = this;
            r0.f1379l = r1
            r0.invalidate()
            return
    }

    public void setShowTips(boolean r1) {
            r0 = this;
            r0.f1380m = r1
            r0.invalidate()
            return
    }

    public void setTipsText(java.lang.String r1) {
            r0 = this;
            r0.k = r1
            r0.invalidate()
            return
    }
}
