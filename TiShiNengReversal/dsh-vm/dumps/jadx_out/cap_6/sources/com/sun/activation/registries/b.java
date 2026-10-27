package com.sun.activation.registries;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class b {
    private static boolean a;
    private static java.util.logging.Logger b;
    private static final java.util.logging.Level c = null;

    static {
            java.util.logging.Level r0 = java.util.logging.Level.FINE
            com.sun.activation.registries.b.c = r0
            java.lang.String r0 = "javax.activation.debug"
            boolean r0 = java.lang.Boolean.getBoolean(r0)     // Catch: java.lang.Throwable -> Lc
            com.sun.activation.registries.b.a = r0     // Catch: java.lang.Throwable -> Lc
        Lc:
            java.lang.String r0 = "javax.activation"
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            com.sun.activation.registries.b.b = r0
            return
    }

    private b() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean a() {
            boolean r0 = com.sun.activation.registries.b.a
            if (r0 != 0) goto L10
            java.util.logging.Logger r0 = com.sun.activation.registries.b.b
            java.util.logging.Level r1 = com.sun.activation.registries.b.c
            boolean r0 = r0.isLoggable(r1)
            if (r0 != 0) goto L10
            r0 = 0
            return r0
        L10:
            r0 = 1
            return r0
    }

    public static void b(java.lang.String r2) {
            boolean r0 = com.sun.activation.registries.b.a
            if (r0 == 0) goto L9
            java.io.PrintStream r0 = java.lang.System.out
            r0.getClass()
        L9:
            java.util.logging.Logger r0 = com.sun.activation.registries.b.b
            java.util.logging.Level r1 = com.sun.activation.registries.b.c
            r0.log(r1, r2)
            return
    }

    public static void c(java.lang.String r2, java.lang.Throwable r3) {
            boolean r0 = com.sun.activation.registries.b.a
            if (r0 == 0) goto Lc
            java.io.PrintStream r0 = java.lang.System.out
            java.util.Objects.toString(r3)
            r0.getClass()
        Lc:
            java.util.logging.Logger r0 = com.sun.activation.registries.b.b
            java.util.logging.Level r1 = com.sun.activation.registries.b.c
            r0.log(r1, r2, r3)
            return
    }
}
