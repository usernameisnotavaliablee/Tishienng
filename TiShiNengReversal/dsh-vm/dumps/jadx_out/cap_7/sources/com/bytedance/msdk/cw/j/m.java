package com.bytedance.msdk.cw.j;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class m extends com.bytedance.msdk.cw.j.r {
    public m(com.bytedance.msdk.cw.m.xt.j r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    private com.bytedance.msdk.api.r.j.up.j os() {
            r1 = this;
            com.bytedance.msdk.j.xt.m r0 = r1.ae
            com.bytedance.msdk.api.r.j.up.j r0 = (com.bytedance.msdk.api.r.j.up.j) r0
            return r0
    }

    @Override // com.bytedance.msdk.cw.j.r
    public <T> T j(int r2, com.bykv.vk.openvk.api.proto.PluginValueSet r3, java.lang.Class<T> r4) {
            r1 = this;
            r4 = 8143(0x1fcf, float:1.1411E-41)
            if (r2 != r4) goto Ld
            double r2 = r1.t()
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            return r2
        Ld:
            r4 = 8111(0x1faf, float:1.1366E-41)
            if (r2 != r4) goto L2a
            if (r3 == 0) goto Lbe
            boolean r2 = r1.m3if()
            if (r2 != 0) goto L1f
            boolean r2 = r1.yl()
            if (r2 == 0) goto Lbe
        L1f:
            r2 = 8016(0x1f50, float:1.1233E-41)
            double r2 = r3.doubleValue(r2)
            r1.j(r2)
            goto Lbe
        L2a:
            r4 = 8129(0x1fc1, float:1.1391E-41)
            r0 = 0
            if (r2 != r4) goto L3c
            if (r3 == 0) goto Lbe
            r2 = 8033(0x1f61, float:1.1257E-41)
            boolean r2 = r3.booleanValue(r2, r0)
            r1.ae(r2)
            goto Lbe
        L3c:
            r4 = 1008(0x3f0, float:1.413E-42)
            if (r2 != r4) goto L4f
            com.bytedance.msdk.api.r.j.up.j r2 = r1.os()
            if (r2 == 0) goto Lbe
            com.bytedance.msdk.api.r.j.up.j r2 = r1.os()
            r2.j()
            goto Lbe
        L4f:
            r4 = 1017(0x3f9, float:1.425E-42)
            if (r2 != r4) goto L77
            com.bytedance.msdk.api.r.j.up.j r2 = r1.os()
            if (r2 == 0) goto Lbe
            if (r3 == 0) goto L68
            r2 = 8014(0x1f4e, float:1.123E-41)
            int r0 = r3.intValue(r2, r0)
            r2 = 8015(0x1f4f, float:1.1231E-41)
            java.lang.String r2 = r3.stringValue(r2)
            goto L6a
        L68:
            java.lang.String r2 = ""
        L6a:
            com.bytedance.msdk.api.r.j.up.j r3 = r1.os()
            com.bytedance.msdk.api.j r4 = new com.bytedance.msdk.api.j
            r4.<init>(r0, r2)
            r3.j(r4)
            goto Lbe
        L77:
            r3 = 1009(0x3f1, float:1.414E-42)
            if (r2 != r3) goto L89
            com.bytedance.msdk.api.r.j.up.j r2 = r1.os()
            if (r2 == 0) goto Lbe
            com.bytedance.msdk.api.r.j.up.j r2 = r1.os()
            r2.xt()
            goto Lbe
        L89:
            r3 = 1014(0x3f6, float:1.421E-42)
            if (r2 != r3) goto L9b
            com.bytedance.msdk.api.r.j.up.j r2 = r1.os()
            if (r2 == 0) goto Lbe
            com.bytedance.msdk.api.r.j.up.j r2 = r1.os()
            r2.cw()
            goto Lbe
        L9b:
            r3 = 1015(0x3f7, float:1.422E-42)
            if (r2 != r3) goto Lad
            com.bytedance.msdk.api.r.j.up.j r2 = r1.os()
            if (r2 == 0) goto Lbe
            com.bytedance.msdk.api.r.j.up.j r2 = r1.os()
            r2.r()
            goto Lbe
        Lad:
            r3 = 1016(0x3f8, float:1.424E-42)
            if (r2 != r3) goto Lbe
            com.bytedance.msdk.api.r.j.up.j r2 = r1.os()
            if (r2 == 0) goto Lbe
            com.bytedance.msdk.api.r.j.up.j r2 = r1.os()
            r2.up()
        Lbe:
            r2 = 0
            return r2
    }

    @Override // com.bytedance.msdk.xt.cw
    public void j(android.app.Activity r1, java.lang.Object r2, java.lang.String r3) {
            r0 = this;
            super.j(r1, r2, r3)
            java.util.function.Function<android.util.SparseArray<java.lang.Object>, java.lang.Object> r2 = r0.g
            if (r2 == 0) goto L26
            com.bytedance.sdk.openadsdk.i.r r2 = com.bytedance.sdk.openadsdk.i.r.j()
            r3 = 8113(0x1fb1, float:1.1369E-41)
            com.bytedance.sdk.openadsdk.i.r r2 = r2.j(r3)
            java.lang.Class<java.lang.Void> r3 = java.lang.Void.class
            com.bytedance.sdk.openadsdk.i.r r2 = r2.j(r3)
            r3 = 20033(0x4e41, float:2.8072E-41)
            com.bytedance.sdk.openadsdk.i.r r1 = r2.j(r3, r1)
            android.util.SparseArray r1 = r1.xt()
            java.util.function.Function<android.util.SparseArray<java.lang.Object>, java.lang.Object> r2 = r0.g
            com.bytedance.msdk.core.ae.a.a(r2, r1)
        L26:
            return
    }

    @Override // com.bytedance.msdk.xt.cw
    public java.lang.Integer m() {
            r2 = this;
            java.lang.String r0 = r2.zz()
            java.util.function.Function<android.util.SparseArray<java.lang.Object>, java.lang.Object> r1 = r2.g
            java.lang.Integer r0 = com.bytedance.msdk.core.j.j.up.j(r0, r1)
            return r0
    }

    @Override // com.bytedance.msdk.xt.cw
    public java.lang.String o() {
            r2 = this;
            java.util.function.Function<android.util.SparseArray<java.lang.Object>, java.lang.Object> r0 = r2.g
            if (r0 == 0) goto L29
            com.bytedance.sdk.openadsdk.i.r r0 = com.bytedance.sdk.openadsdk.i.r.j()
            r1 = 8147(0x1fd3, float:1.1416E-41)
            com.bytedance.sdk.openadsdk.i.r r0 = r0.j(r1)
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            com.bytedance.sdk.openadsdk.i.r r0 = r0.j(r1)
            android.util.SparseArray r0 = r0.xt()
            java.util.function.Function<android.util.SparseArray<java.lang.Object>, java.lang.Object> r1 = r2.g
            java.lang.Object r0 = com.bytedance.msdk.core.ae.a.a(r1, r0)
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L27
            java.lang.String r0 = r0.toString()
            return r0
        L27:
            r0 = 0
            return r0
        L29:
            java.lang.String r0 = super.o()
            return r0
    }
}
