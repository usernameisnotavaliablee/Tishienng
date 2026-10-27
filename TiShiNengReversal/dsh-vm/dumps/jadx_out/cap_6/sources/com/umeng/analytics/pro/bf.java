package com.umeng.analytics.pro;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class bf implements com.umeng.analytics.pro.av {
    public bf() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.umeng.analytics.pro.av
    public java.lang.String a(android.content.Context r4) {
            r3 = this;
            r0 = 0
            r1 = 2
            boolean r2 = org.repackage.com.vivo.identifier.IdentifierManager.a(r4)     // Catch: java.lang.Exception -> L17
            if (r2 != 0) goto L12
            java.lang.String r4 = "当前设备不支持获取OAID"
            java.lang.String[] r4 = new java.lang.String[]{r4}     // Catch: java.lang.Exception -> L17
            com.umeng.commonsdk.debug.UMLog.mutlInfo(r1, r4)     // Catch: java.lang.Exception -> L17
            return r0
        L12:
            java.lang.String r4 = org.repackage.com.vivo.identifier.IdentifierManager.b(r4)     // Catch: java.lang.Exception -> L17
            return r4
        L17:
            java.lang.String r4 = "未检测到您集成OAID SDK包"
            java.lang.String[] r4 = new java.lang.String[]{r4}
            com.umeng.commonsdk.debug.UMLog.mutlInfo(r1, r4)
            return r0
    }
}
