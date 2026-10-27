package com.huawei.secure.android.common.ssl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public abstract class f {
    private static final java.lang.String a = "SSLUtil";
    private static final java.lang.String b = "TLSv1.3";
    private static final java.lang.String c = "TLSv1.2";
    private static final java.lang.String d = "TLS";
    private static final java.lang.String e = "TLSv1";
    private static final java.lang.String[] f = null;
    private static final java.lang.String[] g = null;
    private static final java.lang.String[] h = null;

    static {
            java.lang.String r6 = "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA"
            java.lang.String r7 = "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA"
            java.lang.String r0 = "TLS_DHE_DSS_WITH_AES_128_CBC_SHA"
            java.lang.String r1 = "TLS_DHE_RSA_WITH_AES_128_CBC_SHA"
            java.lang.String r2 = "TLS_DHE_DSS_WITH_AES_256_CBC_SHA"
            java.lang.String r3 = "TLS_DHE_RSA_WITH_AES_256_CBC_SHA"
            java.lang.String r4 = "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA"
            java.lang.String r5 = "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2, r3, r4, r5, r6, r7}
            com.huawei.secure.android.common.ssl.f.f = r0
            java.lang.String r7 = "TLS_DHE_DSS_WITH_AES_128_GCM_SHA256"
            java.lang.String r8 = "TLS_DHE_DSS_WITH_AES_256_GCM_SHA384"
            java.lang.String r1 = "TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256"
            java.lang.String r2 = "TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384"
            java.lang.String r3 = "TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256"
            java.lang.String r4 = "TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384"
            java.lang.String r5 = "TLS_DHE_RSA_WITH_AES_128_GCM_SHA256"
            java.lang.String r6 = "TLS_DHE_RSA_WITH_AES_256_GCM_SHA384"
            java.lang.String[] r0 = new java.lang.String[]{r1, r2, r3, r4, r5, r6, r7, r8}
            com.huawei.secure.android.common.ssl.f.g = r0
            java.lang.String r15 = "ANON"
            java.lang.String r16 = "TLS_EMPTY_RENEGOTIATION_INFO_SCSV"
            java.lang.String r1 = "TLS_RSA"
            java.lang.String r2 = "CBC"
            java.lang.String r3 = "TEA"
            java.lang.String r4 = "SHA0"
            java.lang.String r5 = "MD2"
            java.lang.String r6 = "MD4"
            java.lang.String r7 = "RIPEMD"
            java.lang.String r8 = "NULL"
            java.lang.String r9 = "RC4"
            java.lang.String r10 = "DES"
            java.lang.String r11 = "DESX"
            java.lang.String r12 = "DES40"
            java.lang.String r13 = "RC2"
            java.lang.String r14 = "MD5"
            java.lang.String[] r0 = new java.lang.String[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16}
            com.huawei.secure.android.common.ssl.f.h = r0
            return
    }

    public f() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String[] a(javax.net.ssl.SSLSocket r0) {
            java.lang.String[] r0 = r0.getEnabledCipherSuites()
            return r0
    }

    public static java.lang.String[] b(javax.net.ssl.SSLSocket r0) {
            java.lang.String[] r0 = r0.getEnabledProtocols()
            return r0
    }

    public static void c(javax.net.ssl.SSLSocket r8) {
            java.lang.String[] r0 = r8.getEnabledProtocols()
            int r1 = r0.length
            r2 = 0
            r3 = 0
        L7:
            java.lang.String r4 = "SSLUtil"
            if (r3 >= r1) goto L24
            r5 = r0[r3]
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "new enable protocols is : "
            r6.append(r7)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            com.huawei.secure.android.common.ssl.util.h.e(r4, r5)
            int r3 = r3 + 1
            goto L7
        L24:
            java.lang.String[] r8 = r8.getEnabledCipherSuites()
            int r0 = r8.length
        L29:
            if (r2 >= r0) goto L44
            r1 = r8[r2]
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "new cipher suites is : "
            r3.append(r5)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            com.huawei.secure.android.common.ssl.util.h.e(r4, r1)
            int r2 = r2 + 1
            goto L29
        L44:
            return
    }

    public static boolean d(javax.net.ssl.SSLSocket r1) {
            if (r1 != 0) goto L4
            r1 = 0
            return r1
        L4:
            java.lang.String[] r0 = com.huawei.secure.android.common.ssl.f.h
            boolean r1 = e(r1, r0)
            return r1
    }

    public static boolean e(javax.net.ssl.SSLSocket r11, java.lang.String[] r12) {
            r0 = 0
            if (r11 != 0) goto L4
            return r0
        L4:
            java.lang.String[] r1 = r11.getEnabledCipherSuites()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            int r3 = r1.length
            r4 = 0
        Lf:
            if (r4 >= r3) goto L35
            r5 = r1[r4]
            java.util.Locale r6 = java.util.Locale.ENGLISH
            java.lang.String r6 = r5.toUpperCase(r6)
            int r7 = r12.length
            r8 = 0
        L1b:
            if (r8 >= r7) goto L2f
            r9 = r12[r8]
            java.util.Locale r10 = java.util.Locale.ENGLISH
            java.lang.String r9 = r9.toUpperCase(r10)
            boolean r9 = r6.contains(r9)
            if (r9 == 0) goto L2c
            goto L32
        L2c:
            int r8 = r8 + 1
            goto L1b
        L2f:
            r2.add(r5)
        L32:
            int r4 = r4 + 1
            goto Lf
        L35:
            boolean r12 = r2.isEmpty()
            if (r12 != 0) goto L4c
            int r12 = r2.size()
            java.lang.String[] r12 = new java.lang.String[r12]
            java.lang.Object[] r12 = r2.toArray(r12)
            java.lang.String[] r12 = (java.lang.String[]) r12
            r11.setEnabledCipherSuites(r12)
            r11 = 1
            return r11
        L4c:
            return r0
    }

    public static void f(javax.net.ssl.SSLSocket r1) {
            if (r1 != 0) goto L3
            goto Lc
        L3:
            boolean r0 = k(r1)
            if (r0 != 0) goto Lc
            d(r1)
        Lc:
            return
    }

    public static void g(javax.net.ssl.SSLSocket r4) {
            if (r4 != 0) goto L3
            return
        L3:
            int r0 = android.os.Build.VERSION.SDK_INT
            java.lang.String r1 = "TLSv1.2"
            r2 = 29
            if (r0 < r2) goto L14
            java.lang.String r3 = "TLSv1.3"
            java.lang.String[] r3 = new java.lang.String[]{r3, r1}
            r4.setEnabledProtocols(r3)
        L14:
            if (r0 >= r2) goto L1d
            java.lang.String[] r0 = new java.lang.String[]{r1}
            r4.setEnabledProtocols(r0)
        L1d:
            return
    }

    public static boolean h(javax.net.ssl.SSLSocket r2, java.lang.String[] r3) {
            r0 = 0
            if (r2 == 0) goto L26
            if (r3 != 0) goto L6
            goto L26
        L6:
            r2.setEnabledProtocols(r3)     // Catch: java.lang.Exception -> Lb
            r2 = 1
            return r2
        Lb:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r1 = "setEnabledProtocols: exception : "
            r3.append(r1)
            java.lang.String r2 = r2.getMessage()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            java.lang.String r3 = "SSLUtil"
            com.huawei.secure.android.common.ssl.util.h.d(r3, r2)
        L26:
            return r0
    }

    public static javax.net.ssl.SSLContext i() throws java.security.NoSuchAlgorithmException {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto Ld
            java.lang.String r0 = "TLSv1.3"
            javax.net.ssl.SSLContext r0 = javax.net.ssl.SSLContext.getInstance(r0)
            return r0
        Ld:
            java.lang.String r0 = "TLSv1.2"
            javax.net.ssl.SSLContext r0 = javax.net.ssl.SSLContext.getInstance(r0)
            return r0
    }

    public static void j(javax.net.ssl.SSLSocket r0) {
            if (r0 != 0) goto L3
            return
        L3:
            g(r0)
            f(r0)
            return
    }

    public static boolean k(javax.net.ssl.SSLSocket r1) {
            if (r1 != 0) goto L4
            r1 = 0
            return r1
        L4:
            java.lang.String[] r0 = com.huawei.secure.android.common.ssl.f.g
            boolean r1 = l(r1, r0)
            return r1
    }

    public static boolean l(javax.net.ssl.SSLSocket r7, java.lang.String[] r8) {
            r0 = 0
            if (r7 != 0) goto L4
            return r0
        L4:
            java.lang.String[] r1 = r7.getEnabledCipherSuites()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.List r8 = java.util.Arrays.asList(r8)
            int r3 = r1.length
            r4 = 0
        L13:
            if (r4 >= r3) goto L29
            r5 = r1[r4]
            java.util.Locale r6 = java.util.Locale.ENGLISH
            java.lang.String r6 = r5.toUpperCase(r6)
            boolean r6 = r8.contains(r6)
            if (r6 == 0) goto L26
            r2.add(r5)
        L26:
            int r4 = r4 + 1
            goto L13
        L29:
            boolean r8 = r2.isEmpty()
            if (r8 != 0) goto L40
            int r8 = r2.size()
            java.lang.String[] r8 = new java.lang.String[r8]
            java.lang.Object[] r8 = r2.toArray(r8)
            java.lang.String[] r8 = (java.lang.String[]) r8
            r7.setEnabledCipherSuites(r8)
            r7 = 1
            return r7
        L40:
            return r0
    }
}
