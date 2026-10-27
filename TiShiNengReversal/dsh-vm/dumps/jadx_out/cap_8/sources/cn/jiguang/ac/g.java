package cn.jiguang.ac;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class g implements java.io.Serializable, java.lang.Comparable {
    public static final cn.jiguang.ac.g a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final cn.jiguang.ac.g f350b = null;

    /* renamed from: f, reason: collision with root package name */
    private static final byte[] f351f = null;

    /* renamed from: g, reason: collision with root package name */
    private static final byte[] f352g = null;

    /* renamed from: h, reason: collision with root package name */
    private static final java.text.DecimalFormat f353h = null;

    /* renamed from: i, reason: collision with root package name */
    private static final byte[] f354i = null;

    /* renamed from: j, reason: collision with root package name */
    private static final cn.jiguang.ac.g f355j = null;

    /* renamed from: c, reason: collision with root package name */
    private byte[] f356c;

    /* renamed from: d, reason: collision with root package name */
    private long f357d;

    /* renamed from: e, reason: collision with root package name */
    private int f358e;

    static {
            r0 = 1
            byte[] r1 = new byte[r0]
            r2 = 0
            r1[r2] = r2
            cn.jiguang.ac.g.f351f = r1
            r1 = 2
            byte[] r1 = new byte[r1]
            r1 = {x0060: FILL_ARRAY_DATA , data: [1, 42} // fill-array
            cn.jiguang.ac.g.f352g = r1
            java.text.DecimalFormat r1 = new java.text.DecimalFormat
            r1.<init>()
            cn.jiguang.ac.g.f353h = r1
            r3 = 256(0x100, float:3.59E-43)
            byte[] r3 = new byte[r3]
            cn.jiguang.ac.g.f354i = r3
            r3 = 3
            r1.setMinimumIntegerDigits(r3)
            r1 = 0
        L22:
            byte[] r3 = cn.jiguang.ac.g.f354i
            int r4 = r3.length
            if (r1 >= r4) goto L3c
            r4 = 65
            if (r1 < r4) goto L36
            r4 = 90
            if (r1 <= r4) goto L30
            goto L36
        L30:
            int r4 = r1 + 32
            byte r4 = (byte) r4
            r3[r1] = r4
            goto L39
        L36:
            byte r4 = (byte) r1
            r3[r1] = r4
        L39:
            int r1 = r1 + 1
            goto L22
        L3c:
            cn.jiguang.ac.g r1 = new cn.jiguang.ac.g
            r1.<init>()
            cn.jiguang.ac.g.a = r1
            byte[] r3 = cn.jiguang.ac.g.f351f
            r1.b(r3, r2, r0)
            cn.jiguang.ac.g r1 = new cn.jiguang.ac.g
            r1.<init>()
            cn.jiguang.ac.g.f350b = r1
            byte[] r3 = new byte[r2]
            r1.f356c = r3
            cn.jiguang.ac.g r1 = new cn.jiguang.ac.g
            r1.<init>()
            cn.jiguang.ac.g.f355j = r1
            byte[] r3 = cn.jiguang.ac.g.f352g
            r1.b(r3, r2, r0)
            return
    }

    private g() {
            r0 = this;
            r0.<init>()
            return
    }

    public g(cn.jiguang.ac.b r9) {
            r8 = this;
            r8.<init>()
            r0 = 64
            byte[] r0 = new byte[r0]
            r1 = 0
            r2 = 0
            r3 = 0
        La:
            if (r2 != 0) goto L67
            int r4 = r9.f()
            r5 = r4 & 192(0xc0, float:2.69E-43)
            r6 = 1
            if (r5 == 0) goto L44
            r7 = 192(0xc0, float:2.69E-43)
            if (r5 != r7) goto L3c
            int r5 = r9.f()
            r4 = r4 & (-193(0xffffffffffffff3f, float:NaN))
            int r4 = r4 << 8
            int r5 = r5 + r4
            int r4 = r9.a()
            int r4 = r4 + (-2)
            if (r5 >= r4) goto L34
            if (r3 != 0) goto L30
            r9.d()
            r3 = 1
        L30:
            r9.b(r5)
            goto La
        L34:
            java.io.IOException r9 = new java.io.IOException
            java.lang.String r0 = "bad compression"
            r9.<init>(r0)
            throw r9
        L3c:
            java.io.IOException r9 = new java.io.IOException
            java.lang.String r0 = "bad label type"
            r9.<init>(r0)
            throw r9
        L44:
            int r5 = r8.d()
            r7 = 128(0x80, float:1.8E-43)
            if (r5 >= r7) goto L5f
            if (r4 != 0) goto L55
            byte[] r2 = cn.jiguang.ac.g.f351f
            r8.a(r2, r1, r6)
            r2 = 1
            goto La
        L55:
            byte r5 = (byte) r4
            r0[r1] = r5
            r9.a(r0, r6, r4)
            r8.a(r0, r1, r6)
            goto La
        L5f:
            java.io.IOException r9 = new java.io.IOException
            java.lang.String r0 = "too many labels"
            r9.<init>(r0)
            throw r9
        L67:
            if (r3 == 0) goto L6c
            r9.e()
        L6c:
            return
    }

    public g(cn.jiguang.ac.g r4, int r5) {
            r3 = this;
            r3.<init>()
            int r0 = r4.b()
            if (r5 > r0) goto L24
            byte[] r1 = r4.f356c
            r3.f356c = r1
            int r0 = r0 - r5
            r3.b(r0)
            r1 = 0
        L12:
            r2 = 7
            if (r1 >= r2) goto L23
            if (r1 >= r0) goto L23
            int r2 = r1 + r5
            int r2 = r4.a(r2)
            r3.a(r1, r2)
            int r1 = r1 + 1
            goto L12
        L23:
            return
        L24:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "attempted to remove too many labels"
            r4.<init>(r5)
            throw r4
    }

    public g(java.lang.String r18, cn.jiguang.ac.g r19) {
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r0.<init>()
            java.lang.String r3 = ""
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto Lf9
            java.lang.String r3 = "@"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L25
            if (r2 != 0) goto L21
            cn.jiguang.ac.g r1 = cn.jiguang.ac.g.f350b
            b(r1, r0)
            return
        L21:
            b(r2, r0)
            return
        L25:
            java.lang.String r3 = "."
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L33
            cn.jiguang.ac.g r1 = cn.jiguang.ac.g.a
            b(r1, r0)
            return
        L33:
            r3 = 64
            byte[] r3 = new byte[r3]
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = -1
            r11 = 1
            r12 = 0
        L3d:
            int r13 = r1.length()
            java.lang.String r14 = "bad escape"
            r15 = 3
            if (r7 >= r13) goto Lc1
            char r13 = r1.charAt(r7)
            byte r13 = (byte) r13
            java.lang.String r5 = "label too long"
            r16 = 0
            r6 = 63
            if (r9 == 0) goto L8b
            r4 = 48
            if (r13 < r4) goto L72
            r4 = 57
            if (r13 > r4) goto L72
            if (r8 >= r15) goto L72
            int r8 = r8 + 1
            int r12 = r12 * 10
            int r13 = r13 + (-48)
            int r12 = r12 + r13
            r4 = 255(0xff, float:3.57E-43)
            if (r12 > r4) goto L6d
            if (r8 >= r15) goto L6b
            goto Lb9
        L6b:
            byte r13 = (byte) r12
            goto L7c
        L6d:
            java.io.IOException r1 = a(r1, r14)
            throw r1
        L72:
            if (r8 <= 0) goto L7c
            if (r8 < r15) goto L77
            goto L7c
        L77:
            java.io.IOException r1 = a(r1, r14)
            throw r1
        L7c:
            if (r11 > r6) goto L86
            int r4 = r11 + 1
            r3[r11] = r13
            r10 = r11
            r9 = 0
        L84:
            r11 = r4
            goto Lb9
        L86:
            java.io.IOException r1 = a(r1, r5)
            throw r1
        L8b:
            r4 = 92
            if (r13 != r4) goto L93
            r8 = 0
            r9 = 1
            r12 = 0
            goto Lb9
        L93:
            r4 = 46
            if (r13 != r4) goto Lae
            r4 = -1
            if (r10 == r4) goto La7
            int r11 = r11 + (-1)
            byte r5 = (byte) r11
            r3[r16] = r5
            r5 = 1
            r6 = 0
            r0.a(r1, r3, r6, r5)
            r10 = -1
            r11 = 1
            goto Lb9
        La7:
            java.lang.String r2 = "invalid empty label"
            java.io.IOException r1 = a(r1, r2)
            throw r1
        Lae:
            r4 = -1
            if (r10 != r4) goto Lb2
            r10 = r7
        Lb2:
            if (r11 > r6) goto Lbc
            int r4 = r11 + 1
            r3[r11] = r13
            goto L84
        Lb9:
            int r7 = r7 + 1
            goto L3d
        Lbc:
            java.io.IOException r1 = a(r1, r5)
            throw r1
        Lc1:
            if (r8 <= 0) goto Lcb
            if (r8 < r15) goto Lc6
            goto Lcb
        Lc6:
            java.io.IOException r1 = a(r1, r14)
            throw r1
        Lcb:
            if (r9 != 0) goto Lf4
            r4 = -1
            if (r10 != r4) goto Ld8
            byte[] r3 = cn.jiguang.ac.g.f351f
            r5 = 1
            r6 = 0
            r0.a(r1, r3, r6, r5)
            goto Le2
        Ld8:
            r5 = 1
            r6 = 0
            int r11 = r11 - r5
            byte r4 = (byte) r11
            r3[r6] = r4
            r0.a(r1, r3, r6, r5)
            r5 = 0
        Le2:
            if (r2 == 0) goto Lf3
            if (r5 != 0) goto Lf3
            byte[] r3 = r2.f356c
            int r4 = r2.a(r6)
            int r2 = r2.d()
            r0.a(r1, r3, r4, r2)
        Lf3:
            return
        Lf4:
            java.io.IOException r1 = a(r1, r14)
            throw r1
        Lf9:
            java.lang.String r2 = "empty name"
            java.io.IOException r1 = a(r1, r2)
            throw r1
    }

    private final int a(int r4) {
            r3 = this;
            if (r4 != 0) goto La
            int r0 = r3.d()
            if (r0 != 0) goto La
            r4 = 0
            return r4
        La:
            if (r4 < 0) goto L32
            int r0 = r3.d()
            if (r4 >= r0) goto L32
            r0 = 7
            if (r4 >= r0) goto L20
            int r0 = r0 - r4
            int r0 = r0 * 8
            long r1 = r3.f357d
            long r0 = r1 >>> r0
            int r4 = (int) r0
            r4 = r4 & 255(0xff, float:3.57E-43)
            return r4
        L20:
            r0 = 6
            int r1 = r3.a(r0)
        L25:
            if (r0 >= r4) goto L31
            byte[] r2 = r3.f356c
            r2 = r2[r1]
            int r2 = r2 + 1
            int r1 = r1 + r2
            int r0 = r0 + 1
            goto L25
        L31:
            return r1
        L32:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "label out of range"
            r4.<init>(r0)
            throw r4
    }

    public static cn.jiguang.ac.g a(cn.jiguang.ac.g r2, cn.jiguang.ac.g r3) {
            boolean r0 = r2.a()
            if (r0 == 0) goto L7
            return r2
        L7:
            cn.jiguang.ac.g r0 = new cn.jiguang.ac.g
            r0.<init>()
            b(r2, r0)
            byte[] r2 = r3.f356c
            r1 = 0
            int r1 = r3.a(r1)
            int r3 = r3.d()
            r0.a(r2, r1, r3)
            return r0
    }

    public static cn.jiguang.ac.g a(java.lang.String r1) {
            r0 = 0
            cn.jiguang.ac.g r1 = a(r1, r0)
            return r1
    }

    public static cn.jiguang.ac.g a(java.lang.String r1, cn.jiguang.ac.g r2) {
            java.lang.String r0 = "@"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Lb
            if (r2 == 0) goto Lb
            return r2
        Lb:
            java.lang.String r0 = "."
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L16
            cn.jiguang.ac.g r1 = cn.jiguang.ac.g.a
            return r1
        L16:
            cn.jiguang.ac.g r0 = new cn.jiguang.ac.g
            r0.<init>(r1, r2)
            return r0
    }

    private static java.io.IOException a(java.lang.String r3, java.lang.String r4) {
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "'"
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = "': "
            r1.append(r3)
            r1.append(r4)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            return r0
    }

    private java.lang.String a(byte[] r8, int r9) {
            r7 = this;
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            int r1 = r9 + 1
            r9 = r8[r9]
            r2 = r1
        La:
            int r3 = r1 + r9
            if (r2 >= r3) goto L55
            r3 = r8[r2]
            r3 = r3 & 255(0xff, float:3.57E-43)
            r4 = 32
            r5 = 92
            if (r3 <= r4) goto L45
            r4 = 127(0x7f, float:1.78E-43)
            if (r3 < r4) goto L1d
            goto L45
        L1d:
            r4 = 34
            if (r3 == r4) goto L41
            r4 = 40
            if (r3 == r4) goto L41
            r4 = 41
            if (r3 == r4) goto L41
            r4 = 46
            if (r3 == r4) goto L41
            r4 = 59
            if (r3 == r4) goto L41
            if (r3 == r5) goto L41
            r4 = 64
            if (r3 == r4) goto L41
            r4 = 36
            if (r3 != r4) goto L3c
            goto L41
        L3c:
            char r3 = (char) r3
            r0.append(r3)
            goto L52
        L41:
            r0.append(r5)
            goto L3c
        L45:
            r0.append(r5)
            java.text.DecimalFormat r4 = cn.jiguang.ac.g.f353h
            long r5 = (long) r3
            java.lang.String r3 = r4.format(r5)
            r0.append(r3)
        L52:
            int r2 = r2 + 1
            goto La
        L55:
            java.lang.String r8 = r0.toString()
            return r8
    }

    private final void a(int r6, int r7) {
            r5 = this;
            r0 = 7
            if (r6 < r0) goto L4
            return
        L4:
            int r0 = r0 - r6
            int r0 = r0 * 8
            long r1 = r5.f357d
            r3 = 255(0xff, double:1.26E-321)
            long r3 = r3 << r0
            long r3 = ~r3
            long r1 = r1 & r3
            long r6 = (long) r7
            long r6 = r6 << r0
            long r6 = r6 | r1
            r5.f357d = r6
            return
    }

    private final void a(java.lang.String r1, byte[] r2, int r3, int r4) {
            r0 = this;
            r0.a(r2, r3, r4)     // Catch: java.lang.Exception -> L4
            return
        L4:
            java.lang.String r2 = "Name too long"
            java.io.IOException r1 = a(r1, r2)
            throw r1
    }

    private final void a(byte[] r9, int r10, int r11) {
            r8 = this;
            byte[] r0 = r8.f356c
            r1 = 0
            if (r0 != 0) goto L7
            r0 = 0
            goto Ld
        L7:
            int r0 = r0.length
            int r2 = r8.a(r1)
            int r0 = r0 - r2
        Ld:
            r4 = r10
            r2 = 0
            r3 = 0
        L10:
            if (r2 >= r11) goto L27
            r5 = r9[r4]
            r6 = 63
            if (r5 > r6) goto L1f
            int r5 = r5 + 1
            int r4 = r4 + r5
            int r3 = r3 + r5
            int r2 = r2 + 1
            goto L10
        L1f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "invalid label"
            r9.<init>(r10)
            throw r9
        L27:
            int r2 = r0 + r3
            r4 = 255(0xff, float:3.57E-43)
            if (r2 > r4) goto L64
            int r4 = r8.d()
            int r5 = r4 + r11
            r6 = 128(0x80, float:1.8E-43)
            if (r5 > r6) goto L5c
            byte[] r2 = new byte[r2]
            if (r0 == 0) goto L44
            byte[] r6 = r8.f356c
            int r7 = r8.a(r1)
            java.lang.System.arraycopy(r6, r7, r2, r1, r0)
        L44:
            java.lang.System.arraycopy(r9, r10, r2, r0, r3)
            r8.f356c = r2
        L49:
            if (r1 >= r11) goto L58
            int r9 = r4 + r1
            r8.a(r9, r0)
            r9 = r2[r0]
            int r9 = r9 + 1
            int r0 = r0 + r9
            int r1 = r1 + 1
            goto L49
        L58:
            r8.b(r5)
            return
        L5c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "too many labels"
            r9.<init>(r10)
            throw r9
        L64:
            java.io.IOException r9 = new java.io.IOException
            r9.<init>()
            throw r9
    }

    private final void b(int r5) {
            r4 = this;
            long r0 = r4.f357d
            r2 = -256(0xffffffffffffff00, double:NaN)
            long r0 = r0 & r2
            long r2 = (long) r5
            long r0 = r0 | r2
            r4.f357d = r0
            return
    }

    private static final void b(cn.jiguang.ac.g r6, cn.jiguang.ac.g r7) {
            r0 = 0
            int r1 = r6.a(r0)
            if (r1 != 0) goto L10
            byte[] r0 = r6.f356c
            r7.f356c = r0
            long r0 = r6.f357d
            r7.f357d = r0
            return
        L10:
            int r1 = r6.a(r0)
            byte[] r2 = r6.f356c
            int r2 = r2.length
            int r2 = r2 - r1
            int r3 = r6.b()
            byte[] r4 = new byte[r2]
            r7.f356c = r4
            byte[] r5 = r6.f356c
            java.lang.System.arraycopy(r5, r1, r4, r0, r2)
        L25:
            if (r0 >= r3) goto L35
            r2 = 7
            if (r0 >= r2) goto L35
            int r2 = r6.a(r0)
            int r2 = r2 - r1
            r7.a(r0, r2)
            int r0 = r0 + 1
            goto L25
        L35:
            r7.b(r3)
            return
    }

    private final void b(byte[] r1, int r2, int r3) {
            r0 = this;
            r0.a(r1, r2, r3)     // Catch: java.lang.Exception -> L3
        L3:
            return
    }

    private final boolean b(byte[] r10, int r11) {
            r9 = this;
            int r0 = r9.b()
            r1 = 0
            int r2 = r9.a(r1)
            r3 = 0
        La:
            if (r3 >= r0) goto L47
            byte[] r4 = r9.f356c
            r4 = r4[r2]
            r5 = r10[r11]
            if (r4 == r5) goto L15
            return r1
        L15:
            int r2 = r2 + 1
            int r11 = r11 + 1
            r5 = 63
            if (r4 > r5) goto L3f
            r5 = 0
        L1e:
            if (r5 >= r4) goto L3c
            byte[] r6 = cn.jiguang.ac.g.f354i
            byte[] r7 = r9.f356c
            int r8 = r2 + 1
            r2 = r7[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
            r2 = r6[r2]
            int r7 = r11 + 1
            r11 = r10[r11]
            r11 = r11 & 255(0xff, float:3.57E-43)
            r11 = r6[r11]
            if (r2 == r11) goto L37
            return r1
        L37:
            int r5 = r5 + 1
            r11 = r7
            r2 = r8
            goto L1e
        L3c:
            int r3 = r3 + 1
            goto La
        L3f:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "invalid label"
            r10.<init>(r11)
            throw r10
        L47:
            r10 = 1
            return r10
    }

    private final int d() {
            r4 = this;
            long r0 = r4.f357d
            r2 = 255(0xff, double:1.26E-321)
            long r0 = r0 & r2
            int r1 = (int) r0
            return r1
    }

    public java.lang.String a(boolean r7) {
            r6 = this;
            int r0 = r6.b()
            if (r0 != 0) goto L9
            java.lang.String r7 = "@"
            return r7
        L9:
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L1a
            byte[] r2 = r6.f356c
            int r3 = r6.a(r1)
            r2 = r2[r3]
            if (r2 != 0) goto L1a
            java.lang.String r7 = "."
            return r7
        L1a:
            java.lang.StringBuffer r2 = new java.lang.StringBuffer
            r2.<init>()
            int r3 = r6.a(r1)
        L23:
            if (r1 >= r0) goto L53
            byte[] r4 = r6.f356c
            r4 = r4[r3]
            r5 = 63
            if (r4 > r5) goto L4b
            r5 = 46
            if (r4 != 0) goto L37
            if (r7 != 0) goto L53
            r2.append(r5)
            goto L53
        L37:
            if (r1 <= 0) goto L3c
            r2.append(r5)
        L3c:
            byte[] r5 = r6.f356c
            java.lang.String r5 = r6.a(r5, r3)
            r2.append(r5)
            int r4 = r4 + 1
            int r3 = r3 + r4
            int r1 = r1 + 1
            goto L23
        L4b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "invalid label"
            r7.<init>(r0)
            throw r7
        L53:
            java.lang.String r7 = r2.toString()
            return r7
    }

    public void a(cn.jiguang.ac.c r2) {
            r1 = this;
            byte[] r0 = r1.c()
            r2.a(r0)
            return
    }

    public void a(cn.jiguang.ac.c r7, cn.jiguang.ac.a r8) {
            r6 = this;
            int r0 = r6.b()
            r1 = 0
            r2 = 0
        L6:
            int r3 = r0 + (-1)
            if (r2 >= r3) goto L3e
            if (r2 != 0) goto Le
            r3 = r6
            goto L13
        Le:
            cn.jiguang.ac.g r3 = new cn.jiguang.ac.g
            r3.<init>(r6, r2)
        L13:
            if (r8 == 0) goto L1a
            int r4 = r8.a(r3)
            goto L1b
        L1a:
            r4 = -1
        L1b:
            if (r4 < 0) goto L25
            r8 = 49152(0xc000, float:6.8877E-41)
            r8 = r8 | r4
            r7.c(r8)
            return
        L25:
            if (r8 == 0) goto L2e
            int r4 = r7.a()
            r8.a(r4, r3)
        L2e:
            int r3 = r6.a(r2)
            byte[] r4 = r6.f356c
            r5 = r4[r3]
            int r5 = r5 + 1
            r7.a(r4, r3, r5)
            int r2 = r2 + 1
            goto L6
        L3e:
            r7.b(r1)
            return
    }

    public void a(cn.jiguang.ac.c r1, cn.jiguang.ac.a r2, boolean r3) {
            r0 = this;
            if (r3 == 0) goto L6
            r0.a(r1)
            return
        L6:
            r0.a(r1, r2)
            return
    }

    public boolean a() {
            r4 = this;
            int r0 = r4.b()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            byte[] r2 = r4.f356c
            r3 = 1
            int r0 = r0 - r3
            int r0 = r4.a(r0)
            r0 = r2[r0]
            if (r0 != 0) goto L15
            return r3
        L15:
            return r1
    }

    public int b() {
            r1 = this;
            int r0 = r1.d()
            return r0
    }

    public byte[] c() {
            r12 = this;
            int r0 = r12.b()
            r1 = 0
            if (r0 != 0) goto La
            byte[] r0 = new byte[r1]
            return r0
        La:
            byte[] r2 = r12.f356c
            int r2 = r2.length
            int r3 = r12.a(r1)
            int r2 = r2 - r3
            byte[] r2 = new byte[r2]
            int r3 = r12.a(r1)
            r4 = 0
            r5 = 0
        L1a:
            if (r4 >= r0) goto L4e
            byte[] r6 = r12.f356c
            r6 = r6[r3]
            r7 = 63
            if (r6 > r7) goto L46
            int r7 = r5 + 1
            int r3 = r3 + 1
            r2[r5] = r6
            r5 = r7
            r7 = 0
        L2c:
            if (r7 >= r6) goto L43
            int r8 = r5 + 1
            byte[] r9 = cn.jiguang.ac.g.f354i
            byte[] r10 = r12.f356c
            int r11 = r3 + 1
            r3 = r10[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            r3 = r9[r3]
            r2[r5] = r3
            int r7 = r7 + 1
            r5 = r8
            r3 = r11
            goto L2c
        L43:
            int r4 = r4 + 1
            goto L1a
        L46:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "invalid label"
            r0.<init>(r1)
            throw r0
        L4e:
            return r2
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object r18) {
            r17 = this;
            r0 = r17
            r1 = r18
            cn.jiguang.ac.g r1 = (cn.jiguang.ac.g) r1
            r2 = 0
            if (r0 != r1) goto La
            return r2
        La:
            int r3 = r0.b()
            int r4 = r1.b()
            if (r3 <= r4) goto L16
            r5 = r4
            goto L17
        L16:
            r5 = r3
        L17:
            r6 = 1
            r7 = 1
        L19:
            if (r7 > r5) goto L5b
            int r8 = r3 - r7
            int r8 = r0.a(r8)
            int r9 = r4 - r7
            int r9 = r1.a(r9)
            byte[] r10 = r0.f356c
            r10 = r10[r8]
            byte[] r11 = r1.f356c
            r11 = r11[r9]
            r12 = 0
        L30:
            if (r12 >= r10) goto L54
            if (r12 >= r11) goto L54
            byte[] r13 = cn.jiguang.ac.g.f354i
            byte[] r14 = r0.f356c
            int r15 = r12 + r8
            int r15 = r15 + r6
            r14 = r14[r15]
            r14 = r14 & 255(0xff, float:3.57E-43)
            r14 = r13[r14]
            byte[] r15 = r1.f356c
            int r16 = r12 + r9
            int r16 = r16 + 1
            r15 = r15[r16]
            r15 = r15 & 255(0xff, float:3.57E-43)
            r13 = r13[r15]
            int r14 = r14 - r13
            if (r14 == 0) goto L51
            return r14
        L51:
            int r12 = r12 + 1
            goto L30
        L54:
            if (r10 == r11) goto L58
            int r10 = r10 - r11
            return r10
        L58:
            int r7 = r7 + 1
            goto L19
        L5b:
            int r3 = r3 - r4
            return r3
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            if (r4 != r3) goto L4
            r4 = 1
            return r4
        L4:
            r0 = 0
            if (r4 == 0) goto L39
            boolean r1 = r4 instanceof cn.jiguang.ac.g
            if (r1 != 0) goto Lc
            goto L39
        Lc:
            cn.jiguang.ac.g r4 = (cn.jiguang.ac.g) r4
            int r1 = r4.f358e
            if (r1 != 0) goto L15
            r4.hashCode()
        L15:
            int r1 = r3.f358e
            if (r1 != 0) goto L1c
            r3.hashCode()
        L1c:
            int r1 = r4.f358e
            int r2 = r3.f358e
            if (r1 == r2) goto L23
            return r0
        L23:
            int r1 = r4.b()
            int r2 = r3.b()
            if (r1 == r2) goto L2e
            return r0
        L2e:
            byte[] r1 = r4.f356c
            int r4 = r4.a(r0)
            boolean r4 = r3.b(r1, r4)
            return r4
        L39:
            return r0
    }

    public int hashCode() {
            r5 = this;
            int r0 = r5.f358e
            if (r0 == 0) goto L5
            return r0
        L5:
            r0 = 0
            int r1 = r5.a(r0)
        La:
            byte[] r2 = r5.f356c
            int r3 = r2.length
            if (r1 >= r3) goto L1e
            int r3 = r0 << 3
            byte[] r4 = cn.jiguang.ac.g.f354i
            r2 = r2[r1]
            r2 = r2 & 255(0xff, float:3.57E-43)
            r2 = r4[r2]
            int r3 = r3 + r2
            int r0 = r0 + r3
            int r1 = r1 + 1
            goto La
        L1e:
            r5.f358e = r0
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            r0 = 0
            java.lang.String r0 = r1.a(r0)
            return r0
    }
}
