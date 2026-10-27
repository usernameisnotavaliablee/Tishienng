package cn.jpush.android.ad;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class l {
    public static final java.lang.String a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String f1690b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.String f1691c = null;

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.String f1692d = null;

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String f1693e = null;

    /* renamed from: f, reason: collision with root package name */
    private static final java.lang.String f1694f = null;

    /* renamed from: g, reason: collision with root package name */
    private static final java.lang.String f1695g = null;

    /* renamed from: h, reason: collision with root package name */
    private static java.util.HashMap<java.lang.String, java.security.MessageDigest> f1696h;

    static {
            r0 = 3
            byte[] r1 = new byte[r0]
            r1 = {x005e: FILL_ARRAY_DATA , data: [87, 84, 99} // fill-array
            java.lang.String r1 = cn.jpush.android.ad.d.b(r1)
            cn.jpush.android.ad.l.f1694f = r1
            r1 = 20
            byte[] r1 = new byte[r1]
            r1 = {x0064: FILL_ARRAY_DATA , data: [73, 83, 66, 31, 99, 91, 75, 57, 65, 123, 99, 74, 61, 70, 112, 84, 68, 112, 102, 113} // fill-array
            java.lang.String r1 = cn.jpush.android.ad.d.b(r1)
            cn.jpush.android.ad.l.f1695g = r1
            byte[] r0 = new byte[r0]
            r0 = {x0072: FILL_ARRAY_DATA , data: [91, 85, 5} // fill-array
            java.lang.String r0 = cn.jpush.android.ad.d.b(r0)
            cn.jpush.android.ad.l.a = r0
            r0 = 5
            byte[] r0 = new byte[r0]
            r0 = {x0078: FILL_ARRAY_DATA , data: [99, 104, 88, 37, 39} // fill-array
            java.lang.String r0 = cn.jpush.android.ad.d.b(r0)
            cn.jpush.android.ad.l.f1690b = r0
            r0 = 7
            byte[] r0 = new byte[r0]
            r0 = {x0080: FILL_ARRAY_DATA , data: [74, 64, 87, 60, 2, 21, 47} // fill-array
            java.lang.String r0 = cn.jpush.android.ad.d.b(r0)
            cn.jpush.android.ad.l.f1691c = r0
            r0 = 11
            byte[] r0 = new byte[r0]
            r0 = {x0088: FILL_ARRAY_DATA , data: [87, 69, 109, 65, 120, 98, 68, 65, 119, 107, 115} // fill-array
            java.lang.String r0 = cn.jpush.android.ad.d.b(r0)
            cn.jpush.android.ad.l.f1692d = r0
            r0 = 27
            byte[] r0 = new byte[r0]
            r0 = {x0092: FILL_ARRAY_DATA , data: [124, 112, 70, 65, 55, 123, 115, 114, 69, 82, 112, 124, 111, 63, 125, 69, 106, 123, 119, 118, 85, 100, 112, 111, 115, 98, 68} // fill-array
            java.lang.String r0 = cn.jpush.android.ad.d.b(r0)
            cn.jpush.android.ad.l.f1693e = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            cn.jpush.android.ad.l.f1696h = r0
            return
    }

    public l() {
            r1 = this;
            r1.<init>()
            return
    }

    private static <T> T a(java.lang.Class<T> r0, java.lang.Object[] r1, java.lang.Class<?>[] r2) {
            java.lang.reflect.Constructor r0 = r0.getConstructor(r2)
            java.lang.Object r0 = r0.newInstance(r1)
            return r0
    }

    public static java.lang.String a(java.lang.String r5) {
            java.lang.String r0 = cn.jpush.android.ad.l.f1691c     // Catch: java.lang.Throwable -> L45
            java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r0)     // Catch: java.lang.Throwable -> L45
            byte[] r5 = r5.getBytes()     // Catch: java.lang.Throwable -> L45
            byte[] r5 = r0.digest(r5)     // Catch: java.lang.Throwable -> L45
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L45
            r0.<init>()     // Catch: java.lang.Throwable -> L45
            r1 = 0
        L14:
            int r2 = r5.length     // Catch: java.lang.Throwable -> L45
            if (r1 >= r2) goto L40
            r2 = r5[r1]     // Catch: java.lang.Throwable -> L45
            r2 = r2 & 255(0xff, float:3.57E-43)
            java.lang.String r2 = java.lang.Integer.toHexString(r2)     // Catch: java.lang.Throwable -> L45
            java.util.Locale r3 = java.util.Locale.US     // Catch: java.lang.Throwable -> L45
            java.lang.String r2 = r2.toUpperCase(r3)     // Catch: java.lang.Throwable -> L45
            int r3 = r2.length()     // Catch: java.lang.Throwable -> L45
            r4 = 1
            if (r3 != r4) goto L31
            java.lang.String r3 = "0"
            r0.append(r3)     // Catch: java.lang.Throwable -> L45
        L31:
            r0.append(r2)     // Catch: java.lang.Throwable -> L45
            int r2 = r5.length     // Catch: java.lang.Throwable -> L45
            int r2 = r2 - r4
            if (r1 >= r2) goto L3d
            java.lang.String r2 = ":"
            r0.append(r2)     // Catch: java.lang.Throwable -> L45
        L3d:
            int r1 = r1 + 1
            goto L14
        L40:
            java.lang.String r5 = r0.toString()     // Catch: java.lang.Throwable -> L45
            return r5
        L45:
            r5 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = " fail, error is "
            r0.append(r1)
            java.lang.String r5 = r5.getMessage()
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            java.lang.String r0 = "Secure"
            cn.jpush.android.helper.Logger.w(r0, r5)
            java.lang.String r5 = ""
            return r5
    }

    public static java.lang.String a(java.lang.String r0, java.lang.String r1) {
            byte[] r0 = r0.getBytes()     // Catch: java.lang.Exception -> L9
            java.lang.String r0 = a(r0, r1, r1)     // Catch: java.lang.Exception -> L9
            return r0
        L9:
            java.lang.String r0 = "Unexpected - failed to AES encrypt."
            java.lang.String r1 = ""
            cn.jpush.android.helper.Logger.w(r1, r0)
            return r1
    }

    public static java.lang.String a(byte[] r1, java.lang.String r2, java.lang.String r3) {
            r0 = 1
            byte[] r1 = a(r1, r2, r3, r0)
            r2 = 2
            java.lang.String r1 = android.util.Base64.encodeToString(r1, r2)
            return r1
    }

    private static javax.crypto.spec.IvParameterSpec a(byte[] r4) {
            java.lang.Class<javax.crypto.spec.IvParameterSpec> r0 = javax.crypto.spec.IvParameterSpec.class
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L15
            r3 = 0
            r2[r3] = r4     // Catch: java.lang.Exception -> L15
            java.lang.Class[] r4 = new java.lang.Class[r1]     // Catch: java.lang.Exception -> L15
            java.lang.Class<byte[]> r1 = byte[].class
            r4[r3] = r1     // Catch: java.lang.Exception -> L15
            java.lang.Object r4 = a(r0, r2, r4)     // Catch: java.lang.Exception -> L15
            javax.crypto.spec.IvParameterSpec r4 = (javax.crypto.spec.IvParameterSpec) r4     // Catch: java.lang.Exception -> L15
            return r4
        L15:
            r4 = 0
            return r4
    }

    public static byte[] a(java.lang.String r1, java.lang.String r2, java.lang.String r3) {
            r0 = 2
            byte[] r1 = android.util.Base64.decode(r1, r0)
            r0 = 0
            byte[] r1 = a(r1, r2, r3, r0)
            return r1
    }

    private static synchronized byte[] a(java.lang.String r2, java.security.interfaces.RSAPublicKey r3, java.lang.String r4) {
            java.lang.Class<cn.jpush.android.ad.l> r0 = cn.jpush.android.ad.l.class
            monitor-enter(r0)
            r1 = 2
            byte[] r2 = android.util.Base64.decode(r2, r1)     // Catch: java.lang.Throwable -> L19
            javax.crypto.Cipher r4 = javax.crypto.Cipher.getInstance(r4)     // Catch: java.lang.Throwable -> L19
            r4.init(r1, r3)     // Catch: java.lang.Throwable -> L19
            byte[] r2 = r4.doFinal(r2)     // Catch: java.lang.Throwable -> L19
            byte[] r2 = android.util.Base64.decode(r2, r1)     // Catch: java.lang.Throwable -> L19
            monitor-exit(r0)
            return r2
        L19:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            throw r2
    }

    public static synchronized byte[] a(byte[] r3, java.lang.String r4, java.lang.String r5, boolean r6) {
            java.lang.Class<cn.jpush.android.ad.l> r0 = cn.jpush.android.ad.l.class
            monitor-enter(r0)
            if (r4 != 0) goto L8
            monitor-exit(r0)
            r3 = 0
            return r3
        L8:
            java.lang.String r1 = "UTF-8"
            byte[] r4 = c(r4, r1)     // Catch: java.lang.Throwable -> L33
            javax.crypto.spec.SecretKeySpec r1 = new javax.crypto.spec.SecretKeySpec     // Catch: java.lang.Throwable -> L33
            java.lang.String r2 = cn.jpush.android.ad.l.f1694f     // Catch: java.lang.Throwable -> L33
            r1.<init>(r4, r2)     // Catch: java.lang.Throwable -> L33
            java.lang.String r4 = "UTF-8"
            byte[] r4 = r5.getBytes(r4)     // Catch: java.lang.Throwable -> L33
            javax.crypto.spec.IvParameterSpec r4 = a(r4)     // Catch: java.lang.Throwable -> L33
            java.lang.String r5 = cn.jpush.android.ad.l.f1695g     // Catch: java.lang.Throwable -> L33
            javax.crypto.Cipher r5 = javax.crypto.Cipher.getInstance(r5)     // Catch: java.lang.Throwable -> L33
            if (r6 == 0) goto L29
            r6 = 1
            goto L2a
        L29:
            r6 = 2
        L2a:
            r5.init(r6, r1, r4)     // Catch: java.lang.Throwable -> L33
            byte[] r3 = r5.doFinal(r3)     // Catch: java.lang.Throwable -> L33
            monitor-exit(r0)
            return r3
        L33:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L33
            throw r3
    }

    public static java.lang.String b(java.lang.String r1, java.lang.String r2) {
            java.lang.String r0 = new java.lang.String     // Catch: java.lang.Exception -> La
            byte[] r1 = a(r1, r2, r2)     // Catch: java.lang.Exception -> La
            r0.<init>(r1)     // Catch: java.lang.Exception -> La
            return r0
        La:
            java.lang.String r1 = "Unexpected - failed to AES decrypt."
            java.lang.String r2 = ""
            cn.jpush.android.helper.Logger.w(r2, r1)
            return r2
    }

    public static java.lang.String b(java.lang.String r0, java.lang.String r1, java.lang.String r2) {
            java.security.interfaces.RSAPublicKey r1 = b(r1)
            byte[] r0 = a(r0, r1, r2)
            java.lang.String r1 = new java.lang.String
            r2 = 2
            byte[] r0 = android.util.Base64.encode(r0, r2)
            java.lang.String r2 = "UTF-8"
            r1.<init>(r0, r2)
            return r1
    }

    private static java.security.interfaces.RSAPublicKey b(java.lang.String r2) {
            r0 = 2
            byte[] r2 = android.util.Base64.decode(r2, r0)     // Catch: java.lang.Throwable -> L17
            java.lang.String r0 = "RSA"
            java.security.KeyFactory r0 = java.security.KeyFactory.getInstance(r0)     // Catch: java.lang.Throwable -> L17
            java.security.spec.X509EncodedKeySpec r1 = new java.security.spec.X509EncodedKeySpec     // Catch: java.lang.Throwable -> L17
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L17
            java.security.PublicKey r2 = r0.generatePublic(r1)     // Catch: java.lang.Throwable -> L17
            java.security.interfaces.RSAPublicKey r2 = (java.security.interfaces.RSAPublicKey) r2     // Catch: java.lang.Throwable -> L17
            return r2
        L17:
            r2 = move-exception
            r2.toString()
            r2 = 0
            return r2
    }

    private static byte[] c(java.lang.String r4, java.lang.String r5) {
            int r0 = r4.length()
            byte[] r0 = new byte[r0]
            int r1 = r4.length()
            int r1 = r1 / 2
            r2 = 0
            java.lang.String r1 = r4.substring(r2, r1)
            byte[] r1 = r1.getBytes(r5)
            int r3 = r4.length()
            int r3 = r3 / 2
            java.lang.String r4 = r4.substring(r3)
            byte[] r4 = r4.getBytes(r5)
            int r5 = r1.length
            java.lang.System.arraycopy(r1, r2, r0, r2, r5)
            int r5 = r1.length
            int r1 = r4.length
            java.lang.System.arraycopy(r4, r2, r0, r5, r1)
            return r0
    }
}
