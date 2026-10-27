package com.bytedance.msdk.cw.cw.xt.j.j;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public abstract class xt extends com.bytedance.msdk.cw.cw.xt.j.xt {
    protected int ae;
    protected java.util.function.Function<android.util.SparseArray<java.lang.Object>, java.lang.Object> cw;
    private java.lang.String g;

    /* renamed from: m, reason: collision with root package name */
    protected boolean f2321m;
    private java.lang.String oq;
    private com.bytedance.msdk.api.j.xt qv;

    /* renamed from: r, reason: collision with root package name */
    protected com.bytedance.msdk.cw.m.xt.xt f2322r;
    protected int tl;
    protected java.util.Map<java.lang.String, java.lang.Object> up;
    protected com.bytedance.msdk.api.r.j.xt.cw.cw xt;

    public xt(java.lang.String r1, com.bytedance.msdk.cw.j.xt r2) {
            r0 = this;
            r0.<init>(r2)
            java.util.concurrent.ConcurrentHashMap r2 = new java.util.concurrent.ConcurrentHashMap
            r2.<init>()
            r0.up = r2
            r2 = 0
            r0.f2321m = r2
            r0.ae = r2
            r0.tl = r2
            r0.oq = r1
            return
    }

    public java.lang.String ae() {
            r1 = this;
            com.bytedance.msdk.cw.m.xt.xt r0 = r1.f2322r
            if (r0 == 0) goto L9
            java.lang.String r0 = r0.ch()
            return r0
        L9:
            java.lang.String r0 = ""
            return r0
    }

    @Override // com.bytedance.msdk.cw.cw.xt.j.xt
    public <T> T applyFunction(int r5, com.bykv.vk.openvk.api.proto.PluginValueSet r6, java.lang.Class<T> r7) {
            r4 = this;
            r0 = 8221(0x201d, float:1.152E-41)
            if (r5 != r0) goto L15
            r0 = 8405(0x20d5, float:1.1778E-41)
            java.lang.Class r1 = z0.a.a()
            java.lang.Object r0 = r6.objectValue(r0, r1)
            java.util.function.Function r0 = z0.b.a(r0)
            r4.cw = r0
            goto L7d
        L15:
            r0 = 8137(0x1fc9, float:1.1402E-41)
            java.lang.String r1 = "TTMediationSDK"
            if (r5 != r0) goto L2d
            java.lang.String r5 = r4.ae()
            java.lang.String r6 = "Adn custom loader : getAdm = "
            java.lang.String r7 = java.lang.String.valueOf(r5)
            java.lang.String r6 = r6.concat(r7)
            com.bytedance.msdk.j.up.cw.xt(r1, r6)
            return r5
        L2d:
            r0 = 8224(0x2020, float:1.1524E-41)
            if (r5 != r0) goto L43
            java.lang.Object r5 = r4.tl()
            java.lang.String r6 = "Adn custom loader : getExtraDataNoParse = "
            java.lang.String r7 = java.lang.String.valueOf(r5)
            java.lang.String r6 = r6.concat(r7)
            com.bytedance.msdk.j.up.cw.xt(r1, r6)
            return r5
        L43:
            r0 = 8226(0x2022, float:1.1527E-41)
            if (r5 != r0) goto L5d
            int r5 = r4.g()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r6 = "Adn custom loader : getBiddingType = "
            java.lang.String r7 = java.lang.String.valueOf(r5)
            java.lang.String r6 = r6.concat(r7)
            com.bytedance.msdk.j.up.cw.xt(r1, r6)
            return r5
        L5d:
            r0 = 8227(0x2023, float:1.1528E-41)
            if (r5 != r0) goto L7d
            if (r6 == 0) goto L7d
            r0 = 8075(0x1f8b, float:1.1315E-41)
            java.lang.Class<java.util.Map> r2 = java.util.Map.class
            java.lang.Object r0 = r6.objectValue(r0, r2)
            java.util.Map r0 = (java.util.Map) r0
            java.lang.String r2 = "Adn custom loader : setExtraInfo map ="
            java.lang.String r3 = java.lang.String.valueOf(r0)
            java.lang.String r2 = r2.concat(r3)
            com.bytedance.msdk.j.up.cw.xt(r1, r2)
            r4.j(r0)
        L7d:
            java.lang.Object r5 = r4.j(r5, r6, r7)
            return r5
    }

    public final void cw(com.bytedance.msdk.api.r.j.xt.xt.j.InterfaceC0216j r3) {
            r2 = this;
            int r0 = r2.tl
            r1 = 60
            if (r0 >= r1) goto L10
            int r0 = r0 + 1
            r2.tl = r0
            if (r3 == 0) goto Lf
            r3.j()
        Lf:
            return
        L10:
            java.lang.String r3 = "TTMediationSDK"
            java.lang.String r0 = "自定义Adapter click方法回调次数需要小于60次"
            com.bytedance.msdk.j.up.cw.r(r3, r0)
            return
    }

    public int g() {
            r1 = this;
            com.bytedance.msdk.cw.m.xt.xt r0 = r1.f2322r
            if (r0 == 0) goto L9
            int r0 = r0.mi()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public abstract <T> T j(int r1, com.bykv.vk.openvk.api.proto.PluginValueSet r2, java.lang.Class<T> r3);

    public java.lang.String j(java.lang.String r1) {
            r0 = this;
            java.lang.String r1 = r0.g
            return r1
    }

    public void j(int r2, java.lang.String r3) {
            r1 = this;
            com.bytedance.msdk.api.j r0 = new com.bytedance.msdk.api.j
            r0.<init>(r2, r3)
            r1.j(r0)
            return
    }

    public final void j(com.bytedance.msdk.api.r.j.xt.xt.j.InterfaceC0216j r2) {
            r1 = this;
            boolean r0 = r1.xt()
            if (r0 == 0) goto Lc
            if (r2 == 0) goto Lb
            r2.j()
        Lb:
            return
        Lc:
            java.lang.String r2 = "TTMediationSDK"
            java.lang.String r0 = "自定义Adapter 调用错误需要在load成功之后才可以调用"
            com.bytedance.msdk.j.up.cw.r(r2, r0)
            return
    }

    @Override // com.bytedance.msdk.cw.cw.xt.j.xt
    public void j(com.bytedance.msdk.xt.cw r3) {
            r2 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 1
            r0.<init>(r1)
            r0.add(r3)
            r2.j(r0)
            return
    }

    protected void j(com.bytedance.msdk.xt.cw r4, double r5, java.util.Map<java.lang.String, java.lang.Object> r7) {
            r3 = this;
            r0 = 0
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 <= 0) goto L10
            int r0 = r3.g()
            r1 = 1
            if (r0 != r1) goto L10
            r4.j(r5)
        L10:
            if (r7 == 0) goto L17
            java.util.Map<java.lang.String, java.lang.Object> r5 = r3.up
            r5.putAll(r7)
        L17:
            java.util.Map<java.lang.String, java.lang.Object> r5 = r3.up
            r4.r(r5)
            r3.j(r4)
            return
    }

    @Override // com.bytedance.msdk.cw.cw.xt.j.xt
    public void j(java.util.List<com.bytedance.msdk.xt.cw> r4) {
            r3 = this;
            java.util.Iterator r0 = r4.iterator()
        L4:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1f
            java.lang.Object r1 = r0.next()
            com.bytedance.msdk.xt.cw r1 = (com.bytedance.msdk.xt.cw) r1
            java.util.Map<java.lang.String, java.lang.Object> r2 = r3.up
            r1.cw(r2)
            com.bytedance.msdk.cw.m.xt.xt r2 = r3.f2322r
            int r2 = r2.s()
            r1.ws(r2)
            goto L4
        L1f:
            super.j(r4)
            return
    }

    public void j(java.util.Map<java.lang.String, java.lang.Object> r2) {
            r1 = this;
            if (r2 == 0) goto Lc
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.up
            r0.clear()
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.up
            r0.putAll(r2)
        Lc:
            return
    }

    public void j(boolean r3, double r4, int r6, java.util.Map<java.lang.String, java.lang.Object> r7) {
            r2 = this;
            java.util.function.Function<android.util.SparseArray<java.lang.Object>, java.lang.Object> r0 = r2.cw
            if (r0 == 0) goto L41
            com.bytedance.sdk.openadsdk.i.r r0 = com.bytedance.sdk.openadsdk.i.r.j()
            r1 = 8225(0x2021, float:1.1526E-41)
            com.bytedance.sdk.openadsdk.i.r r0 = r0.j(r1)
            java.lang.Class<java.lang.Void> r1 = java.lang.Void.class
            com.bytedance.sdk.openadsdk.i.r r0 = r0.j(r1)
            r1 = 8406(0x20d6, float:1.178E-41)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            com.bytedance.sdk.openadsdk.i.r r3 = r0.j(r1, r3)
            r0 = 8407(0x20d7, float:1.1781E-41)
            java.lang.Double r4 = java.lang.Double.valueOf(r4)
            com.bytedance.sdk.openadsdk.i.r r3 = r3.j(r0, r4)
            r4 = 8408(0x20d8, float:1.1782E-41)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)
            com.bytedance.sdk.openadsdk.i.r r3 = r3.j(r4, r5)
            r4 = 8075(0x1f8b, float:1.1315E-41)
            com.bytedance.sdk.openadsdk.i.r r3 = r3.j(r4, r7)
            android.util.SparseArray r3 = r3.xt()
            java.util.function.Function<android.util.SparseArray<java.lang.Object>, java.lang.Object> r4 = r2.cw
            com.bytedance.msdk.core.ae.a.a(r4, r3)
        L41:
            return
    }

    public void jy() {
            r2 = this;
            java.util.function.Function<android.util.SparseArray<java.lang.Object>, java.lang.Object> r0 = r2.cw
            if (r0 == 0) goto L1d
            com.bytedance.sdk.openadsdk.i.r r0 = com.bytedance.sdk.openadsdk.i.r.j()
            r1 = 8109(0x1fad, float:1.1363E-41)
            com.bytedance.sdk.openadsdk.i.r r0 = r0.j(r1)
            java.lang.Class<java.lang.Void> r1 = java.lang.Void.class
            com.bytedance.sdk.openadsdk.i.r r0 = r0.j(r1)
            android.util.SparseArray r0 = r0.xt()
            java.util.function.Function<android.util.SparseArray<java.lang.Object>, java.lang.Object> r1 = r2.cw
            com.bytedance.msdk.core.ae.a.a(r1, r0)
        L1d:
            return
    }

    public void m() {
            r1 = this;
            r0 = 1
            r1.f2321m = r0
            return
    }

    public java.lang.Integer oq() {
            r3 = this;
            r0 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.util.function.Function<android.util.SparseArray<java.lang.Object>, java.lang.Object> r1 = r3.cw
            if (r1 == 0) goto L31
            com.bytedance.sdk.openadsdk.i.r r1 = com.bytedance.sdk.openadsdk.i.r.j()
            r2 = 8121(0x1fb9, float:1.138E-41)
            com.bytedance.sdk.openadsdk.i.r r1 = r1.j(r2)
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            com.bytedance.sdk.openadsdk.i.r r1 = r1.j(r2)
            r2 = 20068(0x4e64, float:2.8121E-41)
            com.bytedance.sdk.openadsdk.i.r r1 = r1.j(r2, r0)
            android.util.SparseArray r1 = r1.xt()
            java.util.function.Function<android.util.SparseArray<java.lang.Object>, java.lang.Object> r2 = r3.cw
            java.lang.Object r1 = com.bytedance.msdk.core.ae.a.a(r2, r1)
            java.lang.Integer r1 = com.bytedance.sdk.openadsdk.core.wq.j.j.j(r1)
            if (r1 != 0) goto L30
            return r0
        L30:
            return r1
        L31:
            return r0
    }

    public void qv() {
            r2 = this;
            java.util.function.Function<android.util.SparseArray<java.lang.Object>, java.lang.Object> r0 = r2.cw
            if (r0 == 0) goto L1d
            com.bytedance.sdk.openadsdk.i.r r0 = com.bytedance.sdk.openadsdk.i.r.j()
            r1 = 8149(0x1fd5, float:1.1419E-41)
            com.bytedance.sdk.openadsdk.i.r r0 = r0.j(r1)
            java.lang.Class<java.lang.Void> r1 = java.lang.Void.class
            com.bytedance.sdk.openadsdk.i.r r0 = r0.j(r1)
            android.util.SparseArray r0 = r0.xt()
            java.util.function.Function<android.util.SparseArray<java.lang.Object>, java.lang.Object> r1 = r2.cw
            com.bytedance.msdk.core.ae.a.a(r1, r0)
        L1d:
            return
    }

    public java.lang.Object tl() {
            r1 = this;
            com.bytedance.msdk.cw.m.xt.xt r0 = r1.f2322r
            if (r0 == 0) goto L9
            java.lang.Object r0 = r0.uf()
            return r0
        L9:
            java.lang.String r0 = ""
            return r0
    }

    public void vl() {
            r2 = this;
            java.util.function.Function<android.util.SparseArray<java.lang.Object>, java.lang.Object> r0 = r2.cw
            if (r0 == 0) goto L1d
            com.bytedance.sdk.openadsdk.i.r r0 = com.bytedance.sdk.openadsdk.i.r.j()
            r1 = 8148(0x1fd4, float:1.1418E-41)
            com.bytedance.sdk.openadsdk.i.r r0 = r0.j(r1)
            java.lang.Class<java.lang.Void> r1 = java.lang.Void.class
            com.bytedance.sdk.openadsdk.i.r r0 = r0.j(r1)
            android.util.SparseArray r0 = r0.xt()
            java.util.function.Function<android.util.SparseArray<java.lang.Object>, java.lang.Object> r1 = r2.cw
            com.bytedance.msdk.core.ae.a.a(r1, r0)
        L1d:
            return
    }

    @Override // com.bytedance.msdk.cw.cw.xt.j.xt
    public final void xt(android.content.Context r7, com.bytedance.msdk.cw.m.xt.xt r8, com.bytedance.msdk.api.j.xt r9, java.util.Map<java.lang.String, java.lang.Object> r10) {
            r6 = this;
            r6.f2322r = r8
            r6.qv = r9
            com.bytedance.msdk.api.r.j.xt.cw.cw r0 = new com.bytedance.msdk.api.r.j.xt.cw.cw
            java.lang.String r1 = r8.f()
            java.lang.String r2 = r8.vl()
            int r3 = r8.ws()
            int r4 = r8.az()
            java.lang.String r5 = r8.wq()
            r0.<init>(r1, r2, r3, r4, r5)
            r6.xt = r0
            java.lang.String r8 = r8.jy()
            com.bytedance.msdk.api.r.j.xt.m.j r8 = com.bytedance.msdk.m.xt.j.j(r8)
            if (r8 == 0) goto L2e
            java.lang.String r8 = r8.j()
            goto L30
        L2e:
            java.lang.String r8 = ""
        L30:
            r6.g = r8
            com.bytedance.sdk.openadsdk.i.r r8 = com.bytedance.sdk.openadsdk.i.r.j()
            r10 = 8011(0x1f4b, float:1.1226E-41)
            r8.j(r10, r6)
            int r10 = com.bytedance.sdk.gromore.init.j.j()
            r0 = 5900(0x170c, float:8.268E-42)
            r1 = 8009(0x1f49, float:1.1223E-41)
            if (r10 < r0) goto L4d
            java.lang.Object r7 = com.bytedance.msdk.j.up.j.j(r7)
            r8.j(r1, r7)
            goto L50
        L4d:
            r8.j(r1, r7)
        L50:
            r7 = 8010(0x1f4a, float:1.1224E-41)
            java.lang.String r10 = r6.oq
            r8.j(r7, r10)
            com.bytedance.msdk.api.r.j.xt.cw.cw r7 = r6.xt
            android.util.SparseArray r7 = r7.j()
            java.lang.Object r7 = com.bytedance.sdk.openadsdk.i.cw.r.j(r7)
            r10 = 8546(0x2162, float:1.1975E-41)
            r8.j(r10, r7)
            android.util.SparseArray r7 = r9.gx()
            if (r7 == 0) goto L79
            android.util.SparseArray r7 = r9.gx()
            java.lang.Object r7 = com.bytedance.sdk.openadsdk.i.cw.r.j(r7)
            r9 = 8548(0x2164, float:1.1978E-41)
            r8.j(r9, r7)
        L79:
            com.bytedance.msdk.core.qv.j r7 = com.bytedance.msdk.core.qv.j.j()
            java.util.function.Function r7 = r7.ae()
            if (r7 == 0) goto L95
            java.lang.Class<java.lang.Void> r9 = java.lang.Void.class
            r8.j(r9)
            r9 = 8106(0x1faa, float:1.1359E-41)
            r8.j(r9)
            android.util.SparseArray r8 = r8.xt()
            com.bytedance.msdk.core.ae.a.a(r7, r8)
            return
        L95:
            com.bytedance.msdk.api.j r7 = new com.bytedance.msdk.api.j
            java.lang.String r8 = "Adn custom class loader is null"
            r7.<init>(r8)
            r6.j(r7)
            return
    }

    public final void xt(com.bytedance.msdk.api.r.j.xt.xt.j.InterfaceC0216j r4) {
            r3 = this;
            boolean r0 = r3.f2321m
            java.lang.String r1 = "TTMediationSDK"
            if (r0 == 0) goto L1b
            int r0 = r3.ae
            r2 = 2
            if (r0 >= r2) goto L15
            int r0 = r0 + 1
            r3.ae = r0
            if (r4 == 0) goto L14
            r4.j()
        L14:
            return
        L15:
            java.lang.String r4 = "自定义Adapter show方法回调次数需要小于2次"
            com.bytedance.msdk.j.up.cw.r(r1, r4)
            return
        L1b:
            java.lang.String r4 = "自定义Adapter show方法回调必须由GroMore触发show时才会生效"
            com.bytedance.msdk.j.up.cw.r(r1, r4)
            return
    }
}
