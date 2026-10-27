package com.umeng.analytics.pro;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class ck extends com.umeng.analytics.pro.cq {
    private static final com.umeng.analytics.pro.cv d = null;
    private static final com.umeng.analytics.pro.cl e = null;
    private static final byte[] f = null;
    private static final byte h = -126;
    private static final byte i = 1;
    private static final byte j = 31;
    private static final byte k = -32;
    private static final int l = 5;
    byte[] a;
    byte[] b;
    byte[] c;
    private com.umeng.analytics.pro.bp m;
    private short n;
    private com.umeng.analytics.pro.cl o;
    private java.lang.Boolean p;

    /* renamed from: q, reason: collision with root package name */
    private final long f25q;
    private byte[] r;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class a implements com.umeng.analytics.pro.cs {
        private final long a;

        public a() {
                r2 = this;
                r2.<init>()
                r0 = -1
                r2.a = r0
                return
        }

        public a(int r3) {
                r2 = this;
                r2.<init>()
                long r0 = (long) r3
                r2.a = r0
                return
        }

        @Override // com.umeng.analytics.pro.cs
        public com.umeng.analytics.pro.cq a(com.umeng.analytics.pro.de r4) {
                r3 = this;
                com.umeng.analytics.pro.ck r0 = new com.umeng.analytics.pro.ck
                long r1 = r3.a
                r0.<init>(r4, r1)
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class b {
        public static final byte a = 1;
        public static final byte b = 2;
        public static final byte c = 3;
        public static final byte d = 4;
        public static final byte e = 5;
        public static final byte f = 6;
        public static final byte g = 7;
        public static final byte h = 8;
        public static final byte i = 9;
        public static final byte j = 10;
        public static final byte k = 11;
        public static final byte l = 12;

        private b() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            com.umeng.analytics.pro.cv r0 = new com.umeng.analytics.pro.cv
            java.lang.String r1 = ""
            r0.<init>(r1)
            com.umeng.analytics.pro.ck.d = r0
            com.umeng.analytics.pro.cl r0 = new com.umeng.analytics.pro.cl
            r2 = 0
            r0.<init>(r1, r2, r2)
            com.umeng.analytics.pro.ck.e = r0
            r0 = 16
            byte[] r0 = new byte[r0]
            com.umeng.analytics.pro.ck.f = r0
            r0[r2] = r2
            r1 = 2
            r2 = 1
            r0[r1] = r2
            r1 = 3
            r0[r1] = r1
            r1 = 6
            r2 = 4
            r0[r1] = r2
            r3 = 5
            r4 = 8
            r0[r4] = r3
            r3 = 10
            r0[r3] = r1
            r1 = 7
            r0[r2] = r1
            r1 = 11
            r0[r1] = r4
            r2 = 15
            r4 = 9
            r0[r2] = r4
            r2 = 14
            r0[r2] = r3
            r2 = 13
            r0[r2] = r1
            r1 = 12
            r0[r1] = r1
            return
    }

    public ck(com.umeng.analytics.pro.de r3) {
            r2 = this;
            r0 = -1
            r2.<init>(r3, r0)
            return
    }

    public ck(com.umeng.analytics.pro.de r2, long r3) {
            r1 = this;
            r1.<init>(r2)
            com.umeng.analytics.pro.bp r2 = new com.umeng.analytics.pro.bp
            r0 = 15
            r2.<init>(r0)
            r1.m = r2
            r2 = 0
            r1.n = r2
            r2 = 0
            r1.o = r2
            r1.p = r2
            r2 = 5
            byte[] r2 = new byte[r2]
            r1.a = r2
            r2 = 10
            byte[] r2 = new byte[r2]
            r1.b = r2
            r2 = 1
            byte[] r0 = new byte[r2]
            r1.r = r0
            byte[] r2 = new byte[r2]
            r1.c = r2
            r1.f25q = r3
            return
    }

    private int E() throws com.umeng.analytics.pro.bx {
            r8 = this;
            com.umeng.analytics.pro.de r0 = r8.g
            int r0 = r0.h()
            r1 = 5
            r2 = 128(0x80, float:1.8E-43)
            r3 = 0
            if (r0 < r1) goto L32
            com.umeng.analytics.pro.de r0 = r8.g
            byte[] r0 = r0.f()
            com.umeng.analytics.pro.de r1 = r8.g
            int r1 = r1.g()
            r4 = 0
            r5 = 0
        L1a:
            int r6 = r1 + r3
            r6 = r0[r6]
            r7 = r6 & 127(0x7f, float:1.78E-43)
            int r7 = r7 << r5
            r4 = r4 | r7
            r6 = r6 & r2
            if (r6 == r2) goto L2d
            com.umeng.analytics.pro.de r0 = r8.g
            int r3 = r3 + 1
            r0.a(r3)
            return r4
        L2d:
            int r5 = r5 + 7
            int r3 = r3 + 1
            goto L1a
        L32:
            r0 = 0
        L33:
            byte r1 = r8.u()
            r4 = r1 & 127(0x7f, float:1.78E-43)
            int r4 = r4 << r0
            r3 = r3 | r4
            r1 = r1 & r2
            if (r1 == r2) goto L3f
            return r3
        L3f:
            int r0 = r0 + 7
            goto L33
    }

    private long F() throws com.umeng.analytics.pro.bx {
            r10 = this;
            com.umeng.analytics.pro.de r0 = r10.g
            int r0 = r0.h()
            r1 = 10
            r2 = 128(0x80, float:1.8E-43)
            r3 = 0
            r4 = 0
            if (r0 < r1) goto L36
            com.umeng.analytics.pro.de r0 = r10.g
            byte[] r0 = r0.f()
            com.umeng.analytics.pro.de r1 = r10.g
            int r1 = r1.g()
            r5 = r4
            r4 = 0
        L1d:
            int r7 = r1 + r3
            r7 = r0[r7]
            r8 = r7 & 127(0x7f, float:1.78E-43)
            long r8 = (long) r8
            long r8 = r8 << r4
            long r5 = r5 | r8
            r7 = r7 & r2
            if (r7 == r2) goto L31
            com.umeng.analytics.pro.de r0 = r10.g
            int r3 = r3 + 1
            r0.a(r3)
            return r5
        L31:
            int r4 = r4 + 7
            int r3 = r3 + 1
            goto L1d
        L36:
            byte r0 = r10.u()
            r1 = r0 & 127(0x7f, float:1.78E-43)
            long r6 = (long) r1
            long r6 = r6 << r3
            long r4 = r4 | r6
            r0 = r0 & r2
            if (r0 == r2) goto L43
            return r4
        L43:
            int r3 = r3 + 7
            goto L36
    }

    private long a(byte[] r8) {
            r7 = this;
            r0 = 7
            r0 = r8[r0]
            long r0 = (long) r0
            r2 = 255(0xff, double:1.26E-321)
            long r0 = r0 & r2
            r4 = 56
            long r0 = r0 << r4
            r4 = 6
            r4 = r8[r4]
            long r4 = (long) r4
            long r4 = r4 & r2
            r6 = 48
            long r4 = r4 << r6
            long r0 = r0 | r4
            r4 = 5
            r4 = r8[r4]
            long r4 = (long) r4
            long r4 = r4 & r2
            r6 = 40
            long r4 = r4 << r6
            long r0 = r0 | r4
            r4 = 4
            r4 = r8[r4]
            long r4 = (long) r4
            long r4 = r4 & r2
            r6 = 32
            long r4 = r4 << r6
            long r0 = r0 | r4
            r4 = 3
            r4 = r8[r4]
            long r4 = (long) r4
            long r4 = r4 & r2
            r6 = 24
            long r4 = r4 << r6
            long r0 = r0 | r4
            r4 = 2
            r4 = r8[r4]
            long r4 = (long) r4
            long r4 = r4 & r2
            r6 = 16
            long r4 = r4 << r6
            long r0 = r0 | r4
            r4 = 1
            r4 = r8[r4]
            long r4 = (long) r4
            long r4 = r4 & r2
            r6 = 8
            long r4 = r4 << r6
            long r0 = r0 | r4
            r4 = 0
            r8 = r8[r4]
            long r4 = (long) r8
            long r2 = r2 & r4
            long r0 = r0 | r2
            return r0
    }

    private void a(long r6, byte[] r8, int r9) {
            r5 = this;
            r0 = 255(0xff, double:1.26E-321)
            long r2 = r6 & r0
            int r3 = (int) r2
            byte r2 = (byte) r3
            r8[r9] = r2
            int r2 = r9 + 1
            r3 = 8
            long r3 = r6 >> r3
            long r3 = r3 & r0
            int r4 = (int) r3
            byte r3 = (byte) r4
            r8[r2] = r3
            int r2 = r9 + 2
            r3 = 16
            long r3 = r6 >> r3
            long r3 = r3 & r0
            int r4 = (int) r3
            byte r3 = (byte) r4
            r8[r2] = r3
            int r2 = r9 + 3
            r3 = 24
            long r3 = r6 >> r3
            long r3 = r3 & r0
            int r4 = (int) r3
            byte r3 = (byte) r4
            r8[r2] = r3
            int r2 = r9 + 4
            r3 = 32
            long r3 = r6 >> r3
            long r3 = r3 & r0
            int r4 = (int) r3
            byte r3 = (byte) r4
            r8[r2] = r3
            int r2 = r9 + 5
            r3 = 40
            long r3 = r6 >> r3
            long r3 = r3 & r0
            int r4 = (int) r3
            byte r3 = (byte) r4
            r8[r2] = r3
            int r2 = r9 + 6
            r3 = 48
            long r3 = r6 >> r3
            long r3 = r3 & r0
            int r4 = (int) r3
            byte r3 = (byte) r4
            r8[r2] = r3
            int r9 = r9 + 7
            r2 = 56
            long r6 = r6 >> r2
            long r6 = r6 & r0
            int r7 = (int) r6
            byte r6 = (byte) r7
            r8[r9] = r6
            return
    }

    private void a(com.umeng.analytics.pro.cl r5, byte r6) throws com.umeng.analytics.pro.bx {
            r4 = this;
            r0 = -1
            if (r6 != r0) goto L9
            byte r6 = r5.b
            byte r6 = r4.e(r6)
        L9:
            short r0 = r5.c
            short r1 = r4.n
            if (r0 <= r1) goto L1d
            int r2 = r0 - r1
            r3 = 15
            if (r2 > r3) goto L1d
            int r0 = r0 - r1
            int r0 = r0 << 4
            r6 = r6 | r0
            r4.d(r6)
            goto L25
        L1d:
            r4.b(r6)
            short r6 = r5.c
            r4.a(r6)
        L25:
            short r5 = r5.c
            r4.n = r5
            return
    }

    private void a(byte[] r2, int r3, int r4) throws com.umeng.analytics.pro.bx {
            r1 = this;
            r1.b(r4)
            com.umeng.analytics.pro.de r0 = r1.g
            r0.b(r2, r3, r4)
            return
    }

    private void b(byte r3) throws com.umeng.analytics.pro.bx {
            r2 = this;
            byte[] r0 = r2.r
            r1 = 0
            r0[r1] = r3
            com.umeng.analytics.pro.de r3 = r2.g
            r3.b(r0)
            return
    }

    private void b(int r6) throws com.umeng.analytics.pro.bx {
            r5 = this;
            r0 = 0
            r1 = 0
        L2:
            r2 = r6 & (-128(0xffffffffffffff80, float:NaN))
            if (r2 != 0) goto L13
            byte[] r2 = r5.a
            int r3 = r1 + 1
            byte r6 = (byte) r6
            r2[r1] = r6
            com.umeng.analytics.pro.de r6 = r5.g
            r6.b(r2, r0, r3)
            return
        L13:
            byte[] r2 = r5.a
            int r3 = r1 + 1
            r4 = r6 & 127(0x7f, float:1.78E-43)
            r4 = r4 | 128(0x80, float:1.8E-43)
            byte r4 = (byte) r4
            r2[r1] = r4
            int r6 = r6 >>> 7
            r1 = r3
            goto L2
    }

    private void b(long r9) throws com.umeng.analytics.pro.bx {
            r8 = this;
            r0 = 0
            r1 = 0
        L2:
            r2 = -128(0xffffffffffffff80, double:NaN)
            long r2 = r2 & r9
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L19
            byte[] r2 = r8.b
            int r3 = r1 + 1
            int r10 = (int) r9
            byte r9 = (byte) r10
            r2[r1] = r9
            com.umeng.analytics.pro.de r9 = r8.g
            r9.b(r2, r0, r3)
            return
        L19:
            byte[] r2 = r8.b
            int r3 = r1 + 1
            r4 = 127(0x7f, double:6.27E-322)
            long r4 = r4 & r9
            r6 = 128(0x80, double:6.3E-322)
            long r4 = r4 | r6
            int r5 = (int) r4
            byte r4 = (byte) r5
            r2[r1] = r4
            r1 = 7
            long r9 = r9 >>> r1
            r1 = r3
            goto L2
    }

    private int c(int r2) {
            r1 = this;
            int r0 = r2 << 1
            int r2 = r2 >> 31
            r2 = r2 ^ r0
            return r2
    }

    private long c(long r4) {
            r3 = this;
            r0 = 1
            long r0 = r4 << r0
            r2 = 63
            long r4 = r4 >> r2
            long r4 = r4 ^ r0
            return r4
    }

    private boolean c(byte r3) {
            r2 = this;
            r3 = r3 & 15
            r0 = 1
            if (r3 == r0) goto Lb
            r1 = 2
            if (r3 != r1) goto L9
            goto Lb
        L9:
            r3 = 0
            return r3
        Lb:
            return r0
    }

    private byte d(byte r4) throws com.umeng.analytics.pro.cr {
            r3 = this;
            r0 = 15
            r4 = r4 & r0
            byte r4 = (byte) r4
            switch(r4) {
                case 0: goto L39;
                case 1: goto L37;
                case 2: goto L37;
                case 3: goto L35;
                case 4: goto L33;
                case 5: goto L30;
                case 6: goto L2d;
                case 7: goto L2b;
                case 8: goto L28;
                case 9: goto L27;
                case 10: goto L24;
                case 11: goto L21;
                case 12: goto L1e;
                default: goto L7;
            }
        L7:
            com.umeng.analytics.pro.cr r0 = new com.umeng.analytics.pro.cr
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "don't know what type: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        L1e:
            r4 = 12
            return r4
        L21:
            r4 = 13
            return r4
        L24:
            r4 = 14
            return r4
        L27:
            return r0
        L28:
            r4 = 11
            return r4
        L2b:
            r4 = 4
            return r4
        L2d:
            r4 = 10
            return r4
        L30:
            r4 = 8
            return r4
        L33:
            r4 = 6
            return r4
        L35:
            r4 = 3
            return r4
        L37:
            r4 = 2
            return r4
        L39:
            r4 = 0
            return r4
    }

    private long d(long r5) {
            r4 = this;
            r0 = 1
            long r0 = r5 >>> r0
            r2 = 1
            long r5 = r5 & r2
            long r5 = -r5
            long r5 = r5 ^ r0
            return r5
    }

    private void d(int r1) throws com.umeng.analytics.pro.bx {
            r0 = this;
            byte r1 = (byte) r1
            r0.b(r1)
            return
    }

    private byte e(byte r2) {
            r1 = this;
            byte[] r0 = com.umeng.analytics.pro.ck.f
            r2 = r0[r2]
            return r2
    }

    private byte[] e(int r4) throws com.umeng.analytics.pro.bx {
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L6
            byte[] r4 = new byte[r0]
            return r4
        L6:
            byte[] r1 = new byte[r4]
            com.umeng.analytics.pro.de r2 = r3.g
            r2.d(r1, r0, r4)
            return r1
    }

    private void f(int r6) throws com.umeng.analytics.pro.cr {
            r5 = this;
            if (r6 < 0) goto L28
            long r0 = r5.f25q
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L27
            long r2 = (long) r6
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 > 0) goto L10
            goto L27
        L10:
            com.umeng.analytics.pro.cr r0 = new com.umeng.analytics.pro.cr
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Length exceeded max allowed: "
            r1.append(r2)
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            r0.<init>(r6)
            throw r0
        L27:
            return
        L28:
            com.umeng.analytics.pro.cr r0 = new com.umeng.analytics.pro.cr
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Negative length: "
            r1.append(r2)
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            r0.<init>(r6)
            throw r0
    }

    private int g(int r2) {
            r1 = this;
            int r0 = r2 >>> 1
            r2 = r2 & 1
            int r2 = -r2
            r2 = r2 ^ r0
            return r2
    }

    @Override // com.umeng.analytics.pro.cq
    public java.nio.ByteBuffer A() throws com.umeng.analytics.pro.bx {
            r4 = this;
            int r0 = r4.E()
            r4.f(r0)
            r1 = 0
            if (r0 != 0) goto L11
            byte[] r0 = new byte[r1]
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)
            return r0
        L11:
            byte[] r2 = new byte[r0]
            com.umeng.analytics.pro.de r3 = r4.g
            r3.d(r2, r1, r0)
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r2)
            return r0
    }

    @Override // com.umeng.analytics.pro.cq
    public void B() {
            r1 = this;
            com.umeng.analytics.pro.bp r0 = r1.m
            r0.c()
            r0 = 0
            r1.n = r0
            return
    }

    @Override // com.umeng.analytics.pro.cq
    public void a() throws com.umeng.analytics.pro.bx {
            r0 = this;
            return
    }

    @Override // com.umeng.analytics.pro.cq
    public void a(byte r1) throws com.umeng.analytics.pro.bx {
            r0 = this;
            r0.b(r1)
            return
    }

    protected void a(byte r2, int r3) throws com.umeng.analytics.pro.bx {
            r1 = this;
            r0 = 14
            if (r3 > r0) goto Lf
            int r3 = r3 << 4
            byte r2 = r1.e(r2)
            r2 = r2 | r3
            r1.d(r2)
            return
        Lf:
            byte r2 = r1.e(r2)
            r2 = r2 | 240(0xf0, float:3.36E-43)
            r1.d(r2)
            r1.b(r3)
            return
    }

    @Override // com.umeng.analytics.pro.cq
    public void a(double r3) throws com.umeng.analytics.pro.bx {
            r2 = this;
            r0 = 8
            byte[] r0 = new byte[r0]
            r0 = {x0016: FILL_ARRAY_DATA , data: [0, 0, 0, 0, 0, 0, 0, 0} // fill-array
            long r3 = java.lang.Double.doubleToLongBits(r3)
            r1 = 0
            r2.a(r3, r0, r1)
            com.umeng.analytics.pro.de r3 = r2.g
            r3.b(r0)
            return
    }

    @Override // com.umeng.analytics.pro.cq
    public void a(int r1) throws com.umeng.analytics.pro.bx {
            r0 = this;
            int r1 = r0.c(r1)
            r0.b(r1)
            return
    }

    @Override // com.umeng.analytics.pro.cq
    public void a(long r1) throws com.umeng.analytics.pro.bx {
            r0 = this;
            long r1 = r0.c(r1)
            r0.b(r1)
            return
    }

    @Override // com.umeng.analytics.pro.cq
    public void a(com.umeng.analytics.pro.cl r3) throws com.umeng.analytics.pro.bx {
            r2 = this;
            byte r0 = r3.b
            r1 = 2
            if (r0 != r1) goto L8
            r2.o = r3
            return
        L8:
            r0 = -1
            r2.a(r3, r0)
            return
    }

    @Override // com.umeng.analytics.pro.cq
    public void a(com.umeng.analytics.pro.cm r2) throws com.umeng.analytics.pro.bx {
            r1 = this;
            byte r0 = r2.a
            int r2 = r2.b
            r1.a(r0, r2)
            return
    }

    @Override // com.umeng.analytics.pro.cq
    public void a(com.umeng.analytics.pro.cn r2) throws com.umeng.analytics.pro.bx {
            r1 = this;
            int r0 = r2.c
            if (r0 != 0) goto L9
            r2 = 0
            r1.d(r2)
            return
        L9:
            r1.b(r0)
            byte r0 = r2.a
            byte r0 = r1.e(r0)
            int r0 = r0 << 4
            byte r2 = r2.b
            byte r2 = r1.e(r2)
            r2 = r2 | r0
            r1.d(r2)
            return
    }

    @Override // com.umeng.analytics.pro.cq
    public void a(com.umeng.analytics.pro.co r2) throws com.umeng.analytics.pro.bx {
            r1 = this;
            r0 = -126(0xffffffffffffff82, float:NaN)
            r1.b(r0)
            byte r0 = r2.b
            int r0 = r0 << 5
            r0 = r0 & (-32)
            r0 = r0 | 1
            r1.d(r0)
            int r0 = r2.c
            r1.b(r0)
            java.lang.String r2 = r2.a
            r1.a(r2)
            return
    }

    @Override // com.umeng.analytics.pro.cq
    public void a(com.umeng.analytics.pro.cu r2) throws com.umeng.analytics.pro.bx {
            r1 = this;
            byte r0 = r2.a
            int r2 = r2.b
            r1.a(r0, r2)
            return
    }

    @Override // com.umeng.analytics.pro.cq
    public void a(com.umeng.analytics.pro.cv r2) throws com.umeng.analytics.pro.bx {
            r1 = this;
            com.umeng.analytics.pro.bp r2 = r1.m
            short r0 = r1.n
            r2.a(r0)
            r2 = 0
            r1.n = r2
            return
    }

    @Override // com.umeng.analytics.pro.cq
    public void a(java.lang.String r3) throws com.umeng.analytics.pro.bx {
            r2 = this;
            java.lang.String r0 = "UTF-8"
            byte[] r3 = r3.getBytes(r0)     // Catch: java.io.UnsupportedEncodingException -> Lc
            int r0 = r3.length     // Catch: java.io.UnsupportedEncodingException -> Lc
            r1 = 0
            r2.a(r3, r1, r0)     // Catch: java.io.UnsupportedEncodingException -> Lc
            return
        Lc:
            com.umeng.analytics.pro.bx r3 = new com.umeng.analytics.pro.bx
            java.lang.String r0 = "UTF-8 not supported!"
            r3.<init>(r0)
            throw r3
    }

    @Override // com.umeng.analytics.pro.cq
    public void a(java.nio.ByteBuffer r4) throws com.umeng.analytics.pro.bx {
            r3 = this;
            int r0 = r4.limit()
            int r1 = r4.position()
            int r0 = r0 - r1
            byte[] r1 = r4.array()
            int r2 = r4.position()
            int r4 = r4.arrayOffset()
            int r2 = r2 + r4
            r3.a(r1, r2, r0)
            return
    }

    @Override // com.umeng.analytics.pro.cq
    public void a(short r1) throws com.umeng.analytics.pro.bx {
            r0 = this;
            int r1 = r0.c(r1)
            r0.b(r1)
            return
    }

    @Override // com.umeng.analytics.pro.cq
    public void a(boolean r4) throws com.umeng.analytics.pro.bx {
            r3 = this;
            com.umeng.analytics.pro.cl r0 = r3.o
            r1 = 2
            r2 = 1
            if (r0 == 0) goto L10
            if (r4 == 0) goto L9
            r1 = 1
        L9:
            r3.a(r0, r1)
            r4 = 0
            r3.o = r4
            return
        L10:
            if (r4 == 0) goto L13
            r1 = 1
        L13:
            r3.b(r1)
            return
    }

    @Override // com.umeng.analytics.pro.cq
    public void b() throws com.umeng.analytics.pro.bx {
            r1 = this;
            com.umeng.analytics.pro.bp r0 = r1.m
            short r0 = r0.a()
            r1.n = r0
            return
    }

    @Override // com.umeng.analytics.pro.cq
    public void c() throws com.umeng.analytics.pro.bx {
            r0 = this;
            return
    }

    @Override // com.umeng.analytics.pro.cq
    public void d() throws com.umeng.analytics.pro.bx {
            r1 = this;
            r0 = 0
            r1.b(r0)
            return
    }

    @Override // com.umeng.analytics.pro.cq
    public void e() throws com.umeng.analytics.pro.bx {
            r0 = this;
            return
    }

    @Override // com.umeng.analytics.pro.cq
    public void f() throws com.umeng.analytics.pro.bx {
            r0 = this;
            return
    }

    @Override // com.umeng.analytics.pro.cq
    public void g() throws com.umeng.analytics.pro.bx {
            r0 = this;
            return
    }

    @Override // com.umeng.analytics.pro.cq
    public com.umeng.analytics.pro.co h() throws com.umeng.analytics.pro.bx {
            r5 = this;
            byte r0 = r5.u()
            r1 = -126(0xffffffffffffff82, float:NaN)
            if (r0 != r1) goto L3c
            byte r0 = r5.u()
            r1 = r0 & 31
            byte r1 = (byte) r1
            r2 = 1
            if (r1 != r2) goto L25
            int r0 = r0 >> 5
            r0 = r0 & 3
            byte r0 = (byte) r0
            int r1 = r5.E()
            java.lang.String r2 = r5.z()
            com.umeng.analytics.pro.co r3 = new com.umeng.analytics.pro.co
            r3.<init>(r2, r0, r1)
            return r3
        L25:
            com.umeng.analytics.pro.cr r0 = new com.umeng.analytics.pro.cr
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Expected version 1 but got "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L3c:
            com.umeng.analytics.pro.cr r2 = new com.umeng.analytics.pro.cr
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Expected protocol id "
            r3.append(r4)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r3.append(r1)
            java.lang.String r1 = " but got "
            r3.append(r1)
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
    }

    @Override // com.umeng.analytics.pro.cq
    public void i() throws com.umeng.analytics.pro.bx {
            r0 = this;
            return
    }

    @Override // com.umeng.analytics.pro.cq
    public com.umeng.analytics.pro.cv j() throws com.umeng.analytics.pro.bx {
            r2 = this;
            com.umeng.analytics.pro.bp r0 = r2.m
            short r1 = r2.n
            r0.a(r1)
            r0 = 0
            r2.n = r0
            com.umeng.analytics.pro.cv r0 = com.umeng.analytics.pro.ck.d
            return r0
    }

    @Override // com.umeng.analytics.pro.cq
    public void k() throws com.umeng.analytics.pro.bx {
            r1 = this;
            com.umeng.analytics.pro.bp r0 = r1.m
            short r0 = r0.a()
            r1.n = r0
            return
    }

    @Override // com.umeng.analytics.pro.cq
    public com.umeng.analytics.pro.cl l() throws com.umeng.analytics.pro.bx {
            r6 = this;
            byte r0 = r6.u()
            if (r0 != 0) goto L9
            com.umeng.analytics.pro.cl r0 = com.umeng.analytics.pro.ck.e
            return r0
        L9:
            r1 = r0 & 240(0xf0, float:3.36E-43)
            int r1 = r1 >> 4
            short r1 = (short) r1
            if (r1 != 0) goto L15
            short r1 = r6.v()
            goto L19
        L15:
            short r2 = r6.n
            int r2 = r2 + r1
            short r1 = (short) r2
        L19:
            com.umeng.analytics.pro.cl r2 = new com.umeng.analytics.pro.cl
            r3 = r0 & 15
            byte r3 = (byte) r3
            byte r4 = r6.d(r3)
            java.lang.String r5 = ""
            r2.<init>(r5, r4, r1)
            boolean r0 = r6.c(r0)
            if (r0 == 0) goto L37
            r0 = 1
            if (r3 != r0) goto L33
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            goto L35
        L33:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
        L35:
            r6.p = r0
        L37:
            short r0 = r2.c
            r6.n = r0
            return r2
    }

    @Override // com.umeng.analytics.pro.cq
    public void m() throws com.umeng.analytics.pro.bx {
            r0 = this;
            return
    }

    @Override // com.umeng.analytics.pro.cq
    public com.umeng.analytics.pro.cn n() throws com.umeng.analytics.pro.bx {
            r4 = this;
            int r0 = r4.E()
            if (r0 != 0) goto L8
            r1 = 0
            goto Lc
        L8:
            byte r1 = r4.u()
        Lc:
            com.umeng.analytics.pro.cn r2 = new com.umeng.analytics.pro.cn
            int r3 = r1 >> 4
            byte r3 = (byte) r3
            byte r3 = r4.d(r3)
            r1 = r1 & 15
            byte r1 = (byte) r1
            byte r1 = r4.d(r1)
            r2.<init>(r3, r1, r0)
            return r2
    }

    @Override // com.umeng.analytics.pro.cq
    public void o() throws com.umeng.analytics.pro.bx {
            r0 = this;
            return
    }

    @Override // com.umeng.analytics.pro.cq
    public com.umeng.analytics.pro.cm p() throws com.umeng.analytics.pro.bx {
            r3 = this;
            byte r0 = r3.u()
            int r1 = r0 >> 4
            r2 = 15
            r1 = r1 & r2
            if (r1 != r2) goto Lf
            int r1 = r3.E()
        Lf:
            byte r0 = r3.d(r0)
            com.umeng.analytics.pro.cm r2 = new com.umeng.analytics.pro.cm
            r2.<init>(r0, r1)
            return r2
    }

    @Override // com.umeng.analytics.pro.cq
    public void q() throws com.umeng.analytics.pro.bx {
            r0 = this;
            return
    }

    @Override // com.umeng.analytics.pro.cq
    public com.umeng.analytics.pro.cu r() throws com.umeng.analytics.pro.bx {
            r2 = this;
            com.umeng.analytics.pro.cu r0 = new com.umeng.analytics.pro.cu
            com.umeng.analytics.pro.cm r1 = r2.p()
            r0.<init>(r1)
            return r0
    }

    @Override // com.umeng.analytics.pro.cq
    public void s() throws com.umeng.analytics.pro.bx {
            r0 = this;
            return
    }

    @Override // com.umeng.analytics.pro.cq
    public boolean t() throws com.umeng.analytics.pro.bx {
            r2 = this;
            java.lang.Boolean r0 = r2.p
            if (r0 == 0) goto Lc
            boolean r0 = r0.booleanValue()
            r1 = 0
            r2.p = r1
            return r0
        Lc:
            byte r0 = r2.u()
            r1 = 1
            if (r0 != r1) goto L14
            return r1
        L14:
            r0 = 0
            return r0
    }

    @Override // com.umeng.analytics.pro.cq
    public byte u() throws com.umeng.analytics.pro.bx {
            r4 = this;
            com.umeng.analytics.pro.de r0 = r4.g
            int r0 = r0.h()
            r1 = 1
            if (r0 <= 0) goto L1d
            com.umeng.analytics.pro.de r0 = r4.g
            byte[] r0 = r0.f()
            com.umeng.analytics.pro.de r2 = r4.g
            int r2 = r2.g()
            r0 = r0[r2]
            com.umeng.analytics.pro.de r2 = r4.g
            r2.a(r1)
            return r0
        L1d:
            com.umeng.analytics.pro.de r0 = r4.g
            byte[] r2 = r4.c
            r3 = 0
            r0.d(r2, r3, r1)
            byte[] r0 = r4.c
            r0 = r0[r3]
            return r0
    }

    @Override // com.umeng.analytics.pro.cq
    public short v() throws com.umeng.analytics.pro.bx {
            r1 = this;
            int r0 = r1.E()
            int r0 = r1.g(r0)
            short r0 = (short) r0
            return r0
    }

    @Override // com.umeng.analytics.pro.cq
    public int w() throws com.umeng.analytics.pro.bx {
            r1 = this;
            int r0 = r1.E()
            int r0 = r1.g(r0)
            return r0
    }

    @Override // com.umeng.analytics.pro.cq
    public long x() throws com.umeng.analytics.pro.bx {
            r2 = this;
            long r0 = r2.F()
            long r0 = r2.d(r0)
            return r0
    }

    @Override // com.umeng.analytics.pro.cq
    public double y() throws com.umeng.analytics.pro.bx {
            r4 = this;
            r0 = 8
            byte[] r1 = new byte[r0]
            com.umeng.analytics.pro.de r2 = r4.g
            r3 = 0
            r2.d(r1, r3, r0)
            long r0 = r4.a(r1)
            double r0 = java.lang.Double.longBitsToDouble(r0)
            return r0
    }

    @Override // com.umeng.analytics.pro.cq
    public java.lang.String z() throws com.umeng.analytics.pro.bx {
            r5 = this;
            int r0 = r5.E()
            r5.f(r0)
            if (r0 != 0) goto Lc
            java.lang.String r0 = ""
            return r0
        Lc:
            com.umeng.analytics.pro.de r1 = r5.g     // Catch: java.io.UnsupportedEncodingException -> L37
            int r1 = r1.h()     // Catch: java.io.UnsupportedEncodingException -> L37
            java.lang.String r2 = "UTF-8"
            if (r1 < r0) goto L2d
            java.lang.String r1 = new java.lang.String     // Catch: java.io.UnsupportedEncodingException -> L37
            com.umeng.analytics.pro.de r3 = r5.g     // Catch: java.io.UnsupportedEncodingException -> L37
            byte[] r3 = r3.f()     // Catch: java.io.UnsupportedEncodingException -> L37
            com.umeng.analytics.pro.de r4 = r5.g     // Catch: java.io.UnsupportedEncodingException -> L37
            int r4 = r4.g()     // Catch: java.io.UnsupportedEncodingException -> L37
            r1.<init>(r3, r4, r0, r2)     // Catch: java.io.UnsupportedEncodingException -> L37
            com.umeng.analytics.pro.de r2 = r5.g     // Catch: java.io.UnsupportedEncodingException -> L37
            r2.a(r0)     // Catch: java.io.UnsupportedEncodingException -> L37
            return r1
        L2d:
            java.lang.String r1 = new java.lang.String     // Catch: java.io.UnsupportedEncodingException -> L37
            byte[] r0 = r5.e(r0)     // Catch: java.io.UnsupportedEncodingException -> L37
            r1.<init>(r0, r2)     // Catch: java.io.UnsupportedEncodingException -> L37
            return r1
        L37:
            com.umeng.analytics.pro.bx r0 = new com.umeng.analytics.pro.bx
            java.lang.String r1 = "UTF-8 not supported!"
            r0.<init>(r1)
            throw r0
    }
}
