package com.umeng.analytics.pro;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class af implements com.umeng.analytics.pro.aa {
    private int a;

    public af(int r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // com.umeng.analytics.pro.aa
    public boolean a() {
            r5 = this;
            r0 = 0
            android.content.Context r2 = com.umeng.commonsdk.service.UMGlobalContext.getAppContext()     // Catch: java.lang.Throwable -> L1b
            android.content.SharedPreferences r2 = com.umeng.analytics.pro.ar.a(r2)     // Catch: java.lang.Throwable -> L1b
            if (r2 == 0) goto L1b
            java.lang.String r3 = "cl_count"
            long r0 = r2.getLong(r3, r0)     // Catch: java.lang.Throwable -> L1b
            int r2 = r5.a     // Catch: java.lang.Throwable -> L1b
            long r2 = (long) r2
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L1b
            r0 = 1
            return r0
        L1b:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "launch times skipped. times: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = " ; config: "
            r2.append(r0)
            int r0 = r5.a
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.String r1 = "MobclickRT"
            com.umeng.commonsdk.debug.UMRTLog.i(r1, r0)
            r0 = 0
            return r0
    }

    @Override // com.umeng.analytics.pro.aa
    public boolean b() {
            r1 = this;
            boolean r0 = r1.a()
            r0 = r0 ^ 1
            return r0
    }

    @Override // com.umeng.analytics.pro.aa
    public long c() {
            r2 = this;
            r0 = 0
            return r0
    }
}
