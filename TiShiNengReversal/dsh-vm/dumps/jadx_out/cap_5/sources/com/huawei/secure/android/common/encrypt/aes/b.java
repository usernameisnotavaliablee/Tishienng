package com.huawei.secure.android.common.encrypt.aes;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class b {
    private static final java.lang.String a = "security:";
    private static final java.lang.String b = "AES/GCM/NoPadding";
    private static final java.lang.String c = "AES";
    private static final java.lang.String d = "GCM";
    private static final java.lang.String e = "";
    private static final int f = 16;
    private static final int g = 12;
    private static final int h = 2;

    private b() {
            r0 = this;
            r0.<init>()
            return
    }

    private static int a(byte[] r2) {
            r0 = 12
            r2 = r2[r0]
            r1 = 58
            if (r2 != r1) goto L9
            return r0
        L9:
            r2 = -1
            return r2
    }

    private static java.lang.String b(java.lang.String r2) {
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L14
            int r0 = r2.length()
            r1 = 24
            if (r0 >= r1) goto Lf
            goto L14
        Lf:
            java.lang.String r2 = r2.substring(r1)
            return r2
        L14:
            java.lang.String r2 = ""
            return r2
    }

    private static byte[] c(java.lang.String r4, byte[] r5, byte[] r6) {
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            r1 = 0
            java.lang.String r2 = "GCM"
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
            r3 = 12
            if (r0 >= r3) goto L3f
            java.lang.String r4 = "encrypt 5 iv error: 5 iv length less than 16 bytes."
            c2.g.d(r2, r4)
            byte[] r4 = new byte[r1]
            return r4
        L3f:
            boolean r0 = x()
            if (r0 != 0) goto L4d
            java.lang.String r4 = "encrypt 5 build version not higher than 19"
            c2.g.d(r2, r4)
            byte[] r4 = new byte[r1]
            return r4
        L4d:
            java.lang.String r0 = "UTF-8"
            byte[] r4 = r4.getBytes(r0)     // Catch: java.io.UnsupportedEncodingException -> L58
            byte[] r4 = v(r4, r5, r6)     // Catch: java.io.UnsupportedEncodingException -> L58
            return r4
        L58:
            r4 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "GCM encrypt data error"
            r5.append(r6)
            java.lang.String r4 = r4.getMessage()
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            c2.g.d(r2, r4)
            byte[] r4 = new byte[r1]
            return r4
    }

    private static byte[] d(byte[] r3, byte[] r4) {
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

    private static java.lang.String e(java.lang.String r2) {
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L15
            int r0 = r2.length()
            r1 = 24
            if (r0 >= r1) goto Lf
            goto L15
        Lf:
            r0 = 0
            java.lang.String r2 = r2.substring(r0, r1)
            return r2
        L15:
            java.lang.String r2 = "GCM"
            java.lang.String r0 = "IV is invalid."
            c2.g.d(r2, r0)
            java.lang.String r2 = ""
            return r2
    }

    private static byte[] f(byte[] r4) {
            int r0 = r4.length
            r1 = 12
            int r0 = r0 - r1
            byte[] r0 = new byte[r0]
            int r2 = r4.length
            int r2 = r2 - r1
            r3 = 0
            java.lang.System.arraycopy(r4, r1, r0, r3, r2)
            return r0
    }

    private static byte[] g(byte[] r3) {
            r0 = 12
            byte[] r1 = new byte[r0]
            r2 = 0
            java.lang.System.arraycopy(r3, r2, r1, r2, r0)
            return r1
    }

    public static java.lang.String h(java.lang.String r4, java.lang.String r5) {
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            java.lang.String r1 = ""
            java.lang.String r2 = "GCM"
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
            boolean r0 = x()
            if (r0 != 0) goto L28
            java.lang.String r4 = "decrypt 1 build version not higher than 19"
            c2.g.d(r2, r4)
            return r1
        L28:
            byte[] r5 = c2.c.c(r5)
            int r0 = r5.length
            r3 = 16
            if (r0 >= r3) goto L37
            java.lang.String r4 = "decrypt 1 key error: 1 key length less than 16 bytes."
            c2.g.d(r2, r4)
            return r1
        L37:
            java.lang.String r4 = j(r4, r5)
            return r4
    }

    public static java.lang.String i(java.lang.String r4, java.lang.String r5, java.lang.String r6) {
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            java.lang.String r1 = ""
            java.lang.String r2 = "GCM"
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
            boolean r0 = x()
            if (r0 != 0) goto L34
            java.lang.String r4 = "decrypt 3 build version not higher than 19"
            c2.g.d(r2, r4)
            return r1
        L34:
            byte[] r5 = c2.c.c(r5)
            byte[] r6 = c2.c.c(r6)
            int r0 = r5.length
            r3 = 16
            if (r0 >= r3) goto L47
            java.lang.String r4 = "decrypt 3 key error: 3 key length less than 16 bytes."
            c2.g.d(r2, r4)
            return r1
        L47:
            int r0 = r6.length
            r3 = 12
            if (r0 >= r3) goto L52
            java.lang.String r4 = "decrypt 3 iv error: 3 iv length less than 16 bytes."
            c2.g.d(r2, r4)
            return r1
        L52:
            java.lang.String r4 = k(r4, r5, r6)
            return r4
    }

    public static java.lang.String j(java.lang.String r5, byte[] r6) {
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            java.lang.String r1 = ""
            java.lang.String r2 = "GCM"
            if (r0 == 0) goto L10
            java.lang.String r5 = "decrypt 2 content is null"
            c2.g.d(r2, r5)
            return r1
        L10:
            if (r6 != 0) goto L18
            java.lang.String r5 = "decrypt 2 key is null"
            c2.g.d(r2, r5)
            return r1
        L18:
            int r0 = r6.length
            r3 = 16
            if (r0 >= r3) goto L23
            java.lang.String r5 = "decrypt 2 key error: 2 key length less than 16 bytes."
            c2.g.d(r2, r5)
            return r1
        L23:
            boolean r0 = x()
            if (r0 != 0) goto L2f
            java.lang.String r5 = "decrypt 2 build version not higher than 19"
            c2.g.d(r2, r5)
            return r1
        L2f:
            javax.crypto.spec.SecretKeySpec r0 = new javax.crypto.spec.SecretKeySpec     // Catch: java.io.UnsupportedEncodingException -> L50 java.security.GeneralSecurityException -> L52 java.lang.NullPointerException -> L54
            java.lang.String r3 = "AES"
            r0.<init>(r6, r3)     // Catch: java.io.UnsupportedEncodingException -> L50 java.security.GeneralSecurityException -> L52 java.lang.NullPointerException -> L54
            java.lang.String r6 = "AES/GCM/NoPadding"
            javax.crypto.Cipher r6 = javax.crypto.Cipher.getInstance(r6)     // Catch: java.io.UnsupportedEncodingException -> L50 java.security.GeneralSecurityException -> L52 java.lang.NullPointerException -> L54
            java.lang.String r3 = e(r5)     // Catch: java.io.UnsupportedEncodingException -> L50 java.security.GeneralSecurityException -> L52 java.lang.NullPointerException -> L54
            java.lang.String r5 = b(r5)     // Catch: java.io.UnsupportedEncodingException -> L50 java.security.GeneralSecurityException -> L52 java.lang.NullPointerException -> L54
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: java.io.UnsupportedEncodingException -> L50 java.security.GeneralSecurityException -> L52 java.lang.NullPointerException -> L54
            if (r4 == 0) goto L56
            java.lang.String r5 = "decrypt 2 iv is null"
            c2.g.d(r2, r5)     // Catch: java.io.UnsupportedEncodingException -> L50 java.security.GeneralSecurityException -> L52 java.lang.NullPointerException -> L54
            return r1
        L50:
            r5 = move-exception
            goto L7e
        L52:
            r5 = move-exception
            goto L7e
        L54:
            r5 = move-exception
            goto L7e
        L56:
            boolean r4 = android.text.TextUtils.isEmpty(r5)     // Catch: java.io.UnsupportedEncodingException -> L50 java.security.GeneralSecurityException -> L52 java.lang.NullPointerException -> L54
            if (r4 == 0) goto L62
            java.lang.String r5 = "decrypt 2 encrypt content is null"
            c2.g.d(r2, r5)     // Catch: java.io.UnsupportedEncodingException -> L50 java.security.GeneralSecurityException -> L52 java.lang.NullPointerException -> L54
            return r1
        L62:
            byte[] r3 = c2.c.c(r3)     // Catch: java.io.UnsupportedEncodingException -> L50 java.security.GeneralSecurityException -> L52 java.lang.NullPointerException -> L54
            java.security.spec.AlgorithmParameterSpec r3 = w(r3)     // Catch: java.io.UnsupportedEncodingException -> L50 java.security.GeneralSecurityException -> L52 java.lang.NullPointerException -> L54
            r4 = 2
            r6.init(r4, r0, r3)     // Catch: java.io.UnsupportedEncodingException -> L50 java.security.GeneralSecurityException -> L52 java.lang.NullPointerException -> L54
            byte[] r5 = c2.c.c(r5)     // Catch: java.io.UnsupportedEncodingException -> L50 java.security.GeneralSecurityException -> L52 java.lang.NullPointerException -> L54
            byte[] r5 = r6.doFinal(r5)     // Catch: java.io.UnsupportedEncodingException -> L50 java.security.GeneralSecurityException -> L52 java.lang.NullPointerException -> L54
            java.lang.String r6 = new java.lang.String     // Catch: java.io.UnsupportedEncodingException -> L50 java.security.GeneralSecurityException -> L52 java.lang.NullPointerException -> L54
            java.lang.String r0 = "UTF-8"
            r6.<init>(r5, r0)     // Catch: java.io.UnsupportedEncodingException -> L50 java.security.GeneralSecurityException -> L52 java.lang.NullPointerException -> L54
            return r6
        L7e:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "GCM decrypt data exception: "
            r6.append(r0)
            java.lang.String r5 = r5.getMessage()
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            c2.g.d(r2, r5)
            return r1
    }

    public static java.lang.String k(java.lang.String r4, byte[] r5, byte[] r6) {
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            java.lang.String r1 = ""
            java.lang.String r2 = "GCM"
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
            r3 = 12
            if (r0 >= r3) goto L36
            java.lang.String r4 = "decrypt 4 iv error: 4 iv length less than 16 bytes."
            c2.g.d(r2, r4)
            return r1
        L36:
            boolean r0 = x()
            if (r0 != 0) goto L42
            java.lang.String r4 = "decrypt 4 build version not higher than 19"
            c2.g.d(r2, r4)
            return r1
        L42:
            byte[] r4 = c2.c.c(r4)     // Catch: java.io.UnsupportedEncodingException -> L52
            byte[] r4 = m(r4, r5, r6)     // Catch: java.io.UnsupportedEncodingException -> L52
            java.lang.String r5 = new java.lang.String     // Catch: java.io.UnsupportedEncodingException -> L52
            java.lang.String r6 = "UTF-8"
            r5.<init>(r4, r6)     // Catch: java.io.UnsupportedEncodingException -> L52
            return r5
        L52:
            r4 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "GCM decrypt data exception: "
            r5.append(r6)
            java.lang.String r4 = r4.getMessage()
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            c2.g.d(r2, r4)
            return r1
    }

    public static byte[] l(byte[] r1, byte[] r2) {
            byte[] r0 = g(r1)
            byte[] r1 = f(r1)
            byte[] r1 = m(r1, r2, r0)
            return r1
    }

    public static byte[] m(byte[] r4, byte[] r5, byte[] r6) {
            r0 = 0
            java.lang.String r1 = "GCM"
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
            r3 = 12
            if (r2 >= r3) goto L46
            java.lang.String r4 = "decrypt 6 iv error: 6 iv length less than 16 bytes."
            c2.g.d(r1, r4)
            byte[] r4 = new byte[r0]
            return r4
        L46:
            boolean r2 = x()
            if (r2 != 0) goto L54
            java.lang.String r4 = "decrypt 6 build version not higher than 19"
            c2.g.d(r1, r4)
            byte[] r4 = new byte[r0]
            return r4
        L54:
            javax.crypto.spec.SecretKeySpec r2 = new javax.crypto.spec.SecretKeySpec     // Catch: java.security.GeneralSecurityException -> L6e
            java.lang.String r3 = "AES"
            r2.<init>(r5, r3)     // Catch: java.security.GeneralSecurityException -> L6e
            java.lang.String r5 = "AES/GCM/NoPadding"
            javax.crypto.Cipher r5 = javax.crypto.Cipher.getInstance(r5)     // Catch: java.security.GeneralSecurityException -> L6e
            java.security.spec.AlgorithmParameterSpec r6 = w(r6)     // Catch: java.security.GeneralSecurityException -> L6e
            r3 = 2
            r5.init(r3, r2, r6)     // Catch: java.security.GeneralSecurityException -> L6e
            byte[] r4 = r5.doFinal(r4)     // Catch: java.security.GeneralSecurityException -> L6e
            return r4
        L6e:
            r4 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "GCM decrypt data exception: "
            r5.append(r6)
            java.lang.String r4 = r4.getMessage()
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            c2.g.d(r1, r4)
            byte[] r4 = new byte[r0]
            return r4
    }

    public static java.lang.String n(java.lang.String r3, byte[] r4) {
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            java.lang.String r1 = ""
            if (r0 != 0) goto L46
            if (r4 == 0) goto L46
            int r0 = r4.length
            r2 = 16
            if (r0 >= r2) goto L10
            goto L46
        L10:
            java.lang.String r3 = com.huawei.secure.android.common.encrypt.aes.a.h(r3)
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
            java.lang.String r3 = k(r3, r4, r1)
            return r3
        L3f:
            java.lang.String r3 = "GCM"
            java.lang.String r4 = " gcm cipherText data missing colon"
            c2.g.d(r3, r4)
        L46:
            return r1
    }

    public static java.lang.String o(byte[] r1, byte[] r2) {
            java.lang.String r0 = new java.lang.String     // Catch: java.io.UnsupportedEncodingException -> Lc
            byte[] r1 = p(r1, r2)     // Catch: java.io.UnsupportedEncodingException -> Lc
            java.lang.String r2 = "UTF-8"
            r0.<init>(r1, r2)     // Catch: java.io.UnsupportedEncodingException -> Lc
            return r0
        Lc:
            java.lang.String r1 = "GCM"
            java.lang.String r2 = "UnsupportedEncodingException"
            c2.g.d(r1, r2)
            java.lang.String r1 = ""
            return r1
    }

    public static byte[] p(byte[] r5, byte[] r6) {
            r0 = 0
            if (r5 == 0) goto L3a
            if (r6 == 0) goto L3a
            int r1 = r6.length
            r2 = 16
            if (r1 >= r2) goto Lb
            goto L3a
        Lb:
            byte[] r5 = com.huawei.secure.android.common.encrypt.aes.a.j(r5)
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
            byte[] r5 = m(r4, r6, r2)
            return r5
        L30:
            java.lang.String r5 = "GCM"
            java.lang.String r6 = " gcm cipherText data missing colon"
            c2.g.d(r5, r6)
            byte[] r5 = new byte[r0]
            return r5
        L3a:
            byte[] r5 = new byte[r0]
            return r5
    }

    public static java.lang.String q(java.lang.String r4, java.lang.String r5) {
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            java.lang.String r1 = ""
            java.lang.String r2 = "GCM"
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
            boolean r0 = x()
            if (r0 != 0) goto L28
            java.lang.String r4 = "encrypt 1 build version not higher than 19"
            c2.g.d(r2, r4)
            return r1
        L28:
            byte[] r5 = c2.c.c(r5)
            int r0 = r5.length
            r3 = 16
            if (r0 >= r3) goto L37
            java.lang.String r4 = "encrypt key error: key length less than 16 bytes."
            c2.g.d(r2, r4)
            return r1
        L37:
            java.lang.String r4 = s(r4, r5)
            return r4
    }

    public static java.lang.String r(java.lang.String r4, java.lang.String r5, java.lang.String r6) {
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            java.lang.String r1 = ""
            java.lang.String r2 = "GCM"
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
            boolean r0 = x()
            if (r0 != 0) goto L34
            java.lang.String r4 = "encrypt 3 build version not higher than 19"
            c2.g.d(r2, r4)
            return r1
        L34:
            byte[] r5 = c2.c.c(r5)
            byte[] r6 = c2.c.c(r6)
            int r0 = r5.length
            r3 = 16
            if (r0 >= r3) goto L47
            java.lang.String r4 = "encrypt 3 key error: 3 key length less than 16 bytes."
            c2.g.d(r2, r4)
            return r1
        L47:
            int r0 = r6.length
            r3 = 12
            if (r0 >= r3) goto L52
            java.lang.String r4 = "encrypt 3 iv error: 3 iv length less than 16 bytes."
            c2.g.d(r2, r4)
            return r1
        L52:
            java.lang.String r4 = t(r4, r5, r6)
            return r4
    }

    public static java.lang.String s(java.lang.String r4, byte[] r5) {
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            java.lang.String r1 = "GCM"
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
            boolean r0 = x()
            if (r0 != 0) goto L2f
            java.lang.String r4 = "encrypt 2 build version not higher than 19"
            c2.g.d(r1, r4)
            return r2
        L2f:
            r0 = 12
            byte[] r0 = c2.b.d(r0)
            byte[] r4 = c(r4, r5, r0)
            if (r4 == 0) goto L57
            int r5 = r4.length
            if (r5 != 0) goto L3f
            goto L57
        L3f:
            java.lang.String r5 = c2.c.b(r0)
            java.lang.String r4 = c2.c.b(r4)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r5)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            return r4
        L57:
            return r2
    }

    public static java.lang.String t(java.lang.String r4, byte[] r5, byte[] r6) {
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            java.lang.String r1 = ""
            java.lang.String r2 = "GCM"
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
            java.lang.String r4 = "encrypt 4 key error: 3 key length less than 16 bytes."
            c2.g.d(r2, r4)
            return r1
        L23:
            if (r6 != 0) goto L2b
            java.lang.String r4 = "encrypt 4 iv is null"
            c2.g.d(r2, r4)
            return r1
        L2b:
            int r0 = r6.length
            r3 = 12
            if (r0 >= r3) goto L36
            java.lang.String r4 = "encrypt 3 iv error: 3 iv length less than 16 bytes."
            c2.g.d(r2, r4)
            return r1
        L36:
            boolean r0 = x()
            if (r0 != 0) goto L42
            java.lang.String r4 = "encrypt 4 build version not higher than 19"
            c2.g.d(r2, r4)
            return r1
        L42:
            byte[] r4 = c(r4, r5, r6)
            java.lang.String r4 = c2.c.b(r4)
            return r4
    }

    public static byte[] u(byte[] r1, byte[] r2) {
            r0 = 12
            byte[] r0 = c2.b.d(r0)
            byte[] r1 = v(r1, r2, r0)
            byte[] r1 = d(r0, r1)
            return r1
    }

    public static byte[] v(byte[] r5, byte[] r6, byte[] r7) {
            java.lang.String r0 = "GCM encrypt data error"
            r1 = 0
            java.lang.String r2 = "GCM"
            if (r5 != 0) goto Lf
            java.lang.String r5 = "encrypt 6 content is null"
            c2.g.d(r2, r5)
            byte[] r5 = new byte[r1]
            return r5
        Lf:
            int r3 = r5.length
            if (r3 != 0) goto L1a
            java.lang.String r5 = "encrypt 6 content length is 0"
            c2.g.d(r2, r5)
            byte[] r5 = new byte[r1]
            return r5
        L1a:
            if (r6 != 0) goto L24
            java.lang.String r5 = "encrypt 6 key is null"
            c2.g.d(r2, r5)
            byte[] r5 = new byte[r1]
            return r5
        L24:
            int r3 = r6.length
            r4 = 16
            if (r3 >= r4) goto L31
            java.lang.String r5 = "encrypt 6 key error: 6 key length less than 16 bytes."
            c2.g.d(r2, r5)
            byte[] r5 = new byte[r1]
            return r5
        L31:
            if (r7 != 0) goto L3b
            java.lang.String r5 = "encrypt 6 iv is null"
            c2.g.d(r2, r5)
            byte[] r5 = new byte[r1]
            return r5
        L3b:
            int r3 = r7.length
            r4 = 12
            if (r3 >= r4) goto L48
            java.lang.String r5 = "encrypt 6 iv error: 6 iv length less than 16 bytes."
            c2.g.d(r2, r5)
            byte[] r5 = new byte[r1]
            return r5
        L48:
            boolean r3 = x()
            if (r3 != 0) goto L56
            java.lang.String r5 = "encrypt 6 build version not higher than 19"
            c2.g.d(r2, r5)
            byte[] r5 = new byte[r1]
            return r5
        L56:
            javax.crypto.spec.SecretKeySpec r3 = new javax.crypto.spec.SecretKeySpec     // Catch: java.lang.NullPointerException -> L70 java.security.GeneralSecurityException -> L72
            java.lang.String r4 = "AES"
            r3.<init>(r6, r4)     // Catch: java.lang.NullPointerException -> L70 java.security.GeneralSecurityException -> L72
            java.lang.String r6 = "AES/GCM/NoPadding"
            javax.crypto.Cipher r6 = javax.crypto.Cipher.getInstance(r6)     // Catch: java.lang.NullPointerException -> L70 java.security.GeneralSecurityException -> L72
            java.security.spec.AlgorithmParameterSpec r7 = w(r7)     // Catch: java.lang.NullPointerException -> L70 java.security.GeneralSecurityException -> L72
            r4 = 1
            r6.init(r4, r3, r7)     // Catch: java.lang.NullPointerException -> L70 java.security.GeneralSecurityException -> L72
            byte[] r5 = r6.doFinal(r5)     // Catch: java.lang.NullPointerException -> L70 java.security.GeneralSecurityException -> L72
            return r5
        L70:
            r5 = move-exception
            goto L74
        L72:
            r5 = move-exception
            goto L8b
        L74:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r0)
            java.lang.String r5 = r5.getMessage()
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            c2.g.d(r2, r5)
            goto La1
        L8b:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r0)
            java.lang.String r5 = r5.getMessage()
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            c2.g.d(r2, r5)
        La1:
            byte[] r5 = new byte[r1]
            return r5
    }

    public static java.security.spec.AlgorithmParameterSpec w(byte[] r2) {
            javax.crypto.spec.GCMParameterSpec r0 = new javax.crypto.spec.GCMParameterSpec
            r1 = 128(0x80, float:1.8E-43)
            r0.<init>(r1, r2)
            return r0
    }

    public static boolean x() {
            r0 = 1
            return r0
    }
}
