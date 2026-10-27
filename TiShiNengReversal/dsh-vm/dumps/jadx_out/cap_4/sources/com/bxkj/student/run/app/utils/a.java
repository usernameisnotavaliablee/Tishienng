package com.bxkj.student.run.app.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class a {
    private int a;
    private float b;
    private float c;
    private double d;
    private double e;
    private double f;
    private double g;
    private double h;
    private double i;
    private double j;
    private double k;

    /* renamed from: l, reason: collision with root package name */
    private double f1247l;

    /* renamed from: m, reason: collision with root package name */
    private double f1248m;

    /* renamed from: n, reason: collision with root package name */
    private double f1249n;

    /* renamed from: o, reason: collision with root package name */
    private double f1250o;

    /* renamed from: p, reason: collision with root package name */
    private double f1251p;

    /* renamed from: q, reason: collision with root package name */
    private double f1252q;

    /* renamed from: r, reason: collision with root package name */
    private double f1253r;

    /* renamed from: s, reason: collision with root package name */
    private double f1254s;

    public a() {
            r2 = this;
            r2.<init>()
            r0 = 3
            r2.a = r0
            r0 = 1050253722(0x3e99999a, float:0.3)
            r2.b = r0
            r0 = 1092616192(0x41200000, float:10.0)
            r2.c = r0
            r0 = 0
            r2.f1253r = r0
            r2.f1254s = r0
            return
    }

    private static double a(com.amap.api.maps.model.LatLng r19, com.amap.api.maps.model.LatLng r20, com.amap.api.maps.model.LatLng r21) {
            r0 = r19
            r1 = r20
            r2 = r21
            double r3 = r0.longitude
            double r5 = r1.longitude
            double r3 = r3 - r5
            double r7 = r0.latitude
            double r9 = r1.latitude
            double r7 = r7 - r9
            double r11 = r2.longitude
            double r13 = r11 - r5
            double r1 = r2.latitude
            double r15 = r1 - r9
            double r3 = r3 * r13
            double r7 = r7 * r15
            double r3 = r3 + r7
            double r7 = r13 * r13
            double r17 = r15 * r15
            double r7 = r7 + r17
            double r3 = r3 / r7
            r7 = 0
            int r17 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r17 < 0) goto L42
            int r7 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r7 != 0) goto L33
            int r7 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r7 != 0) goto L33
            goto L42
        L33:
            r7 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r17 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r17 <= 0) goto L3c
            r9 = r1
            r5 = r11
            goto L42
        L3c:
            double r13 = r13 * r3
            double r5 = r5 + r13
            double r3 = r3 * r15
            double r9 = r9 + r3
        L42:
            com.amap.api.maps.model.LatLng r1 = new com.amap.api.maps.model.LatLng
            r1.<init>(r9, r5)
            float r0 = com.amap.api.maps.AMapUtils.calculateLineDistance(r0, r1)
            double r0 = (double) r0
            return r0
    }

    private static com.amap.api.maps.model.LatLng c(java.util.List<com.amap.api.maps.model.LatLng> r1) {
            if (r1 == 0) goto L16
            int r0 = r1.size()
            if (r0 != 0) goto L9
            goto L16
        L9:
            int r0 = r1.size()
            int r0 = r0 + (-1)
            java.lang.Object r1 = r1.get(r0)
            com.amap.api.maps.model.LatLng r1 = (com.amap.api.maps.model.LatLng) r1
            return r1
        L16:
            r1 = 0
            return r1
    }

    private void e() {
            r2 = this;
            r0 = 4562254508917369340(0x3f50624dd2f1a9fc, double:0.001)
            r2.j = r0
            r2.k = r0
            r0 = 4558395072277036088(0x3f42ac2ab4f6bc38, double:5.698402909980532E-4)
            r2.f1247l = r0
            r2.f1248m = r0
            return
    }

    private com.amap.api.maps.model.LatLng f(double r3, double r5, double r7, double r9) {
            r2 = this;
            r2.d = r3
            r2.e = r5
            double r3 = r2.j
            double r3 = r3 * r3
            double r5 = r2.f1247l
            double r5 = r5 * r5
            double r3 = r3 + r5
            double r3 = java.lang.Math.sqrt(r3)
            double r5 = r2.f1254s
            double r3 = r3 + r5
            r2.f1249n = r3
            double r5 = r3 * r3
            double r3 = r3 * r3
            double r0 = r2.j
            double r0 = r0 * r0
            double r3 = r3 + r0
            double r5 = r5 / r3
            double r3 = java.lang.Math.sqrt(r5)
            double r5 = r2.f1253r
            double r3 = r3 + r5
            r2.f1251p = r3
            double r5 = r2.e
            double r0 = r2.d
            double r5 = r5 - r0
            double r5 = r5 * r3
            double r5 = r5 + r0
            r2.h = r5
            r5 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r3 = r5 - r3
            double r0 = r2.f1249n
            double r3 = r3 * r0
            double r3 = r3 * r0
            double r3 = java.lang.Math.sqrt(r3)
            r2.f1247l = r3
            r2.f = r7
            r2.g = r9
            double r3 = r2.k
            double r3 = r3 * r3
            double r7 = r2.f1248m
            double r7 = r7 * r7
            double r3 = r3 + r7
            double r3 = java.lang.Math.sqrt(r3)
            double r7 = r2.f1254s
            double r3 = r3 + r7
            r2.f1250o = r3
            double r7 = r3 * r3
            double r3 = r3 * r3
            double r9 = r2.k
            double r9 = r9 * r9
            double r3 = r3 + r9
            double r7 = r7 / r3
            double r3 = java.lang.Math.sqrt(r7)
            double r7 = r2.f1253r
            double r3 = r3 + r7
            r2.f1252q = r3
            double r7 = r2.g
            double r9 = r2.f
            double r7 = r7 - r9
            double r7 = r7 * r3
            double r7 = r7 + r9
            r2.i = r7
            double r5 = r5 - r3
            double r3 = r2.f1250o
            double r5 = r5 * r3
            double r5 = r5 * r3
            double r3 = java.lang.Math.sqrt(r5)
            r2.f1248m = r3
            com.amap.api.maps.model.LatLng r3 = new com.amap.api.maps.model.LatLng
            double r4 = r2.i
            double r6 = r2.h
            r3.<init>(r4, r6)
            return r3
    }

    private java.util.List<com.amap.api.maps.model.LatLng> h(java.util.List<com.amap.api.maps.model.LatLng> r5, int r6) {
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r5 == 0) goto L36
            int r1 = r5.size()
            r2 = 2
            if (r1 > r2) goto Lf
            goto L36
        Lf:
            r4.e()
            r1 = 0
            java.lang.Object r1 = r5.get(r1)
            com.amap.api.maps.model.LatLng r1 = (com.amap.api.maps.model.LatLng) r1
            r0.add(r1)
            r2 = 1
        L1d:
            int r3 = r5.size()
            if (r2 >= r3) goto L36
            java.lang.Object r3 = r5.get(r2)
            com.amap.api.maps.model.LatLng r3 = (com.amap.api.maps.model.LatLng) r3
            com.amap.api.maps.model.LatLng r3 = r4.j(r1, r3, r6)
            if (r3 == 0) goto L33
            r0.add(r3)
            r1 = r3
        L33:
            int r2 = r2 + 1
            goto L1d
        L36:
            return r0
    }

    private com.amap.api.maps.model.LatLng j(com.amap.api.maps.model.LatLng r12, com.amap.api.maps.model.LatLng r13, int r14) {
            r11 = this;
            double r0 = r11.j
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto Le
            double r0 = r11.k
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L11
        Le:
            r11.e()
        L11:
            r0 = 0
            if (r12 == 0) goto L34
            if (r13 != 0) goto L17
            goto L34
        L17:
            r1 = 1
            if (r14 >= r1) goto L1c
            r14 = 1
            goto L20
        L1c:
            r1 = 5
            if (r14 <= r1) goto L20
            r14 = 5
        L20:
            r1 = 0
        L21:
            if (r1 >= r14) goto L34
            double r3 = r12.longitude
            double r5 = r13.longitude
            double r7 = r12.latitude
            double r9 = r13.latitude
            r2 = r11
            com.amap.api.maps.model.LatLng r0 = r2.f(r3, r5, r7, r9)
            int r1 = r1 + 1
            r13 = r0
            goto L21
        L34:
            return r0
    }

    private java.util.List<com.amap.api.maps.model.LatLng> l(java.util.List<com.amap.api.maps.model.LatLng> r9, float r10) {
            r8 = this;
            if (r9 != 0) goto L4
            r9 = 0
            return r9
        L4:
            int r0 = r9.size()
            r1 = 2
            if (r0 > r1) goto Lc
            return r9
        Lc:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
        L12:
            int r2 = r9.size()
            if (r1 >= r2) goto L48
            com.amap.api.maps.model.LatLng r2 = c(r0)
            java.lang.Object r3 = r9.get(r1)
            com.amap.api.maps.model.LatLng r3 = (com.amap.api.maps.model.LatLng) r3
            if (r2 == 0) goto L42
            int r4 = r9.size()
            int r4 = r4 + (-1)
            if (r1 != r4) goto L2d
            goto L42
        L2d:
            int r4 = r1 + 1
            java.lang.Object r4 = r9.get(r4)
            com.amap.api.maps.model.LatLng r4 = (com.amap.api.maps.model.LatLng) r4
            double r4 = a(r3, r2, r4)
            double r6 = (double) r10
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 >= 0) goto L45
            r0.add(r3)
            goto L45
        L42:
            r0.add(r3)
        L45:
            int r1 = r1 + 1
            goto L12
        L48:
            return r0
    }

    private java.util.List<com.amap.api.maps.model.LatLng> n(java.util.List<com.amap.api.maps.model.LatLng> r9, float r10) {
            r8 = this;
            if (r9 != 0) goto L4
            r9 = 0
            return r9
        L4:
            int r0 = r9.size()
            r1 = 2
            if (r0 > r1) goto Lc
            return r9
        Lc:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
        L12:
            int r2 = r9.size()
            if (r1 >= r2) goto L48
            com.amap.api.maps.model.LatLng r2 = c(r0)
            java.lang.Object r3 = r9.get(r1)
            com.amap.api.maps.model.LatLng r3 = (com.amap.api.maps.model.LatLng) r3
            if (r2 == 0) goto L42
            int r4 = r9.size()
            int r4 = r4 + (-1)
            if (r1 != r4) goto L2d
            goto L42
        L2d:
            int r4 = r1 + 1
            java.lang.Object r4 = r9.get(r4)
            com.amap.api.maps.model.LatLng r4 = (com.amap.api.maps.model.LatLng) r4
            double r4 = a(r3, r2, r4)
            double r6 = (double) r10
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 <= 0) goto L45
            r0.add(r3)
            goto L45
        L42:
            r0.add(r3)
        L45:
            int r1 = r1 + 1
            goto L12
        L48:
            return r0
    }

    public int b() {
            r1 = this;
            int r0 = r1.a
            return r0
    }

    public float d() {
            r1 = this;
            float r0 = r1.b
            return r0
    }

    public java.util.List<com.amap.api.maps.model.LatLng> g(java.util.List<com.amap.api.maps.model.LatLng> r2) {
            r1 = this;
            int r0 = r1.a
            java.util.List r2 = r1.h(r2, r0)
            return r2
    }

    public com.amap.api.maps.model.LatLng i(com.amap.api.maps.model.LatLng r2, com.amap.api.maps.model.LatLng r3) {
            r1 = this;
            int r0 = r1.a
            com.amap.api.maps.model.LatLng r2 = r1.j(r2, r3, r0)
            return r2
    }

    public java.util.List<com.amap.api.maps.model.LatLng> k(java.util.List<com.amap.api.maps.model.LatLng> r2) {
            r1 = this;
            java.util.List r2 = r1.o(r2)
            int r0 = r1.a
            java.util.List r2 = r1.h(r2, r0)
            float r0 = r1.b
            java.util.List r2 = r1.n(r2, r0)
            return r2
    }

    public java.util.List<com.amap.api.maps.model.LatLng> m(java.util.List<com.amap.api.maps.model.LatLng> r2) {
            r1 = this;
            float r0 = r1.b
            java.util.List r2 = r1.n(r2, r0)
            return r2
    }

    public java.util.List<com.amap.api.maps.model.LatLng> o(java.util.List<com.amap.api.maps.model.LatLng> r2) {
            r1 = this;
            float r0 = r1.c
            java.util.List r2 = r1.l(r2, r0)
            return r2
    }

    public void p(int r1) {
            r0 = this;
            r0.a = r1
            return
    }

    public void q(float r1) {
            r0 = this;
            r0.c = r1
            return
    }

    public void r(float r1) {
            r0 = this;
            r0.b = r1
            return
    }
}
