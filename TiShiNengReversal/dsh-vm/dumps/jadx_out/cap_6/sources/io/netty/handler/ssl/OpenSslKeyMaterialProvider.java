package io.netty.handler.ssl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
class OpenSslKeyMaterialProvider {
    private final javax.net.ssl.X509KeyManager keyManager;
    private final java.lang.String password;

    OpenSslKeyMaterialProvider(javax.net.ssl.X509KeyManager r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            r0.keyManager = r1
            r0.password = r2
            return
    }

    static void validateKeyMaterialSupported(java.security.cert.X509Certificate[] r0, java.security.PrivateKey r1, java.lang.String r2) throws javax.net.ssl.SSLException {
            validateSupported(r0)
            validateSupported(r1, r2)
            return
    }

    private static void validateSupported(java.security.PrivateKey r5, java.lang.String r6) throws javax.net.ssl.SSLException {
            if (r5 != 0) goto L3
            goto L19
        L3:
            r0 = 0
            io.netty.buffer.UnpooledByteBufAllocator r2 = io.netty.buffer.UnpooledByteBufAllocator.DEFAULT     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L22
            long r2 = io.netty.handler.ssl.ReferenceCountedOpenSslContext.toBIO(r2, r5)     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L22
            long r5 = io.netty.internal.tcnative.SSL.parsePrivateKey(r2, r6)     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L1d
            io.netty.internal.tcnative.SSL.freeBIO(r2)
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 == 0) goto L19
            io.netty.internal.tcnative.SSL.freePrivateKey(r5)
        L19:
            return
        L1a:
            r5 = move-exception
            r0 = r2
            goto L3e
        L1d:
            r6 = move-exception
            r0 = r2
            goto L23
        L20:
            r5 = move-exception
            goto L3e
        L22:
            r6 = move-exception
        L23:
            javax.net.ssl.SSLException r2 = new javax.net.ssl.SSLException     // Catch: java.lang.Throwable -> L20
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L20
            r3.<init>()     // Catch: java.lang.Throwable -> L20
            java.lang.String r4 = "PrivateKey type not supported "
            r3.append(r4)     // Catch: java.lang.Throwable -> L20
            java.lang.String r5 = r5.getFormat()     // Catch: java.lang.Throwable -> L20
            r3.append(r5)     // Catch: java.lang.Throwable -> L20
            java.lang.String r5 = r3.toString()     // Catch: java.lang.Throwable -> L20
            r2.<init>(r5, r6)     // Catch: java.lang.Throwable -> L20
            throw r2     // Catch: java.lang.Throwable -> L20
        L3e:
            io.netty.internal.tcnative.SSL.freeBIO(r0)
            throw r5
    }

    private static void validateSupported(java.security.cert.X509Certificate[] r7) throws javax.net.ssl.SSLException {
            if (r7 == 0) goto L44
            int r0 = r7.length
            if (r0 != 0) goto L6
            goto L44
        L6:
            r0 = 0
            r2 = 0
            io.netty.buffer.UnpooledByteBufAllocator r3 = io.netty.buffer.UnpooledByteBufAllocator.DEFAULT     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L32
            r4 = 1
            io.netty.handler.ssl.PemEncoded r2 = io.netty.handler.ssl.PemX509Certificate.toPEM(r3, r4, r7)     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L32
            io.netty.handler.ssl.PemEncoded r7 = r2.mo39retain()     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L32
            long r3 = io.netty.handler.ssl.ReferenceCountedOpenSslContext.toBIO(r3, r7)     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L32
            long r5 = io.netty.internal.tcnative.SSL.parseX509Chain(r3)     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L2d
            io.netty.internal.tcnative.SSL.freeBIO(r3)
            int r7 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r7 == 0) goto L26
            io.netty.internal.tcnative.SSL.freeX509Chain(r5)
        L26:
            r2.release()
            return
        L2a:
            r7 = move-exception
            r0 = r3
            goto L3b
        L2d:
            r7 = move-exception
            r0 = r3
            goto L33
        L30:
            r7 = move-exception
            goto L3b
        L32:
            r7 = move-exception
        L33:
            javax.net.ssl.SSLException r3 = new javax.net.ssl.SSLException     // Catch: java.lang.Throwable -> L30
            java.lang.String r4 = "Certificate type not supported"
            r3.<init>(r4, r7)     // Catch: java.lang.Throwable -> L30
            throw r3     // Catch: java.lang.Throwable -> L30
        L3b:
            io.netty.internal.tcnative.SSL.freeBIO(r0)
            if (r2 == 0) goto L43
            r2.release()
        L43:
            throw r7
        L44:
            return
    }

    io.netty.handler.ssl.OpenSslKeyMaterial chooseKeyMaterial(io.netty.buffer.ByteBufAllocator r17, java.lang.String r18) throws java.lang.Exception {
            r16 = this;
            r1 = r16
            r0 = r17
            r2 = r18
            javax.net.ssl.X509KeyManager r3 = r1.keyManager
            java.security.cert.X509Certificate[] r9 = r3.getCertificateChain(r2)
            if (r9 == 0) goto L80
            int r3 = r9.length
            if (r3 != 0) goto L13
            goto L80
        L13:
            javax.net.ssl.X509KeyManager r3 = r1.keyManager
            java.security.PrivateKey r2 = r3.getPrivateKey(r2)
            r3 = 1
            io.netty.handler.ssl.PemEncoded r3 = io.netty.handler.ssl.PemX509Certificate.toPEM(r0, r3, r9)
            r10 = 0
            io.netty.handler.ssl.PemEncoded r4 = r3.mo39retain()     // Catch: java.lang.Throwable -> L63
            long r12 = io.netty.handler.ssl.ReferenceCountedOpenSslContext.toBIO(r0, r4)     // Catch: java.lang.Throwable -> L63
            long r5 = io.netty.internal.tcnative.SSL.parseX509Chain(r12)     // Catch: java.lang.Throwable -> L5f
            boolean r4 = r2 instanceof io.netty.handler.ssl.OpenSslPrivateKey     // Catch: java.lang.Throwable -> L37
            if (r4 == 0) goto L3b
            io.netty.handler.ssl.OpenSslPrivateKey r2 = (io.netty.handler.ssl.OpenSslPrivateKey) r2     // Catch: java.lang.Throwable -> L37
            io.netty.handler.ssl.OpenSslKeyMaterial r0 = r2.newKeyMaterial(r5, r9)     // Catch: java.lang.Throwable -> L37
            goto L50
        L37:
            r0 = move-exception
            r7 = r10
        L39:
            r14 = r7
            goto L68
        L3b:
            long r14 = io.netty.handler.ssl.ReferenceCountedOpenSslContext.toBIO(r0, r2)     // Catch: java.lang.Throwable -> L37
            if (r2 != 0) goto L43
            r7 = r10
            goto L49
        L43:
            java.lang.String r0 = r1.password     // Catch: java.lang.Throwable -> L5c
            long r7 = io.netty.internal.tcnative.SSL.parsePrivateKey(r14, r0)     // Catch: java.lang.Throwable -> L5c
        L49:
            io.netty.handler.ssl.DefaultOpenSslKeyMaterial r4 = new io.netty.handler.ssl.DefaultOpenSslKeyMaterial     // Catch: java.lang.Throwable -> L5a
            r4.<init>(r5, r7, r9)     // Catch: java.lang.Throwable -> L5a
            r0 = r4
            r10 = r14
        L50:
            io.netty.internal.tcnative.SSL.freeBIO(r12)
            io.netty.internal.tcnative.SSL.freeBIO(r10)
            r3.release()
            return r0
        L5a:
            r0 = move-exception
            goto L68
        L5c:
            r0 = move-exception
            r7 = r10
            goto L68
        L5f:
            r0 = move-exception
            r5 = r10
            r7 = r5
            goto L39
        L63:
            r0 = move-exception
            r5 = r10
            r7 = r5
            r12 = r7
            r14 = r12
        L68:
            io.netty.internal.tcnative.SSL.freeBIO(r12)
            io.netty.internal.tcnative.SSL.freeBIO(r14)
            int r2 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r2 == 0) goto L75
            io.netty.internal.tcnative.SSL.freeX509Chain(r5)
        L75:
            int r2 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r2 == 0) goto L7c
            io.netty.internal.tcnative.SSL.freePrivateKey(r7)
        L7c:
            r3.release()
            throw r0
        L80:
            r0 = 0
            return r0
    }

    void destroy() {
            r0 = this;
            return
    }

    javax.net.ssl.X509KeyManager keyManager() {
            r1 = this;
            javax.net.ssl.X509KeyManager r0 = r1.keyManager
            return r0
    }
}
