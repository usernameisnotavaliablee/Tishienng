package com.umeng.commonsdk;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class UMInnerImpl {
    private static boolean isInternal;



    static {
            return
    }

    public UMInnerImpl() {
            r0 = this;
            r0.<init>()
            return
    }

    public static synchronized void initAndSendInternal(android.content.Context r6) {
            java.lang.Class<com.umeng.commonsdk.UMInnerImpl> r0 = com.umeng.commonsdk.UMInnerImpl.class
            monitor-enter(r0)
            if (r6 == 0) goto L44
            r1 = 1
            boolean r2 = com.umeng.commonsdk.UMInnerImpl.isInternal     // Catch: java.lang.Throwable -> L1d
            if (r2 != 0) goto L44
            java.lang.Thread r2 = new java.lang.Thread     // Catch: java.lang.Throwable -> L1d
            com.umeng.commonsdk.UMInnerImpl$2 r3 = new com.umeng.commonsdk.UMInnerImpl$2     // Catch: java.lang.Throwable -> L1d
            r3.<init>(r6)     // Catch: java.lang.Throwable -> L1d
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L1d
            r2.start()     // Catch: java.lang.Throwable -> L1d
            com.umeng.commonsdk.UMInnerImpl.isInternal = r1     // Catch: java.lang.Throwable -> L1d
            sendInternal(r6)     // Catch: java.lang.Throwable -> L1d
            goto L44
        L1d:
            r2 = move-exception
            java.lang.String r3 = "internal"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L41
            r4.<init>()     // Catch: java.lang.Throwable -> L41
            java.lang.String r5 = "e is "
            r4.append(r5)     // Catch: java.lang.Throwable -> L41
            java.lang.String r5 = r2.getMessage()     // Catch: java.lang.Throwable -> L41
            r4.append(r5)     // Catch: java.lang.Throwable -> L41
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L41
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L41
            r5 = 0
            r1[r5] = r4     // Catch: java.lang.Throwable -> L41
            com.umeng.commonsdk.statistics.common.ULog.e(r3, r1)     // Catch: java.lang.Throwable -> L41
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r6, r2)     // Catch: java.lang.Throwable -> L41
            goto L44
        L41:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L41
            throw r6
        L44:
            monitor-exit(r0)
            return
    }

    private static synchronized void sendInternal(android.content.Context r6) {
            java.lang.Class<com.umeng.commonsdk.UMInnerImpl> r0 = com.umeng.commonsdk.UMInnerImpl.class
            monitor-enter(r0)
            if (r6 == 0) goto L3d
            r1 = 1
            java.lang.Thread r2 = new java.lang.Thread     // Catch: java.lang.Throwable -> L16
            com.umeng.commonsdk.UMInnerImpl$1 r3 = new com.umeng.commonsdk.UMInnerImpl$1     // Catch: java.lang.Throwable -> L16
            r3.<init>(r6)     // Catch: java.lang.Throwable -> L16
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L16
            r2.start()     // Catch: java.lang.Throwable -> L16
            com.umeng.commonsdk.UMInnerImpl.isInternal = r1     // Catch: java.lang.Throwable -> L16
            goto L3d
        L16:
            r2 = move-exception
            java.lang.String r3 = "internal"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3a
            r4.<init>()     // Catch: java.lang.Throwable -> L3a
            java.lang.String r5 = "e is "
            r4.append(r5)     // Catch: java.lang.Throwable -> L3a
            java.lang.String r5 = r2.getMessage()     // Catch: java.lang.Throwable -> L3a
            r4.append(r5)     // Catch: java.lang.Throwable -> L3a
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L3a
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L3a
            r5 = 0
            r1[r5] = r4     // Catch: java.lang.Throwable -> L3a
            com.umeng.commonsdk.statistics.common.ULog.e(r3, r1)     // Catch: java.lang.Throwable -> L3a
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r6, r2)     // Catch: java.lang.Throwable -> L3a
            goto L3d
        L3a:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3a
            throw r6
        L3d:
            monitor-exit(r0)
            return
    }
}
