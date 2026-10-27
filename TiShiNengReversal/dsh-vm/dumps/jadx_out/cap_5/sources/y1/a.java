package y1;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public abstract class a {
    private static final int a = 8192;
    private static final java.lang.String b = "SHA-256";
    private static final java.lang.String c = "FileSHA256";
    private static final java.lang.String d = "";
    private static final java.lang.String[] e = null;

    static {
            java.lang.String r0 = "SHA-384"
            java.lang.String r1 = "SHA-512"
            java.lang.String r2 = "SHA-256"
            java.lang.String[] r0 = new java.lang.String[]{r2, r0, r1}
            y1.a.e = r0
            return
    }

    public a() {
            r0 = this;
            r0.<init>()
            return
    }

    private static boolean a(java.io.File r4) {
            if (r4 == 0) goto L14
            boolean r0 = r4.exists()
            if (r0 == 0) goto L14
            long r0 = r4.length()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L14
            r4 = 1
            return r4
        L14:
            r4 = 0
            return r4
    }

    private static boolean b(java.lang.String r5) {
            java.lang.String[] r0 = y1.a.e
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

    public static java.lang.String c(java.io.File r1) {
            java.lang.String r0 = "SHA-256"
            java.lang.String r1 = d(r1, r0)
            return r1
    }

    public static java.lang.String d(java.io.File r5, java.lang.String r6) {
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            java.lang.String r1 = ""
            if (r0 != 0) goto L93
            boolean r0 = b(r6)
            if (r0 != 0) goto L10
            goto L93
        L10:
            boolean r0 = a(r5)
            if (r0 != 0) goto L1e
            java.lang.String r5 = y1.a.c
            java.lang.String r6 = "file is not valid"
            c2.g.d(r5, r6)
            return r1
        L1e:
            r0 = 0
            java.security.MessageDigest r6 = java.security.MessageDigest.getInstance(r6)     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L50 java.security.NoSuchAlgorithmException -> L52
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L50 java.security.NoSuchAlgorithmException -> L52
            r1.<init>(r5)     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L50 java.security.NoSuchAlgorithmException -> L52
            r5 = 8192(0x2000, float:1.148E-41)
            byte[] r5 = new byte[r5]     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3c java.security.NoSuchAlgorithmException -> L3e
            r2 = 0
            r3 = 0
        L2e:
            int r4 = r1.read(r5)     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3c java.security.NoSuchAlgorithmException -> L3e
            if (r4 <= 0) goto L40
            r6.update(r5, r2, r4)     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3c java.security.NoSuchAlgorithmException -> L3e
            r3 = 1
            goto L2e
        L39:
            r5 = move-exception
            r0 = r1
            goto L8f
        L3c:
            r5 = move-exception
            goto L55
        L3e:
            r5 = move-exception
            goto L71
        L40:
            if (r3 == 0) goto L4a
            byte[] r5 = r6.digest()     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3c java.security.NoSuchAlgorithmException -> L3e
            java.lang.String r0 = c2.c.b(r5)     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3c java.security.NoSuchAlgorithmException -> L3e
        L4a:
            c2.f.g(r1)
            return r0
        L4e:
            r5 = move-exception
            goto L8f
        L50:
            r5 = move-exception
            goto L54
        L52:
            r5 = move-exception
            goto L70
        L54:
            r1 = r0
        L55:
            java.lang.String r6 = y1.a.c     // Catch: java.lang.Throwable -> L39
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L39
            r2.<init>()     // Catch: java.lang.Throwable -> L39
            java.lang.String r3 = "IOException"
            r2.append(r3)     // Catch: java.lang.Throwable -> L39
            java.lang.String r5 = r5.getMessage()     // Catch: java.lang.Throwable -> L39
            r2.append(r5)     // Catch: java.lang.Throwable -> L39
            java.lang.String r5 = r2.toString()     // Catch: java.lang.Throwable -> L39
            c2.g.d(r6, r5)     // Catch: java.lang.Throwable -> L39
            goto L8b
        L70:
            r1 = r0
        L71:
            java.lang.String r6 = y1.a.c     // Catch: java.lang.Throwable -> L39
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L39
            r2.<init>()     // Catch: java.lang.Throwable -> L39
            java.lang.String r3 = "NoSuchAlgorithmException"
            r2.append(r3)     // Catch: java.lang.Throwable -> L39
            java.lang.String r5 = r5.getMessage()     // Catch: java.lang.Throwable -> L39
            r2.append(r5)     // Catch: java.lang.Throwable -> L39
            java.lang.String r5 = r2.toString()     // Catch: java.lang.Throwable -> L39
            c2.g.d(r6, r5)     // Catch: java.lang.Throwable -> L39
        L8b:
            c2.f.g(r1)
            return r0
        L8f:
            c2.f.g(r0)
            throw r5
        L93:
            java.lang.String r5 = y1.a.c
            java.lang.String r6 = "algorithm is empty or not safe"
            c2.g.d(r5, r6)
            return r1
    }

    public static java.lang.String e(java.io.InputStream r1) {
            if (r1 != 0) goto L5
            java.lang.String r1 = ""
            return r1
        L5:
            java.lang.String r0 = "SHA-256"
            java.lang.String r1 = f(r1, r0)
            return r1
    }

    public static java.lang.String f(java.io.InputStream r4, java.lang.String r5) {
            java.lang.String r0 = ""
            if (r4 != 0) goto L5
            return r0
        L5:
            r1 = 8192(0x2000, float:1.148E-41)
            byte[] r1 = new byte[r1]
            java.security.MessageDigest r5 = java.security.MessageDigest.getInstance(r5)     // Catch: java.lang.Throwable -> L1a java.lang.Throwable -> L28
        Ld:
            int r2 = r4.read(r1)     // Catch: java.lang.Throwable -> L1a java.lang.Throwable -> L28
            if (r2 < 0) goto L1c
            if (r2 <= 0) goto Ld
            r3 = 0
            r5.update(r1, r3, r2)     // Catch: java.lang.Throwable -> L1a java.lang.Throwable -> L28
            goto Ld
        L1a:
            r5 = move-exception
            goto L33
        L1c:
            byte[] r5 = r5.digest()     // Catch: java.lang.Throwable -> L1a java.lang.Throwable -> L28
            java.lang.String r5 = c2.c.b(r5)     // Catch: java.lang.Throwable -> L1a java.lang.Throwable -> L28
            c2.f.g(r4)
            return r5
        L28:
            java.lang.String r5 = y1.a.c     // Catch: java.lang.Throwable -> L1a
            java.lang.String r1 = "inputstraem exception"
            c2.g.d(r5, r1)     // Catch: java.lang.Throwable -> L1a
            c2.f.g(r4)
            return r0
        L33:
            c2.f.g(r4)
            throw r5
    }

    public static boolean g(java.io.File r1, java.lang.String r2, java.lang.String r3) {
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L16
            boolean r0 = b(r3)
            if (r0 != 0) goto Ld
            goto L16
        Ld:
            java.lang.String r1 = d(r1, r3)
            boolean r1 = r2.equals(r1)
            return r1
        L16:
            java.lang.String r1 = y1.a.c
            java.lang.String r2 = "hash value is null || algorithm is illegal"
            c2.g.d(r1, r2)
            r1 = 0
            return r1
    }

    public static boolean h(java.io.File r1, java.lang.String r2) {
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L8
            r1 = 0
            return r1
        L8:
            java.lang.String r1 = c(r1)
            boolean r1 = r2.equalsIgnoreCase(r1)
            return r1
    }

    public static boolean i(java.io.InputStream r1, java.lang.String r2, java.lang.String r3) {
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L16
            boolean r0 = b(r3)
            if (r0 != 0) goto Ld
            goto L16
        Ld:
            java.lang.String r1 = f(r1, r3)
            boolean r1 = r2.equals(r1)
            return r1
        L16:
            java.lang.String r1 = y1.a.c
            java.lang.String r2 = "hash value is null || algorithm is illegal"
            c2.g.d(r1, r2)
            r1 = 0
            return r1
    }

    public static boolean j(java.io.InputStream r1, java.lang.String r2) {
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L8
            r1 = 0
            return r1
        L8:
            java.lang.String r1 = e(r1)
            boolean r1 = r2.equals(r1)
            return r1
    }
}
