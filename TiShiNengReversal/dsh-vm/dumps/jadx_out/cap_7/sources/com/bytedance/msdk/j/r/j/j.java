package com.bytedance.msdk.j.r.j;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class j extends com.bytedance.msdk.api.r.j.xt.m.j {
    private final java.util.function.Function<android.util.SparseArray<java.lang.Object>, java.lang.Object> cw;
    private java.util.function.Function<android.util.SparseArray<java.lang.Object>, java.lang.Object> r;

    public j() {
            r1 = this;
            r1.<init>()
            com.bytedance.msdk.core.j r0 = com.bytedance.msdk.core.j.qv()
            com.bykv.vk.openvk.api.proto.PluginValueSet r0 = r0.ol()
            com.bytedance.msdk.m.xt.cw r0 = com.bytedance.msdk.m.xt.cw.j(r0)
            java.util.function.Function r0 = r0.j()
            r1.cw = r0
            return
    }

    public <T> T applyFunction(int r3, com.bykv.vk.openvk.api.proto.PluginValueSet r4, java.lang.Class<T> r5) {
            r2 = this;
            r0 = 8216(0x2018, float:1.1513E-41)
            if (r3 != r0) goto L15
            r3 = 8402(0x20d2, float:1.1774E-41)
            java.lang.Class r0 = z0.a.a()
            java.lang.Object r3 = r4.objectValue(r3, r0)
            java.util.function.Function r3 = z0.b.a(r3)
            r2.r = r3
            goto L3e
        L15:
            r0 = 8219(0x201b, float:1.1517E-41)
            if (r3 != r0) goto L1d
            r2.cw()
            goto L3e
        L1d:
            r0 = 8220(0x201c, float:1.1519E-41)
            if (r3 != r0) goto L2a
            boolean r3 = r2.r()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            return r3
        L2a:
            r0 = 8270(0x204e, float:1.1589E-41)
            if (r3 != r0) goto L3e
            r3 = 8073(0x1f89, float:1.1313E-41)
            long r0 = r4.longValue(r3)
            r3 = 8557(0x216d, float:1.1991E-41)
            int r3 = r4.intValue(r3)
            r2.xt = r3
            r2.j = r0
        L3e:
            java.lang.Object r3 = com.bytedance.msdk.core.av.j.j(r5)
            return r3
    }

    public java.lang.String j() {
            r2 = this;
            java.util.function.Function<android.util.SparseArray<java.lang.Object>, java.lang.Object> r0 = r2.r
            if (r0 == 0) goto L28
            com.bytedance.sdk.openadsdk.i.r r0 = com.bytedance.sdk.openadsdk.i.r.j()
            r1 = 8218(0x201a, float:1.1516E-41)
            com.bytedance.sdk.openadsdk.i.r r0 = r0.j(r1)
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            com.bytedance.sdk.openadsdk.i.r r0 = r0.j(r1)
            android.util.SparseArray r0 = r0.xt()
            java.util.function.Function<android.util.SparseArray<java.lang.Object>, java.lang.Object> r1 = r2.r
            java.lang.Object r0 = com.bytedance.msdk.core.ae.a.a(r1, r0)
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L25
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L25:
            java.lang.String r0 = ""
            return r0
        L28:
            r0 = 0
            return r0
    }

    public java.lang.String j(android.content.Context r3, java.util.Map<java.lang.String, java.lang.Object> r4) {
            r2 = this;
            java.util.function.Function<android.util.SparseArray<java.lang.Object>, java.lang.Object> r0 = r2.r
            if (r0 == 0) goto L34
            com.bytedance.sdk.openadsdk.i.r r0 = com.bytedance.sdk.openadsdk.i.r.j()
            r1 = 8139(0x1fcb, float:1.1405E-41)
            com.bytedance.sdk.openadsdk.i.r r0 = r0.j(r1)
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            com.bytedance.sdk.openadsdk.i.r r0 = r0.j(r1)
            r1 = 8009(0x1f49, float:1.1223E-41)
            com.bytedance.sdk.openadsdk.i.r r3 = r0.j(r1, r3)
            r0 = 8075(0x1f8b, float:1.1315E-41)
            com.bytedance.sdk.openadsdk.i.r r3 = r3.j(r0, r4)
            android.util.SparseArray r3 = r3.xt()
            java.util.function.Function<android.util.SparseArray<java.lang.Object>, java.lang.Object> r4 = r2.r
            java.lang.Object r3 = com.bytedance.msdk.core.ae.a.a(r4, r3)
            boolean r4 = r3 instanceof java.lang.String
            if (r4 == 0) goto L31
            java.lang.String r3 = (java.lang.String) r3
            return r3
        L31:
            java.lang.String r3 = ""
            return r3
        L34:
            java.lang.String r3 = super.j(r3, r4)
            return r3
    }

    public void j(android.content.Context r3, com.bytedance.msdk.api.r.j.xt.cw.xt r4, java.util.Map<java.lang.String, java.lang.Object> r5) {
            r2 = this;
            if (r4 == 0) goto L52
            com.bytedance.sdk.openadsdk.i.r r3 = com.bytedance.sdk.openadsdk.i.r.j()
            r0 = 8100(0x1fa4, float:1.135E-41)
            com.bytedance.sdk.openadsdk.i.r r3 = r3.j(r0)
            java.lang.Class<java.lang.Void> r0 = java.lang.Void.class
            com.bytedance.sdk.openadsdk.i.r r3 = r3.j(r0)
            com.bytedance.msdk.core.j r0 = com.bytedance.msdk.core.j.qv()
            com.bykv.vk.openvk.api.proto.PluginValueSet r0 = r0.ol()
            android.util.SparseArray r0 = r0.sparseArray()
            r1 = 8089(0x1f99, float:1.1335E-41)
            com.bytedance.sdk.openadsdk.i.r r3 = r3.j(r1, r0)
            android.util.SparseArray r4 = r4.j()
            java.lang.Object r4 = com.bytedance.sdk.openadsdk.i.cw.r.j(r4)
            r0 = 8545(0x2161, float:1.1974E-41)
            com.bytedance.sdk.openadsdk.i.r r3 = r3.j(r0, r4)
            r4 = 8400(0x20d0, float:1.1771E-41)
            com.bytedance.sdk.openadsdk.i.r r3 = r3.j(r4, r5)
            r4 = 8401(0x20d1, float:1.1772E-41)
            com.bytedance.sdk.openadsdk.i.r r3 = r3.j(r4, r2)
            r4 = 8098(0x1fa2, float:1.1348E-41)
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            com.bytedance.sdk.openadsdk.i.r r3 = r3.j(r4, r5)
            com.bytedance.msdk.m.xt.up.j(r3)
            java.util.function.Function<android.util.SparseArray<java.lang.Object>, java.lang.Object> r4 = r2.cw
            android.util.SparseArray r3 = r3.xt()
            com.bytedance.msdk.core.ae.a.a(r4, r3)
        L52:
            return
    }

    public java.lang.String xt() {
            r1 = this;
            java.lang.String r0 = "0.0"
            return r0
    }

    public java.lang.String xt(android.content.Context r3, java.util.Map<java.lang.String, java.lang.Object> r4) {
            r2 = this;
            java.util.function.Function<android.util.SparseArray<java.lang.Object>, java.lang.Object> r0 = r2.r
            if (r0 == 0) goto L34
            com.bytedance.sdk.openadsdk.i.r r0 = com.bytedance.sdk.openadsdk.i.r.j()
            r1 = 8217(0x2019, float:1.1514E-41)
            com.bytedance.sdk.openadsdk.i.r r0 = r0.j(r1)
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            com.bytedance.sdk.openadsdk.i.r r0 = r0.j(r1)
            r1 = 8009(0x1f49, float:1.1223E-41)
            com.bytedance.sdk.openadsdk.i.r r3 = r0.j(r1, r3)
            r0 = 8075(0x1f8b, float:1.1315E-41)
            com.bytedance.sdk.openadsdk.i.r r3 = r3.j(r0, r4)
            android.util.SparseArray r3 = r3.xt()
            java.util.function.Function<android.util.SparseArray<java.lang.Object>, java.lang.Object> r4 = r2.r
            java.lang.Object r3 = com.bytedance.msdk.core.ae.a.a(r4, r3)
            boolean r4 = r3 instanceof java.lang.String
            if (r4 == 0) goto L31
            java.lang.String r3 = (java.lang.String) r3
            return r3
        L31:
            java.lang.String r3 = ""
            return r3
        L34:
            java.lang.String r3 = super.xt(r3, r4)
            return r3
    }
}
