package com.amap.api.col.s;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class q {
    private static volatile com.amap.api.col.s.q r;
    boolean a;

    /* renamed from: b, reason: collision with root package name */
    boolean f4613b;

    /* renamed from: c, reason: collision with root package name */
    boolean f4614c;

    /* renamed from: d, reason: collision with root package name */
    boolean f4615d;

    /* renamed from: e, reason: collision with root package name */
    boolean f4616e;

    /* renamed from: f, reason: collision with root package name */
    boolean f4617f;

    /* renamed from: g, reason: collision with root package name */
    boolean f4618g;

    /* renamed from: h, reason: collision with root package name */
    int f4619h;

    /* renamed from: i, reason: collision with root package name */
    int f4620i;

    /* renamed from: j, reason: collision with root package name */
    int f4621j;

    /* renamed from: k, reason: collision with root package name */
    int f4622k;
    int l;
    int m;
    int n;
    int o;
    int p;
    int q;

    public q() {
            r2 = this;
            r2.<init>()
            r0 = 1
            r2.a = r0
            r2.f4613b = r0
            r2.f4614c = r0
            r2.f4615d = r0
            r2.f4616e = r0
            r2.f4617f = r0
            r2.f4618g = r0
            r0 = 25
            r2.f4619h = r0
            r0 = 100
            r2.f4620i = r0
            r2.f4621j = r0
            r2.f4622k = r0
            r1 = 6
            r2.l = r1
            r2.m = r0
            r0 = 5000(0x1388, float:7.006E-42)
            r2.n = r0
            r0 = 1200(0x4b0, float:1.682E-42)
            r2.o = r0
            r0 = 100000000(0x5f5e100, float:2.3122341E-35)
            r2.p = r0
            r0 = 16
            r2.q = r0
            return
    }

    public static com.amap.api.col.s.q a() {
            com.amap.api.col.s.q r0 = com.amap.api.col.s.q.r
            if (r0 != 0) goto L19
            java.lang.Class<com.amap.api.col.s.q> r0 = com.amap.api.col.s.q.class
            monitor-enter(r0)
            com.amap.api.col.s.q r1 = com.amap.api.col.s.q.r     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.amap.api.col.s.q r1 = new com.amap.api.col.s.q     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.amap.api.col.s.q.r = r1     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r1 = move-exception
            goto L17
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            goto L19
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r1
        L19:
            com.amap.api.col.s.q r0 = com.amap.api.col.s.q.r
            return r0
    }

    public static void l(java.util.List<com.amap.api.services.core.LatLonPoint> r1) throws com.amap.api.services.core.AMapException {
            if (r1 != 0) goto L3
            goto Lb
        L3:
            int r1 = r1.size()
            r0 = 16
            if (r0 < r1) goto Lc
        Lb:
            return
        Lc:
            com.amap.api.services.core.AMapException r1 = new com.amap.api.services.core.AMapException
            java.lang.String r0 = "途经点个数超限"
            r1.<init>(r0)
            throw r1
    }

    public final void A(int r1) {
            r0 = this;
            r0.q = r1
            return
    }

    public final int B(int r2) {
            r1 = this;
            boolean r0 = r1.f4615d
            if (r0 != 0) goto L5
            goto La
        L5:
            int r0 = r1.m
            if (r0 >= r2) goto La
            return r0
        La:
            return r2
    }

    public final int C(int r2) {
            r1 = this;
            boolean r0 = r1.f4615d
            if (r0 != 0) goto L5
            goto La
        L5:
            int r0 = r1.f4619h
            if (r0 >= r2) goto La
            return r0
        La:
            return r2
    }

    public final void b(int r1) {
            r0 = this;
            r0.f4619h = r1
            return
    }

    public final void c(com.amap.api.services.route.RouteSearch.FromAndTo r5) throws com.amap.api.services.core.AMapException {
            r4 = this;
            boolean r0 = r4.f4616e
            if (r0 != 0) goto L5
            goto L37
        L5:
            if (r5 == 0) goto L37
            com.amap.api.services.core.LatLonPoint r0 = r5.getFrom()
            if (r0 == 0) goto L37
            com.amap.api.services.core.LatLonPoint r0 = r5.getTo()
            if (r0 != 0) goto L14
            goto L37
        L14:
            com.amap.api.services.core.LatLonPoint r0 = r5.getFrom()
            com.amap.api.services.core.LatLonPoint r5 = r5.getTo()
            float r5 = com.amap.api.col.s.j4.b(r0, r5)
            double r0 = (double) r5
            r2 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r0 = r0 / r2
            int r5 = r4.o
            double r2 = (double) r5
            int r5 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r5 < 0) goto L2f
            goto L37
        L2f:
            com.amap.api.services.core.AMapException r5 = new com.amap.api.services.core.AMapException
            java.lang.String r0 = "起点终点距离过长"
            r5.<init>(r0)
            throw r5
        L37:
            return
    }

    public final void d(com.amap.api.services.route.RouteSearch.FromAndTo r7, java.util.List<com.amap.api.services.core.LatLonPoint> r8) throws com.amap.api.services.core.AMapException {
            r6 = this;
            boolean r0 = r6.f4614c
            if (r0 != 0) goto L5
            goto L68
        L5:
            if (r7 == 0) goto L68
            com.amap.api.services.core.LatLonPoint r0 = r7.getFrom()
            if (r0 == 0) goto L68
            com.amap.api.services.core.LatLonPoint r0 = r7.getTo()
            if (r0 != 0) goto L14
            goto L68
        L14:
            if (r8 == 0) goto L45
            int r0 = r8.size()
            if (r0 == 0) goto L45
            com.amap.api.services.core.LatLonPoint r0 = r7.getFrom()
            com.amap.api.services.core.LatLonPoint r7 = r7.getTo()
            java.util.Iterator r8 = r8.iterator()
            r1 = 0
        L2a:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto L3e
            java.lang.Object r3 = r8.next()
            com.amap.api.services.core.LatLonPoint r3 = (com.amap.api.services.core.LatLonPoint) r3
            float r0 = com.amap.api.col.s.j4.b(r0, r3)
            double r4 = (double) r0
            double r1 = r1 + r4
            r0 = r3
            goto L2a
        L3e:
            float r7 = com.amap.api.col.s.j4.b(r0, r7)
            double r7 = (double) r7
            double r1 = r1 + r7
            goto L52
        L45:
            com.amap.api.services.core.LatLonPoint r8 = r7.getFrom()
            com.amap.api.services.core.LatLonPoint r7 = r7.getTo()
            float r7 = com.amap.api.col.s.j4.b(r8, r7)
            double r1 = (double) r7
        L52:
            r7 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r1 = r1 / r7
            int r7 = r6.n
            double r7 = (double) r7
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 < 0) goto L60
            goto L68
        L60:
            com.amap.api.services.core.AMapException r7 = new com.amap.api.services.core.AMapException
            java.lang.String r8 = "起点终点距离过长"
            r7.<init>(r8)
            throw r7
        L68:
            return
    }

    public final void e(com.amap.api.services.route.RouteSearchV2.FromAndTo r5) throws com.amap.api.services.core.AMapException {
            r4 = this;
            boolean r0 = r4.f4616e
            if (r0 != 0) goto L5
            goto L37
        L5:
            if (r5 == 0) goto L37
            com.amap.api.services.core.LatLonPoint r0 = r5.getFrom()
            if (r0 == 0) goto L37
            com.amap.api.services.core.LatLonPoint r0 = r5.getTo()
            if (r0 != 0) goto L14
            goto L37
        L14:
            com.amap.api.services.core.LatLonPoint r0 = r5.getFrom()
            com.amap.api.services.core.LatLonPoint r5 = r5.getTo()
            float r5 = com.amap.api.col.s.j4.b(r0, r5)
            double r0 = (double) r5
            r2 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r0 = r0 / r2
            int r5 = r4.o
            double r2 = (double) r5
            int r5 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r5 < 0) goto L2f
            goto L37
        L2f:
            com.amap.api.services.core.AMapException r5 = new com.amap.api.services.core.AMapException
            java.lang.String r0 = "起点终点距离过长"
            r5.<init>(r0)
            throw r5
        L37:
            return
    }

    public final void f(java.lang.String r2) throws com.amap.api.services.core.AMapException {
            r1 = this;
            if (r2 != 0) goto L3
            goto L10
        L3:
            boolean r0 = r1.f4613b
            if (r0 != 0) goto L8
            goto L10
        L8:
            int r2 = r2.length()
            int r0 = r1.f4620i
            if (r2 > r0) goto L11
        L10:
            return
        L11:
            com.amap.api.services.core.AMapException r2 = new com.amap.api.services.core.AMapException
            java.lang.String r0 = "关键字过长"
            r2.<init>(r0)
            throw r2
    }

    public final void g(java.util.List<com.amap.api.services.core.LatLonPoint> r2) throws com.amap.api.services.core.AMapException {
            r1 = this;
            boolean r0 = r1.f4618g
            if (r0 != 0) goto L5
            goto L10
        L5:
            if (r2 != 0) goto L8
            goto L10
        L8:
            int r2 = r2.size()
            int r0 = r1.l
            if (r0 < r2) goto L11
        L10:
            return
        L11:
            com.amap.api.services.core.AMapException r2 = new com.amap.api.services.core.AMapException
            java.lang.String r0 = "途经点个数超限"
            r2.<init>(r0)
            throw r2
    }

    public final void h(boolean r1) {
            r0 = this;
            r0.a = r1
            return
    }

    public final void i(int r1) {
            r0 = this;
            r0.f4620i = r1
            return
    }

    public final void j(com.amap.api.services.route.RouteSearch.FromAndTo r5) throws com.amap.api.services.core.AMapException {
            r4 = this;
            boolean r0 = r4.f4617f
            if (r0 != 0) goto L5
            goto L37
        L5:
            if (r5 == 0) goto L37
            com.amap.api.services.core.LatLonPoint r0 = r5.getFrom()
            if (r0 == 0) goto L37
            com.amap.api.services.core.LatLonPoint r0 = r5.getTo()
            if (r0 != 0) goto L14
            goto L37
        L14:
            com.amap.api.services.core.LatLonPoint r0 = r5.getFrom()
            com.amap.api.services.core.LatLonPoint r5 = r5.getTo()
            float r5 = com.amap.api.col.s.j4.b(r0, r5)
            double r0 = (double) r5
            r2 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r0 = r0 / r2
            int r5 = r4.f4622k
            double r2 = (double) r5
            int r5 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r5 < 0) goto L2f
            goto L37
        L2f:
            com.amap.api.services.core.AMapException r5 = new com.amap.api.services.core.AMapException
            java.lang.String r0 = "起点终点距离过长"
            r5.<init>(r0)
            throw r5
        L37:
            return
    }

    public final void k(com.amap.api.services.route.RouteSearchV2.FromAndTo r5) throws com.amap.api.services.core.AMapException {
            r4 = this;
            boolean r0 = r4.f4617f
            if (r0 != 0) goto L5
            goto L37
        L5:
            if (r5 == 0) goto L37
            com.amap.api.services.core.LatLonPoint r0 = r5.getFrom()
            if (r0 == 0) goto L37
            com.amap.api.services.core.LatLonPoint r0 = r5.getTo()
            if (r0 != 0) goto L14
            goto L37
        L14:
            com.amap.api.services.core.LatLonPoint r0 = r5.getFrom()
            com.amap.api.services.core.LatLonPoint r5 = r5.getTo()
            float r5 = com.amap.api.col.s.j4.b(r0, r5)
            double r0 = (double) r5
            r2 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r0 = r0 / r2
            int r5 = r4.f4622k
            double r2 = (double) r5
            int r5 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r5 < 0) goto L2f
            goto L37
        L2f:
            com.amap.api.services.core.AMapException r5 = new com.amap.api.services.core.AMapException
            java.lang.String r0 = "起点终点距离过长"
            r5.<init>(r0)
            throw r5
        L37:
            return
    }

    public final void m(boolean r1) {
            r0 = this;
            r0.f4614c = r1
            return
    }

    public final void n(int r1) {
            r0 = this;
            r0.f4621j = r1
            return
    }

    public final void o(java.util.List<java.util.List<com.amap.api.services.core.LatLonPoint>> r6) throws com.amap.api.services.core.AMapException {
            r5 = this;
            boolean r0 = r5.a
            if (r0 != 0) goto L5
            goto L44
        L5:
            if (r6 != 0) goto L8
            goto L44
        L8:
            int r0 = r6.size()
            int r1 = r5.f4621j
            if (r1 < r0) goto L45
            java.util.Iterator r6 = r6.iterator()
        L14:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L44
            java.lang.Object r0 = r6.next()
            java.util.List r0 = (java.util.List) r0
            double r1 = com.amap.api.col.s.j4.k(r0)
            int r0 = r0.size()
            int r3 = r5.q
            if (r3 < r0) goto L3c
            int r0 = r5.p
            double r3 = (double) r0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L34
            goto L14
        L34:
            com.amap.api.services.core.AMapException r6 = new com.amap.api.services.core.AMapException
            java.lang.String r0 = "避让区域大小超限"
            r6.<init>(r0)
            throw r6
        L3c:
            com.amap.api.services.core.AMapException r6 = new com.amap.api.services.core.AMapException
            java.lang.String r0 = "避让区域点个数超限"
            r6.<init>(r0)
            throw r6
        L44:
            return
        L45:
            com.amap.api.services.core.AMapException r6 = new com.amap.api.services.core.AMapException
            java.lang.String r0 = "避让区域个数超限"
            r6.<init>(r0)
            throw r6
    }

    public final void p(boolean r1) {
            r0 = this;
            r0.f4615d = r1
            return
    }

    public final void q(int r1) {
            r0 = this;
            r0.f4622k = r1
            return
    }

    public final void r(boolean r1) {
            r0 = this;
            r0.f4616e = r1
            return
    }

    public final void s(int r1) {
            r0 = this;
            r0.l = r1
            return
    }

    public final void t(boolean r1) {
            r0 = this;
            r0.f4617f = r1
            return
    }

    public final void u(int r1) {
            r0 = this;
            r0.m = r1
            return
    }

    public final void v(boolean r1) {
            r0 = this;
            r0.f4618g = r1
            return
    }

    public final void w(int r1) {
            r0 = this;
            r0.n = r1
            return
    }

    public final void x(boolean r1) {
            r0 = this;
            r0.f4613b = r1
            return
    }

    public final void y(int r1) {
            r0 = this;
            r0.o = r1
            return
    }

    public final void z(int r1) {
            r0 = this;
            r0.p = r1
            return
    }
}
