package com.bytedance.msdk.m.xt;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class cw {
    private final com.bykv.vk.openvk.api.proto.PluginValueSet j;

    private cw(com.bykv.vk.openvk.api.proto.PluginValueSet r1) {
            r0 = this;
            r0.<init>()
            r0.j = r1
            return
    }

    public static com.bytedance.msdk.m.xt.cw j(com.bykv.vk.openvk.api.proto.PluginValueSet r1) {
            com.bytedance.msdk.m.xt.cw r0 = new com.bytedance.msdk.m.xt.cw
            r0.<init>(r1)
            return r0
    }

    private boolean xt() {
            r1 = this;
            com.bykv.vk.openvk.api.proto.PluginValueSet r0 = r1.j
            if (r0 == 0) goto Lc
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    public java.util.function.Function<android.util.SparseArray<java.lang.Object>, java.lang.Object> j() {
            r3 = this;
            boolean r0 = r3.xt()
            if (r0 == 0) goto L17
            com.bykv.vk.openvk.api.proto.PluginValueSet r0 = r3.j
            r1 = 8301(0x206d, float:1.1632E-41)
            java.lang.Class r2 = z0.a.a()
            java.lang.Object r0 = r0.objectValue(r1, r2)
            java.util.function.Function r0 = z0.b.a(r0)
            return r0
        L17:
            r0 = 0
            return r0
    }
}
