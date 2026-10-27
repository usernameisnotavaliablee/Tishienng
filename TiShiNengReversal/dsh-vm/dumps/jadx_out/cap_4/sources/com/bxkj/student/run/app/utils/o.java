package com.bxkj.student.run.app.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class o {
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
    private double f1268l;

    /* renamed from: m, reason: collision with root package name */
    private double f1269m;

    /* renamed from: n, reason: collision with root package name */
    private double f1270n;

    /* renamed from: o, reason: collision with root package name */
    private double f1271o;

    /* renamed from: p, reason: collision with root package name */
    private double f1272p;

    /* renamed from: q, reason: collision with root package name */
    private double f1273q;

    /* renamed from: r, reason: collision with root package name */
    private double f1274r;

    /* renamed from: s, reason: collision with root package name */
    private double f1275s;

    public o() {
            r2 = this;
            r2.<init>()
            r0 = 3
            r2.a = r0
            r0 = 1050253722(0x3e99999a, float:0.3)
            r2.b = r0
            r0 = 1092616192(0x41200000, float:10.0)
            r2.c = r0
            r0 = 0
            r2.f1274r = r0
            r2.f1275s = r0
            return
    }

    private static double a(com.bxkj.student.run.app.location.LatLngTimeSpeed r11, com.bxkj.student.run.app.location.LatLngTimeSpeed r12, com.bxkj.student.run.app.location.LatLngTimeSpeed r13) {
            double r0 = r11.getLongitude()
            double r2 = r12.getLongitude()
            double r0 = r0 - r2
            double r2 = r11.getLatitude()
            double r4 = r12.getLatitude()
            double r2 = r2 - r4
            double r4 = r13.getLongitude()
            double r6 = r12.getLongitude()
            double r4 = r4 - r6
            double r6 = r13.getLatitude()
            double r8 = r12.getLatitude()
            double r6 = r6 - r8
            double r0 = r0 * r4
            double r2 = r2 * r6
            double r0 = r0 + r2
            double r2 = r4 * r4
            double r8 = r6 * r6
            double r2 = r2 + r8
            double r0 = r0 / r2
            r2 = 0
            int r8 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r8 < 0) goto L6d
            double r2 = r12.getLongitude()
            double r8 = r13.getLongitude()
            int r10 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r10 != 0) goto L4e
            double r2 = r12.getLatitude()
            double r8 = r13.getLatitude()
            int r10 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r10 != 0) goto L4e
            goto L6d
        L4e:
            r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r8 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r8 <= 0) goto L5d
            double r0 = r13.getLongitude()
            double r12 = r13.getLatitude()
            goto L75
        L5d:
            double r2 = r12.getLongitude()
            double r4 = r4 * r0
            double r2 = r2 + r4
            double r12 = r12.getLatitude()
            double r0 = r0 * r6
            double r12 = r12 + r0
            r0 = r2
            goto L75
        L6d:
            double r0 = r12.getLongitude()
            double r12 = r12.getLatitude()
        L75:
            com.amap.api.maps.model.LatLng r2 = new com.amap.api.maps.model.LatLng
            double r3 = r11.getLatitude()
            double r5 = r11.getLongitude()
            r2.<init>(r3, r5)
            com.amap.api.maps.model.LatLng r11 = new com.amap.api.maps.model.LatLng
            r11.<init>(r12, r0)
            float r11 = com.amap.api.maps.AMapUtils.calculateLineDistance(r2, r11)
            double r11 = (double) r11
            return r11
    }

    private static com.bxkj.student.run.app.location.LatLngTimeSpeed c(java.util.List<com.bxkj.student.run.app.location.LatLngTimeSpeed> r1) {
            if (r1 == 0) goto L16
            int r0 = r1.size()
            if (r0 != 0) goto L9
            goto L16
        L9:
            int r0 = r1.size()
            int r0 = r0 + (-1)
            java.lang.Object r1 = r1.get(r0)
            com.bxkj.student.run.app.location.LatLngTimeSpeed r1 = (com.bxkj.student.run.app.location.LatLngTimeSpeed) r1
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
            r2.f1268l = r0
            r2.f1269m = r0
            return
    }

    private com.bxkj.student.run.app.location.LatLngTimeSpeed f(double r11, double r13, double r15, double r17, float r19, float r20, long r21, long r23, boolean r25, int r26) {
            r10 = this;
            r10.d = r11
            r10.e = r13
            double r11 = r10.j
            double r11 = r11 * r11
            double r0 = r10.f1268l
            double r0 = r0 * r0
            double r11 = r11 + r0
            double r11 = java.lang.Math.sqrt(r11)
            double r0 = r10.f1275s
            double r11 = r11 + r0
            r10.f1270n = r11
            double r0 = r11 * r11
            double r11 = r11 * r11
            double r2 = r10.j
            double r2 = r2 * r2
            double r11 = r11 + r2
            double r0 = r0 / r11
            double r11 = java.lang.Math.sqrt(r0)
            double r0 = r10.f1274r
            double r11 = r11 + r0
            r10.f1272p = r11
            double r0 = r10.e
            double r2 = r10.d
            double r0 = r0 - r2
            double r0 = r0 * r11
            double r0 = r0 + r2
            r10.h = r0
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r11 = r0 - r11
            double r2 = r10.f1270n
            double r11 = r11 * r2
            double r11 = r11 * r2
            double r11 = java.lang.Math.sqrt(r11)
            r10.f1268l = r11
            r11 = r15
            r10.f = r11
            r11 = r17
            r10.g = r11
            double r11 = r10.k
            double r11 = r11 * r11
            double r2 = r10.f1269m
            double r2 = r2 * r2
            double r11 = r11 + r2
            double r11 = java.lang.Math.sqrt(r11)
            double r2 = r10.f1275s
            double r11 = r11 + r2
            r10.f1271o = r11
            double r2 = r11 * r11
            double r11 = r11 * r11
            double r4 = r10.k
            double r4 = r4 * r4
            double r11 = r11 + r4
            double r2 = r2 / r11
            double r11 = java.lang.Math.sqrt(r2)
            double r2 = r10.f1274r
            double r11 = r11 + r2
            r10.f1273q = r11
            double r2 = r10.g
            double r4 = r10.f
            double r2 = r2 - r4
            double r2 = r2 * r11
            double r2 = r2 + r4
            r10.i = r2
            double r0 = r0 - r11
            double r11 = r10.f1271o
            double r0 = r0 * r11
            double r0 = r0 * r11
            double r11 = java.lang.Math.sqrt(r0)
            r10.f1269m = r11
            com.bxkj.student.run.app.location.LatLngTimeSpeed r0 = new com.bxkj.student.run.app.location.LatLngTimeSpeed
            double r1 = r10.i
            double r3 = r10.h
            r7 = r20
            r5 = r23
            r8 = r25
            r9 = r26
            r0.<init>(r1, r3, r5, r7, r8, r9)
            return r0
    }

    private java.util.List<com.bxkj.student.run.app.location.LatLngTimeSpeed> h(java.util.List<com.bxkj.student.run.app.location.LatLngTimeSpeed> r5, int r6) {
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
            com.bxkj.student.run.app.location.LatLngTimeSpeed r1 = (com.bxkj.student.run.app.location.LatLngTimeSpeed) r1
            r0.add(r1)
            r2 = 1
        L1d:
            int r3 = r5.size()
            if (r2 >= r3) goto L36
            java.lang.Object r3 = r5.get(r2)
            com.bxkj.student.run.app.location.LatLngTimeSpeed r3 = (com.bxkj.student.run.app.location.LatLngTimeSpeed) r3
            com.bxkj.student.run.app.location.LatLngTimeSpeed r3 = r4.j(r1, r3, r6)
            if (r3 == 0) goto L33
            r0.add(r3)
            r1 = r3
        L33:
            int r2 = r2 + 1
            goto L1d
        L36:
            return r0
    }

    private com.bxkj.student.run.app.location.LatLngTimeSpeed j(com.bxkj.student.run.app.location.LatLngTimeSpeed r20, com.bxkj.student.run.app.location.LatLngTimeSpeed r21, int r22) {
            r19 = this;
            r1 = r19
            r0 = r22
            double r2 = r1.j
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L12
            double r2 = r1.k
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L15
        L12:
            r1.e()
        L15:
            r2 = 0
            if (r20 == 0) goto L6f
            if (r21 != 0) goto L1b
            goto L6f
        L1b:
            r3 = 1
            if (r0 >= r3) goto L20
            r0 = 1
            goto L24
        L20:
            r3 = 5
            if (r0 <= r3) goto L24
            r0 = 5
        L24:
            r3 = 0
            r3 = r2
            r4 = 0
            r2 = r21
        L29:
            if (r4 >= r0) goto L6e
            r5 = r2
            double r2 = r20.getLongitude()
            r6 = r4
            r7 = r5
            double r4 = r7.getLongitude()
            r8 = r6
            r9 = r7
            double r6 = r20.getLatitude()
            r10 = r8
            r11 = r9
            double r8 = r11.getLatitude()
            r12 = r10
            float r10 = r20.getSpeed()
            r13 = r11
            float r11 = r13.getSpeed()
            r14 = r12
            r15 = r13
            long r12 = r20.getTime()
            r16 = r14
            r17 = r15
            long r14 = r17.getTime()
            r18 = r16
            boolean r16 = r17.isPuase()
            int r17 = r17.getLocationType()
            com.bxkj.student.run.app.location.LatLngTimeSpeed r3 = r1.f(r2, r4, r6, r8, r10, r11, r12, r14, r16, r17)
            int r4 = r18 + 1
            r1 = r19
            r2 = r3
            goto L29
        L6e:
            return r3
        L6f:
            return r2
    }

    private java.util.List<com.bxkj.student.run.app.location.LatLngTimeSpeed> l(java.util.List<com.bxkj.student.run.app.location.LatLngTimeSpeed> r9, float r10) {
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
            com.bxkj.student.run.app.location.LatLngTimeSpeed r2 = c(r0)
            java.lang.Object r3 = r9.get(r1)
            com.bxkj.student.run.app.location.LatLngTimeSpeed r3 = (com.bxkj.student.run.app.location.LatLngTimeSpeed) r3
            if (r2 == 0) goto L42
            int r4 = r9.size()
            int r4 = r4 + (-1)
            if (r1 != r4) goto L2d
            goto L42
        L2d:
            int r4 = r1 + 1
            java.lang.Object r4 = r9.get(r4)
            com.bxkj.student.run.app.location.LatLngTimeSpeed r4 = (com.bxkj.student.run.app.location.LatLngTimeSpeed) r4
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

    private java.util.List<com.bxkj.student.run.app.location.LatLngTimeSpeed> n(java.util.List<com.bxkj.student.run.app.location.LatLngTimeSpeed> r9, float r10) {
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
            com.bxkj.student.run.app.location.LatLngTimeSpeed r2 = c(r0)
            java.lang.Object r3 = r9.get(r1)
            com.bxkj.student.run.app.location.LatLngTimeSpeed r3 = (com.bxkj.student.run.app.location.LatLngTimeSpeed) r3
            if (r2 == 0) goto L42
            int r4 = r9.size()
            int r4 = r4 + (-1)
            if (r1 != r4) goto L2d
            goto L42
        L2d:
            int r4 = r1 + 1
            java.lang.Object r4 = r9.get(r4)
            com.bxkj.student.run.app.location.LatLngTimeSpeed r4 = (com.bxkj.student.run.app.location.LatLngTimeSpeed) r4
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

    public java.util.List<com.bxkj.student.run.app.location.LatLngTimeSpeed> g(java.util.List<com.bxkj.student.run.app.location.LatLngTimeSpeed> r2) {
            r1 = this;
            int r0 = r1.a
            java.util.List r2 = r1.h(r2, r0)
            return r2
    }

    public com.bxkj.student.run.app.location.LatLngTimeSpeed i(com.bxkj.student.run.app.location.LatLngTimeSpeed r2, com.bxkj.student.run.app.location.LatLngTimeSpeed r3) {
            r1 = this;
            int r0 = r1.a
            com.bxkj.student.run.app.location.LatLngTimeSpeed r2 = r1.j(r2, r3, r0)
            return r2
    }

    public java.util.List<com.bxkj.student.run.app.location.LatLngTimeSpeed> k(java.util.List<com.bxkj.student.run.app.location.LatLngTimeSpeed> r2) {
            r1 = this;
            java.util.List r2 = r1.o(r2)
            int r0 = r1.a
            java.util.List r2 = r1.h(r2, r0)
            float r0 = r1.b
            java.util.List r2 = r1.n(r2, r0)
            return r2
    }

    public java.util.List<com.bxkj.student.run.app.location.LatLngTimeSpeed> m(java.util.List<com.bxkj.student.run.app.location.LatLngTimeSpeed> r2) {
            r1 = this;
            float r0 = r1.b
            java.util.List r2 = r1.n(r2, r0)
            return r2
    }

    public java.util.List<com.bxkj.student.run.app.location.LatLngTimeSpeed> o(java.util.List<com.bxkj.student.run.app.location.LatLngTimeSpeed> r2) {
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
