package b2;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public abstract class b {
    private static final java.lang.String a = "SHA256WithRSA";
    private static final java.lang.String b = "SHA256WithRSA/PSS";
    private static final java.lang.String c = "RSASign";
    private static final java.lang.String d = "UTF-8";
    private static final java.lang.String e = "";

    static {
            return
    }

    public b() {
            r0 = this;
            r0.<init>()
            return
    }

    private static java.lang.String a(java.lang.String r1, java.lang.String r2, boolean r3) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L1d
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto Ld
            goto L1d
        Ld:
            java.security.PrivateKey r2 = c2.b.f(r2)
            if (r3 == 0) goto L18
            java.lang.String r1 = g(r1, r2)
            return r1
        L18:
            java.lang.String r1 = k(r1, r2)
            return r1
        L1d:
            java.lang.String r1 = b2.b.c
            java.lang.String r2 = "sign content or key is null"
            c2.g.d(r1, r2)
            java.lang.String r1 = ""
            return r1
    }

    private static java.lang.String b(java.lang.String r1, java.security.PrivateKey r2, boolean r3) {
            java.lang.String r0 = "UTF-8"
            byte[] r1 = r1.getBytes(r0)     // Catch: java.io.UnsupportedEncodingException -> L10
            byte[] r1 = m(r1, r2, r3)     // Catch: java.io.UnsupportedEncodingException -> L10
            r2 = 0
            java.lang.String r1 = android.util.Base64.encodeToString(r1, r2)     // Catch: java.io.UnsupportedEncodingException -> L10
            return r1
        L10:
            r1 = move-exception
            java.lang.String r2 = b2.b.c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "sign UnsupportedEncodingException: "
            r3.append(r0)
            java.lang.String r1 = r1.getMessage()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            c2.g.d(r2, r1)
            java.lang.String r1 = ""
            return r1
    }

    private static boolean c(java.lang.String r1, java.lang.String r2, java.lang.String r3, boolean r4) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L23
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L23
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L13
            goto L23
        L13:
            java.security.interfaces.RSAPublicKey r3 = c2.b.g(r3)
            if (r4 == 0) goto L1e
            boolean r1 = i(r1, r2, r3)
            return r1
        L1e:
            boolean r1 = o(r1, r2, r3)
            return r1
        L23:
            java.lang.String r1 = b2.b.c
            java.lang.String r2 = "content or public key or sign value is null"
            c2.g.d(r1, r2)
            r1 = 0
            return r1
    }

    private static boolean d(java.lang.String r2, java.lang.String r3, java.security.PublicKey r4, boolean r5) {
            r0 = 0
            java.lang.String r1 = "UTF-8"
            byte[] r2 = r2.getBytes(r1)     // Catch: java.lang.Exception -> L10 java.io.UnsupportedEncodingException -> L12
            byte[] r3 = android.util.Base64.decode(r3, r0)     // Catch: java.lang.Exception -> L10 java.io.UnsupportedEncodingException -> L12
            boolean r2 = q(r2, r3, r4, r5)     // Catch: java.lang.Exception -> L10 java.io.UnsupportedEncodingException -> L12
            return r2
        L10:
            r2 = move-exception
            goto L14
        L12:
            r2 = move-exception
            goto L2f
        L14:
            java.lang.String r3 = b2.b.c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "base64 decode Exception : "
            r4.append(r5)
            java.lang.String r2 = r2.getMessage()
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            c2.g.d(r3, r2)
            goto L49
        L2f:
            java.lang.String r3 = b2.b.c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "verifySign UnsupportedEncodingException: "
            r4.append(r5)
            java.lang.String r2 = r2.getMessage()
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            c2.g.d(r3, r2)
        L49:
            return r0
    }

    public static boolean e() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 <= r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public static java.lang.String f(java.lang.String r1, java.lang.String r2) {
            boolean r0 = e()
            if (r0 != 0) goto L10
            java.lang.String r1 = b2.b.c
            java.lang.String r2 = "sdk version is too low"
            c2.g.d(r1, r2)
            java.lang.String r1 = ""
            return r1
        L10:
            r0 = 1
            java.lang.String r1 = a(r1, r2, r0)
            return r1
    }

    public static java.lang.String g(java.lang.String r1, java.security.PrivateKey r2) {
            boolean r0 = e()
            if (r0 != 0) goto L10
            java.lang.String r1 = b2.b.c
            java.lang.String r2 = "sdk version is too low"
            c2.g.d(r1, r2)
            java.lang.String r1 = ""
            return r1
        L10:
            r0 = 1
            java.lang.String r1 = b(r1, r2, r0)
            return r1
    }

    public static boolean h(java.lang.String r1, java.lang.String r2, java.lang.String r3) {
            boolean r0 = e()
            if (r0 != 0) goto Lf
            java.lang.String r1 = b2.b.c
            java.lang.String r2 = "sdk version is too low"
            c2.g.d(r1, r2)
            r1 = 0
            return r1
        Lf:
            r0 = 1
            boolean r1 = c(r1, r2, r3, r0)
            return r1
    }

    public static boolean i(java.lang.String r1, java.lang.String r2, java.security.PublicKey r3) {
            boolean r0 = e()
            if (r0 != 0) goto Lf
            java.lang.String r1 = b2.b.c
            java.lang.String r2 = "sdk version is too low"
            c2.g.d(r1, r2)
            r1 = 0
            return r1
        Lf:
            r0 = 1
            boolean r1 = d(r1, r2, r3, r0)
            return r1
    }

    @java.lang.Deprecated
    public static java.lang.String j(java.lang.String r1, java.lang.String r2) {
            r0 = 0
            java.lang.String r1 = a(r1, r2, r0)
            return r1
    }

    @java.lang.Deprecated
    public static java.lang.String k(java.lang.String r1, java.security.PrivateKey r2) {
            r0 = 0
            java.lang.String r1 = b(r1, r2, r0)
            return r1
    }

    public static byte[] l(java.nio.ByteBuffer r8, java.security.PrivateKey r9, boolean r10) {
            r0 = 0
            byte[] r1 = new byte[r0]
            if (r8 == 0) goto Lef
            if (r9 == 0) goto Lef
            r0 = r9
            java.security.interfaces.RSAPrivateKey r0 = (java.security.interfaces.RSAPrivateKey) r0
            boolean r0 = b2.a.h(r0)
            if (r0 != 0) goto L12
            goto Lef
        L12:
            if (r10 == 0) goto L3d
            java.lang.String r10 = "SHA256WithRSA/PSS"
            java.security.Signature r10 = java.security.Signature.getInstance(r10)     // Catch: java.lang.Exception -> L2c java.security.InvalidAlgorithmParameterException -> L2f java.security.SignatureException -> L32 java.security.InvalidKeyException -> L35 java.security.NoSuchAlgorithmException -> L39
            java.security.spec.PSSParameterSpec r2 = new java.security.spec.PSSParameterSpec     // Catch: java.lang.Exception -> L2c java.security.InvalidAlgorithmParameterException -> L2f java.security.SignatureException -> L32 java.security.InvalidKeyException -> L35 java.security.NoSuchAlgorithmException -> L39
            java.lang.String r3 = "SHA-256"
            java.lang.String r4 = "MGF1"
            java.security.spec.MGF1ParameterSpec r5 = java.security.spec.MGF1ParameterSpec.SHA256     // Catch: java.lang.Exception -> L2c java.security.InvalidAlgorithmParameterException -> L2f java.security.SignatureException -> L32 java.security.InvalidKeyException -> L35 java.security.NoSuchAlgorithmException -> L39
            r6 = 32
            r7 = 1
            r2.<init>(r3, r4, r5, r6, r7)     // Catch: java.lang.Exception -> L2c java.security.InvalidAlgorithmParameterException -> L2f java.security.SignatureException -> L32 java.security.InvalidKeyException -> L35 java.security.NoSuchAlgorithmException -> L39
            r10.setParameter(r2)     // Catch: java.lang.Exception -> L2c java.security.InvalidAlgorithmParameterException -> L2f java.security.SignatureException -> L32 java.security.InvalidKeyException -> L35 java.security.NoSuchAlgorithmException -> L39
            goto L43
        L2c:
            r0 = move-exception
            r8 = r0
            goto L68
        L2f:
            r0 = move-exception
            r8 = r0
            goto L83
        L32:
            r0 = move-exception
            r8 = r0
            goto L9e
        L35:
            r0 = move-exception
            r8 = r0
            goto Lb9
        L39:
            r0 = move-exception
            r8 = r0
            goto Ld4
        L3d:
            java.lang.String r10 = "SHA256WithRSA"
            java.security.Signature r10 = java.security.Signature.getInstance(r10)     // Catch: java.lang.Exception -> L2c java.security.InvalidAlgorithmParameterException -> L2f java.security.SignatureException -> L32 java.security.InvalidKeyException -> L35 java.security.NoSuchAlgorithmException -> L39
        L43:
            r10.initSign(r9)     // Catch: java.lang.Exception -> L2c java.security.InvalidAlgorithmParameterException -> L2f java.security.SignatureException -> L32 java.security.InvalidKeyException -> L35 java.security.NoSuchAlgorithmException -> L39
            r10.update(r8)     // Catch: java.lang.Exception -> L2c java.security.InvalidAlgorithmParameterException -> L2f java.security.SignatureException -> L32 java.security.InvalidKeyException -> L35 java.security.NoSuchAlgorithmException -> L39
            byte[] r1 = r10.sign()     // Catch: java.lang.Exception -> L2c java.security.InvalidAlgorithmParameterException -> L2f java.security.SignatureException -> L32 java.security.InvalidKeyException -> L35 java.security.NoSuchAlgorithmException -> L39
            java.lang.String r8 = b2.b.c     // Catch: java.lang.Exception -> L2c java.security.InvalidAlgorithmParameterException -> L2f java.security.SignatureException -> L32 java.security.InvalidKeyException -> L35 java.security.NoSuchAlgorithmException -> L39
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L2c java.security.InvalidAlgorithmParameterException -> L2f java.security.SignatureException -> L32 java.security.InvalidKeyException -> L35 java.security.NoSuchAlgorithmException -> L39
            r9.<init>()     // Catch: java.lang.Exception -> L2c java.security.InvalidAlgorithmParameterException -> L2f java.security.SignatureException -> L32 java.security.InvalidKeyException -> L35 java.security.NoSuchAlgorithmException -> L39
            java.lang.String r10 = "result is : "
            r9.append(r10)     // Catch: java.lang.Exception -> L2c java.security.InvalidAlgorithmParameterException -> L2f java.security.SignatureException -> L32 java.security.InvalidKeyException -> L35 java.security.NoSuchAlgorithmException -> L39
            java.lang.String r10 = java.util.Arrays.toString(r1)     // Catch: java.lang.Exception -> L2c java.security.InvalidAlgorithmParameterException -> L2f java.security.SignatureException -> L32 java.security.InvalidKeyException -> L35 java.security.NoSuchAlgorithmException -> L39
            r9.append(r10)     // Catch: java.lang.Exception -> L2c java.security.InvalidAlgorithmParameterException -> L2f java.security.SignatureException -> L32 java.security.InvalidKeyException -> L35 java.security.NoSuchAlgorithmException -> L39
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Exception -> L2c java.security.InvalidAlgorithmParameterException -> L2f java.security.SignatureException -> L32 java.security.InvalidKeyException -> L35 java.security.NoSuchAlgorithmException -> L39
            c2.g.e(r8, r9)     // Catch: java.lang.Exception -> L2c java.security.InvalidAlgorithmParameterException -> L2f java.security.SignatureException -> L32 java.security.InvalidKeyException -> L35 java.security.NoSuchAlgorithmException -> L39
            return r1
        L68:
            java.lang.String r9 = b2.b.c
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r0 = "sign Exception: "
            r10.append(r0)
            java.lang.String r8 = r8.getMessage()
            r10.append(r8)
            java.lang.String r8 = r10.toString()
            c2.g.d(r9, r8)
            goto Lee
        L83:
            java.lang.String r9 = b2.b.c
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r0 = "sign InvalidAlgorithmParameterException: "
            r10.append(r0)
            java.lang.String r8 = r8.getMessage()
            r10.append(r8)
            java.lang.String r8 = r10.toString()
            c2.g.d(r9, r8)
            goto Lee
        L9e:
            java.lang.String r9 = b2.b.c
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r0 = "sign SignatureException: "
            r10.append(r0)
            java.lang.String r8 = r8.getMessage()
            r10.append(r8)
            java.lang.String r8 = r10.toString()
            c2.g.d(r9, r8)
            goto Lee
        Lb9:
            java.lang.String r9 = b2.b.c
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r0 = "sign InvalidKeyException: "
            r10.append(r0)
            java.lang.String r8 = r8.getMessage()
            r10.append(r8)
            java.lang.String r8 = r10.toString()
            c2.g.d(r9, r8)
            goto Lee
        Ld4:
            java.lang.String r9 = b2.b.c
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r0 = "sign NoSuchAlgorithmException: "
            r10.append(r0)
            java.lang.String r8 = r8.getMessage()
            r10.append(r8)
            java.lang.String r8 = r10.toString()
            c2.g.d(r9, r8)
        Lee:
            return r1
        Lef:
            java.lang.String r8 = b2.b.c
            java.lang.String r9 = "content or privateKey is null , or length is too short"
            c2.g.d(r8, r9)
            return r1
    }

    public static byte[] m(byte[] r8, java.security.PrivateKey r9, boolean r10) {
            r0 = 0
            byte[] r1 = new byte[r0]
            if (r8 == 0) goto Ld4
            if (r9 == 0) goto Ld4
            r0 = r9
            java.security.interfaces.RSAPrivateKey r0 = (java.security.interfaces.RSAPrivateKey) r0
            boolean r0 = b2.a.h(r0)
            if (r0 != 0) goto L12
            goto Ld4
        L12:
            if (r10 == 0) goto L3c
            java.lang.String r10 = "SHA256WithRSA/PSS"
            java.security.Signature r10 = java.security.Signature.getInstance(r10)     // Catch: java.lang.Exception -> L2c java.security.InvalidAlgorithmParameterException -> L2f java.security.SignatureException -> L32 java.security.InvalidKeyException -> L35 java.security.NoSuchAlgorithmException -> L38
            java.security.spec.PSSParameterSpec r2 = new java.security.spec.PSSParameterSpec     // Catch: java.lang.Exception -> L2c java.security.InvalidAlgorithmParameterException -> L2f java.security.SignatureException -> L32 java.security.InvalidKeyException -> L35 java.security.NoSuchAlgorithmException -> L38
            java.lang.String r3 = "SHA-256"
            java.lang.String r4 = "MGF1"
            java.security.spec.MGF1ParameterSpec r5 = java.security.spec.MGF1ParameterSpec.SHA256     // Catch: java.lang.Exception -> L2c java.security.InvalidAlgorithmParameterException -> L2f java.security.SignatureException -> L32 java.security.InvalidKeyException -> L35 java.security.NoSuchAlgorithmException -> L38
            r6 = 32
            r7 = 1
            r2.<init>(r3, r4, r5, r6, r7)     // Catch: java.lang.Exception -> L2c java.security.InvalidAlgorithmParameterException -> L2f java.security.SignatureException -> L32 java.security.InvalidKeyException -> L35 java.security.NoSuchAlgorithmException -> L38
            r10.setParameter(r2)     // Catch: java.lang.Exception -> L2c java.security.InvalidAlgorithmParameterException -> L2f java.security.SignatureException -> L32 java.security.InvalidKeyException -> L35 java.security.NoSuchAlgorithmException -> L38
            goto L42
        L2c:
            r0 = move-exception
            r8 = r0
            goto L4d
        L2f:
            r0 = move-exception
            r8 = r0
            goto L68
        L32:
            r0 = move-exception
            r8 = r0
            goto L83
        L35:
            r0 = move-exception
            r8 = r0
            goto L9e
        L38:
            r0 = move-exception
            r8 = r0
            goto Lb9
        L3c:
            java.lang.String r10 = "SHA256WithRSA"
            java.security.Signature r10 = java.security.Signature.getInstance(r10)     // Catch: java.lang.Exception -> L2c java.security.InvalidAlgorithmParameterException -> L2f java.security.SignatureException -> L32 java.security.InvalidKeyException -> L35 java.security.NoSuchAlgorithmException -> L38
        L42:
            r10.initSign(r9)     // Catch: java.lang.Exception -> L2c java.security.InvalidAlgorithmParameterException -> L2f java.security.SignatureException -> L32 java.security.InvalidKeyException -> L35 java.security.NoSuchAlgorithmException -> L38
            r10.update(r8)     // Catch: java.lang.Exception -> L2c java.security.InvalidAlgorithmParameterException -> L2f java.security.SignatureException -> L32 java.security.InvalidKeyException -> L35 java.security.NoSuchAlgorithmException -> L38
            byte[] r8 = r10.sign()     // Catch: java.lang.Exception -> L2c java.security.InvalidAlgorithmParameterException -> L2f java.security.SignatureException -> L32 java.security.InvalidKeyException -> L35 java.security.NoSuchAlgorithmException -> L38
            return r8
        L4d:
            java.lang.String r9 = b2.b.c
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r0 = "sign Exception: "
            r10.append(r0)
            java.lang.String r8 = r8.getMessage()
            r10.append(r8)
            java.lang.String r8 = r10.toString()
            c2.g.d(r9, r8)
            goto Ld3
        L68:
            java.lang.String r9 = b2.b.c
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r0 = "sign InvalidAlgorithmParameterException: "
            r10.append(r0)
            java.lang.String r8 = r8.getMessage()
            r10.append(r8)
            java.lang.String r8 = r10.toString()
            c2.g.d(r9, r8)
            goto Ld3
        L83:
            java.lang.String r9 = b2.b.c
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r0 = "sign SignatureException: "
            r10.append(r0)
            java.lang.String r8 = r8.getMessage()
            r10.append(r8)
            java.lang.String r8 = r10.toString()
            c2.g.d(r9, r8)
            goto Ld3
        L9e:
            java.lang.String r9 = b2.b.c
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r0 = "sign InvalidKeyException: "
            r10.append(r0)
            java.lang.String r8 = r8.getMessage()
            r10.append(r8)
            java.lang.String r8 = r10.toString()
            c2.g.d(r9, r8)
            goto Ld3
        Lb9:
            java.lang.String r9 = b2.b.c
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r0 = "sign NoSuchAlgorithmException: "
            r10.append(r0)
            java.lang.String r8 = r8.getMessage()
            r10.append(r8)
            java.lang.String r8 = r10.toString()
            c2.g.d(r9, r8)
        Ld3:
            return r1
        Ld4:
            java.lang.String r8 = b2.b.c
            java.lang.String r9 = "content or privateKey is null , or length is too short"
            c2.g.d(r8, r9)
            return r1
    }

    @java.lang.Deprecated
    public static boolean n(java.lang.String r1, java.lang.String r2, java.lang.String r3) {
            r0 = 0
            boolean r1 = c(r1, r2, r3, r0)
            return r1
    }

    @java.lang.Deprecated
    public static boolean o(java.lang.String r1, java.lang.String r2, java.security.PublicKey r3) {
            r0 = 0
            boolean r1 = d(r1, r2, r3, r0)
            return r1
    }

    public static boolean p(java.nio.ByteBuffer r8, byte[] r9, java.security.PublicKey r10, boolean r11) {
            r1 = 0
            if (r8 == 0) goto L78
            if (r10 == 0) goto L78
            if (r9 == 0) goto L78
            r0 = r10
            java.security.interfaces.RSAPublicKey r0 = (java.security.interfaces.RSAPublicKey) r0
            boolean r0 = b2.a.i(r0)
            if (r0 != 0) goto L11
            goto L78
        L11:
            if (r11 == 0) goto L31
            java.lang.String r11 = "SHA256WithRSA/PSS"
            java.security.Signature r11 = java.security.Signature.getInstance(r11)     // Catch: java.lang.Exception -> L2b java.security.GeneralSecurityException -> L2e
            java.security.spec.PSSParameterSpec r2 = new java.security.spec.PSSParameterSpec     // Catch: java.lang.Exception -> L2b java.security.GeneralSecurityException -> L2e
            java.lang.String r3 = "SHA-256"
            java.lang.String r4 = "MGF1"
            java.security.spec.MGF1ParameterSpec r5 = java.security.spec.MGF1ParameterSpec.SHA256     // Catch: java.lang.Exception -> L2b java.security.GeneralSecurityException -> L2e
            r6 = 32
            r7 = 1
            r2.<init>(r3, r4, r5, r6, r7)     // Catch: java.lang.Exception -> L2b java.security.GeneralSecurityException -> L2e
            r11.setParameter(r2)     // Catch: java.lang.Exception -> L2b java.security.GeneralSecurityException -> L2e
            goto L37
        L2b:
            r0 = move-exception
            r8 = r0
            goto L42
        L2e:
            r0 = move-exception
            r8 = r0
            goto L5d
        L31:
            java.lang.String r11 = "SHA256WithRSA"
            java.security.Signature r11 = java.security.Signature.getInstance(r11)     // Catch: java.lang.Exception -> L2b java.security.GeneralSecurityException -> L2e
        L37:
            r11.initVerify(r10)     // Catch: java.lang.Exception -> L2b java.security.GeneralSecurityException -> L2e
            r11.update(r8)     // Catch: java.lang.Exception -> L2b java.security.GeneralSecurityException -> L2e
            boolean r8 = r11.verify(r9)     // Catch: java.lang.Exception -> L2b java.security.GeneralSecurityException -> L2e
            return r8
        L42:
            java.lang.String r9 = b2.b.c
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "exception : "
            r10.append(r11)
            java.lang.String r8 = r8.getMessage()
            r10.append(r8)
            java.lang.String r8 = r10.toString()
            c2.g.d(r9, r8)
            goto L77
        L5d:
            java.lang.String r9 = b2.b.c
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "check sign exception: "
            r10.append(r11)
            java.lang.String r8 = r8.getMessage()
            r10.append(r8)
            java.lang.String r8 = r10.toString()
            c2.g.d(r9, r8)
        L77:
            return r1
        L78:
            java.lang.String r8 = b2.b.c
            java.lang.String r9 = "content or publicKey is null , or length is too short"
            c2.g.d(r8, r9)
            return r1
    }

    public static boolean q(byte[] r8, byte[] r9, java.security.PublicKey r10, boolean r11) {
            r1 = 0
            if (r8 == 0) goto L78
            if (r10 == 0) goto L78
            if (r9 == 0) goto L78
            r0 = r10
            java.security.interfaces.RSAPublicKey r0 = (java.security.interfaces.RSAPublicKey) r0
            boolean r0 = b2.a.i(r0)
            if (r0 != 0) goto L11
            goto L78
        L11:
            if (r11 == 0) goto L31
            java.lang.String r11 = "SHA256WithRSA/PSS"
            java.security.Signature r11 = java.security.Signature.getInstance(r11)     // Catch: java.lang.Exception -> L2b java.security.GeneralSecurityException -> L2e
            java.security.spec.PSSParameterSpec r2 = new java.security.spec.PSSParameterSpec     // Catch: java.lang.Exception -> L2b java.security.GeneralSecurityException -> L2e
            java.lang.String r3 = "SHA-256"
            java.lang.String r4 = "MGF1"
            java.security.spec.MGF1ParameterSpec r5 = java.security.spec.MGF1ParameterSpec.SHA256     // Catch: java.lang.Exception -> L2b java.security.GeneralSecurityException -> L2e
            r6 = 32
            r7 = 1
            r2.<init>(r3, r4, r5, r6, r7)     // Catch: java.lang.Exception -> L2b java.security.GeneralSecurityException -> L2e
            r11.setParameter(r2)     // Catch: java.lang.Exception -> L2b java.security.GeneralSecurityException -> L2e
            goto L37
        L2b:
            r0 = move-exception
            r8 = r0
            goto L42
        L2e:
            r0 = move-exception
            r8 = r0
            goto L5d
        L31:
            java.lang.String r11 = "SHA256WithRSA"
            java.security.Signature r11 = java.security.Signature.getInstance(r11)     // Catch: java.lang.Exception -> L2b java.security.GeneralSecurityException -> L2e
        L37:
            r11.initVerify(r10)     // Catch: java.lang.Exception -> L2b java.security.GeneralSecurityException -> L2e
            r11.update(r8)     // Catch: java.lang.Exception -> L2b java.security.GeneralSecurityException -> L2e
            boolean r8 = r11.verify(r9)     // Catch: java.lang.Exception -> L2b java.security.GeneralSecurityException -> L2e
            return r8
        L42:
            java.lang.String r9 = b2.b.c
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "exception : "
            r10.append(r11)
            java.lang.String r8 = r8.getMessage()
            r10.append(r8)
            java.lang.String r8 = r10.toString()
            c2.g.d(r9, r8)
            goto L77
        L5d:
            java.lang.String r9 = b2.b.c
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "check sign exception: "
            r10.append(r11)
            java.lang.String r8 = r8.getMessage()
            r10.append(r8)
            java.lang.String r8 = r10.toString()
            c2.g.d(r9, r8)
        L77:
            return r1
        L78:
            java.lang.String r8 = b2.b.c
            java.lang.String r9 = "content or publicKey is null , or length is too short"
            c2.g.d(r8, r9)
            return r1
    }
}
