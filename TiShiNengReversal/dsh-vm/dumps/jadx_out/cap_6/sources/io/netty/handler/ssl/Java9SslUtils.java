package io.netty.handler.ssl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
final class Java9SslUtils {
    private static final java.lang.reflect.Method GET_APPLICATION_PROTOCOL = null;
    private static final java.lang.reflect.Method GET_HANDSHAKE_APPLICATION_PROTOCOL = null;
    private static final java.lang.reflect.Method GET_HANDSHAKE_APPLICATION_PROTOCOL_SELECTOR = null;
    private static final java.lang.reflect.Method SET_APPLICATION_PROTOCOLS = null;
    private static final java.lang.reflect.Method SET_HANDSHAKE_APPLICATION_PROTOCOL_SELECTOR = null;
    private static final io.netty.util.internal.logging.InternalLogger logger = null;







    static {
            java.lang.Class<io.netty.handler.ssl.Java9SslUtils> r0 = io.netty.handler.ssl.Java9SslUtils.class
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.util.internal.logging.InternalLoggerFactory.getInstance(r0)
            io.netty.handler.ssl.Java9SslUtils.logger = r0
            r0 = 0
            java.lang.String r1 = "TLS"
            javax.net.ssl.SSLContext r1 = javax.net.ssl.SSLContext.getInstance(r1)     // Catch: java.lang.Throwable -> L73
            r1.init(r0, r0, r0)     // Catch: java.lang.Throwable -> L73
            javax.net.ssl.SSLEngine r1 = r1.createSSLEngine()     // Catch: java.lang.Throwable -> L73
            io.netty.handler.ssl.Java9SslUtils$1 r2 = new io.netty.handler.ssl.Java9SslUtils$1     // Catch: java.lang.Throwable -> L73
            r2.<init>()     // Catch: java.lang.Throwable -> L73
            java.lang.Object r2 = java.security.AccessController.doPrivileged(r2)     // Catch: java.lang.Throwable -> L73
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2     // Catch: java.lang.Throwable -> L73
            r2.invoke(r1, r0)     // Catch: java.lang.Throwable -> L73
            io.netty.handler.ssl.Java9SslUtils$2 r3 = new io.netty.handler.ssl.Java9SslUtils$2     // Catch: java.lang.Throwable -> L73
            r3.<init>()     // Catch: java.lang.Throwable -> L73
            java.lang.Object r3 = java.security.AccessController.doPrivileged(r3)     // Catch: java.lang.Throwable -> L73
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3     // Catch: java.lang.Throwable -> L73
            r3.invoke(r1, r0)     // Catch: java.lang.Throwable -> L73
            io.netty.handler.ssl.Java9SslUtils$3 r4 = new io.netty.handler.ssl.Java9SslUtils$3     // Catch: java.lang.Throwable -> L73
            r4.<init>()     // Catch: java.lang.Throwable -> L73
            java.lang.Object r4 = java.security.AccessController.doPrivileged(r4)     // Catch: java.lang.Throwable -> L73
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4     // Catch: java.lang.Throwable -> L73
            javax.net.ssl.SSLParameters r5 = r1.getSSLParameters()     // Catch: java.lang.Throwable -> L73
            r6 = 1
            java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> L73
            java.lang.String[] r8 = io.netty.util.internal.EmptyArrays.EMPTY_STRINGS     // Catch: java.lang.Throwable -> L73
            r9 = 0
            r7[r9] = r8     // Catch: java.lang.Throwable -> L73
            r4.invoke(r5, r7)     // Catch: java.lang.Throwable -> L73
            io.netty.handler.ssl.Java9SslUtils$4 r5 = new io.netty.handler.ssl.Java9SslUtils$4     // Catch: java.lang.Throwable -> L73
            r5.<init>()     // Catch: java.lang.Throwable -> L73
            java.lang.Object r5 = java.security.AccessController.doPrivileged(r5)     // Catch: java.lang.Throwable -> L73
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5     // Catch: java.lang.Throwable -> L73
            io.netty.handler.ssl.Java9SslUtils$5 r7 = new io.netty.handler.ssl.Java9SslUtils$5     // Catch: java.lang.Throwable -> L73
            r7.<init>()     // Catch: java.lang.Throwable -> L73
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> L73
            r6[r9] = r7     // Catch: java.lang.Throwable -> L73
            r5.invoke(r1, r6)     // Catch: java.lang.Throwable -> L73
            io.netty.handler.ssl.Java9SslUtils$6 r6 = new io.netty.handler.ssl.Java9SslUtils$6     // Catch: java.lang.Throwable -> L73
            r6.<init>()     // Catch: java.lang.Throwable -> L73
            java.lang.Object r6 = java.security.AccessController.doPrivileged(r6)     // Catch: java.lang.Throwable -> L73
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6     // Catch: java.lang.Throwable -> L73
            r6.invoke(r1, r0)     // Catch: java.lang.Throwable -> L73
            r0 = r2
            goto L87
        L73:
            r1 = move-exception
            io.netty.util.internal.logging.InternalLogger r2 = io.netty.handler.ssl.Java9SslUtils.logger
            int r3 = io.netty.util.internal.PlatformDependent.javaVersion()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r4 = "Unable to initialize Java9SslUtils, but the detected javaVersion was: {}"
            r2.error(r4, r3, r1)
            r3 = r0
            r4 = r3
            r5 = r4
            r6 = r5
        L87:
            io.netty.handler.ssl.Java9SslUtils.GET_HANDSHAKE_APPLICATION_PROTOCOL = r0
            io.netty.handler.ssl.Java9SslUtils.GET_APPLICATION_PROTOCOL = r3
            io.netty.handler.ssl.Java9SslUtils.SET_APPLICATION_PROTOCOLS = r4
            io.netty.handler.ssl.Java9SslUtils.SET_HANDSHAKE_APPLICATION_PROTOCOL_SELECTOR = r5
            io.netty.handler.ssl.Java9SslUtils.GET_HANDSHAKE_APPLICATION_PROTOCOL_SELECTOR = r6
            return
    }

    private Java9SslUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    static java.lang.String getApplicationProtocol(javax.net.ssl.SSLEngine r2) {
            java.lang.reflect.Method r0 = io.netty.handler.ssl.Java9SslUtils.GET_APPLICATION_PROTOCOL     // Catch: java.lang.Exception -> La java.lang.UnsupportedOperationException -> L11
            r1 = 0
            java.lang.Object r2 = r0.invoke(r2, r1)     // Catch: java.lang.Exception -> La java.lang.UnsupportedOperationException -> L11
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Exception -> La java.lang.UnsupportedOperationException -> L11
            return r2
        La:
            r2 = move-exception
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        L11:
            r2 = move-exception
            throw r2
    }

    static java.lang.String getHandshakeApplicationProtocol(javax.net.ssl.SSLEngine r2) {
            java.lang.reflect.Method r0 = io.netty.handler.ssl.Java9SslUtils.GET_HANDSHAKE_APPLICATION_PROTOCOL     // Catch: java.lang.Exception -> La java.lang.UnsupportedOperationException -> L11
            r1 = 0
            java.lang.Object r2 = r0.invoke(r2, r1)     // Catch: java.lang.Exception -> La java.lang.UnsupportedOperationException -> L11
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Exception -> La java.lang.UnsupportedOperationException -> L11
            return r2
        La:
            r2 = move-exception
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        L11:
            r2 = move-exception
            throw r2
    }

    static java.util.function.BiFunction<javax.net.ssl.SSLEngine, java.util.List<java.lang.String>, java.lang.String> getHandshakeApplicationProtocolSelector(javax.net.ssl.SSLEngine r2) {
            java.lang.reflect.Method r0 = io.netty.handler.ssl.Java9SslUtils.GET_HANDSHAKE_APPLICATION_PROTOCOL_SELECTOR     // Catch: java.lang.Exception -> Lc java.lang.UnsupportedOperationException -> L13
            r1 = 0
            java.lang.Object r2 = r0.invoke(r2, r1)     // Catch: java.lang.Exception -> Lc java.lang.UnsupportedOperationException -> L13
            java.util.function.BiFunction r2 = io.netty.handler.ssl.p.a(r2)     // Catch: java.lang.Exception -> Lc java.lang.UnsupportedOperationException -> L13
            return r2
        Lc:
            r2 = move-exception
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        L13:
            r2 = move-exception
            throw r2
    }

    static void setApplicationProtocols(javax.net.ssl.SSLEngine r4, java.util.List<java.lang.String> r5) {
            javax.net.ssl.SSLParameters r0 = r4.getSSLParameters()
            java.lang.String[] r1 = io.netty.util.internal.EmptyArrays.EMPTY_STRINGS
            java.lang.Object[] r5 = r5.toArray(r1)
            java.lang.String[] r5 = (java.lang.String[]) r5
            java.lang.reflect.Method r1 = io.netty.handler.ssl.Java9SslUtils.SET_APPLICATION_PROTOCOLS     // Catch: java.lang.Exception -> L1b java.lang.UnsupportedOperationException -> L22
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L1b java.lang.UnsupportedOperationException -> L22
            r3 = 0
            r2[r3] = r5     // Catch: java.lang.Exception -> L1b java.lang.UnsupportedOperationException -> L22
            r1.invoke(r0, r2)     // Catch: java.lang.Exception -> L1b java.lang.UnsupportedOperationException -> L22
            r4.setSSLParameters(r0)
            return
        L1b:
            r4 = move-exception
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            r5.<init>(r4)
            throw r5
        L22:
            r4 = move-exception
            throw r4
    }

    static void setHandshakeApplicationProtocolSelector(javax.net.ssl.SSLEngine r3, java.util.function.BiFunction<javax.net.ssl.SSLEngine, java.util.List<java.lang.String>, java.lang.String> r4) {
            java.lang.reflect.Method r0 = io.netty.handler.ssl.Java9SslUtils.SET_HANDSHAKE_APPLICATION_PROTOCOL_SELECTOR     // Catch: java.lang.Exception -> Lc java.lang.UnsupportedOperationException -> L13
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> Lc java.lang.UnsupportedOperationException -> L13
            r2 = 0
            r1[r2] = r4     // Catch: java.lang.Exception -> Lc java.lang.UnsupportedOperationException -> L13
            r0.invoke(r3, r1)     // Catch: java.lang.Exception -> Lc java.lang.UnsupportedOperationException -> L13
            return
        Lc:
            r3 = move-exception
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            r4.<init>(r3)
            throw r4
        L13:
            r3 = move-exception
            throw r3
    }

    static boolean supportsAlpn() {
            java.lang.reflect.Method r0 = io.netty.handler.ssl.Java9SslUtils.GET_APPLICATION_PROTOCOL
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }
}
