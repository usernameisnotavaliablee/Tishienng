package okhttp3.internal.tls;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nBasicTrustRootIndex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicTrustRootIndex.kt\nokhttp3/internal/tls/BasicTrustRootIndex\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,55:1\n382#2,7:56\n295#3,2:63\n*S KotlinDebug\n*F\n+ 1 BasicTrustRootIndex.kt\nokhttp3/internal/tls/BasicTrustRootIndex\n*L\n30#1:56,7\n39#1:63,2\n*E\n"})
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class BasicTrustRootIndex implements okhttp3.internal.tls.TrustRootIndex {

    @org.jetbrains.annotations.NotNull
    private final java.util.Map<javax.security.auth.x500.X500Principal, java.util.Set<java.security.cert.X509Certificate>> subjectToCaCerts;

    public BasicTrustRootIndex(@org.jetbrains.annotations.NotNull java.security.cert.X509Certificate... r7) {
            r6 = this;
            java.lang.String r0 = "caCerts"
            kotlin.jvm.internal.g0.p(r7, r0)
            r6.<init>()
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            int r1 = r7.length
            r2 = 0
        Lf:
            if (r2 >= r1) goto L2d
            r3 = r7[r2]
            javax.security.auth.x500.X500Principal r4 = r3.getSubjectX500Principal()
            java.lang.Object r5 = r0.get(r4)
            if (r5 != 0) goto L25
            java.util.LinkedHashSet r5 = new java.util.LinkedHashSet
            r5.<init>()
            r0.put(r4, r5)
        L25:
            java.util.Set r5 = (java.util.Set) r5
            r5.add(r3)
            int r2 = r2 + 1
            goto Lf
        L2d:
            r6.subjectToCaCerts = r0
            return
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r2) {
            r1 = this;
            if (r2 == r1) goto L15
            boolean r0 = r2 instanceof okhttp3.internal.tls.BasicTrustRootIndex
            if (r0 == 0) goto L13
            okhttp3.internal.tls.BasicTrustRootIndex r2 = (okhttp3.internal.tls.BasicTrustRootIndex) r2
            java.util.Map<javax.security.auth.x500.X500Principal, java.util.Set<java.security.cert.X509Certificate>> r2 = r2.subjectToCaCerts
            java.util.Map<javax.security.auth.x500.X500Principal, java.util.Set<java.security.cert.X509Certificate>> r0 = r1.subjectToCaCerts
            boolean r2 = kotlin.jvm.internal.g0.g(r2, r0)
            if (r2 == 0) goto L13
            goto L15
        L13:
            r2 = 0
            return r2
        L15:
            r2 = 1
            return r2
    }

    @Override // okhttp3.internal.tls.TrustRootIndex
    @org.jetbrains.annotations.Nullable
    public java.security.cert.X509Certificate findByIssuerAndSignature(@org.jetbrains.annotations.NotNull java.security.cert.X509Certificate r5) {
            r4 = this;
            java.lang.String r0 = "cert"
            kotlin.jvm.internal.g0.p(r5, r0)
            javax.security.auth.x500.X500Principal r0 = r5.getIssuerX500Principal()
            java.util.Map<javax.security.auth.x500.X500Principal, java.util.Set<java.security.cert.X509Certificate>> r1 = r4.subjectToCaCerts
            java.lang.Object r0 = r1.get(r0)
            java.util.Set r0 = (java.util.Set) r0
            r1 = 0
            if (r0 != 0) goto L15
            return r1
        L15:
            java.util.Iterator r0 = r0.iterator()
        L19:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L31
            java.lang.Object r2 = r0.next()
            r3 = r2
            java.security.cert.X509Certificate r3 = (java.security.cert.X509Certificate) r3
            java.security.PublicKey r3 = r3.getPublicKey()     // Catch: java.lang.Exception -> L2f
            r5.verify(r3)     // Catch: java.lang.Exception -> L2f
            r1 = r2
            goto L31
        L2f:
            goto L19
        L31:
            java.security.cert.X509Certificate r1 = (java.security.cert.X509Certificate) r1
            return r1
    }

    public int hashCode() {
            r1 = this;
            java.util.Map<javax.security.auth.x500.X500Principal, java.util.Set<java.security.cert.X509Certificate>> r0 = r1.subjectToCaCerts
            int r0 = r0.hashCode()
            return r0
    }
}
