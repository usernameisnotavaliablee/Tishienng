package com.bytedance.msdk.core.m;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class j {
    private final java.util.Map<java.lang.String, com.bytedance.msdk.api.r.j.xt.m.j> j;

    public j() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r1.j = r0
            return
    }

    public com.bytedance.msdk.api.r.j.xt.m.j j(java.lang.String r2) {
            r1 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L8
            r2 = 0
            return r2
        L8:
            java.util.Map<java.lang.String, com.bytedance.msdk.api.r.j.xt.m.j> r0 = r1.j
            java.lang.Object r2 = r0.get(r2)
            com.bytedance.msdk.api.r.j.xt.m.j r2 = (com.bytedance.msdk.api.r.j.xt.m.j) r2
            return r2
    }

    public java.lang.String j(android.content.Context r3, java.util.Map<java.lang.String, java.lang.Object> r4, java.lang.String r5) {
            r2 = this;
            com.bytedance.msdk.j.up.r.j(r3)
            com.bytedance.msdk.api.r.j.xt.m.j r0 = r2.j(r5)
            r1 = 0
            if (r0 == 0) goto Lf
            java.lang.String r3 = r0.j(r1, r1)
            return r3
        Lf:
            com.bytedance.msdk.j.j.r r5 = r2.xt(r5)
            if (r5 != 0) goto L16
            return r1
        L16:
            java.lang.String r3 = r5.j(r3, r4)
            return r3
    }

    public java.util.Map<java.lang.String, com.bytedance.msdk.api.r.j.xt.m.j> j() {
            r1 = this;
            java.util.Map<java.lang.String, com.bytedance.msdk.api.r.j.xt.m.j> r0 = r1.j
            return r0
    }

    public void j(java.lang.String r2, com.bytedance.msdk.api.r.j.xt.m.j r3) {
            r1 = this;
            java.util.Map<java.lang.String, com.bytedance.msdk.api.r.j.xt.m.j> r0 = r1.j
            r0.put(r2, r3)
            return
    }

    public com.bytedance.msdk.j.j.r xt(java.lang.String r2) {
            r1 = this;
            com.bytedance.msdk.m.xt.xt r0 = com.bytedance.msdk.m.xt.xt.j()
            com.bytedance.msdk.j.j.r r2 = r0.j(r2)
            return r2
    }

    public java.util.Map<java.lang.String, java.lang.Object> xt(android.content.Context r4, java.util.Map<java.lang.String, java.lang.Object> r5, java.lang.String r6) {
            r3 = this;
            com.bytedance.msdk.j.up.r.j(r4)
            com.bytedance.msdk.api.r.j.xt.m.j r0 = r3.j(r6)
            if (r0 == 0) goto L21
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            java.lang.String r1 = "buyerId"
            java.lang.String r2 = r0.j(r4, r5)
            r6.put(r1, r2)
            java.lang.String r1 = "sdkInfo"
            java.lang.String r4 = r0.xt(r4, r5)
            r6.put(r1, r4)
            return r6
        L21:
            com.bytedance.msdk.j.j.r r6 = r3.xt(r6)
            if (r6 != 0) goto L29
            r4 = 0
            return r4
        L29:
            java.util.Map r4 = r6.xt(r4, r5)
            return r4
    }
}
