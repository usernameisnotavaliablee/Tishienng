package com.huawei.secure.android.common.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class b {
    private static final java.lang.String a = "EncryptUtil";
    private static final java.lang.String b = "RSA";

    static {
            return
    }

    public b() {
            r0 = this;
            r0.<init>()
            return
    }

    @java.lang.Deprecated
    public static byte[] a(int r3) {
            byte[] r3 = new byte[r3]
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.security.NoSuchAlgorithmException -> Ld
            r1 = 26
            if (r0 < r1) goto L14
            java.security.SecureRandom r0 = com.bytedance.sdk.component.tl.xt.m.a.a()     // Catch: java.security.NoSuchAlgorithmException -> Ld
            goto L15
        Ld:
            java.lang.String r0 = com.huawei.secure.android.common.util.b.a
            java.lang.String r1 = "getSecureRandomBytes: NoSuchAlgorithmException"
            com.huawei.secure.android.common.util.e.l(r0, r1)
        L14:
            r0 = 0
        L15:
            if (r0 != 0) goto L1d
            java.lang.String r0 = "SHA1PRNG"
            java.security.SecureRandom r0 = java.security.SecureRandom.getInstance(r0)     // Catch: java.lang.Exception -> L21 java.security.NoSuchAlgorithmException -> L3d
        L1d:
            r0.nextBytes(r3)     // Catch: java.lang.Exception -> L21 java.security.NoSuchAlgorithmException -> L3d
            return r3
        L21:
            r3 = move-exception
            java.lang.String r0 = com.huawei.secure.android.common.util.b.a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "getSecureRandomBytes getInstance: exception : "
            r1.append(r2)
            java.lang.String r3 = r3.getMessage()
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            com.huawei.secure.android.common.util.e.l(r0, r3)
            goto L44
        L3d:
            java.lang.String r3 = com.huawei.secure.android.common.util.b.a
            java.lang.String r0 = "getSecureRandomBytes getInstance: NoSuchAlgorithmException"
            com.huawei.secure.android.common.util.e.l(r3, r0)
        L44:
            r3 = 0
            byte[] r3 = new byte[r3]
            return r3
    }

    @java.lang.Deprecated
    public static java.lang.String b(int r0) {
            byte[] r0 = a(r0)
            java.lang.String r0 = com.huawei.secure.android.common.util.c.b(r0)
            return r0
    }

    @java.lang.Deprecated
    public static java.security.PrivateKey c(java.lang.String r5) {
            r0 = 0
            r1 = 0
            r2 = 1
            byte[] r5 = android.util.Base64.decode(r5, r0)     // Catch: java.lang.Exception -> L33 java.lang.IllegalArgumentException -> L3b
            java.security.spec.PKCS8EncodedKeySpec r0 = new java.security.spec.PKCS8EncodedKeySpec     // Catch: java.security.GeneralSecurityException -> L17
            r0.<init>(r5)     // Catch: java.security.GeneralSecurityException -> L17
            java.lang.String r5 = "RSA"
            java.security.KeyFactory r5 = java.security.KeyFactory.getInstance(r5)     // Catch: java.security.GeneralSecurityException -> L17
            java.security.PrivateKey r5 = r5.generatePrivate(r0)     // Catch: java.security.GeneralSecurityException -> L17
            return r5
        L17:
            r5 = move-exception
            java.lang.String r0 = com.huawei.secure.android.common.util.b.a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "load Key Exception:"
            r3.append(r4)
            java.lang.String r5 = r5.getMessage()
            r3.append(r5)
            java.lang.String r5 = r3.toString()
            com.huawei.secure.android.common.util.e.q(r0, r5, r2)
            return r1
        L33:
            java.lang.String r5 = com.huawei.secure.android.common.util.b.a
            java.lang.String r0 = "base64 decode Exception"
            com.huawei.secure.android.common.util.e.q(r5, r0, r2)
            return r1
        L3b:
            java.lang.String r5 = com.huawei.secure.android.common.util.b.a
            java.lang.String r0 = "base64 decode IllegalArgumentException"
            com.huawei.secure.android.common.util.e.q(r5, r0, r2)
            return r1
    }

    @java.lang.Deprecated
    public static java.security.interfaces.RSAPublicKey d(java.lang.String r5) {
            r0 = 0
            r1 = 0
            r2 = 1
            byte[] r5 = android.util.Base64.decode(r5, r0)     // Catch: java.lang.Exception -> L35 java.lang.IllegalArgumentException -> L3d
            java.lang.String r0 = "RSA"
            java.security.KeyFactory r0 = java.security.KeyFactory.getInstance(r0)     // Catch: java.security.GeneralSecurityException -> L19
            java.security.spec.X509EncodedKeySpec r3 = new java.security.spec.X509EncodedKeySpec     // Catch: java.security.GeneralSecurityException -> L19
            r3.<init>(r5)     // Catch: java.security.GeneralSecurityException -> L19
            java.security.PublicKey r5 = r0.generatePublic(r3)     // Catch: java.security.GeneralSecurityException -> L19
            java.security.interfaces.RSAPublicKey r5 = (java.security.interfaces.RSAPublicKey) r5     // Catch: java.security.GeneralSecurityException -> L19
            return r5
        L19:
            r5 = move-exception
            java.lang.String r0 = com.huawei.secure.android.common.util.b.a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "load Key Exception:"
            r3.append(r4)
            java.lang.String r5 = r5.getMessage()
            r3.append(r5)
            java.lang.String r5 = r3.toString()
            com.huawei.secure.android.common.util.e.q(r0, r5, r2)
            return r1
        L35:
            java.lang.String r5 = com.huawei.secure.android.common.util.b.a
            java.lang.String r0 = "base64 decode Exception"
            com.huawei.secure.android.common.util.e.q(r5, r0, r2)
            return r1
        L3d:
            java.lang.String r5 = com.huawei.secure.android.common.util.b.a
            java.lang.String r0 = "base64 decode IllegalArgumentException"
            com.huawei.secure.android.common.util.e.q(r5, r0, r2)
            return r1
    }
}
