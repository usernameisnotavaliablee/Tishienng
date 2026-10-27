package com.bytedance.msdk.api.j;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class up implements com.bytedance.msdk.api.j.r {
    private java.lang.String ae;
    private java.util.Map<java.lang.String, java.lang.Object> cw;
    private com.bytedance.sdk.openadsdk.mediation.xt.xt.j j;

    /* renamed from: m, reason: collision with root package name */
    private int f2152m;

    /* renamed from: r, reason: collision with root package name */
    private int f2153r;
    private com.bykv.vk.openvk.api.proto.PluginValueSet up;
    private com.bytedance.sdk.openadsdk.mediation.xt.xt.xt xt;

    public up(int r2, com.bykv.vk.openvk.api.proto.PluginValueSet r3) {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.f2152m = r0
            java.lang.String r0 = ""
            r1.ae = r0
            if (r3 == 0) goto L22
            r1.up = r3
            r1.f2153r = r2
            com.bytedance.sdk.openadsdk.mediation.xt.xt.j r2 = new com.bytedance.sdk.openadsdk.mediation.xt.xt.j
            android.util.SparseArray r3 = r3.sparseArray()
            r2.<init>(r3)
            r1.j = r2
            com.bytedance.sdk.openadsdk.mediation.xt.xt.xt r2 = r2.l()
            r1.xt = r2
            return
        L22:
            java.lang.String r2 = "AdLinkInfo"
            java.lang.String r3 = "valueset is null"
            com.bytedance.msdk.j.up.cw.xt(r2, r3)
            return
    }

    @Override // com.bytedance.msdk.api.j.r
    public int a() {
            r1 = this;
            com.bytedance.sdk.openadsdk.mediation.xt.xt.j r0 = r1.j
            if (r0 == 0) goto L9
            int r0 = r0.vl()
            return r0
        L9:
            r0 = 1
            return r0
    }

    @Override // com.bytedance.msdk.api.j.r
    public boolean av() {
            r1 = this;
            com.bytedance.sdk.openadsdk.mediation.xt.xt.j r0 = r1.j
            if (r0 == 0) goto L9
            boolean r0 = r0.qv()
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // com.bytedance.msdk.api.j.r
    public float az() {
            r1 = this;
            com.bytedance.sdk.openadsdk.mediation.xt.xt.j r0 = r1.j
            if (r0 == 0) goto L9
            float r0 = r0.g()
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // com.bytedance.msdk.api.j.r
    public java.util.Map<java.lang.String, java.lang.Object> c() {
            r4 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r4.cw
            if (r0 == 0) goto L5
            return r0
        L5:
            com.bytedance.sdk.openadsdk.mediation.xt.xt.xt r0 = r4.xt
            if (r0 == 0) goto L4c
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r4.cw = r0
            com.bytedance.sdk.openadsdk.mediation.xt.xt.xt r0 = r4.xt
            java.util.Map r0 = r0.m()
            if (r0 == 0) goto L4c
            int r1 = r0.size()
            if (r1 <= 0) goto L4c
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L26:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L4c
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            if (r2 == 0) goto L26
            java.lang.Object r2 = r1.getValue()
            if (r2 == 0) goto L26
            java.util.Map<java.lang.String, java.lang.Object> r2 = r4.cw
            java.lang.Object r3 = r1.getKey()
            java.lang.Object r1 = r1.getValue()
            r2.put(r3, r1)
            goto L26
        L4c:
            java.util.Map<java.lang.String, java.lang.Object> r0 = r4.cw
            if (r0 != 0) goto L57
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r4.cw = r0
        L57:
            java.util.Map<java.lang.String, java.lang.Object> r0 = r4.cw
            return r0
    }

    @Override // com.bytedance.msdk.api.j.r
    public int ch() {
            r1 = this;
            com.bytedance.sdk.openadsdk.mediation.xt.xt.j r0 = r1.j
            if (r0 == 0) goto L9
            int r0 = r0.m()
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // com.bytedance.msdk.api.j.r
    public boolean ed() {
            r1 = this;
            com.bytedance.sdk.openadsdk.mediation.xt.xt.xt r0 = r1.xt
            if (r0 == 0) goto L9
            boolean r0 = r0.ae()
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // com.bytedance.msdk.api.j.r
    public int f() {
            r1 = this;
            int r0 = r1.f2153r
            return r0
    }

    @Override // com.bytedance.msdk.api.j.r
    public void g(int r1) {
            r0 = this;
            r0.f2153r = r1
            return
    }

    @Override // com.bytedance.msdk.api.j.r
    public java.lang.String gq() {
            r1 = this;
            com.bytedance.sdk.openadsdk.mediation.xt.xt.j r0 = r1.j
            if (r0 == 0) goto L9
            java.lang.String r0 = r0.ws()
            return r0
        L9:
            java.lang.String r0 = ""
            return r0
    }

    @Override // com.bytedance.msdk.api.j.r
    public android.util.SparseArray<java.lang.Object> gx() {
            r1 = this;
            com.bykv.vk.openvk.api.proto.PluginValueSet r0 = r1.up
            if (r0 == 0) goto L9
            android.util.SparseArray r0 = r0.sparseArray()
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // com.bytedance.msdk.api.j.r
    public int h() {
            r2 = this;
            com.bytedance.sdk.openadsdk.mediation.xt.xt.j r0 = r2.j
            if (r0 == 0) goto L9
            int r0 = r0.ch()
            goto La
        L9:
            r0 = 0
        La:
            if (r0 != 0) goto L14
            com.bytedance.sdk.openadsdk.mediation.xt.xt.xt r1 = r2.xt
            if (r1 == 0) goto L14
            int r0 = r1.az()
        L14:
            return r0
    }

    @Override // com.bytedance.msdk.api.j.r
    public int i() {
            r1 = this;
            int r0 = r1.f2152m
            return r0
    }

    @Override // com.bytedance.msdk.api.j.r
    public boolean kt() {
            r1 = this;
            com.bytedance.sdk.openadsdk.mediation.xt.xt.xt r0 = r1.xt
            if (r0 == 0) goto L9
            boolean r0 = r0.xt()
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // com.bytedance.msdk.api.j.r
    public boolean l() {
            r1 = this;
            com.bytedance.sdk.openadsdk.mediation.xt.xt.j r0 = r1.j
            if (r0 == 0) goto L9
            boolean r0 = r0.oq()
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // com.bytedance.msdk.api.j.r
    public java.lang.String la() {
            r1 = this;
            com.bytedance.sdk.openadsdk.mediation.xt.xt.j r0 = r1.j
            if (r0 == 0) goto L9
            java.lang.String r0 = r0.jy()
            return r0
        L9:
            java.lang.String r0 = ""
            return r0
    }

    @Override // com.bytedance.msdk.api.j.r
    public boolean mi() {
            r1 = this;
            com.bytedance.sdk.openadsdk.mediation.xt.xt.xt r0 = r1.xt
            if (r0 == 0) goto L9
            boolean r0 = r0.j()
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // com.bytedance.msdk.api.j.r
    public java.lang.String nd() {
            r1 = this;
            com.bytedance.sdk.openadsdk.mediation.xt.xt.j r0 = r1.j
            if (r0 == 0) goto L9
            java.lang.String r0 = r0.p()
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // com.bytedance.msdk.api.j.r
    public java.lang.String p() {
            r2 = this;
            com.bytedance.sdk.openadsdk.mediation.xt.xt.j r0 = r2.j
            if (r0 == 0) goto L9
            java.lang.String r0 = r0.x()
            goto Lb
        L9:
            java.lang.String r0 = ""
        Lb:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L19
            com.bytedance.sdk.openadsdk.mediation.xt.xt.xt r1 = r2.xt
            if (r1 == 0) goto L19
            java.lang.String r0 = r1.ws()
        L19:
            return r0
    }

    @Override // com.bytedance.msdk.api.j.r
    public void r(java.lang.String r1) {
            r0 = this;
            r0.ae = r1
            return
    }

    @Override // com.bytedance.msdk.api.j.r
    public boolean rh() {
            r1 = this;
            com.bytedance.sdk.openadsdk.mediation.xt.xt.j r0 = r1.j
            if (r0 == 0) goto L9
            boolean r0 = r0.a()
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // com.bytedance.msdk.api.j.r
    public int rn() {
            r1 = this;
            com.bytedance.sdk.openadsdk.mediation.xt.xt.j r0 = r1.j
            if (r0 == 0) goto L9
            int r0 = r0.az()
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // com.bytedance.msdk.api.j.r
    public int s() {
            r1 = this;
            com.bytedance.sdk.openadsdk.mediation.xt.xt.j r0 = r1.j
            if (r0 == 0) goto L9
            int r0 = r0.ae()
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // com.bytedance.msdk.api.j.r
    public com.bytedance.sdk.openadsdk.mediation.xt.xt.j tj() {
            r1 = this;
            com.bytedance.sdk.openadsdk.mediation.xt.xt.j r0 = r1.j
            return r0
    }

    @Override // com.bytedance.msdk.api.j.r
    public void tl(int r1) {
            r0 = this;
            r0.f2152m = r1
            return
    }

    @Override // com.bytedance.msdk.api.j.r
    public java.lang.String uf() {
            r2 = this;
            com.bytedance.sdk.openadsdk.mediation.xt.xt.xt r0 = r2.xt
            if (r0 == 0) goto L17
            java.util.Map r0 = r0.m()
            if (r0 == 0) goto L17
            java.lang.String r1 = "testToolSlotId"
            java.lang.Object r0 = r0.get(r1)
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L17
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L17:
            java.lang.String r0 = ""
            return r0
    }

    @Override // com.bytedance.msdk.api.j.r
    public java.lang.String v() {
            r1 = this;
            java.lang.String r0 = r1.ae
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto Lb
            java.lang.String r0 = r1.ae
            return r0
        Lb:
            com.bytedance.sdk.openadsdk.mediation.xt.xt.j r0 = r1.j
            if (r0 == 0) goto L14
            java.lang.String r0 = r0.r()
            return r0
        L14:
            java.lang.String r0 = ""
            return r0
    }

    @Override // com.bytedance.msdk.api.j.r
    public boolean w() {
            r1 = this;
            com.bytedance.sdk.openadsdk.mediation.xt.xt.xt r0 = r1.xt
            if (r0 == 0) goto L9
            boolean r0 = r0.g()
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // com.bytedance.msdk.api.j.r
    public boolean wq() {
            r1 = this;
            com.bytedance.sdk.openadsdk.mediation.xt.xt.xt r0 = r1.xt
            if (r0 == 0) goto L9
            boolean r0 = r0.cw()
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // com.bytedance.msdk.api.j.r
    public float ws() {
            r1 = this;
            com.bytedance.sdk.openadsdk.mediation.xt.xt.j r0 = r1.j
            if (r0 == 0) goto L9
            float r0 = r0.tl()
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // com.bytedance.msdk.api.j.r
    public java.lang.String x() {
            r1 = this;
            com.bytedance.sdk.openadsdk.mediation.xt.xt.xt r0 = r1.xt
            if (r0 == 0) goto L9
            java.lang.String r0 = r0.tl()
            return r0
        L9:
            java.lang.String r0 = ""
            return r0
    }
}
