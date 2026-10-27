package com.bytedance.msdk.cw.j;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class g extends com.bytedance.msdk.cw.j.r {
    private com.bytedance.msdk.j.xt.m qv;

    public g(com.bytedance.msdk.cw.m.xt.j r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    private com.bytedance.msdk.j.xt.up os() {
            r1 = this;
            com.bytedance.msdk.j.xt.m r0 = r1.ae
            com.bytedance.msdk.j.xt.up r0 = (com.bytedance.msdk.j.xt.up) r0
            return r0
    }

    @Override // com.bytedance.msdk.cw.j.r
    public <T> T j(int r4, com.bykv.vk.openvk.api.proto.PluginValueSet r5, java.lang.Class<T> r6) {
            r3 = this;
            r6 = 8143(0x1fcf, float:1.1411E-41)
            if (r4 != r6) goto Ld
            double r4 = r3.t()
            java.lang.Double r4 = java.lang.Double.valueOf(r4)
            return r4
        Ld:
            r6 = 1009(0x3f1, float:1.414E-42)
            r0 = 20040(0x4e48, float:2.8082E-41)
            r1 = 0
            if (r4 != r6) goto L38
            if (r5 == 0) goto L1a
            boolean r1 = r5.booleanValue(r0, r1)
        L1a:
            if (r1 == 0) goto L29
            com.bytedance.msdk.j.xt.m r4 = r3.qv
            boolean r5 = r4 instanceof com.bytedance.msdk.api.r.j.g.xt
            if (r5 == 0) goto L127
            com.bytedance.msdk.api.r.j.g.xt r4 = (com.bytedance.msdk.api.r.j.g.xt) r4
            r4.r()
            goto L127
        L29:
            com.bytedance.msdk.j.xt.up r4 = r3.os()
            if (r4 == 0) goto L127
            com.bytedance.msdk.j.xt.up r4 = r3.os()
            r4.r()
            goto L127
        L38:
            r6 = 1017(0x3f9, float:1.425E-42)
            if (r4 != r6) goto L61
            com.bytedance.msdk.j.xt.up r4 = r3.os()
            if (r4 == 0) goto L127
            if (r5 == 0) goto L51
            r4 = 8014(0x1f4e, float:1.123E-41)
            int r1 = r5.intValue(r4, r1)
            r4 = 8015(0x1f4f, float:1.1231E-41)
            java.lang.String r4 = r5.stringValue(r4)
            goto L53
        L51:
            java.lang.String r4 = ""
        L53:
            com.bytedance.msdk.j.xt.up r5 = r3.os()
            com.bytedance.msdk.api.j r6 = new com.bytedance.msdk.api.j
            r6.<init>(r1, r4)
            r5.j(r6)
            goto L127
        L61:
            r6 = 1011(0x3f3, float:1.417E-42)
            r2 = 8552(0x2168, float:1.1984E-41)
            if (r4 != r6) goto L91
            if (r5 == 0) goto L6d
            boolean r1 = r5.booleanValue(r0, r1)
        L6d:
            if (r5 == 0) goto L72
            r5.intValue(r2)
        L72:
            r4 = 2
            if (r1 == 0) goto L82
            com.bytedance.msdk.j.xt.m r5 = r3.qv
            boolean r6 = r5 instanceof com.bytedance.msdk.api.r.j.g.xt
            if (r6 == 0) goto L127
            com.bytedance.msdk.api.r.j.g.xt r5 = (com.bytedance.msdk.api.r.j.g.xt) r5
            r5.xt(r4)
            goto L127
        L82:
            com.bytedance.msdk.j.xt.up r5 = r3.os()
            if (r5 == 0) goto L127
            com.bytedance.msdk.j.xt.up r5 = r3.os()
            r5.xt(r4)
            goto L127
        L91:
            r6 = 1008(0x3f0, float:1.413E-42)
            if (r4 != r6) goto Lb9
            if (r5 == 0) goto L9b
            boolean r1 = r5.booleanValue(r0, r1)
        L9b:
            if (r1 == 0) goto Laa
            com.bytedance.msdk.j.xt.m r4 = r3.qv
            boolean r5 = r4 instanceof com.bytedance.msdk.api.r.j.g.xt
            if (r5 == 0) goto L127
            com.bytedance.msdk.api.r.j.g.xt r4 = (com.bytedance.msdk.api.r.j.g.xt) r4
            r4.up()
            goto L127
        Laa:
            com.bytedance.msdk.j.xt.up r4 = r3.os()
            if (r4 == 0) goto L127
            com.bytedance.msdk.j.xt.up r4 = r3.os()
            r4.up()
            goto L127
        Lb9:
            r6 = 1019(0x3fb, float:1.428E-42)
            if (r4 != r6) goto Le5
            if (r5 == 0) goto Lc3
            boolean r1 = r5.booleanValue(r0, r1)
        Lc3:
            if (r5 == 0) goto Lc8
            r5.intValue(r2)
        Lc8:
            r4 = 1
            if (r1 == 0) goto Ld7
            com.bytedance.msdk.j.xt.m r5 = r3.qv
            boolean r6 = r5 instanceof com.bytedance.msdk.api.r.j.g.xt
            if (r6 == 0) goto L127
            com.bytedance.msdk.api.r.j.g.xt r5 = (com.bytedance.msdk.api.r.j.g.xt) r5
            r5.j(r4)
            goto L127
        Ld7:
            com.bytedance.msdk.j.xt.up r5 = r3.os()
            if (r5 == 0) goto L127
            com.bytedance.msdk.j.xt.up r5 = r3.os()
            r5.j(r4)
            goto L127
        Le5:
            r6 = 1074(0x432, float:1.505E-42)
            if (r4 != r6) goto Lf8
            com.bytedance.msdk.j.xt.up r4 = r3.os()
            if (r4 == 0) goto L127
            com.bytedance.msdk.j.xt.up r4 = r3.os()
            android.app.Activity r4 = r4.getActivity()
            return r4
        Lf8:
            r6 = 1051(0x41b, float:1.473E-42)
            if (r4 != r6) goto L100
            r3.os()
            goto L127
        L100:
            r6 = 1052(0x41c, float:1.474E-42)
            if (r4 != r6) goto L108
            r3.os()
            goto L127
        L108:
            r6 = 6156(0x180c, float:8.626E-42)
            if (r4 != r6) goto L11a
            com.bytedance.msdk.j.xt.up r4 = r3.os()
            if (r4 == 0) goto L127
            com.bytedance.msdk.j.xt.up r4 = r3.os()
            r4.cw()
            goto L127
        L11a:
            r6 = 8111(0x1faf, float:1.1366E-41)
            if (r4 != r6) goto L127
            r4 = 8016(0x1f50, float:1.1233E-41)
            double r4 = r5.doubleValue(r4)
            r3.j(r4)
        L127:
            r4 = 0
            return r4
    }

    @Override // com.bytedance.msdk.xt.cw
    public void j(android.view.ViewGroup r3) {
            r2 = this;
            super.j(r3)
            java.util.function.Function<android.util.SparseArray<java.lang.Object>, java.lang.Object> r0 = r2.g
            if (r0 == 0) goto L26
            com.bytedance.sdk.openadsdk.i.r r0 = com.bytedance.sdk.openadsdk.i.r.j()
            r1 = 6152(0x1808, float:8.621E-42)
            com.bytedance.sdk.openadsdk.i.r r0 = r0.j(r1)
            java.lang.Class<java.lang.Void> r1 = java.lang.Void.class
            com.bytedance.sdk.openadsdk.i.r r0 = r0.j(r1)
            r1 = 20060(0x4e5c, float:2.811E-41)
            com.bytedance.sdk.openadsdk.i.r r3 = r0.j(r1, r3)
            android.util.SparseArray r3 = r3.xt()
            java.util.function.Function<android.util.SparseArray<java.lang.Object>, java.lang.Object> r0 = r2.g
            com.bytedance.msdk.core.ae.a.a(r0, r3)
        L26:
            return
    }

    @Override // com.bytedance.msdk.xt.cw
    public void j(android.view.ViewGroup r3, android.app.Activity r4) {
            r2 = this;
            super.j(r3, r4)
            java.util.function.Function<android.util.SparseArray<java.lang.Object>, java.lang.Object> r0 = r2.g
            if (r0 == 0) goto L2c
            com.bytedance.sdk.openadsdk.i.r r0 = com.bytedance.sdk.openadsdk.i.r.j()
            r1 = 6154(0x180a, float:8.624E-42)
            com.bytedance.sdk.openadsdk.i.r r0 = r0.j(r1)
            java.lang.Class<java.lang.Void> r1 = java.lang.Void.class
            com.bytedance.sdk.openadsdk.i.r r0 = r0.j(r1)
            r1 = 20060(0x4e5c, float:2.811E-41)
            com.bytedance.sdk.openadsdk.i.r r3 = r0.j(r1, r3)
            r0 = 20033(0x4e41, float:2.8072E-41)
            com.bytedance.sdk.openadsdk.i.r r3 = r3.j(r0, r4)
            android.util.SparseArray r3 = r3.xt()
            java.util.function.Function<android.util.SparseArray<java.lang.Object>, java.lang.Object> r4 = r2.g
            com.bytedance.msdk.core.ae.a.a(r4, r3)
        L2c:
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
