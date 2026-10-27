package cn.jiguang.af;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class b {
    private static java.lang.Integer a;

    /* renamed from: b, reason: collision with root package name */
    private static java.lang.String f427b;

    /* renamed from: c, reason: collision with root package name */
    private static byte[] f428c;

    /* renamed from: d, reason: collision with root package name */
    private static final java.lang.String f429d = null;

    /* renamed from: e, reason: collision with root package name */
    private static final java.lang.String f430e = null;

    static {
            r0 = 124(0x7c, float:1.74E-43)
            byte[] r0 = new byte[r0]
            r0 = {x001c: FILL_ARRAY_DATA , data: [92, 118, 75, 110, 77, 97, 72, 120, 107, 118, 82, 95, 107, 90, 16, 90, 73, 71, 72, 121, 107, 118, 82, 95, 107, 90, 16, 93, 73, 71, 114, 116, 113, 126, 73, 83, 40, 88, 83, 45, 125, 127, 75, 93, 11, 42, 57, 83, 122, 121, 114, 65, 121, 110, 66, 68, 103, 117, 66, 33, 98, 64, 102, 107, 94, 82, 72, 7, 110, 99, 71, 98, 120, 123, 118, 47, 57, 95, 35, 68, 75, 123, 106, 81, 90, 4, 83, 125, 106, 97, 90, 5, 23, 122, 92, 114, 125, 122, 111, 109, 66, 96, 93, 101, 118, 111, 99, 71, 103, 120, 87, 122, 114, 98, 92, 92, 65, 32, 109, 97, 40, 87, 29, 36} // fill-array
            java.lang.String r0 = cn.jiguang.av.k.b(r0)
            cn.jiguang.af.b.f429d = r0
            r0 = 216(0xd8, float:3.03E-43)
            byte[] r0 = new byte[r0]
            r0 = {x005e: FILL_ARRAY_DATA , data: [109, 80, 79, 112, 92, 113, 16, 94, 75, 69, 96, 119, 115, 80, 106, 37, 85, 97, 101, 91, 73, 71, 68, 113, 97, 45, 79, 88, 80, 116, 99, 91, 97, 71, 90, 114, 71, 72, 75, 61, 102, 9, 110, 96, 82, 38, 85, 90, 85, 75, 110, 87, 89, 120, 71, 99, 67, 66, 90, 8, 76, 91, 123, 94, 40, 92, 69, 86, 74, 103, 40, 87, 106, 86, 48, 64, 114, 70, 117, 97, 120, 85, 125, 3, 18, 64, 113, 90, 101, 5, 70, 118, 78, 76, 82, 113, 98, 85, 76, 92, 97, 104, 110, 78, 49, 89, 96, 116, 65, 83, 99, 36, 64, 31, 108, 94, 49, 93, 37, 73, 16, 76, 74, 99, 121, 122, 86, 97, 121, 89, 86, 82, 22, 67, 56, 119, 105, 99, 105, 106, 110, 101, 72, 1, 23, 73, 68, 84, 101, 2, 76, 78, 35, 83, 105, 74, 102, 92, 113, 68, 124, 65, 65, 76, 94, 125, 33, 66, 79, 73, 62, 35, 120, 31, 17, 119, 109, 82, 71, 69, 66, 80, 106, 46, 95, 99, 117, 96, 93, 69, 107, 73, 103, 124, 106, 83, 84, 127, 106, 93, 64, 47, 62, 113, 107, 122, 122, 82, 38, 97, 105, 93, 73, 71, 80, 114} // fill-array
            java.lang.String r0 = cn.jiguang.av.k.b(r0)
            cn.jiguang.af.b.f430e = r0
            return
    }

    public b() {
            r1 = this;
            r1.<init>()
            return
    }

    public static int a() {
            java.lang.Integer r0 = cn.jiguang.af.b.a
            if (r0 == 0) goto L9
            int r0 = r0.intValue()
            return r0
        L9:
            java.security.SecureRandom r0 = new java.security.SecureRandom
            r0.<init>()
            int r0 = r0.nextInt()
            int r0 = java.lang.Math.abs(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            cn.jiguang.af.b.a = r0
            int r0 = r0.intValue()
            return r0
    }

    public static java.lang.String a(android.content.Context r0) {
            java.lang.String r0 = cn.jiguang.af.b.f427b
            return r0
    }

    public static java.lang.String a(java.nio.ByteBuffer r2) {
            short r0 = r2.getShort()
            byte[] r0 = new byte[r0]
            r2.get(r0)
            java.lang.String r2 = new java.lang.String     // Catch: java.lang.Throwable -> L11
            java.lang.String r1 = "UTF-8"
            r2.<init>(r0, r1)     // Catch: java.lang.Throwable -> L11
            return r2
        L11:
            r2 = 0
            return r2
    }

    public static byte[] a(long r3, int r5, long r6, short r8, int r9, int r10, int r11) {
            cn.jiguang.ai.b r0 = new cn.jiguang.ai.b
            r1 = 20480(0x5000, float:2.8699E-41)
            r0.<init>(r1)
            r1 = 0
            r0.b(r1)
            r2 = 8
            r0.a(r2)
            r2 = 2
            r0.a(r2)
            r0.b(r3)
            long r3 = (long) r5
            r0.a(r3)
            r0.b(r6)
            long r3 = (long) r8
            r0.a(r3)
            r0.a(r9)
            r0.b(r10)
            r0.a(r11)
            int r3 = r0.a()
            r0.b(r3, r1)
            byte[] r3 = r0.b()
            return r3
    }

    public static byte[] a(long r3, long r5, java.lang.String r7, java.lang.String r8, java.lang.String r9, long r10, byte r12, int r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, int r18, int r19, java.lang.String r20) {
            cn.jiguang.ai.b r0 = new cn.jiguang.ai.b
            r1 = 20480(0x5000, float:2.8699E-41)
            r0.<init>(r1)
            r1 = 0
            r0.b(r1)
            r2 = 28
            r0.a(r2)
            r2 = 1
            r0.a(r2)
            r0.b(r3)
            r3 = 0
            r0.a(r3)
            r0.b(r5)
            r3 = 97
            r0.a(r3)
            r0.a(r1)
            r0.b(r1)
            r0.a(r7)
            r0.a(r9)
            r0.a(r8)
            r0.a(r1)
            r0.a(r10)
            r0.a(r12)
            r0.a(r13)
            r0.a(r14)
            r0.a(r15)
            r3 = r16
            r0.a(r3)
            r3 = r17
            r0.a(r3)
            r3 = r18
            r0.a(r3)
            r3 = r19
            r0.a(r3)
            r3 = r20
            r0.a(r3)
            int r3 = r0.a()
            r0.b(r3, r1)
            byte[] r3 = r0.b()
            return r3
    }

    public static byte[] a(long r4, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, long r10, java.lang.String r12) {
            int r0 = a()
            cn.jiguang.ai.b r1 = new cn.jiguang.ai.b
            r2 = 20480(0x5000, float:2.8699E-41)
            r1.<init>(r2)
            r2 = 0
            r1.b(r2)
            r3 = 32
            r1.a(r3)
            r1.a(r2)
            r1.b(r4)
            long r4 = (long) r0
            r1.a(r4)
            r4 = 0
            r1.b(r4)
            r1.a(r6)
            r1.a(r7)
            r1.a(r8)
            r1.a(r2)
            r1.a(r9)
            r1.a(r10)
            r1.a(r12)
            int r4 = r1.a()
            r1.b(r4, r2)
            byte[] r4 = r1.b()
            return r4
    }

    public static byte[] a(android.content.Context r2, int r3, int r4, long r5, byte[] r7, long r8) {
            cn.jiguang.ai.b r0 = new cn.jiguang.ai.b
            r1 = 20480(0x5000, float:2.8699E-41)
            r0.<init>(r1)
            r1 = 0
            r0.b(r1)
            r0.a(r4)
            r0.a(r3)
            r0.b(r5)
            int r3 = cn.jiguang.internal.JConstants.tcpSessionId
            long r3 = (long) r3
            r0.a(r3)
            r3 = 0
            int r5 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r5 != 0) goto L24
            long r8 = cn.jiguang.d.a.f(r2)
        L24:
            r0.b(r8)
            r0.a(r7)
            int r3 = r0.a()
            r0.b(r3, r1)
            byte[] r3 = r0.b()
            byte[] r2 = a(r2, r3)
            return r2
    }

    public static byte[] a(android.content.Context r1, byte[] r2) {
            r0 = 0
            byte[] r0 = new byte[r0]
            byte[] r1 = a(r1, r2, r0)
            return r1
    }

    public static byte[] a(android.content.Context r8, byte[] r9, byte[] r10) {
            if (r9 == 0) goto L7e
            int r0 = r9.length
            if (r0 != 0) goto L7
            goto L7e
        L7:
            int r0 = r9.length
            r1 = 24
            int r0 = r0 - r1
            byte[] r2 = new byte[r1]
            byte[] r3 = new byte[r0]
            r4 = 0
            java.lang.System.arraycopy(r9, r4, r2, r4, r1)
            java.lang.System.arraycopy(r9, r1, r3, r4, r0)
            java.lang.String r8 = a(r8)
            byte r9 = cn.jiguang.internal.JConstants.tcpAlgorithm     // Catch: java.lang.Exception -> L60
            r0 = 2
            r5 = 1
            if (r9 != r0) goto L2a
            cn.jiguang.av.s r0 = new cn.jiguang.av.s     // Catch: java.lang.Exception -> L60
            r0.<init>()     // Catch: java.lang.Exception -> L60
            byte[] r8 = r0.a(r3, r8)     // Catch: java.lang.Exception -> L60
            goto L34
        L2a:
            r0 = 16
            java.lang.String r0 = r8.substring(r4, r0)     // Catch: java.lang.Exception -> L60
            byte[] r8 = cn.jiguang.av.t.a(r3, r8, r0, r5)     // Catch: java.lang.Exception -> L60
        L34:
            if (r10 == 0) goto L38
            int r0 = r10.length     // Catch: java.lang.Exception -> L60
            goto L39
        L38:
            r0 = 0
        L39:
            int r3 = r0 + 24
            int r6 = r8.length     // Catch: java.lang.Exception -> L60
            int r6 = r6 + r3
            byte[] r7 = new byte[r6]     // Catch: java.lang.Exception -> L60
            java.lang.System.arraycopy(r2, r4, r7, r4, r1)     // Catch: java.lang.Exception -> L60
            if (r0 <= 0) goto L47
            java.lang.System.arraycopy(r10, r4, r7, r1, r0)     // Catch: java.lang.Exception -> L60
        L47:
            int r10 = r8.length     // Catch: java.lang.Exception -> L60
            java.lang.System.arraycopy(r8, r4, r7, r3, r10)     // Catch: java.lang.Exception -> L60
            int r8 = r6 >>> 8
            r8 = r8 & 255(0xff, float:3.57E-43)
            byte r8 = (byte) r8     // Catch: java.lang.Exception -> L60
            r7[r4] = r8     // Catch: java.lang.Exception -> L60
            r10 = r6 & 255(0xff, float:3.57E-43)
            byte r10 = (byte) r10     // Catch: java.lang.Exception -> L60
            r7[r5] = r10     // Catch: java.lang.Exception -> L60
            r8 = r8 | 128(0x80, float:1.8E-43)
            byte r8 = (byte) r8     // Catch: java.lang.Exception -> L60
            r7[r4] = r8     // Catch: java.lang.Exception -> L60
            r8 = 4
            r7[r8] = r9     // Catch: java.lang.Exception -> L60
            return r7
        L60:
            r8 = move-exception
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "e:"
            r9.append(r10)
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            java.lang.String r9 = "CorePackage"
            cn.jiguang.w.f.i(r9, r8)
            java.lang.String r8 = "encrpt data failed"
            cn.jiguang.w.f.j(r9, r8)
            r8 = 0
            return r8
        L7e:
            return r9
    }

    public static byte[] a(short r2, short r3, java.lang.String r4) {
            cn.jiguang.ai.b r0 = new cn.jiguang.ai.b
            r1 = 20480(0x5000, float:2.8699E-41)
            r0.<init>(r1)
            r0.a(r2)
            r0.a(r3)
            r0.a(r4)
            byte[] r2 = r0.b()
            return r2
    }

    private static byte[] a(byte[] r3) {
            if (r3 != 0) goto L4
            r3 = 0
            return r3
        L4:
            int r0 = r3.length
            byte[] r0 = new byte[r0]
            int r1 = r3.length
            r2 = 0
            java.lang.System.arraycopy(r3, r2, r0, r2, r1)
            return r0
    }

    public static byte[] b(android.content.Context r9) {
            byte[] r0 = cn.jiguang.af.b.f428c
            if (r0 == 0) goto L9
            byte[] r9 = a(r0)
            return r9
        L9:
            long r0 = cn.jiguang.d.a.f(r9)
            java.lang.String r4 = cn.jiguang.d.a.j(r9)
            r2 = 0
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 > 0) goto L1f
            int r0 = a()
            long r0 = (long) r0
            r2 = 0
            r8 = 0
            goto L21
        L1f:
            r2 = 1
            r8 = 1
        L21:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = ""
            r2.append(r0)
            java.lang.String r3 = r2.toString()
            java.lang.String r5 = cn.jiguang.af.b.f429d
            java.lang.String r6 = cn.jiguang.af.b.f430e
            boolean r7 = cn.jiguang.ab.c.e(r9)
            r2 = r9
            cn.jiguang.av.t$a r9 = cn.jiguang.av.t.a.a(r2, r3, r4, r5, r6, r7)
            java.lang.String r0 = new java.lang.String
            byte[] r1 = r9.b()
            r0.<init>(r1)
            cn.jiguang.af.b.f427b = r0
            cn.jiguang.ai.b r0 = new cn.jiguang.ai.b
            r0.<init>()
            int r1 = r9.d()
            byte[] r9 = r9.a()
            r2 = 3
            if (r2 != r1) goto L5b
            r1 = 4
        L5b:
            r0.a(r1)
            r0.b(r9)
            byte[] r9 = r0.b()
            if (r8 == 0) goto L69
            cn.jiguang.af.b.f428c = r9
        L69:
            byte[] r9 = a(r9)
            return r9
    }
}
