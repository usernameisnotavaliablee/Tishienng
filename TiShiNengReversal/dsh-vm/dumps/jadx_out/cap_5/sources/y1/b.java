package y1;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public abstract class b {
    private static final java.lang.String a = "HMACSHA256";
    private static final java.lang.String b = "HmacSHA256";
    private static final java.lang.String c = "";
    private static final int d = 32;

    static {
            return
    }

    public b() {
            r0 = this;
            r0.<init>()
            return
    }

    public static byte[] a(byte[] r3, byte[] r4) {
            r0 = 0
            if (r3 == 0) goto L4c
            if (r4 != 0) goto L6
            goto L4c
        L6:
            int r1 = r4.length
            r2 = 32
            if (r1 >= r2) goto L15
            java.lang.String r3 = y1.b.a
            java.lang.String r4 = "hmac key length is not right"
            c2.g.d(r3, r4)
            byte[] r3 = new byte[r0]
            return r3
        L15:
            javax.crypto.spec.SecretKeySpec r1 = new javax.crypto.spec.SecretKeySpec     // Catch: java.security.NoSuchAlgorithmException -> L2c java.security.InvalidKeyException -> L2e
            java.lang.String r2 = "HmacSHA256"
            r1.<init>(r4, r2)     // Catch: java.security.NoSuchAlgorithmException -> L2c java.security.InvalidKeyException -> L2e
            java.lang.String r4 = r1.getAlgorithm()     // Catch: java.security.NoSuchAlgorithmException -> L2c java.security.InvalidKeyException -> L2e
            javax.crypto.Mac r4 = javax.crypto.Mac.getInstance(r4)     // Catch: java.security.NoSuchAlgorithmException -> L2c java.security.InvalidKeyException -> L2e
            r4.init(r1)     // Catch: java.security.NoSuchAlgorithmException -> L2c java.security.InvalidKeyException -> L2e
            byte[] r3 = r4.doFinal(r3)     // Catch: java.security.NoSuchAlgorithmException -> L2c java.security.InvalidKeyException -> L2e
            return r3
        L2c:
            r3 = move-exception
            goto L2f
        L2e:
            r3 = move-exception
        L2f:
            java.lang.String r4 = y1.b.a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "hmacsha256 encrypt exception"
            r1.append(r2)
            java.lang.String r3 = r3.getMessage()
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            c2.g.d(r4, r3)
            byte[] r3 = new byte[r0]
            return r3
        L4c:
            java.lang.String r3 = y1.b.a
            java.lang.String r4 = "content or key is null."
            c2.g.d(r3, r4)
            byte[] r3 = new byte[r0]
            return r3
    }

    public static java.lang.String b(java.lang.String r1, java.lang.String r2) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L16
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto Ld
            goto L16
        Ld:
            byte[] r2 = c2.c.c(r2)
            java.lang.String r1 = c(r1, r2)
            return r1
        L16:
            java.lang.String r1 = ""
            return r1
    }

    public static java.lang.String c(java.lang.String r4, byte[] r5) {
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            java.lang.String r1 = ""
            if (r0 != 0) goto L47
            if (r5 != 0) goto Lb
            goto L47
        Lb:
            int r0 = r5.length
            r2 = 32
            if (r0 >= r2) goto L18
            java.lang.String r4 = y1.b.a
            java.lang.String r5 = "hmac key length is not right"
            c2.g.d(r4, r5)
            return r1
        L18:
            java.lang.String r0 = "UTF-8"
            byte[] r4 = r4.getBytes(r0)     // Catch: java.io.UnsupportedEncodingException -> L1f
            goto L3e
        L1f:
            r4 = move-exception
            r0 = 0
            byte[] r0 = new byte[r0]
            java.lang.String r1 = y1.b.a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "hmacsha256 encrypt exception"
            r2.append(r3)
            java.lang.String r4 = r4.getMessage()
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            c2.g.d(r1, r4)
            r4 = r0
        L3e:
            byte[] r4 = a(r4, r5)
            java.lang.String r4 = c2.c.b(r4)
            return r4
        L47:
            return r1
    }
}
