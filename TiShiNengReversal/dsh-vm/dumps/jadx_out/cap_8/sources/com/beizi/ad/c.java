package com.beizi.ad;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class c {
    public static final com.beizi.ad.c a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final com.beizi.ad.c f6522b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final com.beizi.ad.c f6523c = null;

    /* renamed from: d, reason: collision with root package name */
    public static final com.beizi.ad.c f6524d = null;

    /* renamed from: e, reason: collision with root package name */
    public static final com.beizi.ad.c f6525e = null;

    /* renamed from: f, reason: collision with root package name */
    public static final com.beizi.ad.c f6526f = null;

    /* renamed from: g, reason: collision with root package name */
    public static final com.beizi.ad.c f6527g = null;

    /* renamed from: h, reason: collision with root package name */
    public static final com.beizi.ad.c f6528h = null;

    /* renamed from: i, reason: collision with root package name */
    public static final com.beizi.ad.c f6529i = null;

    /* renamed from: j, reason: collision with root package name */
    private final int f6530j;

    /* renamed from: k, reason: collision with root package name */
    private final int f6531k;
    private final java.lang.String l;

    static {
            com.beizi.ad.c r0 = new com.beizi.ad.c
            r1 = 50
            java.lang.String r2 = "320x50_mb"
            r3 = 320(0x140, float:4.48E-43)
            r0.<init>(r3, r1, r2)
            com.beizi.ad.c.a = r0
            com.beizi.ad.c r0 = new com.beizi.ad.c
            r1 = 60
            java.lang.String r2 = "468x60_as"
            r4 = 468(0x1d4, float:6.56E-43)
            r0.<init>(r4, r1, r2)
            com.beizi.ad.c.f6522b = r0
            com.beizi.ad.c r0 = new com.beizi.ad.c
            r1 = 100
            java.lang.String r2 = "320x100_as"
            r0.<init>(r3, r1, r2)
            com.beizi.ad.c.f6523c = r0
            com.beizi.ad.c r0 = new com.beizi.ad.c
            r1 = 90
            java.lang.String r2 = "728x90_as"
            r3 = 728(0x2d8, float:1.02E-42)
            r0.<init>(r3, r1, r2)
            com.beizi.ad.c.f6524d = r0
            com.beizi.ad.c r0 = new com.beizi.ad.c
            r1 = 250(0xfa, float:3.5E-43)
            java.lang.String r2 = "300x250_as"
            r3 = 300(0x12c, float:4.2E-43)
            r0.<init>(r3, r1, r2)
            com.beizi.ad.c.f6525e = r0
            com.beizi.ad.c r0 = new com.beizi.ad.c
            r1 = 600(0x258, float:8.41E-43)
            java.lang.String r2 = "160x600_as"
            r3 = 160(0xa0, float:2.24E-43)
            r0.<init>(r3, r1, r2)
            com.beizi.ad.c.f6526f = r0
            com.beizi.ad.c r0 = new com.beizi.ad.c
            r1 = -2
            java.lang.String r2 = "smart_banner"
            r3 = -1
            r0.<init>(r3, r1, r2)
            com.beizi.ad.c.f6527g = r0
            com.beizi.ad.c r0 = new com.beizi.ad.c
            r1 = -4
            java.lang.String r2 = "fluid"
            r3 = -3
            r0.<init>(r3, r1, r2)
            com.beizi.ad.c.f6528h = r0
            com.beizi.ad.c r0 = new com.beizi.ad.c
            r1 = 0
            java.lang.String r2 = "search_v2"
            r0.<init>(r3, r1, r2)
            com.beizi.ad.c.f6529i = r0
            return
    }

    public c(int r3, int r4) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = -1
            if (r3 != r1) goto Lb
            java.lang.String r1 = "FULL"
            goto Lf
        Lb:
            java.lang.String r1 = java.lang.String.valueOf(r3)
        Lf:
            r0.append(r1)
            java.lang.String r1 = "x"
            r0.append(r1)
            r1 = -2
            if (r4 != r1) goto L1d
            java.lang.String r1 = "AUTO"
            goto L21
        L1d:
            java.lang.String r1 = java.lang.String.valueOf(r4)
        L21:
            r0.append(r1)
            java.lang.String r1 = "_as"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r2.<init>(r3, r4, r0)
            return
    }

    private c(int r2, int r3, java.lang.String r4) {
            r1 = this;
            r1.<init>()
            if (r2 >= 0) goto L23
            r0 = -1
            if (r2 == r0) goto L23
            r0 = -3
            if (r2 != r0) goto Lc
            goto L23
        Lc:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "Invalid width for AdSize: "
            r4.append(r0)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r3.<init>(r2)
            throw r3
        L23:
            if (r3 >= 0) goto L43
            r0 = -2
            if (r3 == r0) goto L43
            r0 = -4
            if (r3 != r0) goto L2c
            goto L43
        L2c:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "Invalid height for AdSize: "
            r4.append(r0)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r2.<init>(r3)
            throw r2
        L43:
            r1.f6530j = r2
            r1.f6531k = r3
            r1.l = r4
            return
    }

    public int a() {
            r1 = this;
            int r0 = r1.f6531k
            return r0
    }

    public int a(android.content.Context r3) {
            r2 = this;
            int r0 = r2.f6531k
            r1 = -4
            if (r0 == r1) goto L26
            r1 = -3
            if (r0 == r1) goto L26
            r1 = -2
            if (r0 == r1) goto L1b
            float r0 = (float) r0
            android.content.res.Resources r3 = r3.getResources()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            r1 = 1
            float r3 = android.util.TypedValue.applyDimension(r1, r0, r3)
            int r3 = (int) r3
            return r3
        L1b:
            android.content.res.Resources r3 = r3.getResources()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            int r3 = r3.heightPixels
            return r3
        L26:
            r3 = -1
            return r3
    }

    public int b() {
            r1 = this;
            int r0 = r1.f6530j
            return r0
    }

    public int b(android.content.Context r4) {
            r3 = this;
            int r0 = r3.f6530j
            r1 = -4
            r2 = -1
            if (r0 == r1) goto L26
            r1 = -3
            if (r0 == r1) goto L26
            if (r0 == r2) goto L1b
            float r0 = (float) r0
            android.content.res.Resources r4 = r4.getResources()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            r1 = 1
            float r4 = android.util.TypedValue.applyDimension(r1, r0, r4)
            int r4 = (int) r4
            return r4
        L1b:
            android.content.res.Resources r4 = r4.getResources()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            int r4 = r4.widthPixels
            return r4
        L26:
            return r2
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.beizi.ad.c
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.beizi.ad.c r5 = (com.beizi.ad.c) r5
            int r1 = r4.f6530j
            int r3 = r5.f6530j
            if (r1 != r3) goto L23
            int r1 = r4.f6531k
            int r3 = r5.f6531k
            if (r1 != r3) goto L23
            java.lang.String r1 = r4.l
            java.lang.String r5 = r5.l
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L23
            return r0
        L23:
            return r2
    }

    public int hashCode() {
            r1 = this;
            java.lang.String r0 = r1.l
            int r0 = r0.hashCode()
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.l
            return r0
    }
}
