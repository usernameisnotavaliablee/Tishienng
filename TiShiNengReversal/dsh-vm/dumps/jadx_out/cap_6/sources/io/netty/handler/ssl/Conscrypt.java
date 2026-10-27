package io.netty.handler.ssl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
final class Conscrypt {
    private static final java.lang.reflect.Method IS_CONSCRYPT_SSLENGINE = null;

    static {
            java.lang.reflect.Method r0 = loadIsConscryptEngine()
            io.netty.handler.ssl.Conscrypt.IS_CONSCRYPT_SSLENGINE = r0
            return
    }

    private Conscrypt() {
            r0 = this;
            r0.<init>()
            return
    }

    static boolean isAvailable() {
            java.lang.reflect.Method r0 = io.netty.handler.ssl.Conscrypt.IS_CONSCRYPT_SSLENGINE
            if (r0 == 0) goto Le
            int r0 = io.netty.util.internal.PlatformDependent.javaVersion()
            r1 = 8
            if (r0 < r1) goto Le
            r0 = 1
            return r0
        Le:
            r0 = 0
            return r0
    }

    private static boolean isConscryptEngine(javax.net.ssl.SSLEngine r3) {
            r0 = 0
            java.lang.reflect.Method r1 = io.netty.handler.ssl.Conscrypt.IS_CONSCRYPT_SSLENGINE     // Catch: java.lang.reflect.InvocationTargetException -> L14 java.lang.IllegalAccessException -> L1b
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.reflect.InvocationTargetException -> L14 java.lang.IllegalAccessException -> L1b
            r2[r0] = r3     // Catch: java.lang.reflect.InvocationTargetException -> L14 java.lang.IllegalAccessException -> L1b
            r3 = 0
            java.lang.Object r3 = r1.invoke(r3, r2)     // Catch: java.lang.reflect.InvocationTargetException -> L14 java.lang.IllegalAccessException -> L1b
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.reflect.InvocationTargetException -> L14 java.lang.IllegalAccessException -> L1b
            boolean r3 = r3.booleanValue()     // Catch: java.lang.reflect.InvocationTargetException -> L14 java.lang.IllegalAccessException -> L1b
            return r3
        L14:
            r3 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r3)
            throw r0
        L1b:
            return r0
    }

    static boolean isEngineSupported(javax.net.ssl.SSLEngine r1) {
            boolean r0 = isAvailable()
            if (r0 == 0) goto Le
            boolean r1 = isConscryptEngine(r1)
            if (r1 == 0) goto Le
            r1 = 1
            return r1
        Le:
            r1 = 0
            return r1
    }

    private static java.lang.reflect.Method loadIsConscryptEngine() {
            java.lang.String r0 = "org.conscrypt.Conscrypt"
            java.lang.Class<io.netty.handler.ssl.ConscryptAlpnSslEngine> r1 = io.netty.handler.ssl.ConscryptAlpnSslEngine.class
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch: java.lang.Throwable -> L1b
            r2 = 1
            java.lang.Class r0 = java.lang.Class.forName(r0, r2, r1)     // Catch: java.lang.Throwable -> L1b
            java.lang.String r1 = "isConscrypt"
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L1b
            java.lang.Class<javax.net.ssl.SSLEngine> r3 = javax.net.ssl.SSLEngine.class
            r4 = 0
            r2[r4] = r3     // Catch: java.lang.Throwable -> L1b
            java.lang.reflect.Method r0 = r0.getMethod(r1, r2)     // Catch: java.lang.Throwable -> L1b
            return r0
        L1b:
            r0 = 0
            return r0
    }
}
