package a2;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public abstract class b {
    private static final java.lang.String a = "RSAEncryptKS";
    private static final java.lang.String b = "AndroidKeyStore";
    private static final java.lang.String c = "RSA/ECB/OAEPWithSHA-256AndMGF1Padding";
    private static final java.lang.String d = "";
    private static final int e = 2048;
    private static final int f = 3072;

    static {
            return
    }

    public b() {
            r0 = this;
            r0.<init>()
            return
    }

    private static synchronized java.security.KeyPair a(java.lang.String r4, boolean r5) {
            java.lang.Class<a2.b> r0 = a2.b.class
            monitor-enter(r0)
            boolean r1 = f(r4)     // Catch: java.lang.Throwable -> L13
            r2 = 0
            if (r1 == 0) goto L16
            java.lang.String r4 = a2.b.a     // Catch: java.lang.Throwable -> L13
            java.lang.String r5 = "Key pair exits"
            c2.g.d(r4, r5)     // Catch: java.lang.Throwable -> L13
            monitor-exit(r0)
            return r2
        L13:
            r4 = move-exception
            goto Lf8
        L16:
            java.lang.String r1 = a2.b.a     // Catch: java.lang.Throwable -> L13
            java.lang.String r3 = "generate key pair."
            c2.g.e(r1, r3)     // Catch: java.lang.Throwable -> L13
            java.lang.String r1 = "RSA"
            java.lang.String r3 = "AndroidKeyStore"
            java.security.KeyPairGenerator r1 = java.security.KeyPairGenerator.getInstance(r1, r3)     // Catch: java.lang.Throwable -> L13 java.lang.Exception -> L53 java.security.InvalidAlgorithmParameterException -> L55 java.security.NoSuchProviderException -> L57 java.security.NoSuchAlgorithmException -> L59
            r3 = 2
            if (r5 != 0) goto L5c
            z1.f.a()     // Catch: java.lang.Throwable -> L13 java.lang.Exception -> L53 java.security.InvalidAlgorithmParameterException -> L55 java.security.NoSuchProviderException -> L57 java.security.NoSuchAlgorithmException -> L59
            android.security.keystore.KeyGenParameterSpec$Builder r4 = z1.e.a(r4, r3)     // Catch: java.lang.Throwable -> L13 java.lang.Exception -> L53 java.security.InvalidAlgorithmParameterException -> L55 java.security.NoSuchProviderException -> L57 java.security.NoSuchAlgorithmException -> L59
            java.lang.String r5 = "SHA-256"
            java.lang.String r3 = "SHA-512"
            java.lang.String[] r5 = new java.lang.String[]{r5, r3}     // Catch: java.lang.Throwable -> L13 java.lang.Exception -> L53 java.security.InvalidAlgorithmParameterException -> L55 java.security.NoSuchProviderException -> L57 java.security.NoSuchAlgorithmException -> L59
            android.security.keystore.KeyGenParameterSpec$Builder r4 = a2.a.a(r4, r5)     // Catch: java.lang.Throwable -> L13 java.lang.Exception -> L53 java.security.InvalidAlgorithmParameterException -> L55 java.security.NoSuchProviderException -> L57 java.security.NoSuchAlgorithmException -> L59
            java.lang.String r5 = "OAEPPadding"
            java.lang.String[] r5 = new java.lang.String[]{r5}     // Catch: java.lang.Throwable -> L13 java.lang.Exception -> L53 java.security.InvalidAlgorithmParameterException -> L55 java.security.NoSuchProviderException -> L57 java.security.NoSuchAlgorithmException -> L59
            android.security.keystore.KeyGenParameterSpec$Builder r4 = z1.b.a(r4, r5)     // Catch: java.lang.Throwable -> L13 java.lang.Exception -> L53 java.security.InvalidAlgorithmParameterException -> L55 java.security.NoSuchProviderException -> L57 java.security.NoSuchAlgorithmException -> L59
            r5 = 2048(0x800, float:2.87E-42)
            android.security.keystore.KeyGenParameterSpec$Builder r4 = z1.c.a(r4, r5)     // Catch: java.lang.Throwable -> L13 java.lang.Exception -> L53 java.security.InvalidAlgorithmParameterException -> L55 java.security.NoSuchProviderException -> L57 java.security.NoSuchAlgorithmException -> L59
            android.security.keystore.KeyGenParameterSpec r4 = z1.d.a(r4)     // Catch: java.lang.Throwable -> L13 java.lang.Exception -> L53 java.security.InvalidAlgorithmParameterException -> L55 java.security.NoSuchProviderException -> L57 java.security.NoSuchAlgorithmException -> L59
            r1.initialize(r4)     // Catch: java.lang.Throwable -> L13 java.lang.Exception -> L53 java.security.InvalidAlgorithmParameterException -> L55 java.security.NoSuchProviderException -> L57 java.security.NoSuchAlgorithmException -> L59
            goto L86
        L53:
            r4 = move-exception
            goto L8b
        L55:
            r4 = move-exception
            goto La6
        L57:
            r4 = move-exception
            goto Lc1
        L59:
            r4 = move-exception
            goto Ldc
        L5c:
            z1.f.a()     // Catch: java.lang.Throwable -> L13 java.lang.Exception -> L53 java.security.InvalidAlgorithmParameterException -> L55 java.security.NoSuchProviderException -> L57 java.security.NoSuchAlgorithmException -> L59
            android.security.keystore.KeyGenParameterSpec$Builder r4 = z1.e.a(r4, r3)     // Catch: java.lang.Throwable -> L13 java.lang.Exception -> L53 java.security.InvalidAlgorithmParameterException -> L55 java.security.NoSuchProviderException -> L57 java.security.NoSuchAlgorithmException -> L59
            java.lang.String r5 = "SHA-256"
            java.lang.String r3 = "SHA-512"
            java.lang.String[] r5 = new java.lang.String[]{r5, r3}     // Catch: java.lang.Throwable -> L13 java.lang.Exception -> L53 java.security.InvalidAlgorithmParameterException -> L55 java.security.NoSuchProviderException -> L57 java.security.NoSuchAlgorithmException -> L59
            android.security.keystore.KeyGenParameterSpec$Builder r4 = a2.a.a(r4, r5)     // Catch: java.lang.Throwable -> L13 java.lang.Exception -> L53 java.security.InvalidAlgorithmParameterException -> L55 java.security.NoSuchProviderException -> L57 java.security.NoSuchAlgorithmException -> L59
            java.lang.String r5 = "OAEPPadding"
            java.lang.String[] r5 = new java.lang.String[]{r5}     // Catch: java.lang.Throwable -> L13 java.lang.Exception -> L53 java.security.InvalidAlgorithmParameterException -> L55 java.security.NoSuchProviderException -> L57 java.security.NoSuchAlgorithmException -> L59
            android.security.keystore.KeyGenParameterSpec$Builder r4 = z1.b.a(r4, r5)     // Catch: java.lang.Throwable -> L13 java.lang.Exception -> L53 java.security.InvalidAlgorithmParameterException -> L55 java.security.NoSuchProviderException -> L57 java.security.NoSuchAlgorithmException -> L59
            r5 = 3072(0xc00, float:4.305E-42)
            android.security.keystore.KeyGenParameterSpec$Builder r4 = z1.c.a(r4, r5)     // Catch: java.lang.Throwable -> L13 java.lang.Exception -> L53 java.security.InvalidAlgorithmParameterException -> L55 java.security.NoSuchProviderException -> L57 java.security.NoSuchAlgorithmException -> L59
            android.security.keystore.KeyGenParameterSpec r4 = z1.d.a(r4)     // Catch: java.lang.Throwable -> L13 java.lang.Exception -> L53 java.security.InvalidAlgorithmParameterException -> L55 java.security.NoSuchProviderException -> L57 java.security.NoSuchAlgorithmException -> L59
            r1.initialize(r4)     // Catch: java.lang.Throwable -> L13 java.lang.Exception -> L53 java.security.InvalidAlgorithmParameterException -> L55 java.security.NoSuchProviderException -> L57 java.security.NoSuchAlgorithmException -> L59
        L86:
            java.security.KeyPair r2 = r1.generateKeyPair()     // Catch: java.lang.Throwable -> L13 java.lang.Exception -> L53 java.security.InvalidAlgorithmParameterException -> L55 java.security.NoSuchProviderException -> L57 java.security.NoSuchAlgorithmException -> L59
            goto Lf6
        L8b:
            java.lang.String r5 = a2.b.a     // Catch: java.lang.Throwable -> L13
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            java.lang.String r3 = "Exception: "
            r1.append(r3)     // Catch: java.lang.Throwable -> L13
            java.lang.String r4 = r4.getMessage()     // Catch: java.lang.Throwable -> L13
            r1.append(r4)     // Catch: java.lang.Throwable -> L13
            java.lang.String r4 = r1.toString()     // Catch: java.lang.Throwable -> L13
            c2.g.d(r5, r4)     // Catch: java.lang.Throwable -> L13
            goto Lf6
        La6:
            java.lang.String r5 = a2.b.a     // Catch: java.lang.Throwable -> L13
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            java.lang.String r3 = "InvalidAlgorithmParameterException: "
            r1.append(r3)     // Catch: java.lang.Throwable -> L13
            java.lang.String r4 = r4.getMessage()     // Catch: java.lang.Throwable -> L13
            r1.append(r4)     // Catch: java.lang.Throwable -> L13
            java.lang.String r4 = r1.toString()     // Catch: java.lang.Throwable -> L13
            c2.g.d(r5, r4)     // Catch: java.lang.Throwable -> L13
            goto Lf6
        Lc1:
            java.lang.String r5 = a2.b.a     // Catch: java.lang.Throwable -> L13
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            java.lang.String r3 = "NoSuchProviderException: "
            r1.append(r3)     // Catch: java.lang.Throwable -> L13
            java.lang.String r4 = r4.getMessage()     // Catch: java.lang.Throwable -> L13
            r1.append(r4)     // Catch: java.lang.Throwable -> L13
            java.lang.String r4 = r1.toString()     // Catch: java.lang.Throwable -> L13
            c2.g.d(r5, r4)     // Catch: java.lang.Throwable -> L13
            goto Lf6
        Ldc:
            java.lang.String r5 = a2.b.a     // Catch: java.lang.Throwable -> L13
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            java.lang.String r3 = "NoSuchAlgorithmException: "
            r1.append(r3)     // Catch: java.lang.Throwable -> L13
            java.lang.String r4 = r4.getMessage()     // Catch: java.lang.Throwable -> L13
            r1.append(r4)     // Catch: java.lang.Throwable -> L13
            java.lang.String r4 = r1.toString()     // Catch: java.lang.Throwable -> L13
            c2.g.d(r5, r4)     // Catch: java.lang.Throwable -> L13
        Lf6:
            monitor-exit(r0)
            return r2
        Lf8:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r4
    }

    private static java.security.PrivateKey b(java.lang.String r4) {
            boolean r0 = f(r4)
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            java.lang.String r0 = "AndroidKeyStore"
            java.security.KeyStore r0 = java.security.KeyStore.getInstance(r0)     // Catch: java.lang.Exception -> L18 java.io.IOException -> L1a java.security.NoSuchAlgorithmException -> L1c java.security.UnrecoverableKeyException -> L1e java.security.cert.CertificateException -> L20 java.security.KeyStoreException -> L22
            r0.load(r1)     // Catch: java.lang.Exception -> L18 java.io.IOException -> L1a java.security.NoSuchAlgorithmException -> L1c java.security.UnrecoverableKeyException -> L1e java.security.cert.CertificateException -> L20 java.security.KeyStoreException -> L22
            java.security.Key r4 = r0.getKey(r4, r1)     // Catch: java.lang.Exception -> L18 java.io.IOException -> L1a java.security.NoSuchAlgorithmException -> L1c java.security.UnrecoverableKeyException -> L1e java.security.cert.CertificateException -> L20 java.security.KeyStoreException -> L22
            java.security.PrivateKey r4 = (java.security.PrivateKey) r4     // Catch: java.lang.Exception -> L18 java.io.IOException -> L1a java.security.NoSuchAlgorithmException -> L1c java.security.UnrecoverableKeyException -> L1e java.security.cert.CertificateException -> L20 java.security.KeyStoreException -> L22
            return r4
        L18:
            r4 = move-exception
            goto L25
        L1a:
            r4 = move-exception
            goto L41
        L1c:
            r4 = move-exception
            goto L5c
        L1e:
            r4 = move-exception
            goto L77
        L20:
            r4 = move-exception
            goto L92
        L22:
            r4 = move-exception
            goto Lad
        L25:
            java.lang.String r0 = a2.b.a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Exception: "
            r2.append(r3)
            java.lang.String r4 = r4.getMessage()
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            c2.g.d(r0, r4)
            goto Lc7
        L41:
            java.lang.String r0 = a2.b.a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "IOException: "
            r2.append(r3)
            java.lang.String r4 = r4.getMessage()
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            c2.g.d(r0, r4)
            goto Lc7
        L5c:
            java.lang.String r0 = a2.b.a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "NoSuchAlgorithmException: "
            r2.append(r3)
            java.lang.String r4 = r4.getMessage()
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            c2.g.d(r0, r4)
            goto Lc7
        L77:
            java.lang.String r0 = a2.b.a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "UnrecoverableKeyException: "
            r2.append(r3)
            java.lang.String r4 = r4.getMessage()
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            c2.g.d(r0, r4)
            goto Lc7
        L92:
            java.lang.String r0 = a2.b.a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "CertificateException: "
            r2.append(r3)
            java.lang.String r4 = r4.getMessage()
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            c2.g.d(r0, r4)
            goto Lc7
        Lad:
            java.lang.String r0 = a2.b.a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "KeyStoreException: "
            r2.append(r3)
            java.lang.String r4 = r4.getMessage()
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            c2.g.d(r0, r4)
        Lc7:
            return r1
    }

    private static boolean c() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    private static byte[] d(java.lang.String r6, byte[] r7, boolean r8) {
            r0 = 0
            byte[] r0 = new byte[r0]
            boolean r1 = android.text.TextUtils.isEmpty(r6)
            if (r1 != 0) goto L119
            if (r7 != 0) goto Ld
            goto L119
        Ld:
            boolean r1 = c()
            if (r1 != 0) goto L1b
            java.lang.String r6 = a2.b.a
            java.lang.String r7 = "sdk version is too low"
            c2.g.d(r6, r7)
            return r0
        L1b:
            java.security.PublicKey r6 = e(r6, r8)
            if (r6 != 0) goto L29
            java.lang.String r6 = a2.b.a
            java.lang.String r7 = "Public key is null"
            c2.g.d(r6, r7)
            return r0
        L29:
            java.lang.String r8 = "RSA/ECB/OAEPWithSHA-256AndMGF1Padding"
            javax.crypto.Cipher r8 = javax.crypto.Cipher.getInstance(r8)     // Catch: java.lang.Exception -> L4a javax.crypto.BadPaddingException -> L4c javax.crypto.IllegalBlockSizeException -> L4e java.security.InvalidAlgorithmParameterException -> L50 java.security.InvalidKeyException -> L52 javax.crypto.NoSuchPaddingException -> L54 java.security.NoSuchAlgorithmException -> L57
            javax.crypto.spec.OAEPParameterSpec r1 = new javax.crypto.spec.OAEPParameterSpec     // Catch: java.lang.Exception -> L4a javax.crypto.BadPaddingException -> L4c javax.crypto.IllegalBlockSizeException -> L4e java.security.InvalidAlgorithmParameterException -> L50 java.security.InvalidKeyException -> L52 javax.crypto.NoSuchPaddingException -> L54 java.security.NoSuchAlgorithmException -> L57
            java.lang.String r2 = "SHA-256"
            java.lang.String r3 = "MGF1"
            java.security.spec.MGF1ParameterSpec r4 = new java.security.spec.MGF1ParameterSpec     // Catch: java.lang.Exception -> L4a javax.crypto.BadPaddingException -> L4c javax.crypto.IllegalBlockSizeException -> L4e java.security.InvalidAlgorithmParameterException -> L50 java.security.InvalidKeyException -> L52 javax.crypto.NoSuchPaddingException -> L54 java.security.NoSuchAlgorithmException -> L57
            java.lang.String r5 = "SHA-1"
            r4.<init>(r5)     // Catch: java.lang.Exception -> L4a javax.crypto.BadPaddingException -> L4c javax.crypto.IllegalBlockSizeException -> L4e java.security.InvalidAlgorithmParameterException -> L50 java.security.InvalidKeyException -> L52 javax.crypto.NoSuchPaddingException -> L54 java.security.NoSuchAlgorithmException -> L57
            javax.crypto.spec.PSource$PSpecified r5 = javax.crypto.spec.PSource.PSpecified.DEFAULT     // Catch: java.lang.Exception -> L4a javax.crypto.BadPaddingException -> L4c javax.crypto.IllegalBlockSizeException -> L4e java.security.InvalidAlgorithmParameterException -> L50 java.security.InvalidKeyException -> L52 javax.crypto.NoSuchPaddingException -> L54 java.security.NoSuchAlgorithmException -> L57
            r1.<init>(r2, r3, r4, r5)     // Catch: java.lang.Exception -> L4a javax.crypto.BadPaddingException -> L4c javax.crypto.IllegalBlockSizeException -> L4e java.security.InvalidAlgorithmParameterException -> L50 java.security.InvalidKeyException -> L52 javax.crypto.NoSuchPaddingException -> L54 java.security.NoSuchAlgorithmException -> L57
            r2 = 1
            r8.init(r2, r6, r1)     // Catch: java.lang.Exception -> L4a javax.crypto.BadPaddingException -> L4c javax.crypto.IllegalBlockSizeException -> L4e java.security.InvalidAlgorithmParameterException -> L50 java.security.InvalidKeyException -> L52 javax.crypto.NoSuchPaddingException -> L54 java.security.NoSuchAlgorithmException -> L57
            byte[] r6 = r8.doFinal(r7)     // Catch: java.lang.Exception -> L4a javax.crypto.BadPaddingException -> L4c javax.crypto.IllegalBlockSizeException -> L4e java.security.InvalidAlgorithmParameterException -> L50 java.security.InvalidKeyException -> L52 javax.crypto.NoSuchPaddingException -> L54 java.security.NoSuchAlgorithmException -> L57
            return r6
        L4a:
            r6 = move-exception
            goto L5a
        L4c:
            r6 = move-exception
            goto L76
        L4e:
            r6 = move-exception
            goto L92
        L50:
            r6 = move-exception
            goto Lad
        L52:
            r6 = move-exception
            goto Lc8
        L54:
            r6 = move-exception
            goto Le3
        L57:
            r6 = move-exception
            goto Lfe
        L5a:
            java.lang.String r7 = a2.b.a
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r1 = "Exception: "
            r8.append(r1)
            java.lang.String r6 = r6.getMessage()
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            c2.g.d(r7, r6)
            goto L118
        L76:
            java.lang.String r7 = a2.b.a
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r1 = "BadPaddingException: "
            r8.append(r1)
            java.lang.String r6 = r6.getMessage()
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            c2.g.d(r7, r6)
            goto L118
        L92:
            java.lang.String r7 = a2.b.a
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r1 = "IllegalBlockSizeException: "
            r8.append(r1)
            java.lang.String r6 = r6.getMessage()
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            c2.g.d(r7, r6)
            goto L118
        Lad:
            java.lang.String r7 = a2.b.a
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r1 = "InvalidAlgorithmParameterException: "
            r8.append(r1)
            java.lang.String r6 = r6.getMessage()
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            c2.g.d(r7, r6)
            goto L118
        Lc8:
            java.lang.String r7 = a2.b.a
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r1 = "InvalidKeyException: "
            r8.append(r1)
            java.lang.String r6 = r6.getMessage()
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            c2.g.d(r7, r6)
            goto L118
        Le3:
            java.lang.String r7 = a2.b.a
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r1 = "NoSuchPaddingException: "
            r8.append(r1)
            java.lang.String r6 = r6.getMessage()
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            c2.g.d(r7, r6)
            goto L118
        Lfe:
            java.lang.String r7 = a2.b.a
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r1 = "NoSuchAlgorithmException: "
            r8.append(r1)
            java.lang.String r6 = r6.getMessage()
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            c2.g.d(r7, r6)
        L118:
            return r0
        L119:
            java.lang.String r6 = a2.b.a
            java.lang.String r7 = "alias or content is null"
            c2.g.d(r6, r7)
            return r0
    }

    private static java.security.PublicKey e(java.lang.String r1, boolean r2) {
            boolean r0 = f(r1)
            if (r0 != 0) goto L9
            a(r1, r2)
        L9:
            java.security.cert.Certificate r1 = g(r1)
            if (r1 == 0) goto L14
            java.security.PublicKey r1 = r1.getPublicKey()
            return r1
        L14:
            r1 = 0
            return r1
    }

    private static boolean f(java.lang.String r4) {
            r0 = 0
            java.lang.String r1 = "AndroidKeyStore"
            java.security.KeyStore r1 = java.security.KeyStore.getInstance(r1)     // Catch: java.lang.Exception -> L14 java.io.IOException -> L16 java.security.NoSuchAlgorithmException -> L18 java.security.UnrecoverableKeyException -> L1a java.security.cert.CertificateException -> L1c java.security.KeyStoreException -> L1e
            r2 = 0
            r1.load(r2)     // Catch: java.lang.Exception -> L14 java.io.IOException -> L16 java.security.NoSuchAlgorithmException -> L18 java.security.UnrecoverableKeyException -> L1a java.security.cert.CertificateException -> L1c java.security.KeyStoreException -> L1e
            java.security.Key r4 = r1.getKey(r4, r2)     // Catch: java.lang.Exception -> L14 java.io.IOException -> L16 java.security.NoSuchAlgorithmException -> L18 java.security.UnrecoverableKeyException -> L1a java.security.cert.CertificateException -> L1c java.security.KeyStoreException -> L1e
            if (r4 == 0) goto L13
            r4 = 1
            return r4
        L13:
            return r0
        L14:
            r4 = move-exception
            goto L21
        L16:
            r4 = move-exception
            goto L3d
        L18:
            r4 = move-exception
            goto L58
        L1a:
            r4 = move-exception
            goto L73
        L1c:
            r4 = move-exception
            goto L8e
        L1e:
            r4 = move-exception
            goto La9
        L21:
            java.lang.String r1 = a2.b.a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Exception: "
            r2.append(r3)
            java.lang.String r4 = r4.getMessage()
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            c2.g.d(r1, r4)
            goto Lc3
        L3d:
            java.lang.String r1 = a2.b.a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "IOException: "
            r2.append(r3)
            java.lang.String r4 = r4.getMessage()
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            c2.g.d(r1, r4)
            goto Lc3
        L58:
            java.lang.String r1 = a2.b.a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "NoSuchAlgorithmException: "
            r2.append(r3)
            java.lang.String r4 = r4.getMessage()
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            c2.g.d(r1, r4)
            goto Lc3
        L73:
            java.lang.String r1 = a2.b.a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "UnrecoverableKeyException: "
            r2.append(r3)
            java.lang.String r4 = r4.getMessage()
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            c2.g.d(r1, r4)
            goto Lc3
        L8e:
            java.lang.String r1 = a2.b.a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "CertificateException: "
            r2.append(r3)
            java.lang.String r4 = r4.getMessage()
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            c2.g.d(r1, r4)
            goto Lc3
        La9:
            java.lang.String r1 = a2.b.a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "KeyStoreException: "
            r2.append(r3)
            java.lang.String r4 = r4.getMessage()
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            c2.g.d(r1, r4)
        Lc3:
            return r0
    }

    private static java.security.cert.Certificate g(java.lang.String r4) {
            r0 = 0
            java.lang.String r1 = "AndroidKeyStore"
            java.security.KeyStore r1 = java.security.KeyStore.getInstance(r1)     // Catch: java.lang.Exception -> Lf java.io.IOException -> L11 java.security.NoSuchAlgorithmException -> L13 java.security.cert.CertificateException -> L15 java.security.KeyStoreException -> L17
            r1.load(r0)     // Catch: java.lang.Exception -> Lf java.io.IOException -> L11 java.security.NoSuchAlgorithmException -> L13 java.security.cert.CertificateException -> L15 java.security.KeyStoreException -> L17
            java.security.cert.Certificate r4 = r1.getCertificate(r4)     // Catch: java.lang.Exception -> Lf java.io.IOException -> L11 java.security.NoSuchAlgorithmException -> L13 java.security.cert.CertificateException -> L15 java.security.KeyStoreException -> L17
            return r4
        Lf:
            r4 = move-exception
            goto L19
        L11:
            r4 = move-exception
            goto L34
        L13:
            r4 = move-exception
            goto L4f
        L15:
            r4 = move-exception
            goto L6a
        L17:
            r4 = move-exception
            goto L85
        L19:
            java.lang.String r1 = a2.b.a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Exception: "
            r2.append(r3)
            java.lang.String r4 = r4.getMessage()
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            c2.g.d(r1, r4)
            goto L9f
        L34:
            java.lang.String r1 = a2.b.a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "IOException: "
            r2.append(r3)
            java.lang.String r4 = r4.getMessage()
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            c2.g.d(r1, r4)
            goto L9f
        L4f:
            java.lang.String r1 = a2.b.a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "NoSuchAlgorithmException: "
            r2.append(r3)
            java.lang.String r4 = r4.getMessage()
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            c2.g.d(r1, r4)
            goto L9f
        L6a:
            java.lang.String r1 = a2.b.a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "CertificateException: "
            r2.append(r3)
            java.lang.String r4 = r4.getMessage()
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            c2.g.d(r1, r4)
            goto L9f
        L85:
            java.lang.String r1 = a2.b.a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "KeyStoreException: "
            r2.append(r3)
            java.lang.String r4 = r4.getMessage()
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            c2.g.d(r1, r4)
        L9f:
            return r0
    }

    @java.lang.Deprecated
    public static java.lang.String h(java.lang.String r2, java.lang.String r3) {
            java.lang.String r0 = new java.lang.String     // Catch: java.lang.Exception -> L11 java.io.UnsupportedEncodingException -> L2d
            r1 = 0
            byte[] r3 = android.util.Base64.decode(r3, r1)     // Catch: java.lang.Exception -> L11 java.io.UnsupportedEncodingException -> L2d
            byte[] r2 = i(r2, r3)     // Catch: java.lang.Exception -> L11 java.io.UnsupportedEncodingException -> L2d
            java.lang.String r3 = "UTF-8"
            r0.<init>(r2, r3)     // Catch: java.lang.Exception -> L11 java.io.UnsupportedEncodingException -> L2d
            return r0
        L11:
            r2 = move-exception
            java.lang.String r3 = a2.b.a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Exception: "
            r0.append(r1)
            java.lang.String r2 = r2.getMessage()
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            c2.g.d(r3, r2)
            goto L48
        L2d:
            r2 = move-exception
            java.lang.String r3 = a2.b.a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "UnsupportedEncodingException: "
            r0.append(r1)
            java.lang.String r2 = r2.getMessage()
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            c2.g.d(r3, r2)
        L48:
            java.lang.String r2 = ""
            return r2
    }

    @java.lang.Deprecated
    public static byte[] i(java.lang.String r7, byte[] r8) {
            r0 = 0
            byte[] r0 = new byte[r0]
            boolean r1 = android.text.TextUtils.isEmpty(r7)
            if (r1 != 0) goto L119
            if (r8 != 0) goto Ld
            goto L119
        Ld:
            boolean r1 = c()
            if (r1 != 0) goto L1b
            java.lang.String r7 = a2.b.a
            java.lang.String r8 = "sdk version is too low"
            c2.g.d(r7, r8)
            return r0
        L1b:
            java.security.PrivateKey r7 = b(r7)
            if (r7 != 0) goto L29
            java.lang.String r7 = a2.b.a
            java.lang.String r8 = "Private key is null"
            c2.g.d(r7, r8)
            return r0
        L29:
            java.lang.String r1 = "RSA/ECB/OAEPWithSHA-256AndMGF1Padding"
            javax.crypto.Cipher r1 = javax.crypto.Cipher.getInstance(r1)     // Catch: java.lang.Exception -> L4a javax.crypto.BadPaddingException -> L4c javax.crypto.IllegalBlockSizeException -> L4e java.security.InvalidAlgorithmParameterException -> L50 java.security.InvalidKeyException -> L52 javax.crypto.NoSuchPaddingException -> L54 java.security.NoSuchAlgorithmException -> L57
            javax.crypto.spec.OAEPParameterSpec r2 = new javax.crypto.spec.OAEPParameterSpec     // Catch: java.lang.Exception -> L4a javax.crypto.BadPaddingException -> L4c javax.crypto.IllegalBlockSizeException -> L4e java.security.InvalidAlgorithmParameterException -> L50 java.security.InvalidKeyException -> L52 javax.crypto.NoSuchPaddingException -> L54 java.security.NoSuchAlgorithmException -> L57
            java.lang.String r3 = "SHA-256"
            java.lang.String r4 = "MGF1"
            java.security.spec.MGF1ParameterSpec r5 = new java.security.spec.MGF1ParameterSpec     // Catch: java.lang.Exception -> L4a javax.crypto.BadPaddingException -> L4c javax.crypto.IllegalBlockSizeException -> L4e java.security.InvalidAlgorithmParameterException -> L50 java.security.InvalidKeyException -> L52 javax.crypto.NoSuchPaddingException -> L54 java.security.NoSuchAlgorithmException -> L57
            java.lang.String r6 = "SHA-1"
            r5.<init>(r6)     // Catch: java.lang.Exception -> L4a javax.crypto.BadPaddingException -> L4c javax.crypto.IllegalBlockSizeException -> L4e java.security.InvalidAlgorithmParameterException -> L50 java.security.InvalidKeyException -> L52 javax.crypto.NoSuchPaddingException -> L54 java.security.NoSuchAlgorithmException -> L57
            javax.crypto.spec.PSource$PSpecified r6 = javax.crypto.spec.PSource.PSpecified.DEFAULT     // Catch: java.lang.Exception -> L4a javax.crypto.BadPaddingException -> L4c javax.crypto.IllegalBlockSizeException -> L4e java.security.InvalidAlgorithmParameterException -> L50 java.security.InvalidKeyException -> L52 javax.crypto.NoSuchPaddingException -> L54 java.security.NoSuchAlgorithmException -> L57
            r2.<init>(r3, r4, r5, r6)     // Catch: java.lang.Exception -> L4a javax.crypto.BadPaddingException -> L4c javax.crypto.IllegalBlockSizeException -> L4e java.security.InvalidAlgorithmParameterException -> L50 java.security.InvalidKeyException -> L52 javax.crypto.NoSuchPaddingException -> L54 java.security.NoSuchAlgorithmException -> L57
            r3 = 2
            r1.init(r3, r7, r2)     // Catch: java.lang.Exception -> L4a javax.crypto.BadPaddingException -> L4c javax.crypto.IllegalBlockSizeException -> L4e java.security.InvalidAlgorithmParameterException -> L50 java.security.InvalidKeyException -> L52 javax.crypto.NoSuchPaddingException -> L54 java.security.NoSuchAlgorithmException -> L57
            byte[] r7 = r1.doFinal(r8)     // Catch: java.lang.Exception -> L4a javax.crypto.BadPaddingException -> L4c javax.crypto.IllegalBlockSizeException -> L4e java.security.InvalidAlgorithmParameterException -> L50 java.security.InvalidKeyException -> L52 javax.crypto.NoSuchPaddingException -> L54 java.security.NoSuchAlgorithmException -> L57
            return r7
        L4a:
            r7 = move-exception
            goto L5a
        L4c:
            r7 = move-exception
            goto L76
        L4e:
            r7 = move-exception
            goto L92
        L50:
            r7 = move-exception
            goto Lad
        L52:
            r7 = move-exception
            goto Lc8
        L54:
            r7 = move-exception
            goto Le3
        L57:
            r7 = move-exception
            goto Lfe
        L5a:
            java.lang.String r8 = a2.b.a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Exception: "
            r1.append(r2)
            java.lang.String r7 = r7.getMessage()
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            c2.g.d(r8, r7)
            goto L118
        L76:
            java.lang.String r8 = a2.b.a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "BadPaddingException: "
            r1.append(r2)
            java.lang.String r7 = r7.getMessage()
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            c2.g.d(r8, r7)
            goto L118
        L92:
            java.lang.String r8 = a2.b.a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "IllegalBlockSizeException: "
            r1.append(r2)
            java.lang.String r7 = r7.getMessage()
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            c2.g.d(r8, r7)
            goto L118
        Lad:
            java.lang.String r8 = a2.b.a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "InvalidAlgorithmParameterException: "
            r1.append(r2)
            java.lang.String r7 = r7.getMessage()
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            c2.g.d(r8, r7)
            goto L118
        Lc8:
            java.lang.String r8 = a2.b.a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "InvalidKeyException: "
            r1.append(r2)
            java.lang.String r7 = r7.getMessage()
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            c2.g.d(r8, r7)
            goto L118
        Le3:
            java.lang.String r8 = a2.b.a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "NoSuchPaddingException: "
            r1.append(r2)
            java.lang.String r7 = r7.getMessage()
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            c2.g.d(r8, r7)
            goto L118
        Lfe:
            java.lang.String r8 = a2.b.a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "NoSuchAlgorithmException: "
            r1.append(r2)
            java.lang.String r7 = r7.getMessage()
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            c2.g.d(r8, r7)
        L118:
            return r0
        L119:
            java.lang.String r7 = a2.b.a
            java.lang.String r8 = "alias or encrypted content is null"
            c2.g.d(r7, r8)
            return r0
    }

    public static java.lang.String j(java.lang.String r2, java.lang.String r3) {
            java.lang.String r0 = new java.lang.String     // Catch: java.lang.Exception -> L11 java.io.UnsupportedEncodingException -> L2d
            r1 = 0
            byte[] r3 = android.util.Base64.decode(r3, r1)     // Catch: java.lang.Exception -> L11 java.io.UnsupportedEncodingException -> L2d
            byte[] r2 = k(r2, r3)     // Catch: java.lang.Exception -> L11 java.io.UnsupportedEncodingException -> L2d
            java.lang.String r3 = "UTF-8"
            r0.<init>(r2, r3)     // Catch: java.lang.Exception -> L11 java.io.UnsupportedEncodingException -> L2d
            return r0
        L11:
            r2 = move-exception
            java.lang.String r3 = a2.b.a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Exception: "
            r0.append(r1)
            java.lang.String r2 = r2.getMessage()
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            c2.g.d(r3, r2)
            goto L48
        L2d:
            r2 = move-exception
            java.lang.String r3 = a2.b.a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "UnsupportedEncodingException: "
            r0.append(r1)
            java.lang.String r2 = r2.getMessage()
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            c2.g.d(r3, r2)
        L48:
            java.lang.String r2 = ""
            return r2
    }

    public static byte[] k(java.lang.String r0, byte[] r1) {
            byte[] r0 = i(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static java.lang.String l(java.lang.String r2, java.lang.String r3) {
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L31
            java.lang.String r0 = "UTF-8"
            byte[] r3 = r3.getBytes(r0)     // Catch: java.io.UnsupportedEncodingException -> L16
            byte[] r2 = m(r2, r3)     // Catch: java.io.UnsupportedEncodingException -> L16
            r3 = 0
            java.lang.String r2 = android.util.Base64.encodeToString(r2, r3)     // Catch: java.io.UnsupportedEncodingException -> L16
            return r2
        L16:
            r2 = move-exception
            java.lang.String r3 = a2.b.a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "UnsupportedEncodingException: "
            r0.append(r1)
            java.lang.String r2 = r2.getMessage()
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            c2.g.d(r3, r2)
        L31:
            java.lang.String r2 = ""
            return r2
    }

    @java.lang.Deprecated
    public static byte[] m(java.lang.String r1, byte[] r2) {
            r0 = 0
            byte[] r1 = d(r1, r2, r0)
            return r1
    }

    public static java.lang.String n(java.lang.String r2, java.lang.String r3) {
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L31
            java.lang.String r0 = "UTF-8"
            byte[] r3 = r3.getBytes(r0)     // Catch: java.io.UnsupportedEncodingException -> L16
            byte[] r2 = o(r2, r3)     // Catch: java.io.UnsupportedEncodingException -> L16
            r3 = 0
            java.lang.String r2 = android.util.Base64.encodeToString(r2, r3)     // Catch: java.io.UnsupportedEncodingException -> L16
            return r2
        L16:
            r2 = move-exception
            java.lang.String r3 = a2.b.a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "UnsupportedEncodingException: "
            r0.append(r1)
            java.lang.String r2 = r2.getMessage()
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            c2.g.d(r3, r2)
        L31:
            java.lang.String r2 = ""
            return r2
    }

    public static byte[] o(java.lang.String r1, byte[] r2) {
            r0 = 1
            byte[] r1 = d(r1, r2, r0)
            return r1
    }
}
