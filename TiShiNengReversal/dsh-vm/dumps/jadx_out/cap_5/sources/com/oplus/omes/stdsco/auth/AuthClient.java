package com.oplus.omes.stdsco.auth;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class AuthClient {
    public static java.lang.String a;
    private static volatile boolean b;

    static {
            return
    }

    public AuthClient() {
            r0 = this;
            r0.<init>()
            return
    }

    public static synchronized void a(android.content.Context r2, java.lang.String r3) {
            java.lang.Class<com.oplus.omes.stdsco.auth.AuthClient> r0 = com.oplus.omes.stdsco.auth.AuthClient.class
            monitor-enter(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L19
            if (r1 != 0) goto L1b
            boolean r1 = com.oplus.omes.stdsco.auth.AuthClient.b     // Catch: java.lang.Throwable -> L19
            if (r1 == 0) goto Lf
            monitor-exit(r0)
            return
        Lf:
            r1 = 1
            com.oplus.omes.stdsco.auth.AuthClient.b = r1     // Catch: java.lang.Throwable -> L19
            com.oplus.omes.stdsco.auth.AuthClient.a = r3     // Catch: java.lang.Throwable -> L19
            nativeAuthInit(r2, r3)     // Catch: java.lang.Throwable -> L19
            monitor-exit(r0)
            return
        L19:
            r2 = move-exception
            goto L23
        L1b:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L19
            java.lang.String r3 = "There are some arguments empty"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L19
            throw r2     // Catch: java.lang.Throwable -> L19
        L23:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            throw r2
    }

    public static native void nativeAuthInit(java.lang.Object r0, java.lang.String r1);
}
