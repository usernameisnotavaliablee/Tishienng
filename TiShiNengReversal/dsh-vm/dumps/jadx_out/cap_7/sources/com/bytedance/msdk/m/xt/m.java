package com.bytedance.msdk.m.xt;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class m extends com.bytedance.sdk.openadsdk.core.wq.r implements java.util.function.Supplier<android.util.SparseArray<java.lang.Object>> {
    private com.bytedance.sdk.openadsdk.i.cw.cw.cw j;

    public m(com.bytedance.sdk.openadsdk.i.cw.cw.cw r1) {
            r0 = this;
            r0.<init>()
            r0.j = r1
            return
    }

    @Override // com.bytedance.sdk.openadsdk.core.wq.r
    public <T> T applyFunction(int r1, com.bykv.vk.openvk.api.proto.PluginValueSet r2, java.lang.Class<T> r3) {
            r0 = this;
            r2 = -99999986(0xfffffffffa0a1f0e, float:-1.792917E35)
            if (r1 != r2) goto Le
            com.bykv.vk.openvk.api.proto.PluginValueSet r1 = r0.j()
            android.util.SparseArray r1 = r1.sparseArray()
            return r1
        Le:
            r1 = 0
            return r1
    }

    @Override // java.util.function.Supplier
    public /* synthetic */ android.util.SparseArray<java.lang.Object> get() {
            r1 = this;
            android.util.SparseArray r0 = r1.xt()
            return r0
    }

    public com.bykv.vk.openvk.api.proto.PluginValueSet j() {
            r6 = this;
            com.bykv.j.j.j.j.e r0 = com.bykv.j.j.j.j.e.a()
            com.bytedance.sdk.openadsdk.i.cw.cw.cw r1 = r6.j
            r2 = 0
            if (r1 == 0) goto Lf
            double r4 = r1.j()
            goto L10
        Lf:
            r4 = r2
        L10:
            r1 = 8481(0x2121, float:1.1884E-41)
            r0.c(r1, r4)
            com.bytedance.sdk.openadsdk.i.cw.cw.cw r1 = r6.j
            if (r1 == 0) goto L1d
            double r2 = r1.xt()
        L1d:
            r1 = 8482(0x2122, float:1.1886E-41)
            r0.c(r1, r2)
            com.bykv.vk.openvk.api.proto.PluginValueSet r0 = r0.k()
            return r0
    }

    public android.util.SparseArray<java.lang.Object> xt() {
            r1 = this;
            com.bykv.vk.openvk.api.proto.PluginValueSet r0 = r1.j()
            if (r0 == 0) goto Lb
            android.util.SparseArray r0 = r0.sparseArray()
            return r0
        Lb:
            r0 = 0
            return r0
    }
}
