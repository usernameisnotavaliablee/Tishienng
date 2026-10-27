package c2;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class a {
    private static final java.lang.String a = "BaseKeyUtil";
    private static final int b = 16;
    private static final int c = 16;
    private static final int d = 10000;
    private static final int e = 32;
    private static final int f = 1;

    static {
            return
    }

    public a() {
            r0 = this;
            r0.<init>()
            return
    }

    private static int a(int r0, int r1, int r2) {
            if (r1 >= r0) goto L3
            r0 = r1
        L3:
            if (r2 >= r0) goto L6
            return r2
        L6:
            return r0
    }

    private static boolean b(int r1) {
            r0 = 16
            if (r1 < r0) goto L6
            r1 = 1
            return r1
        L6:
            r1 = 0
            return r1
    }

    private static boolean c(int r0, byte[] r1) {
            boolean r0 = b(r0)
            boolean r1 = d(r1)
            r0 = r0 & r1
            return r0
    }

    private static boolean d(byte[] r1) {
            int r1 = r1.length
            r0 = 16
            if (r1 < r0) goto L7
            r1 = 1
            return r1
        L7:
            r1 = 0
            return r1
    }

    public static java.lang.String e(java.lang.String r0, java.lang.String r1, java.lang.String r2, byte[] r3, int r4, boolean r5) {
            byte[] r0 = h(r0, r1, r2, r3, r4, r5)
            java.lang.String r0 = c2.c.b(r0)
            return r0
    }

    public static byte[] f(java.lang.String r0, java.lang.String r1, java.lang.String r2, java.lang.String r3, int r4, boolean r5) {
            byte[] r3 = c2.c.c(r3)
            byte[] r0 = h(r0, r1, r2, r3, r4, r5)
            return r0
    }

    public static byte[] g(java.lang.String r5, java.lang.String r6, java.lang.String r7, byte[] r8, int r9, int r10, boolean r11) {
            byte[] r5 = c2.c.c(r5)
            byte[] r6 = c2.c.c(r6)
            byte[] r7 = c2.c.c(r7)
            int r0 = r5.length
            int r1 = r6.length
            int r2 = r7.length
            int r0 = a(r0, r1, r2)
            boolean r1 = c(r0, r8)
            if (r1 == 0) goto L4a
            char[] r1 = new char[r0]
            r2 = 0
        L1c:
            if (r2 >= r0) goto L2c
            r3 = r5[r2]
            r4 = r6[r2]
            r3 = r3 ^ r4
            r4 = r7[r2]
            r3 = r3 ^ r4
            char r3 = (char) r3
            r1[r2] = r3
            int r2 = r2 + 1
            goto L1c
        L2c:
            if (r11 != 0) goto L3c
            java.lang.String r5 = c2.a.a
            java.lang.String r6 = "exportRootKey: sha1"
            c2.g.e(r5, r6)
            int r10 = r10 * 8
            byte[] r5 = y1.c.c(r1, r8, r9, r10)
            return r5
        L3c:
            java.lang.String r5 = c2.a.a
            java.lang.String r6 = "exportRootKey: sha256"
            c2.g.e(r5, r6)
            int r10 = r10 * 8
            byte[] r5 = y1.c.j(r1, r8, r9, r10)
            return r5
        L4a:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "key length must be more than 128bit."
            r5.<init>(r6)
            throw r5
    }

    @android.annotation.SuppressLint({"NewApi"})
    public static byte[] h(java.lang.String r7, java.lang.String r8, java.lang.String r9, byte[] r10, int r11, boolean r12) {
            r4 = 10000(0x2710, float:1.4013E-41)
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r5 = r11
            r6 = r12
            byte[] r7 = g(r0, r1, r2, r3, r4, r5, r6)
            return r7
    }

    @android.annotation.SuppressLint({"NewApi"})
    public static byte[] i(java.lang.String r6, java.lang.String r7, java.lang.String r8, byte[] r9, boolean r10) {
            r4 = 16
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r5 = r10
            byte[] r6 = h(r0, r1, r2, r3, r4, r5)
            return r6
    }

    public static byte[] j(java.lang.String r6, java.lang.String r7, java.lang.String r8, byte[] r9, boolean r10) {
            r4 = 32
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r5 = r10
            byte[] r6 = h(r0, r1, r2, r3, r4, r5)
            return r6
    }

    public static byte[] k(java.lang.String r7, java.lang.String r8, java.lang.String r9, byte[] r10, boolean r11) {
            r4 = 1
            r5 = 32
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r6 = r11
            byte[] r7 = g(r0, r1, r2, r3, r4, r5, r6)
            return r7
    }

    @android.annotation.SuppressLint({"NewApi"})
    public static byte[] l(java.lang.String r7, java.lang.String r8, java.lang.String r9, byte[] r10, boolean r11) {
            r4 = 1
            r5 = 16
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r6 = r11
            byte[] r7 = g(r0, r1, r2, r3, r4, r5, r6)
            return r7
    }
}
