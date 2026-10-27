package cn.jiguang.commons.z;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public abstract class g {
    public static final java.lang.String a = null;

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.String f1248c = null;

    static {
            r0 = 24
            byte[] r0 = new byte[r0]
            r0 = {x001c: FILL_ARRAY_DATA , data: [96, 89, 98, 99, 101, 89, 76, 106, 38, 96, 116, 66, 83, 112, 103, 120, 63, 67, 84, 120, 122, 98, 81, 112} // fill-array
            java.lang.String r0 = cn.jiguang.commons.L.n.c(r0)
            cn.jiguang.commons.z.g.a = r0
            r0 = 22
            byte[] r0 = new byte[r0]
            r0 = {x002c: FILL_ARRAY_DATA , data: [81, 112, 74, 108, 124, 127, 125, 67, 14, 111, 109, 100, 98, 89, 79, 119, 38, 115, 127, 84, 96, 89} // fill-array
            java.lang.String r0 = cn.jiguang.commons.L.n.c(r0)
            cn.jiguang.commons.z.g.f1248c = r0
            return
    }

    public g() {
            r1 = this;
            r1.<init>()
            return
    }

    private static int a(byte[] r1, byte[] r2) {
            r0 = 0
            int r1 = a(r1, r2, r0)
            return r1
    }

    private static int a(byte[] r4, byte[] r5, int r6) {
            r0 = -1
            if (r4 == 0) goto L2a
            if (r5 != 0) goto L6
            goto L2a
        L6:
            int r1 = r5.length     // Catch: java.lang.Throwable -> L2a
            if (r1 != 0) goto La
            return r6
        La:
            if (r6 >= 0) goto Ld
            return r0
        Ld:
            int r1 = r4.length     // Catch: java.lang.Throwable -> L2a
            int r2 = r5.length     // Catch: java.lang.Throwable -> L2a
            if (r1 >= r2) goto L12
            return r0
        L12:
            int r1 = r4.length     // Catch: java.lang.Throwable -> L2a
            int r2 = r5.length     // Catch: java.lang.Throwable -> L2a
            int r1 = r1 - r2
            if (r6 > r1) goto L2a
            r1 = 0
        L18:
            int r2 = r5.length     // Catch: java.lang.Throwable -> L2a
            if (r1 >= r2) goto L29
            int r2 = r6 + r1
            r2 = r4[r2]     // Catch: java.lang.Throwable -> L2a
            r3 = r5[r1]     // Catch: java.lang.Throwable -> L2a
            if (r2 == r3) goto L26
            int r6 = r6 + 1
            goto L12
        L26:
            int r1 = r1 + 1
            goto L18
        L29:
            return r6
        L2a:
            return r0
    }

    public static java.lang.String a(byte[] r4) {
            java.lang.String r0 = "UTF-8"
            r1 = 0
            if (r4 == 0) goto L1a
            int r2 = r4.length
            if (r2 != 0) goto L9
            goto L1a
        L9:
            java.lang.String r2 = cn.jiguang.commons.z.g.a     // Catch: java.lang.Exception -> L1a
            byte[] r2 = r2.getBytes(r0)     // Catch: java.lang.Exception -> L1a
            java.lang.String r3 = cn.jiguang.commons.z.g.f1248c     // Catch: java.lang.Exception -> L1a
            byte[] r0 = r3.getBytes(r0)     // Catch: java.lang.Exception -> L1a
            java.lang.String r4 = a(r4, r2, r0)     // Catch: java.lang.Exception -> L1a
            return r4
        L1a:
            return r1
    }

    private static java.lang.String a(byte[] r4, byte[] r5, byte[] r6) {
            r0 = 0
            int r1 = a(r4, r5)     // Catch: java.lang.Throwable -> L3c
            r2 = -1
            if (r1 != r2) goto L9
            return r0
        L9:
            int r3 = r5.length     // Catch: java.lang.Throwable -> L3c
            int r3 = r3 + r1
            int r6 = a(r4, r6, r3)     // Catch: java.lang.Throwable -> L3c
            if (r6 != r2) goto L12
            return r0
        L12:
            int r5 = r5.length     // Catch: java.lang.Throwable -> L3c
            int r1 = r1 + r5
            int r6 = r6 - r1
            if (r6 >= 0) goto L18
            return r0
        L18:
            if (r6 != 0) goto L1d
            java.lang.String r4 = ""
            return r4
        L1d:
            int r5 = r1 + r6
            int r2 = r4.length     // Catch: java.lang.Throwable -> L3c
            if (r5 <= r2) goto L23
            return r0
        L23:
            byte[] r5 = new byte[r6]     // Catch: java.lang.Throwable -> L3c
            r2 = 0
            java.lang.System.arraycopy(r4, r1, r5, r2, r6)     // Catch: java.lang.Throwable -> L3c
            java.lang.String r4 = new java.lang.String     // Catch: java.lang.Throwable -> L3c
            java.lang.String r6 = "UTF-8"
            r4.<init>(r5, r6)     // Catch: java.lang.Throwable -> L3c
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L3c
            if (r5 == 0) goto L37
            return r0
        L37:
            java.lang.String r4 = r4.trim()     // Catch: java.lang.Throwable -> L3c
            return r4
        L3c:
            return r0
    }
}
