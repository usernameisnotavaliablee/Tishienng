package y1;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public abstract class c {
    private static final java.lang.String a = "PBKDF2";
    private static final java.lang.String b = "PBKDF2WithHmacSHA1";
    private static final java.lang.String c = "PBKDF2WithHmacSHA256";
    private static final java.lang.String d = "";
    private static final int e = 8;
    private static final int f = 16;
    private static final int g = 32;
    private static final int h = 10000;
    private static final int i = 1000;

    static {
            return
    }

    public c() {
            r0 = this;
            r0.<init>()
            return
    }

    private static boolean a(byte[] r5, byte[] r6) {
            r0 = 0
            if (r5 == 0) goto L1d
            if (r6 != 0) goto L6
            goto L1d
        L6:
            int r1 = r5.length
            int r2 = r6.length
            r1 = r1 ^ r2
            r2 = 0
        La:
            int r3 = r5.length
            if (r2 >= r3) goto L19
            int r3 = r6.length
            if (r2 >= r3) goto L19
            r3 = r5[r2]
            r4 = r6[r2]
            r3 = r3 ^ r4
            r1 = r1 | r3
            int r2 = r2 + 1
            goto La
        L19:
            if (r1 != 0) goto L1d
            r5 = 1
            return r5
        L1d:
            return r0
    }

    private static byte[] b(char[] r1, byte[] r2, int r3, int r4, boolean r5) {
            javax.crypto.spec.PBEKeySpec r0 = new javax.crypto.spec.PBEKeySpec     // Catch: java.security.spec.InvalidKeySpecException -> L1d java.security.NoSuchAlgorithmException -> L1f
            r0.<init>(r1, r2, r3, r4)     // Catch: java.security.spec.InvalidKeySpecException -> L1d java.security.NoSuchAlgorithmException -> L1f
            if (r5 == 0) goto Le
            java.lang.String r1 = "PBKDF2WithHmacSHA256"
            javax.crypto.SecretKeyFactory r1 = javax.crypto.SecretKeyFactory.getInstance(r1)     // Catch: java.security.spec.InvalidKeySpecException -> L1d java.security.NoSuchAlgorithmException -> L1f
            goto L14
        Le:
            java.lang.String r1 = "PBKDF2WithHmacSHA1"
            javax.crypto.SecretKeyFactory r1 = javax.crypto.SecretKeyFactory.getInstance(r1)     // Catch: java.security.spec.InvalidKeySpecException -> L1d java.security.NoSuchAlgorithmException -> L1f
        L14:
            javax.crypto.SecretKey r1 = r1.generateSecret(r0)     // Catch: java.security.spec.InvalidKeySpecException -> L1d java.security.NoSuchAlgorithmException -> L1f
            byte[] r1 = r1.getEncoded()     // Catch: java.security.spec.InvalidKeySpecException -> L1d java.security.NoSuchAlgorithmException -> L1f
            return r1
        L1d:
            r1 = move-exception
            goto L20
        L1f:
            r1 = move-exception
        L20:
            java.lang.String r2 = y1.c.a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "pbkdf exception : "
            r3.append(r4)
            java.lang.String r1 = r1.getMessage()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            c2.g.d(r2, r1)
            r1 = 0
            byte[] r1 = new byte[r1]
            return r1
    }

    public static byte[] c(char[] r1, byte[] r2, int r3, int r4) {
            r0 = 0
            byte[] r1 = b(r1, r2, r3, r4, r0)
            return r1
    }

    @java.lang.Deprecated
    public static java.lang.String d(java.lang.String r1) {
            r0 = 10000(0x2710, float:1.4013E-41)
            java.lang.String r1 = e(r1, r0)
            return r1
    }

    @java.lang.Deprecated
    public static java.lang.String e(java.lang.String r2, int r3) {
            r0 = 8
            byte[] r0 = c2.b.d(r0)
            r1 = 32
            java.lang.String r2 = f(r2, r0, r3, r1)
            return r2
    }

    @java.lang.Deprecated
    public static java.lang.String f(java.lang.String r3, byte[] r4, int r5, int r6) {
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            java.lang.String r1 = ""
            if (r0 == 0) goto L10
            java.lang.String r3 = y1.c.a
            java.lang.String r4 = "pwd is null."
            c2.g.d(r3, r4)
            return r1
        L10:
            r0 = 1000(0x3e8, float:1.401E-42)
            if (r5 >= r0) goto L1c
            java.lang.String r3 = y1.c.a
            java.lang.String r4 = "iterations times is not enough."
            c2.g.d(r3, r4)
            return r1
        L1c:
            if (r4 == 0) goto L52
            int r0 = r4.length
            r2 = 8
            if (r0 >= r2) goto L24
            goto L52
        L24:
            r0 = 32
            if (r6 >= r0) goto L30
            java.lang.String r3 = y1.c.a
            java.lang.String r4 = "cipherLen length is not enough"
            c2.g.d(r3, r4)
            return r1
        L30:
            char[] r3 = r3.toCharArray()
            int r6 = r6 * 8
            byte[] r3 = c(r3, r4, r5, r6)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r4 = c2.c.b(r4)
            r5.append(r4)
            java.lang.String r3 = c2.c.b(r3)
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            return r3
        L52:
            java.lang.String r3 = y1.c.a
            java.lang.String r4 = "salt parameter is null or length is not enough"
            c2.g.d(r3, r4)
            return r1
    }

    public static java.lang.String g(java.lang.String r1) {
            r0 = 10000(0x2710, float:1.4013E-41)
            java.lang.String r1 = h(r1, r0)
            return r1
    }

    public static java.lang.String h(java.lang.String r2, int r3) {
            r0 = 16
            byte[] r0 = c2.b.d(r0)
            r1 = 32
            java.lang.String r2 = i(r2, r0, r3, r1)
            return r2
    }

    public static java.lang.String i(java.lang.String r3, byte[] r4, int r5, int r6) {
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            java.lang.String r1 = ""
            if (r0 == 0) goto L10
            java.lang.String r3 = y1.c.a
            java.lang.String r4 = "pwd is null."
            c2.g.d(r3, r4)
            return r1
        L10:
            r0 = 1000(0x3e8, float:1.401E-42)
            if (r5 >= r0) goto L1c
            java.lang.String r3 = y1.c.a
            java.lang.String r4 = "iterations times is not enough."
            c2.g.d(r3, r4)
            return r1
        L1c:
            if (r4 == 0) goto L71
            int r0 = r4.length
            r2 = 16
            if (r0 >= r2) goto L24
            goto L71
        L24:
            r0 = 32
            if (r6 >= r0) goto L30
            java.lang.String r3 = y1.c.a
            java.lang.String r4 = "cipherLen length is not enough"
            c2.g.d(r3, r4)
            return r1
        L30:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 >= r1) goto L48
            java.lang.String r0 = y1.c.a
            java.lang.String r1 = "sha 1"
            c2.g.e(r0, r1)
            char[] r3 = r3.toCharArray()
            int r6 = r6 * 8
            byte[] r3 = c(r3, r4, r5, r6)
            goto L59
        L48:
            java.lang.String r0 = y1.c.a
            java.lang.String r1 = "sha 256"
            c2.g.e(r0, r1)
            char[] r3 = r3.toCharArray()
            int r6 = r6 * 8
            byte[] r3 = j(r3, r4, r5, r6)
        L59:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r4 = c2.c.b(r4)
            r5.append(r4)
            java.lang.String r3 = c2.c.b(r3)
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            return r3
        L71:
            java.lang.String r3 = y1.c.a
            java.lang.String r4 = "salt parameter is null or length is not enough"
            c2.g.d(r3, r4)
            return r1
    }

    public static byte[] j(char[] r3, byte[] r4, int r5, int r6) {
            r0 = 0
            byte[] r0 = new byte[r0]
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 26
            if (r1 >= r2) goto L11
            java.lang.String r3 = y1.c.a
            java.lang.String r4 = "system version not high than 26"
            c2.g.d(r3, r4)
            return r0
        L11:
            r0 = 1
            byte[] r3 = b(r3, r4, r5, r6, r0)
            return r3
    }

    @java.lang.Deprecated
    public static boolean k(java.lang.String r1, java.lang.String r2) {
            r0 = 10000(0x2710, float:1.4013E-41)
            boolean r1 = l(r1, r2, r0)
            return r1
    }

    @java.lang.Deprecated
    public static boolean l(java.lang.String r3, java.lang.String r4, int r5) {
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            r1 = 0
            if (r0 != 0) goto L35
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L35
            int r0 = r4.length()
            r2 = 16
            if (r0 >= r2) goto L16
            goto L35
        L16:
            java.lang.String r0 = r4.substring(r1, r2)
            java.lang.String r4 = r4.substring(r2)
            char[] r3 = r3.toCharArray()
            byte[] r0 = c2.c.c(r0)
            r1 = 256(0x100, float:3.59E-43)
            byte[] r3 = c(r3, r0, r5, r1)
            byte[] r4 = c2.c.c(r4)
            boolean r3 = a(r3, r4)
            return r3
        L35:
            return r1
    }

    public static boolean m(java.lang.String r1, java.lang.String r2) {
            r0 = 10000(0x2710, float:1.4013E-41)
            boolean r1 = n(r1, r2, r0)
            return r1
    }

    public static boolean n(java.lang.String r4, java.lang.String r5, int r6) {
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            r1 = 0
            if (r0 != 0) goto L48
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L48
            int r0 = r5.length()
            r2 = 32
            if (r0 >= r2) goto L16
            goto L48
        L16:
            java.lang.String r0 = r5.substring(r1, r2)
            java.lang.String r5 = r5.substring(r2)
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 26
            r3 = 256(0x100, float:3.59E-43)
            if (r1 >= r2) goto L33
            char[] r4 = r4.toCharArray()
            byte[] r0 = c2.c.c(r0)
            byte[] r4 = c(r4, r0, r6, r3)
            goto L3f
        L33:
            char[] r4 = r4.toCharArray()
            byte[] r0 = c2.c.c(r0)
            byte[] r4 = j(r4, r0, r6, r3)
        L3f:
            byte[] r5 = c2.c.c(r5)
            boolean r4 = a(r4, r5)
            return r4
        L48:
            return r1
    }
}
