package z1;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class h {
    private static final java.lang.String a = "GCMKS";
    private static final java.lang.String b = "AndroidKeyStore";
    private static final java.lang.String c = "AES/GCM/NoPadding";
    private static final java.lang.String d = "";
    private static final int e = 12;
    private static final int f = 256;
    private static java.util.Map<java.lang.String, javax.crypto.SecretKey> g;

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            z1.h.g = r0
            return
    }

    public h() {
            r0 = this;
            r0.<init>()
            return
    }

    private static javax.crypto.SecretKey a(java.lang.String r5) {
            java.lang.String r0 = "AndroidKeyStore"
            java.lang.String r1 = "load key"
            java.lang.String r2 = "GCMKS"
            c2.g.e(r2, r1)
            r1 = 0
            java.security.KeyStore r3 = java.security.KeyStore.getInstance(r0)     // Catch: java.lang.Exception -> L1e java.security.NoSuchProviderException -> L20 java.security.InvalidAlgorithmParameterException -> L22 java.security.UnrecoverableKeyException -> L25 java.security.NoSuchAlgorithmException -> L28 java.security.cert.CertificateException -> L2b java.io.IOException -> L2e java.security.KeyStoreException -> L31
            r3.load(r1)     // Catch: java.lang.Exception -> L1e java.security.NoSuchProviderException -> L20 java.security.InvalidAlgorithmParameterException -> L22 java.security.UnrecoverableKeyException -> L25 java.security.NoSuchAlgorithmException -> L28 java.security.cert.CertificateException -> L2b java.io.IOException -> L2e java.security.KeyStoreException -> L31
            java.security.Key r3 = r3.getKey(r5, r1)     // Catch: java.lang.Exception -> L1e java.security.NoSuchProviderException -> L20 java.security.InvalidAlgorithmParameterException -> L22 java.security.UnrecoverableKeyException -> L25 java.security.NoSuchAlgorithmException -> L28 java.security.cert.CertificateException -> L2b java.io.IOException -> L2e java.security.KeyStoreException -> L31
            boolean r4 = r3 instanceof javax.crypto.SecretKey     // Catch: java.lang.Exception -> L1e java.security.NoSuchProviderException -> L20 java.security.InvalidAlgorithmParameterException -> L22 java.security.UnrecoverableKeyException -> L25 java.security.NoSuchAlgorithmException -> L28 java.security.cert.CertificateException -> L2b java.io.IOException -> L2e java.security.KeyStoreException -> L31
            if (r4 == 0) goto L34
            javax.crypto.SecretKey r3 = (javax.crypto.SecretKey) r3     // Catch: java.lang.Exception -> L1e java.security.NoSuchProviderException -> L20 java.security.InvalidAlgorithmParameterException -> L22 java.security.UnrecoverableKeyException -> L25 java.security.NoSuchAlgorithmException -> L28 java.security.cert.CertificateException -> L2b java.io.IOException -> L2e java.security.KeyStoreException -> L31
            r1 = r3
            goto L139
        L1e:
            r0 = move-exception
            goto L6f
        L20:
            r0 = move-exception
            goto L89
        L22:
            r0 = move-exception
            goto La3
        L25:
            r0 = move-exception
            goto Lbd
        L28:
            r0 = move-exception
            goto Ld6
        L2b:
            r0 = move-exception
            goto Lef
        L2e:
            r0 = move-exception
            goto L108
        L31:
            r0 = move-exception
            goto L121
        L34:
            java.lang.String r3 = "generate key"
            c2.g.e(r2, r3)     // Catch: java.lang.Exception -> L1e java.security.NoSuchProviderException -> L20 java.security.InvalidAlgorithmParameterException -> L22 java.security.UnrecoverableKeyException -> L25 java.security.NoSuchAlgorithmException -> L28 java.security.cert.CertificateException -> L2b java.io.IOException -> L2e java.security.KeyStoreException -> L31
            java.lang.String r3 = "AES"
            javax.crypto.KeyGenerator r0 = javax.crypto.KeyGenerator.getInstance(r3, r0)     // Catch: java.lang.Exception -> L1e java.security.NoSuchProviderException -> L20 java.security.InvalidAlgorithmParameterException -> L22 java.security.UnrecoverableKeyException -> L25 java.security.NoSuchAlgorithmException -> L28 java.security.cert.CertificateException -> L2b java.io.IOException -> L2e java.security.KeyStoreException -> L31
            z1.f.a()     // Catch: java.lang.Exception -> L1e java.security.NoSuchProviderException -> L20 java.security.InvalidAlgorithmParameterException -> L22 java.security.UnrecoverableKeyException -> L25 java.security.NoSuchAlgorithmException -> L28 java.security.cert.CertificateException -> L2b java.io.IOException -> L2e java.security.KeyStoreException -> L31
            r3 = 3
            android.security.keystore.KeyGenParameterSpec$Builder r3 = z1.e.a(r5, r3)     // Catch: java.lang.Exception -> L1e java.security.NoSuchProviderException -> L20 java.security.InvalidAlgorithmParameterException -> L22 java.security.UnrecoverableKeyException -> L25 java.security.NoSuchAlgorithmException -> L28 java.security.cert.CertificateException -> L2b java.io.IOException -> L2e java.security.KeyStoreException -> L31
            java.lang.String r4 = "GCM"
            java.lang.String[] r4 = new java.lang.String[]{r4}     // Catch: java.lang.Exception -> L1e java.security.NoSuchProviderException -> L20 java.security.InvalidAlgorithmParameterException -> L22 java.security.UnrecoverableKeyException -> L25 java.security.NoSuchAlgorithmException -> L28 java.security.cert.CertificateException -> L2b java.io.IOException -> L2e java.security.KeyStoreException -> L31
            android.security.keystore.KeyGenParameterSpec$Builder r3 = z1.a.a(r3, r4)     // Catch: java.lang.Exception -> L1e java.security.NoSuchProviderException -> L20 java.security.InvalidAlgorithmParameterException -> L22 java.security.UnrecoverableKeyException -> L25 java.security.NoSuchAlgorithmException -> L28 java.security.cert.CertificateException -> L2b java.io.IOException -> L2e java.security.KeyStoreException -> L31
            java.lang.String r4 = "NoPadding"
            java.lang.String[] r4 = new java.lang.String[]{r4}     // Catch: java.lang.Exception -> L1e java.security.NoSuchProviderException -> L20 java.security.InvalidAlgorithmParameterException -> L22 java.security.UnrecoverableKeyException -> L25 java.security.NoSuchAlgorithmException -> L28 java.security.cert.CertificateException -> L2b java.io.IOException -> L2e java.security.KeyStoreException -> L31
            android.security.keystore.KeyGenParameterSpec$Builder r3 = z1.b.a(r3, r4)     // Catch: java.lang.Exception -> L1e java.security.NoSuchProviderException -> L20 java.security.InvalidAlgorithmParameterException -> L22 java.security.UnrecoverableKeyException -> L25 java.security.NoSuchAlgorithmException -> L28 java.security.cert.CertificateException -> L2b java.io.IOException -> L2e java.security.KeyStoreException -> L31
            r4 = 256(0x100, float:3.59E-43)
            android.security.keystore.KeyGenParameterSpec$Builder r3 = z1.c.a(r3, r4)     // Catch: java.lang.Exception -> L1e java.security.NoSuchProviderException -> L20 java.security.InvalidAlgorithmParameterException -> L22 java.security.UnrecoverableKeyException -> L25 java.security.NoSuchAlgorithmException -> L28 java.security.cert.CertificateException -> L2b java.io.IOException -> L2e java.security.KeyStoreException -> L31
            android.security.keystore.KeyGenParameterSpec r3 = z1.d.a(r3)     // Catch: java.lang.Exception -> L1e java.security.NoSuchProviderException -> L20 java.security.InvalidAlgorithmParameterException -> L22 java.security.UnrecoverableKeyException -> L25 java.security.NoSuchAlgorithmException -> L28 java.security.cert.CertificateException -> L2b java.io.IOException -> L2e java.security.KeyStoreException -> L31
            r0.init(r3)     // Catch: java.lang.Exception -> L1e java.security.NoSuchProviderException -> L20 java.security.InvalidAlgorithmParameterException -> L22 java.security.UnrecoverableKeyException -> L25 java.security.NoSuchAlgorithmException -> L28 java.security.cert.CertificateException -> L2b java.io.IOException -> L2e java.security.KeyStoreException -> L31
            javax.crypto.SecretKey r0 = r0.generateKey()     // Catch: java.lang.Exception -> L1e java.security.NoSuchProviderException -> L20 java.security.InvalidAlgorithmParameterException -> L22 java.security.UnrecoverableKeyException -> L25 java.security.NoSuchAlgorithmException -> L28 java.security.cert.CertificateException -> L2b java.io.IOException -> L2e java.security.KeyStoreException -> L31
            r1 = r0
            goto L139
        L6f:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Exception: "
            r3.append(r4)
            java.lang.String r0 = r0.getMessage()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            c2.g.d(r2, r0)
            goto L139
        L89:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "NoSuchProviderException : "
            r3.append(r4)
            java.lang.String r0 = r0.getMessage()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            c2.g.d(r2, r0)
            goto L139
        La3:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "InvalidAlgorithmParameterException : "
            r3.append(r4)
            java.lang.String r0 = r0.getMessage()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            c2.g.d(r2, r0)
            goto L139
        Lbd:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "UnrecoverableKeyException : "
            r3.append(r4)
            java.lang.String r0 = r0.getMessage()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            c2.g.d(r2, r0)
            goto L139
        Ld6:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "NoSuchAlgorithmException : "
            r3.append(r4)
            java.lang.String r0 = r0.getMessage()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            c2.g.d(r2, r0)
            goto L139
        Lef:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "CertificateException : "
            r3.append(r4)
            java.lang.String r0 = r0.getMessage()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            c2.g.d(r2, r0)
            goto L139
        L108:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "IOException : "
            r3.append(r4)
            java.lang.String r0 = r0.getMessage()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            c2.g.d(r2, r0)
            goto L139
        L121:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "KeyStoreException : "
            r3.append(r4)
            java.lang.String r0 = r0.getMessage()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            c2.g.d(r2, r0)
        L139:
            java.util.Map<java.lang.String, javax.crypto.SecretKey> r0 = z1.h.g
            r0.put(r5, r1)
            return r1
    }

    private static boolean b() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    private static javax.crypto.SecretKey c(java.lang.String r1) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L8
            r1 = 0
            return r1
        L8:
            java.util.Map<java.lang.String, javax.crypto.SecretKey> r0 = z1.h.g
            java.lang.Object r0 = r0.get(r1)
            if (r0 != 0) goto L13
            a(r1)
        L13:
            java.util.Map<java.lang.String, javax.crypto.SecretKey> r0 = z1.h.g
            java.lang.Object r1 = r0.get(r1)
            javax.crypto.SecretKey r1 = (javax.crypto.SecretKey) r1
            return r1
    }

    public static java.lang.String d(java.lang.String r3, java.lang.String r4) {
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            java.lang.String r1 = ""
            java.lang.String r2 = "GCMKS"
            if (r0 != 0) goto L3b
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 == 0) goto L11
            goto L3b
        L11:
            java.lang.String r0 = new java.lang.String     // Catch: java.io.UnsupportedEncodingException -> L21
            byte[] r4 = c2.c.c(r4)     // Catch: java.io.UnsupportedEncodingException -> L21
            byte[] r3 = e(r3, r4)     // Catch: java.io.UnsupportedEncodingException -> L21
            java.lang.String r4 = "UTF-8"
            r0.<init>(r3, r4)     // Catch: java.io.UnsupportedEncodingException -> L21
            return r0
        L21:
            r3 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "decrypt: UnsupportedEncodingException : "
            r4.append(r0)
            java.lang.String r3 = r3.getMessage()
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            c2.g.d(r2, r3)
            return r1
        L3b:
            java.lang.String r3 = "alias or encrypt content is null"
            c2.g.d(r2, r3)
            return r1
    }

    public static byte[] e(java.lang.String r4, byte[] r5) {
            r0 = 0
            byte[] r0 = new byte[r0]
            boolean r1 = android.text.TextUtils.isEmpty(r4)
            java.lang.String r2 = "GCMKS"
            if (r1 != 0) goto L2e
            if (r5 != 0) goto Le
            goto L2e
        Le:
            boolean r1 = b()
            if (r1 != 0) goto L1a
            java.lang.String r4 = "sdk version is too low"
            c2.g.d(r2, r4)
            return r0
        L1a:
            int r1 = r5.length
            r3 = 12
            if (r1 > r3) goto L25
            java.lang.String r4 = "Decrypt source data is invalid."
            c2.g.d(r2, r4)
            return r0
        L25:
            javax.crypto.SecretKey r4 = c(r4)
            byte[] r4 = f(r4, r5)
            return r4
        L2e:
            java.lang.String r4 = "alias or encrypt content is null"
            c2.g.d(r2, r4)
            return r0
    }

    public static byte[] f(javax.crypto.SecretKey r7, byte[] r8) {
            r0 = 0
            byte[] r0 = new byte[r0]
            java.lang.String r1 = "GCMKS"
            if (r7 != 0) goto Ld
            java.lang.String r7 = "Decrypt secret key is null"
            c2.g.d(r1, r7)
            return r0
        Ld:
            if (r8 != 0) goto L15
            java.lang.String r7 = "content is null"
            c2.g.d(r1, r7)
            return r0
        L15:
            boolean r2 = b()
            if (r2 != 0) goto L21
            java.lang.String r7 = "sdk version is too low"
            c2.g.d(r1, r7)
            return r0
        L21:
            int r2 = r8.length
            r3 = 12
            if (r2 > r3) goto L2c
            java.lang.String r7 = "Decrypt source data is invalid."
            c2.g.d(r1, r7)
            return r0
        L2c:
            byte[] r2 = java.util.Arrays.copyOf(r8, r3)
            java.lang.String r4 = "AES/GCM/NoPadding"
            javax.crypto.Cipher r4 = javax.crypto.Cipher.getInstance(r4)     // Catch: java.lang.Exception -> L48 javax.crypto.BadPaddingException -> L4a javax.crypto.IllegalBlockSizeException -> L4c java.security.InvalidAlgorithmParameterException -> L4e java.security.InvalidKeyException -> L50 javax.crypto.NoSuchPaddingException -> L52 java.security.NoSuchAlgorithmException -> L55
            javax.crypto.spec.GCMParameterSpec r5 = new javax.crypto.spec.GCMParameterSpec     // Catch: java.lang.Exception -> L48 javax.crypto.BadPaddingException -> L4a javax.crypto.IllegalBlockSizeException -> L4c java.security.InvalidAlgorithmParameterException -> L4e java.security.InvalidKeyException -> L50 javax.crypto.NoSuchPaddingException -> L52 java.security.NoSuchAlgorithmException -> L55
            r6 = 128(0x80, float:1.8E-43)
            r5.<init>(r6, r2)     // Catch: java.lang.Exception -> L48 javax.crypto.BadPaddingException -> L4a javax.crypto.IllegalBlockSizeException -> L4c java.security.InvalidAlgorithmParameterException -> L4e java.security.InvalidKeyException -> L50 javax.crypto.NoSuchPaddingException -> L52 java.security.NoSuchAlgorithmException -> L55
            r2 = 2
            r4.init(r2, r7, r5)     // Catch: java.lang.Exception -> L48 javax.crypto.BadPaddingException -> L4a javax.crypto.IllegalBlockSizeException -> L4c java.security.InvalidAlgorithmParameterException -> L4e java.security.InvalidKeyException -> L50 javax.crypto.NoSuchPaddingException -> L52 java.security.NoSuchAlgorithmException -> L55
            int r7 = r8.length     // Catch: java.lang.Exception -> L48 javax.crypto.BadPaddingException -> L4a javax.crypto.IllegalBlockSizeException -> L4c java.security.InvalidAlgorithmParameterException -> L4e java.security.InvalidKeyException -> L50 javax.crypto.NoSuchPaddingException -> L52 java.security.NoSuchAlgorithmException -> L55
            int r7 = r7 - r3
            byte[] r7 = r4.doFinal(r8, r3, r7)     // Catch: java.lang.Exception -> L48 javax.crypto.BadPaddingException -> L4a javax.crypto.IllegalBlockSizeException -> L4c java.security.InvalidAlgorithmParameterException -> L4e java.security.InvalidKeyException -> L50 javax.crypto.NoSuchPaddingException -> L52 java.security.NoSuchAlgorithmException -> L55
            return r7
        L48:
            r7 = move-exception
            goto L58
        L4a:
            r7 = move-exception
            goto L72
        L4c:
            r7 = move-exception
            goto L8c
        L4e:
            r7 = move-exception
            goto La5
        L50:
            r7 = move-exception
            goto Lbe
        L52:
            r7 = move-exception
            goto Ld7
        L55:
            r7 = move-exception
            goto Lf0
        L58:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r2 = "Exception: "
            r8.append(r2)
            java.lang.String r7 = r7.getMessage()
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            c2.g.d(r1, r7)
            goto L108
        L72:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r2 = "BadPaddingException : "
            r8.append(r2)
            java.lang.String r7 = r7.getMessage()
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            c2.g.d(r1, r7)
            goto L108
        L8c:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r2 = "IllegalBlockSizeException : "
            r8.append(r2)
            java.lang.String r7 = r7.getMessage()
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            c2.g.d(r1, r7)
            goto L108
        La5:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r2 = "InvalidAlgorithmParameterException : "
            r8.append(r2)
            java.lang.String r7 = r7.getMessage()
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            c2.g.d(r1, r7)
            goto L108
        Lbe:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r2 = "InvalidKeyException : "
            r8.append(r2)
            java.lang.String r7 = r7.getMessage()
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            c2.g.d(r1, r7)
            goto L108
        Ld7:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r2 = "NoSuchPaddingException : "
            r8.append(r2)
            java.lang.String r7 = r7.getMessage()
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            c2.g.d(r1, r7)
            goto L108
        Lf0:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r2 = "NoSuchAlgorithmException : "
            r8.append(r2)
            java.lang.String r7 = r7.getMessage()
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            c2.g.d(r1, r7)
        L108:
            return r0
    }

    public static java.lang.String g(java.lang.String r3, java.lang.String r4) {
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            java.lang.String r1 = ""
            java.lang.String r2 = "GCMKS"
            if (r0 != 0) goto L3a
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 == 0) goto L11
            goto L3a
        L11:
            java.lang.String r0 = "UTF-8"
            byte[] r4 = r4.getBytes(r0)     // Catch: java.io.UnsupportedEncodingException -> L20
            byte[] r3 = h(r3, r4)     // Catch: java.io.UnsupportedEncodingException -> L20
            java.lang.String r3 = c2.c.b(r3)     // Catch: java.io.UnsupportedEncodingException -> L20
            return r3
        L20:
            r3 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "encrypt: UnsupportedEncodingException : "
            r4.append(r0)
            java.lang.String r3 = r3.getMessage()
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            c2.g.d(r2, r3)
            return r1
        L3a:
            java.lang.String r3 = "alias or encrypt content is null"
            c2.g.d(r2, r3)
            return r1
    }

    public static byte[] h(java.lang.String r3, byte[] r4) {
            r0 = 0
            byte[] r0 = new byte[r0]
            boolean r1 = android.text.TextUtils.isEmpty(r3)
            java.lang.String r2 = "GCMKS"
            if (r1 != 0) goto L23
            if (r4 != 0) goto Le
            goto L23
        Le:
            boolean r1 = b()
            if (r1 != 0) goto L1a
            java.lang.String r3 = "sdk version is too low"
            c2.g.d(r2, r3)
            return r0
        L1a:
            javax.crypto.SecretKey r3 = c(r3)
            byte[] r3 = i(r3, r4)
            return r3
        L23:
            java.lang.String r3 = "alias or encrypt content is null"
            c2.g.d(r2, r3)
            return r0
    }

    public static byte[] i(javax.crypto.SecretKey r5, byte[] r6) {
            r0 = 0
            byte[] r1 = new byte[r0]
            java.lang.String r2 = "GCMKS"
            if (r6 != 0) goto Ld
            java.lang.String r5 = "content is null"
            c2.g.d(r2, r5)
            return r1
        Ld:
            if (r5 != 0) goto L15
            java.lang.String r5 = "secret key is null"
            c2.g.d(r2, r5)
            return r1
        L15:
            boolean r3 = b()
            if (r3 != 0) goto L21
            java.lang.String r5 = "sdk version is too low"
            c2.g.d(r2, r5)
            return r1
        L21:
            java.lang.String r3 = "AES/GCM/NoPadding"
            javax.crypto.Cipher r3 = javax.crypto.Cipher.getInstance(r3)     // Catch: java.lang.Exception -> L48 java.security.InvalidKeyException -> L4a javax.crypto.IllegalBlockSizeException -> L4c javax.crypto.BadPaddingException -> L4e javax.crypto.NoSuchPaddingException -> L50 java.security.NoSuchAlgorithmException -> L52
            r4 = 1
            r3.init(r4, r5)     // Catch: java.lang.Exception -> L48 java.security.InvalidKeyException -> L4a javax.crypto.IllegalBlockSizeException -> L4c javax.crypto.BadPaddingException -> L4e javax.crypto.NoSuchPaddingException -> L50 java.security.NoSuchAlgorithmException -> L52
            byte[] r5 = r3.doFinal(r6)     // Catch: java.lang.Exception -> L48 java.security.InvalidKeyException -> L4a javax.crypto.IllegalBlockSizeException -> L4c javax.crypto.BadPaddingException -> L4e javax.crypto.NoSuchPaddingException -> L50 java.security.NoSuchAlgorithmException -> L52
            byte[] r6 = r3.getIV()     // Catch: java.lang.Exception -> L48 java.security.InvalidKeyException -> L4a javax.crypto.IllegalBlockSizeException -> L4c javax.crypto.BadPaddingException -> L4e javax.crypto.NoSuchPaddingException -> L50 java.security.NoSuchAlgorithmException -> L52
            if (r6 == 0) goto L55
            int r3 = r6.length     // Catch: java.lang.Exception -> L48 java.security.InvalidKeyException -> L4a javax.crypto.IllegalBlockSizeException -> L4c javax.crypto.BadPaddingException -> L4e javax.crypto.NoSuchPaddingException -> L50 java.security.NoSuchAlgorithmException -> L52
            r4 = 12
            if (r3 == r4) goto L3b
            goto L55
        L3b:
            int r3 = r6.length     // Catch: java.lang.Exception -> L48 java.security.InvalidKeyException -> L4a javax.crypto.IllegalBlockSizeException -> L4c javax.crypto.BadPaddingException -> L4e javax.crypto.NoSuchPaddingException -> L50 java.security.NoSuchAlgorithmException -> L52
            int r4 = r5.length     // Catch: java.lang.Exception -> L48 java.security.InvalidKeyException -> L4a javax.crypto.IllegalBlockSizeException -> L4c javax.crypto.BadPaddingException -> L4e javax.crypto.NoSuchPaddingException -> L50 java.security.NoSuchAlgorithmException -> L52
            int r3 = r3 + r4
            byte[] r1 = java.util.Arrays.copyOf(r6, r3)     // Catch: java.lang.Exception -> L48 java.security.InvalidKeyException -> L4a javax.crypto.IllegalBlockSizeException -> L4c javax.crypto.BadPaddingException -> L4e javax.crypto.NoSuchPaddingException -> L50 java.security.NoSuchAlgorithmException -> L52
            int r6 = r6.length     // Catch: java.lang.Exception -> L48 java.security.InvalidKeyException -> L4a javax.crypto.IllegalBlockSizeException -> L4c javax.crypto.BadPaddingException -> L4e javax.crypto.NoSuchPaddingException -> L50 java.security.NoSuchAlgorithmException -> L52
            int r3 = r5.length     // Catch: java.lang.Exception -> L48 java.security.InvalidKeyException -> L4a javax.crypto.IllegalBlockSizeException -> L4c javax.crypto.BadPaddingException -> L4e javax.crypto.NoSuchPaddingException -> L50 java.security.NoSuchAlgorithmException -> L52
            java.lang.System.arraycopy(r5, r0, r1, r6, r3)     // Catch: java.lang.Exception -> L48 java.security.InvalidKeyException -> L4a javax.crypto.IllegalBlockSizeException -> L4c javax.crypto.BadPaddingException -> L4e javax.crypto.NoSuchPaddingException -> L50 java.security.NoSuchAlgorithmException -> L52
            return r1
        L48:
            r5 = move-exception
            goto L5b
        L4a:
            r5 = move-exception
            goto L75
        L4c:
            r5 = move-exception
            goto L8e
        L4e:
            r5 = move-exception
            goto La7
        L50:
            r5 = move-exception
            goto Lc0
        L52:
            r5 = move-exception
            goto Ld9
        L55:
            java.lang.String r5 = "IV is invalid."
            c2.g.d(r2, r5)     // Catch: java.lang.Exception -> L48 java.security.InvalidKeyException -> L4a javax.crypto.IllegalBlockSizeException -> L4c javax.crypto.BadPaddingException -> L4e javax.crypto.NoSuchPaddingException -> L50 java.security.NoSuchAlgorithmException -> L52
            return r1
        L5b:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "Exception: "
            r6.append(r0)
            java.lang.String r5 = r5.getMessage()
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            c2.g.d(r2, r5)
            goto Lf1
        L75:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "InvalidKeyException : "
            r6.append(r0)
            java.lang.String r5 = r5.getMessage()
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            c2.g.d(r2, r5)
            goto Lf1
        L8e:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "IllegalBlockSizeException : "
            r6.append(r0)
            java.lang.String r5 = r5.getMessage()
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            c2.g.d(r2, r5)
            goto Lf1
        La7:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "BadPaddingException : "
            r6.append(r0)
            java.lang.String r5 = r5.getMessage()
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            c2.g.d(r2, r5)
            goto Lf1
        Lc0:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "NoSuchPaddingException : "
            r6.append(r0)
            java.lang.String r5 = r5.getMessage()
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            c2.g.d(r2, r5)
            goto Lf1
        Ld9:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "NoSuchAlgorithmException : "
            r6.append(r0)
            java.lang.String r5 = r5.getMessage()
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            c2.g.d(r2, r5)
        Lf1:
            return r1
    }
}
