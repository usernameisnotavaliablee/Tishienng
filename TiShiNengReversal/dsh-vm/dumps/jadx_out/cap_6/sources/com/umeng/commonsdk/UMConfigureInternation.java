package com.umeng.commonsdk;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class UMConfigureInternation {
    private static boolean isInternal;


    static {
            return
    }

    public UMConfigureInternation() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void doSelfCheck(android.content.Context r3) {
            java.lang.String r0 = com.umeng.commonsdk.framework.UMFrUtils.getCurrentProcessName(r3)     // Catch: java.lang.Throwable -> L29
            java.lang.String r1 = r3.getPackageName()     // Catch: java.lang.Throwable -> L29
            boolean r2 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L29
            if (r2 != 0) goto L29
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L29
            if (r2 != 0) goto L29
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> L29
            if (r0 == 0) goto L29
            com.umeng.commonsdk.internal.b r0 = com.umeng.commonsdk.internal.b.a(r3)     // Catch: java.lang.Throwable -> L29
            com.umeng.commonsdk.internal.c r0 = r0.a()     // Catch: java.lang.Throwable -> L29
            r1 = 0
            r2 = 32801(0x8021, float:4.5964E-41)
            com.umeng.commonsdk.framework.UMWorkDispatch.sendEvent(r3, r2, r0, r1)     // Catch: java.lang.Throwable -> L29
        L29:
            return
    }

    public static synchronized void sendInternal(android.content.Context r5) {
            java.lang.Class<com.umeng.commonsdk.UMConfigureInternation> r0 = com.umeng.commonsdk.UMConfigureInternation.class
            monitor-enter(r0)
            if (r5 == 0) goto L3e
            r1 = 1
            boolean r2 = com.umeng.commonsdk.UMConfigureInternation.isInternal     // Catch: java.lang.Throwable -> L1a
            if (r2 != 0) goto L3e
            java.lang.Thread r2 = new java.lang.Thread     // Catch: java.lang.Throwable -> L1a
            com.umeng.commonsdk.UMConfigureInternation$1 r3 = new com.umeng.commonsdk.UMConfigureInternation$1     // Catch: java.lang.Throwable -> L1a
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L1a
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L1a
            r2.start()     // Catch: java.lang.Throwable -> L1a
            com.umeng.commonsdk.UMConfigureInternation.isInternal = r1     // Catch: java.lang.Throwable -> L1a
            goto L3e
        L1a:
            r5 = move-exception
            java.lang.String r2 = "internal"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3b
            r3.<init>()     // Catch: java.lang.Throwable -> L3b
            java.lang.String r4 = "e is "
            r3.append(r4)     // Catch: java.lang.Throwable -> L3b
            java.lang.String r5 = r5.getMessage()     // Catch: java.lang.Throwable -> L3b
            r3.append(r5)     // Catch: java.lang.Throwable -> L3b
            java.lang.String r5 = r3.toString()     // Catch: java.lang.Throwable -> L3b
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L3b
            r3 = 0
            r1[r3] = r5     // Catch: java.lang.Throwable -> L3b
            com.umeng.commonsdk.statistics.common.ULog.e(r2, r1)     // Catch: java.lang.Throwable -> L3b
            goto L3e
        L3b:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3b
            throw r5
        L3e:
            monitor-exit(r0)
            return
    }
}
