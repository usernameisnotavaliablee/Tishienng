package io.netty.handler.ssl.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public abstract class SimpleTrustManagerFactory extends javax.net.ssl.TrustManagerFactory {
    private static final io.netty.util.concurrent.FastThreadLocal<io.netty.handler.ssl.util.SimpleTrustManagerFactory.SimpleTrustManagerFactorySpi> CURRENT_SPI = null;
    private static final java.security.Provider PROVIDER = null;



    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class SimpleTrustManagerFactorySpi extends javax.net.ssl.TrustManagerFactorySpi {
        private io.netty.handler.ssl.util.SimpleTrustManagerFactory parent;
        private volatile javax.net.ssl.TrustManager[] trustManagers;

        SimpleTrustManagerFactorySpi() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // javax.net.ssl.TrustManagerFactorySpi
        protected javax.net.ssl.TrustManager[] engineGetTrustManagers() {
                r4 = this;
                javax.net.ssl.TrustManager[] r0 = r4.trustManagers
                if (r0 != 0) goto L2f
                io.netty.handler.ssl.util.SimpleTrustManagerFactory r0 = r4.parent
                javax.net.ssl.TrustManager[] r0 = r0.engineGetTrustManagers()
                int r1 = io.netty.util.internal.PlatformDependent.javaVersion()
                r2 = 7
                if (r1 < r2) goto L2d
                r1 = 0
            L12:
                int r2 = r0.length
                if (r1 >= r2) goto L2d
                r2 = r0[r1]
                boolean r3 = r2 instanceof javax.net.ssl.X509TrustManager
                if (r3 == 0) goto L2a
                boolean r3 = io.netty.handler.ssl.y.a(r2)
                if (r3 != 0) goto L2a
                io.netty.handler.ssl.util.X509TrustManagerWrapper r3 = new io.netty.handler.ssl.util.X509TrustManagerWrapper
                javax.net.ssl.X509TrustManager r2 = (javax.net.ssl.X509TrustManager) r2
                r3.<init>(r2)
                r0[r1] = r3
            L2a:
                int r1 = r1 + 1
                goto L12
            L2d:
                r4.trustManagers = r0
            L2f:
                java.lang.Object r0 = r0.clone()
                javax.net.ssl.TrustManager[] r0 = (javax.net.ssl.TrustManager[]) r0
                return r0
        }

        @Override // javax.net.ssl.TrustManagerFactorySpi
        protected void engineInit(java.security.KeyStore r2) throws java.security.KeyStoreException {
                r1 = this;
                io.netty.handler.ssl.util.SimpleTrustManagerFactory r0 = r1.parent     // Catch: java.lang.Exception -> L6 java.security.KeyStoreException -> L8
                r0.engineInit(r2)     // Catch: java.lang.Exception -> L6 java.security.KeyStoreException -> L8
                return
            L6:
                r2 = move-exception
                goto La
            L8:
                r2 = move-exception
                goto L10
            La:
                java.security.KeyStoreException r0 = new java.security.KeyStoreException
                r0.<init>(r2)
                throw r0
            L10:
                throw r2
        }

        @Override // javax.net.ssl.TrustManagerFactorySpi
        protected void engineInit(javax.net.ssl.ManagerFactoryParameters r2) throws java.security.InvalidAlgorithmParameterException {
                r1 = this;
                io.netty.handler.ssl.util.SimpleTrustManagerFactory r0 = r1.parent     // Catch: java.lang.Exception -> L6 java.security.InvalidAlgorithmParameterException -> L8
                r0.engineInit(r2)     // Catch: java.lang.Exception -> L6 java.security.InvalidAlgorithmParameterException -> L8
                return
            L6:
                r2 = move-exception
                goto La
            L8:
                r2 = move-exception
                goto L10
            La:
                java.security.InvalidAlgorithmParameterException r0 = new java.security.InvalidAlgorithmParameterException
                r0.<init>(r2)
                throw r0
            L10:
                throw r2
        }

        void init(io.netty.handler.ssl.util.SimpleTrustManagerFactory r1) {
                r0 = this;
                r0.parent = r1
                return
        }
    }

    static {
            io.netty.handler.ssl.util.SimpleTrustManagerFactory$1 r0 = new io.netty.handler.ssl.util.SimpleTrustManagerFactory$1
            java.lang.String r1 = ""
            r2 = 0
            r0.<init>(r1, r2, r1)
            io.netty.handler.ssl.util.SimpleTrustManagerFactory.PROVIDER = r0
            io.netty.handler.ssl.util.SimpleTrustManagerFactory$2 r0 = new io.netty.handler.ssl.util.SimpleTrustManagerFactory$2
            r0.<init>()
            io.netty.handler.ssl.util.SimpleTrustManagerFactory.CURRENT_SPI = r0
            return
    }

    protected SimpleTrustManagerFactory() {
            r1 = this;
            java.lang.String r0 = ""
            r1.<init>(r0)
            return
    }

    protected SimpleTrustManagerFactory(java.lang.String r4) {
            r3 = this;
            io.netty.util.concurrent.FastThreadLocal<io.netty.handler.ssl.util.SimpleTrustManagerFactory$SimpleTrustManagerFactorySpi> r0 = io.netty.handler.ssl.util.SimpleTrustManagerFactory.CURRENT_SPI
            java.lang.Object r1 = r0.get()
            javax.net.ssl.TrustManagerFactorySpi r1 = (javax.net.ssl.TrustManagerFactorySpi) r1
            java.security.Provider r2 = io.netty.handler.ssl.util.SimpleTrustManagerFactory.PROVIDER
            r3.<init>(r1, r2, r4)
            java.lang.Object r1 = r0.get()
            io.netty.handler.ssl.util.SimpleTrustManagerFactory$SimpleTrustManagerFactorySpi r1 = (io.netty.handler.ssl.util.SimpleTrustManagerFactory.SimpleTrustManagerFactorySpi) r1
            r1.init(r3)
            r0.remove()
            if (r4 == 0) goto L1c
            return
        L1c:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException
            java.lang.String r0 = "name"
            r4.<init>(r0)
            throw r4
    }

    protected abstract javax.net.ssl.TrustManager[] engineGetTrustManagers();

    protected abstract void engineInit(java.security.KeyStore r1) throws java.lang.Exception;

    protected abstract void engineInit(javax.net.ssl.ManagerFactoryParameters r1) throws java.lang.Exception;
}
