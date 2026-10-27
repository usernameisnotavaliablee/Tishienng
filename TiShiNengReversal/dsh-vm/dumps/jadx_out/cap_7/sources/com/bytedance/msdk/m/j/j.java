package com.bytedance.msdk.m.j;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class j extends com.bytedance.msdk.m.j.cw {
    private java.lang.String j;

    public j() {
            r1 = this;
            r1.<init>()
            com.bytedance.msdk.core.oq.j r0 = r1.ae()
            if (r0 == 0) goto Lf
            java.lang.String r0 = r0.j()
            r1.j = r0
        Lf:
            return
    }

    @Override // com.bytedance.msdk.m.j.cw
    protected java.lang.String cw() {
            r1 = this;
            java.lang.String r0 = r1.j
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L1f
            com.bytedance.msdk.core.oq.j r0 = r1.ae()
            if (r0 == 0) goto L14
            java.lang.String r0 = r0.j()
            r1.j = r0
        L14:
            java.lang.String r0 = r1.j
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L1f
            java.lang.String r0 = "appId为空"
            return r0
        L1f:
            java.lang.String r0 = ""
            return r0
    }

    @Override // com.bytedance.msdk.m.j.cw
    protected java.util.Map<java.lang.String, java.lang.Object> j() {
            r3 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.String r1 = "app_id"
            java.lang.String r2 = r3.j
            r0.put(r1, r2)
            return r0
    }

    @Override // com.bytedance.msdk.m.j.cw
    protected java.lang.String xt() {
            r1 = this;
            java.lang.String r0 = "admob"
            return r0
    }
}
