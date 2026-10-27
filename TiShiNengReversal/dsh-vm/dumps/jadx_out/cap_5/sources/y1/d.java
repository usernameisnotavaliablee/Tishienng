package y1;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class d {
    private static final java.lang.String a = "SHA";
    private static final java.lang.String b = "SHA-256";
    private static final java.lang.String c = "";
    private static final java.lang.String[] d = null;

    static {
            java.lang.String r0 = "SHA-384"
            java.lang.String r1 = "SHA-512"
            java.lang.String r2 = "SHA-256"
            java.lang.String[] r0 = new java.lang.String[]{r2, r0, r1}
            y1.d.d = r0
            return
    }

    private d() {
            r0 = this;
            r0.<init>()
            return
    }

    private static boolean a(java.lang.String r5) {
            java.lang.String[] r0 = y1.d.d
            int r1 = r0.length
            r2 = 0
            r3 = 0
        L5:
            if (r3 >= r1) goto L14
            r4 = r0[r3]
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L11
            r5 = 1
            return r5
        L11:
            int r3 = r3 + 1
            goto L5
        L14:
            return r2
    }

    public static java.lang.String b(java.lang.String r1) {
            java.lang.String r0 = "SHA-256"
            java.lang.String r1 = c(r1, r0)
            return r1
    }

    public static java.lang.String c(java.lang.String r2, java.lang.String r3) {
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            java.lang.String r1 = ""
            if (r0 != 0) goto L37
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto Lf
            goto L37
        Lf:
            boolean r0 = a(r3)
            if (r0 != 0) goto L1d
            java.lang.String r2 = y1.d.a
            java.lang.String r3 = "algorithm is not safe or legal"
            c2.g.d(r2, r3)
            return r1
        L1d:
            java.lang.String r0 = "UTF-8"
            byte[] r2 = r2.getBytes(r0)     // Catch: java.io.UnsupportedEncodingException -> L24
            goto L2e
        L24:
            r2 = 0
            byte[] r2 = new byte[r2]
            java.lang.String r0 = y1.d.a
            java.lang.String r1 = "Error in generate SHA UnsupportedEncodingException"
            c2.g.d(r0, r1)
        L2e:
            byte[] r2 = d(r2, r3)
            java.lang.String r2 = c2.c.b(r2)
            return r2
        L37:
            java.lang.String r2 = y1.d.a
            java.lang.String r3 = "content or algorithm is null."
            c2.g.d(r2, r3)
            return r1
    }

    public static byte[] d(byte[] r2, java.lang.String r3) {
            r0 = 0
            if (r2 == 0) goto L30
            boolean r1 = android.text.TextUtils.isEmpty(r3)
            if (r1 == 0) goto La
            goto L30
        La:
            boolean r1 = a(r3)
            if (r1 != 0) goto L1a
            java.lang.String r2 = y1.d.a
            java.lang.String r3 = "algorithm is not safe or legal"
            c2.g.d(r2, r3)
            byte[] r2 = new byte[r0]
            return r2
        L1a:
            java.security.MessageDigest r3 = java.security.MessageDigest.getInstance(r3)     // Catch: java.security.NoSuchAlgorithmException -> L26
            r3.update(r2)     // Catch: java.security.NoSuchAlgorithmException -> L26
            byte[] r2 = r3.digest()     // Catch: java.security.NoSuchAlgorithmException -> L26
            return r2
        L26:
            java.lang.String r2 = y1.d.a
            java.lang.String r3 = "Error in generate SHA NoSuchAlgorithmException"
            c2.g.d(r2, r3)
            byte[] r2 = new byte[r0]
            return r2
        L30:
            java.lang.String r2 = y1.d.a
            java.lang.String r3 = "content or algorithm is null."
            c2.g.d(r2, r3)
            byte[] r2 = new byte[r0]
            return r2
    }

    public static boolean e(java.lang.String r1, java.lang.String r2, java.lang.String r3) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L1c
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L1c
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L13
            goto L1c
        L13:
            java.lang.String r1 = c(r1, r3)
            boolean r1 = r2.equals(r1)
            return r1
        L1c:
            r1 = 0
            return r1
    }

    public static boolean f(java.lang.String r1, java.lang.String r2) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L16
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto Ld
            goto L16
        Ld:
            java.lang.String r1 = b(r1)
            boolean r1 = r2.equals(r1)
            return r1
        L16:
            r1 = 0
            return r1
    }
}
