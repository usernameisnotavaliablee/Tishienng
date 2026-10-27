package com.umeng.commonsdk.internal.crash;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class a {
    public a() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String a(java.lang.Throwable r3) {
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            java.io.StringWriter r1 = new java.io.StringWriter     // Catch: java.lang.Exception -> L23
            r1.<init>()     // Catch: java.lang.Exception -> L23
            java.io.PrintWriter r2 = new java.io.PrintWriter     // Catch: java.lang.Exception -> L23
            r2.<init>(r1)     // Catch: java.lang.Exception -> L23
            java.lang.Throwable r3 = r3.getCause()     // Catch: java.lang.Exception -> L23
        L12:
            if (r3 == 0) goto L19
            java.lang.Throwable r3 = r3.getCause()     // Catch: java.lang.Exception -> L23
            goto L12
        L19:
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Exception -> L23
            r2.close()     // Catch: java.lang.Exception -> L23
            r1.close()     // Catch: java.lang.Exception -> L23
        L23:
            return r0
    }
}
