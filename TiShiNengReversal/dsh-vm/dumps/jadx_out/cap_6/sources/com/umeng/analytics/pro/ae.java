package com.umeng.analytics.pro;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class ae implements com.umeng.analytics.pro.aa {
    private java.lang.String a;
    private long b;

    public ae(java.lang.String r1, long r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    @Override // com.umeng.analytics.pro.aa
    public boolean a() {
            r7 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L56
            r0.<init>()     // Catch: java.lang.Throwable -> L56
            java.lang.String r1 = "interval_"
            r0.append(r1)     // Catch: java.lang.Throwable -> L56
            java.lang.String r1 = r7.a     // Catch: java.lang.Throwable -> L56
            r0.append(r1)     // Catch: java.lang.Throwable -> L56
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L56
            android.content.Context r1 = com.umeng.commonsdk.service.UMGlobalContext.getAppContext()     // Catch: java.lang.Throwable -> L56
            android.content.SharedPreferences r1 = com.umeng.analytics.pro.ar.a(r1)     // Catch: java.lang.Throwable -> L56
            if (r1 == 0) goto L56
            r2 = 0
            long r0 = r1.getLong(r0, r2)     // Catch: java.lang.Throwable -> L56
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L56
            long r2 = r2 - r0
            long r0 = r7.b     // Catch: java.lang.Throwable -> L56
            r4 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r4
            int r6 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r6 <= 0) goto L34
            r0 = 1
            return r0
        L34:
            java.lang.String r0 = "MobclickRT"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L56
            r1.<init>()     // Catch: java.lang.Throwable -> L56
            java.lang.String r6 = "internal period skipped. elapse: "
            r1.append(r6)     // Catch: java.lang.Throwable -> L56
            r1.append(r2)     // Catch: java.lang.Throwable -> L56
            java.lang.String r2 = "; config: "
            r1.append(r2)     // Catch: java.lang.Throwable -> L56
            long r2 = r7.b     // Catch: java.lang.Throwable -> L56
            long r2 = r2 * r4
            r1.append(r2)     // Catch: java.lang.Throwable -> L56
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L56
            com.umeng.commonsdk.debug.UMRTLog.i(r0, r1)     // Catch: java.lang.Throwable -> L56
        L56:
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
