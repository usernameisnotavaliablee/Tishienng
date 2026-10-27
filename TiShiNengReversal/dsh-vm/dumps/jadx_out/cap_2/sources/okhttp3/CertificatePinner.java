package okhttp3;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nCertificatePinner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CertificatePinner.kt\nokhttp3/CertificatePinner\n+ 2 -UtilCommon.kt\nokhttp3/internal/_UtilCommonKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,378:1\n360#2,8:379\n1563#3:387\n1634#3,3:388\n*S KotlinDebug\n*F\n+ 1 CertificatePinner.kt\nokhttp3/CertificatePinner\n*L\n224#1:379,8\n154#1:387\n154#1:388,3\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class CertificatePinner {

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.CertificatePinner.Companion Companion = null;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final okhttp3.CertificatePinner DEFAULT = null;

    @org.jetbrains.annotations.Nullable
    private final okhttp3.internal.tls.CertificateChainCleaner certificateChainCleaner;

    @org.jetbrains.annotations.NotNull
    private final java.util.Set<okhttp3.CertificatePinner.Pin> pins;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class Builder {

        @org.jetbrains.annotations.NotNull
        private final java.util.List<okhttp3.CertificatePinner.Pin> pins;

        public Builder() {
                r1 = this;
                r1.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.pins = r0
                return
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.CertificatePinner.Builder add(@org.jetbrains.annotations.NotNull java.lang.String r6, @org.jetbrains.annotations.NotNull java.lang.String... r7) {
                r5 = this;
                java.lang.String r0 = "pattern"
                kotlin.jvm.internal.g0.p(r6, r0)
                java.lang.String r0 = "pins"
                kotlin.jvm.internal.g0.p(r7, r0)
                int r0 = r7.length
                r1 = 0
            Lc:
                if (r1 >= r0) goto L1d
                r2 = r7[r1]
                java.util.List<okhttp3.CertificatePinner$Pin> r3 = r5.pins
                okhttp3.CertificatePinner$Pin r4 = new okhttp3.CertificatePinner$Pin
                r4.<init>(r6, r2)
                r3.add(r4)
                int r1 = r1 + 1
                goto Lc
            L1d:
                return r5
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.CertificatePinner build() {
                r4 = this;
                okhttp3.CertificatePinner r0 = new okhttp3.CertificatePinner
                java.util.List<okhttp3.CertificatePinner$Pin> r1 = r4.pins
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                java.util.Set r1 = kotlin.collections.f0.f6(r1)
                r2 = 0
                r3 = 2
                r0.<init>(r1, r2, r3, r2)
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final java.util.List<okhttp3.CertificatePinner.Pin> getPins() {
                r1 = this;
                java.util.List<okhttp3.CertificatePinner$Pin> r0 = r1.pins
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nCertificatePinner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CertificatePinner.kt\nokhttp3/CertificatePinner$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,378:1\n1#2:379\n*E\n"})
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

        @kotlin.jvm.JvmStatic
        @org.jetbrains.annotations.NotNull
        public final java.lang.String pin(@org.jetbrains.annotations.NotNull java.security.cert.Certificate r3) {
                r2 = this;
                java.lang.String r0 = "certificate"
                kotlin.jvm.internal.g0.p(r3, r0)
                boolean r0 = r3 instanceof java.security.cert.X509Certificate
                if (r0 == 0) goto L25
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "sha256/"
                r0.append(r1)
                java.security.cert.X509Certificate r3 = (java.security.cert.X509Certificate) r3
                okio.ByteString r3 = r2.sha256Hash(r3)
                java.lang.String r3 = r3.base64()
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                return r3
            L25:
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Certificate pinning requires X509 certificates"
                r3.<init>(r0)
                throw r3
        }

        @kotlin.jvm.JvmStatic
        @org.jetbrains.annotations.NotNull
        public final okio.ByteString sha1Hash(@org.jetbrains.annotations.NotNull java.security.cert.X509Certificate r8) {
                r7 = this;
                java.lang.String r0 = "<this>"
                kotlin.jvm.internal.g0.p(r8, r0)
                okio.ByteString$Companion r1 = okio.ByteString.Companion
                java.security.PublicKey r8 = r8.getPublicKey()
                byte[] r2 = r8.getEncoded()
                java.lang.String r8 = "getEncoded(...)"
                kotlin.jvm.internal.g0.o(r2, r8)
                r5 = 3
                r6 = 0
                r3 = 0
                r4 = 0
                okio.ByteString r8 = okio.ByteString.Companion.of$default(r1, r2, r3, r4, r5, r6)
                okio.ByteString r8 = r8.sha1()
                return r8
        }

        @kotlin.jvm.JvmStatic
        @org.jetbrains.annotations.NotNull
        public final okio.ByteString sha256Hash(@org.jetbrains.annotations.NotNull java.security.cert.X509Certificate r8) {
                r7 = this;
                java.lang.String r0 = "<this>"
                kotlin.jvm.internal.g0.p(r8, r0)
                okio.ByteString$Companion r1 = okio.ByteString.Companion
                java.security.PublicKey r8 = r8.getPublicKey()
                byte[] r2 = r8.getEncoded()
                java.lang.String r8 = "getEncoded(...)"
                kotlin.jvm.internal.g0.o(r2, r8)
                r5 = 3
                r6 = 0
                r3 = 0
                r4 = 0
                okio.ByteString r8 = okio.ByteString.Companion.of$default(r1, r2, r3, r4, r5, r6)
                okio.ByteString r8 = r8.sha256()
                return r8
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class Pin {

        @org.jetbrains.annotations.NotNull
        private final okio.ByteString hash;

        @org.jetbrains.annotations.NotNull
        private final java.lang.String hashAlgorithm;

        @org.jetbrains.annotations.NotNull
        private final java.lang.String pattern;

        public Pin(@org.jetbrains.annotations.NotNull java.lang.String r12, @org.jetbrains.annotations.NotNull java.lang.String r13) {
                r11 = this;
                java.lang.String r0 = "pattern"
                kotlin.jvm.internal.g0.p(r12, r0)
                java.lang.String r0 = "pin"
                kotlin.jvm.internal.g0.p(r13, r0)
                r11.<init>()
                java.lang.String r0 = "*."
                r1 = 0
                r2 = 2
                r3 = 0
                boolean r0 = kotlin.text.u.H2(r12, r0, r1, r2, r3)
                r4 = -1
                if (r0 == 0) goto L27
                r9 = 4
                r10 = 0
                java.lang.String r6 = "*"
                r7 = 1
                r8 = 0
                r5 = r12
                int r12 = kotlin.text.u.H3(r5, r6, r7, r8, r9, r10)
                if (r12 == r4) goto L48
                goto L28
            L27:
                r5 = r12
            L28:
                java.lang.String r12 = "**."
                boolean r12 = kotlin.text.u.H2(r5, r12, r1, r2, r3)
                if (r12 == 0) goto L3c
                r9 = 4
                r10 = 0
                java.lang.String r6 = "*"
                r7 = 2
                r8 = 0
                int r12 = kotlin.text.u.H3(r5, r6, r7, r8, r9, r10)
                if (r12 == r4) goto L48
            L3c:
                r9 = 6
                r10 = 0
                java.lang.String r6 = "*"
                r7 = 0
                r8 = 0
                int r12 = kotlin.text.u.H3(r5, r6, r7, r8, r9, r10)
                if (r12 != r4) goto Lea
            L48:
                java.lang.String r12 = okhttp3.internal._HostnamesCommonKt.toCanonicalHost(r5)
                if (r12 == 0) goto Ld3
                r11.pattern = r12
                java.lang.String r12 = "sha1/"
                boolean r12 = kotlin.text.u.H2(r13, r12, r1, r2, r3)
                java.lang.String r0 = "Invalid pin hash: "
                java.lang.String r4 = "substring(...)"
                if (r12 == 0) goto L88
                java.lang.String r12 = "sha1"
                r11.hashAlgorithm = r12
                okio.ByteString$Companion r12 = okio.ByteString.Companion
                r1 = 5
                java.lang.String r1 = r13.substring(r1)
                kotlin.jvm.internal.g0.o(r1, r4)
                okio.ByteString r12 = r12.decodeBase64(r1)
                if (r12 == 0) goto L73
                r11.hash = r12
                return
            L73:
                java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r0)
                r1.append(r13)
                java.lang.String r13 = r1.toString()
                r12.<init>(r13)
                throw r12
            L88:
                java.lang.String r12 = "sha256/"
                boolean r12 = kotlin.text.u.H2(r13, r12, r1, r2, r3)
                if (r12 == 0) goto Lbc
                java.lang.String r12 = "sha256"
                r11.hashAlgorithm = r12
                okio.ByteString$Companion r12 = okio.ByteString.Companion
                r1 = 7
                java.lang.String r1 = r13.substring(r1)
                kotlin.jvm.internal.g0.o(r1, r4)
                okio.ByteString r12 = r12.decodeBase64(r1)
                if (r12 == 0) goto La7
                r11.hash = r12
                return
            La7:
                java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r0)
                r1.append(r13)
                java.lang.String r13 = r1.toString()
                r12.<init>(r13)
                throw r12
            Lbc:
                java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "pins must start with 'sha256/' or 'sha1/': "
                r0.append(r1)
                r0.append(r13)
                java.lang.String r13 = r0.toString()
                r12.<init>(r13)
                throw r12
            Ld3:
                java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                java.lang.String r0 = "Invalid pattern: "
                r13.append(r0)
                r13.append(r5)
                java.lang.String r13 = r13.toString()
                r12.<init>(r13)
                throw r12
            Lea:
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r13 = "Unexpected pattern: "
                r12.append(r13)
                r12.append(r5)
                java.lang.String r12 = r12.toString()
                java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
                java.lang.String r12 = r12.toString()
                r13.<init>(r12)
                throw r13
        }

        public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof okhttp3.CertificatePinner.Pin
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                java.lang.String r1 = r4.pattern
                okhttp3.CertificatePinner$Pin r5 = (okhttp3.CertificatePinner.Pin) r5
                java.lang.String r3 = r5.pattern
                boolean r1 = kotlin.jvm.internal.g0.g(r1, r3)
                if (r1 != 0) goto L17
                return r2
            L17:
                java.lang.String r1 = r4.hashAlgorithm
                java.lang.String r3 = r5.hashAlgorithm
                boolean r1 = kotlin.jvm.internal.g0.g(r1, r3)
                if (r1 != 0) goto L22
                return r2
            L22:
                okio.ByteString r1 = r4.hash
                okio.ByteString r5 = r5.hash
                boolean r5 = kotlin.jvm.internal.g0.g(r1, r5)
                if (r5 != 0) goto L2d
                return r2
            L2d:
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final okio.ByteString getHash() {
                r1 = this;
                okio.ByteString r0 = r1.hash
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final java.lang.String getHashAlgorithm() {
                r1 = this;
                java.lang.String r0 = r1.hashAlgorithm
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final java.lang.String getPattern() {
                r1 = this;
                java.lang.String r0 = r1.pattern
                return r0
        }

        public int hashCode() {
                r2 = this;
                java.lang.String r0 = r2.pattern
                int r0 = r0.hashCode()
                int r0 = r0 * 31
                java.lang.String r1 = r2.hashAlgorithm
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                okio.ByteString r1 = r2.hash
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }

        public final boolean matchesCertificate(@org.jetbrains.annotations.NotNull java.security.cert.X509Certificate r3) {
                r2 = this;
                java.lang.String r0 = "certificate"
                kotlin.jvm.internal.g0.p(r3, r0)
                java.lang.String r0 = r2.hashAlgorithm
                java.lang.String r1 = "sha256"
                boolean r1 = kotlin.jvm.internal.g0.g(r0, r1)
                if (r1 == 0) goto L1c
                okio.ByteString r0 = r2.hash
                okhttp3.CertificatePinner$Companion r1 = okhttp3.CertificatePinner.Companion
                okio.ByteString r3 = r1.sha256Hash(r3)
                boolean r3 = kotlin.jvm.internal.g0.g(r0, r3)
                return r3
            L1c:
                java.lang.String r1 = "sha1"
                boolean r0 = kotlin.jvm.internal.g0.g(r0, r1)
                if (r0 == 0) goto L31
                okio.ByteString r0 = r2.hash
                okhttp3.CertificatePinner$Companion r1 = okhttp3.CertificatePinner.Companion
                okio.ByteString r3 = r1.sha1Hash(r3)
                boolean r3 = kotlin.jvm.internal.g0.g(r0, r3)
                return r3
            L31:
                r3 = 0
                return r3
        }

        public final boolean matchesHostname(@org.jetbrains.annotations.NotNull java.lang.String r12) {
                r11 = this;
                java.lang.String r0 = "hostname"
                kotlin.jvm.internal.g0.p(r12, r0)
                java.lang.String r0 = r11.pattern
                java.lang.String r1 = "**."
                r2 = 0
                r3 = 2
                r4 = 0
                boolean r0 = kotlin.text.u.H2(r0, r1, r2, r3, r4)
                r1 = 1
                if (r0 == 0) goto L42
                java.lang.String r0 = r11.pattern
                int r0 = r0.length()
                int r7 = r0 + (-3)
                int r0 = r12.length()
                int r0 = r0 - r7
                int r3 = r12.length()
                int r4 = r3 - r7
                java.lang.String r5 = r11.pattern
                r9 = 16
                r10 = 0
                r6 = 3
                r8 = 0
                r3 = r12
                boolean r12 = kotlin.text.u.s2(r3, r4, r5, r6, r7, r8, r9, r10)
                r5 = r3
                if (r12 == 0) goto L41
                if (r0 == 0) goto L40
                int r0 = r0 - r1
                char r12 = r5.charAt(r0)
                r0 = 46
                if (r12 != r0) goto L41
            L40:
                return r1
            L41:
                return r2
            L42:
                r5 = r12
                java.lang.String r12 = r11.pattern
                java.lang.String r0 = "*."
                boolean r12 = kotlin.text.u.H2(r12, r0, r2, r3, r4)
                if (r12 == 0) goto L7e
                java.lang.String r12 = r11.pattern
                int r12 = r12.length()
                int r7 = r12 + (-1)
                int r12 = r5.length()
                int r12 = r12 - r7
                int r0 = r5.length()
                int r4 = r0 - r7
                r3 = r5
                java.lang.String r5 = r11.pattern
                r9 = 16
                r10 = 0
                r6 = 1
                r8 = 0
                boolean r0 = kotlin.text.u.s2(r3, r4, r5, r6, r7, r8, r9, r10)
                if (r0 == 0) goto L7d
                int r5 = r12 + (-1)
                r7 = 4
                r8 = 0
                r4 = 46
                r6 = 0
                int r12 = kotlin.text.u.V3(r3, r4, r5, r6, r7, r8)
                r0 = -1
                if (r12 != r0) goto L7d
                return r1
            L7d:
                return r2
            L7e:
                r3 = r5
                java.lang.String r12 = r11.pattern
                boolean r12 = kotlin.jvm.internal.g0.g(r3, r12)
                return r12
        }

        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = r2.hashAlgorithm
                r0.append(r1)
                r1 = 47
                r0.append(r1)
                okio.ByteString r1 = r2.hash
                java.lang.String r1 = r1.base64()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    static {
            okhttp3.CertificatePinner$Companion r0 = new okhttp3.CertificatePinner$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.CertificatePinner.Companion = r0
            okhttp3.CertificatePinner$Builder r0 = new okhttp3.CertificatePinner$Builder
            r0.<init>()
            okhttp3.CertificatePinner r0 = r0.build()
            okhttp3.CertificatePinner.DEFAULT = r0
            return
    }

    public CertificatePinner(@org.jetbrains.annotations.NotNull java.util.Set<okhttp3.CertificatePinner.Pin> r2, @org.jetbrains.annotations.Nullable okhttp3.internal.tls.CertificateChainCleaner r3) {
            r1 = this;
            java.lang.String r0 = "pins"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.pins = r2
            r1.certificateChainCleaner = r3
            return
    }

    public /* synthetic */ CertificatePinner(java.util.Set r1, okhttp3.internal.tls.CertificateChainCleaner r2, int r3, kotlin.jvm.internal.v r4) {
            r0 = this;
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            r0.<init>(r1, r2)
            return
    }

    public static /* synthetic */ java.util.List a(okhttp3.CertificatePinner r0, java.util.List r1, java.lang.String r2) {
            java.util.List r0 = check$lambda$0(r0, r1, r2)
            return r0
    }

    private static final java.util.List check$lambda$0(okhttp3.CertificatePinner r1, java.util.List r2, java.lang.String r3) {
            okhttp3.internal.tls.CertificateChainCleaner r1 = r1.certificateChainCleaner
            if (r1 == 0) goto Lc
            java.util.List r1 = r1.clean(r2, r3)
            if (r1 != 0) goto Lb
            goto Lc
        Lb:
            r2 = r1
        Lc:
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r1 = new java.util.ArrayList
            r3 = 10
            int r3 = kotlin.collections.f0.d0(r2, r3)
            r1.<init>(r3)
            java.util.Iterator r2 = r2.iterator()
        L1d:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L34
            java.lang.Object r3 = r2.next()
            java.security.cert.Certificate r3 = (java.security.cert.Certificate) r3
            java.lang.String r0 = "null cannot be cast to non-null type java.security.cert.X509Certificate"
            kotlin.jvm.internal.g0.n(r3, r0)
            java.security.cert.X509Certificate r3 = (java.security.cert.X509Certificate) r3
            r1.add(r3)
            goto L1d
        L34:
            return r1
    }

    @kotlin.jvm.JvmStatic
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String pin(@org.jetbrains.annotations.NotNull java.security.cert.Certificate r1) {
            okhttp3.CertificatePinner$Companion r0 = okhttp3.CertificatePinner.Companion
            java.lang.String r1 = r0.pin(r1)
            return r1
    }

    @kotlin.jvm.JvmStatic
    @org.jetbrains.annotations.NotNull
    public static final okio.ByteString sha1Hash(@org.jetbrains.annotations.NotNull java.security.cert.X509Certificate r1) {
            okhttp3.CertificatePinner$Companion r0 = okhttp3.CertificatePinner.Companion
            okio.ByteString r1 = r0.sha1Hash(r1)
            return r1
    }

    @kotlin.jvm.JvmStatic
    @org.jetbrains.annotations.NotNull
    public static final okio.ByteString sha256Hash(@org.jetbrains.annotations.NotNull java.security.cert.X509Certificate r1) {
            okhttp3.CertificatePinner$Companion r0 = okhttp3.CertificatePinner.Companion
            okio.ByteString r1 = r0.sha256Hash(r1)
            return r1
    }

    public final void check(@org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull java.util.List<? extends java.security.cert.Certificate> r3) throws javax.net.ssl.SSLPeerUnverifiedException {
            r1 = this;
            java.lang.String r0 = "hostname"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "peerCertificates"
            kotlin.jvm.internal.g0.p(r3, r0)
            okhttp3.a r0 = new okhttp3.a
            r0.<init>(r1, r3, r2)
            r1.check$okhttp(r2, r0)
            return
    }

    @kotlin.Deprecated(message = "replaced with {@link #check(String, List)}.", replaceWith = @kotlin.ReplaceWith(expression = "check(hostname, peerCertificates.toList())", imports = {}))
    public final void check(@org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull java.security.cert.Certificate... r3) throws javax.net.ssl.SSLPeerUnverifiedException {
            r1 = this;
            java.lang.String r0 = "hostname"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "peerCertificates"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.util.List r3 = kotlin.collections.n.dz(r3)
            r1.check(r2, r3)
            return
    }

    public final void check$okhttp(@org.jetbrains.annotations.NotNull java.lang.String r10, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<? extends java.util.List<? extends java.security.cert.X509Certificate>> r11) {
            r9 = this;
            java.lang.String r0 = "hostname"
            kotlin.jvm.internal.g0.p(r10, r0)
            java.lang.String r0 = "cleanedPeerCertificatesFn"
            kotlin.jvm.internal.g0.p(r11, r0)
            java.util.List r0 = r9.findMatchingPins(r10)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L15
            goto L76
        L15:
            java.lang.Object r11 = r11.invoke()
            java.util.List r11 = (java.util.List) r11
            java.util.Iterator r1 = r11.iterator()
        L1f:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L92
            java.lang.Object r2 = r1.next()
            java.security.cert.X509Certificate r2 = (java.security.cert.X509Certificate) r2
            java.util.Iterator r3 = r0.iterator()
            r4 = 0
            r5 = r4
        L31:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L1f
            java.lang.Object r6 = r3.next()
            okhttp3.CertificatePinner$Pin r6 = (okhttp3.CertificatePinner.Pin) r6
            java.lang.String r7 = r6.getHashAlgorithm()
            java.lang.String r8 = "sha256"
            boolean r8 = kotlin.jvm.internal.g0.g(r7, r8)
            if (r8 == 0) goto L5c
            if (r4 != 0) goto L51
            okhttp3.CertificatePinner$Companion r4 = okhttp3.CertificatePinner.Companion
            okio.ByteString r4 = r4.sha256Hash(r2)
        L51:
            okio.ByteString r6 = r6.getHash()
            boolean r6 = kotlin.jvm.internal.g0.g(r6, r4)
            if (r6 == 0) goto L31
            goto L76
        L5c:
            java.lang.String r8 = "sha1"
            boolean r7 = kotlin.jvm.internal.g0.g(r7, r8)
            if (r7 == 0) goto L77
            if (r5 != 0) goto L6c
            okhttp3.CertificatePinner$Companion r5 = okhttp3.CertificatePinner.Companion
            okio.ByteString r5 = r5.sha1Hash(r2)
        L6c:
            okio.ByteString r6 = r6.getHash()
            boolean r6 = kotlin.jvm.internal.g0.g(r6, r5)
            if (r6 == 0) goto L31
        L76:
            return
        L77:
            java.lang.AssertionError r10 = new java.lang.AssertionError
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r0 = "unsupported hashAlgorithm: "
            r11.append(r0)
            java.lang.String r0 = r6.getHashAlgorithm()
            r11.append(r0)
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        L92:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Certificate pinning failure!"
            r1.append(r2)
            java.lang.String r2 = "\n  Peer certificate chain:"
            r1.append(r2)
            java.util.Iterator r11 = r11.iterator()
        La5:
            boolean r2 = r11.hasNext()
            java.lang.String r3 = "\n    "
            if (r2 == 0) goto Ld0
            java.lang.Object r2 = r11.next()
            java.security.cert.X509Certificate r2 = (java.security.cert.X509Certificate) r2
            r1.append(r3)
            okhttp3.CertificatePinner$Companion r3 = okhttp3.CertificatePinner.Companion
            java.lang.String r3 = r3.pin(r2)
            r1.append(r3)
            java.lang.String r3 = ": "
            r1.append(r3)
            java.security.Principal r2 = r2.getSubjectDN()
            java.lang.String r2 = r2.getName()
            r1.append(r2)
            goto La5
        Ld0:
            java.lang.String r11 = "\n  Pinned certificates for "
            r1.append(r11)
            r1.append(r10)
            java.lang.String r10 = ":"
            r1.append(r10)
            java.util.Iterator r10 = r0.iterator()
        Le1:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto Lf4
            java.lang.Object r11 = r10.next()
            okhttp3.CertificatePinner$Pin r11 = (okhttp3.CertificatePinner.Pin) r11
            r1.append(r3)
            r1.append(r11)
            goto Le1
        Lf4:
            java.lang.String r10 = r1.toString()
            javax.net.ssl.SSLPeerUnverifiedException r11 = new javax.net.ssl.SSLPeerUnverifiedException
            r11.<init>(r10)
            throw r11
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof okhttp3.CertificatePinner
            if (r0 == 0) goto L1c
            okhttp3.CertificatePinner r3 = (okhttp3.CertificatePinner) r3
            java.util.Set<okhttp3.CertificatePinner$Pin> r0 = r3.pins
            java.util.Set<okhttp3.CertificatePinner$Pin> r1 = r2.pins
            boolean r0 = kotlin.jvm.internal.g0.g(r0, r1)
            if (r0 == 0) goto L1c
            okhttp3.internal.tls.CertificateChainCleaner r3 = r3.certificateChainCleaner
            okhttp3.internal.tls.CertificateChainCleaner r0 = r2.certificateChainCleaner
            boolean r3 = kotlin.jvm.internal.g0.g(r3, r0)
            if (r3 == 0) goto L1c
            r3 = 1
            return r3
        L1c:
            r3 = 0
            return r3
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<okhttp3.CertificatePinner.Pin> findMatchingPins(@org.jetbrains.annotations.NotNull java.lang.String r5) {
            r4 = this;
            java.lang.String r0 = "hostname"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.util.Set<okhttp3.CertificatePinner$Pin> r0 = r4.pins
            java.util.List r1 = kotlin.collections.f0.J()
            java.util.Iterator r0 = r0.iterator()
        Lf:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L3a
            java.lang.Object r2 = r0.next()
            r3 = r2
            okhttp3.CertificatePinner$Pin r3 = (okhttp3.CertificatePinner.Pin) r3
            boolean r3 = r3.matchesHostname(r5)
            if (r3 == 0) goto Lf
            boolean r3 = r1.isEmpty()
            if (r3 == 0) goto L2d
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L2d:
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.collections.MutableList<T of okhttp3.internal._UtilCommonKt.filterList>"
            kotlin.jvm.internal.g0.n(r1, r3)
            java.util.List r3 = kotlin.jvm.internal.u0.g(r1)
            r3.add(r2)
            goto Lf
        L3a:
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public final okhttp3.internal.tls.CertificateChainCleaner getCertificateChainCleaner$okhttp() {
            r1 = this;
            okhttp3.internal.tls.CertificateChainCleaner r0 = r1.certificateChainCleaner
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.Set<okhttp3.CertificatePinner.Pin> getPins() {
            r1 = this;
            java.util.Set<okhttp3.CertificatePinner$Pin> r0 = r1.pins
            return r0
    }

    public int hashCode() {
            r2 = this;
            java.util.Set<okhttp3.CertificatePinner$Pin> r0 = r2.pins
            int r0 = r0.hashCode()
            r1 = 1517(0x5ed, float:2.126E-42)
            int r1 = r1 + r0
            int r1 = r1 * 41
            okhttp3.internal.tls.CertificateChainCleaner r0 = r2.certificateChainCleaner
            if (r0 == 0) goto L14
            int r0 = r0.hashCode()
            goto L15
        L14:
            r0 = 0
        L15:
            int r1 = r1 + r0
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final okhttp3.CertificatePinner withCertificateChainCleaner$okhttp(@org.jetbrains.annotations.NotNull okhttp3.internal.tls.CertificateChainCleaner r3) {
            r2 = this;
            java.lang.String r0 = "certificateChainCleaner"
            kotlin.jvm.internal.g0.p(r3, r0)
            okhttp3.internal.tls.CertificateChainCleaner r0 = r2.certificateChainCleaner
            boolean r0 = kotlin.jvm.internal.g0.g(r0, r3)
            if (r0 == 0) goto Le
            return r2
        Le:
            okhttp3.CertificatePinner r0 = new okhttp3.CertificatePinner
            java.util.Set<okhttp3.CertificatePinner$Pin> r1 = r2.pins
            r0.<init>(r1, r3)
            return r0
    }
}
