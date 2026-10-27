package com.bytedance.msdk.api.r.j.xt.cw;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class cw {
    private final int cw;
    private final java.lang.String j;

    /* renamed from: r, reason: collision with root package name */
    private final int f2165r;
    private final java.lang.String up;
    private final java.lang.String xt;

    public cw(java.lang.String r1, java.lang.String r2, int r3, int r4, java.lang.String r5) {
            r0 = this;
            r0.<init>()
            r0.j = r1
            r0.xt = r2
            r0.cw = r3
            r0.f2165r = r4
            r0.up = r5
            return
    }

    public android.util.SparseArray<java.lang.Object> j() {
            r4 = this;
            com.bytedance.sdk.openadsdk.i.r r0 = com.bytedance.sdk.openadsdk.i.r.j()
            r1 = 8003(0x1f43, float:1.1215E-41)
            java.lang.String r2 = r4.j
            r0.j(r1, r2)
            r1 = 2
            java.lang.String r2 = r4.xt
            r0.j(r1, r2)
            int r1 = r4.cw
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 8008(0x1f48, float:1.1222E-41)
            r0.j(r2, r1)
            int r1 = r4.f2165r
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 8094(0x1f9e, float:1.1342E-41)
            r0.j(r2, r1)
            r1 = 8547(0x2163, float:1.1977E-41)
            java.lang.String r2 = r4.up
            r0.j(r1, r2)
            com.bytedance.msdk.core.j r1 = com.bytedance.msdk.core.j.qv()
            java.lang.Object r1 = r1.z()
            if (r1 == 0) goto L4f
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            com.bytedance.msdk.core.j r2 = com.bytedance.msdk.core.j.qv()
            java.lang.Object r2 = r2.z()
            java.lang.String r3 = "live_ad_custom_config"
            r1.put(r3, r2)
            r2 = 8075(0x1f8b, float:1.1315E-41)
            r0.j(r2, r1)
        L4f:
            android.util.SparseArray r0 = r0.xt()
            return r0
    }

    public int xt() {
            r1 = this;
            int r0 = r1.cw
            return r0
    }
}
