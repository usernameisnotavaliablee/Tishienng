package z1;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class g {
    private static final java.lang.String a = "CBCKS";
    private static final java.lang.String b = "AndroidKeyStore";
    private static final java.lang.String c = "AES/CBC/PKCS7Padding";
    private static final java.lang.String d = "";
    private static final int e = 16;
    private static final int f = 256;
    private static java.util.Map<java.lang.String, javax.crypto.SecretKey> g;

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            z1.g.g = r0
            return
    }

    public g() {
            r0 = this;
            r0.<init>()
            return
    }

    private static synchronized javax.crypto.SecretKey a(java.lang.String r5) {
            java.lang.Class<z1.g> r0 = z1.g.class
            monitor-enter(r0)
            java.lang.String r1 = "CBCKS"
            java.lang.String r2 = "load key"
            c2.g.e(r1, r2)     // Catch: java.lang.Throwable -> L23
            r1 = 0
            java.lang.String r2 = "AndroidKeyStore"
            java.security.KeyStore r2 = java.security.KeyStore.getInstance(r2)     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L26 java.security.NoSuchProviderException -> L28 java.security.InvalidAlgorithmParameterException -> L2a java.security.UnrecoverableKeyException -> L2d java.security.NoSuchAlgorithmException -> L30 java.security.cert.CertificateException -> L33 java.io.IOException -> L36 java.security.KeyStoreException -> L39
            r2.load(r1)     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L26 java.security.NoSuchProviderException -> L28 java.security.InvalidAlgorithmParameterException -> L2a java.security.UnrecoverableKeyException -> L2d java.security.NoSuchAlgorithmException -> L30 java.security.cert.CertificateException -> L33 java.io.IOException -> L36 java.security.KeyStoreException -> L39
            java.security.Key r2 = r2.getKey(r5, r1)     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L26 java.security.NoSuchProviderException -> L28 java.security.InvalidAlgorithmParameterException -> L2a java.security.UnrecoverableKeyException -> L2d java.security.NoSuchAlgorithmException -> L30 java.security.cert.CertificateException -> L33 java.io.IOException -> L36 java.security.KeyStoreException -> L39
            if (r2 == 0) goto L3c
            boolean r3 = r2 instanceof javax.crypto.SecretKey     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L26 java.security.NoSuchProviderException -> L28 java.security.InvalidAlgorithmParameterException -> L2a java.security.UnrecoverableKeyException -> L2d java.security.NoSuchAlgorithmException -> L30 java.security.cert.CertificateException -> L33 java.io.IOException -> L36 java.security.KeyStoreException -> L39
            if (r3 == 0) goto L3c
            javax.crypto.SecretKey r2 = (javax.crypto.SecretKey) r2     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L26 java.security.NoSuchProviderException -> L28 java.security.InvalidAlgorithmParameterException -> L2a java.security.UnrecoverableKeyException -> L2d java.security.NoSuchAlgorithmException -> L30 java.security.cert.CertificateException -> L33 java.io.IOException -> L36 java.security.KeyStoreException -> L39
            r1 = r2
            goto L154
        L23:
            r5 = move-exception
            goto L15b
        L26:
            r2 = move-exception
            goto L7a
        L28:
            r2 = move-exception
            goto L96
        L2a:
            r2 = move-exception
            goto Lb2
        L2d:
            r2 = move-exception
            goto Lce
        L30:
            r2 = move-exception
            goto Le9
        L33:
            r2 = move-exception
            goto L104
        L36:
            r2 = move-exception
            goto L11f
        L39:
            r2 = move-exception
            goto L13a
        L3c:
            java.lang.String r2 = "CBCKS"
            java.lang.String r3 = "generate key"
            c2.g.e(r2, r3)     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L26 java.security.NoSuchProviderException -> L28 java.security.InvalidAlgorithmParameterException -> L2a java.security.UnrecoverableKeyException -> L2d java.security.NoSuchAlgorithmException -> L30 java.security.cert.CertificateException -> L33 java.io.IOException -> L36 java.security.KeyStoreException -> L39
            java.lang.String r2 = "AES"
            java.lang.String r3 = "AndroidKeyStore"
            javax.crypto.KeyGenerator r2 = javax.crypto.KeyGenerator.getInstance(r2, r3)     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L26 java.security.NoSuchProviderException -> L28 java.security.InvalidAlgorithmParameterException -> L2a java.security.UnrecoverableKeyException -> L2d java.security.NoSuchAlgorithmException -> L30 java.security.cert.CertificateException -> L33 java.io.IOException -> L36 java.security.KeyStoreException -> L39
            z1.f.a()     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L26 java.security.NoSuchProviderException -> L28 java.security.InvalidAlgorithmParameterException -> L2a java.security.UnrecoverableKeyException -> L2d java.security.NoSuchAlgorithmException -> L30 java.security.cert.CertificateException -> L33 java.io.IOException -> L36 java.security.KeyStoreException -> L39
            r3 = 3
            android.security.keystore.KeyGenParameterSpec$Builder r3 = z1.e.a(r5, r3)     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L26 java.security.NoSuchProviderException -> L28 java.security.InvalidAlgorithmParameterException -> L2a java.security.UnrecoverableKeyException -> L2d java.security.NoSuchAlgorithmException -> L30 java.security.cert.CertificateException -> L33 java.io.IOException -> L36 java.security.KeyStoreException -> L39
            java.lang.String r4 = "CBC"
            java.lang.String[] r4 = new java.lang.String[]{r4}     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L26 java.security.NoSuchProviderException -> L28 java.security.InvalidAlgorithmParameterException -> L2a java.security.UnrecoverableKeyException -> L2d java.security.NoSuchAlgorithmException -> L30 java.security.cert.CertificateException -> L33 java.io.IOException -> L36 java.security.KeyStoreException -> L39
            android.security.keystore.KeyGenParameterSpec$Builder r3 = z1.a.a(r3, r4)     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L26 java.security.NoSuchProviderException -> L28 java.security.InvalidAlgorithmParameterException -> L2a java.security.UnrecoverableKeyException -> L2d java.security.NoSuchAlgorithmException -> L30 java.security.cert.CertificateException -> L33 java.io.IOException -> L36 java.security.KeyStoreException -> L39
            java.lang.String r4 = "PKCS7Padding"
            java.lang.String[] r4 = new java.lang.String[]{r4}     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L26 java.security.NoSuchProviderException -> L28 java.security.InvalidAlgorithmParameterException -> L2a java.security.UnrecoverableKeyException -> L2d java.security.NoSuchAlgorithmException -> L30 java.security.cert.CertificateException -> L33 java.io.IOException -> L36 java.security.KeyStoreException -> L39
            android.security.keystore.KeyGenParameterSpec$Builder r3 = z1.b.a(r3, r4)     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L26 java.security.NoSuchProviderException -> L28 java.security.InvalidAlgorithmParameterException -> L2a java.security.UnrecoverableKeyException -> L2d java.security.NoSuchAlgorithmException -> L30 java.security.cert.CertificateException -> L33 java.io.IOException -> L36 java.security.KeyStoreException -> L39
            r4 = 256(0x100, float:3.59E-43)
            android.security.keystore.KeyGenParameterSpec$Builder r3 = z1.c.a(r3, r4)     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L26 java.security.NoSuchProviderException -> L28 java.security.InvalidAlgorithmParameterException -> L2a java.security.UnrecoverableKeyException -> L2d java.security.NoSuchAlgorithmException -> L30 java.security.cert.CertificateException -> L33 java.io.IOException -> L36 java.security.KeyStoreException -> L39
            android.security.keystore.KeyGenParameterSpec r3 = z1.d.a(r3)     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L26 java.security.NoSuchProviderException -> L28 java.security.InvalidAlgorithmParameterException -> L2a java.security.UnrecoverableKeyException -> L2d java.security.NoSuchAlgorithmException -> L30 java.security.cert.CertificateException -> L33 java.io.IOException -> L36 java.security.KeyStoreException -> L39
            r2.init(r3)     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L26 java.security.NoSuchProviderException -> L28 java.security.InvalidAlgorithmParameterException -> L2a java.security.UnrecoverableKeyException -> L2d java.security.NoSuchAlgorithmException -> L30 java.security.cert.CertificateException -> L33 java.io.IOException -> L36 java.security.KeyStoreException -> L39
            javax.crypto.SecretKey r1 = r2.generateKey()     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L26 java.security.NoSuchProviderException -> L28 java.security.InvalidAlgorithmParameterException -> L2a java.security.UnrecoverableKeyException -> L2d java.security.NoSuchAlgorithmException -> L30 java.security.cert.CertificateException -> L33 java.io.IOException -> L36 java.security.KeyStoreException -> L39
            goto L154
        L7a:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L23
            r3.<init>()     // Catch: java.lang.Throwable -> L23
            java.lang.String r4 = "Exception: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L23
            java.lang.String r2 = r2.getMessage()     // Catch: java.lang.Throwable -> L23
            r3.append(r2)     // Catch: java.lang.Throwable -> L23
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Throwable -> L23
            java.lang.String r3 = "CBCKS"
            c2.g.d(r3, r2)     // Catch: java.lang.Throwable -> L23
            goto L154
        L96:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L23
            r3.<init>()     // Catch: java.lang.Throwable -> L23
            java.lang.String r4 = "NoSuchProviderException: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L23
            java.lang.String r2 = r2.getMessage()     // Catch: java.lang.Throwable -> L23
            r3.append(r2)     // Catch: java.lang.Throwable -> L23
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Throwable -> L23
            java.lang.String r3 = "CBCKS"
            c2.g.d(r3, r2)     // Catch: java.lang.Throwable -> L23
            goto L154
        Lb2:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L23
            r3.<init>()     // Catch: java.lang.Throwable -> L23
            java.lang.String r4 = "InvalidAlgorithmParameterException: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L23
            java.lang.String r2 = r2.getMessage()     // Catch: java.lang.Throwable -> L23
            r3.append(r2)     // Catch: java.lang.Throwable -> L23
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Throwable -> L23
            java.lang.String r3 = "CBCKS"
            c2.g.d(r3, r2)     // Catch: java.lang.Throwable -> L23
            goto L154
        Lce:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L23
            r3.<init>()     // Catch: java.lang.Throwable -> L23
            java.lang.String r4 = "UnrecoverableKeyException: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L23
            java.lang.String r2 = r2.getMessage()     // Catch: java.lang.Throwable -> L23
            r3.append(r2)     // Catch: java.lang.Throwable -> L23
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Throwable -> L23
            java.lang.String r3 = "CBCKS"
            c2.g.d(r3, r2)     // Catch: java.lang.Throwable -> L23
            goto L154
        Le9:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L23
            r3.<init>()     // Catch: java.lang.Throwable -> L23
            java.lang.String r4 = "NoSuchAlgorithmException: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L23
            java.lang.String r2 = r2.getMessage()     // Catch: java.lang.Throwable -> L23
            r3.append(r2)     // Catch: java.lang.Throwable -> L23
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Throwable -> L23
            java.lang.String r3 = "CBCKS"
            c2.g.d(r3, r2)     // Catch: java.lang.Throwable -> L23
            goto L154
        L104:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L23
            r3.<init>()     // Catch: java.lang.Throwable -> L23
            java.lang.String r4 = "CertificateException: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L23
            java.lang.String r2 = r2.getMessage()     // Catch: java.lang.Throwable -> L23
            r3.append(r2)     // Catch: java.lang.Throwable -> L23
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Throwable -> L23
            java.lang.String r3 = "CBCKS"
            c2.g.d(r3, r2)     // Catch: java.lang.Throwable -> L23
            goto L154
        L11f:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L23
            r3.<init>()     // Catch: java.lang.Throwable -> L23
            java.lang.String r4 = "IOException: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L23
            java.lang.String r2 = r2.getMessage()     // Catch: java.lang.Throwable -> L23
            r3.append(r2)     // Catch: java.lang.Throwable -> L23
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Throwable -> L23
            java.lang.String r3 = "CBCKS"
            c2.g.d(r3, r2)     // Catch: java.lang.Throwable -> L23
            goto L154
        L13a:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L23
            r3.<init>()     // Catch: java.lang.Throwable -> L23
            java.lang.String r4 = "KeyStoreException: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L23
            java.lang.String r2 = r2.getMessage()     // Catch: java.lang.Throwable -> L23
            r3.append(r2)     // Catch: java.lang.Throwable -> L23
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Throwable -> L23
            java.lang.String r3 = "CBCKS"
            c2.g.d(r3, r2)     // Catch: java.lang.Throwable -> L23
        L154:
            java.util.Map<java.lang.String, javax.crypto.SecretKey> r2 = z1.g.g     // Catch: java.lang.Throwable -> L23
            r2.put(r5, r1)     // Catch: java.lang.Throwable -> L23
            monitor-exit(r0)
            return r1
        L15b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L23
            throw r5
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
            java.util.Map<java.lang.String, javax.crypto.SecretKey> r0 = z1.g.g
            java.lang.Object r0 = r0.get(r1)
            if (r0 != 0) goto L13
            a(r1)
        L13:
            java.util.Map<java.lang.String, javax.crypto.SecretKey> r0 = z1.g.g
            java.lang.Object r1 = r0.get(r1)
            javax.crypto.SecretKey r1 = (javax.crypto.SecretKey) r1
            return r1
    }

    public static java.lang.String d(java.lang.String r3, java.lang.String r4) {
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            java.lang.String r1 = ""
            java.lang.String r2 = "CBCKS"
            if (r0 != 0) goto L27
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 == 0) goto L11
            goto L27
        L11:
            byte[] r4 = c2.c.c(r4)
            java.lang.String r0 = new java.lang.String     // Catch: java.io.UnsupportedEncodingException -> L21
            byte[] r3 = e(r3, r4)     // Catch: java.io.UnsupportedEncodingException -> L21
            java.lang.String r4 = "UTF-8"
            r0.<init>(r3, r4)     // Catch: java.io.UnsupportedEncodingException -> L21
            return r0
        L21:
            java.lang.String r3 = "encrypt: UnsupportedEncodingException"
            c2.g.d(r2, r3)
            return r1
        L27:
            java.lang.String r3 = "alias or encrypt content is null"
            c2.g.d(r2, r3)
            return r1
    }

    public static byte[] e(java.lang.String r6, byte[] r7) {
            r0 = 0
            byte[] r0 = new byte[r0]
            boolean r1 = android.text.TextUtils.isEmpty(r6)
            java.lang.String r2 = "CBCKS"
            if (r1 != 0) goto L10d
            if (r7 != 0) goto Lf
            goto L10d
        Lf:
            boolean r1 = b()
            if (r1 != 0) goto L1b
            java.lang.String r6 = "sdk version is too low"
            c2.g.d(r2, r6)
            return r0
        L1b:
            int r1 = r7.length
            r3 = 16
            if (r1 > r3) goto L26
            java.lang.String r6 = "Decrypt source data is invalid."
            c2.g.d(r2, r6)
            return r0
        L26:
            javax.crypto.SecretKey r6 = c(r6)
            if (r6 != 0) goto L32
            java.lang.String r6 = "decrypt secret key is null"
            c2.g.d(r2, r6)
            return r0
        L32:
            byte[] r1 = java.util.Arrays.copyOf(r7, r3)
            java.lang.String r4 = "AES/CBC/PKCS7Padding"
            javax.crypto.Cipher r4 = javax.crypto.Cipher.getInstance(r4)     // Catch: java.lang.Exception -> L4c javax.crypto.BadPaddingException -> L4e javax.crypto.IllegalBlockSizeException -> L50 java.security.InvalidAlgorithmParameterException -> L52 java.security.InvalidKeyException -> L54 javax.crypto.NoSuchPaddingException -> L56 java.security.NoSuchAlgorithmException -> L59
            javax.crypto.spec.IvParameterSpec r5 = new javax.crypto.spec.IvParameterSpec     // Catch: java.lang.Exception -> L4c javax.crypto.BadPaddingException -> L4e javax.crypto.IllegalBlockSizeException -> L50 java.security.InvalidAlgorithmParameterException -> L52 java.security.InvalidKeyException -> L54 javax.crypto.NoSuchPaddingException -> L56 java.security.NoSuchAlgorithmException -> L59
            r5.<init>(r1)     // Catch: java.lang.Exception -> L4c javax.crypto.BadPaddingException -> L4e javax.crypto.IllegalBlockSizeException -> L50 java.security.InvalidAlgorithmParameterException -> L52 java.security.InvalidKeyException -> L54 javax.crypto.NoSuchPaddingException -> L56 java.security.NoSuchAlgorithmException -> L59
            r1 = 2
            r4.init(r1, r6, r5)     // Catch: java.lang.Exception -> L4c javax.crypto.BadPaddingException -> L4e javax.crypto.IllegalBlockSizeException -> L50 java.security.InvalidAlgorithmParameterException -> L52 java.security.InvalidKeyException -> L54 javax.crypto.NoSuchPaddingException -> L56 java.security.NoSuchAlgorithmException -> L59
            int r6 = r7.length     // Catch: java.lang.Exception -> L4c javax.crypto.BadPaddingException -> L4e javax.crypto.IllegalBlockSizeException -> L50 java.security.InvalidAlgorithmParameterException -> L52 java.security.InvalidKeyException -> L54 javax.crypto.NoSuchPaddingException -> L56 java.security.NoSuchAlgorithmException -> L59
            int r6 = r6 - r3
            byte[] r6 = r4.doFinal(r7, r3, r6)     // Catch: java.lang.Exception -> L4c javax.crypto.BadPaddingException -> L4e javax.crypto.IllegalBlockSizeException -> L50 java.security.InvalidAlgorithmParameterException -> L52 java.security.InvalidKeyException -> L54 javax.crypto.NoSuchPaddingException -> L56 java.security.NoSuchAlgorithmException -> L59
            return r6
        L4c:
            r6 = move-exception
            goto L5c
        L4e:
            r6 = move-exception
            goto L76
        L50:
            r6 = move-exception
            goto L90
        L52:
            r6 = move-exception
            goto La9
        L54:
            r6 = move-exception
            goto Lc2
        L56:
            r6 = move-exception
            goto Ldb
        L59:
            r6 = move-exception
            goto Lf4
        L5c:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r1 = "Exception: "
            r7.append(r1)
            java.lang.String r6 = r6.getMessage()
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            c2.g.d(r2, r6)
            goto L10c
        L76:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r1 = "BadPaddingException: "
            r7.append(r1)
            java.lang.String r6 = r6.getMessage()
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            c2.g.d(r2, r6)
            goto L10c
        L90:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r1 = "IllegalBlockSizeException: "
            r7.append(r1)
            java.lang.String r6 = r6.getMessage()
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            c2.g.d(r2, r6)
            goto L10c
        La9:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r1 = "InvalidAlgorithmParameterException: "
            r7.append(r1)
            java.lang.String r6 = r6.getMessage()
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            c2.g.d(r2, r6)
            goto L10c
        Lc2:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r1 = "InvalidKeyException: "
            r7.append(r1)
            java.lang.String r6 = r6.getMessage()
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            c2.g.d(r2, r6)
            goto L10c
        Ldb:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r1 = "NoSuchPaddingException: "
            r7.append(r1)
            java.lang.String r6 = r6.getMessage()
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            c2.g.d(r2, r6)
            goto L10c
        Lf4:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r1 = "NoSuchAlgorithmException: "
            r7.append(r1)
            java.lang.String r6 = r6.getMessage()
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            c2.g.d(r2, r6)
        L10c:
            return r0
        L10d:
            java.lang.String r6 = "alias or encrypt content is null"
            c2.g.d(r2, r6)
            return r0
    }

    public static java.lang.String f(java.lang.String r3, java.lang.String r4) {
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            java.lang.String r1 = ""
            java.lang.String r2 = "CBCKS"
            if (r0 == 0) goto L10
            java.lang.String r3 = "encrypt 1 content is null"
            c2.g.d(r2, r3)
            return r1
        L10:
            java.lang.String r0 = "UTF-8"
            byte[] r4 = r4.getBytes(r0)     // Catch: java.io.UnsupportedEncodingException -> L1f
            byte[] r3 = g(r3, r4)     // Catch: java.io.UnsupportedEncodingException -> L1f
            java.lang.String r3 = c2.c.b(r3)     // Catch: java.io.UnsupportedEncodingException -> L1f
            return r3
        L1f:
            java.lang.String r3 = "encrypt: UnsupportedEncodingException"
            c2.g.d(r2, r3)
            return r1
    }

    public static byte[] g(java.lang.String r5, byte[] r6) {
            r0 = 0
            byte[] r1 = new byte[r0]
            boolean r2 = android.text.TextUtils.isEmpty(r5)
            java.lang.String r3 = "CBCKS"
            if (r2 != 0) goto Lfa
            if (r6 != 0) goto Lf
            goto Lfa
        Lf:
            boolean r2 = b()
            if (r2 != 0) goto L1b
            java.lang.String r5 = "sdk version is too low"
            c2.g.d(r3, r5)
            return r1
        L1b:
            java.lang.String r2 = "AES/CBC/PKCS7Padding"
            javax.crypto.Cipher r2 = javax.crypto.Cipher.getInstance(r2)     // Catch: java.lang.Exception -> L2d java.security.InvalidKeyException -> L2f javax.crypto.IllegalBlockSizeException -> L31 javax.crypto.BadPaddingException -> L33 javax.crypto.NoSuchPaddingException -> L36 java.security.NoSuchAlgorithmException -> L39
            javax.crypto.SecretKey r5 = c(r5)     // Catch: java.lang.Exception -> L2d java.security.InvalidKeyException -> L2f javax.crypto.IllegalBlockSizeException -> L31 javax.crypto.BadPaddingException -> L33 javax.crypto.NoSuchPaddingException -> L36 java.security.NoSuchAlgorithmException -> L39
            if (r5 != 0) goto L3c
            java.lang.String r5 = "encrypt secret key is null"
            c2.g.d(r3, r5)     // Catch: java.lang.Exception -> L2d java.security.InvalidKeyException -> L2f javax.crypto.IllegalBlockSizeException -> L31 javax.crypto.BadPaddingException -> L33 javax.crypto.NoSuchPaddingException -> L36 java.security.NoSuchAlgorithmException -> L39
            return r1
        L2d:
            r5 = move-exception
            goto L63
        L2f:
            r5 = move-exception
            goto L7d
        L31:
            r5 = move-exception
            goto L96
        L33:
            r5 = move-exception
            goto Laf
        L36:
            r5 = move-exception
            goto Lc8
        L39:
            r5 = move-exception
            goto Le1
        L3c:
            r4 = 1
            r2.init(r4, r5)     // Catch: java.lang.Exception -> L2d java.security.InvalidKeyException -> L2f javax.crypto.IllegalBlockSizeException -> L31 javax.crypto.BadPaddingException -> L33 javax.crypto.NoSuchPaddingException -> L36 java.security.NoSuchAlgorithmException -> L39
            byte[] r5 = r2.doFinal(r6)     // Catch: java.lang.Exception -> L2d java.security.InvalidKeyException -> L2f javax.crypto.IllegalBlockSizeException -> L31 javax.crypto.BadPaddingException -> L33 javax.crypto.NoSuchPaddingException -> L36 java.security.NoSuchAlgorithmException -> L39
            byte[] r6 = r2.getIV()     // Catch: java.lang.Exception -> L2d java.security.InvalidKeyException -> L2f javax.crypto.IllegalBlockSizeException -> L31 javax.crypto.BadPaddingException -> L33 javax.crypto.NoSuchPaddingException -> L36 java.security.NoSuchAlgorithmException -> L39
            if (r6 == 0) goto L5d
            int r2 = r6.length     // Catch: java.lang.Exception -> L2d java.security.InvalidKeyException -> L2f javax.crypto.IllegalBlockSizeException -> L31 javax.crypto.BadPaddingException -> L33 javax.crypto.NoSuchPaddingException -> L36 java.security.NoSuchAlgorithmException -> L39
            r4 = 16
            if (r2 == r4) goto L50
            goto L5d
        L50:
            int r2 = r6.length     // Catch: java.lang.Exception -> L2d java.security.InvalidKeyException -> L2f javax.crypto.IllegalBlockSizeException -> L31 javax.crypto.BadPaddingException -> L33 javax.crypto.NoSuchPaddingException -> L36 java.security.NoSuchAlgorithmException -> L39
            int r4 = r5.length     // Catch: java.lang.Exception -> L2d java.security.InvalidKeyException -> L2f javax.crypto.IllegalBlockSizeException -> L31 javax.crypto.BadPaddingException -> L33 javax.crypto.NoSuchPaddingException -> L36 java.security.NoSuchAlgorithmException -> L39
            int r2 = r2 + r4
            byte[] r1 = java.util.Arrays.copyOf(r6, r2)     // Catch: java.lang.Exception -> L2d java.security.InvalidKeyException -> L2f javax.crypto.IllegalBlockSizeException -> L31 javax.crypto.BadPaddingException -> L33 javax.crypto.NoSuchPaddingException -> L36 java.security.NoSuchAlgorithmException -> L39
            int r6 = r6.length     // Catch: java.lang.Exception -> L2d java.security.InvalidKeyException -> L2f javax.crypto.IllegalBlockSizeException -> L31 javax.crypto.BadPaddingException -> L33 javax.crypto.NoSuchPaddingException -> L36 java.security.NoSuchAlgorithmException -> L39
            int r2 = r5.length     // Catch: java.lang.Exception -> L2d java.security.InvalidKeyException -> L2f javax.crypto.IllegalBlockSizeException -> L31 javax.crypto.BadPaddingException -> L33 javax.crypto.NoSuchPaddingException -> L36 java.security.NoSuchAlgorithmException -> L39
            java.lang.System.arraycopy(r5, r0, r1, r6, r2)     // Catch: java.lang.Exception -> L2d java.security.InvalidKeyException -> L2f javax.crypto.IllegalBlockSizeException -> L31 javax.crypto.BadPaddingException -> L33 javax.crypto.NoSuchPaddingException -> L36 java.security.NoSuchAlgorithmException -> L39
            return r1
        L5d:
            java.lang.String r5 = "IV is invalid."
            c2.g.d(r3, r5)     // Catch: java.lang.Exception -> L2d java.security.InvalidKeyException -> L2f javax.crypto.IllegalBlockSizeException -> L31 javax.crypto.BadPaddingException -> L33 javax.crypto.NoSuchPaddingException -> L36 java.security.NoSuchAlgorithmException -> L39
            return r1
        L63:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "Exception: "
            r6.append(r0)
            java.lang.String r5 = r5.getMessage()
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            c2.g.d(r3, r5)
            goto Lf9
        L7d:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "InvalidKeyException: "
            r6.append(r0)
            java.lang.String r5 = r5.getMessage()
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            c2.g.d(r3, r5)
            goto Lf9
        L96:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "IllegalBlockSizeException: "
            r6.append(r0)
            java.lang.String r5 = r5.getMessage()
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            c2.g.d(r3, r5)
            goto Lf9
        Laf:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "BadPaddingException: "
            r6.append(r0)
            java.lang.String r5 = r5.getMessage()
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            c2.g.d(r3, r5)
            goto Lf9
        Lc8:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "NoSuchPaddingException: "
            r6.append(r0)
            java.lang.String r5 = r5.getMessage()
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            c2.g.d(r3, r5)
            goto Lf9
        Le1:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "NoSuchAlgorithmException: "
            r6.append(r0)
            java.lang.String r5 = r5.getMessage()
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            c2.g.d(r3, r5)
        Lf9:
            return r1
        Lfa:
            java.lang.String r5 = "alias or encrypt content is null"
            c2.g.d(r3, r5)
            return r1
    }
}
