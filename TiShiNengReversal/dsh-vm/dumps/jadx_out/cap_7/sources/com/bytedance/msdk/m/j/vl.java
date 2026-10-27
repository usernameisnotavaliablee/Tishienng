package com.bytedance.msdk.m.j;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class vl extends com.bytedance.msdk.m.j.r {
    private java.lang.String j;
    private java.lang.String xt;

    public vl() {
            r2 = this;
            r0 = 0
            r2.<init>(r0)
            com.bytedance.msdk.core.oq.j r0 = r2.ae()
            if (r0 == 0) goto L16
            java.lang.String r1 = r0.j()
            r2.j = r1
            java.lang.String r0 = r0.xt()
            r2.xt = r0
        L16:
            return
    }

    public vl(com.bytedance.msdk.api.r.qv r2) {
            r1 = this;
            r1.<init>(r2)
            if (r2 == 0) goto L11
            java.lang.String r0 = r2.cw()
            r1.j = r0
            java.lang.String r2 = r2.r()
            r1.xt = r2
        L11:
            return
    }

    @Override // com.bytedance.msdk.m.j.cw
    protected java.lang.String cw() {
            r2 = this;
            java.lang.String r0 = r2.j
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L10
            java.lang.String r0 = r2.xt
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L33
        L10:
            com.bytedance.msdk.core.oq.j r0 = r2.ae()
            if (r0 == 0) goto L22
            java.lang.String r1 = r0.j()
            r2.j = r1
            java.lang.String r0 = r0.xt()
            r2.xt = r0
        L22:
            java.lang.String r0 = r2.j
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L36
            java.lang.String r0 = r2.xt
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L33
            goto L36
        L33:
            java.lang.String r0 = ""
            return r0
        L36:
            java.lang.String r0 = "appId为空或appKey为空"
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
            java.lang.String r1 = "app_key"
            java.lang.String r2 = r3.xt
            r0.put(r1, r2)
            return r0
    }

    @Override // com.bytedance.msdk.m.j.cw
    protected java.lang.String xt() {
            r1 = this;
            java.lang.String r0 = "sigmob"
            return r0
    }
}
