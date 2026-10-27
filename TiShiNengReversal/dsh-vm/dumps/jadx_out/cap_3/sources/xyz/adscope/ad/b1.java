package xyz.adscope.ad;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class b1 implements xyz.adscope.common.v2.model.IDeepCopyModel {
    private final int a;
    private final java.lang.String b;
    private final java.lang.String c;
    private long d;
    private java.lang.String e;
    private final xyz.adscope.ad.c f;
    private final long g;
    private java.lang.String h;
    private long i;
    private long j;
    private boolean k;
    private boolean l;
    private java.lang.String m;
    private java.lang.String n;
    private java.lang.String o;
    private java.lang.String p;
    private java.lang.String q;
    private xyz.adscope.ad.y0 r;
    private double s;
    private java.lang.String t;
    private int u;
    private java.lang.String v;
    private java.lang.String w;
    private java.lang.String x;
    private xyz.adscope.ad.i4 y;
    private int z;

    public b1(xyz.adscope.ad.a2 r3) {
            r2 = this;
            r2.<init>()
            r0 = -1
            r2.d = r0
            r0 = 0
            r2.i = r0
            r2.j = r0
            r0 = 0
            r2.k = r0
            r2.l = r0
            r0 = -1
            r2.u = r0
            xyz.adscope.ad.c r0 = r3.getAdType()
            r2.f = r0
            java.lang.String r0 = r3.getApiKey()
            r2.c = r0
            java.lang.String r0 = r3.getSpaceID()
            r2.b = r0
            int r0 = r3.getAdCount()
            r2.a = r0
            long r0 = r3.getTimeoutMillion()
            r2.g = r0
            java.lang.String r3 = xyz.adscope.common.v2.tool.str.SerialUtil.generateAdRequestSessionID()
            r2.e = r3
            return
    }

    private b1(xyz.adscope.ad.b1 r3) {
            r2 = this;
            r2.<init>()
            r0 = -1
            r2.d = r0
            r0 = 0
            r2.i = r0
            r2.j = r0
            r0 = 0
            r2.k = r0
            r2.l = r0
            r0 = -1
            r2.u = r0
            xyz.adscope.ad.c r0 = r3.f
            r2.f = r0
            long r0 = r3.g
            r2.g = r0
            int r0 = r3.a
            r2.a = r0
            java.lang.String r0 = r3.b
            r2.b = r0
            java.lang.String r0 = r3.c
            r2.c = r0
            long r0 = r3.d
            r2.d = r0
            java.lang.String r0 = r3.e
            r2.e = r0
            java.lang.String r0 = r3.h
            r2.h = r0
            long r0 = r3.i
            r2.i = r0
            long r0 = r3.j
            r2.j = r0
            boolean r0 = r3.k
            r2.k = r0
            boolean r0 = r3.l
            r2.l = r0
            java.lang.String r0 = r3.m
            r2.m = r0
            java.lang.String r0 = r3.n
            r2.n = r0
            java.lang.String r0 = r3.o
            r2.o = r0
            java.lang.String r0 = r3.p
            r2.p = r0
            java.lang.String r0 = r3.q
            r2.q = r0
            xyz.adscope.ad.y0 r0 = r3.r
            r2.r = r0
            double r0 = r3.s
            r2.s = r0
            java.lang.String r0 = r3.t
            r2.t = r0
            int r0 = r3.u
            r2.u = r0
            java.lang.String r0 = r3.v
            r2.v = r0
            java.lang.String r0 = r3.w
            r2.w = r0
            java.lang.String r0 = r3.x
            r2.x = r0
            xyz.adscope.ad.i4 r0 = r3.y
            r2.y = r0
            int r3 = r3.z
            r2.z = r3
            return
    }

    private void b(xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.BidModel r3) {
            r2 = this;
            if (r3 == 0) goto L44
            double r0 = r3.e()
            r2.s = r0
            java.lang.String r0 = r3.a()
            r2.t = r0
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.MediaModel r3 = r3.d()
            if (r3 == 0) goto L44
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.AdModel r3 = r3.a()
            if (r3 == 0) goto L44
            java.lang.String r0 = r3.c()
            r2.q = r0
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.DisplayModel r3 = r3.b()
            if (r3 == 0) goto L44
            java.lang.String r0 = r3.c()
            r2.p = r0
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.ext.DisplayExtModel r0 = r3.b()
            if (r0 == 0) goto L38
            java.lang.String r0 = r0.a()
            r2.m = r0
        L38:
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.NativeModel r3 = r3.d()
            if (r3 == 0) goto L44
            java.lang.String r3 = r3.f()
            r2.v = r3
        L44:
            return
    }

    public boolean A() {
            r1 = this;
            boolean r0 = r1.l
            return r0
    }

    public void B() {
            r5 = this;
            long r0 = r5.j
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto Le
            long r0 = java.lang.System.currentTimeMillis()
            r5.j = r0
        Le:
            return
    }

    public void C() {
            r5 = this;
            long r0 = r5.i
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto Le
            long r0 = java.lang.System.currentTimeMillis()
            r5.i = r0
        Le:
            return
    }

    public void D() {
            r1 = this;
            r0 = 1
            r1.k = r0
            return
    }

    public void E() {
            r1 = this;
            r0 = 1
            r1.l = r0
            return
    }

    public xyz.adscope.ad.b1 a() {
            r1 = this;
            xyz.adscope.ad.b1 r0 = new xyz.adscope.ad.b1
            r0.<init>(r1)
            return r0
    }

    public void a(int r1) {
            r0 = this;
            r0.z = r1
            return
    }

    public void a(long r1) {
            r0 = this;
            r0.d = r1
            return
    }

    public void a(java.lang.String r1) {
            r0 = this;
            r0.x = r1
            return
    }

    public void a(xyz.adscope.ad.i4 r1) {
            r0 = this;
            r0.y = r1
            return
    }

    public void a(xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.BidModel r1) {
            r0 = this;
            r0.b(r1)
            return
    }

    public void a(xyz.adscope.ad.publish.ASNPInitConfig r4) {
            r3 = this;
            java.util.List r4 = r4.getCurrency()
            if (r4 == 0) goto L45
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "["
            r0.append(r1)
            java.util.Iterator r4 = r4.iterator()
        L14:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L31
            java.lang.Object r1 = r4.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "\""
            r0.append(r2)
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = ","
            r0.append(r1)
            goto L14
        L31:
            int r4 = r0.length()
            int r4 = r4 + (-1)
            int r1 = r0.length()
            java.lang.String r2 = "]"
            r0.replace(r4, r1, r2)
            java.lang.String r4 = r0.toString()
            goto L47
        L45:
            java.lang.String r4 = "[\"CNY\"]"
        L47:
            r3.n = r4
            return
    }

    public void a(xyz.adscope.ad.y0 r1) {
            r0 = this;
            r0.r = r1
            return
    }

    public xyz.adscope.ad.c b() {
            r1 = this;
            xyz.adscope.ad.c r0 = r1.f
            return r0
    }

    public void b(int r1) {
            r0 = this;
            r0.u = r1
            return
    }

    public void b(java.lang.String r1) {
            r0 = this;
            r0.o = r1
            return
    }

    public java.lang.String c() {
            r1 = this;
            java.lang.String r0 = r1.x
            return r0
    }

    public void c(java.lang.String r1) {
            r0 = this;
            r0.h = r1
            return
    }

    public int d() {
            r1 = this;
            int r0 = r1.z
            return r0
    }

    public void d(java.lang.String r1) {
            r0 = this;
            r0.w = r1
            return
    }

    @Override // xyz.adscope.common.v2.model.IDeepCopyModel
    public /* bridge */ /* synthetic */ xyz.adscope.common.v2.model.IDeepCopyModel deepCopy() {
            r1 = this;
            xyz.adscope.ad.b1 r0 = r1.a()
            return r0
    }

    public java.lang.String e() {
            r1 = this;
            java.lang.String r0 = r1.o
            return r0
    }

    public void e(java.lang.String r1) {
            r0 = this;
            r0.e = r1
            return
    }

    public java.lang.String f() {
            r1 = this;
            java.lang.String r0 = r1.p
            return r0
    }

    public java.lang.String g() {
            r1 = this;
            java.lang.String r0 = r1.n
            return r0
    }

    public long h() {
            r5 = this;
            long r0 = r5.d
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L10
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r5.d
            long r0 = r0 - r2
            return r0
        L10:
            return r2
    }

    public java.lang.String i() {
            r1 = this;
            java.lang.String r0 = r1.t
            return r0
    }

    public int j() {
            r1 = this;
            xyz.adscope.ad.y0 r0 = r1.r
            if (r0 == 0) goto L9
            int r0 = r0.b()
            return r0
        L9:
            r0 = -1
            return r0
    }

    public java.lang.String k() {
            r1 = this;
            xyz.adscope.ad.y0 r0 = r1.r
            if (r0 == 0) goto L9
            java.lang.String r0 = r0.c()
            return r0
        L9:
            java.lang.String r0 = ""
            return r0
    }

    public long l() {
            r2 = this;
            long r0 = r2.j
            return r0
    }

    public int m() {
            r1 = this;
            int r0 = r1.u
            return r0
    }

    public java.lang.String n() {
            r1 = this;
            java.lang.String r0 = r1.m
            return r0
    }

    public long o() {
            r2 = this;
            long r0 = r2.g
            return r0
    }

    public java.lang.String p() {
            r1 = this;
            java.lang.String r0 = r1.q
            return r0
    }

    public double q() {
            r2 = this;
            double r0 = r2.s
            return r0
    }

    public java.lang.String r() {
            r1 = this;
            java.lang.String r0 = r1.h
            return r0
    }

    public int s() {
            r1 = this;
            int r0 = r1.a
            return r0
    }

    public java.lang.String t() {
            r1 = this;
            java.lang.String r0 = r1.e
            return r0
    }

    public java.lang.String u() {
            r1 = this;
            java.lang.String r0 = r1.v
            return r0
    }

    public long v() {
            r2 = this;
            long r0 = r2.i
            return r0
    }

    public java.lang.String w() {
            r1 = this;
            java.lang.String r0 = r1.b
            return r0
    }

    public xyz.adscope.ad.i4.b x() {
            r1 = this;
            xyz.adscope.ad.i4 r0 = r1.y
            if (r0 == 0) goto L9
            xyz.adscope.ad.i4$b r0 = r0.a()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public java.lang.String y() {
            r1 = this;
            java.lang.String r0 = r1.w
            return r0
    }

    public boolean z() {
            r1 = this;
            boolean r0 = r1.k
            return r0
    }
}
