package a2;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public abstract class d {
    private static final java.lang.String a = "RSASignKS";
    private static final java.lang.String b = "AndroidKeyStore";
    private static final java.lang.String c = "SHA256withRSA/PSS";
    private static final java.lang.String d = "";
    private static final int e = 2048;
    private static final int f = 3072;

    static {
            return
    }

    public d() {
            r0 = this;
            r0.<init>()
            return
    }

    private static synchronized java.security.KeyPair a(java.lang.String r4, boolean r5) {
            java.lang.Class<a2.d> r0 = a2.d.class
            monitor-enter(r0)
            boolean r1 = b(r4)     // Catch: java.lang.Throwable -> L13
            r2 = 0
            if (r1 == 0) goto L16
            java.lang.String r4 = a2.d.a     // Catch: java.lang.Throwable -> L13
            java.lang.String r5 = "Key pair exits"
            c2.g.d(r4, r5)     // Catch: java.lang.Throwable -> L13
            monitor-exit(r0)
            return r2
        L13:
            r4 = move-exception
            goto Ld4
        L16:
            java.lang.String r1 = "RSA"
            java.lang.String r3 = "AndroidKeyStore"
            java.security.KeyPairGenerator r1 = java.security.KeyPairGenerator.getInstance(r1, r3)     // Catch: java.lang.Throwable -> L13 java.security.InvalidAlgorithmParameterException -> L4d java.security.NoSuchProviderException -> L4f java.security.NoSuchAlgorithmException -> L51
            r3 = 12
            if (r5 != 0) goto L53
            z1.f.a()     // Catch: java.lang.Throwable -> L13 java.security.InvalidAlgorithmParameterException -> L4d java.security.NoSuchProviderException -> L4f java.security.NoSuchAlgorithmException -> L51
            android.security.keystore.KeyGenParameterSpec$Builder r4 = z1.e.a(r4, r3)     // Catch: java.lang.Throwable -> L13 java.security.InvalidAlgorithmParameterException -> L4d java.security.NoSuchProviderException -> L4f java.security.NoSuchAlgorithmException -> L51
            java.lang.String r5 = "SHA-256"
            java.lang.String r3 = "SHA-512"
            java.lang.String[] r5 = new java.lang.String[]{r5, r3}     // Catch: java.lang.Throwable -> L13 java.security.InvalidAlgorithmParameterException -> L4d java.security.NoSuchProviderException -> L4f java.security.NoSuchAlgorithmException -> L51
            android.security.keystore.KeyGenParameterSpec$Builder r4 = a2.a.a(r4, r5)     // Catch: java.lang.Throwable -> L13 java.security.InvalidAlgorithmParameterException -> L4d java.security.NoSuchProviderException -> L4f java.security.NoSuchAlgorithmException -> L51
            java.lang.String r5 = "PSS"
            java.lang.String[] r5 = new java.lang.String[]{r5}     // Catch: java.lang.Throwable -> L13 java.security.InvalidAlgorithmParameterException -> L4d java.security.NoSuchProviderException -> L4f java.security.NoSuchAlgorithmException -> L51
            android.security.keystore.KeyGenParameterSpec$Builder r4 = a2.c.a(r4, r5)     // Catch: java.lang.Throwable -> L13 java.security.InvalidAlgorithmParameterException -> L4d java.security.NoSuchProviderException -> L4f java.security.NoSuchAlgorithmException -> L51
            r5 = 2048(0x800, float:2.87E-42)
            android.security.keystore.KeyGenParameterSpec$Builder r4 = z1.c.a(r4, r5)     // Catch: java.lang.Throwable -> L13 java.security.InvalidAlgorithmParameterException -> L4d java.security.NoSuchProviderException -> L4f java.security.NoSuchAlgorithmException -> L51
            android.security.keystore.KeyGenParameterSpec r4 = z1.d.a(r4)     // Catch: java.lang.Throwable -> L13 java.security.InvalidAlgorithmParameterException -> L4d java.security.NoSuchProviderException -> L4f java.security.NoSuchAlgorithmException -> L51
            r1.initialize(r4)     // Catch: java.lang.Throwable -> L13 java.security.InvalidAlgorithmParameterException -> L4d java.security.NoSuchProviderException -> L4f java.security.NoSuchAlgorithmException -> L51
            goto L7d
        L4d:
            r4 = move-exception
            goto L82
        L4f:
            r4 = move-exception
            goto L9d
        L51:
            r4 = move-exception
            goto Lb8
        L53:
            z1.f.a()     // Catch: java.lang.Throwable -> L13 java.security.InvalidAlgorithmParameterException -> L4d java.security.NoSuchProviderException -> L4f java.security.NoSuchAlgorithmException -> L51
            android.security.keystore.KeyGenParameterSpec$Builder r4 = z1.e.a(r4, r3)     // Catch: java.lang.Throwable -> L13 java.security.InvalidAlgorithmParameterException -> L4d java.security.NoSuchProviderException -> L4f java.security.NoSuchAlgorithmException -> L51
            java.lang.String r5 = "SHA-256"
            java.lang.String r3 = "SHA-512"
            java.lang.String[] r5 = new java.lang.String[]{r5, r3}     // Catch: java.lang.Throwable -> L13 java.security.InvalidAlgorithmParameterException -> L4d java.security.NoSuchProviderException -> L4f java.security.NoSuchAlgorithmException -> L51
            android.security.keystore.KeyGenParameterSpec$Builder r4 = a2.a.a(r4, r5)     // Catch: java.lang.Throwable -> L13 java.security.InvalidAlgorithmParameterException -> L4d java.security.NoSuchProviderException -> L4f java.security.NoSuchAlgorithmException -> L51
            java.lang.String r5 = "PSS"
            java.lang.String[] r5 = new java.lang.String[]{r5}     // Catch: java.lang.Throwable -> L13 java.security.InvalidAlgorithmParameterException -> L4d java.security.NoSuchProviderException -> L4f java.security.NoSuchAlgorithmException -> L51
            android.security.keystore.KeyGenParameterSpec$Builder r4 = a2.c.a(r4, r5)     // Catch: java.lang.Throwable -> L13 java.security.InvalidAlgorithmParameterException -> L4d java.security.NoSuchProviderException -> L4f java.security.NoSuchAlgorithmException -> L51
            r5 = 3072(0xc00, float:4.305E-42)
            android.security.keystore.KeyGenParameterSpec$Builder r4 = z1.c.a(r4, r5)     // Catch: java.lang.Throwable -> L13 java.security.InvalidAlgorithmParameterException -> L4d java.security.NoSuchProviderException -> L4f java.security.NoSuchAlgorithmException -> L51
            android.security.keystore.KeyGenParameterSpec r4 = z1.d.a(r4)     // Catch: java.lang.Throwable -> L13 java.security.InvalidAlgorithmParameterException -> L4d java.security.NoSuchProviderException -> L4f java.security.NoSuchAlgorithmException -> L51
            r1.initialize(r4)     // Catch: java.lang.Throwable -> L13 java.security.InvalidAlgorithmParameterException -> L4d java.security.NoSuchProviderException -> L4f java.security.NoSuchAlgorithmException -> L51
        L7d:
            java.security.KeyPair r2 = r1.generateKeyPair()     // Catch: java.lang.Throwable -> L13 java.security.InvalidAlgorithmParameterException -> L4d java.security.NoSuchProviderException -> L4f java.security.NoSuchAlgorithmException -> L51
            goto Ld2
        L82:
            java.lang.String r5 = a2.d.a     // Catch: java.lang.Throwable -> L13
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            java.lang.String r3 = "InvalidAlgorithmParameterException: "
            r1.append(r3)     // Catch: java.lang.Throwable -> L13
            java.lang.String r4 = r4.getMessage()     // Catch: java.lang.Throwable -> L13
            r1.append(r4)     // Catch: java.lang.Throwable -> L13
            java.lang.String r4 = r1.toString()     // Catch: java.lang.Throwable -> L13
            c2.g.d(r5, r4)     // Catch: java.lang.Throwable -> L13
            goto Ld2
        L9d:
            java.lang.String r5 = a2.d.a     // Catch: java.lang.Throwable -> L13
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            java.lang.String r3 = "NoSuchProviderException: "
            r1.append(r3)     // Catch: java.lang.Throwable -> L13
            java.lang.String r4 = r4.getMessage()     // Catch: java.lang.Throwable -> L13
            r1.append(r4)     // Catch: java.lang.Throwable -> L13
            java.lang.String r4 = r1.toString()     // Catch: java.lang.Throwable -> L13
            c2.g.d(r5, r4)     // Catch: java.lang.Throwable -> L13
            goto Ld2
        Lb8:
            java.lang.String r5 = a2.d.a     // Catch: java.lang.Throwable -> L13
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            java.lang.String r3 = "NoSuchAlgorithmException: "
            r1.append(r3)     // Catch: java.lang.Throwable -> L13
            java.lang.String r4 = r4.getMessage()     // Catch: java.lang.Throwable -> L13
            r1.append(r4)     // Catch: java.lang.Throwable -> L13
            java.lang.String r4 = r1.toString()     // Catch: java.lang.Throwable -> L13
            c2.g.d(r5, r4)     // Catch: java.lang.Throwable -> L13
        Ld2:
            monitor-exit(r0)
            return r2
        Ld4:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r4
    }

    private static boolean b(java.lang.String r4) {
            r0 = 0
            java.lang.String r1 = "AndroidKeyStore"
            java.security.KeyStore r1 = java.security.KeyStore.getInstance(r1)     // Catch: java.io.IOException -> L14 java.security.NoSuchAlgorithmException -> L16 java.security.UnrecoverableKeyException -> L18 java.security.cert.CertificateException -> L1a java.security.KeyStoreException -> L1c
            r2 = 0
            r1.load(r2)     // Catch: java.io.IOException -> L14 java.security.NoSuchAlgorithmException -> L16 java.security.UnrecoverableKeyException -> L18 java.security.cert.CertificateException -> L1a java.security.KeyStoreException -> L1c
            java.security.Key r4 = r1.getKey(r4, r2)     // Catch: java.io.IOException -> L14 java.security.NoSuchAlgorithmException -> L16 java.security.UnrecoverableKeyException -> L18 java.security.cert.CertificateException -> L1a java.security.KeyStoreException -> L1c
            if (r4 == 0) goto L13
            r4 = 1
            return r4
        L13:
            return r0
        L14:
            r4 = move-exception
            goto L1e
        L16:
            r4 = move-exception
            goto L39
        L18:
            r4 = move-exception
            goto L54
        L1a:
            r4 = move-exception
            goto L6f
        L1c:
            r4 = move-exception
            goto L8a
        L1e:
            java.lang.String r1 = a2.d.a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "IOException: "
            r2.append(r3)
            java.lang.String r4 = r4.getMessage()
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            c2.g.d(r1, r4)
            goto La4
        L39:
            java.lang.String r1 = a2.d.a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "NoSuchAlgorithmException: "
            r2.append(r3)
            java.lang.String r4 = r4.getMessage()
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            c2.g.d(r1, r4)
            goto La4
        L54:
            java.lang.String r1 = a2.d.a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "UnrecoverableKeyException: "
            r2.append(r3)
            java.lang.String r4 = r4.getMessage()
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            c2.g.d(r1, r4)
            goto La4
        L6f:
            java.lang.String r1 = a2.d.a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "CertificateException: "
            r2.append(r3)
            java.lang.String r4 = r4.getMessage()
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            c2.g.d(r1, r4)
            goto La4
        L8a:
            java.lang.String r1 = a2.d.a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "KeyStoreException: "
            r2.append(r3)
            java.lang.String r4 = r4.getMessage()
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            c2.g.d(r1, r4)
        La4:
            return r0
    }

    private static boolean c(java.lang.String r2, byte[] r3, byte[] r4, boolean r5) {
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            r1 = 0
            if (r0 != 0) goto Lb6
            if (r3 == 0) goto Lb6
            if (r4 != 0) goto Ld
            goto Lb6
        Ld:
            boolean r0 = f()
            if (r0 != 0) goto L1b
            java.lang.String r2 = a2.d.a
            java.lang.String r3 = "sdk version is too low"
            c2.g.d(r2, r3)
            return r1
        L1b:
            java.security.KeyStore$Entry r2 = e(r2, r5)
            boolean r5 = r2 instanceof java.security.KeyStore.PrivateKeyEntry
            if (r5 != 0) goto L2b
            java.lang.String r2 = a2.d.a
            java.lang.String r3 = "Not an instance of a PrivateKeyEntry"
            c2.g.d(r2, r3)
            return r1
        L2b:
            java.lang.String r5 = "SHA256withRSA/PSS"
            java.security.Signature r5 = java.security.Signature.getInstance(r5)     // Catch: java.lang.Exception -> L42 java.security.InvalidKeyException -> L44 java.security.SignatureException -> L46 java.security.NoSuchAlgorithmException -> L48
            java.security.KeyStore$PrivateKeyEntry r2 = (java.security.KeyStore.PrivateKeyEntry) r2     // Catch: java.lang.Exception -> L42 java.security.InvalidKeyException -> L44 java.security.SignatureException -> L46 java.security.NoSuchAlgorithmException -> L48
            java.security.cert.Certificate r2 = r2.getCertificate()     // Catch: java.lang.Exception -> L42 java.security.InvalidKeyException -> L44 java.security.SignatureException -> L46 java.security.NoSuchAlgorithmException -> L48
            r5.initVerify(r2)     // Catch: java.lang.Exception -> L42 java.security.InvalidKeyException -> L44 java.security.SignatureException -> L46 java.security.NoSuchAlgorithmException -> L48
            r5.update(r3)     // Catch: java.lang.Exception -> L42 java.security.InvalidKeyException -> L44 java.security.SignatureException -> L46 java.security.NoSuchAlgorithmException -> L48
            boolean r2 = r5.verify(r4)     // Catch: java.lang.Exception -> L42 java.security.InvalidKeyException -> L44 java.security.SignatureException -> L46 java.security.NoSuchAlgorithmException -> L48
            return r2
        L42:
            r2 = move-exception
            goto L4a
        L44:
            r2 = move-exception
            goto L65
        L46:
            r2 = move-exception
            goto L80
        L48:
            r2 = move-exception
            goto L9b
        L4a:
            java.lang.String r3 = a2.d.a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Exception: "
            r4.append(r5)
            java.lang.String r2 = r2.getMessage()
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            c2.g.d(r3, r2)
            goto Lb5
        L65:
            java.lang.String r3 = a2.d.a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "InvalidKeyException: "
            r4.append(r5)
            java.lang.String r2 = r2.getMessage()
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            c2.g.d(r3, r2)
            goto Lb5
        L80:
            java.lang.String r3 = a2.d.a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "SignatureException: "
            r4.append(r5)
            java.lang.String r2 = r2.getMessage()
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            c2.g.d(r3, r2)
            goto Lb5
        L9b:
            java.lang.String r3 = a2.d.a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "NoSuchAlgorithmException: "
            r4.append(r5)
            java.lang.String r2 = r2.getMessage()
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            c2.g.d(r3, r2)
        Lb5:
            return r1
        Lb6:
            java.lang.String r2 = a2.d.a
            java.lang.String r3 = "alias or content or sign value is null"
            c2.g.d(r2, r3)
            return r1
    }

    private static byte[] d(java.lang.String r2, byte[] r3, boolean r4) {
            r0 = 0
            byte[] r0 = new byte[r0]
            boolean r1 = android.text.TextUtils.isEmpty(r2)
            if (r1 != 0) goto Lb6
            if (r3 != 0) goto Ld
            goto Lb6
        Ld:
            boolean r1 = f()
            if (r1 != 0) goto L1b
            java.lang.String r2 = a2.d.a
            java.lang.String r3 = "sdk version is too low"
            c2.g.d(r2, r3)
            return r0
        L1b:
            java.security.KeyStore$Entry r2 = e(r2, r4)
            boolean r4 = r2 instanceof java.security.KeyStore.PrivateKeyEntry
            if (r4 != 0) goto L2b
            java.lang.String r2 = a2.d.a
            java.lang.String r3 = "Not an instance of a PrivateKeyEntry"
            c2.g.d(r2, r3)
            return r0
        L2b:
            java.lang.String r4 = "SHA256withRSA/PSS"
            java.security.Signature r4 = java.security.Signature.getInstance(r4)     // Catch: java.lang.Exception -> L42 java.security.InvalidKeyException -> L44 java.security.SignatureException -> L46 java.security.NoSuchAlgorithmException -> L48
            java.security.KeyStore$PrivateKeyEntry r2 = (java.security.KeyStore.PrivateKeyEntry) r2     // Catch: java.lang.Exception -> L42 java.security.InvalidKeyException -> L44 java.security.SignatureException -> L46 java.security.NoSuchAlgorithmException -> L48
            java.security.PrivateKey r2 = r2.getPrivateKey()     // Catch: java.lang.Exception -> L42 java.security.InvalidKeyException -> L44 java.security.SignatureException -> L46 java.security.NoSuchAlgorithmException -> L48
            r4.initSign(r2)     // Catch: java.lang.Exception -> L42 java.security.InvalidKeyException -> L44 java.security.SignatureException -> L46 java.security.NoSuchAlgorithmException -> L48
            r4.update(r3)     // Catch: java.lang.Exception -> L42 java.security.InvalidKeyException -> L44 java.security.SignatureException -> L46 java.security.NoSuchAlgorithmException -> L48
            byte[] r2 = r4.sign()     // Catch: java.lang.Exception -> L42 java.security.InvalidKeyException -> L44 java.security.SignatureException -> L46 java.security.NoSuchAlgorithmException -> L48
            return r2
        L42:
            r2 = move-exception
            goto L4a
        L44:
            r2 = move-exception
            goto L65
        L46:
            r2 = move-exception
            goto L80
        L48:
            r2 = move-exception
            goto L9b
        L4a:
            java.lang.String r3 = a2.d.a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r1 = "Exception: "
            r4.append(r1)
            java.lang.String r2 = r2.getMessage()
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            c2.g.d(r3, r2)
            goto Lb5
        L65:
            java.lang.String r3 = a2.d.a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r1 = "InvalidKeyException: "
            r4.append(r1)
            java.lang.String r2 = r2.getMessage()
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            c2.g.d(r3, r2)
            goto Lb5
        L80:
            java.lang.String r3 = a2.d.a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r1 = "SignatureException: "
            r4.append(r1)
            java.lang.String r2 = r2.getMessage()
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            c2.g.d(r3, r2)
            goto Lb5
        L9b:
            java.lang.String r3 = a2.d.a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r1 = "NoSuchAlgorithmException: "
            r4.append(r1)
            java.lang.String r2 = r2.getMessage()
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            c2.g.d(r3, r2)
        Lb5:
            return r0
        Lb6:
            java.lang.String r2 = a2.d.a
            java.lang.String r3 = "alias or content is null"
            c2.g.d(r2, r3)
            return r0
    }

    private static java.security.KeyStore.Entry e(java.lang.String r3, boolean r4) {
            boolean r0 = b(r3)
            if (r0 != 0) goto L9
            a(r3, r4)
        L9:
            r4 = 0
            java.lang.String r0 = "AndroidKeyStore"
            java.security.KeyStore r0 = java.security.KeyStore.getInstance(r0)     // Catch: java.security.UnrecoverableEntryException -> L18 java.io.IOException -> L1a java.security.NoSuchAlgorithmException -> L1c java.security.cert.CertificateException -> L1e java.security.KeyStoreException -> L20
            r0.load(r4)     // Catch: java.security.UnrecoverableEntryException -> L18 java.io.IOException -> L1a java.security.NoSuchAlgorithmException -> L1c java.security.cert.CertificateException -> L1e java.security.KeyStoreException -> L20
            java.security.KeyStore$Entry r3 = r0.getEntry(r3, r4)     // Catch: java.security.UnrecoverableEntryException -> L18 java.io.IOException -> L1a java.security.NoSuchAlgorithmException -> L1c java.security.cert.CertificateException -> L1e java.security.KeyStoreException -> L20
            return r3
        L18:
            r3 = move-exception
            goto L22
        L1a:
            r3 = move-exception
            goto L3d
        L1c:
            r3 = move-exception
            goto L58
        L1e:
            r3 = move-exception
            goto L73
        L20:
            r3 = move-exception
            goto L8e
        L22:
            java.lang.String r0 = a2.d.a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "UnrecoverableEntryException: "
            r1.append(r2)
            java.lang.String r3 = r3.getMessage()
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            c2.g.d(r0, r3)
            goto La8
        L3d:
            java.lang.String r0 = a2.d.a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "IOException: "
            r1.append(r2)
            java.lang.String r3 = r3.getMessage()
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            c2.g.d(r0, r3)
            goto La8
        L58:
            java.lang.String r0 = a2.d.a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "NoSuchAlgorithmException: "
            r1.append(r2)
            java.lang.String r3 = r3.getMessage()
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            c2.g.d(r0, r3)
            goto La8
        L73:
            java.lang.String r0 = a2.d.a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "CertificateException: "
            r1.append(r2)
            java.lang.String r3 = r3.getMessage()
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            c2.g.d(r0, r3)
            goto La8
        L8e:
            java.lang.String r0 = a2.d.a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "KeyStoreException: "
            r1.append(r2)
            java.lang.String r3 = r3.getMessage()
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            c2.g.d(r0, r3)
        La8:
            return r4
    }

    public static boolean f() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    @java.lang.Deprecated
    public static java.lang.String g(java.lang.String r1, java.lang.String r2) {
            java.lang.String r0 = "UTF-8"
            byte[] r2 = r2.getBytes(r0)     // Catch: java.io.UnsupportedEncodingException -> L10
            byte[] r1 = h(r1, r2)     // Catch: java.io.UnsupportedEncodingException -> L10
            r2 = 0
            java.lang.String r1 = android.util.Base64.encodeToString(r1, r2)     // Catch: java.io.UnsupportedEncodingException -> L10
            return r1
        L10:
            r1 = move-exception
            r1.getMessage()
            java.lang.String r1 = ""
            return r1
    }

    @java.lang.Deprecated
    public static byte[] h(java.lang.String r1, byte[] r2) {
            r0 = 0
            byte[] r1 = d(r1, r2, r0)
            return r1
    }

    public static java.lang.String i(java.lang.String r1, java.lang.String r2) {
            java.lang.String r0 = "UTF-8"
            byte[] r2 = r2.getBytes(r0)     // Catch: java.io.UnsupportedEncodingException -> L10
            byte[] r1 = j(r1, r2)     // Catch: java.io.UnsupportedEncodingException -> L10
            r2 = 0
            java.lang.String r1 = android.util.Base64.encodeToString(r1, r2)     // Catch: java.io.UnsupportedEncodingException -> L10
            return r1
        L10:
            r1 = move-exception
            r1.getMessage()
            java.lang.String r1 = ""
            return r1
    }

    public static byte[] j(java.lang.String r1, byte[] r2) {
            r0 = 1
            byte[] r1 = d(r1, r2, r0)
            return r1
    }

    @java.lang.Deprecated
    public static boolean k(java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            r0 = 0
            java.lang.String r1 = "UTF-8"
            byte[] r3 = r3.getBytes(r1)     // Catch: java.lang.Exception -> L10 java.io.UnsupportedEncodingException -> L12
            byte[] r4 = android.util.Base64.decode(r4, r0)     // Catch: java.lang.Exception -> L10 java.io.UnsupportedEncodingException -> L12
            boolean r2 = l(r2, r3, r4)     // Catch: java.lang.Exception -> L10 java.io.UnsupportedEncodingException -> L12
            return r2
        L10:
            r2 = move-exception
            goto L14
        L12:
            r2 = move-exception
            goto L2f
        L14:
            java.lang.String r3 = a2.d.a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r1 = "base64 decode Exception"
            r4.append(r1)
            java.lang.String r2 = r2.getMessage()
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            c2.g.d(r3, r2)
            goto L32
        L2f:
            r2.getMessage()
        L32:
            return r0
    }

    @java.lang.Deprecated
    public static boolean l(java.lang.String r1, byte[] r2, byte[] r3) {
            r0 = 0
            boolean r1 = c(r1, r2, r3, r0)
            return r1
    }

    public static boolean m(java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            r0 = 0
            java.lang.String r1 = "UTF-8"
            byte[] r3 = r3.getBytes(r1)     // Catch: java.lang.Exception -> L10 java.io.UnsupportedEncodingException -> L12
            byte[] r4 = android.util.Base64.decode(r4, r0)     // Catch: java.lang.Exception -> L10 java.io.UnsupportedEncodingException -> L12
            boolean r2 = n(r2, r3, r4)     // Catch: java.lang.Exception -> L10 java.io.UnsupportedEncodingException -> L12
            return r2
        L10:
            r2 = move-exception
            goto L14
        L12:
            r2 = move-exception
            goto L2f
        L14:
            java.lang.String r3 = a2.d.a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r1 = "base64 decode Exception"
            r4.append(r1)
            java.lang.String r2 = r2.getMessage()
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            c2.g.d(r3, r2)
            goto L32
        L2f:
            r2.getMessage()
        L32:
            return r0
    }

    public static boolean n(java.lang.String r1, byte[] r2, byte[] r3) {
            r0 = 1
            boolean r1 = c(r1, r2, r3, r0)
            return r1
    }
}
