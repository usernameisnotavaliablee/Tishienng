package okhttp3.internal.tls;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nOkHostnameVerifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OkHostnameVerifier.kt\nokhttp3/internal/tls/OkHostnameVerifier\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,224:1\n1761#2,3:225\n1761#2,3:228\n*S KotlinDebug\n*F\n+ 1 OkHostnameVerifier.kt\nokhttp3/internal/tls/OkHostnameVerifier\n*L\n69#1:225,3\n80#1:228,3\n*E\n"})
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class OkHostnameVerifier implements javax.net.ssl.HostnameVerifier {
    private static final int ALT_DNS_NAME = 2;
    private static final int ALT_IPA_NAME = 7;

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.internal.tls.OkHostnameVerifier INSTANCE = null;

    static {
            okhttp3.internal.tls.OkHostnameVerifier r0 = new okhttp3.internal.tls.OkHostnameVerifier
            r0.<init>()
            okhttp3.internal.tls.OkHostnameVerifier.INSTANCE = r0
            return
    }

    private OkHostnameVerifier() {
            r0 = this;
            r0.<init>()
            return
    }

    private final java.lang.String asciiToLowercase(java.lang.String r3) {
            r2 = this;
            boolean r0 = r2.isAscii(r3)
            if (r0 == 0) goto L16
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r1 = "US"
            kotlin.jvm.internal.g0.o(r0, r1)
            java.lang.String r3 = r3.toLowerCase(r0)
            java.lang.String r0 = "toLowerCase(...)"
            kotlin.jvm.internal.g0.o(r3, r0)
        L16:
            return r3
    }

    private final java.util.List<java.lang.String> getSubjectAltNames(java.security.cert.X509Certificate r5, int r6) {
            r4 = this;
            java.util.Collection r5 = r5.getSubjectAlternativeNames()     // Catch: java.security.cert.CertificateParsingException -> L48
            if (r5 != 0) goto Lb
            java.util.List r5 = kotlin.collections.f0.J()     // Catch: java.security.cert.CertificateParsingException -> L48
            return r5
        Lb:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.security.cert.CertificateParsingException -> L48
            r0.<init>()     // Catch: java.security.cert.CertificateParsingException -> L48
            java.util.Iterator r5 = r5.iterator()     // Catch: java.security.cert.CertificateParsingException -> L48
        L14:
            boolean r1 = r5.hasNext()     // Catch: java.security.cert.CertificateParsingException -> L48
            if (r1 == 0) goto L47
            java.lang.Object r1 = r5.next()     // Catch: java.security.cert.CertificateParsingException -> L48
            java.util.List r1 = (java.util.List) r1     // Catch: java.security.cert.CertificateParsingException -> L48
            if (r1 == 0) goto L14
            int r2 = r1.size()     // Catch: java.security.cert.CertificateParsingException -> L48
            r3 = 2
            if (r2 >= r3) goto L2a
            goto L14
        L2a:
            r2 = 0
            java.lang.Object r2 = r1.get(r2)     // Catch: java.security.cert.CertificateParsingException -> L48
            java.lang.Integer r3 = java.lang.Integer.valueOf(r6)     // Catch: java.security.cert.CertificateParsingException -> L48
            boolean r2 = kotlin.jvm.internal.g0.g(r2, r3)     // Catch: java.security.cert.CertificateParsingException -> L48
            if (r2 == 0) goto L14
            r2 = 1
            java.lang.Object r1 = r1.get(r2)     // Catch: java.security.cert.CertificateParsingException -> L48
            if (r1 != 0) goto L41
            goto L14
        L41:
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.security.cert.CertificateParsingException -> L48
            r0.add(r1)     // Catch: java.security.cert.CertificateParsingException -> L48
            goto L14
        L47:
            return r0
        L48:
            java.util.List r5 = kotlin.collections.f0.J()
            return r5
    }

    private final boolean isAscii(java.lang.String r5) {
            r4 = this;
            int r0 = r5.length()
            r1 = 3
            r2 = 0
            r3 = 0
            long r1 = okio.Utf8.size$default(r5, r3, r3, r1, r2)
            int r5 = (int) r1
            if (r0 != r5) goto L10
            r5 = 1
            return r5
        L10:
            return r3
    }

    private final boolean verifyHostname(java.lang.String r14, java.lang.String r15) {
            r13 = this;
            r0 = 0
            if (r14 == 0) goto Lc8
            int r1 = r14.length()
            if (r1 != 0) goto Lb
            goto Lc8
        Lb:
            java.lang.String r1 = "."
            r2 = 2
            r3 = 0
            boolean r4 = kotlin.text.u.H2(r14, r1, r0, r2, r3)
            if (r4 != 0) goto Lc8
            java.lang.String r4 = ".."
            boolean r5 = kotlin.text.u.Z1(r14, r4, r0, r2, r3)
            if (r5 == 0) goto L1f
            goto Lc8
        L1f:
            if (r15 == 0) goto Lc8
            int r5 = r15.length()
            if (r5 != 0) goto L29
            goto Lc8
        L29:
            boolean r5 = kotlin.text.u.H2(r15, r1, r0, r2, r3)
            if (r5 != 0) goto Lc8
            boolean r4 = kotlin.text.u.Z1(r15, r4, r0, r2, r3)
            if (r4 == 0) goto L37
            goto Lc8
        L37:
            boolean r4 = kotlin.text.u.Z1(r14, r1, r0, r2, r3)
            r5 = 46
            if (r4 != 0) goto L4e
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r14)
            r4.append(r5)
            java.lang.String r14 = r4.toString()
        L4e:
            r6 = r14
            boolean r14 = kotlin.text.u.Z1(r15, r1, r0, r2, r3)
            if (r14 != 0) goto L64
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r14.append(r15)
            r14.append(r5)
            java.lang.String r15 = r14.toString()
        L64:
            java.lang.String r7 = r13.asciiToLowercase(r15)
            java.lang.String r14 = "*"
            boolean r14 = kotlin.text.u.l3(r7, r14, r0, r2, r3)
            if (r14 != 0) goto L75
            boolean r14 = kotlin.jvm.internal.g0.g(r6, r7)
            return r14
        L75:
            java.lang.String r14 = "*."
            boolean r15 = kotlin.text.u.H2(r7, r14, r0, r2, r3)
            if (r15 == 0) goto Lc8
            r11 = 4
            r12 = 0
            r8 = 42
            r9 = 1
            r10 = 0
            int r15 = kotlin.text.u.G3(r7, r8, r9, r10, r11, r12)
            r1 = -1
            if (r15 == r1) goto L8b
            goto Lc8
        L8b:
            int r15 = r6.length()
            int r4 = r7.length()
            if (r15 >= r4) goto L96
            return r0
        L96:
            boolean r14 = kotlin.jvm.internal.g0.g(r14, r7)
            if (r14 == 0) goto L9d
            return r0
        L9d:
            r14 = 1
            java.lang.String r15 = r7.substring(r14)
            java.lang.String r4 = "substring(...)"
            kotlin.jvm.internal.g0.o(r15, r4)
            boolean r2 = kotlin.text.u.Z1(r6, r15, r0, r2, r3)
            if (r2 != 0) goto Lae
            return r0
        Lae:
            int r2 = r6.length()
            int r15 = r15.length()
            int r2 = r2 - r15
            if (r2 <= 0) goto Lc7
            int r8 = r2 + (-1)
            r10 = 4
            r11 = 0
            r7 = 46
            r9 = 0
            int r15 = kotlin.text.u.V3(r6, r7, r8, r9, r10, r11)
            if (r15 == r1) goto Lc7
            return r0
        Lc7:
            return r14
        Lc8:
            return r0
    }

    private final boolean verifyHostname(java.lang.String r4, java.security.cert.X509Certificate r5) {
            r3 = this;
            java.lang.String r4 = r3.asciiToLowercase(r4)
            r0 = 2
            java.util.List r5 = r3.getSubjectAltNames(r5, r0)
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            boolean r0 = r5 instanceof java.util.Collection
            r1 = 0
            if (r0 == 0) goto L1a
            r0 = r5
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L1a
            return r1
        L1a:
            java.util.Iterator r5 = r5.iterator()
        L1e:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L34
            java.lang.Object r0 = r5.next()
            java.lang.String r0 = (java.lang.String) r0
            okhttp3.internal.tls.OkHostnameVerifier r2 = okhttp3.internal.tls.OkHostnameVerifier.INSTANCE
            boolean r0 = r2.verifyHostname(r4, r0)
            if (r0 == 0) goto L1e
            r4 = 1
            return r4
        L34:
            return r1
    }

    private final boolean verifyIpAddress(java.lang.String r3, java.security.cert.X509Certificate r4) {
            r2 = this;
            java.lang.String r3 = okhttp3.internal._HostnamesCommonKt.toCanonicalHost(r3)
            r0 = 7
            java.util.List r4 = r2.getSubjectAltNames(r4, r0)
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            boolean r0 = r4 instanceof java.util.Collection
            r1 = 0
            if (r0 == 0) goto L1a
            r0 = r4
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L1a
            return r1
        L1a:
            java.util.Iterator r4 = r4.iterator()
        L1e:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L36
            java.lang.Object r0 = r4.next()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = okhttp3.internal._HostnamesCommonKt.toCanonicalHost(r0)
            boolean r0 = kotlin.jvm.internal.g0.g(r3, r0)
            if (r0 == 0) goto L1e
            r3 = 1
            return r3
        L36:
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.String> allSubjectAltNames(@org.jetbrains.annotations.NotNull java.security.cert.X509Certificate r3) {
            r2 = this;
            java.lang.String r0 = "certificate"
            kotlin.jvm.internal.g0.p(r3, r0)
            r0 = 7
            java.util.List r0 = r2.getSubjectAltNames(r3, r0)
            r1 = 2
            java.util.List r3 = r2.getSubjectAltNames(r3, r1)
            java.util.Collection r0 = (java.util.Collection) r0
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.List r3 = kotlin.collections.f0.I4(r0, r3)
            return r3
    }

    public final boolean verify(@org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull java.security.cert.X509Certificate r3) {
            r1 = this;
            java.lang.String r0 = "host"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "certificate"
            kotlin.jvm.internal.g0.p(r3, r0)
            boolean r0 = okhttp3.internal._HostnamesCommonKt.canParseAsIpAddress(r2)
            if (r0 == 0) goto L15
            boolean r2 = r1.verifyIpAddress(r2, r3)
            return r2
        L15:
            boolean r2 = r1.verifyHostname(r2, r3)
            return r2
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(@org.jetbrains.annotations.NotNull java.lang.String r3, @org.jetbrains.annotations.NotNull javax.net.ssl.SSLSession r4) {
            r2 = this;
            java.lang.String r0 = "host"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "session"
            kotlin.jvm.internal.g0.p(r4, r0)
            boolean r0 = r2.isAscii(r3)
            r1 = 0
            if (r0 != 0) goto L12
            return r1
        L12:
            java.security.cert.Certificate[] r4 = r4.getPeerCertificates()     // Catch: javax.net.ssl.SSLException -> L23
            r4 = r4[r1]     // Catch: javax.net.ssl.SSLException -> L23
            java.lang.String r0 = "null cannot be cast to non-null type java.security.cert.X509Certificate"
            kotlin.jvm.internal.g0.n(r4, r0)     // Catch: javax.net.ssl.SSLException -> L23
            java.security.cert.X509Certificate r4 = (java.security.cert.X509Certificate) r4     // Catch: javax.net.ssl.SSLException -> L23
            boolean r1 = r2.verify(r3, r4)     // Catch: javax.net.ssl.SSLException -> L23
        L23:
            return r1
    }
}
