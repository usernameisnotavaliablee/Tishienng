package com.bytedance.msdk.api.j;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class xt implements com.bytedance.msdk.api.j.cw, com.bytedance.msdk.api.j.r {
    private com.bytedance.msdk.api.j.cw cw;
    private com.bytedance.msdk.api.j.r j;

    /* renamed from: r, reason: collision with root package name */
    private boolean f2154r;
    private com.bytedance.msdk.core.oq.xt xt;

    public xt() {
            r0 = this;
            r0.<init>()
            return
    }

    public xt(int r2, com.bykv.vk.openvk.api.proto.PluginValueSet r3) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.j(r2, r3, r0)
            return
    }

    public xt(com.bytedance.msdk.api.j.xt r3) {
            r2 = this;
            r2.<init>()
            if (r3 == 0) goto L1c
            int r0 = r3.f()
            android.util.SparseArray r1 = r3.gx()
            com.bykv.j.j.j.j.e r1 = com.bykv.j.j.j.j.e.i(r1)
            com.bykv.vk.openvk.api.proto.PluginValueSet r1 = r1.k()
            com.bytedance.msdk.api.j.cw r3 = r3.jy()
            r2.j(r0, r1, r3)
        L1c:
            return
    }

    private void j(int r2, com.bykv.vk.openvk.api.proto.PluginValueSet r3, com.bytedance.msdk.api.j.cw r4) {
            r1 = this;
            com.bytedance.msdk.api.j.up r0 = new com.bytedance.msdk.api.j.up
            r0.<init>(r2, r3)
            r1.j = r0
            com.bytedance.msdk.api.j.j r2 = new com.bytedance.msdk.api.j.j
            r2.<init>()
            r1.cw = r2
            if (r4 == 0) goto L17
            int r3 = r4.tl()
            r2.up(r3)
        L17:
            return
    }

    @Override // com.bytedance.msdk.api.j.r
    public int a() {
            r3 = this;
            r0 = 5
            int r1 = r3.f()
            r2 = 1
            if (r0 == r1) goto L12
            r0 = 9
            int r1 = r3.f()
            if (r0 != r1) goto L11
            goto L12
        L11:
            return r2
        L12:
            com.bytedance.msdk.core.oq.xt r0 = r3.xt
            if (r0 == 0) goto L1b
            int r0 = r0.i()
            goto L1c
        L1b:
            r0 = 0
        L1c:
            if (r0 != 0) goto L26
            com.bytedance.msdk.api.j.r r1 = r3.j
            if (r1 == 0) goto L26
            int r0 = r1.a()
        L26:
            if (r0 > 0) goto L29
            return r2
        L29:
            r1 = 3
            if (r0 < r1) goto L2d
            return r1
        L2d:
            return r0
    }

    @Override // com.bytedance.msdk.api.j.cw
    public void ae(int r2) {
            r1 = this;
            com.bytedance.msdk.api.j.cw r0 = r1.cw
            if (r0 == 0) goto L7
            r0.ae(r2)
        L7:
            return
    }

    @Override // com.bytedance.msdk.api.j.cw
    public boolean ae() {
            r1 = this;
            com.bytedance.msdk.api.j.cw r0 = r1.cw
            if (r0 == 0) goto L9
            boolean r0 = r0.ae()
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // com.bytedance.msdk.api.j.r
    public boolean av() {
            r1 = this;
            com.bytedance.msdk.api.j.r r0 = r1.j
            if (r0 == 0) goto L9
            boolean r0 = r0.av()
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // com.bytedance.msdk.api.j.r
    public float az() {
            r1 = this;
            com.bytedance.msdk.api.j.r r0 = r1.j
            if (r0 == 0) goto L9
            float r0 = r0.az()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public int b() {
            r1 = this;
            com.bytedance.msdk.core.oq.xt r0 = r1.xt
            if (r0 == 0) goto L9
            int r0 = r0.hl()
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // com.bytedance.msdk.api.j.r
    public java.util.Map<java.lang.String, java.lang.Object> c() {
            r1 = this;
            com.bytedance.msdk.api.j.r r0 = r1.j
            if (r0 == 0) goto L9
            java.util.Map r0 = r0.c()
            return r0
        L9:
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            return r0
    }

    @Override // com.bytedance.msdk.api.j.r
    public int ch() {
            r1 = this;
            com.bytedance.msdk.api.j.r r0 = r1.j
            if (r0 == 0) goto L9
            int r0 = r0.ch()
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // com.bytedance.msdk.api.j.cw
    public int cw() {
            r1 = this;
            com.bytedance.msdk.api.j.cw r0 = r1.cw
            if (r0 == 0) goto L9
            int r0 = r0.cw()
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // com.bytedance.msdk.api.j.cw
    public void cw(int r2) {
            r1 = this;
            com.bytedance.msdk.api.j.cw r0 = r1.cw
            if (r0 == 0) goto L7
            r0.cw(r2)
        L7:
            return
    }

    @Override // com.bytedance.msdk.api.j.cw
    public void cw(java.lang.String r2) {
            r1 = this;
            com.bytedance.msdk.api.j.cw r0 = r1.cw
            if (r0 == 0) goto L7
            r0.cw(r2)
        L7:
            return
    }

    public java.lang.String e() {
            r1 = this;
            com.bytedance.msdk.core.oq.xt r0 = r1.xt
            if (r0 == 0) goto L9
            java.lang.String r0 = r0.hh()
            return r0
        L9:
            java.lang.String r0 = ""
            return r0
    }

    @Override // com.bytedance.msdk.api.j.r
    public boolean ed() {
            r1 = this;
            com.bytedance.msdk.api.j.r r0 = r1.j
            if (r0 == 0) goto L9
            boolean r0 = r0.ed()
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // com.bytedance.msdk.api.j.r
    public int f() {
            r1 = this;
            com.bytedance.msdk.api.j.r r0 = r1.j
            if (r0 == 0) goto L9
            int r0 = r0.f()
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // com.bytedance.msdk.api.j.cw
    public int g() {
            r1 = this;
            com.bytedance.msdk.api.j.cw r0 = r1.cw
            if (r0 == 0) goto L9
            int r0 = r0.g()
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // com.bytedance.msdk.api.j.r
    public void g(int r2) {
            r1 = this;
            com.bytedance.msdk.api.j.r r0 = r1.j
            if (r0 == 0) goto L7
            r0.g(r2)
        L7:
            return
    }

    @Override // com.bytedance.msdk.api.j.r
    public java.lang.String gq() {
            r1 = this;
            com.bytedance.msdk.api.j.r r0 = r1.j
            if (r0 == 0) goto L9
            java.lang.String r0 = r0.gq()
            return r0
        L9:
            java.lang.String r0 = ""
            return r0
    }

    @Override // com.bytedance.msdk.api.j.r
    public android.util.SparseArray<java.lang.Object> gx() {
            r1 = this;
            com.bytedance.msdk.api.j.r r0 = r1.j
            if (r0 == 0) goto L9
            android.util.SparseArray r0 = r0.gx()
            return r0
        L9:
            com.bykv.vk.openvk.api.proto.PluginValueSet r0 = com.bykv.j.j.j.j.e.c
            android.util.SparseArray r0 = r0.sparseArray()
            return r0
    }

    @Override // com.bytedance.msdk.api.j.r
    public int h() {
            r1 = this;
            com.bytedance.msdk.api.j.r r0 = r1.j
            if (r0 == 0) goto L9
            int r0 = r0.h()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public java.lang.String hh() {
            r1 = this;
            com.bytedance.msdk.core.oq.xt r0 = r1.xt
            if (r0 == 0) goto L9
            java.lang.String r0 = r0.la()
            return r0
        L9:
            java.lang.String r0 = ""
            return r0
    }

    public int hl() {
            r1 = this;
            com.bytedance.msdk.core.oq.xt r0 = r1.xt
            if (r0 == 0) goto L9
            int r0 = r0.z()
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // com.bytedance.msdk.api.j.r
    public int i() {
            r1 = this;
            com.bytedance.msdk.api.j.r r0 = r1.j
            if (r0 == 0) goto L9
            int r0 = r0.i()
            return r0
        L9:
            r0 = -1
            return r0
    }

    @Override // com.bytedance.msdk.api.j.cw
    public java.lang.String j() {
            r1 = this;
            com.bytedance.msdk.api.j.cw r0 = r1.cw
            if (r0 == 0) goto L9
            java.lang.String r0 = r0.j()
            return r0
        L9:
            java.lang.String r0 = ""
            return r0
    }

    @Override // com.bytedance.msdk.api.j.cw
    public void j(int r2) {
            r1 = this;
            com.bytedance.msdk.api.j.cw r0 = r1.cw
            if (r0 == 0) goto L7
            r0.j(r2)
        L7:
            return
    }

    public void j(com.bykv.vk.openvk.api.proto.PluginValueSet r3) {
            r2 = this;
            com.bytedance.msdk.api.j.r r0 = r2.j
            if (r0 == 0) goto L12
            if (r3 != 0) goto L7
            goto L12
        L7:
            com.bytedance.msdk.api.j.up r0 = new com.bytedance.msdk.api.j.up
            int r1 = r2.f()
            r0.<init>(r1, r3)
            r2.j = r0
        L12:
            return
    }

    public void j(com.bytedance.msdk.core.oq.xt r1) {
            r0 = this;
            r0.xt = r1
            return
    }

    @Override // com.bytedance.msdk.api.j.cw
    public void j(java.lang.String r2) {
            r1 = this;
            com.bytedance.msdk.api.j.cw r0 = r1.cw
            if (r0 == 0) goto L7
            r0.j(r2)
        L7:
            return
    }

    @Override // com.bytedance.msdk.api.j.cw
    public void j(org.json.JSONObject r2) {
            r1 = this;
            com.bytedance.msdk.api.j.cw r0 = r1.cw
            if (r0 == 0) goto L7
            r0.j(r2)
        L7:
            return
    }

    public void j(boolean r1) {
            r0 = this;
            r0.f2154r = r1
            return
    }

    public com.bytedance.msdk.api.j.cw jy() {
            r1 = this;
            com.bytedance.msdk.api.j.cw r0 = r1.cw
            return r0
    }

    @Override // com.bytedance.msdk.api.j.r
    public boolean kt() {
            r1 = this;
            com.bytedance.msdk.api.j.r r0 = r1.j
            if (r0 == 0) goto L7
            r0.kt()
        L7:
            r0 = 0
            return r0
    }

    @Override // com.bytedance.msdk.api.j.r
    public boolean l() {
            r1 = this;
            com.bytedance.msdk.api.j.r r0 = r1.j
            if (r0 == 0) goto L9
            boolean r0 = r0.l()
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // com.bytedance.msdk.api.j.r
    public java.lang.String la() {
            r1 = this;
            com.bytedance.msdk.api.j.r r0 = r1.j
            if (r0 == 0) goto L9
            java.lang.String r0 = r0.la()
            return r0
        L9:
            java.lang.String r0 = ""
            return r0
    }

    @Override // com.bytedance.msdk.api.j.cw
    public java.lang.String m() {
            r1 = this;
            com.bytedance.msdk.api.j.cw r0 = r1.cw
            if (r0 == 0) goto L9
            java.lang.String r0 = r0.m()
            return r0
        L9:
            java.lang.String r0 = ""
            return r0
    }

    @Override // com.bytedance.msdk.api.j.cw
    public void m(int r2) {
            r1 = this;
            com.bytedance.msdk.api.j.cw r0 = r1.cw
            if (r0 == 0) goto L7
            r0.m(r2)
        L7:
            return
    }

    @Override // com.bytedance.msdk.api.j.r
    public boolean mi() {
            r1 = this;
            com.bytedance.msdk.api.j.r r0 = r1.j
            if (r0 == 0) goto L7
            r0.mi()
        L7:
            r0 = 0
            return r0
    }

    public com.bytedance.msdk.core.oq.xt n() {
            r1 = this;
            com.bytedance.msdk.core.oq.xt r0 = r1.xt
            return r0
    }

    @Override // com.bytedance.msdk.api.j.r
    public java.lang.String nd() {
            r1 = this;
            com.bytedance.msdk.api.j.r r0 = r1.j
            if (r0 == 0) goto L9
            java.lang.String r0 = r0.nd()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public long ol() {
            r2 = this;
            com.bytedance.msdk.core.oq.xt r0 = r2.xt
            if (r0 == 0) goto L9
            long r0 = r0.s()
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // com.bytedance.msdk.api.j.cw
    public org.json.JSONObject oq() {
            r1 = this;
            com.bytedance.msdk.api.j.cw r0 = r1.cw
            if (r0 == 0) goto L9
            org.json.JSONObject r0 = r0.oq()
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // com.bytedance.msdk.api.j.r
    public java.lang.String p() {
            r1 = this;
            com.bytedance.msdk.api.j.r r0 = r1.j
            if (r0 == 0) goto L9
            java.lang.String r0 = r0.p()
            return r0
        L9:
            java.lang.String r0 = ""
            return r0
    }

    public int q() {
            r1 = this;
            com.bytedance.msdk.core.oq.xt r0 = r1.xt
            if (r0 == 0) goto L9
            int r0 = r0.a()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public java.lang.String qb() {
            r1 = this;
            com.bytedance.msdk.core.oq.xt r0 = r1.xt
            if (r0 == 0) goto L9
            java.lang.String r0 = r0.l()
            return r0
        L9:
            java.lang.String r0 = ""
            return r0
    }

    @Override // com.bytedance.msdk.api.j.cw
    public int qv() {
            r1 = this;
            com.bytedance.msdk.api.j.cw r0 = r1.cw
            if (r0 == 0) goto L9
            int r0 = r0.qv()
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // com.bytedance.msdk.api.j.cw
    public int r() {
            r1 = this;
            com.bytedance.msdk.api.j.cw r0 = r1.cw
            if (r0 == 0) goto L9
            int r0 = r0.r()
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // com.bytedance.msdk.api.j.cw
    public void r(int r2) {
            r1 = this;
            com.bytedance.msdk.api.j.cw r0 = r1.cw
            if (r0 == 0) goto L7
            r0.r(r2)
        L7:
            return
    }

    @Override // com.bytedance.msdk.api.j.r
    public void r(java.lang.String r2) {
            r1 = this;
            com.bytedance.msdk.api.j.r r0 = r1.j
            if (r0 == 0) goto L7
            r0.r(r2)
        L7:
            return
    }

    @Override // com.bytedance.msdk.api.j.r
    public boolean rh() {
            r1 = this;
            com.bytedance.msdk.api.j.r r0 = r1.j
            if (r0 == 0) goto L9
            boolean r0 = r0.rh()
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // com.bytedance.msdk.api.j.r
    public int rn() {
            r1 = this;
            com.bytedance.msdk.api.j.r r0 = r1.j
            if (r0 == 0) goto L9
            int r0 = r0.rn()
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // com.bytedance.msdk.api.j.r
    public int s() {
            r1 = this;
            com.bytedance.msdk.api.j.r r0 = r1.j
            if (r0 == 0) goto L9
            int r0 = r0.s()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public boolean sm() {
            r5 = this;
            int r0 = r5.f()
            java.util.Map r1 = r5.c()
            r2 = 0
            if (r1 != 0) goto Lc
            return r2
        Lc:
            java.lang.String r3 = "use_share_cache"
            java.lang.Object r1 = r1.get(r3)
            boolean r3 = r1 instanceof java.lang.Boolean
            if (r3 == 0) goto L2c
            r3 = 1
            if (r0 == r3) goto L23
            r4 = 5
            if (r0 == r4) goto L23
            r4 = 10
            if (r0 == r4) goto L23
            r4 = 7
            if (r0 != r4) goto L2c
        L23:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r0 = r1.booleanValue()
            if (r0 == 0) goto L2c
            return r3
        L2c:
            return r2
    }

    @Override // com.bytedance.msdk.api.j.r
    public com.bytedance.sdk.openadsdk.mediation.xt.xt.j tj() {
            r1 = this;
            com.bytedance.msdk.api.j.r r0 = r1.j
            if (r0 == 0) goto L9
            com.bytedance.sdk.openadsdk.mediation.xt.xt.j r0 = r0.tj()
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // com.bytedance.msdk.api.j.cw
    public int tl() {
            r1 = this;
            com.bytedance.msdk.api.j.cw r0 = r1.cw
            if (r0 == 0) goto L9
            int r0 = r0.tl()
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // com.bytedance.msdk.api.j.r
    public void tl(int r2) {
            r1 = this;
            com.bytedance.msdk.api.j.r r0 = r1.j
            if (r0 == 0) goto L7
            r0.tl(r2)
        L7:
            return
    }

    @Override // com.bytedance.msdk.api.j.r
    public java.lang.String uf() {
            r1 = this;
            com.bytedance.msdk.api.j.r r0 = r1.j
            if (r0 == 0) goto L9
            java.lang.String r0 = r0.uf()
            return r0
        L9:
            java.lang.String r0 = ""
            return r0
    }

    @Override // com.bytedance.msdk.api.j.cw
    public int up() {
            r1 = this;
            com.bytedance.msdk.api.j.cw r0 = r1.cw
            if (r0 == 0) goto L9
            int r0 = r0.up()
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // com.bytedance.msdk.api.j.cw
    public void up(int r2) {
            r1 = this;
            com.bytedance.msdk.api.j.cw r0 = r1.cw
            if (r0 == 0) goto L7
            r0.up(r2)
        L7:
            return
    }

    @Override // com.bytedance.msdk.api.j.r
    public java.lang.String v() {
            r1 = this;
            com.bytedance.msdk.api.j.r r0 = r1.j
            if (r0 == 0) goto L9
            java.lang.String r0 = r0.v()
            return r0
        L9:
            java.lang.String r0 = ""
            return r0
    }

    @Override // com.bytedance.msdk.api.j.cw
    public java.lang.String vl() {
            r1 = this;
            com.bytedance.msdk.api.j.cw r0 = r1.cw
            if (r0 == 0) goto L9
            java.lang.String r0 = r0.vl()
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // com.bytedance.msdk.api.j.r
    public boolean w() {
            r1 = this;
            com.bytedance.msdk.api.j.r r0 = r1.j
            if (r0 == 0) goto L9
            boolean r0 = r0.w()
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // com.bytedance.msdk.api.j.r
    public boolean wq() {
            r1 = this;
            com.bytedance.msdk.api.j.r r0 = r1.j
            if (r0 == 0) goto L9
            boolean r0 = r0.wq()
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // com.bytedance.msdk.api.j.r
    public float ws() {
            r1 = this;
            com.bytedance.msdk.api.j.r r0 = r1.j
            if (r0 == 0) goto L9
            float r0 = r0.ws()
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // com.bytedance.msdk.api.j.r
    public java.lang.String x() {
            r1 = this;
            com.bytedance.msdk.api.j.r r0 = r1.j
            if (r0 == 0) goto L9
            java.lang.String r0 = r0.x()
            return r0
        L9:
            java.lang.String r0 = ""
            return r0
    }

    public boolean xq() {
            r1 = this;
            boolean r0 = r1.f2154r
            return r0
    }

    @Override // com.bytedance.msdk.api.j.cw
    public int xt() {
            r1 = this;
            com.bytedance.msdk.api.j.cw r0 = r1.cw
            if (r0 == 0) goto L9
            int r0 = r0.xt()
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // com.bytedance.msdk.api.j.cw
    public void xt(int r2) {
            r1 = this;
            com.bytedance.msdk.api.j.cw r0 = r1.cw
            if (r0 == 0) goto L7
            r0.xt(r2)
        L7:
            return
    }

    @Override // com.bytedance.msdk.api.j.cw
    public void xt(java.lang.String r2) {
            r1 = this;
            com.bytedance.msdk.api.j.cw r0 = r1.cw
            if (r0 == 0) goto L7
            r0.xt(r2)
        L7:
            return
    }

    public java.lang.String ya() {
            r1 = this;
            com.bytedance.msdk.core.oq.xt r0 = r1.xt
            if (r0 == 0) goto L9
            java.lang.String r0 = r0.mi()
            return r0
        L9:
            java.lang.String r0 = ""
            return r0
    }

    public double z() {
            r2 = this;
            com.bytedance.msdk.core.oq.xt r0 = r2.xt
            if (r0 == 0) goto L9
            double r0 = r0.w()
            return r0
        L9:
            r0 = 0
            return r0
    }
}
