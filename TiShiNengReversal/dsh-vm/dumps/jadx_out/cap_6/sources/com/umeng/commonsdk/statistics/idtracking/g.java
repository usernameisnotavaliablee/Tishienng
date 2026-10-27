package com.umeng.commonsdk.statistics.idtracking;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class g extends com.umeng.commonsdk.statistics.idtracking.a {
    private static final java.lang.String a = "mac";
    private android.content.Context b;

    public g(android.content.Context r2) {
            r1 = this;
            java.lang.String r0 = "mac"
            r1.<init>(r0)
            r1.b = r2
            return
    }

    @Override // com.umeng.commonsdk.statistics.idtracking.a
    public java.lang.String f() {
            r2 = this;
            android.content.Context r0 = r2.b     // Catch: java.lang.Exception -> L7
            java.lang.String r0 = com.umeng.commonsdk.statistics.common.DeviceConfig.getMac(r0)     // Catch: java.lang.Exception -> L7
            return r0
        L7:
            r0 = move-exception
            boolean r1 = com.umeng.commonsdk.statistics.AnalyticsConstants.UM_DEBUG
            android.content.Context r1 = r2.b
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r1, r0)
            r0 = 0
            return r0
    }
}
