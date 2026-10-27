package com.bytedance.msdk.cw.cw.xt.j.xt;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public abstract class xt extends com.bytedance.msdk.cw.cw.xt.j.xt {
    public xt(com.bytedance.msdk.cw.j.xt r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public com.bytedance.sdk.openadsdk.core.gq j(android.content.Context r3) {
            r2 = this;
            com.bytedance.sdk.openadsdk.core.gq r3 = com.bytedance.sdk.gromore.init.DispatchAdSdkInitializerHolder.getCsjLoader(r3)
            if (r3 != 0) goto L10
            com.bytedance.msdk.api.j r0 = new com.bytedance.msdk.api.j
            java.lang.String r1 = "ClassCastException：load ad fail loader is null"
            r0.<init>(r1)
            r2.j(r0)
        L10:
            return r3
    }

    public java.lang.String j(java.lang.String r1) {
            r0 = this;
            java.lang.String r1 = com.bytedance.sdk.gromore.init.j.cw()     // Catch: java.lang.Exception -> L5
            return r1
        L5:
            java.lang.String r1 = "0.0"
            return r1
    }
}
