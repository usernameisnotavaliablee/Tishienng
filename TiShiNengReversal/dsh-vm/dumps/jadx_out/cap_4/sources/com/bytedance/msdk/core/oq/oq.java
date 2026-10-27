package com.bytedance.msdk.core.oq;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class oq implements java.lang.Comparable<com.bytedance.msdk.core.oq.oq> {
    private int ae;
    private int av;
    private int az;
    private int ch;
    private java.lang.String cw;
    private int f;
    private int g;
    private int i;
    private java.lang.String j;
    private int jy;
    private int kt;

    /* renamed from: m, reason: collision with root package name */
    private int f2227m;
    private java.util.Map<java.lang.String, java.lang.String> mi;
    private java.lang.String oq;
    private java.lang.String qv;

    /* renamed from: r, reason: collision with root package name */
    private java.lang.String f2228r;
    private java.lang.String tj;
    private int tl;
    private java.lang.String up;

    /* renamed from: v, reason: collision with root package name */
    private com.bytedance.msdk.core.tl.g f2229v;
    private java.lang.String vl;

    /* renamed from: w, reason: collision with root package name */
    private com.bytedance.msdk.core.oq.tl f2230w;
    private int ws;

    /* renamed from: x, reason: collision with root package name */
    private com.bytedance.msdk.core.tl.ae f2231x;
    private java.lang.String xt;

    public oq() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "1"
            r1.f2228r = r0
            java.lang.String r0 = "0"
            r1.up = r0
            return
    }

    public java.lang.String a() {
            r1 = this;
            java.lang.String r0 = r1.vl
            return r0
    }

    public java.lang.String ae() {
            r1 = this;
            java.lang.String r0 = r1.oq
            return r0
    }

    public void ae(int r1) {
            r0 = this;
            r0.av = r1
            return
    }

    public void ae(java.lang.String r1) {
            r0 = this;
            r0.qv = r1
            return
    }

    public java.lang.String av() {
            r1 = this;
            java.lang.String r0 = r1.xt
            return r0
    }

    public java.lang.String az() {
            r1 = this;
            java.lang.String r0 = r1.j
            return r0
    }

    public boolean c() {
            r2 = this;
            com.bytedance.msdk.core.ws.cw r0 = com.bytedance.msdk.core.xt.xt()
            java.lang.String r1 = r2.j
            boolean r0 = r0.cw(r1)
            return r0
    }

    public int ch() {
            r1 = this;
            int r0 = r1.tl
            return r0
    }

    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(com.bytedance.msdk.core.oq.oq r1) {
            r0 = this;
            com.bytedance.msdk.core.oq.oq r1 = (com.bytedance.msdk.core.oq.oq) r1
            int r1 = r0.j(r1)
            return r1
    }

    public com.bytedance.msdk.core.tl.g cw() {
            r1 = this;
            com.bytedance.msdk.core.tl.g r0 = r1.f2229v
            return r0
    }

    public void cw(int r1) {
            r0 = this;
            r0.kt = r1
            return
    }

    public void cw(java.lang.String r1) {
            r0 = this;
            r0.j = r1
            return
    }

    public java.lang.String ed() {
            r1 = this;
            java.lang.String r0 = r1.tj
            return r0
    }

    public double f() {
            r5 = this;
            com.bytedance.msdk.core.oq.tl r0 = r5.f2230w
            r1 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            if (r0 == 0) goto L38
            java.lang.String r0 = r0.m()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L11
            goto L38
        L11:
            com.bytedance.msdk.core.oq.tl r0 = r5.f2230w     // Catch: java.lang.Exception -> L20
            java.lang.String r0 = r0.m()     // Catch: java.lang.Exception -> L20
            java.lang.Double r0 = java.lang.Double.valueOf(r0)     // Catch: java.lang.Exception -> L20
            double r0 = r0.doubleValue()     // Catch: java.lang.Exception -> L20
            return r0
        L20:
            r0 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "getServerBiddingLoadEcpm error "
            r3.<init>(r4)
            java.lang.String r0 = r0.toString()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            java.lang.String r3 = "WaterFallConfig"
            com.bytedance.msdk.j.up.cw.r(r3, r0)
        L38:
            return r1
    }

    public int g() {
            r1 = this;
            int r0 = r1.ws
            return r0
    }

    public void g(int r1) {
            r0 = this;
            r0.g = r1
            return
    }

    public void g(java.lang.String r1) {
            r0 = this;
            r0.tj = r1
            return
    }

    public boolean gq() {
            r2 = this;
            int r0 = r2.f2227m
            r1 = 100
            if (r0 != r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public boolean h() {
            r2 = this;
            int r0 = r2.f2227m
            r1 = 2
            if (r0 != r1) goto L7
            r0 = 1
            return r0
        L7:
            r0 = 0
            return r0
    }

    public java.lang.String i() {
            r1 = this;
            java.lang.String r0 = r1.j
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto Lb
            java.lang.String r0 = r1.xt
            return r0
        Lb:
            java.lang.String r0 = r1.j
            return r0
    }

    public int j() {
            r1 = this;
            int r0 = r1.ch
            return r0
    }

    public int j(com.bytedance.msdk.core.oq.oq r5) {
            r4 = this;
            r0 = 1
            if (r5 != 0) goto L4
            return r0
        L4:
            int r1 = r4.ae
            int r2 = r5.x()
            if (r1 <= r2) goto Ld
            return r0
        Ld:
            int r1 = r4.ae
            int r2 = r5.x()
            r3 = -1
            if (r1 >= r2) goto L17
            return r3
        L17:
            int r1 = r4.tl
            int r2 = r5.ch()
            if (r1 <= r2) goto L20
            return r0
        L20:
            int r0 = r4.tl
            int r5 = r5.ch()
            if (r0 >= r5) goto L29
            return r3
        L29:
            r5 = 0
            return r5
    }

    public void j(int r1) {
            r0 = this;
            r0.ch = r1
            return
    }

    public void j(com.bytedance.msdk.core.oq.tl r1) {
            r0 = this;
            r0.f2230w = r1
            return
    }

    public void j(com.bytedance.msdk.core.tl.ae r1) {
            r0 = this;
            r0.f2231x = r1
            return
    }

    public void j(com.bytedance.msdk.core.tl.g r1) {
            r0 = this;
            r0.f2229v = r1
            return
    }

    public void j(java.lang.String r1) {
            r0 = this;
            r0.oq = r1
            return
    }

    public void j(java.util.Map<java.lang.String, java.lang.String> r1) {
            r0 = this;
            r0.mi = r1
            return
    }

    public int jy() {
            r1 = this;
            int r0 = r1.g
            return r0
    }

    public boolean kt() {
            r2 = this;
            int r0 = r2.f2227m
            if (r0 == 0) goto Lb
            r1 = 100
            if (r0 != r1) goto L9
            goto Lb
        L9:
            r0 = 0
            return r0
        Lb:
            r0 = 1
            return r0
    }

    public com.bytedance.msdk.core.oq.tl l() {
            r1 = this;
            com.bytedance.msdk.core.oq.tl r0 = r1.f2230w
            return r0
    }

    public boolean la() {
            r2 = this;
            int r0 = r2.f2227m
            r1 = 1
            if (r0 != r1) goto L6
            return r1
        L6:
            r0 = 0
            return r0
    }

    public int m() {
            r1 = this;
            int r0 = r1.kt
            return r0
    }

    public void m(int r1) {
            r0 = this;
            r0.az = r1
            return
    }

    public void m(java.lang.String r2) {
            r1 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L8
            java.lang.String r2 = "0"
        L8:
            r1.up = r2
            return
    }

    public int mi() {
            r1 = this;
            int r0 = r1.f2227m
            return r0
    }

    public int oq() {
            r1 = this;
            int r0 = r1.az
            return r0
    }

    public void oq(int r1) {
            r0 = this;
            r0.f2227m = r1
            return
    }

    public java.util.Map<java.lang.String, java.lang.String> p() {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.String> r0 = r1.mi
            return r0
    }

    public int qv() {
            r1 = this;
            int r0 = r1.av
            return r0
    }

    public void qv(int r1) {
            r0 = this;
            r0.ae = r1
            return
    }

    public void r(int r1) {
            r0 = this;
            r0.jy = r1
            return
    }

    public void r(java.lang.String r1) {
            r0 = this;
            r0.xt = r1
            return
    }

    public boolean r() {
            r2 = this;
            int r0 = r2.f
            r1 = 1
            if (r0 != r1) goto L6
            return r1
        L6:
            r0 = 0
            return r0
    }

    public boolean rn() {
            r2 = this;
            int r0 = r2.f2227m
            r1 = 3
            if (r0 != r1) goto L7
            r0 = 1
            return r0
        L7:
            r0 = 0
            return r0
    }

    public java.lang.String s() {
            r1 = this;
            java.lang.String r0 = r1.qv
            return r0
    }

    public double tj() {
            r5 = this;
            com.bytedance.msdk.core.oq.tl r0 = r5.f2230w
            r1 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            if (r0 == 0) goto L38
            java.lang.String r0 = r0.up()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L11
            goto L38
        L11:
            com.bytedance.msdk.core.oq.tl r0 = r5.f2230w     // Catch: java.lang.Exception -> L20
            java.lang.String r0 = r0.up()     // Catch: java.lang.Exception -> L20
            java.lang.Double r0 = java.lang.Double.valueOf(r0)     // Catch: java.lang.Exception -> L20
            double r0 = r0.doubleValue()     // Catch: java.lang.Exception -> L20
            return r0
        L20:
            r0 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "getServerBiddingShowEcpm error "
            r3.<init>(r4)
            java.lang.String r0 = r0.toString()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            java.lang.String r3 = "WaterFallConfig"
            com.bytedance.msdk.j.up.cw.r(r3, r0)
        L38:
            return r1
    }

    public int tl() {
            r1 = this;
            int r0 = r1.jy
            return r0
    }

    public void tl(int r1) {
            r0 = this;
            r0.i = r1
            return
    }

    public void tl(java.lang.String r1) {
            r0 = this;
            r0.vl = r1
            return
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "WaterFallConfig{mAdnetworkName='"
            r0.<init>(r1)
            java.lang.String r1 = r3.j
            r0.append(r1)
            r1 = 39
            r0.append(r1)
            java.lang.String r2 = ", mCustomAdnetworkName='"
            r0.append(r2)
            java.lang.String r2 = r3.xt
            r0.append(r2)
            r0.append(r1)
            java.lang.String r2 = ", mAdnetwokrSlotId='"
            r0.append(r2)
            java.lang.String r2 = r3.cw
            r0.append(r2)
            r0.append(r1)
            java.lang.String r1 = ", mExchangeRate="
            r0.append(r1)
            java.lang.String r1 = r3.f2228r
            r0.append(r1)
            java.lang.String r1 = ", mSlotEcpm="
            r0.append(r1)
            java.lang.String r1 = r3.up
            r0.append(r1)
            java.lang.String r1 = ", mAdnetworkSlotType="
            r0.append(r1)
            int r1 = r3.f2227m
            r0.append(r1)
            java.lang.String r1 = ", mLoadSort="
            r0.append(r1)
            int r1 = r3.ae
            r0.append(r1)
            java.lang.String r1 = ", mShowSort="
            r0.append(r1)
            int r1 = r3.tl
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public boolean uf() {
            r1 = this;
            int r0 = r1.f2227m
            if (r0 != 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public com.bytedance.msdk.core.oq.oq up() {
            r4 = this;
            java.util.List r0 = com.bytedance.msdk.tl.qv.xt()
            com.bytedance.msdk.core.oq.oq r1 = new com.bytedance.msdk.core.oq.oq
            r1.<init>()
            java.lang.String r2 = r4.j
            r1.j = r2
            java.lang.String r2 = "mAdnetworkName"
            com.bytedance.msdk.tl.qv.j(r0, r2)
            java.lang.String r2 = r4.cw
            r1.cw = r2
            java.lang.String r2 = "mAdnetwokrSlotId"
            com.bytedance.msdk.tl.qv.j(r0, r2)
            java.lang.String r2 = r4.f2228r
            r1.f2228r = r2
            java.lang.String r2 = "mExchangeRate"
            com.bytedance.msdk.tl.qv.j(r0, r2)
            java.lang.String r2 = r4.up
            r1.up = r2
            java.lang.String r2 = "mEcpm"
            com.bytedance.msdk.tl.qv.j(r0, r2)
            int r2 = r4.f2227m
            r1.f2227m = r2
            java.lang.String r2 = "mAdnetworkSlotType"
            com.bytedance.msdk.tl.qv.j(r0, r2)
            int r2 = r4.ae
            r1.ae = r2
            java.lang.String r2 = "mLoadSort"
            com.bytedance.msdk.tl.qv.j(r0, r2)
            int r2 = r4.tl
            r1.tl = r2
            java.lang.String r2 = "mShowSort"
            com.bytedance.msdk.tl.qv.j(r0, r2)
            int r2 = r4.g
            r1.g = r2
            java.lang.String r2 = "mRitType"
            com.bytedance.msdk.tl.qv.j(r0, r2)
            int r2 = r4.az
            r1.az = r2
            java.lang.String r2 = "originType"
            com.bytedance.msdk.tl.qv.j(r0, r2)
            int r2 = r4.kt
            r1.kt = r2
            java.lang.String r2 = "mSubAdType"
            com.bytedance.msdk.tl.qv.j(r0, r2)
            java.lang.String r2 = r4.oq
            r1.oq = r2
            java.lang.String r2 = "mLoaderAdapterName"
            com.bytedance.msdk.tl.qv.j(r0, r2)
            java.lang.String r2 = r4.qv
            r1.qv = r2
            java.lang.String r2 = "mWaterfallAbTestParam"
            com.bytedance.msdk.tl.qv.j(r0, r2)
            java.lang.String r2 = r4.vl
            r1.vl = r2
            java.lang.String r2 = "mServerBiddingExtra"
            com.bytedance.msdk.tl.qv.j(r0, r2)
            int r2 = r4.jy
            r1.jy = r2
            java.lang.String r2 = "adExpiredTime"
            com.bytedance.msdk.tl.qv.j(r0, r2)
            int r2 = r4.ws
            r1.ws = r2
            java.lang.String r2 = "ifReuseAds"
            com.bytedance.msdk.tl.qv.j(r0, r2)
            int r2 = r4.av
            r1.av = r2
            java.lang.String r2 = "ifPreRequest"
            com.bytedance.msdk.tl.qv.j(r0, r2)
            int r2 = r4.i
            r1.i = r2
            java.lang.String r2 = "ifIsReady"
            com.bytedance.msdk.tl.qv.j(r0, r2)
            int r2 = r4.ch
            r1.ch = r2
            java.lang.String r2 = "isRefresh"
            com.bytedance.msdk.tl.qv.j(r0, r2)
            java.lang.String r2 = r4.xt
            r1.xt = r2
            java.lang.String r2 = "mCustomAdnetworkName"
            com.bytedance.msdk.tl.qv.j(r0, r2)
            java.util.Map<java.lang.String, java.lang.String> r2 = r4.mi
            if (r2 == 0) goto Lc9
            int r2 = r2.size()
            if (r2 <= 0) goto Lc9
            java.util.concurrent.ConcurrentHashMap r2 = new java.util.concurrent.ConcurrentHashMap
            r2.<init>()
            java.util.Map<java.lang.String, java.lang.String> r3 = r4.mi
            r2.putAll(r3)
            goto Lca
        Lc9:
            r2 = 0
        Lca:
            r1.mi = r2
            java.lang.String r2 = "mMultilevelSlotCpm"
            com.bytedance.msdk.tl.qv.j(r0, r2)
            java.lang.String r2 = r4.tj
            r1.tj = r2
            java.lang.String r2 = "mCustomAdapterJson"
            com.bytedance.msdk.tl.qv.j(r0, r2)
            int r2 = r4.f
            r1.f = r2
            java.lang.String r2 = "mAdnRitTimingMode"
            com.bytedance.msdk.tl.qv.j(r0, r2)
            com.bytedance.msdk.core.tl.ae r2 = r4.f2231x
            r1.f2231x = r2
            java.lang.String r2 = "mIntervalFreqctlBean"
            com.bytedance.msdk.tl.qv.j(r0, r2)
            com.bytedance.msdk.core.tl.g r2 = r4.f2229v
            r1.f2229v = r2
            java.lang.String r2 = "mIntervalPacingBean"
            com.bytedance.msdk.tl.qv.j(r0, r2)
            java.lang.String r2 = "WaterFallConfig"
            com.bytedance.msdk.tl.qv.xt(r0, r2)
            return r1
    }

    public void up(int r1) {
            r0 = this;
            r0.ws = r1
            return
    }

    public void up(java.lang.String r1) {
            r0 = this;
            r0.cw = r1
            return
    }

    public double v() {
            r4 = this;
            java.lang.String r0 = r4.up     // Catch: java.lang.Exception -> L17
            java.lang.Double r0 = java.lang.Double.valueOf(r0)     // Catch: java.lang.Exception -> L17
            double r0 = r0.doubleValue()     // Catch: java.lang.Exception -> L17
            java.lang.String r2 = r4.f2228r     // Catch: java.lang.Exception -> L17
            java.lang.Double r2 = java.lang.Double.valueOf(r2)     // Catch: java.lang.Exception -> L17
            double r2 = r2.doubleValue()     // Catch: java.lang.Exception -> L17
            double r0 = r0 * r2
            return r0
        L17:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "getEcpm error "
            r1.<init>(r2)
            java.lang.String r0 = r0.toString()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "WaterFallConfig"
            com.bytedance.msdk.j.up.cw.r(r1, r0)
            r0 = 0
            return r0
    }

    public int vl() {
            r1 = this;
            int r0 = r1.i
            return r0
    }

    public void vl(int r1) {
            r0 = this;
            r0.tl = r1
            return
    }

    public java.lang.String w() {
            r1 = this;
            java.lang.String r0 = r1.cw
            return r0
    }

    public boolean wq() {
            r1 = this;
            boolean r0 = r1.h()
            if (r0 != 0) goto L15
            boolean r0 = r1.la()
            if (r0 != 0) goto L15
            boolean r0 = r1.rn()
            if (r0 == 0) goto L13
            goto L15
        L13:
            r0 = 0
            return r0
        L15:
            r0 = 1
            return r0
    }

    public java.lang.String ws() {
            r1 = this;
            java.lang.String r0 = r1.f2228r
            return r0
    }

    public int x() {
            r1 = this;
            int r0 = r1.ae
            return r0
    }

    public com.bytedance.msdk.core.tl.ae xt() {
            r1 = this;
            com.bytedance.msdk.core.tl.ae r0 = r1.f2231x
            return r0
    }

    public void xt(int r1) {
            r0 = this;
            r0.f = r1
            return
    }

    public void xt(java.lang.String r1) {
            r0 = this;
            r0.f2228r = r1
            return
    }
}
