package c2;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class b {
    private static final java.lang.String a = "EncryptUtil";
    private static final java.lang.String b = "RSA";
    private static boolean c = true;
    private static boolean d = true;

    static {
            return
    }

    public b() {
            r0 = this;
            r0.<init>()
            return
    }

    private static java.security.SecureRandom a() {
            java.lang.String r0 = "generateSecureRandomNew "
            java.lang.String r1 = "EncryptUtil"
            c2.g.b(r1, r0)
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.security.NoSuchAlgorithmException -> L12
            r2 = 26
            if (r0 < r2) goto L17
            java.security.SecureRandom r0 = com.bytedance.sdk.component.tl.xt.m.a.a()     // Catch: java.security.NoSuchAlgorithmException -> L12
            goto L18
        L12:
            java.lang.String r0 = "getSecureRandomBytes: NoSuchAlgorithmException"
            c2.g.d(r1, r0)
        L17:
            r0 = 0
        L18:
            r2 = 0
            if (r0 != 0) goto L24
            java.lang.String r3 = "SHA1PRNG"
            java.security.SecureRandom r0 = java.security.SecureRandom.getInstance(r3)     // Catch: java.lang.Throwable -> L22 java.security.NoSuchAlgorithmException -> L67
            goto L24
        L22:
            r3 = move-exception
            goto L43
        L24:
            org.bouncycastle.crypto.engines.AESEngine r3 = new org.bouncycastle.crypto.engines.AESEngine     // Catch: java.lang.Throwable -> L22 java.security.NoSuchAlgorithmException -> L67
            r3.<init>()     // Catch: java.lang.Throwable -> L22 java.security.NoSuchAlgorithmException -> L67
            r4 = 32
            byte[] r4 = new byte[r4]     // Catch: java.lang.Throwable -> L22 java.security.NoSuchAlgorithmException -> L67
            r0.nextBytes(r4)     // Catch: java.lang.Throwable -> L22 java.security.NoSuchAlgorithmException -> L67
            org.bouncycastle.crypto.prng.SP800SecureRandomBuilder r5 = new org.bouncycastle.crypto.prng.SP800SecureRandomBuilder     // Catch: java.lang.Throwable -> L22 java.security.NoSuchAlgorithmException -> L67
            r6 = 1
            r5.<init>(r0, r6)     // Catch: java.lang.Throwable -> L22 java.security.NoSuchAlgorithmException -> L67
            r6 = 384(0x180, float:5.38E-43)
            org.bouncycastle.crypto.prng.SP800SecureRandomBuilder r5 = r5.setEntropyBitsRequired(r6)     // Catch: java.lang.Throwable -> L22 java.security.NoSuchAlgorithmException -> L67
            r6 = 256(0x100, float:3.59E-43)
            org.bouncycastle.crypto.prng.SP800SecureRandom r0 = r5.buildCTR(r3, r6, r4, r2)     // Catch: java.lang.Throwable -> L22 java.security.NoSuchAlgorithmException -> L67
            return r0
        L43:
            boolean r4 = c2.b.d
            if (r4 == 0) goto L6c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "exception : "
            r4.append(r5)
            java.lang.String r3 = r3.getMessage()
            r4.append(r3)
            java.lang.String r3 = " , you should implementation bcprov-jdk15on library"
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            c2.g.d(r1, r3)
            c2.b.d = r2
            goto L6c
        L67:
            java.lang.String r2 = "NoSuchAlgorithmException"
            c2.g.d(r1, r2)
        L6c:
            return r0
    }

    private static byte[] b(int r1) {
            java.security.SecureRandom r0 = a()
            if (r0 != 0) goto La
            r1 = 0
            byte[] r1 = new byte[r1]
            return r1
        La:
            byte[] r1 = new byte[r1]
            r0.nextBytes(r1)
            return r1
    }

    public static java.security.SecureRandom c() {
            boolean r0 = c2.b.c
            if (r0 != 0) goto L1f
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.security.NoSuchAlgorithmException -> L16
            r1 = 26
            if (r0 < r1) goto Lf
            java.security.SecureRandom r0 = com.bytedance.sdk.component.tl.xt.m.a.a()     // Catch: java.security.NoSuchAlgorithmException -> L16
            return r0
        Lf:
            java.lang.String r0 = "SHA1PRNG"
            java.security.SecureRandom r0 = java.security.SecureRandom.getInstance(r0)     // Catch: java.security.NoSuchAlgorithmException -> L16
            return r0
        L16:
            java.lang.String r0 = "EncryptUtil"
            java.lang.String r1 = "genSecureRandom: NoSuchAlgorithmException"
            c2.g.d(r0, r1)
            r0 = 0
            return r0
        L1f:
            java.security.SecureRandom r0 = a()
            return r0
    }

    public static byte[] d(int r3) {
            java.lang.String r0 = "EncryptUtil"
            boolean r1 = c2.b.c
            if (r1 != 0) goto L4a
            byte[] r3 = new byte[r3]
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.security.NoSuchAlgorithmException -> L13
            r2 = 26
            if (r1 < r2) goto L18
            java.security.SecureRandom r1 = com.bytedance.sdk.component.tl.xt.m.a.a()     // Catch: java.security.NoSuchAlgorithmException -> L13
            goto L19
        L13:
            java.lang.String r1 = "getSecureRandomBytes: NoSuchAlgorithmException"
            c2.g.d(r0, r1)
        L18:
            r1 = 0
        L19:
            if (r1 != 0) goto L24
            java.lang.String r1 = "SHA1PRNG"
            java.security.SecureRandom r1 = java.security.SecureRandom.getInstance(r1)     // Catch: java.lang.Exception -> L22 java.security.NoSuchAlgorithmException -> L41
            goto L24
        L22:
            r3 = move-exception
            goto L28
        L24:
            r1.nextBytes(r3)     // Catch: java.lang.Exception -> L22 java.security.NoSuchAlgorithmException -> L41
            return r3
        L28:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "getSecureRandomBytes getInstance: exception : "
            r1.append(r2)
            java.lang.String r3 = r3.getMessage()
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            c2.g.d(r0, r3)
            goto L46
        L41:
            java.lang.String r3 = "getSecureRandomBytes getInstance: NoSuchAlgorithmException"
            c2.g.d(r0, r3)
        L46:
            r3 = 0
            byte[] r3 = new byte[r3]
            return r3
        L4a:
            byte[] r3 = b(r3)
            return r3
    }

    public static java.lang.String e(int r0) {
            byte[] r0 = d(r0)
            java.lang.String r0 = c2.c.b(r0)
            return r0
    }

    public static java.security.PrivateKey f(java.lang.String r4) {
            java.lang.String r0 = "EncryptUtil"
            r1 = 0
            r2 = 0
            byte[] r4 = android.util.Base64.decode(r4, r1)     // Catch: java.lang.Exception -> L32 java.lang.IllegalArgumentException -> L4c
            java.security.spec.PKCS8EncodedKeySpec r1 = new java.security.spec.PKCS8EncodedKeySpec     // Catch: java.security.GeneralSecurityException -> L18
            r1.<init>(r4)     // Catch: java.security.GeneralSecurityException -> L18
            java.lang.String r4 = "RSA"
            java.security.KeyFactory r4 = java.security.KeyFactory.getInstance(r4)     // Catch: java.security.GeneralSecurityException -> L18
            java.security.PrivateKey r4 = r4.generatePrivate(r1)     // Catch: java.security.GeneralSecurityException -> L18
            return r4
        L18:
            r4 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "load Key Exception:"
            r1.append(r3)
            java.lang.String r4 = r4.getMessage()
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            c2.g.d(r0, r4)
            return r2
        L32:
            r4 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "base64 decode Exception"
            r1.append(r3)
            java.lang.String r4 = r4.getMessage()
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            c2.g.d(r0, r4)
            return r2
        L4c:
            java.lang.String r4 = "base64 decode IllegalArgumentException"
            c2.g.d(r0, r4)
            return r2
    }

    public static java.security.interfaces.RSAPublicKey g(java.lang.String r4) {
            java.lang.String r0 = "EncryptUtil"
            r1 = 0
            r2 = 0
            byte[] r4 = android.util.Base64.decode(r4, r1)     // Catch: java.lang.Exception -> L34 java.lang.IllegalArgumentException -> L4e
            java.lang.String r1 = "RSA"
            java.security.KeyFactory r1 = java.security.KeyFactory.getInstance(r1)     // Catch: java.security.GeneralSecurityException -> L1a
            java.security.spec.X509EncodedKeySpec r3 = new java.security.spec.X509EncodedKeySpec     // Catch: java.security.GeneralSecurityException -> L1a
            r3.<init>(r4)     // Catch: java.security.GeneralSecurityException -> L1a
            java.security.PublicKey r4 = r1.generatePublic(r3)     // Catch: java.security.GeneralSecurityException -> L1a
            java.security.interfaces.RSAPublicKey r4 = (java.security.interfaces.RSAPublicKey) r4     // Catch: java.security.GeneralSecurityException -> L1a
            return r4
        L1a:
            r4 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "load Key Exception:"
            r1.append(r3)
            java.lang.String r4 = r4.getMessage()
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            c2.g.d(r0, r4)
            return r2
        L34:
            r4 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "base64 decode Exception"
            r1.append(r3)
            java.lang.String r4 = r4.getMessage()
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            c2.g.d(r0, r4)
            return r2
        L4e:
            java.lang.String r4 = "base64 decode IllegalArgumentException"
            c2.g.d(r0, r4)
            return r2
    }

    public static boolean h() {
            boolean r0 = c2.b.c
            return r0
    }

    public static void i(boolean r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "setBouncycastleFlag: "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "EncryptUtil"
            c2.g.e(r1, r0)
            c2.b.c = r2
            return
    }
}
