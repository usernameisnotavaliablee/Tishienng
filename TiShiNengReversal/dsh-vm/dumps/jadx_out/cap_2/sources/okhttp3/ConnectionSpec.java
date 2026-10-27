package okhttp3;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nConnectionSpec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConnectionSpec.kt\nokhttp3/ConnectionSpec\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,384:1\n11561#2:385\n11896#2,3:386\n11561#2:389\n11896#2,3:390\n37#3,2:393\n37#3,2:395\n37#3,2:397\n*S KotlinDebug\n*F\n+ 1 ConnectionSpec.kt\nokhttp3/ConnectionSpec\n*L\n60#1:385\n60#1:386,3\n78#1:389\n78#1:390,3\n349#1:393,2\n361#1:395,2\n374#1:397,2\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class ConnectionSpec {

    @org.jetbrains.annotations.NotNull
    private static final java.util.List<okhttp3.CipherSuite> APPROVED_CIPHER_SUITES = null;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final okhttp3.ConnectionSpec CLEARTEXT = null;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final okhttp3.ConnectionSpec COMPATIBLE_TLS = null;

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.ConnectionSpec.Companion Companion = null;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final okhttp3.ConnectionSpec MODERN_TLS = null;

    @org.jetbrains.annotations.NotNull
    private static final java.util.List<okhttp3.CipherSuite> RESTRICTED_CIPHER_SUITES = null;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final okhttp3.ConnectionSpec RESTRICTED_TLS = null;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String[] cipherSuitesAsString;
    private final boolean isTls;
    private final boolean supportsTlsExtensions;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String[] tlsVersionsAsString;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nConnectionSpec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConnectionSpec.kt\nokhttp3/ConnectionSpec$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,384:1\n1#2:385\n11561#3:386\n11896#3,3:387\n11561#3:392\n11896#3,3:393\n37#4,2:390\n37#4,2:396\n*S KotlinDebug\n*F\n+ 1 ConnectionSpec.kt\nokhttp3/ConnectionSpec$Builder\n*L\n247#1:386\n247#1:387,3\n269#1:392\n269#1:393,3\n247#1:390,2\n269#1:396,2\n*E\n"})
    public static final class Builder {

        @org.jetbrains.annotations.Nullable
        private java.lang.String[] cipherSuites;
        private boolean supportsTlsExtensions;
        private boolean tls;

        @org.jetbrains.annotations.Nullable
        private java.lang.String[] tlsVersions;

        public Builder(@org.jetbrains.annotations.NotNull okhttp3.ConnectionSpec r2) {
                r1 = this;
                java.lang.String r0 = "connectionSpec"
                kotlin.jvm.internal.g0.p(r2, r0)
                r1.<init>()
                boolean r0 = r2.isTls()
                r1.tls = r0
                java.lang.String[] r0 = r2.getCipherSuitesAsString$okhttp()
                r1.cipherSuites = r0
                java.lang.String[] r0 = okhttp3.ConnectionSpec.access$getTlsVersionsAsString$p(r2)
                r1.tlsVersions = r0
                boolean r2 = r2.supportsTlsExtensions()
                r1.supportsTlsExtensions = r2
                return
        }

        public Builder(boolean r1) {
                r0 = this;
                r0.<init>()
                r0.tls = r1
                return
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.ConnectionSpec.Builder allEnabledCipherSuites() {
                r2 = this;
                boolean r0 = r2.tls
                if (r0 == 0) goto L8
                r0 = 0
                r2.cipherSuites = r0
                return r2
            L8:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "no cipher suites for cleartext connections"
                r0.<init>(r1)
                throw r0
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.ConnectionSpec.Builder allEnabledTlsVersions() {
                r2 = this;
                boolean r0 = r2.tls
                if (r0 == 0) goto L8
                r0 = 0
                r2.tlsVersions = r0
                return r2
            L8:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "no TLS versions for cleartext connections"
                r0.<init>(r1)
                throw r0
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.ConnectionSpec build() {
                r5 = this;
                okhttp3.ConnectionSpec r0 = new okhttp3.ConnectionSpec
                boolean r1 = r5.tls
                boolean r2 = r5.supportsTlsExtensions
                java.lang.String[] r3 = r5.cipherSuites
                java.lang.String[] r4 = r5.tlsVersions
                r0.<init>(r1, r2, r3, r4)
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.ConnectionSpec.Builder cipherSuites(@org.jetbrains.annotations.NotNull java.lang.String... r2) {
                r1 = this;
                java.lang.String r0 = "cipherSuites"
                kotlin.jvm.internal.g0.p(r2, r0)
                boolean r0 = r1.tls
                if (r0 == 0) goto L28
                int r0 = r2.length
                if (r0 != 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                if (r0 != 0) goto L20
                int r0 = r2.length
                java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r0)
                java.lang.String r0 = "copyOf(...)"
                kotlin.jvm.internal.g0.o(r2, r0)
                java.lang.String[] r2 = (java.lang.String[]) r2
                r1.cipherSuites = r2
                return r1
            L20:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "At least one cipher suite is required"
                r2.<init>(r0)
                throw r2
            L28:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "no cipher suites for cleartext connections"
                r2.<init>(r0)
                throw r2
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.ConnectionSpec.Builder cipherSuites(@org.jetbrains.annotations.NotNull okhttp3.CipherSuite... r6) {
                r5 = this;
                java.lang.String r0 = "cipherSuites"
                kotlin.jvm.internal.g0.p(r6, r0)
                boolean r0 = r5.tls
                if (r0 == 0) goto L34
                java.util.ArrayList r0 = new java.util.ArrayList
                int r1 = r6.length
                r0.<init>(r1)
                int r1 = r6.length
                r2 = 0
                r3 = 0
            L12:
                if (r3 >= r1) goto L20
                r4 = r6[r3]
                java.lang.String r4 = r4.javaName()
                r0.add(r4)
                int r3 = r3 + 1
                goto L12
            L20:
                java.lang.String[] r6 = new java.lang.String[r2]
                java.lang.Object[] r6 = r0.toArray(r6)
                java.lang.String[] r6 = (java.lang.String[]) r6
                int r0 = r6.length
                java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r0)
                java.lang.String[] r6 = (java.lang.String[]) r6
                okhttp3.ConnectionSpec$Builder r6 = r5.cipherSuites(r6)
                return r6
            L34:
                java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "no cipher suites for cleartext connections"
                r6.<init>(r0)
                throw r6
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.String[] getCipherSuites$okhttp() {
                r1 = this;
                java.lang.String[] r0 = r1.cipherSuites
                return r0
        }

        public final boolean getSupportsTlsExtensions$okhttp() {
                r1 = this;
                boolean r0 = r1.supportsTlsExtensions
                return r0
        }

        public final boolean getTls$okhttp() {
                r1 = this;
                boolean r0 = r1.tls
                return r0
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.String[] getTlsVersions$okhttp() {
                r1 = this;
                java.lang.String[] r0 = r1.tlsVersions
                return r0
        }

        public final void setCipherSuites$okhttp(@org.jetbrains.annotations.Nullable java.lang.String[] r1) {
                r0 = this;
                r0.cipherSuites = r1
                return
        }

        public final void setSupportsTlsExtensions$okhttp(boolean r1) {
                r0 = this;
                r0.supportsTlsExtensions = r1
                return
        }

        public final void setTls$okhttp(boolean r1) {
                r0 = this;
                r0.tls = r1
                return
        }

        public final void setTlsVersions$okhttp(@org.jetbrains.annotations.Nullable java.lang.String[] r1) {
                r0 = this;
                r0.tlsVersions = r1
                return
        }

        @kotlin.Deprecated(message = "since OkHttp 3.13 all TLS-connections are expected to support TLS extensions.\nIn a future release setting this to true will be unnecessary and setting it to false\nwill have no effect.")
        @org.jetbrains.annotations.NotNull
        public final okhttp3.ConnectionSpec.Builder supportsTlsExtensions(boolean r2) {
                r1 = this;
                boolean r0 = r1.tls
                if (r0 == 0) goto L7
                r1.supportsTlsExtensions = r2
                return r1
            L7:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "no TLS extensions for cleartext connections"
                r2.<init>(r0)
                throw r2
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.ConnectionSpec.Builder tlsVersions(@org.jetbrains.annotations.NotNull java.lang.String... r2) {
                r1 = this;
                java.lang.String r0 = "tlsVersions"
                kotlin.jvm.internal.g0.p(r2, r0)
                boolean r0 = r1.tls
                if (r0 == 0) goto L28
                int r0 = r2.length
                if (r0 != 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                if (r0 != 0) goto L20
                int r0 = r2.length
                java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r0)
                java.lang.String r0 = "copyOf(...)"
                kotlin.jvm.internal.g0.o(r2, r0)
                java.lang.String[] r2 = (java.lang.String[]) r2
                r1.tlsVersions = r2
                return r1
            L20:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "At least one TLS version is required"
                r2.<init>(r0)
                throw r2
            L28:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "no TLS versions for cleartext connections"
                r2.<init>(r0)
                throw r2
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.ConnectionSpec.Builder tlsVersions(@org.jetbrains.annotations.NotNull okhttp3.TlsVersion... r6) {
                r5 = this;
                java.lang.String r0 = "tlsVersions"
                kotlin.jvm.internal.g0.p(r6, r0)
                boolean r0 = r5.tls
                if (r0 == 0) goto L34
                java.util.ArrayList r0 = new java.util.ArrayList
                int r1 = r6.length
                r0.<init>(r1)
                int r1 = r6.length
                r2 = 0
                r3 = 0
            L12:
                if (r3 >= r1) goto L20
                r4 = r6[r3]
                java.lang.String r4 = r4.javaName()
                r0.add(r4)
                int r3 = r3 + 1
                goto L12
            L20:
                java.lang.String[] r6 = new java.lang.String[r2]
                java.lang.Object[] r6 = r0.toArray(r6)
                java.lang.String[] r6 = (java.lang.String[]) r6
                int r0 = r6.length
                java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r0)
                java.lang.String[] r6 = (java.lang.String[]) r6
                okhttp3.ConnectionSpec$Builder r6 = r5.tlsVersions(r6)
                return r6
            L34:
                java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "no TLS versions for cleartext connections"
                r6.<init>(r0)
                throw r6
        }
    }

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
            okhttp3.ConnectionSpec$Companion r0 = new okhttp3.ConnectionSpec$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.ConnectionSpec.Companion = r0
            okhttp3.CipherSuite r0 = okhttp3.CipherSuite.TLS_AES_128_GCM_SHA256
            okhttp3.CipherSuite r1 = okhttp3.CipherSuite.TLS_AES_256_GCM_SHA384
            okhttp3.CipherSuite r2 = okhttp3.CipherSuite.TLS_CHACHA20_POLY1305_SHA256
            okhttp3.CipherSuite r3 = okhttp3.CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256
            okhttp3.CipherSuite r4 = okhttp3.CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256
            okhttp3.CipherSuite r5 = okhttp3.CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384
            okhttp3.CipherSuite r6 = okhttp3.CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384
            okhttp3.CipherSuite r7 = okhttp3.CipherSuite.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256
            okhttp3.CipherSuite r8 = okhttp3.CipherSuite.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256
            r9 = 9
            okhttp3.CipherSuite[] r10 = new okhttp3.CipherSuite[r9]
            r11 = 0
            r10[r11] = r0
            r12 = 1
            r10[r12] = r1
            r13 = 2
            r10[r13] = r2
            r14 = 3
            r10[r14] = r3
            r15 = 4
            r10[r15] = r4
            r16 = 5
            r10[r16] = r5
            r17 = 6
            r10[r17] = r6
            r18 = 7
            r10[r18] = r7
            r19 = 8
            r10[r19] = r8
            java.util.List r10 = kotlin.collections.f0.Q(r10)
            okhttp3.ConnectionSpec.RESTRICTED_CIPHER_SUITES = r10
            r20 = 9
            r9 = 16
            okhttp3.CipherSuite[] r9 = new okhttp3.CipherSuite[r9]
            r9[r11] = r0
            r9[r12] = r1
            r9[r13] = r2
            r9[r14] = r3
            r9[r15] = r4
            r9[r16] = r5
            r9[r17] = r6
            r9[r18] = r7
            r9[r19] = r8
            okhttp3.CipherSuite r0 = okhttp3.CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA
            r9[r20] = r0
            okhttp3.CipherSuite r0 = okhttp3.CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA
            r1 = 10
            r9[r1] = r0
            okhttp3.CipherSuite r0 = okhttp3.CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256
            r1 = 11
            r9[r1] = r0
            okhttp3.CipherSuite r0 = okhttp3.CipherSuite.TLS_RSA_WITH_AES_256_GCM_SHA384
            r1 = 12
            r9[r1] = r0
            okhttp3.CipherSuite r0 = okhttp3.CipherSuite.TLS_RSA_WITH_AES_128_CBC_SHA
            r1 = 13
            r9[r1] = r0
            okhttp3.CipherSuite r0 = okhttp3.CipherSuite.TLS_RSA_WITH_AES_256_CBC_SHA
            r1 = 14
            r9[r1] = r0
            okhttp3.CipherSuite r0 = okhttp3.CipherSuite.TLS_RSA_WITH_3DES_EDE_CBC_SHA
            r1 = 15
            r9[r1] = r0
            java.util.List r0 = kotlin.collections.f0.Q(r9)
            okhttp3.ConnectionSpec.APPROVED_CIPHER_SUITES = r0
            okhttp3.ConnectionSpec$Builder r1 = new okhttp3.ConnectionSpec$Builder
            r1.<init>(r12)
            java.util.Collection r10 = (java.util.Collection) r10
            okhttp3.CipherSuite[] r2 = new okhttp3.CipherSuite[r11]
            java.lang.Object[] r2 = r10.toArray(r2)
            okhttp3.CipherSuite[] r2 = (okhttp3.CipherSuite[]) r2
            int r3 = r2.length
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r3)
            okhttp3.CipherSuite[] r2 = (okhttp3.CipherSuite[]) r2
            okhttp3.ConnectionSpec$Builder r1 = r1.cipherSuites(r2)
            okhttp3.TlsVersion r2 = okhttp3.TlsVersion.TLS_1_3
            okhttp3.TlsVersion r3 = okhttp3.TlsVersion.TLS_1_2
            okhttp3.TlsVersion[] r4 = new okhttp3.TlsVersion[r13]
            r4[r11] = r2
            r4[r12] = r3
            okhttp3.ConnectionSpec$Builder r1 = r1.tlsVersions(r4)
            okhttp3.ConnectionSpec$Builder r1 = r1.supportsTlsExtensions(r12)
            okhttp3.ConnectionSpec r1 = r1.build()
            okhttp3.ConnectionSpec.RESTRICTED_TLS = r1
            okhttp3.ConnectionSpec$Builder r1 = new okhttp3.ConnectionSpec$Builder
            r1.<init>(r12)
            r4 = r0
            java.util.Collection r4 = (java.util.Collection) r4
            okhttp3.CipherSuite[] r5 = new okhttp3.CipherSuite[r11]
            java.lang.Object[] r4 = r4.toArray(r5)
            okhttp3.CipherSuite[] r4 = (okhttp3.CipherSuite[]) r4
            int r5 = r4.length
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r5)
            okhttp3.CipherSuite[] r4 = (okhttp3.CipherSuite[]) r4
            okhttp3.ConnectionSpec$Builder r1 = r1.cipherSuites(r4)
            okhttp3.TlsVersion[] r4 = new okhttp3.TlsVersion[r13]
            r4[r11] = r2
            r4[r12] = r3
            okhttp3.ConnectionSpec$Builder r1 = r1.tlsVersions(r4)
            okhttp3.ConnectionSpec$Builder r1 = r1.supportsTlsExtensions(r12)
            okhttp3.ConnectionSpec r1 = r1.build()
            okhttp3.ConnectionSpec.MODERN_TLS = r1
            okhttp3.ConnectionSpec$Builder r1 = new okhttp3.ConnectionSpec$Builder
            r1.<init>(r12)
            java.util.Collection r0 = (java.util.Collection) r0
            okhttp3.CipherSuite[] r4 = new okhttp3.CipherSuite[r11]
            java.lang.Object[] r0 = r0.toArray(r4)
            okhttp3.CipherSuite[] r0 = (okhttp3.CipherSuite[]) r0
            int r4 = r0.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r4)
            okhttp3.CipherSuite[] r0 = (okhttp3.CipherSuite[]) r0
            okhttp3.ConnectionSpec$Builder r0 = r1.cipherSuites(r0)
            okhttp3.TlsVersion[] r1 = new okhttp3.TlsVersion[r15]
            r1[r11] = r2
            r1[r12] = r3
            okhttp3.TlsVersion r2 = okhttp3.TlsVersion.TLS_1_1
            r1[r13] = r2
            okhttp3.TlsVersion r2 = okhttp3.TlsVersion.TLS_1_0
            r1[r14] = r2
            okhttp3.ConnectionSpec$Builder r0 = r0.tlsVersions(r1)
            okhttp3.ConnectionSpec$Builder r0 = r0.supportsTlsExtensions(r12)
            okhttp3.ConnectionSpec r0 = r0.build()
            okhttp3.ConnectionSpec.COMPATIBLE_TLS = r0
            okhttp3.ConnectionSpec$Builder r0 = new okhttp3.ConnectionSpec$Builder
            r0.<init>(r11)
            okhttp3.ConnectionSpec r0 = r0.build()
            okhttp3.ConnectionSpec.CLEARTEXT = r0
            return
    }

    public ConnectionSpec(boolean r1, boolean r2, @org.jetbrains.annotations.Nullable java.lang.String[] r3, @org.jetbrains.annotations.Nullable java.lang.String[] r4) {
            r0 = this;
            r0.<init>()
            r0.isTls = r1
            r0.supportsTlsExtensions = r2
            r0.cipherSuitesAsString = r3
            r0.tlsVersionsAsString = r4
            return
    }

    public static final /* synthetic */ java.lang.String[] access$getTlsVersionsAsString$p(okhttp3.ConnectionSpec r0) {
            java.lang.String[] r0 = r0.tlsVersionsAsString
            return r0
    }

    private final okhttp3.ConnectionSpec supportedSpec(javax.net.ssl.SSLSocket r5, boolean r6) {
            r4 = this;
            java.lang.String[] r0 = r5.getEnabledCipherSuites()
            kotlin.jvm.internal.g0.m(r0)
            java.lang.String[] r0 = okhttp3.internal.Internal.effectiveCipherSuites(r4, r0)
            java.lang.String[] r1 = r4.tlsVersionsAsString
            if (r1 == 0) goto L23
            java.lang.String[] r1 = r5.getEnabledProtocols()
            java.lang.String r2 = "getEnabledProtocols(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            java.lang.String[] r2 = r4.tlsVersionsAsString
            java.util.Comparator r3 = kotlin.comparisons.a.q()
            java.lang.String[] r1 = okhttp3.internal._UtilCommonKt.intersect(r1, r2, r3)
            goto L27
        L23:
            java.lang.String[] r1 = r5.getEnabledProtocols()
        L27:
            java.lang.String[] r5 = r5.getSupportedCipherSuites()
            kotlin.jvm.internal.g0.m(r5)
            okhttp3.CipherSuite$Companion r2 = okhttp3.CipherSuite.Companion
            java.util.Comparator r2 = r2.getORDER_BY_NAME$okhttp()
            java.lang.String r3 = "TLS_FALLBACK_SCSV"
            int r2 = okhttp3.internal._UtilCommonKt.indexOf(r5, r3, r2)
            if (r6 == 0) goto L4a
            r6 = -1
            if (r2 == r6) goto L4a
            r5 = r5[r2]
            java.lang.String r6 = "get(...)"
            kotlin.jvm.internal.g0.o(r5, r6)
            java.lang.String[] r0 = okhttp3.internal._UtilCommonKt.concat(r0, r5)
        L4a:
            okhttp3.ConnectionSpec$Builder r5 = new okhttp3.ConnectionSpec$Builder
            r5.<init>(r4)
            int r6 = r0.length
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r0, r6)
            java.lang.String[] r6 = (java.lang.String[]) r6
            okhttp3.ConnectionSpec$Builder r5 = r5.cipherSuites(r6)
            int r6 = r1.length
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r1, r6)
            java.lang.String[] r6 = (java.lang.String[]) r6
            okhttp3.ConnectionSpec$Builder r5 = r5.tlsVersions(r6)
            okhttp3.ConnectionSpec r5 = r5.build()
            return r5
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "cipherSuites", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_cipherSuites")
    @org.jetbrains.annotations.Nullable
    /* renamed from: -deprecated_cipherSuites, reason: not valid java name */
    public final java.util.List<okhttp3.CipherSuite> m70deprecated_cipherSuites() {
            r1 = this;
            java.util.List r0 = r1.cipherSuites()
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "supportsTlsExtensions", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_supportsTlsExtensions")
    /* renamed from: -deprecated_supportsTlsExtensions, reason: not valid java name */
    public final boolean m71deprecated_supportsTlsExtensions() {
            r1 = this;
            boolean r0 = r1.supportsTlsExtensions
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "tlsVersions", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_tlsVersions")
    @org.jetbrains.annotations.Nullable
    /* renamed from: -deprecated_tlsVersions, reason: not valid java name */
    public final java.util.List<okhttp3.TlsVersion> m72deprecated_tlsVersions() {
            r1 = this;
            java.util.List r0 = r1.tlsVersions()
            return r0
    }

    public final void apply$okhttp(@org.jetbrains.annotations.NotNull javax.net.ssl.SSLSocket r2, boolean r3) {
            r1 = this;
            java.lang.String r0 = "sslSocket"
            kotlin.jvm.internal.g0.p(r2, r0)
            okhttp3.ConnectionSpec r3 = r1.supportedSpec(r2, r3)
            java.util.List r0 = r3.tlsVersions()
            if (r0 == 0) goto L14
            java.lang.String[] r0 = r3.tlsVersionsAsString
            r2.setEnabledProtocols(r0)
        L14:
            java.util.List r0 = r3.cipherSuites()
            if (r0 == 0) goto L1f
            java.lang.String[] r3 = r3.cipherSuitesAsString
            r2.setEnabledCipherSuites(r3)
        L1f:
            return
    }

    @kotlin.jvm.JvmName(name = "cipherSuites")
    @org.jetbrains.annotations.Nullable
    public final java.util.List<okhttp3.CipherSuite> cipherSuites() {
            r6 = this;
            java.lang.String[] r0 = r6.cipherSuitesAsString
            if (r0 == 0) goto L1d
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.length
            r1.<init>(r2)
            int r2 = r0.length
            r3 = 0
        Lc:
            if (r3 >= r2) goto L1c
            r4 = r0[r3]
            okhttp3.CipherSuite$Companion r5 = okhttp3.CipherSuite.Companion
            okhttp3.CipherSuite r4 = r5.forJavaName(r4)
            r1.add(r4)
            int r3 = r3 + 1
            goto Lc
        L1c:
            return r1
        L1d:
            r0 = 0
            return r0
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r5) {
            r4 = this;
            boolean r0 = r5 instanceof okhttp3.ConnectionSpec
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            r0 = 1
            if (r5 != r4) goto La
            return r0
        La:
            boolean r2 = r4.isTls
            okhttp3.ConnectionSpec r5 = (okhttp3.ConnectionSpec) r5
            boolean r3 = r5.isTls
            if (r2 == r3) goto L13
            return r1
        L13:
            if (r2 == 0) goto L32
            java.lang.String[] r2 = r4.cipherSuitesAsString
            java.lang.String[] r3 = r5.cipherSuitesAsString
            boolean r2 = java.util.Arrays.equals(r2, r3)
            if (r2 != 0) goto L20
            return r1
        L20:
            java.lang.String[] r2 = r4.tlsVersionsAsString
            java.lang.String[] r3 = r5.tlsVersionsAsString
            boolean r2 = java.util.Arrays.equals(r2, r3)
            if (r2 != 0) goto L2b
            return r1
        L2b:
            boolean r2 = r4.supportsTlsExtensions
            boolean r5 = r5.supportsTlsExtensions
            if (r2 == r5) goto L32
            return r1
        L32:
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String[] getCipherSuitesAsString$okhttp() {
            r1 = this;
            java.lang.String[] r0 = r1.cipherSuitesAsString
            return r0
    }

    public int hashCode() {
            r3 = this;
            boolean r0 = r3.isTls
            if (r0 == 0) goto L25
            java.lang.String[] r0 = r3.cipherSuitesAsString
            r1 = 0
            if (r0 == 0) goto Le
            int r0 = java.util.Arrays.hashCode(r0)
            goto Lf
        Le:
            r0 = 0
        Lf:
            r2 = 527(0x20f, float:7.38E-43)
            int r2 = r2 + r0
            int r2 = r2 * 31
            java.lang.String[] r0 = r3.tlsVersionsAsString
            if (r0 == 0) goto L1c
            int r1 = java.util.Arrays.hashCode(r0)
        L1c:
            int r2 = r2 + r1
            int r2 = r2 * 31
            boolean r0 = r3.supportsTlsExtensions
            r0 = r0 ^ 1
            int r2 = r2 + r0
            return r2
        L25:
            r0 = 17
            return r0
    }

    public final boolean isCompatible(@org.jetbrains.annotations.NotNull javax.net.ssl.SSLSocket r5) {
            r4 = this;
            java.lang.String r0 = "socket"
            kotlin.jvm.internal.g0.p(r5, r0)
            boolean r0 = r4.isTls
            r1 = 0
            if (r0 != 0) goto Lb
            return r1
        Lb:
            java.lang.String[] r0 = r4.tlsVersionsAsString
            if (r0 == 0) goto L1e
            java.lang.String[] r2 = r5.getEnabledProtocols()
            java.util.Comparator r3 = kotlin.comparisons.a.q()
            boolean r0 = okhttp3.internal._UtilCommonKt.hasIntersection(r0, r2, r3)
            if (r0 != 0) goto L1e
            return r1
        L1e:
            java.lang.String[] r0 = r4.cipherSuitesAsString
            if (r0 == 0) goto L33
            java.lang.String[] r5 = r5.getEnabledCipherSuites()
            okhttp3.CipherSuite$Companion r2 = okhttp3.CipherSuite.Companion
            java.util.Comparator r2 = r2.getORDER_BY_NAME$okhttp()
            boolean r5 = okhttp3.internal._UtilCommonKt.hasIntersection(r0, r5, r2)
            if (r5 != 0) goto L33
            return r1
        L33:
            r5 = 1
            return r5
    }

    @kotlin.jvm.JvmName(name = "isTls")
    public final boolean isTls() {
            r1 = this;
            boolean r0 = r1.isTls
            return r0
    }

    @kotlin.jvm.JvmName(name = "supportsTlsExtensions")
    public final boolean supportsTlsExtensions() {
            r1 = this;
            boolean r0 = r1.supportsTlsExtensions
            return r0
    }

    @kotlin.jvm.JvmName(name = "tlsVersions")
    @org.jetbrains.annotations.Nullable
    public final java.util.List<okhttp3.TlsVersion> tlsVersions() {
            r6 = this;
            java.lang.String[] r0 = r6.tlsVersionsAsString
            if (r0 == 0) goto L1d
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.length
            r1.<init>(r2)
            int r2 = r0.length
            r3 = 0
        Lc:
            if (r3 >= r2) goto L1c
            r4 = r0[r3]
            okhttp3.TlsVersion$Companion r5 = okhttp3.TlsVersion.Companion
            okhttp3.TlsVersion r4 = r5.forJavaName(r4)
            r1.add(r4)
            int r3 = r3 + 1
            goto Lc
        L1c:
            return r1
        L1d:
            r0 = 0
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r3 = this;
            boolean r0 = r3.isTls
            if (r0 != 0) goto L7
            java.lang.String r0 = "ConnectionSpec()"
            return r0
        L7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "ConnectionSpec(cipherSuites="
            r0.append(r1)
            java.util.List r1 = r3.cipherSuites()
            java.lang.String r2 = "[all enabled]"
            java.lang.String r1 = java.util.Objects.toString(r1, r2)
            r0.append(r1)
            java.lang.String r1 = ", tlsVersions="
            r0.append(r1)
            java.util.List r1 = r3.tlsVersions()
            java.lang.String r1 = java.util.Objects.toString(r1, r2)
            r0.append(r1)
            java.lang.String r1 = ", supportsTlsExtensions="
            r0.append(r1)
            boolean r1 = r3.supportsTlsExtensions
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
