package com.umeng.analytics.pro;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class bd implements com.umeng.analytics.pro.av {
    private boolean a;

    public bd() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.a = r0
            return
    }

    @Override // com.umeng.analytics.pro.av
    public java.lang.String a(android.content.Context r4) {
            r3 = this;
            r0 = 0
            r1 = 2
            boolean r2 = r3.a     // Catch: java.lang.Exception -> L21
            if (r2 != 0) goto Lc
            org.repackage.com.heytap.openid.sdk.OpenIDSDK.a(r4)     // Catch: java.lang.Exception -> L21
            r2 = 1
            r3.a = r2     // Catch: java.lang.Exception -> L21
        Lc:
            boolean r2 = org.repackage.com.heytap.openid.sdk.OpenIDSDK.a()     // Catch: java.lang.Exception -> L21
            if (r2 != 0) goto L1c
            java.lang.String r4 = "当前设备不支持获取OAID"
            java.lang.String[] r4 = new java.lang.String[]{r4}     // Catch: java.lang.Exception -> L21
            com.umeng.commonsdk.debug.UMLog.mutlInfo(r1, r4)     // Catch: java.lang.Exception -> L21
            return r0
        L1c:
            java.lang.String r4 = org.repackage.com.heytap.openid.sdk.OpenIDSDK.c(r4)     // Catch: java.lang.Exception -> L21
            return r4
        L21:
            java.lang.String r4 = "未检测到您集成OAID SDK包"
            java.lang.String[] r4 = new java.lang.String[]{r4}
            com.umeng.commonsdk.debug.UMLog.mutlInfo(r1, r4)
            return r0
    }
}
