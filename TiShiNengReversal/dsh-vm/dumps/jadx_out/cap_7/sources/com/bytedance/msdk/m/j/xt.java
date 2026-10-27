package com.bytedance.msdk.m.j;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class xt extends com.bytedance.msdk.m.j.r {
    private java.lang.String j;

    public xt() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            com.bytedance.msdk.core.oq.j r0 = r1.ae()
            if (r0 == 0) goto L10
            java.lang.String r0 = r0.j()
            r1.j = r0
        L10:
            return
    }

    public xt(com.bytedance.msdk.api.r.qv r1) {
            r0 = this;
            r0.<init>(r1)
            if (r1 == 0) goto Lb
            java.lang.String r1 = r1.cw()
            r0.j = r1
        Lb:
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
            com.bytedance.msdk.core.j r1 = com.bytedance.msdk.core.j.qv()
            boolean r1 = r1.wq()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            java.lang.String r2 = "baidu_https"
            r0.put(r2, r1)
            com.bytedance.msdk.core.j r1 = com.bytedance.msdk.core.j.qv()
            java.lang.String r1 = r1.m()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L38
            com.bytedance.msdk.core.j r1 = com.bytedance.msdk.core.j.qv()
            java.lang.String r1 = r1.m()
            java.lang.String r2 = "baidu_wx_app_id"
            r0.put(r2, r1)
        L38:
            return r0
    }

    @Override // com.bytedance.msdk.m.j.cw
    protected java.lang.String xt() {
            r1 = this;
            java.lang.String r0 = "baidu"
            return r0
    }
}
