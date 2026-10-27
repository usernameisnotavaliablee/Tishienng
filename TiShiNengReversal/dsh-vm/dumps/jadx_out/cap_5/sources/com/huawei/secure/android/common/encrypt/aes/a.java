package com.huawei.secure.android.common.encrypt.aes;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class a {
    private static final java.lang.String a = "security:";
    private static final java.lang.String b = "AES/CBC/PKCS5Padding";
    private static final java.lang.String c = "AES";
    private static final java.lang.String d = "CBC";
    private static final java.lang.String e = "";
    private static final int f = 16;
    private static final int g = 16;

    private a() {
            r0 = this;
            r0.<init>()
            return
    }

    private static int a(byte[] r2) {
            r0 = 16
            r2 = r2[r0]
            r1 = 58
            if (r2 != r1) goto L9
            return r0
        L9:
            r2 = -1
            return r2
    }

    private static java.lang.String b(java.lang.String r4) {
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            java.lang.String r1 = ""
            if (r0 == 0) goto L9
            return r1
        L9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L3b
            r0.<init>()     // Catch: java.lang.Exception -> L3b
            r2 = 0
            r3 = 6
            java.lang.String r2 = r4.substring(r2, r3)     // Catch: java.lang.Exception -> L3b
            r0.append(r2)     // Catch: java.lang.Exception -> L3b
            r2 = 12
            r3 = 16
            java.lang.String r2 = r4.substring(r2, r3)     // Catch: java.lang.Exception -> L3b
            r0.append(r2)     // Catch: java.lang.Exception -> L3b
            r2 = 26
            r3 = 32
            java.lang.String r2 = r4.substring(r2, r3)     // Catch: java.lang.Exception -> L3b
            r0.append(r2)     // Catch: java.lang.Exception -> L3b
            r2 = 48
            java.lang.String r4 = r4.substring(r2)     // Catch: java.lang.Exception -> L3b
            r0.append(r4)     // Catch: java.lang.Exception -> L3b
            java.lang.String r4 = r0.toString()     // Catch: java.lang.Exception -> L3b
            return r4
        L3b:
            r4 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "get encryptword exception : "
            r0.append(r2)
            java.lang.String r4 = r4.getMessage()
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            java.lang.String r0 = "CBC"
            c2.g.d(r0, r4)
            return r1
    }

    private static java.lang.String c(java.lang.String r5, java.lang.String r6) {
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            java.lang.String r1 = ""
            if (r0 != 0) goto L6b
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 == 0) goto Lf
            goto L6b
        Lf:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L50
            r0.<init>()     // Catch: java.lang.Exception -> L50
            r2 = 0
            r3 = 6
            java.lang.String r4 = r6.substring(r2, r3)     // Catch: java.lang.Exception -> L50
            r0.append(r4)     // Catch: java.lang.Exception -> L50
            java.lang.String r2 = r5.substring(r2, r3)     // Catch: java.lang.Exception -> L50
            r0.append(r2)     // Catch: java.lang.Exception -> L50
            r2 = 10
            java.lang.String r4 = r6.substring(r3, r2)     // Catch: java.lang.Exception -> L50
            r0.append(r4)     // Catch: java.lang.Exception -> L50
            r4 = 16
            java.lang.String r3 = r5.substring(r3, r4)     // Catch: java.lang.Exception -> L50
            r0.append(r3)     // Catch: java.lang.Exception -> L50
            java.lang.String r2 = r6.substring(r2, r4)     // Catch: java.lang.Exception -> L50
            r0.append(r2)     // Catch: java.lang.Exception -> L50
            java.lang.String r5 = r5.substring(r4)     // Catch: java.lang.Exception -> L50
            r0.append(r5)     // Catch: java.lang.Exception -> L50
            java.lang.String r5 = r6.substring(r4)     // Catch: java.lang.Exception -> L50
            r0.append(r5)     // Catch: java.lang.Exception -> L50
            java.lang.String r5 = r0.toString()     // Catch: java.lang.Exception -> L50
            return r5
        L50:
            r5 = move-exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "mix exception: "
            r6.append(r0)
            java.lang.String r5 = r5.getMessage()
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            java.lang.String r6 = "CBC"
            c2.g.d(r6, r5)
        L6b:
            return r1
    }

    private static byte[] d(java.lang.String r4, byte[] r5, byte[] r6) {
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            r1 = 0
            java.lang.String r2 = "CBC"
            if (r0 == 0) goto L11
            java.lang.String r4 = "encrypt 5 content is null"
            c2.g.d(r2, r4)
            byte[] r4 = new byte[r1]
            return r4
        L11:
            if (r5 != 0) goto L1b
            java.lang.String r4 = "encrypt 5 key is null"
            c2.g.d(r2, r4)
            byte[] r4 = new byte[r1]
            return r4
        L1b:
            int r0 = r5.length
            r3 = 16
            if (r0 >= r3) goto L28
            java.lang.String r4 = "encrypt 5 key error: 5 key length less than 16 bytes."
            c2.g.d(r2, r4)
            byte[] r4 = new byte[r1]
            return r4
        L28:
            if (r6 != 0) goto L32
            java.lang.String r4 = "encrypt 5 iv is null"
            c2.g.d(r2, r4)
            byte[] r4 = new byte[r1]
            return r4
        L32:
            int r0 = r6.length
            if (r0 >= r3) goto L3d
            java.lang.String r4 = "encrypt 5 iv error: 5 iv length less than 16 bytes."
            c2.g.d(r2, r4)
            byte[] r4 = new byte[r1]
            return r4
        L3d:
            java.lang.String r0 = "UTF-8"
            byte[] r4 = r4.getBytes(r0)     // Catch: java.io.UnsupportedEncodingException -> L48
            byte[] r4 = y(r4, r5, r6)     // Catch: java.io.UnsupportedEncodingException -> L48
            return r4
        L48:
            r4 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = " cbc encrypt data error"
            r5.append(r6)
            java.lang.String r4 = r4.getMessage()
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            c2.g.d(r2, r4)
            byte[] r4 = new byte[r1]
            return r4
    }

    private static byte[] e(byte[] r3, byte[] r4) {
            int r0 = r3.length
            int r1 = r4.length
            int r0 = r0 + r1
            byte[] r0 = new byte[r0]
            int r1 = r3.length
            r2 = 0
            java.lang.System.arraycopy(r3, r2, r0, r2, r1)
            int r3 = r3.length
            int r1 = r4.length
            java.lang.System.arraycopy(r4, r2, r0, r3, r1)
            return r0
    }

    private static java.lang.String f(java.lang.String r4) {
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            java.lang.String r1 = ""
            if (r0 == 0) goto L9
            return r1
        L9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L33
            r0.<init>()     // Catch: java.lang.Exception -> L33
            r2 = 6
            r3 = 12
            java.lang.String r2 = r4.substring(r2, r3)     // Catch: java.lang.Exception -> L33
            r0.append(r2)     // Catch: java.lang.Exception -> L33
            r2 = 16
            r3 = 26
            java.lang.String r2 = r4.substring(r2, r3)     // Catch: java.lang.Exception -> L33
            r0.append(r2)     // Catch: java.lang.Exception -> L33
            r2 = 32
            r3 = 48
            java.lang.String r4 = r4.substring(r2, r3)     // Catch: java.lang.Exception -> L33
            r0.append(r4)     // Catch: java.lang.Exception -> L33
            java.lang.String r4 = r0.toString()     // Catch: java.lang.Exception -> L33
            return r4
        L33:
            r4 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "getIv exception : "
            r0.append(r2)
            java.lang.String r4 = r4.getMessage()
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            java.lang.String r0 = "CBC"
            c2.g.d(r0, r4)
            return r1
    }

    private static byte[] g(byte[] r4) {
            int r0 = r4.length
            r1 = 16
            int r0 = r0 - r1
            byte[] r0 = new byte[r0]
            int r2 = r4.length
            int r2 = r2 - r1
            r3 = 0
            java.lang.System.arraycopy(r4, r1, r0, r3, r2)
            return r0
    }

    static java.lang.String h(java.lang.String r3) {
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            java.lang.String r1 = ""
            if (r0 == 0) goto L9
            return r1
        L9:
            java.lang.String r0 = "security:"
            int r0 = r3.indexOf(r0)
            r2 = -1
            if (r0 != r2) goto L13
            return r1
        L13:
            r0 = 9
            java.lang.String r3 = r3.substring(r0)
            return r3
    }

    private static byte[] i(byte[] r3) {
            r0 = 16
            byte[] r1 = new byte[r0]
            r2 = 0
            java.lang.System.arraycopy(r3, r2, r1, r2, r0)
            return r1
    }

    static byte[] j(byte[] r4) {
            java.lang.String r0 = new java.lang.String     // Catch: java.io.UnsupportedEncodingException -> L8
            java.lang.String r1 = "UTF-8"
            r0.<init>(r4, r1)     // Catch: java.io.UnsupportedEncodingException -> L8
            goto L25
        L8:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "stripCryptHead: exception : "
            r1.append(r2)
            java.lang.String r0 = r0.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "CBC"
            c2.g.d(r1, r0)
            java.lang.String r0 = ""
        L25:
            java.lang.String r1 = "security:"
            boolean r0 = r0.startsWith(r1)
            r1 = 0
            if (r0 != 0) goto L31
            byte[] r4 = new byte[r1]
            return r4
        L31:
            int r0 = r4.length
            r2 = 9
            if (r0 <= r2) goto L3e
            int r0 = r4.length
            int r0 = r0 - r2
            byte[] r3 = new byte[r0]
            java.lang.System.arraycopy(r4, r2, r3, r1, r0)
            return r3
        L3e:
            byte[] r4 = new byte[r1]
            return r4
    }

    public static java.lang.String k(java.lang.String r4, java.lang.String r5) {
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            java.lang.String r1 = ""
            java.lang.String r2 = "CBC"
            if (r0 == 0) goto L10
            java.lang.String r4 = "decrypt 1 content is null"
            c2.g.d(r2, r4)
            return r1
        L10:
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 == 0) goto L1c
            java.lang.String r4 = "decrypt 1 key is null"
            c2.g.d(r2, r4)
            return r1
        L1c:
            byte[] r5 = c2.c.c(r5)
            int r0 = r5.length
            r3 = 16
            if (r0 >= r3) goto L2b
            java.lang.String r4 = "decrypt 1 key error: 1 key length less than 16 bytes."
            c2.g.d(r2, r4)
            return r1
        L2b:
            java.lang.String r4 = m(r4, r5)
            return r4
    }

    public static java.lang.String l(java.lang.String r4, java.lang.String r5, java.lang.String r6) {
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            java.lang.String r1 = ""
            java.lang.String r2 = "CBC"
            if (r0 == 0) goto L10
            java.lang.String r4 = "decrypt 3 content is null"
            c2.g.d(r2, r4)
            return r1
        L10:
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 == 0) goto L1c
            java.lang.String r4 = "decrypt 3 key is null"
            c2.g.d(r2, r4)
            return r1
        L1c:
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 == 0) goto L28
            java.lang.String r4 = "decrypt 3 iv is null"
            c2.g.d(r2, r4)
            return r1
        L28:
            byte[] r5 = c2.c.c(r5)
            byte[] r6 = c2.c.c(r6)
            int r0 = r5.length
            r3 = 16
            if (r0 >= r3) goto L3b
            java.lang.String r4 = "decrypt 3 key error: 3 key length less than 16 bytes."
            c2.g.d(r2, r4)
            return r1
        L3b:
            int r0 = r6.length
            if (r0 >= r3) goto L44
            java.lang.String r4 = "decrypt 3 iv error: 3 iv length less than 16 bytes."
            c2.g.d(r2, r4)
            return r1
        L44:
            java.lang.String r4 = n(r4, r5, r6)
            return r4
    }

    public static java.lang.String m(java.lang.String r4, byte[] r5) {
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            java.lang.String r1 = ""
            java.lang.String r2 = "CBC"
            if (r0 == 0) goto L10
            java.lang.String r4 = "decrypt 2 content is null"
            c2.g.d(r2, r4)
            return r1
        L10:
            if (r5 != 0) goto L18
            java.lang.String r4 = "decrypt 2 key is null"
            c2.g.d(r2, r4)
            return r1
        L18:
            int r0 = r5.length
            r3 = 16
            if (r0 >= r3) goto L23
            java.lang.String r4 = "decrypt 2 key error: 2 key length less than 16 bytes."
            c2.g.d(r2, r4)
            return r1
        L23:
            java.lang.String r0 = f(r4)
            java.lang.String r4 = b(r4)
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 == 0) goto L37
            java.lang.String r4 = "decrypt 2 iv is null"
            c2.g.d(r2, r4)
            return r1
        L37:
            boolean r3 = android.text.TextUtils.isEmpty(r4)
            if (r3 == 0) goto L43
            java.lang.String r4 = "decrypt 2 encrypt content is null"
            c2.g.d(r2, r4)
            return r1
        L43:
            byte[] r0 = c2.c.c(r0)
            java.lang.String r4 = n(r4, r5, r0)
            return r4
    }

    public static java.lang.String n(java.lang.String r4, byte[] r5, byte[] r6) {
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            java.lang.String r1 = ""
            java.lang.String r2 = "CBC"
            if (r0 == 0) goto L10
            java.lang.String r4 = "decrypt 4 content is null"
            c2.g.d(r2, r4)
            return r1
        L10:
            if (r5 != 0) goto L18
            java.lang.String r4 = "decrypt 4 key is null"
            c2.g.d(r2, r4)
            return r1
        L18:
            int r0 = r5.length
            r3 = 16
            if (r0 >= r3) goto L23
            java.lang.String r4 = "decrypt 4 key error: 4 key length less than 16 bytes."
            c2.g.d(r2, r4)
            return r1
        L23:
            if (r6 != 0) goto L2b
            java.lang.String r4 = "decrypt 4 iv is null"
            c2.g.d(r2, r4)
            return r1
        L2b:
            int r0 = r6.length
            if (r0 >= r3) goto L34
            java.lang.String r4 = "decrypt 4 iv error: 4 iv length less than 16 bytes."
            c2.g.d(r2, r4)
            return r1
        L34:
            byte[] r4 = c2.c.c(r4)     // Catch: java.io.UnsupportedEncodingException -> L44
            byte[] r4 = p(r4, r5, r6)     // Catch: java.io.UnsupportedEncodingException -> L44
            java.lang.String r5 = new java.lang.String     // Catch: java.io.UnsupportedEncodingException -> L44
            java.lang.String r6 = "UTF-8"
            r5.<init>(r4, r6)     // Catch: java.io.UnsupportedEncodingException -> L44
            return r5
        L44:
            r4 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = " cbc decrypt data error"
            r5.append(r6)
            java.lang.String r4 = r4.getMessage()
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            c2.g.d(r2, r4)
            return r1
    }

    public static byte[] o(byte[] r1, byte[] r2) {
            byte[] r0 = i(r1)
            byte[] r1 = g(r1)
            byte[] r1 = p(r1, r2, r0)
            return r1
    }

    public static byte[] p(byte[] r4, byte[] r5, byte[] r6) {
            r0 = 0
            java.lang.String r1 = "CBC"
            if (r4 != 0) goto Ld
            java.lang.String r4 = "decrypt 6 content is null"
            c2.g.d(r1, r4)
            byte[] r4 = new byte[r0]
            return r4
        Ld:
            int r2 = r4.length
            if (r2 != 0) goto L18
            java.lang.String r4 = "decrypt 6 content length is 0"
            c2.g.d(r1, r4)
            byte[] r4 = new byte[r0]
            return r4
        L18:
            if (r5 != 0) goto L22
            java.lang.String r4 = "decrypt 6 key is null"
            c2.g.d(r1, r4)
            byte[] r4 = new byte[r0]
            return r4
        L22:
            int r2 = r5.length
            r3 = 16
            if (r2 >= r3) goto L2f
            java.lang.String r4 = "decrypt 6 key error: 6 key length less than 16 bytes."
            c2.g.d(r1, r4)
            byte[] r4 = new byte[r0]
            return r4
        L2f:
            if (r6 != 0) goto L39
            java.lang.String r4 = "decrypt 6 iv is null"
            c2.g.d(r1, r4)
            byte[] r4 = new byte[r0]
            return r4
        L39:
            int r2 = r6.length
            if (r2 >= r3) goto L44
            java.lang.String r4 = "decrypt 6 iv error: 6 iv length less than 16 bytes."
            c2.g.d(r1, r4)
            byte[] r4 = new byte[r0]
            return r4
        L44:
            javax.crypto.spec.SecretKeySpec r2 = new javax.crypto.spec.SecretKeySpec
            java.lang.String r3 = "AES"
            r2.<init>(r5, r3)
            java.lang.String r5 = "AES/CBC/PKCS5Padding"
            javax.crypto.Cipher r5 = javax.crypto.Cipher.getInstance(r5)     // Catch: java.lang.NullPointerException -> L5f javax.crypto.BadPaddingException -> L61 javax.crypto.IllegalBlockSizeException -> L63 java.security.InvalidAlgorithmParameterException -> L65 java.security.InvalidKeyException -> L67 javax.crypto.NoSuchPaddingException -> L69 java.security.NoSuchAlgorithmException -> L6c
            javax.crypto.spec.IvParameterSpec r3 = new javax.crypto.spec.IvParameterSpec     // Catch: java.lang.NullPointerException -> L5f javax.crypto.BadPaddingException -> L61 javax.crypto.IllegalBlockSizeException -> L63 java.security.InvalidAlgorithmParameterException -> L65 java.security.InvalidKeyException -> L67 javax.crypto.NoSuchPaddingException -> L69 java.security.NoSuchAlgorithmException -> L6c
            r3.<init>(r6)     // Catch: java.lang.NullPointerException -> L5f javax.crypto.BadPaddingException -> L61 javax.crypto.IllegalBlockSizeException -> L63 java.security.InvalidAlgorithmParameterException -> L65 java.security.InvalidKeyException -> L67 javax.crypto.NoSuchPaddingException -> L69 java.security.NoSuchAlgorithmException -> L6c
            r6 = 2
            r5.init(r6, r2, r3)     // Catch: java.lang.NullPointerException -> L5f javax.crypto.BadPaddingException -> L61 javax.crypto.IllegalBlockSizeException -> L63 java.security.InvalidAlgorithmParameterException -> L65 java.security.InvalidKeyException -> L67 javax.crypto.NoSuchPaddingException -> L69 java.security.NoSuchAlgorithmException -> L6c
            byte[] r4 = r5.doFinal(r4)     // Catch: java.lang.NullPointerException -> L5f javax.crypto.BadPaddingException -> L61 javax.crypto.IllegalBlockSizeException -> L63 java.security.InvalidAlgorithmParameterException -> L65 java.security.InvalidKeyException -> L67 javax.crypto.NoSuchPaddingException -> L69 java.security.NoSuchAlgorithmException -> L6c
            return r4
        L5f:
            r4 = move-exception
            goto L6f
        L61:
            r4 = move-exception
            goto L89
        L63:
            r4 = move-exception
            goto La8
        L65:
            r4 = move-exception
            goto Lc1
        L67:
            r4 = move-exception
            goto Lda
        L69:
            r4 = move-exception
            goto Lf3
        L6c:
            r4 = move-exception
            goto L10c
        L6f:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "NullPointerException: "
            r5.append(r6)
            java.lang.String r4 = r4.getMessage()
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            c2.g.d(r1, r4)
            goto L124
        L89:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "BadPaddingException: "
            r5.append(r6)
            java.lang.String r4 = r4.getMessage()
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            c2.g.d(r1, r4)
            java.lang.String r4 = "key is not right"
            c2.g.d(r1, r4)
            goto L124
        La8:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "IllegalBlockSizeException: "
            r5.append(r6)
            java.lang.String r4 = r4.getMessage()
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            c2.g.d(r1, r4)
            goto L124
        Lc1:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "InvalidAlgorithmParameterException: "
            r5.append(r6)
            java.lang.String r4 = r4.getMessage()
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            c2.g.d(r1, r4)
            goto L124
        Lda:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "InvalidKeyException: "
            r5.append(r6)
            java.lang.String r4 = r4.getMessage()
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            c2.g.d(r1, r4)
            goto L124
        Lf3:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "NoSuchPaddingException: "
            r5.append(r6)
            java.lang.String r4 = r4.getMessage()
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            c2.g.d(r1, r4)
            goto L124
        L10c:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "NoSuchAlgorithmException: "
            r5.append(r6)
            java.lang.String r4 = r4.getMessage()
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            c2.g.d(r1, r4)
        L124:
            byte[] r4 = new byte[r0]
            return r4
    }

    public static java.lang.String q(java.lang.String r3, byte[] r4) {
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            java.lang.String r1 = ""
            if (r0 != 0) goto L46
            if (r4 == 0) goto L46
            int r0 = r4.length
            r2 = 16
            if (r0 >= r2) goto L10
            goto L46
        L10:
            java.lang.String r3 = h(r3)
            boolean r0 = r1.equals(r3)
            if (r0 == 0) goto L1b
            return r1
        L1b:
            r0 = 58
            int r0 = r3.indexOf(r0)
            if (r0 < 0) goto L3f
            r1 = 0
            java.lang.String r1 = r3.substring(r1, r0)
            byte[] r1 = c2.c.c(r1)
            int r0 = r0 + 1
            java.lang.String r3 = r3.substring(r0)
            byte[] r3 = c2.c.c(r3)
            java.lang.String r3 = c2.c.b(r3)
            java.lang.String r3 = n(r3, r4, r1)
            return r3
        L3f:
            java.lang.String r3 = "CBC"
            java.lang.String r4 = " cbc cipherText data missing colon"
            c2.g.d(r3, r4)
        L46:
            return r1
    }

    public static java.lang.String r(byte[] r1, byte[] r2) {
            java.lang.String r0 = new java.lang.String     // Catch: java.io.UnsupportedEncodingException -> Lc
            byte[] r1 = s(r1, r2)     // Catch: java.io.UnsupportedEncodingException -> Lc
            java.lang.String r2 = "UTF-8"
            r0.<init>(r1, r2)     // Catch: java.io.UnsupportedEncodingException -> Lc
            return r0
        Lc:
            java.lang.String r1 = "CBC"
            java.lang.String r2 = "decryptWithCryptHead UnsupportedEncodingException "
            c2.g.d(r1, r2)
            java.lang.String r1 = ""
            return r1
    }

    public static byte[] s(byte[] r5, byte[] r6) {
            r0 = 0
            if (r5 == 0) goto L3a
            if (r6 == 0) goto L3a
            int r1 = r6.length
            r2 = 16
            if (r1 >= r2) goto Lb
            goto L3a
        Lb:
            byte[] r5 = j(r5)
            int r1 = r5.length
            if (r1 != 0) goto L15
            byte[] r5 = new byte[r0]
            return r5
        L15:
            int r1 = a(r5)
            if (r1 < 0) goto L30
            byte[] r2 = java.util.Arrays.copyOf(r5, r1)
            int r3 = r5.length
            int r4 = r2.length
            int r3 = r3 - r4
            int r3 = r3 + (-1)
            byte[] r4 = new byte[r3]
            int r1 = r1 + 1
            java.lang.System.arraycopy(r5, r1, r4, r0, r3)
            byte[] r5 = p(r4, r6, r2)
            return r5
        L30:
            java.lang.String r5 = "CBC"
            java.lang.String r6 = " cbc cipherText data missing colon"
            c2.g.d(r5, r6)
            byte[] r5 = new byte[r0]
            return r5
        L3a:
            byte[] r5 = new byte[r0]
            return r5
    }

    public static java.lang.String t(java.lang.String r4, java.lang.String r5) {
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            java.lang.String r1 = ""
            java.lang.String r2 = "CBC"
            if (r0 == 0) goto L10
            java.lang.String r4 = "encrypt 1 content is null"
            c2.g.d(r2, r4)
            return r1
        L10:
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 == 0) goto L1c
            java.lang.String r4 = "encrypt 1 key is null"
            c2.g.d(r2, r4)
            return r1
        L1c:
            byte[] r5 = c2.c.c(r5)
            int r0 = r5.length
            r3 = 16
            if (r0 >= r3) goto L2b
            java.lang.String r4 = "encrypt 1 key error: 1 key length less than 16 bytes."
            c2.g.d(r2, r4)
            return r1
        L2b:
            java.lang.String r4 = v(r4, r5)
            return r4
    }

    public static java.lang.String u(java.lang.String r4, java.lang.String r5, java.lang.String r6) {
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            java.lang.String r1 = ""
            java.lang.String r2 = "CBC"
            if (r0 == 0) goto L10
            java.lang.String r4 = "encrypt 3 content is null"
            c2.g.d(r2, r4)
            return r1
        L10:
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 == 0) goto L1c
            java.lang.String r4 = "encrypt 3 key is null"
            c2.g.d(r2, r4)
            return r1
        L1c:
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 == 0) goto L28
            java.lang.String r4 = "encrypt 3 iv is null"
            c2.g.d(r2, r4)
            return r1
        L28:
            byte[] r5 = c2.c.c(r5)
            byte[] r6 = c2.c.c(r6)
            int r0 = r5.length
            r3 = 16
            if (r0 >= r3) goto L3b
            java.lang.String r4 = "encrypt 3 key error: 3 key length less than 16 bytes."
            c2.g.d(r2, r4)
            return r1
        L3b:
            int r0 = r6.length
            if (r0 >= r3) goto L44
            java.lang.String r4 = "encrypt 3 iv error: 3 iv length less than 16 bytes."
            c2.g.d(r2, r4)
            return r1
        L44:
            java.lang.String r4 = w(r4, r5, r6)
            return r4
    }

    public static java.lang.String v(java.lang.String r4, byte[] r5) {
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            java.lang.String r1 = "CBC"
            java.lang.String r2 = ""
            if (r0 == 0) goto L10
            java.lang.String r4 = "encrypt 2 content is null"
            c2.g.d(r1, r4)
            return r2
        L10:
            if (r5 != 0) goto L18
            java.lang.String r4 = "encrypt 2 key is null"
            c2.g.d(r1, r4)
            return r2
        L18:
            int r0 = r5.length
            r3 = 16
            if (r0 >= r3) goto L23
            java.lang.String r4 = "encrypt 2 key error: 2 key length less than 16 bytes."
            c2.g.d(r1, r4)
            return r2
        L23:
            byte[] r0 = c2.b.d(r3)
            byte[] r4 = d(r4, r5, r0)
            if (r4 == 0) goto L3e
            int r5 = r4.length
            if (r5 != 0) goto L31
            goto L3e
        L31:
            java.lang.String r5 = c2.c.b(r0)
            java.lang.String r4 = c2.c.b(r4)
            java.lang.String r4 = c(r5, r4)
            return r4
        L3e:
            return r2
    }

    public static java.lang.String w(java.lang.String r4, byte[] r5, byte[] r6) {
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            java.lang.String r1 = ""
            java.lang.String r2 = "CBC"
            if (r0 == 0) goto L10
            java.lang.String r4 = "encrypt 4 content is null"
            c2.g.d(r2, r4)
            return r1
        L10:
            if (r5 != 0) goto L18
            java.lang.String r4 = "encrypt 4 key is null"
            c2.g.d(r2, r4)
            return r1
        L18:
            int r0 = r5.length
            r3 = 16
            if (r0 >= r3) goto L23
            java.lang.String r4 = "encrypt 4 key error: 4 key length less than 16 bytes."
            c2.g.d(r2, r4)
            return r1
        L23:
            if (r6 != 0) goto L2b
            java.lang.String r4 = "encrypt 4 iv is null"
            c2.g.d(r2, r4)
            return r1
        L2b:
            int r0 = r6.length
            if (r0 >= r3) goto L34
            java.lang.String r4 = "encrypt 4 iv error: 4 iv length less than 16 bytes."
            c2.g.d(r2, r4)
            return r1
        L34:
            byte[] r4 = d(r4, r5, r6)
            java.lang.String r4 = c2.c.b(r4)
            return r4
    }

    public static byte[] x(byte[] r1, byte[] r2) {
            r0 = 16
            byte[] r0 = c2.b.d(r0)
            byte[] r1 = y(r1, r2, r0)
            byte[] r1 = e(r0, r1)
            return r1
    }

    public static byte[] y(byte[] r4, byte[] r5, byte[] r6) {
            r0 = 0
            java.lang.String r1 = "CBC"
            if (r4 != 0) goto Ld
            java.lang.String r4 = "encrypt 6 content is null"
            c2.g.d(r1, r4)
            byte[] r4 = new byte[r0]
            return r4
        Ld:
            int r2 = r4.length
            if (r2 != 0) goto L18
            java.lang.String r4 = "encrypt 6 content length is 0"
            c2.g.d(r1, r4)
            byte[] r4 = new byte[r0]
            return r4
        L18:
            if (r5 != 0) goto L22
            java.lang.String r4 = "encrypt 6 key is null"
            c2.g.d(r1, r4)
            byte[] r4 = new byte[r0]
            return r4
        L22:
            int r2 = r5.length
            r3 = 16
            if (r2 >= r3) goto L2f
            java.lang.String r4 = "encrypt 6 key error: 6 key length less than 16 bytes."
            c2.g.d(r1, r4)
            byte[] r4 = new byte[r0]
            return r4
        L2f:
            if (r6 != 0) goto L39
            java.lang.String r4 = "encrypt 6 iv is null"
            c2.g.d(r1, r4)
            byte[] r4 = new byte[r0]
            return r4
        L39:
            int r2 = r6.length
            if (r2 >= r3) goto L44
            java.lang.String r4 = "encrypt 6 iv error: 6 iv length less than 16 bytes."
            c2.g.d(r1, r4)
            byte[] r4 = new byte[r0]
            return r4
        L44:
            javax.crypto.spec.SecretKeySpec r2 = new javax.crypto.spec.SecretKeySpec
            java.lang.String r3 = "AES"
            r2.<init>(r5, r3)
            java.lang.String r5 = "AES/CBC/PKCS5Padding"
            javax.crypto.Cipher r5 = javax.crypto.Cipher.getInstance(r5)     // Catch: java.lang.NullPointerException -> L5f javax.crypto.BadPaddingException -> L61 javax.crypto.IllegalBlockSizeException -> L63 java.security.InvalidAlgorithmParameterException -> L65 java.security.InvalidKeyException -> L67 javax.crypto.NoSuchPaddingException -> L69 java.security.NoSuchAlgorithmException -> L6c
            javax.crypto.spec.IvParameterSpec r3 = new javax.crypto.spec.IvParameterSpec     // Catch: java.lang.NullPointerException -> L5f javax.crypto.BadPaddingException -> L61 javax.crypto.IllegalBlockSizeException -> L63 java.security.InvalidAlgorithmParameterException -> L65 java.security.InvalidKeyException -> L67 javax.crypto.NoSuchPaddingException -> L69 java.security.NoSuchAlgorithmException -> L6c
            r3.<init>(r6)     // Catch: java.lang.NullPointerException -> L5f javax.crypto.BadPaddingException -> L61 javax.crypto.IllegalBlockSizeException -> L63 java.security.InvalidAlgorithmParameterException -> L65 java.security.InvalidKeyException -> L67 javax.crypto.NoSuchPaddingException -> L69 java.security.NoSuchAlgorithmException -> L6c
            r6 = 1
            r5.init(r6, r2, r3)     // Catch: java.lang.NullPointerException -> L5f javax.crypto.BadPaddingException -> L61 javax.crypto.IllegalBlockSizeException -> L63 java.security.InvalidAlgorithmParameterException -> L65 java.security.InvalidKeyException -> L67 javax.crypto.NoSuchPaddingException -> L69 java.security.NoSuchAlgorithmException -> L6c
            byte[] r4 = r5.doFinal(r4)     // Catch: java.lang.NullPointerException -> L5f javax.crypto.BadPaddingException -> L61 javax.crypto.IllegalBlockSizeException -> L63 java.security.InvalidAlgorithmParameterException -> L65 java.security.InvalidKeyException -> L67 javax.crypto.NoSuchPaddingException -> L69 java.security.NoSuchAlgorithmException -> L6c
            return r4
        L5f:
            r4 = move-exception
            goto L6f
        L61:
            r4 = move-exception
            goto L89
        L63:
            r4 = move-exception
            goto La3
        L65:
            r4 = move-exception
            goto Lbc
        L67:
            r4 = move-exception
            goto Ld5
        L69:
            r4 = move-exception
            goto Lee
        L6c:
            r4 = move-exception
            goto L107
        L6f:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "NullPointerException: "
            r5.append(r6)
            java.lang.String r4 = r4.getMessage()
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            c2.g.d(r1, r4)
            goto L11f
        L89:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "BadPaddingException: "
            r5.append(r6)
            java.lang.String r4 = r4.getMessage()
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            c2.g.d(r1, r4)
            goto L11f
        La3:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "IllegalBlockSizeException: "
            r5.append(r6)
            java.lang.String r4 = r4.getMessage()
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            c2.g.d(r1, r4)
            goto L11f
        Lbc:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "InvalidAlgorithmParameterException: "
            r5.append(r6)
            java.lang.String r4 = r4.getMessage()
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            c2.g.d(r1, r4)
            goto L11f
        Ld5:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "InvalidKeyException: "
            r5.append(r6)
            java.lang.String r4 = r4.getMessage()
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            c2.g.d(r1, r4)
            goto L11f
        Lee:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "NoSuchPaddingException: "
            r5.append(r6)
            java.lang.String r4 = r4.getMessage()
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            c2.g.d(r1, r4)
            goto L11f
        L107:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "NoSuchAlgorithmException: "
            r5.append(r6)
            java.lang.String r4 = r4.getMessage()
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            c2.g.d(r1, r4)
        L11f:
            byte[] r4 = new byte[r0]
            return r4
    }
}
