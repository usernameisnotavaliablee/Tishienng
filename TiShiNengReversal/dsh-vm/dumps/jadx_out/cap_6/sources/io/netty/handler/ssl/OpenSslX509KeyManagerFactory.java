package io.netty.handler.ssl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class OpenSslX509KeyManagerFactory extends javax.net.ssl.KeyManagerFactory {
    private final io.netty.handler.ssl.OpenSslX509KeyManagerFactory.OpenSslKeyManagerFactorySpi spi;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: io.netty.handler.ssl.OpenSslX509KeyManagerFactory$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class OpenSslKeyManagerFactorySpi extends javax.net.ssl.KeyManagerFactorySpi {
        final javax.net.ssl.KeyManagerFactory kmf;
        private volatile io.netty.handler.ssl.OpenSslX509KeyManagerFactory.OpenSslKeyManagerFactorySpi.ProviderFactory providerFactory;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        private static final class ProviderFactory {
            private final java.lang.Iterable<java.lang.String> aliases;
            private final javax.net.ssl.X509KeyManager keyManager;
            private final java.lang.String password;

            /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
            private static final class OpenSslPopulatedKeyMaterialProvider extends io.netty.handler.ssl.OpenSslKeyMaterialProvider {
                private final java.util.Map<java.lang.String, java.lang.Object> materialMap;

                OpenSslPopulatedKeyMaterialProvider(javax.net.ssl.X509KeyManager r2, java.lang.String r3, java.lang.Iterable<java.lang.String> r4) {
                        r1 = this;
                        r1.<init>(r2, r3)
                        java.util.HashMap r2 = new java.util.HashMap
                        r2.<init>()
                        r1.materialMap = r2
                        java.util.Iterator r2 = r4.iterator()     // Catch: java.lang.Throwable -> L30
                    Le:
                        boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L30
                        if (r3 == 0) goto L39
                        java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L30
                        java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L30
                        if (r3 == 0) goto Le
                        java.util.Map<java.lang.String, java.lang.Object> r4 = r1.materialMap     // Catch: java.lang.Throwable -> L30
                        boolean r4 = r4.containsKey(r3)     // Catch: java.lang.Throwable -> L30
                        if (r4 != 0) goto Le
                        java.util.Map<java.lang.String, java.lang.Object> r4 = r1.materialMap     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L32
                        io.netty.buffer.UnpooledByteBufAllocator r0 = io.netty.buffer.UnpooledByteBufAllocator.DEFAULT     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L32
                        io.netty.handler.ssl.OpenSslKeyMaterial r0 = super.chooseKeyMaterial(r0, r3)     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L32
                        r4.put(r3, r0)     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L32
                        goto Le
                    L30:
                        r2 = move-exception
                        goto L4a
                    L32:
                        r4 = move-exception
                        java.util.Map<java.lang.String, java.lang.Object> r0 = r1.materialMap     // Catch: java.lang.Throwable -> L30
                        r0.put(r3, r4)     // Catch: java.lang.Throwable -> L30
                        goto Le
                    L39:
                        java.util.Map<java.lang.String, java.lang.Object> r2 = r1.materialMap
                        boolean r2 = r2.isEmpty()
                        if (r2 != 0) goto L42
                        return
                    L42:
                        java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                        java.lang.String r3 = "aliases must be non-empty"
                        r2.<init>(r3)
                        throw r2
                    L4a:
                        r1.destroy()
                        throw r2
                }

                @Override // io.netty.handler.ssl.OpenSslKeyMaterialProvider
                io.netty.handler.ssl.OpenSslKeyMaterial chooseKeyMaterial(io.netty.buffer.ByteBufAllocator r1, java.lang.String r2) throws java.lang.Exception {
                        r0 = this;
                        java.util.Map<java.lang.String, java.lang.Object> r1 = r0.materialMap
                        java.lang.Object r1 = r1.get(r2)
                        if (r1 != 0) goto La
                        r1 = 0
                        return r1
                    La:
                        boolean r2 = r1 instanceof io.netty.handler.ssl.OpenSslKeyMaterial
                        if (r2 == 0) goto L15
                        io.netty.handler.ssl.OpenSslKeyMaterial r1 = (io.netty.handler.ssl.OpenSslKeyMaterial) r1
                        io.netty.handler.ssl.OpenSslKeyMaterial r1 = r1.retain()
                        return r1
                    L15:
                        java.lang.Exception r1 = (java.lang.Exception) r1
                        throw r1
                }

                @Override // io.netty.handler.ssl.OpenSslKeyMaterialProvider
                void destroy() {
                        r2 = this;
                        java.util.Map<java.lang.String, java.lang.Object> r0 = r2.materialMap
                        java.util.Collection r0 = r0.values()
                        java.util.Iterator r0 = r0.iterator()
                    La:
                        boolean r1 = r0.hasNext()
                        if (r1 == 0) goto L18
                        java.lang.Object r1 = r0.next()
                        io.netty.util.ReferenceCountUtil.release(r1)
                        goto La
                    L18:
                        java.util.Map<java.lang.String, java.lang.Object> r0 = r2.materialMap
                        r0.clear()
                        return
                }
            }

            ProviderFactory(javax.net.ssl.X509KeyManager r1, java.lang.String r2, java.lang.Iterable<java.lang.String> r3) {
                    r0 = this;
                    r0.<init>()
                    r0.keyManager = r1
                    r0.password = r2
                    r0.aliases = r3
                    return
            }

            static /* synthetic */ javax.net.ssl.X509KeyManager access$000(io.netty.handler.ssl.OpenSslX509KeyManagerFactory.OpenSslKeyManagerFactorySpi.ProviderFactory r0) {
                    javax.net.ssl.X509KeyManager r0 = r0.keyManager
                    return r0
            }

            io.netty.handler.ssl.OpenSslKeyMaterialProvider newProvider() {
                    r4 = this;
                    io.netty.handler.ssl.OpenSslX509KeyManagerFactory$OpenSslKeyManagerFactorySpi$ProviderFactory$OpenSslPopulatedKeyMaterialProvider r0 = new io.netty.handler.ssl.OpenSslX509KeyManagerFactory$OpenSslKeyManagerFactorySpi$ProviderFactory$OpenSslPopulatedKeyMaterialProvider
                    javax.net.ssl.X509KeyManager r1 = r4.keyManager
                    java.lang.String r2 = r4.password
                    java.lang.Iterable<java.lang.String> r3 = r4.aliases
                    r0.<init>(r1, r2, r3)
                    return r0
            }
        }

        OpenSslKeyManagerFactorySpi(javax.net.ssl.KeyManagerFactory r2) {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "kmf"
                java.lang.Object r2 = io.netty.util.internal.ObjectUtil.checkNotNull(r2, r0)
                javax.net.ssl.KeyManagerFactory r2 = (javax.net.ssl.KeyManagerFactory) r2
                r1.kmf = r2
                return
        }

        private static java.lang.String password(char[] r1) {
                if (r1 == 0) goto Lc
                int r0 = r1.length
                if (r0 != 0) goto L6
                goto Lc
            L6:
                java.lang.String r0 = new java.lang.String
                r0.<init>(r1)
                return r0
            Lc:
                r1 = 0
                return r1
        }

        @Override // javax.net.ssl.KeyManagerFactorySpi
        protected javax.net.ssl.KeyManager[] engineGetKeyManagers() {
                r3 = this;
                io.netty.handler.ssl.OpenSslX509KeyManagerFactory$OpenSslKeyManagerFactorySpi$ProviderFactory r0 = r3.providerFactory
                if (r0 == 0) goto Lf
                javax.net.ssl.X509KeyManager r0 = io.netty.handler.ssl.OpenSslX509KeyManagerFactory.OpenSslKeyManagerFactorySpi.ProviderFactory.access$000(r0)
                r1 = 1
                javax.net.ssl.KeyManager[] r1 = new javax.net.ssl.KeyManager[r1]
                r2 = 0
                r1[r2] = r0
                return r1
            Lf:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "engineInit(...) not called yet"
                r0.<init>(r1)
                throw r0
        }

        @Override // javax.net.ssl.KeyManagerFactorySpi
        protected synchronized void engineInit(java.security.KeyStore r3, char[] r4) throws java.security.KeyStoreException, java.security.NoSuchAlgorithmException, java.security.UnrecoverableKeyException {
                r2 = this;
                monitor-enter(r2)
                io.netty.handler.ssl.OpenSslX509KeyManagerFactory$OpenSslKeyManagerFactorySpi$ProviderFactory r0 = r2.providerFactory     // Catch: java.lang.Throwable -> L33
                if (r0 != 0) goto L3d
                java.util.Enumeration r0 = r3.aliases()     // Catch: java.lang.Throwable -> L33
                boolean r0 = r0.hasMoreElements()     // Catch: java.lang.Throwable -> L33
                if (r0 == 0) goto L35
                javax.net.ssl.KeyManagerFactory r0 = r2.kmf     // Catch: java.lang.Throwable -> L33
                r0.init(r3, r4)     // Catch: java.lang.Throwable -> L33
                io.netty.handler.ssl.OpenSslX509KeyManagerFactory$OpenSslKeyManagerFactorySpi$ProviderFactory r0 = new io.netty.handler.ssl.OpenSslX509KeyManagerFactory$OpenSslKeyManagerFactorySpi$ProviderFactory     // Catch: java.lang.Throwable -> L33
                javax.net.ssl.KeyManagerFactory r1 = r2.kmf     // Catch: java.lang.Throwable -> L33
                javax.net.ssl.KeyManager[] r1 = r1.getKeyManagers()     // Catch: java.lang.Throwable -> L33
                javax.net.ssl.X509KeyManager r1 = io.netty.handler.ssl.ReferenceCountedOpenSslContext.chooseX509KeyManager(r1)     // Catch: java.lang.Throwable -> L33
                java.lang.String r4 = password(r4)     // Catch: java.lang.Throwable -> L33
                java.util.Enumeration r3 = r3.aliases()     // Catch: java.lang.Throwable -> L33
                java.util.ArrayList r3 = java.util.Collections.list(r3)     // Catch: java.lang.Throwable -> L33
                r0.<init>(r1, r4, r3)     // Catch: java.lang.Throwable -> L33
                r2.providerFactory = r0     // Catch: java.lang.Throwable -> L33
                monitor-exit(r2)
                return
            L33:
                r3 = move-exception
                goto L45
            L35:
                java.security.KeyStoreException r3 = new java.security.KeyStoreException     // Catch: java.lang.Throwable -> L33
                java.lang.String r4 = "No aliases found"
                r3.<init>(r4)     // Catch: java.lang.Throwable -> L33
                throw r3     // Catch: java.lang.Throwable -> L33
            L3d:
                java.security.KeyStoreException r3 = new java.security.KeyStoreException     // Catch: java.lang.Throwable -> L33
                java.lang.String r4 = "Already initialized"
                r3.<init>(r4)     // Catch: java.lang.Throwable -> L33
                throw r3     // Catch: java.lang.Throwable -> L33
            L45:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L33
                throw r3
        }

        @Override // javax.net.ssl.KeyManagerFactorySpi
        protected void engineInit(javax.net.ssl.ManagerFactoryParameters r2) throws java.security.InvalidAlgorithmParameterException {
                r1 = this;
                java.security.InvalidAlgorithmParameterException r2 = new java.security.InvalidAlgorithmParameterException
                java.lang.String r0 = "Not supported"
                r2.<init>(r0)
                throw r2
        }

        io.netty.handler.ssl.OpenSslKeyMaterialProvider newProvider() {
                r2 = this;
                io.netty.handler.ssl.OpenSslX509KeyManagerFactory$OpenSslKeyManagerFactorySpi$ProviderFactory r0 = r2.providerFactory
                if (r0 == 0) goto L9
                io.netty.handler.ssl.OpenSslKeyMaterialProvider r0 = r0.newProvider()
                return r0
            L9:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "engineInit(...) not called yet"
                r0.<init>(r1)
                throw r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class OpenSslKeyStore extends java.security.KeyStore {


        private OpenSslKeyStore(java.security.cert.X509Certificate[] r2, boolean r3) {
                r1 = this;
                io.netty.handler.ssl.OpenSslX509KeyManagerFactory$OpenSslKeyStore$1 r0 = new io.netty.handler.ssl.OpenSslX509KeyManagerFactory$OpenSslKeyStore$1
                r0.<init>(r3, r2)
                r2 = 0
                java.lang.String r3 = "native"
                r1.<init>(r0, r2, r3)
                io.netty.handler.ssl.OpenSsl.ensureAvailability()
                return
        }

        /* synthetic */ OpenSslKeyStore(java.security.cert.X509Certificate[] r1, boolean r2, io.netty.handler.ssl.OpenSslX509KeyManagerFactory.AnonymousClass1 r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }
    }

    public OpenSslX509KeyManagerFactory() {
            r1 = this;
            r0 = 0
            io.netty.handler.ssl.OpenSslX509KeyManagerFactory$OpenSslKeyManagerFactorySpi r0 = newOpenSslKeyManagerFactorySpi(r0)
            r1.<init>(r0)
            return
    }

    private OpenSslX509KeyManagerFactory(io.netty.handler.ssl.OpenSslX509KeyManagerFactory.OpenSslKeyManagerFactorySpi r3) {
            r2 = this;
            javax.net.ssl.KeyManagerFactory r0 = r3.kmf
            java.security.Provider r0 = r0.getProvider()
            javax.net.ssl.KeyManagerFactory r1 = r3.kmf
            java.lang.String r1 = r1.getAlgorithm()
            r2.<init>(r3, r0, r1)
            r2.spi = r3
            return
    }

    public OpenSslX509KeyManagerFactory(java.lang.String r1, java.security.Provider r2) throws java.security.NoSuchAlgorithmException {
            r0 = this;
            io.netty.handler.ssl.OpenSslX509KeyManagerFactory$OpenSslKeyManagerFactorySpi r1 = newOpenSslKeyManagerFactorySpi(r1, r2)
            r0.<init>(r1)
            return
    }

    public OpenSslX509KeyManagerFactory(java.security.Provider r1) {
            r0 = this;
            io.netty.handler.ssl.OpenSslX509KeyManagerFactory$OpenSslKeyManagerFactorySpi r1 = newOpenSslKeyManagerFactorySpi(r1)
            r0.<init>(r1)
            return
    }

    public static io.netty.handler.ssl.OpenSslX509KeyManagerFactory newEngineBased(java.io.File r0, java.lang.String r1) throws java.security.cert.CertificateException, java.io.IOException, java.security.KeyStoreException, java.security.NoSuchAlgorithmException, java.security.UnrecoverableKeyException {
            java.security.cert.X509Certificate[] r0 = io.netty.handler.ssl.SslContext.toX509Certificates(r0)
            io.netty.handler.ssl.OpenSslX509KeyManagerFactory r0 = newEngineBased(r0, r1)
            return r0
    }

    public static io.netty.handler.ssl.OpenSslX509KeyManagerFactory newEngineBased(java.security.cert.X509Certificate[] r3, java.lang.String r4) throws java.security.cert.CertificateException, java.io.IOException, java.security.KeyStoreException, java.security.NoSuchAlgorithmException, java.security.UnrecoverableKeyException {
            io.netty.handler.ssl.OpenSslX509KeyManagerFactory$OpenSslKeyStore r0 = new io.netty.handler.ssl.OpenSslX509KeyManagerFactory$OpenSslKeyStore
            java.lang.Object r3 = r3.clone()
            java.security.cert.X509Certificate[] r3 = (java.security.cert.X509Certificate[]) r3
            r1 = 0
            r2 = 0
            r0.<init>(r3, r1, r2)
            r0.load(r2, r2)
            io.netty.handler.ssl.OpenSslX509KeyManagerFactory r3 = new io.netty.handler.ssl.OpenSslX509KeyManagerFactory
            r3.<init>()
            if (r4 != 0) goto L18
            goto L1c
        L18:
            char[] r2 = r4.toCharArray()
        L1c:
            r3.init(r0, r2)
            return r3
    }

    public static io.netty.handler.ssl.OpenSslX509KeyManagerFactory newKeyless(java.io.File r0) throws java.security.cert.CertificateException, java.io.IOException, java.security.KeyStoreException, java.security.NoSuchAlgorithmException, java.security.UnrecoverableKeyException {
            java.security.cert.X509Certificate[] r0 = io.netty.handler.ssl.SslContext.toX509Certificates(r0)
            io.netty.handler.ssl.OpenSslX509KeyManagerFactory r0 = newKeyless(r0)
            return r0
    }

    public static io.netty.handler.ssl.OpenSslX509KeyManagerFactory newKeyless(java.io.InputStream r0) throws java.security.cert.CertificateException, java.io.IOException, java.security.KeyStoreException, java.security.NoSuchAlgorithmException, java.security.UnrecoverableKeyException {
            java.security.cert.X509Certificate[] r0 = io.netty.handler.ssl.SslContext.toX509Certificates(r0)
            io.netty.handler.ssl.OpenSslX509KeyManagerFactory r0 = newKeyless(r0)
            return r0
    }

    public static io.netty.handler.ssl.OpenSslX509KeyManagerFactory newKeyless(java.security.cert.X509Certificate... r3) throws java.security.cert.CertificateException, java.io.IOException, java.security.KeyStoreException, java.security.NoSuchAlgorithmException, java.security.UnrecoverableKeyException {
            io.netty.handler.ssl.OpenSslX509KeyManagerFactory$OpenSslKeyStore r0 = new io.netty.handler.ssl.OpenSslX509KeyManagerFactory$OpenSslKeyStore
            java.lang.Object r3 = r3.clone()
            java.security.cert.X509Certificate[] r3 = (java.security.cert.X509Certificate[]) r3
            r1 = 1
            r2 = 0
            r0.<init>(r3, r1, r2)
            r0.load(r2, r2)
            io.netty.handler.ssl.OpenSslX509KeyManagerFactory r3 = new io.netty.handler.ssl.OpenSslX509KeyManagerFactory
            r3.<init>()
            r3.init(r0, r2)
            return r3
    }

    private static io.netty.handler.ssl.OpenSslX509KeyManagerFactory.OpenSslKeyManagerFactorySpi newOpenSslKeyManagerFactorySpi(java.lang.String r1, java.security.Provider r2) throws java.security.NoSuchAlgorithmException {
            if (r1 != 0) goto L6
            java.lang.String r1 = javax.net.ssl.KeyManagerFactory.getDefaultAlgorithm()
        L6:
            io.netty.handler.ssl.OpenSslX509KeyManagerFactory$OpenSslKeyManagerFactorySpi r0 = new io.netty.handler.ssl.OpenSslX509KeyManagerFactory$OpenSslKeyManagerFactorySpi
            if (r2 != 0) goto Lf
            javax.net.ssl.KeyManagerFactory r1 = javax.net.ssl.KeyManagerFactory.getInstance(r1)
            goto L13
        Lf:
            javax.net.ssl.KeyManagerFactory r1 = javax.net.ssl.KeyManagerFactory.getInstance(r1, r2)
        L13:
            r0.<init>(r1)
            return r0
    }

    private static io.netty.handler.ssl.OpenSslX509KeyManagerFactory.OpenSslKeyManagerFactorySpi newOpenSslKeyManagerFactorySpi(java.security.Provider r1) {
            r0 = 0
            io.netty.handler.ssl.OpenSslX509KeyManagerFactory$OpenSslKeyManagerFactorySpi r1 = newOpenSslKeyManagerFactorySpi(r0, r1)     // Catch: java.security.NoSuchAlgorithmException -> L6
            return r1
        L6:
            r1 = move-exception
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
    }

    io.netty.handler.ssl.OpenSslKeyMaterialProvider newProvider() {
            r1 = this;
            io.netty.handler.ssl.OpenSslX509KeyManagerFactory$OpenSslKeyManagerFactorySpi r0 = r1.spi
            io.netty.handler.ssl.OpenSslKeyMaterialProvider r0 = r0.newProvider()
            return r0
    }
}
