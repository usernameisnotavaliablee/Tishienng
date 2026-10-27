package io.netty.handler.ssl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
final class OpenSslX509TrustManagerWrapper {
    private static final io.netty.util.internal.logging.InternalLogger LOGGER = null;
    private static final io.netty.handler.ssl.OpenSslX509TrustManagerWrapper.TrustManagerWrapper WRAPPER = null;




    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private interface TrustManagerWrapper {
        javax.net.ssl.X509TrustManager wrapIfNeeded(javax.net.ssl.X509TrustManager r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class UnsafeTrustManagerWrapper implements io.netty.handler.ssl.OpenSslX509TrustManagerWrapper.TrustManagerWrapper {
        private final long spiOffset;
        private final long tmOffset;

        UnsafeTrustManagerWrapper(long r1, long r3) {
                r0 = this;
                r0.<init>()
                r0.spiOffset = r1
                r0.tmOffset = r3
                return
        }

        @Override // io.netty.handler.ssl.OpenSslX509TrustManagerWrapper.TrustManagerWrapper
        public javax.net.ssl.X509TrustManager wrapIfNeeded(javax.net.ssl.X509TrustManager r4) {
                r3 = this;
                boolean r0 = io.netty.handler.ssl.y.a(r4)
                if (r0 != 0) goto L36
                javax.net.ssl.SSLContext r0 = io.netty.handler.ssl.OpenSslX509TrustManagerWrapper.access$000()     // Catch: java.security.KeyManagementException -> L2b java.security.NoSuchAlgorithmException -> L2d
                r1 = 1
                javax.net.ssl.TrustManager[] r1 = new javax.net.ssl.TrustManager[r1]     // Catch: java.security.KeyManagementException -> L2b java.security.NoSuchAlgorithmException -> L2d
                r2 = 0
                r1[r2] = r4     // Catch: java.security.KeyManagementException -> L2b java.security.NoSuchAlgorithmException -> L2d
                r2 = 0
                r0.init(r2, r1, r2)     // Catch: java.security.KeyManagementException -> L2b java.security.NoSuchAlgorithmException -> L2d
                long r1 = r3.spiOffset     // Catch: java.security.KeyManagementException -> L2b java.security.NoSuchAlgorithmException -> L2d
                java.lang.Object r0 = io.netty.util.internal.PlatformDependent.getObject(r0, r1)     // Catch: java.security.KeyManagementException -> L2b java.security.NoSuchAlgorithmException -> L2d
                if (r0 == 0) goto L36
                long r1 = r3.tmOffset     // Catch: java.security.KeyManagementException -> L2b java.security.NoSuchAlgorithmException -> L2d
                java.lang.Object r0 = io.netty.util.internal.PlatformDependent.getObject(r0, r1)     // Catch: java.security.KeyManagementException -> L2b java.security.NoSuchAlgorithmException -> L2d
                boolean r1 = io.netty.handler.ssl.y.a(r0)     // Catch: java.security.KeyManagementException -> L2b java.security.NoSuchAlgorithmException -> L2d
                if (r1 == 0) goto L36
                javax.net.ssl.X509TrustManager r0 = (javax.net.ssl.X509TrustManager) r0     // Catch: java.security.KeyManagementException -> L2b java.security.NoSuchAlgorithmException -> L2d
                return r0
            L2b:
                r0 = move-exception
                goto L2f
            L2d:
                r0 = move-exception
                goto L33
            L2f:
                io.netty.util.internal.PlatformDependent.throwException(r0)
                goto L36
            L33:
                io.netty.util.internal.PlatformDependent.throwException(r0)
            L36:
                return r4
        }
    }

    static {
            java.lang.Class<io.netty.handler.ssl.OpenSslX509TrustManagerWrapper> r0 = io.netty.handler.ssl.OpenSslX509TrustManagerWrapper.class
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.util.internal.logging.InternalLoggerFactory.getInstance(r0)
            io.netty.handler.ssl.OpenSslX509TrustManagerWrapper.LOGGER = r0
            io.netty.handler.ssl.OpenSslX509TrustManagerWrapper$1 r1 = new io.netty.handler.ssl.OpenSslX509TrustManagerWrapper$1
            r1.<init>()
            java.lang.Throwable r2 = io.netty.util.internal.PlatformDependent.getUnsafeUnavailabilityCause()
            java.lang.String r3 = "Unable to access wrapped TrustManager"
            r4 = 0
            if (r2 != 0) goto L4e
            javax.net.ssl.SSLContext r0 = newSSLContext()     // Catch: java.lang.Throwable -> L29
            io.netty.handler.ssl.OpenSslX509TrustManagerWrapper$2 r2 = new io.netty.handler.ssl.OpenSslX509TrustManagerWrapper$2     // Catch: java.lang.Throwable -> L29
            r2.<init>()     // Catch: java.lang.Throwable -> L29
            r5 = 1
            javax.net.ssl.TrustManager[] r5 = new javax.net.ssl.TrustManager[r5]     // Catch: java.lang.Throwable -> L29
            r6 = 0
            r5[r6] = r2     // Catch: java.lang.Throwable -> L29
            r0.init(r4, r5, r4)     // Catch: java.lang.Throwable -> L29
            goto L2d
        L29:
            r0 = move-exception
            r7 = r4
            r4 = r0
            r0 = r7
        L2d:
            if (r4 == 0) goto L35
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.handler.ssl.OpenSslX509TrustManagerWrapper.LOGGER
            r0.debug(r3, r4)
            goto L51
        L35:
            io.netty.handler.ssl.OpenSslX509TrustManagerWrapper$3 r2 = new io.netty.handler.ssl.OpenSslX509TrustManagerWrapper$3
            r2.<init>(r0)
            java.lang.Object r0 = java.security.AccessController.doPrivileged(r2)
            boolean r2 = r0 instanceof java.lang.Throwable
            if (r2 == 0) goto L4a
            io.netty.util.internal.logging.InternalLogger r2 = io.netty.handler.ssl.OpenSslX509TrustManagerWrapper.LOGGER
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            r2.debug(r3, r0)
            goto L51
        L4a:
            r1 = r0
            io.netty.handler.ssl.OpenSslX509TrustManagerWrapper$TrustManagerWrapper r1 = (io.netty.handler.ssl.OpenSslX509TrustManagerWrapper.TrustManagerWrapper) r1
            goto L51
        L4e:
            r0.debug(r3, r4)
        L51:
            io.netty.handler.ssl.OpenSslX509TrustManagerWrapper.WRAPPER = r1
            return
    }

    private OpenSslX509TrustManagerWrapper() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ javax.net.ssl.SSLContext access$000() throws java.security.NoSuchAlgorithmException {
            javax.net.ssl.SSLContext r0 = newSSLContext()
            return r0
    }

    private static javax.net.ssl.SSLContext newSSLContext() throws java.security.NoSuchAlgorithmException {
            java.lang.String r0 = "TLS"
            javax.net.ssl.SSLContext r0 = javax.net.ssl.SSLContext.getInstance(r0)
            return r0
    }

    static javax.net.ssl.X509TrustManager wrapIfNeeded(javax.net.ssl.X509TrustManager r1) {
            io.netty.handler.ssl.OpenSslX509TrustManagerWrapper$TrustManagerWrapper r0 = io.netty.handler.ssl.OpenSslX509TrustManagerWrapper.WRAPPER
            javax.net.ssl.X509TrustManager r1 = r0.wrapIfNeeded(r1)
            return r1
    }
}
