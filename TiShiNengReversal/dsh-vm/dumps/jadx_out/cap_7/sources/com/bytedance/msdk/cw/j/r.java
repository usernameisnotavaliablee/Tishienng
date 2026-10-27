package com.bytedance.msdk.cw.j;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public abstract class r extends com.bytedance.msdk.xt.cw {
    protected java.util.function.Function<android.util.SparseArray<java.lang.Object>, java.lang.Object> g;
    protected com.bytedance.msdk.cw.m.xt.j oq;

    public r(com.bytedance.msdk.cw.m.xt.j r1) {
            r0 = this;
            r0.<init>()
            r0.oq = r1
            return
    }

    @Override // com.bytedance.msdk.xt.cw, com.bytedance.sdk.openadsdk.core.wq.r
    public <T> T applyFunction(int r3, com.bykv.vk.openvk.api.proto.PluginValueSet r4, java.lang.Class<T> r5) {
            r2 = this;
            r0 = 8128(0x1fc0, float:1.139E-41)
            if (r3 != r0) goto L15
            r0 = 8035(0x1f63, float:1.126E-41)
            java.lang.Class r1 = z0.a.a()
            java.lang.Object r0 = r4.objectValue(r0, r1)
            java.util.function.Function r0 = z0.b.a(r0)
            r2.g = r0
            goto L44
        L15:
            r0 = 8208(0x2010, float:1.1502E-41)
            if (r3 != r0) goto L29
            r0 = 8058(0x1f7a, float:1.1292E-41)
            java.lang.String r0 = r4.stringValue(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L44
            r2.ws(r0)
            goto L44
        L29:
            r0 = 8209(0x2011, float:1.1503E-41)
            if (r3 != r0) goto L37
            r0 = 8060(0x1f7c, float:1.1294E-41)
            int r0 = r4.intValue(r0)
            r2.qv(r0)
            goto L44
        L37:
            r0 = 8140(0x1fcc, float:1.1407E-41)
            if (r3 != r0) goto L44
            r0 = 8059(0x1f7b, float:1.1293E-41)
            int r0 = r4.intValue(r0)
            r2.vl(r0)
        L44:
            java.lang.Object r3 = r2.j(r3, r4, r5)
            return r3
    }

    @Override // com.bytedance.msdk.xt.cw
    public void av() {
            r2 = this;
            super.av()
            java.util.function.Function<android.util.SparseArray<java.lang.Object>, java.lang.Object> r0 = r2.g
            if (r0 == 0) goto L20
            com.bytedance.sdk.openadsdk.i.r r0 = com.bytedance.sdk.openadsdk.i.r.j()
            r1 = 8149(0x1fd5, float:1.1419E-41)
            com.bytedance.sdk.openadsdk.i.r r0 = r0.j(r1)
            java.lang.Class<java.lang.Void> r1 = java.lang.Void.class
            com.bytedance.sdk.openadsdk.i.r r0 = r0.j(r1)
            android.util.SparseArray r0 = r0.xt()
            java.util.function.Function<android.util.SparseArray<java.lang.Object>, java.lang.Object> r1 = r2.g
            com.bytedance.msdk.core.ae.a.a(r1, r0)
        L20:
            return
    }

    @Override // com.bytedance.msdk.xt.cw
    public void i() {
            r2 = this;
            super.i()
            java.util.function.Function<android.util.SparseArray<java.lang.Object>, java.lang.Object> r0 = r2.g
            if (r0 == 0) goto L20
            com.bytedance.sdk.openadsdk.i.r r0 = com.bytedance.sdk.openadsdk.i.r.j()
            r1 = 8148(0x1fd4, float:1.1418E-41)
            com.bytedance.sdk.openadsdk.i.r r0 = r0.j(r1)
            java.lang.Class<java.lang.Void> r1 = java.lang.Void.class
            com.bytedance.sdk.openadsdk.i.r r0 = r0.j(r1)
            android.util.SparseArray r0 = r0.xt()
            java.util.function.Function<android.util.SparseArray<java.lang.Object>, java.lang.Object> r1 = r2.g
            com.bytedance.msdk.core.ae.a.a(r1, r0)
        L20:
            return
    }

    /* renamed from: if, reason: not valid java name */
    public boolean m3if() {
            r1 = this;
            com.bytedance.msdk.cw.m.xt.j r0 = r1.oq
            if (r0 == 0) goto L9
            boolean r0 = r0.j()
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // com.bytedance.msdk.xt.cw
    public long ig() {
            r2 = this;
            java.util.function.Function<android.util.SparseArray<java.lang.Object>, java.lang.Object> r0 = r2.g
            if (r0 == 0) goto L2c
            com.bytedance.sdk.openadsdk.i.r r0 = com.bytedance.sdk.openadsdk.i.r.j()
            r1 = 8245(0x2035, float:1.1554E-41)
            com.bytedance.sdk.openadsdk.i.r r0 = r0.j(r1)
            java.lang.Class<java.lang.Long> r1 = java.lang.Long.class
            com.bytedance.sdk.openadsdk.i.r r0 = r0.j(r1)
            android.util.SparseArray r0 = r0.xt()
            java.util.function.Function<android.util.SparseArray<java.lang.Object>, java.lang.Object> r1 = r2.g
            java.lang.Object r0 = com.bytedance.msdk.core.ae.a.a(r1, r0)
            boolean r1 = r0 instanceof java.lang.Long
            if (r1 == 0) goto L29
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            return r0
        L29:
            r0 = 0
            return r0
        L2c:
            long r0 = super.ig()
            return r0
    }

    public abstract <T> T j(int r1, com.bykv.vk.openvk.api.proto.PluginValueSet r2, java.lang.Class<T> r3);

    @Override // com.bytedance.msdk.xt.cw
    public void j(java.util.Map<java.lang.String, java.lang.Object> r3) {
            r2 = this;
            boolean r0 = r2.oy()
            if (r0 != 0) goto L7
            goto L52
        L7:
            java.lang.String r0 = "bidding_lose_reason_NUM"
            java.lang.Object r0 = r3.get(r0)
            boolean r1 = r0 instanceof java.lang.Integer
            if (r1 == 0) goto L18
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            goto L19
        L18:
            r0 = 0
        L19:
            if (r0 <= 0) goto L1c
            goto L1e
        L1c:
            r0 = 10001(0x2711, float:1.4014E-41)
        L1e:
            java.lang.String r1 = r2.zz()
            int r0 = com.bytedance.msdk.core.j.j.up.j(r1, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "bidding_lose_reason_dex_adapter"
            r3.put(r1, r0)
            java.util.function.Function<android.util.SparseArray<java.lang.Object>, java.lang.Object> r0 = r2.g
            if (r0 == 0) goto L52
            com.bytedance.sdk.openadsdk.i.r r0 = com.bytedance.sdk.openadsdk.i.r.j()
            r1 = 8144(0x1fd0, float:1.1412E-41)
            com.bytedance.sdk.openadsdk.i.r r0 = r0.j(r1)
            java.lang.Class<java.lang.Void> r1 = java.lang.Void.class
            com.bytedance.sdk.openadsdk.i.r r0 = r0.j(r1)
            r1 = 8006(0x1f46, float:1.1219E-41)
            com.bytedance.sdk.openadsdk.i.r r3 = r0.j(r1, r3)
            android.util.SparseArray r3 = r3.xt()
            java.util.function.Function<android.util.SparseArray<java.lang.Object>, java.lang.Object> r0 = r2.g
            com.bytedance.msdk.core.ae.a.a(r0, r3)
        L52:
            return
    }

    @Override // com.bytedance.msdk.xt.cw
    public java.util.Map<java.lang.String, java.lang.Object> p() {
            r2 = this;
            java.util.function.Function<android.util.SparseArray<java.lang.Object>, java.lang.Object> r0 = r2.g
            if (r0 == 0) goto L29
            com.bytedance.sdk.openadsdk.i.r r0 = com.bytedance.sdk.openadsdk.i.r.j()
            r1 = 8239(0x202f, float:1.1545E-41)
            com.bytedance.sdk.openadsdk.i.r r0 = r0.j(r1)
            java.lang.Class<java.util.Map> r1 = java.util.Map.class
            com.bytedance.sdk.openadsdk.i.r r0 = r0.j(r1)
            android.util.SparseArray r0 = r0.xt()
            java.util.function.Function<android.util.SparseArray<java.lang.Object>, java.lang.Object> r1 = r2.g
            java.lang.Object r0 = com.bytedance.msdk.core.ae.a.a(r1, r0)
            boolean r1 = r0 instanceof java.util.Map
            if (r1 == 0) goto L25
            java.util.Map r0 = (java.util.Map) r0
            goto L26
        L25:
            r0 = 0
        L26:
            r2.cw(r0)
        L29:
            java.util.Map r0 = super.p()
            return r0
    }

    @Override // com.bytedance.msdk.xt.cw
    public boolean up() {
            r2 = this;
            java.util.function.Function<android.util.SparseArray<java.lang.Object>, java.lang.Object> r0 = r2.g
            if (r0 == 0) goto L1d
            com.bytedance.sdk.openadsdk.i.r r0 = com.bytedance.sdk.openadsdk.i.r.j()
            r1 = 8120(0x1fb8, float:1.1379E-41)
            com.bytedance.sdk.openadsdk.i.r r0 = r0.j(r1)
            java.lang.Class<java.lang.Boolean> r1 = java.lang.Boolean.class
            com.bytedance.sdk.openadsdk.i.r r0 = r0.j(r1)
            android.util.SparseArray r0 = r0.xt()
            java.util.function.Function<android.util.SparseArray<java.lang.Object>, java.lang.Object> r1 = r2.g
            com.bytedance.msdk.core.ae.a.a(r1, r0)
        L1d:
            r0 = 0
            return r0
    }

    @Override // com.bytedance.msdk.xt.cw
    public void w() {
            r2 = this;
            super.w()
            java.util.function.Function<android.util.SparseArray<java.lang.Object>, java.lang.Object> r0 = r2.g
            if (r0 == 0) goto L20
            com.bytedance.sdk.openadsdk.i.r r0 = com.bytedance.sdk.openadsdk.i.r.j()
            r1 = 8109(0x1fad, float:1.1363E-41)
            com.bytedance.sdk.openadsdk.i.r r0 = r0.j(r1)
            java.lang.Class<java.lang.Void> r1 = java.lang.Void.class
            com.bytedance.sdk.openadsdk.i.r r0 = r0.j(r1)
            android.util.SparseArray r0 = r0.xt()
            java.util.function.Function<android.util.SparseArray<java.lang.Object>, java.lang.Object> r1 = r2.g
            com.bytedance.msdk.core.ae.a.a(r1, r0)
        L20:
            return
    }

    @Override // com.bytedance.msdk.xt.cw
    public void xt(java.util.Map<java.lang.String, java.lang.Object> r3) {
            r2 = this;
            boolean r0 = r2.oy()
            if (r0 != 0) goto L7
            goto L2a
        L7:
            java.util.function.Function<android.util.SparseArray<java.lang.Object>, java.lang.Object> r0 = r2.g
            if (r0 == 0) goto L2a
            com.bytedance.sdk.openadsdk.i.r r0 = com.bytedance.sdk.openadsdk.i.r.j()
            r1 = 8142(0x1fce, float:1.141E-41)
            com.bytedance.sdk.openadsdk.i.r r0 = r0.j(r1)
            java.lang.Class<java.lang.Void> r1 = java.lang.Void.class
            com.bytedance.sdk.openadsdk.i.r r0 = r0.j(r1)
            r1 = 8006(0x1f46, float:1.1219E-41)
            com.bytedance.sdk.openadsdk.i.r r3 = r0.j(r1, r3)
            android.util.SparseArray r3 = r3.xt()
            java.util.function.Function<android.util.SparseArray<java.lang.Object>, java.lang.Object> r0 = r2.g
            com.bytedance.msdk.core.ae.a.a(r0, r3)
        L2a:
            return
    }

    @Override // com.bytedance.msdk.xt.cw
    public long yb() {
            r2 = this;
            java.util.function.Function<android.util.SparseArray<java.lang.Object>, java.lang.Object> r0 = r2.g
            if (r0 == 0) goto L2c
            com.bytedance.sdk.openadsdk.i.r r0 = com.bytedance.sdk.openadsdk.i.r.j()
            r1 = 8246(0x2036, float:1.1555E-41)
            com.bytedance.sdk.openadsdk.i.r r0 = r0.j(r1)
            java.lang.Class<java.lang.Long> r1 = java.lang.Long.class
            com.bytedance.sdk.openadsdk.i.r r0 = r0.j(r1)
            android.util.SparseArray r0 = r0.xt()
            java.util.function.Function<android.util.SparseArray<java.lang.Object>, java.lang.Object> r1 = r2.g
            java.lang.Object r0 = com.bytedance.msdk.core.ae.a.a(r1, r0)
            boolean r1 = r0 instanceof java.lang.Long
            if (r1 == 0) goto L29
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            return r0
        L29:
            r0 = 0
            return r0
        L2c:
            long r0 = super.yb()
            return r0
    }
}
