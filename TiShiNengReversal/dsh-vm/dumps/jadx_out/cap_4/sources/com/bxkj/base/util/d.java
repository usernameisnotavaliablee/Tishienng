package com.bxkj.base.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class d {

    /* renamed from: w, reason: collision with root package name */
    private static final char[] f578w = null;

    /* renamed from: x, reason: collision with root package name */
    private static com.bxkj.base.util.d f579x;
    private final int a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;
    private final int f;
    private final int g;
    private final int h;
    private final int i;
    private int j;
    private int k;

    /* renamed from: l, reason: collision with root package name */
    private int f580l;

    /* renamed from: m, reason: collision with root package name */
    private int f581m;

    /* renamed from: n, reason: collision with root package name */
    private int f582n;

    /* renamed from: o, reason: collision with root package name */
    private int f583o;

    /* renamed from: p, reason: collision with root package name */
    private int f584p;

    /* renamed from: q, reason: collision with root package name */
    private int f585q;

    /* renamed from: r, reason: collision with root package name */
    private int f586r;

    /* renamed from: s, reason: collision with root package name */
    private java.lang.String f587s;

    /* renamed from: t, reason: collision with root package name */
    private int f588t;

    /* renamed from: u, reason: collision with root package name */
    private int f589u;

    /* renamed from: v, reason: collision with root package name */
    private java.util.Random f590v;

    static {
            r0 = 10
            char[] r0 = new char[r0]
            r0 = {x000a: FILL_ARRAY_DATA , data: [48, 49, 50, 51, 52, 53, 54, 55, 56, 57} // fill-array
            com.bxkj.base.util.d.f578w = r0
            return
    }

    public d() {
            r10 = this;
            r10.<init>()
            r0 = 4
            r10.a = r0
            com.bxkj.base.BaseApp r1 = com.bxkj.base.BaseApp.c()
            r2 = 1103626240(0x41c80000, float:25.0)
            int r1 = r10.j(r1, r2)
            r10.b = r1
            r2 = 10
            r10.c = r2
            r3 = 1092616192(0x41200000, float:10.0)
            com.bxkj.base.BaseApp r4 = com.bxkj.base.BaseApp.c()
            int r3 = cn.bluemobi.dylan.base.utils.u.a(r3, r4)
            r10.d = r3
            com.bxkj.base.BaseApp r4 = com.bxkj.base.BaseApp.c()
            r5 = 1097859072(0x41700000, float:15.0)
            int r4 = cn.bluemobi.dylan.base.utils.u.a(r5, r4)
            r10.e = r4
            com.bxkj.base.BaseApp r6 = com.bxkj.base.BaseApp.c()
            int r5 = cn.bluemobi.dylan.base.utils.u.a(r5, r6)
            r10.f = r5
            r6 = 1101004800(0x41a00000, float:20.0)
            com.bxkj.base.BaseApp r7 = com.bxkj.base.BaseApp.c()
            int r6 = cn.bluemobi.dylan.base.utils.u.a(r6, r7)
            r10.g = r6
            r7 = 1120403456(0x42c80000, float:100.0)
            com.bxkj.base.BaseApp r8 = com.bxkj.base.BaseApp.c()
            int r7 = cn.bluemobi.dylan.base.utils.u.a(r7, r8)
            r10.h = r7
            r8 = 1109393408(0x42200000, float:40.0)
            com.bxkj.base.BaseApp r9 = com.bxkj.base.BaseApp.c()
            int r8 = cn.bluemobi.dylan.base.utils.u.a(r8, r9)
            r10.i = r8
            r10.j = r7
            r10.k = r8
            r10.f580l = r3
            r10.f581m = r4
            r10.f582n = r5
            r10.f583o = r6
            r10.f584p = r0
            r10.f585q = r2
            r10.f586r = r1
            java.util.Random r0 = new java.util.Random
            r0.<init>()
            r10.f590v = r0
            return
    }

    private java.lang.String b() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
        L6:
            int r2 = r5.f584p
            if (r1 >= r2) goto L1b
            char[] r2 = com.bxkj.base.util.d.f578w
            java.util.Random r3 = r5.f590v
            int r4 = r2.length
            int r3 = r3.nextInt(r4)
            char r2 = r2[r3]
            r0.append(r2)
            int r1 = r1 + 1
            goto L6
        L1b:
            java.lang.String r0 = r0.toString()
            return r0
    }

    private void c(android.graphics.Canvas r13, android.graphics.Paint r14) {
            r12 = this;
            int r0 = r12.f()
            java.util.Random r1 = r12.f590v
            int r2 = r12.j
            int r1 = r1.nextInt(r2)
            java.util.Random r2 = r12.f590v
            int r3 = r12.k
            int r2 = r2.nextInt(r3)
            java.util.Random r3 = r12.f590v
            int r4 = r12.j
            int r3 = r3.nextInt(r4)
            java.util.Random r4 = r12.f590v
            int r5 = r12.k
            int r4 = r4.nextInt(r5)
            r5 = 1065353216(0x3f800000, float:1.0)
            com.bxkj.base.BaseApp r6 = com.bxkj.base.BaseApp.c()
            int r5 = cn.bluemobi.dylan.base.utils.u.a(r5, r6)
            float r5 = (float) r5
            r14.setStrokeWidth(r5)
            r14.setColor(r0)
            float r7 = (float) r1
            float r8 = (float) r2
            float r9 = (float) r3
            float r10 = (float) r4
            r6 = r13
            r11 = r14
            r6.drawLine(r7, r8, r9, r10, r11)
            return
    }

    public static com.bxkj.base.util.d e() {
            com.bxkj.base.util.d r0 = com.bxkj.base.util.d.f579x
            if (r0 != 0) goto Lb
            com.bxkj.base.util.d r0 = new com.bxkj.base.util.d
            r0.<init>()
            com.bxkj.base.util.d.f579x = r0
        Lb:
            com.bxkj.base.util.d r0 = com.bxkj.base.util.d.f579x
            return r0
    }

    private int f() {
            r1 = this;
            r0 = 1
            int r0 = r1.g(r0)
            return r0
    }

    private int g(int r5) {
            r4 = this;
            java.util.Random r0 = r4.f590v
            r1 = 256(0x100, float:3.59E-43)
            int r0 = r0.nextInt(r1)
            int r0 = r0 / r5
            java.util.Random r2 = r4.f590v
            int r2 = r2.nextInt(r1)
            int r2 = r2 / r5
            java.util.Random r3 = r4.f590v
            int r1 = r3.nextInt(r1)
            int r1 = r1 / r5
            int r5 = android.graphics.Color.rgb(r0, r2, r1)
            return r5
    }

    private void h() {
            r4 = this;
            int r0 = r4.f588t
            int r1 = r4.f580l
            java.util.Random r2 = r4.f590v
            int r3 = r4.f581m
            int r2 = r2.nextInt(r3)
            int r1 = r1 + r2
            int r0 = r0 + r1
            r4.f588t = r0
            int r0 = r4.f582n
            java.util.Random r1 = r4.f590v
            int r2 = r4.f583o
            int r1 = r1.nextInt(r2)
            int r0 = r0 + r1
            r4.f589u = r0
            return
    }

    private void i(android.graphics.Paint r3) {
            r2 = this;
            int r0 = r2.f()
            r3.setColor(r0)
            java.util.Random r0 = r2.f590v
            boolean r0 = r0.nextBoolean()
            r3.setFakeBoldText(r0)
            java.util.Random r0 = r2.f590v
            r1 = 11
            int r0 = r0.nextInt(r1)
            int r0 = r0 / 10
            float r0 = (float) r0
            java.util.Random r1 = r2.f590v
            boolean r1 = r1.nextBoolean()
            if (r1 == 0) goto L24
            goto L25
        L24:
            float r0 = -r0
        L25:
            r3.setTextSkewX(r0)
            return
    }

    public android.graphics.Bitmap a() {
            r8 = this;
            r0 = 0
            r8.f588t = r0
            int r1 = r8.j
            int r2 = r8.k
            android.graphics.Bitmap$Config r3 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r1 = android.graphics.Bitmap.createBitmap(r1, r2, r3)
            android.graphics.Canvas r2 = new android.graphics.Canvas
            r2.<init>(r1)
            java.lang.String r3 = r8.b()
            r8.f587s = r3
            r3 = -1
            r2.drawColor(r3)
            android.graphics.Paint r3 = new android.graphics.Paint
            r3.<init>()
            int r4 = r8.f586r
            float r4 = (float) r4
            r3.setTextSize(r4)
            r4 = 0
        L28:
            java.lang.String r5 = r8.f587s
            int r5 = r5.length()
            if (r4 >= r5) goto L59
            r8.i(r3)
            r8.h()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = r8.f587s
            char r6 = r6.charAt(r4)
            r5.append(r6)
            java.lang.String r6 = ""
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            int r6 = r8.f588t
            float r6 = (float) r6
            int r7 = r8.f589u
            float r7 = (float) r7
            r2.drawText(r5, r6, r7, r3)
            int r4 = r4 + 1
            goto L28
        L59:
            int r4 = r8.f585q
            if (r0 >= r4) goto L63
            r8.c(r2, r3)
            int r0 = r0 + 1
            goto L59
        L63:
            r2.save()
            r2.restore()
            return r1
    }

    public java.lang.String d() {
            r1 = this;
            java.lang.String r0 = r1.f587s
            return r0
    }

    public int j(android.content.Context r1, float r2) {
            r0 = this;
            android.content.res.Resources r1 = r1.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.scaledDensity
            float r2 = r2 * r1
            r1 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 + r1
            int r1 = (int) r2
            return r1
    }
}
