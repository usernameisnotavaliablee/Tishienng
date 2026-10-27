package io.netty.handler.ssl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
final class OpenSslKeyMaterialManager {
    private static final java.util.Map<java.lang.String, java.lang.String> KEY_TYPES = null;
    static final java.lang.String KEY_TYPE_DH_RSA = "DH_RSA";
    static final java.lang.String KEY_TYPE_EC = "EC";
    static final java.lang.String KEY_TYPE_EC_EC = "EC_EC";
    static final java.lang.String KEY_TYPE_EC_RSA = "EC_RSA";
    static final java.lang.String KEY_TYPE_RSA = "RSA";
    private final io.netty.handler.ssl.OpenSslKeyMaterialProvider provider;

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            io.netty.handler.ssl.OpenSslKeyMaterialManager.KEY_TYPES = r0
            java.lang.String r1 = "RSA"
            r0.put(r1, r1)
            java.lang.String r2 = "DHE_RSA"
            r0.put(r2, r1)
            java.lang.String r2 = "ECDHE_RSA"
            r0.put(r2, r1)
            java.lang.String r1 = "ECDHE_ECDSA"
            java.lang.String r2 = "EC"
            r0.put(r1, r2)
            java.lang.String r1 = "ECDH_RSA"
            java.lang.String r2 = "EC_RSA"
            r0.put(r1, r2)
            java.lang.String r1 = "ECDH_ECDSA"
            java.lang.String r2 = "EC_EC"
            r0.put(r1, r2)
            java.lang.String r1 = "DH_RSA"
            r0.put(r1, r1)
            return
    }

    OpenSslKeyMaterialManager(io.netty.handler.ssl.OpenSslKeyMaterialProvider r1) {
            r0 = this;
            r0.<init>()
            r0.provider = r1
            return
    }

    private java.lang.String chooseClientAlias(io.netty.handler.ssl.ReferenceCountedOpenSslEngine r3, java.lang.String[] r4, javax.security.auth.x500.X500Principal[] r5) {
            r2 = this;
            io.netty.handler.ssl.OpenSslKeyMaterialProvider r0 = r2.provider
            javax.net.ssl.X509KeyManager r0 = r0.keyManager()
            boolean r1 = r0 instanceof javax.net.ssl.X509ExtendedKeyManager
            if (r1 == 0) goto L11
            javax.net.ssl.X509ExtendedKeyManager r0 = (javax.net.ssl.X509ExtendedKeyManager) r0
            java.lang.String r3 = r0.chooseEngineClientAlias(r4, r5, r3)
            return r3
        L11:
            r3 = 0
            java.lang.String r3 = r0.chooseClientAlias(r4, r5, r3)
            return r3
    }

    private java.lang.String chooseServerAlias(io.netty.handler.ssl.ReferenceCountedOpenSslEngine r4, java.lang.String r5) {
            r3 = this;
            io.netty.handler.ssl.OpenSslKeyMaterialProvider r0 = r3.provider
            javax.net.ssl.X509KeyManager r0 = r0.keyManager()
            boolean r1 = r0 instanceof javax.net.ssl.X509ExtendedKeyManager
            r2 = 0
            if (r1 == 0) goto L12
            javax.net.ssl.X509ExtendedKeyManager r0 = (javax.net.ssl.X509ExtendedKeyManager) r0
            java.lang.String r4 = r0.chooseEngineServerAlias(r5, r2, r4)
            return r4
        L12:
            java.lang.String r4 = r0.chooseServerAlias(r5, r2, r2)
            return r4
    }

    private void setKeyMaterial(io.netty.handler.ssl.ReferenceCountedOpenSslEngine r4, java.lang.String r5) throws javax.net.ssl.SSLException {
            r3 = this;
            r0 = 0
            io.netty.handler.ssl.OpenSslKeyMaterialProvider r1 = r3.provider     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L11 javax.net.ssl.SSLException -> L13
            io.netty.buffer.ByteBufAllocator r2 = r4.alloc     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L11 javax.net.ssl.SSLException -> L13
            io.netty.handler.ssl.OpenSslKeyMaterial r0 = r1.chooseKeyMaterial(r2, r5)     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L11 javax.net.ssl.SSLException -> L13
            if (r0 == 0) goto L15
            r4.setKeyMaterial(r0)     // Catch: java.lang.Throwable -> Lf java.lang.Exception -> L11 javax.net.ssl.SSLException -> L13
            goto L15
        Lf:
            r4 = move-exception
            goto L22
        L11:
            r4 = move-exception
            goto L1b
        L13:
            r4 = move-exception
            goto L21
        L15:
            if (r0 == 0) goto L1a
            r0.release()
        L1a:
            return
        L1b:
            javax.net.ssl.SSLException r5 = new javax.net.ssl.SSLException     // Catch: java.lang.Throwable -> Lf
            r5.<init>(r4)     // Catch: java.lang.Throwable -> Lf
            throw r5     // Catch: java.lang.Throwable -> Lf
        L21:
            throw r4     // Catch: java.lang.Throwable -> Lf
        L22:
            if (r0 == 0) goto L27
            r0.release()
        L27:
            throw r4
    }

    void setKeyMaterialClientSide(io.netty.handler.ssl.ReferenceCountedOpenSslEngine r1, java.lang.String[] r2, javax.security.auth.x500.X500Principal[] r3) throws javax.net.ssl.SSLException {
            r0 = this;
            java.lang.String r2 = r0.chooseClientAlias(r1, r2, r3)
            if (r2 == 0) goto L9
            r0.setKeyMaterial(r1, r2)
        L9:
            return
    }

    void setKeyMaterialServerSide(io.netty.handler.ssl.ReferenceCountedOpenSslEngine r7) throws javax.net.ssl.SSLException {
            r6 = this;
            long r0 = r7.sslPointer()
            java.lang.String[] r0 = io.netty.internal.tcnative.SSL.authenticationMethods(r0)
            java.util.HashSet r1 = new java.util.HashSet
            int r2 = r0.length
            r1.<init>(r2)
            int r2 = r0.length
            r3 = 0
        L10:
            if (r3 >= r2) goto L30
            r4 = r0[r3]
            java.util.Map<java.lang.String, java.lang.String> r5 = io.netty.handler.ssl.OpenSslKeyMaterialManager.KEY_TYPES
            java.lang.Object r4 = r5.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L2d
            java.lang.String r4 = r6.chooseServerAlias(r7, r4)
            if (r4 == 0) goto L2d
            boolean r5 = r1.add(r4)
            if (r5 == 0) goto L2d
            r6.setKeyMaterial(r7, r4)
        L2d:
            int r3 = r3 + 1
            goto L10
        L30:
            return
    }
}
