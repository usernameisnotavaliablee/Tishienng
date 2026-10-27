package com.ss.android.cw;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class a {
    private static final char[] a = null;

    /* renamed from: com.ss.android.cw.a$a, reason: collision with other inner class name */
    static /* synthetic */ class C0187a {
        public C0187a() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    private static class b {
        private int a;
        private int b;
        private int c;
        private long d;
        private java.lang.String e;

        private b() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ b(com.ss.android.cw.a.C0187a r1) {
                r0 = this;
                r0.<init>()
                return
        }

        static /* synthetic */ int a(com.ss.android.cw.a.b r0, int r1) {
                r0.c = r1
                return r1
        }

        static /* synthetic */ long b(com.ss.android.cw.a.b r2) {
                long r0 = r2.d
                return r0
        }

        static /* synthetic */ int c(com.ss.android.cw.a.b r0) {
                int r0 = r0.a
                return r0
        }

        static /* synthetic */ int d(com.ss.android.cw.a.b r0, int r1) {
                r0.a = r1
                return r1
        }

        static /* synthetic */ long e(com.ss.android.cw.a.b r0, long r1) {
                r0.d = r1
                return r1
        }

        static /* synthetic */ java.lang.String f(com.ss.android.cw.a.b r0, java.lang.String r1) {
                r0.e = r1
                return r1
        }

        static /* synthetic */ int g(com.ss.android.cw.a.b r0) {
                int r0 = r0.b
                return r0
        }

        static /* synthetic */ java.lang.String h(com.ss.android.cw.a.b r0) {
                java.lang.String r0 = r0.e
                return r0
        }

        static /* synthetic */ int i(com.ss.android.cw.a.b r0) {
                int r0 = r0.c
                return r0
        }

        static /* synthetic */ int j(com.ss.android.cw.a.b r0, int r1) {
                r0.b = r1
                return r1
        }
    }

    static {
            r0 = 16
            char[] r0 = new char[r0]
            r0 = {x000a: FILL_ARRAY_DATA , data: [48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102} // fill-array
            com.ss.android.cw.a.a = r0
            return
    }

    public a() {
            r1 = this;
            r1.<init>()
            return
    }

    public static int a(java.lang.String r1, java.io.File r2) {
            r0 = 0
            int r1 = b(r1, r2, r0)
            return r1
    }

    public static int b(java.lang.String r6, java.io.File r7, com.ss.android.cw.c r8) {
            if (r6 == 0) goto Laf
            int r0 = r6.length()
            if (r0 != 0) goto La
            goto Laf
        La:
            r0 = 5
            if (r8 == 0) goto L1b
            long r1 = r8.j()     // Catch: java.lang.Throwable -> Lab
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 > 0) goto L25
            r8.xt()     // Catch: java.lang.Throwable -> L1a
        L1a:
            return r0
        L1b:
            if (r7 == 0) goto Lae
            boolean r1 = r7.exists()     // Catch: java.lang.Throwable -> Lab
            if (r1 != 0) goto L25
            goto Lae
        L25:
            com.ss.android.cw.a$b r0 = c(r6)     // Catch: java.lang.Throwable -> La9
            r1 = 1
            if (r0 == 0) goto L3d
            int r2 = com.ss.android.cw.a.b.c(r0)     // Catch: java.lang.Throwable -> Lab
            if (r2 <= r1) goto L34
            r6 = 3
            return r6
        L34:
            int r2 = com.ss.android.cw.a.b.i(r0)     // Catch: java.lang.Throwable -> Lab
            long r3 = com.ss.android.cw.a.b.b(r0)     // Catch: java.lang.Throwable -> Lab
            goto L40
        L3d:
            r2 = -1
            r3 = -1
        L40:
            r5 = 0
            if (r8 == 0) goto L4a
            java.lang.String r7 = f(r8, r2, r3)     // Catch: java.lang.Throwable -> L48
            goto L53
        L48:
            r7 = move-exception
            goto L4f
        L4a:
            java.lang.String r7 = l(r7, r2, r3)     // Catch: java.lang.Throwable -> L48
            goto L53
        L4f:
            com.bytedance.sdk.component.utils.vl.j(r7)     // Catch: java.lang.Throwable -> Lab
            r7 = r5
        L53:
            if (r7 == 0) goto La7
            int r8 = r7.length()     // Catch: java.lang.Throwable -> Lab
            if (r8 != 0) goto L5c
            goto La7
        L5c:
            r8 = 0
            if (r0 == 0) goto L9f
            int r2 = com.ss.android.cw.a.b.c(r0)     // Catch: java.lang.Throwable -> Lab
            if (r2 != r1) goto L6c
            int r2 = com.ss.android.cw.a.b.g(r0)     // Catch: java.lang.Throwable -> Lab
            if (r2 != r1) goto L6c
            goto L9f
        L6c:
            java.lang.String r6 = com.ss.android.cw.a.b.h(r0)     // Catch: java.lang.Throwable -> Lab
            if (r6 == 0) goto La6
            com.ss.android.cw.a$b r5 = c(r7)     // Catch: java.lang.Throwable -> L77
            goto L78
        L77:
        L78:
            if (r5 == 0) goto La6
            int r6 = com.ss.android.cw.a.b.i(r0)     // Catch: java.lang.Throwable -> Lab
            int r7 = com.ss.android.cw.a.b.i(r5)     // Catch: java.lang.Throwable -> Lab
            if (r6 != r7) goto La6
            long r6 = com.ss.android.cw.a.b.b(r0)     // Catch: java.lang.Throwable -> Lab
            long r2 = com.ss.android.cw.a.b.b(r5)     // Catch: java.lang.Throwable -> Lab
            int r4 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r4 != 0) goto La6
            java.lang.String r6 = com.ss.android.cw.a.b.h(r0)     // Catch: java.lang.Throwable -> Lab
            java.lang.String r7 = com.ss.android.cw.a.b.h(r5)     // Catch: java.lang.Throwable -> Lab
            boolean r6 = r6.equals(r7)     // Catch: java.lang.Throwable -> Lab
            if (r6 == 0) goto La6
            return r8
        L9f:
            boolean r6 = r7.equals(r6)     // Catch: java.lang.Throwable -> Lab
            if (r6 == 0) goto La6
            return r8
        La6:
            return r1
        La7:
            r6 = 6
            return r6
        La9:
            r6 = 4
            return r6
        Lab:
            r6 = 99
            return r6
        Lae:
            return r0
        Laf:
            r6 = 2
            return r6
    }

    private static com.ss.android.cw.a.b c(java.lang.String r6) throws java.lang.Exception {
            java.lang.String r0 = "ttmd5:"
            boolean r0 = r6.startsWith(r0)
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            java.lang.String r0 = ";"
            java.lang.String[] r6 = r6.split(r0)
            r0 = 0
            r2 = r6[r0]
            java.lang.String r3 = ":"
            java.lang.String[] r2 = r2.split(r3)
            com.ss.android.cw.a$b r3 = new com.ss.android.cw.a$b
            r3.<init>(r1)
            r1 = 1
            r4 = r2[r1]
            int r4 = java.lang.Integer.parseInt(r4)
            com.ss.android.cw.a.b.d(r3, r4)
            int r4 = com.ss.android.cw.a.b.c(r3)
            if (r4 <= r1) goto L2f
            return r3
        L2f:
            r4 = 2
            r4 = r2[r4]
            int r4 = java.lang.Integer.parseInt(r4)
            com.ss.android.cw.a.b.j(r3, r4)
            r4 = 3
            r2 = r2[r4]
            java.lang.String r4 = "g"
            java.lang.String[] r2 = r2.split(r4)
            r0 = r2[r0]
            long r4 = k(r0)
            int r0 = (int) r4
            com.ss.android.cw.a.b.a(r3, r0)
            r0 = r2[r1]
            long r4 = k(r0)
            com.ss.android.cw.a.b.e(r3, r4)
            r6 = r6[r1]
            com.ss.android.cw.a.b.f(r3, r6)
            return r3
    }

    private static java.lang.String d(int r3, long r4) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ttmd5:1:1:"
            r0.<init>(r1)
            long r1 = (long) r3
            java.lang.String r3 = e(r1)
            r0.append(r3)
            java.lang.String r3 = "g"
            r0.append(r3)
            java.lang.String r3 = e(r4)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }

    private static java.lang.String e(long r2) {
            r0 = 4
            long r2 = r2 << r0
            r0 = 31
            long r2 = r2 + r0
            java.lang.String r2 = java.lang.Long.toHexString(r2)
            return r2
    }

    private static java.lang.String f(com.ss.android.cw.c r16, int r17, long r18) throws java.lang.Exception {
            r0 = r17
            java.lang.String r1 = "MD5"
            java.security.MessageDigest r3 = java.security.MessageDigest.getInstance(r1)
            if (r3 != 0) goto Ld
            java.lang.String r0 = ""
            return r0
        Ld:
            long r9 = r16.j()     // Catch: java.lang.Throwable -> L2c
            r11 = 0
            r1 = 1
            if (r0 <= 0) goto L2e
            int r2 = (r18 > r11 ? 1 : (r18 == r11 ? 0 : -1))
            if (r2 <= 0) goto L2e
            long r4 = (long) r0     // Catch: java.lang.Throwable -> L2c
            long r4 = r4 * r18
            r6 = 8
            long r6 = r6 * r9
            r13 = 10
            long r6 = r6 / r13
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 <= 0) goto L29
            goto L2e
        L29:
            r7 = r18
            goto L30
        L2c:
            r0 = move-exception
            goto L8f
        L2e:
            r7 = r9
            r0 = 1
        L30:
            r2 = 8192(0x2000, float:1.148E-41)
            byte[] r4 = new byte[r2]     // Catch: java.lang.Throwable -> L2c
            r5 = 0
            r2 = r16
            j(r2, r3, r4, r5, r7)     // Catch: java.lang.Throwable -> L2c
            r2 = 2
            if (r0 <= r2) goto L58
            long r5 = (long) r0     // Catch: java.lang.Throwable -> L2c
            long r5 = r5 * r7
            long r5 = r9 - r5
            int r13 = r0 + (-1)
            long r14 = (long) r13     // Catch: java.lang.Throwable -> L2c
            long r14 = r5 / r14
            r2 = 1
        L49:
            if (r2 >= r13) goto L58
            long r5 = r7 + r14
            long r5 = r5 + r11
            r11 = r2
            r2 = r16
            j(r2, r3, r4, r5, r7)     // Catch: java.lang.Throwable -> L2c
            int r2 = r11 + 1
            r11 = r5
            goto L49
        L58:
            if (r0 <= r1) goto L61
            long r5 = r9 - r7
            r2 = r16
            j(r2, r3, r4, r5, r7)     // Catch: java.lang.Throwable -> L2c
        L61:
            byte[] r2 = r3.digest()     // Catch: java.lang.Throwable -> L2c
            java.lang.String r2 = i(r2)     // Catch: java.lang.Throwable -> L2c
            if (r0 != r1) goto L73
            int r1 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r1 != 0) goto L73
            r16.xt()     // Catch: java.lang.Throwable -> L72
        L72:
            return r2
        L73:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2c
            r1.<init>()     // Catch: java.lang.Throwable -> L2c
            java.lang.String r0 = d(r0, r7)     // Catch: java.lang.Throwable -> L2c
            r1.append(r0)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r0 = ";"
            r1.append(r0)     // Catch: java.lang.Throwable -> L2c
            r1.append(r2)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L2c
            r16.xt()     // Catch: java.lang.Throwable -> L8e
        L8e:
            return r0
        L8f:
            r16.xt()     // Catch: java.lang.Throwable -> L92
        L92:
            throw r0
    }

    public static java.lang.String g(java.io.File r3) {
            r0 = 9
            r1 = 8192(0x2000, double:4.0474E-320)
            java.lang.String r3 = h(r3, r0, r1)
            return r3
    }

    public static java.lang.String h(java.io.File r2, int r3, long r4) {
            java.lang.String r0 = ""
            if (r2 == 0) goto L14
            boolean r1 = r2.exists()     // Catch: java.lang.Throwable -> L10
            if (r1 != 0) goto Lb
            goto L14
        Lb:
            java.lang.String r2 = l(r2, r3, r4)     // Catch: java.lang.Throwable -> L10
            return r2
        L10:
            r2 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r2)
        L14:
            return r0
    }

    private static java.lang.String i(byte[] r10) {
            if (r10 == 0) goto L2b
            int r0 = r10.length
            int r1 = r0 * 2
            char[] r2 = new char[r1]
            r3 = 0
            r4 = 0
            r5 = 0
        La:
            if (r4 >= r0) goto L25
            r6 = r10[r4]
            r7 = r6 & 255(0xff, float:3.57E-43)
            int r8 = r5 + 1
            char[] r9 = com.ss.android.cw.a.a
            int r7 = r7 >> 4
            char r7 = r9[r7]
            r2[r5] = r7
            int r5 = r5 + 2
            r6 = r6 & 15
            char r6 = r9[r6]
            r2[r8] = r6
            int r4 = r4 + 1
            goto La
        L25:
            java.lang.String r10 = new java.lang.String
            r10.<init>(r2, r3, r1)
            return r10
        L2b:
            java.lang.NullPointerException r10 = new java.lang.NullPointerException
            java.lang.String r0 = "bytes is null"
            r10.<init>(r0)
            throw r10
    }

    private static void j(com.ss.android.cw.c r4, java.security.MessageDigest r5, byte[] r6, long r7, long r9) throws java.io.IOException {
            r4.j(r7, r9)
            r7 = 0
        L5:
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 >= 0) goto L43
            long r0 = r9 - r7
            int r2 = r6.length
            long r2 = (long) r2
            long r0 = java.lang.Math.min(r0, r2)
            int r1 = (int) r0
            r0 = 0
            int r1 = r4.j(r6, r0, r1)
            if (r1 <= 0) goto L1f
            r5.update(r6, r0, r1)
            long r0 = (long) r1
            long r7 = r7 + r0
            goto L5
        L1f:
            java.io.IOException r4 = new java.io.IOException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "updateSample unexpected readCount <= 0, readCount = "
            r5.<init>(r6)
            r5.append(r1)
            java.lang.String r6 = ", readTotalCount = "
            r5.append(r6)
            r5.append(r7)
            java.lang.String r6 = ", sampleSize = "
            r5.append(r6)
            r5.append(r9)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L43:
            return
    }

    private static long k(java.lang.String r4) throws java.lang.RuntimeException {
            r0 = 16
            long r0 = java.lang.Long.parseLong(r4, r0)     // Catch: java.lang.Throwable -> Lc
            r2 = 31
            long r0 = r0 - r2
            r4 = 4
            long r0 = r0 >> r4
            return r0
        Lc:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "ttmd5 decryptNum error, num = "
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r4 = r1.concat(r4)
            r0.<init>(r4)
            throw r0
    }

    private static java.lang.String l(java.io.File r1, int r2, long r3) throws java.lang.Exception {
            com.ss.android.cw.b r0 = new com.ss.android.cw.b
            r0.<init>(r1)
            java.lang.String r1 = f(r0, r2, r3)
            return r1
    }
}
