package okhttp3;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nHandshake.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Handshake.kt\nokhttp3/Handshake\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,201:1\n1563#2:202\n1634#2,3:203\n1563#2:206\n1634#2,3:207\n*S KotlinDebug\n*F\n+ 1 Handshake.kt\nokhttp3/Handshake\n*L\n131#1:202\n131#1:203,3\n136#1:206\n136#1:207,3\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class Handshake {

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.Handshake.Companion Companion = null;

    @org.jetbrains.annotations.NotNull
    private final okhttp3.CipherSuite cipherSuite;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<java.security.cert.Certificate> localCertificates;

    @org.jetbrains.annotations.NotNull
    private final kotlin.s peerCertificates$delegate;

    @org.jetbrains.annotations.NotNull
    private final okhttp3.TlsVersion tlsVersion;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nHandshake.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Handshake.kt\nokhttp3/Handshake$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,201:1\n1#2:202\n*E\n"})
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

        public static /* synthetic */ java.util.List a(java.util.List r0) {
                java.util.List r0 = handshake$lambda$2(r0)
                return r0
        }

        public static /* synthetic */ java.util.List b(java.util.List r0) {
                java.util.List r0 = get$lambda$0(r0)
                return r0
        }

        private static final java.util.List get$lambda$0(java.util.List r0) {
                return r0
        }

        private static final java.util.List handshake$lambda$2(java.util.List r0) {
                return r0
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @kotlin.ReplaceWith(expression = "sslSession.handshake()", imports = {}))
        @kotlin.jvm.JvmName(name = "-deprecated_get")
        @org.jetbrains.annotations.NotNull
        /* renamed from: -deprecated_get, reason: not valid java name */
        public final okhttp3.Handshake m90deprecated_get(@org.jetbrains.annotations.NotNull javax.net.ssl.SSLSession r2) throws java.io.IOException {
                r1 = this;
                java.lang.String r0 = "sslSession"
                kotlin.jvm.internal.g0.p(r2, r0)
                okhttp3.Handshake r2 = r1.get(r2)
                return r2
        }

        @kotlin.jvm.JvmStatic
        @kotlin.jvm.JvmName(name = "get")
        @org.jetbrains.annotations.NotNull
        public final okhttp3.Handshake get(@org.jetbrains.annotations.NotNull javax.net.ssl.SSLSession r6) throws java.io.IOException {
                r5 = this;
                java.lang.String r0 = "<this>"
                kotlin.jvm.internal.g0.p(r6, r0)
                java.lang.String r0 = r6.getCipherSuite()
                if (r0 == 0) goto L7c
                java.lang.String r1 = "TLS_NULL_WITH_NULL_NULL"
                boolean r1 = kotlin.jvm.internal.g0.g(r0, r1)
                if (r1 != 0) goto L65
                java.lang.String r1 = "SSL_NULL_WITH_NULL_NULL"
                boolean r1 = kotlin.jvm.internal.g0.g(r0, r1)
                if (r1 != 0) goto L65
                okhttp3.CipherSuite$Companion r1 = okhttp3.CipherSuite.Companion
                okhttp3.CipherSuite r0 = r1.forJavaName(r0)
                java.lang.String r1 = r6.getProtocol()
                if (r1 == 0) goto L5d
                java.lang.String r2 = "NONE"
                boolean r2 = kotlin.jvm.internal.g0.g(r2, r1)
                if (r2 != 0) goto L55
                okhttp3.TlsVersion$Companion r2 = okhttp3.TlsVersion.Companion
                okhttp3.TlsVersion r1 = r2.forJavaName(r1)
                java.security.cert.Certificate[] r2 = r6.getPeerCertificates()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> L3e
                java.util.List r2 = okhttp3.internal._UtilJvmKt.toImmutableList(r2)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> L3e
                goto L42
            L3e:
                java.util.List r2 = kotlin.collections.f0.J()
            L42:
                okhttp3.Handshake r3 = new okhttp3.Handshake
                java.security.cert.Certificate[] r6 = r6.getLocalCertificates()
                java.util.List r6 = okhttp3.internal._UtilJvmKt.toImmutableList(r6)
                okhttp3.d r4 = new okhttp3.d
                r4.<init>(r2)
                r3.<init>(r1, r0, r6, r4)
                return r3
            L55:
                java.io.IOException r6 = new java.io.IOException
                java.lang.String r0 = "tlsVersion == NONE"
                r6.<init>(r0)
                throw r6
            L5d:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "tlsVersion == null"
                r6.<init>(r0)
                throw r6
            L65:
                java.io.IOException r6 = new java.io.IOException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "cipherSuite == "
                r1.append(r2)
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                r6.<init>(r0)
                throw r6
            L7c:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "cipherSuite == null"
                r6.<init>(r0)
                throw r6
        }

        @kotlin.jvm.JvmStatic
        @org.jetbrains.annotations.NotNull
        public final okhttp3.Handshake get(@org.jetbrains.annotations.NotNull okhttp3.TlsVersion r3, @org.jetbrains.annotations.NotNull okhttp3.CipherSuite r4, @org.jetbrains.annotations.NotNull java.util.List<? extends java.security.cert.Certificate> r5, @org.jetbrains.annotations.NotNull java.util.List<? extends java.security.cert.Certificate> r6) {
                r2 = this;
                java.lang.String r0 = "tlsVersion"
                kotlin.jvm.internal.g0.p(r3, r0)
                java.lang.String r0 = "cipherSuite"
                kotlin.jvm.internal.g0.p(r4, r0)
                java.lang.String r0 = "peerCertificates"
                kotlin.jvm.internal.g0.p(r5, r0)
                java.lang.String r0 = "localCertificates"
                kotlin.jvm.internal.g0.p(r6, r0)
                java.util.List r5 = okhttp3.internal._UtilJvmKt.toImmutableList(r5)
                okhttp3.Handshake r0 = new okhttp3.Handshake
                java.util.List r6 = okhttp3.internal._UtilJvmKt.toImmutableList(r6)
                okhttp3.c r1 = new okhttp3.c
                r1.<init>(r5)
                r0.<init>(r3, r4, r6, r1)
                return r0
        }
    }

    static {
            okhttp3.Handshake$Companion r0 = new okhttp3.Handshake$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.Handshake.Companion = r0
            return
    }

    public Handshake(@org.jetbrains.annotations.NotNull okhttp3.TlsVersion r2, @org.jetbrains.annotations.NotNull okhttp3.CipherSuite r3, @org.jetbrains.annotations.NotNull java.util.List<? extends java.security.cert.Certificate> r4, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<? extends java.util.List<? extends java.security.cert.Certificate>> r5) {
            r1 = this;
            java.lang.String r0 = "tlsVersion"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "cipherSuite"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "localCertificates"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "peerCertificatesFn"
            kotlin.jvm.internal.g0.p(r5, r0)
            r1.<init>()
            r1.tlsVersion = r2
            r1.cipherSuite = r3
            r1.localCertificates = r4
            okhttp3.b r2 = new okhttp3.b
            r2.<init>(r5)
            kotlin.s r2 = kotlin.t.c(r2)
            r1.peerCertificates$delegate = r2
            return
    }

    public static /* synthetic */ java.util.List a(kotlin.jvm.functions.Function0 r0) {
            java.util.List r0 = peerCertificates_delegate$lambda$0(r0)
            return r0
    }

    @kotlin.jvm.JvmStatic
    @kotlin.jvm.JvmName(name = "get")
    @org.jetbrains.annotations.NotNull
    public static final okhttp3.Handshake get(@org.jetbrains.annotations.NotNull javax.net.ssl.SSLSession r1) throws java.io.IOException {
            okhttp3.Handshake$Companion r0 = okhttp3.Handshake.Companion
            okhttp3.Handshake r1 = r0.get(r1)
            return r1
    }

    @kotlin.jvm.JvmStatic
    @org.jetbrains.annotations.NotNull
    public static final okhttp3.Handshake get(@org.jetbrains.annotations.NotNull okhttp3.TlsVersion r1, @org.jetbrains.annotations.NotNull okhttp3.CipherSuite r2, @org.jetbrains.annotations.NotNull java.util.List<? extends java.security.cert.Certificate> r3, @org.jetbrains.annotations.NotNull java.util.List<? extends java.security.cert.Certificate> r4) {
            okhttp3.Handshake$Companion r0 = okhttp3.Handshake.Companion
            okhttp3.Handshake r1 = r0.get(r1, r2, r3, r4)
            return r1
    }

    private final java.lang.String getName(java.security.cert.Certificate r2) {
            r1 = this;
            boolean r0 = r2 instanceof java.security.cert.X509Certificate
            if (r0 == 0) goto Lf
            java.security.cert.X509Certificate r2 = (java.security.cert.X509Certificate) r2
            java.security.Principal r2 = r2.getSubjectDN()
            java.lang.String r2 = r2.toString()
            return r2
        Lf:
            java.lang.String r2 = r2.getType()
            java.lang.String r0 = "getType(...)"
            kotlin.jvm.internal.g0.o(r2, r0)
            return r2
    }

    private static final java.util.List peerCertificates_delegate$lambda$0(kotlin.jvm.functions.Function0 r0) {
            java.lang.Object r0 = r0.invoke()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> L7
            java.util.List r0 = (java.util.List) r0     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> L7
            return r0
        L7:
            java.util.List r0 = kotlin.collections.f0.J()
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "cipherSuite", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_cipherSuite")
    @org.jetbrains.annotations.NotNull
    /* renamed from: -deprecated_cipherSuite, reason: not valid java name */
    public final okhttp3.CipherSuite m84deprecated_cipherSuite() {
            r1 = this;
            okhttp3.CipherSuite r0 = r1.cipherSuite
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "localCertificates", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_localCertificates")
    @org.jetbrains.annotations.NotNull
    /* renamed from: -deprecated_localCertificates, reason: not valid java name */
    public final java.util.List<java.security.cert.Certificate> m85deprecated_localCertificates() {
            r1 = this;
            java.util.List<java.security.cert.Certificate> r0 = r1.localCertificates
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "localPrincipal", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_localPrincipal")
    @org.jetbrains.annotations.Nullable
    /* renamed from: -deprecated_localPrincipal, reason: not valid java name */
    public final java.security.Principal m86deprecated_localPrincipal() {
            r1 = this;
            java.security.Principal r0 = r1.localPrincipal()
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "peerCertificates", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_peerCertificates")
    @org.jetbrains.annotations.NotNull
    /* renamed from: -deprecated_peerCertificates, reason: not valid java name */
    public final java.util.List<java.security.cert.Certificate> m87deprecated_peerCertificates() {
            r1 = this;
            java.util.List r0 = r1.peerCertificates()
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "peerPrincipal", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_peerPrincipal")
    @org.jetbrains.annotations.Nullable
    /* renamed from: -deprecated_peerPrincipal, reason: not valid java name */
    public final java.security.Principal m88deprecated_peerPrincipal() {
            r1 = this;
            java.security.Principal r0 = r1.peerPrincipal()
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "tlsVersion", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_tlsVersion")
    @org.jetbrains.annotations.NotNull
    /* renamed from: -deprecated_tlsVersion, reason: not valid java name */
    public final okhttp3.TlsVersion m89deprecated_tlsVersion() {
            r1 = this;
            okhttp3.TlsVersion r0 = r1.tlsVersion
            return r0
    }

    @kotlin.jvm.JvmName(name = "cipherSuite")
    @org.jetbrains.annotations.NotNull
    public final okhttp3.CipherSuite cipherSuite() {
            r1 = this;
            okhttp3.CipherSuite r0 = r1.cipherSuite
            return r0
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof okhttp3.Handshake
            if (r0 == 0) goto L30
            okhttp3.Handshake r3 = (okhttp3.Handshake) r3
            okhttp3.TlsVersion r0 = r3.tlsVersion
            okhttp3.TlsVersion r1 = r2.tlsVersion
            if (r0 != r1) goto L30
            okhttp3.CipherSuite r0 = r3.cipherSuite
            okhttp3.CipherSuite r1 = r2.cipherSuite
            boolean r0 = kotlin.jvm.internal.g0.g(r0, r1)
            if (r0 == 0) goto L30
            java.util.List r0 = r3.peerCertificates()
            java.util.List r1 = r2.peerCertificates()
            boolean r0 = kotlin.jvm.internal.g0.g(r0, r1)
            if (r0 == 0) goto L30
            java.util.List<java.security.cert.Certificate> r3 = r3.localCertificates
            java.util.List<java.security.cert.Certificate> r0 = r2.localCertificates
            boolean r3 = kotlin.jvm.internal.g0.g(r3, r0)
            if (r3 == 0) goto L30
            r3 = 1
            return r3
        L30:
            r3 = 0
            return r3
    }

    public int hashCode() {
            r2 = this;
            okhttp3.TlsVersion r0 = r2.tlsVersion
            int r0 = r0.hashCode()
            r1 = 527(0x20f, float:7.38E-43)
            int r1 = r1 + r0
            int r1 = r1 * 31
            okhttp3.CipherSuite r0 = r2.cipherSuite
            int r0 = r0.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.util.List r0 = r2.peerCertificates()
            int r0 = r0.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.util.List<java.security.cert.Certificate> r0 = r2.localCertificates
            int r0 = r0.hashCode()
            int r1 = r1 + r0
            return r1
    }

    @kotlin.jvm.JvmName(name = "localCertificates")
    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.security.cert.Certificate> localCertificates() {
            r1 = this;
            java.util.List<java.security.cert.Certificate> r0 = r1.localCertificates
            return r0
    }

    @kotlin.jvm.JvmName(name = "localPrincipal")
    @org.jetbrains.annotations.Nullable
    public final java.security.Principal localPrincipal() {
            r3 = this;
            java.util.List<java.security.cert.Certificate> r0 = r3.localCertificates
            java.lang.Object r0 = kotlin.collections.f0.L2(r0)
            boolean r1 = r0 instanceof java.security.cert.X509Certificate
            r2 = 0
            if (r1 == 0) goto Le
            java.security.cert.X509Certificate r0 = (java.security.cert.X509Certificate) r0
            goto Lf
        Le:
            r0 = r2
        Lf:
            if (r0 == 0) goto L16
            javax.security.auth.x500.X500Principal r0 = r0.getSubjectX500Principal()
            return r0
        L16:
            return r2
    }

    @kotlin.jvm.JvmName(name = "peerCertificates")
    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.security.cert.Certificate> peerCertificates() {
            r1 = this;
            kotlin.s r0 = r1.peerCertificates$delegate
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            return r0
    }

    @kotlin.jvm.JvmName(name = "peerPrincipal")
    @org.jetbrains.annotations.Nullable
    public final java.security.Principal peerPrincipal() {
            r3 = this;
            java.util.List r0 = r3.peerCertificates()
            java.lang.Object r0 = kotlin.collections.f0.L2(r0)
            boolean r1 = r0 instanceof java.security.cert.X509Certificate
            r2 = 0
            if (r1 == 0) goto L10
            java.security.cert.X509Certificate r0 = (java.security.cert.X509Certificate) r0
            goto L11
        L10:
            r0 = r2
        L11:
            if (r0 == 0) goto L18
            javax.security.auth.x500.X500Principal r0 = r0.getSubjectX500Principal()
            return r0
        L18:
            return r2
    }

    @kotlin.jvm.JvmName(name = "tlsVersion")
    @org.jetbrains.annotations.NotNull
    public final okhttp3.TlsVersion tlsVersion() {
            r1 = this;
            okhttp3.TlsVersion r0 = r1.tlsVersion
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r4 = this;
            java.util.List r0 = r4.peerCertificates()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r3 = kotlin.collections.f0.d0(r0, r2)
            r1.<init>(r3)
            java.util.Iterator r0 = r0.iterator()
        L15:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L29
            java.lang.Object r3 = r0.next()
            java.security.cert.Certificate r3 = (java.security.cert.Certificate) r3
            java.lang.String r3 = r4.getName(r3)
            r1.add(r3)
            goto L15
        L29:
            java.lang.String r0 = r1.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Handshake{tlsVersion="
            r1.append(r3)
            okhttp3.TlsVersion r3 = r4.tlsVersion
            r1.append(r3)
            java.lang.String r3 = " cipherSuite="
            r1.append(r3)
            okhttp3.CipherSuite r3 = r4.cipherSuite
            r1.append(r3)
            java.lang.String r3 = " peerCertificates="
            r1.append(r3)
            r1.append(r0)
            java.lang.String r0 = " localCertificates="
            r1.append(r0)
            java.util.List<java.security.cert.Certificate> r0 = r4.localCertificates
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r3 = new java.util.ArrayList
            int r2 = kotlin.collections.f0.d0(r0, r2)
            r3.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L64:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L78
            java.lang.Object r2 = r0.next()
            java.security.cert.Certificate r2 = (java.security.cert.Certificate) r2
            java.lang.String r2 = r4.getName(r2)
            r3.add(r2)
            goto L64
        L78:
            r1.append(r3)
            r0 = 125(0x7d, float:1.75E-43)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }
}
