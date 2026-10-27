package com.bytedance.msdk.m.xt;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class ae extends com.bytedance.sdk.openadsdk.core.wq.r implements java.util.function.Supplier<android.util.SparseArray<java.lang.Object>> {
    private com.bytedance.sdk.openadsdk.mediation.init.j.xt.j.xt j;

    public ae(com.bytedance.sdk.openadsdk.mediation.init.j.xt.j.xt r1) {
            r0 = this;
            r0.<init>()
            r0.j = r1
            return
    }

    public android.util.SparseArray<java.lang.Object> ae() {
            r1 = this;
            com.bykv.vk.openvk.api.proto.PluginValueSet r0 = r1.cw()
            if (r0 == 0) goto Lb
            android.util.SparseArray r0 = r0.sparseArray()
            return r0
        Lb:
            r0 = 0
            return r0
    }

    @Override // com.bytedance.sdk.openadsdk.core.wq.r
    public <T> T applyFunction(int r1, com.bykv.vk.openvk.api.proto.PluginValueSet r2, java.lang.Class<T> r3) {
            r0 = this;
            r2 = -99999986(0xfffffffffa0a1f0e, float:-1.792917E35)
            if (r1 != r2) goto Le
            com.bykv.vk.openvk.api.proto.PluginValueSet r1 = r0.cw()
            android.util.SparseArray r1 = r1.sparseArray()
            return r1
        Le:
            r1 = 0
            return r1
    }

    public com.bykv.vk.openvk.api.proto.PluginValueSet cw() {
            r3 = this;
            com.bykv.j.j.j.j.e r0 = com.bykv.j.j.j.j.e.a()
            r1 = 8476(0x211c, float:1.1877E-41)
            java.util.List r2 = r3.r()
            r0.f(r1, r2)
            r1 = 8477(0x211d, float:1.1879E-41)
            java.util.List r2 = r3.up()
            r0.f(r1, r2)
            r1 = 8478(0x211e, float:1.188E-41)
            boolean r2 = r3.m()
            r0.h(r1, r2)
            r1 = 8027(0x1f5b, float:1.1248E-41)
            boolean r2 = r3.j()
            r0.h(r1, r2)
            r1 = 8028(0x1f5c, float:1.125E-41)
            boolean r2 = r3.xt()
            r0.h(r1, r2)
            com.bykv.vk.openvk.api.proto.PluginValueSet r0 = r0.k()
            return r0
    }

    @Override // java.util.function.Supplier
    public /* synthetic */ android.util.SparseArray<java.lang.Object> get() {
            r1 = this;
            android.util.SparseArray r0 = r1.ae()
            return r0
    }

    public boolean j() {
            r1 = this;
            com.bytedance.sdk.openadsdk.mediation.init.j.xt.j.xt r0 = r1.j
            if (r0 == 0) goto L9
            boolean r0 = r0.r()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public boolean m() {
            r1 = this;
            com.bytedance.sdk.openadsdk.mediation.init.j.xt.j.xt r0 = r1.j
            if (r0 == 0) goto L9
            boolean r0 = r0.cw()
            return r0
        L9:
            r0 = 1
            return r0
    }

    public java.util.List<java.lang.String> r() {
            r1 = this;
            com.bytedance.sdk.openadsdk.mediation.init.j.xt.j.xt r0 = r1.j
            if (r0 == 0) goto L9
            java.util.List r0 = r0.j()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public java.util.List<java.lang.String> up() {
            r1 = this;
            com.bytedance.sdk.openadsdk.mediation.init.j.xt.j.xt r0 = r1.j
            if (r0 == 0) goto L9
            java.util.List r0 = r0.xt()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public boolean xt() {
            r1 = this;
            com.bytedance.sdk.openadsdk.mediation.init.j.xt.j.xt r0 = r1.j
            if (r0 == 0) goto L9
            boolean r0 = r0.up()
            return r0
        L9:
            r0 = 1
            return r0
    }
}
