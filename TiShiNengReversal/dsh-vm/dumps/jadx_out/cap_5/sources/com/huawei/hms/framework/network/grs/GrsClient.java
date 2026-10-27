package com.huawei.hms.framework.network.grs;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class GrsClient {
    private static final java.lang.String EMPTY_STRING = "";
    private final com.huawei.hms.framework.network.grs.c grsClientGlobal;
    private int queryTimeout;

    public GrsClient(android.content.Context r1, com.huawei.hms.framework.network.grs.GrsBaseInfo r2) {
            r0 = this;
            r0.<init>()
            if (r1 == 0) goto L14
            if (r2 == 0) goto L14
            com.huawei.hms.framework.network.grs.c r1 = com.huawei.hms.framework.network.grs.d.a(r2, r1)
            r0.grsClientGlobal = r1
            int r1 = r2.getQueryTimeout()
            r0.queryTimeout = r1
            return
        L14:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "invalid init params for context is null or GrsBaseInfo instance is null Object."
            r1.<init>(r2)
            throw r1
    }

    public void ayncGetGrsUrl(java.lang.String r3, java.lang.String r4, com.huawei.hms.framework.network.grs.IQueryUrlCallBack r5) {
            r2 = this;
            com.huawei.hms.framework.network.grs.c r0 = r2.grsClientGlobal
            if (r0 != 0) goto L9
            r3 = -8
            r5.onCallBackFail(r3)
            return
        L9:
            int r1 = r2.queryTimeout
            r0.m(r3, r4, r5, r1)
            return
    }

    public void ayncGetGrsUrls(java.lang.String r3, com.huawei.hms.framework.network.grs.IQueryUrlsCallBack r4) {
            r2 = this;
            com.huawei.hms.framework.network.grs.c r0 = r2.grsClientGlobal
            if (r0 != 0) goto L9
            r3 = -8
            r4.onCallBackFail(r3)
            return
        L9:
            int r1 = r2.queryTimeout
            r0.l(r3, r4, r1)
            return
    }

    public void clearSp() {
            r1 = this;
            com.huawei.hms.framework.network.grs.c r0 = r1.grsClientGlobal
            if (r0 != 0) goto L5
            return
        L5:
            r0.i()
            return
    }

    public boolean forceExpire() {
            r1 = this;
            com.huawei.hms.framework.network.grs.c r0 = r1.grsClientGlobal
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            boolean r0 = r0.r()
            return r0
    }

    public java.lang.String synGetGrsUrl(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            com.huawei.hms.framework.network.grs.c r0 = r2.grsClientGlobal
            if (r0 != 0) goto L7
            java.lang.String r3 = ""
            return r3
        L7:
            int r1 = r2.queryTimeout
            java.lang.String r3 = r0.e(r3, r4, r1)
            return r3
    }

    public java.util.Map<java.lang.String, java.lang.String> synGetGrsUrls(java.lang.String r3) {
            r2 = this;
            com.huawei.hms.framework.network.grs.c r0 = r2.grsClientGlobal
            if (r0 != 0) goto La
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            return r3
        La:
            int r1 = r2.queryTimeout
            java.util.Map r3 = r0.f(r3, r1)
            return r3
    }
}
