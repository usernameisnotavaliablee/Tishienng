package com.umeng.commonsdk;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class UMInnerManager {
    private static java.lang.Class<?> innerImplClazz;
    private static java.lang.reflect.Method sendInternalMethod;

    static {
            java.lang.String r0 = "com.umeng.commonsdk.UMInnerImpl"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L1a
            com.umeng.commonsdk.UMInnerManager.innerImplClazz = r0     // Catch: java.lang.Throwable -> L1a
            java.lang.String r1 = "initAndSendInternal"
            r2 = 1
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L1a
            java.lang.Class<android.content.Context> r3 = android.content.Context.class
            r4 = 0
            r2[r4] = r3     // Catch: java.lang.Throwable -> L1a
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r2)     // Catch: java.lang.Throwable -> L1a
            if (r0 == 0) goto L1a
            com.umeng.commonsdk.UMInnerManager.sendInternalMethod = r0     // Catch: java.lang.Throwable -> L1a
        L1a:
            return
    }

    public UMInnerManager() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void sendInnerPackage(android.content.Context r4) {
            if (r4 == 0) goto L21
            boolean r0 = com.umeng.commonsdk.utils.UMUtils.isMainProgress(r4)
            if (r0 == 0) goto L21
            int r0 = com.umeng.commonsdk.statistics.SdkVersion.SDK_TYPE
            r1 = 1
            if (r0 == r1) goto L1e
            java.lang.Class<?> r0 = com.umeng.commonsdk.UMInnerManager.innerImplClazz
            if (r0 == 0) goto L21
            java.lang.reflect.Method r2 = com.umeng.commonsdk.UMInnerManager.sendInternalMethod
            if (r2 == 0) goto L21
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L21
            r3 = 0
            r1[r3] = r4     // Catch: java.lang.Throwable -> L21
            r2.invoke(r0, r1)     // Catch: java.lang.Throwable -> L21
            return
        L1e:
            com.umeng.commonsdk.UMConfigureInternation.sendInternal(r4)
        L21:
            return
    }
}
