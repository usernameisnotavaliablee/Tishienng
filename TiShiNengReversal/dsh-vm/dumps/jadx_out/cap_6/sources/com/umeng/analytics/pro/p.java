package com.umeng.analytics.pro;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class p implements java.lang.Thread.UncaughtExceptionHandler {
    private java.lang.Thread.UncaughtExceptionHandler a;
    private com.umeng.analytics.pro.t b;

    public p() {
            r1 = this;
            r1.<init>()
            java.lang.Thread$UncaughtExceptionHandler r0 = java.lang.Thread.getDefaultUncaughtExceptionHandler()
            if (r0 != r1) goto La
            return
        La:
            java.lang.Thread$UncaughtExceptionHandler r0 = java.lang.Thread.getDefaultUncaughtExceptionHandler()
            r1.a = r0
            java.lang.Thread.setDefaultUncaughtExceptionHandler(r1)
            return
    }

    private void a(java.lang.Throwable r2) {
            r1 = this;
            boolean r0 = com.umeng.analytics.AnalyticsConfig.CATCH_EXCEPTION
            if (r0 == 0) goto La
            com.umeng.analytics.pro.t r0 = r1.b
            r0.a(r2)
            return
        La:
            com.umeng.analytics.pro.t r2 = r1.b
            r0 = 0
            r2.a(r0)
            return
    }

    public void a(com.umeng.analytics.pro.t r1) {
            r0 = this;
            r0.b = r1
            return
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(java.lang.Thread r3, java.lang.Throwable r4) {
            r2 = this;
            r2.a(r4)
            java.lang.Thread$UncaughtExceptionHandler r0 = r2.a
            if (r0 == 0) goto L12
            java.lang.Thread$UncaughtExceptionHandler r1 = java.lang.Thread.getDefaultUncaughtExceptionHandler()
            if (r0 == r1) goto L12
            java.lang.Thread$UncaughtExceptionHandler r0 = r2.a
            r0.uncaughtException(r3, r4)
        L12:
            return
    }
}
