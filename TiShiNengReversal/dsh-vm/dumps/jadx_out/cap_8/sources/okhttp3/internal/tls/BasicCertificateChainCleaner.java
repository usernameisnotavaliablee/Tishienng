package okhttp3.internal.tls;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class BasicCertificateChainCleaner extends okhttp3.internal.tls.CertificateChainCleaner {

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.internal.tls.BasicCertificateChainCleaner.Companion Companion = null;
    private static final int MAX_SIGNERS = 9;

    @org.jetbrains.annotations.NotNull
    private final okhttp3.internal.tls.TrustRootIndex trustRootIndex;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.v r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            okhttp3.internal.tls.BasicCertificateChainCleaner$Companion r0 = new okhttp3.internal.tls.BasicCertificateChainCleaner$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.internal.tls.BasicCertificateChainCleaner.Companion = r0
            return
    }

    public BasicCertificateChainCleaner(@org.jetbrains.annotations.NotNull okhttp3.internal.tls.TrustRootIndex r2) {
            r1 = this;
            java.lang.String r0 = "trustRootIndex"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.trustRootIndex = r2
            return
    }

    private final boolean verifySignature(java.security.cert.X509Certificate r3, java.security.cert.X509Certificate r4, int r5) {
            r2 = this;
            java.security.Principal r0 = r3.getIssuerDN()
            java.security.Principal r1 = r4.getSubjectDN()
            boolean r0 = kotlin.jvm.internal.g0.g(r0, r1)
            r1 = 0
            if (r0 != 0) goto L10
            return r1
        L10:
            int r0 = r4.getBasicConstraints()
            if (r0 >= r5) goto L17
            return r1
        L17:
            java.security.PublicKey r4 = r4.getPublicKey()     // Catch: java.security.GeneralSecurityException -> L20
            r3.verify(r4)     // Catch: java.security.GeneralSecurityException -> L20
            r3 = 1
            return r3
        L20:
            return r1
    }

    @Override // okhttp3.internal.tls.CertificateChainCleaner
    @org.jetbrains.annotations.NotNull
    public java.util.List<java.security.cert.Certificate> clean(@org.jetbrains.annotations.NotNull java.util.List<? extends java.security.cert.Certificate> r9, @org.jetbrains.annotations.NotNull java.lang.String r10) throws javax.net.ssl.SSLPeerUnverifiedException {
            r8 = this;
            java.lang.String r0 = "chain"
            kotlin.jvm.internal.g0.p(r9, r0)
            java.lang.String r0 = "hostname"
            kotlin.jvm.internal.g0.p(r10, r0)
            java.util.ArrayDeque r10 = new java.util.ArrayDeque
            java.util.Collection r9 = (java.util.Collection) r9
            r10.<init>(r9)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.lang.Object r0 = r10.removeFirst()
            java.lang.String r1 = "removeFirst(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            r9.add(r0)
            r0 = 0
            r1 = 0
        L24:
            r2 = 9
            if (r0 >= r2) goto La5
            int r2 = r9.size()
            r3 = 1
            int r2 = r2 - r3
            java.lang.Object r2 = r9.get(r2)
            java.lang.String r4 = "null cannot be cast to non-null type java.security.cert.X509Certificate"
            kotlin.jvm.internal.g0.n(r2, r4)
            java.security.cert.X509Certificate r2 = (java.security.cert.X509Certificate) r2
            okhttp3.internal.tls.TrustRootIndex r5 = r8.trustRootIndex
            java.security.cert.X509Certificate r5 = r5.findByIssuerAndSignature(r2)
            if (r5 == 0) goto L5f
            int r1 = r9.size()
            if (r1 > r3) goto L4d
            boolean r1 = kotlin.jvm.internal.g0.g(r2, r5)
            if (r1 != 0) goto L50
        L4d:
            r9.add(r5)
        L50:
            int r1 = r9.size()
            int r1 = r1 + (-2)
            boolean r1 = r8.verifySignature(r5, r5, r1)
            if (r1 == 0) goto L5d
            goto L8d
        L5d:
            r1 = 1
            goto L88
        L5f:
            java.util.Iterator r5 = r10.iterator()
            java.lang.String r6 = "iterator(...)"
            kotlin.jvm.internal.g0.o(r5, r6)
        L68:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L8b
            java.lang.Object r6 = r5.next()
            kotlin.jvm.internal.g0.n(r6, r4)
            java.security.cert.X509Certificate r6 = (java.security.cert.X509Certificate) r6
            int r7 = r9.size()
            int r7 = r7 - r3
            boolean r7 = r8.verifySignature(r2, r6, r7)
            if (r7 == 0) goto L68
            r5.remove()
            r9.add(r6)
        L88:
            int r0 = r0 + 1
            goto L24
        L8b:
            if (r1 == 0) goto L8e
        L8d:
            return r9
        L8e:
            javax.net.ssl.SSLPeerUnverifiedException r9 = new javax.net.ssl.SSLPeerUnverifiedException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r0 = "Failed to find a trusted cert that signed "
            r10.append(r0)
            r10.append(r2)
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        La5:
            javax.net.ssl.SSLPeerUnverifiedException r10 = new javax.net.ssl.SSLPeerUnverifiedException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Certificate chain too long: "
            r0.append(r1)
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            r10.<init>(r9)
            throw r10
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r3) {
            r2 = this;
            r0 = 1
            if (r3 != r2) goto L4
            return r0
        L4:
            boolean r1 = r3 instanceof okhttp3.internal.tls.BasicCertificateChainCleaner
            if (r1 == 0) goto L15
            okhttp3.internal.tls.BasicCertificateChainCleaner r3 = (okhttp3.internal.tls.BasicCertificateChainCleaner) r3
            okhttp3.internal.tls.TrustRootIndex r3 = r3.trustRootIndex
            okhttp3.internal.tls.TrustRootIndex r1 = r2.trustRootIndex
            boolean r3 = kotlin.jvm.internal.g0.g(r3, r1)
            if (r3 == 0) goto L15
            return r0
        L15:
            r3 = 0
            return r3
    }

    public int hashCode() {
            r1 = this;
            okhttp3.internal.tls.TrustRootIndex r0 = r1.trustRootIndex
            int r0 = r0.hashCode()
            return r0
    }
}
