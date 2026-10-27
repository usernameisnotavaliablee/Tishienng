package com.umeng.analytics.pro;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class cj extends com.umeng.analytics.pro.cq {
    protected static final int a = -65536;
    protected static final int b = -2147418112;
    private static final com.umeng.analytics.pro.cv h = null;
    protected boolean c;
    protected boolean d;
    protected int e;
    protected boolean f;
    private byte[] i;
    private byte[] j;
    private byte[] k;
    private byte[] l;
    private byte[] m;
    private byte[] n;
    private byte[] o;
    private byte[] p;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class a implements com.umeng.analytics.pro.cs {
        protected boolean a;
        protected boolean b;
        protected int c;

        public a() {
                r2 = this;
                r0 = 0
                r1 = 1
                r2.<init>(r0, r1)
                return
        }

        public a(boolean r2, boolean r3) {
                r1 = this;
                r0 = 0
                r1.<init>(r2, r3, r0)
                return
        }

        public a(boolean r1, boolean r2, int r3) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.b = r2
                r0.c = r3
                return
        }

        @Override // com.umeng.analytics.pro.cs
        public com.umeng.analytics.pro.cq a(com.umeng.analytics.pro.de r4) {
                r3 = this;
                com.umeng.analytics.pro.cj r0 = new com.umeng.analytics.pro.cj
                boolean r1 = r3.a
                boolean r2 = r3.b
                r0.<init>(r4, r1, r2)
                int r4 = r3.c
                if (r4 == 0) goto L10
                r0.c(r4)
            L10:
                return r0
        }
    }

    static {
            com.umeng.analytics.pro.cv r0 = new com.umeng.analytics.pro.cv
            r0.<init>()
            com.umeng.analytics.pro.cj.h = r0
            return
    }

    public cj(com.umeng.analytics.pro.de r3) {
            r2 = this;
            r0 = 0
            r1 = 1
            r2.<init>(r3, r0, r1)
            return
    }

    public cj(com.umeng.analytics.pro.de r5, boolean r6, boolean r7) {
            r4 = this;
            r4.<init>(r5)
            r5 = 0
            r4.f = r5
            r5 = 1
            byte[] r0 = new byte[r5]
            r4.i = r0
            r0 = 2
            byte[] r1 = new byte[r0]
            r4.j = r1
            r1 = 4
            byte[] r2 = new byte[r1]
            r4.k = r2
            r2 = 8
            byte[] r3 = new byte[r2]
            r4.l = r3
            byte[] r5 = new byte[r5]
            r4.m = r5
            byte[] r5 = new byte[r0]
            r4.n = r5
            byte[] r5 = new byte[r1]
            r4.o = r5
            byte[] r5 = new byte[r2]
            r4.p = r5
            r4.c = r6
            r4.d = r7
            return
    }

    private int a(byte[] r2, int r3, int r4) throws com.umeng.analytics.pro.bx {
            r1 = this;
            r1.d(r4)
            com.umeng.analytics.pro.de r0 = r1.g
            int r2 = r0.d(r2, r3, r4)
            return r2
    }

    @Override // com.umeng.analytics.pro.cq
    public java.nio.ByteBuffer A() throws com.umeng.analytics.pro.bx {
            r4 = this;
            int r0 = r4.w()
            r4.d(r0)
            com.umeng.analytics.pro.de r1 = r4.g
            int r1 = r1.h()
            if (r1 < r0) goto L25
            com.umeng.analytics.pro.de r1 = r4.g
            byte[] r1 = r1.f()
            com.umeng.analytics.pro.de r2 = r4.g
            int r2 = r2.g()
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.wrap(r1, r2, r0)
            com.umeng.analytics.pro.de r2 = r4.g
            r2.a(r0)
            return r1
        L25:
            byte[] r1 = new byte[r0]
            com.umeng.analytics.pro.de r2 = r4.g
            r3 = 0
            r2.d(r1, r3, r0)
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r1)
            return r0
    }

    @Override // com.umeng.analytics.pro.cq
    public void a() {
            r0 = this;
            return
    }

    @Override // com.umeng.analytics.pro.cq
    public void a(byte r4) throws com.umeng.analytics.pro.bx {
            r3 = this;
            byte[] r0 = r3.i
            r1 = 0
            r0[r1] = r4
            com.umeng.analytics.pro.de r4 = r3.g
            r2 = 1
            r4.b(r0, r1, r2)
            return
    }

    @Override // com.umeng.analytics.pro.cq
    public void a(double r1) throws com.umeng.analytics.pro.bx {
            r0 = this;
            long r1 = java.lang.Double.doubleToLongBits(r1)
            r0.a(r1)
            return
    }

    @Override // com.umeng.analytics.pro.cq
    public void a(int r5) throws com.umeng.analytics.pro.bx {
            r4 = this;
            byte[] r0 = r4.k
            int r1 = r5 >> 24
            r1 = r1 & 255(0xff, float:3.57E-43)
            byte r1 = (byte) r1
            r2 = 0
            r0[r2] = r1
            int r1 = r5 >> 16
            r1 = r1 & 255(0xff, float:3.57E-43)
            byte r1 = (byte) r1
            r3 = 1
            r0[r3] = r1
            int r1 = r5 >> 8
            r1 = r1 & 255(0xff, float:3.57E-43)
            byte r1 = (byte) r1
            r3 = 2
            r0[r3] = r1
            r5 = r5 & 255(0xff, float:3.57E-43)
            byte r5 = (byte) r5
            r1 = 3
            r0[r1] = r5
            com.umeng.analytics.pro.de r5 = r4.g
            r1 = 4
            r5.b(r0, r2, r1)
            return
    }

    @Override // com.umeng.analytics.pro.cq
    public void a(long r8) throws com.umeng.analytics.pro.bx {
            r7 = this;
            byte[] r0 = r7.l
            r1 = 56
            long r1 = r8 >> r1
            r3 = 255(0xff, double:1.26E-321)
            long r1 = r1 & r3
            int r2 = (int) r1
            byte r1 = (byte) r2
            r2 = 0
            r0[r2] = r1
            r1 = 48
            long r5 = r8 >> r1
            long r5 = r5 & r3
            int r1 = (int) r5
            byte r1 = (byte) r1
            r5 = 1
            r0[r5] = r1
            r1 = 40
            long r5 = r8 >> r1
            long r5 = r5 & r3
            int r1 = (int) r5
            byte r1 = (byte) r1
            r5 = 2
            r0[r5] = r1
            r1 = 32
            long r5 = r8 >> r1
            long r5 = r5 & r3
            int r1 = (int) r5
            byte r1 = (byte) r1
            r5 = 3
            r0[r5] = r1
            r1 = 24
            long r5 = r8 >> r1
            long r5 = r5 & r3
            int r1 = (int) r5
            byte r1 = (byte) r1
            r5 = 4
            r0[r5] = r1
            r1 = 16
            long r5 = r8 >> r1
            long r5 = r5 & r3
            int r1 = (int) r5
            byte r1 = (byte) r1
            r5 = 5
            r0[r5] = r1
            r1 = 8
            long r5 = r8 >> r1
            long r5 = r5 & r3
            int r6 = (int) r5
            byte r5 = (byte) r6
            r6 = 6
            r0[r6] = r5
            long r8 = r8 & r3
            int r9 = (int) r8
            byte r8 = (byte) r9
            r9 = 7
            r0[r9] = r8
            com.umeng.analytics.pro.de r8 = r7.g
            r8.b(r0, r2, r1)
            return
    }

    @Override // com.umeng.analytics.pro.cq
    public void a(com.umeng.analytics.pro.cl r2) throws com.umeng.analytics.pro.bx {
            r1 = this;
            byte r0 = r2.b
            r1.a(r0)
            short r2 = r2.c
            r1.a(r2)
            return
    }

    @Override // com.umeng.analytics.pro.cq
    public void a(com.umeng.analytics.pro.cm r2) throws com.umeng.analytics.pro.bx {
            r1 = this;
            byte r0 = r2.a
            r1.a(r0)
            int r2 = r2.b
            r1.a(r2)
            return
    }

    @Override // com.umeng.analytics.pro.cq
    public void a(com.umeng.analytics.pro.cn r2) throws com.umeng.analytics.pro.bx {
            r1 = this;
            byte r0 = r2.a
            r1.a(r0)
            byte r0 = r2.b
            r1.a(r0)
            int r2 = r2.c
            r1.a(r2)
            return
    }

    @Override // com.umeng.analytics.pro.cq
    public void a(com.umeng.analytics.pro.co r3) throws com.umeng.analytics.pro.bx {
            r2 = this;
            boolean r0 = r2.d
            if (r0 == 0) goto L17
            r0 = -2147418112(0xffffffff80010000, float:-9.1835E-41)
            byte r1 = r3.b
            r0 = r0 | r1
            r2.a(r0)
            java.lang.String r0 = r3.a
            r2.a(r0)
            int r3 = r3.c
            r2.a(r3)
            return
        L17:
            java.lang.String r0 = r3.a
            r2.a(r0)
            byte r0 = r3.b
            r2.a(r0)
            int r3 = r3.c
            r2.a(r3)
            return
    }

    @Override // com.umeng.analytics.pro.cq
    public void a(com.umeng.analytics.pro.cu r2) throws com.umeng.analytics.pro.bx {
            r1 = this;
            byte r0 = r2.a
            r1.a(r0)
            int r2 = r2.b
            r1.a(r2)
            return
    }

    @Override // com.umeng.analytics.pro.cq
    public void a(com.umeng.analytics.pro.cv r1) {
            r0 = this;
            return
    }

    @Override // com.umeng.analytics.pro.cq
    public void a(java.lang.String r4) throws com.umeng.analytics.pro.bx {
            r3 = this;
            java.lang.String r0 = "UTF-8"
            byte[] r4 = r4.getBytes(r0)     // Catch: java.io.UnsupportedEncodingException -> L12
            int r0 = r4.length     // Catch: java.io.UnsupportedEncodingException -> L12
            r3.a(r0)     // Catch: java.io.UnsupportedEncodingException -> L12
            com.umeng.analytics.pro.de r0 = r3.g     // Catch: java.io.UnsupportedEncodingException -> L12
            int r1 = r4.length     // Catch: java.io.UnsupportedEncodingException -> L12
            r2 = 0
            r0.b(r4, r2, r1)     // Catch: java.io.UnsupportedEncodingException -> L12
            return
        L12:
            com.umeng.analytics.pro.bx r4 = new com.umeng.analytics.pro.bx
            java.lang.String r0 = "JVM DOES NOT SUPPORT UTF-8"
            r4.<init>(r0)
            throw r4
    }

    @Override // com.umeng.analytics.pro.cq
    public void a(java.nio.ByteBuffer r5) throws com.umeng.analytics.pro.bx {
            r4 = this;
            int r0 = r5.limit()
            int r1 = r5.position()
            int r0 = r0 - r1
            r4.a(r0)
            com.umeng.analytics.pro.de r1 = r4.g
            byte[] r2 = r5.array()
            int r3 = r5.position()
            int r5 = r5.arrayOffset()
            int r3 = r3 + r5
            r1.b(r2, r3, r0)
            return
    }

    @Override // com.umeng.analytics.pro.cq
    public void a(short r4) throws com.umeng.analytics.pro.bx {
            r3 = this;
            byte[] r0 = r3.j
            int r1 = r4 >> 8
            r1 = r1 & 255(0xff, float:3.57E-43)
            byte r1 = (byte) r1
            r2 = 0
            r0[r2] = r1
            r4 = r4 & 255(0xff, float:3.57E-43)
            byte r4 = (byte) r4
            r1 = 1
            r0[r1] = r4
            com.umeng.analytics.pro.de r4 = r3.g
            r1 = 2
            r4.b(r0, r2, r1)
            return
    }

    @Override // com.umeng.analytics.pro.cq
    public void a(boolean r1) throws com.umeng.analytics.pro.bx {
            r0 = this;
            r0.a(r1)
            return
    }

    public java.lang.String b(int r4) throws com.umeng.analytics.pro.bx {
            r3 = this;
            r3.d(r4)     // Catch: java.io.UnsupportedEncodingException -> L13
            byte[] r0 = new byte[r4]     // Catch: java.io.UnsupportedEncodingException -> L13
            com.umeng.analytics.pro.de r1 = r3.g     // Catch: java.io.UnsupportedEncodingException -> L13
            r2 = 0
            r1.d(r0, r2, r4)     // Catch: java.io.UnsupportedEncodingException -> L13
            java.lang.String r4 = new java.lang.String     // Catch: java.io.UnsupportedEncodingException -> L13
            java.lang.String r1 = "UTF-8"
            r4.<init>(r0, r1)     // Catch: java.io.UnsupportedEncodingException -> L13
            return r4
        L13:
            com.umeng.analytics.pro.bx r4 = new com.umeng.analytics.pro.bx
            java.lang.String r0 = "JVM DOES NOT SUPPORT UTF-8"
            r4.<init>(r0)
            throw r4
    }

    @Override // com.umeng.analytics.pro.cq
    public void b() {
            r0 = this;
            return
    }

    @Override // com.umeng.analytics.pro.cq
    public void c() {
            r0 = this;
            return
    }

    public void c(int r1) {
            r0 = this;
            r0.e = r1
            r1 = 1
            r0.f = r1
            return
    }

    @Override // com.umeng.analytics.pro.cq
    public void d() throws com.umeng.analytics.pro.bx {
            r1 = this;
            r0 = 0
            r1.a(r0)
            return
    }

    protected void d(int r4) throws com.umeng.analytics.pro.bx {
            r3 = this;
            if (r4 < 0) goto L26
            boolean r0 = r3.f
            if (r0 == 0) goto L25
            int r0 = r3.e
            int r0 = r0 - r4
            r3.e = r0
            if (r0 < 0) goto Le
            goto L25
        Le:
            com.umeng.analytics.pro.cr r0 = new com.umeng.analytics.pro.cr
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Message length exceeded: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        L25:
            return
        L26:
            com.umeng.analytics.pro.cr r0 = new com.umeng.analytics.pro.cr
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Negative length: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    @Override // com.umeng.analytics.pro.cq
    public void e() {
            r0 = this;
            return
    }

    @Override // com.umeng.analytics.pro.cq
    public void f() {
            r0 = this;
            return
    }

    @Override // com.umeng.analytics.pro.cq
    public void g() {
            r0 = this;
            return
    }

    @Override // com.umeng.analytics.pro.cq
    public com.umeng.analytics.pro.co h() throws com.umeng.analytics.pro.bx {
            r4 = this;
            int r0 = r4.w()
            r1 = 4
            if (r0 >= 0) goto L27
            r2 = -65536(0xffffffffffff0000, float:NaN)
            r2 = r2 & r0
            r3 = -2147418112(0xffffffff80010000, float:-9.1835E-41)
            if (r2 != r3) goto L1f
            com.umeng.analytics.pro.co r1 = new com.umeng.analytics.pro.co
            java.lang.String r2 = r4.z()
            r0 = r0 & 255(0xff, float:3.57E-43)
            byte r0 = (byte) r0
            int r3 = r4.w()
            r1.<init>(r2, r0, r3)
            return r1
        L1f:
            com.umeng.analytics.pro.cr r0 = new com.umeng.analytics.pro.cr
            java.lang.String r2 = "Bad version in readMessageBegin"
            r0.<init>(r1, r2)
            throw r0
        L27:
            boolean r2 = r4.c
            if (r2 != 0) goto L3d
            com.umeng.analytics.pro.co r1 = new com.umeng.analytics.pro.co
            java.lang.String r0 = r4.b(r0)
            byte r2 = r4.u()
            int r3 = r4.w()
            r1.<init>(r0, r2, r3)
            return r1
        L3d:
            com.umeng.analytics.pro.cr r0 = new com.umeng.analytics.pro.cr
            java.lang.String r2 = "Missing version in readMessageBegin, old client?"
            r0.<init>(r1, r2)
            throw r0
    }

    @Override // com.umeng.analytics.pro.cq
    public void i() {
            r0 = this;
            return
    }

    @Override // com.umeng.analytics.pro.cq
    public com.umeng.analytics.pro.cv j() {
            r1 = this;
            com.umeng.analytics.pro.cv r0 = com.umeng.analytics.pro.cj.h
            return r0
    }

    @Override // com.umeng.analytics.pro.cq
    public void k() {
            r0 = this;
            return
    }

    @Override // com.umeng.analytics.pro.cq
    public com.umeng.analytics.pro.cl l() throws com.umeng.analytics.pro.bx {
            r4 = this;
            byte r0 = r4.u()
            if (r0 != 0) goto L8
            r1 = 0
            goto Lc
        L8:
            short r1 = r4.v()
        Lc:
            com.umeng.analytics.pro.cl r2 = new com.umeng.analytics.pro.cl
            java.lang.String r3 = ""
            r2.<init>(r3, r0, r1)
            return r2
    }

    @Override // com.umeng.analytics.pro.cq
    public void m() {
            r0 = this;
            return
    }

    @Override // com.umeng.analytics.pro.cq
    public com.umeng.analytics.pro.cn n() throws com.umeng.analytics.pro.bx {
            r4 = this;
            com.umeng.analytics.pro.cn r0 = new com.umeng.analytics.pro.cn
            byte r1 = r4.u()
            byte r2 = r4.u()
            int r3 = r4.w()
            r0.<init>(r1, r2, r3)
            return r0
    }

    @Override // com.umeng.analytics.pro.cq
    public void o() {
            r0 = this;
            return
    }

    @Override // com.umeng.analytics.pro.cq
    public com.umeng.analytics.pro.cm p() throws com.umeng.analytics.pro.bx {
            r3 = this;
            com.umeng.analytics.pro.cm r0 = new com.umeng.analytics.pro.cm
            byte r1 = r3.u()
            int r2 = r3.w()
            r0.<init>(r1, r2)
            return r0
    }

    @Override // com.umeng.analytics.pro.cq
    public void q() {
            r0 = this;
            return
    }

    @Override // com.umeng.analytics.pro.cq
    public com.umeng.analytics.pro.cu r() throws com.umeng.analytics.pro.bx {
            r3 = this;
            com.umeng.analytics.pro.cu r0 = new com.umeng.analytics.pro.cu
            byte r1 = r3.u()
            int r2 = r3.w()
            r0.<init>(r1, r2)
            return r0
    }

    @Override // com.umeng.analytics.pro.cq
    public void s() {
            r0 = this;
            return
    }

    @Override // com.umeng.analytics.pro.cq
    public boolean t() throws com.umeng.analytics.pro.bx {
            r2 = this;
            byte r0 = r2.u()
            r1 = 1
            if (r0 != r1) goto L8
            return r1
        L8:
            r0 = 0
            return r0
    }

    @Override // com.umeng.analytics.pro.cq
    public byte u() throws com.umeng.analytics.pro.bx {
            r3 = this;
            com.umeng.analytics.pro.de r0 = r3.g
            int r0 = r0.h()
            r1 = 1
            if (r0 < r1) goto L1d
            com.umeng.analytics.pro.de r0 = r3.g
            byte[] r0 = r0.f()
            com.umeng.analytics.pro.de r2 = r3.g
            int r2 = r2.g()
            r0 = r0[r2]
            com.umeng.analytics.pro.de r2 = r3.g
            r2.a(r1)
            return r0
        L1d:
            byte[] r0 = r3.m
            r2 = 0
            r3.a(r0, r2, r1)
            byte[] r0 = r3.m
            r0 = r0[r2]
            return r0
    }

    @Override // com.umeng.analytics.pro.cq
    public short v() throws com.umeng.analytics.pro.bx {
            r4 = this;
            byte[] r0 = r4.n
            com.umeng.analytics.pro.de r1 = r4.g
            int r1 = r1.h()
            r2 = 2
            if (r1 < r2) goto L1d
            com.umeng.analytics.pro.de r0 = r4.g
            byte[] r0 = r0.f()
            com.umeng.analytics.pro.de r1 = r4.g
            int r1 = r1.g()
            com.umeng.analytics.pro.de r3 = r4.g
            r3.a(r2)
            goto L24
        L1d:
            byte[] r1 = r4.n
            r3 = 0
            r4.a(r1, r3, r2)
            r1 = 0
        L24:
            r2 = r0[r1]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 8
            int r1 = r1 + 1
            r0 = r0[r1]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r0 = r0 | r2
            short r0 = (short) r0
            return r0
    }

    @Override // com.umeng.analytics.pro.cq
    public int w() throws com.umeng.analytics.pro.bx {
            r4 = this;
            byte[] r0 = r4.o
            com.umeng.analytics.pro.de r1 = r4.g
            int r1 = r1.h()
            r2 = 4
            if (r1 < r2) goto L1d
            com.umeng.analytics.pro.de r0 = r4.g
            byte[] r0 = r0.f()
            com.umeng.analytics.pro.de r1 = r4.g
            int r1 = r1.g()
            com.umeng.analytics.pro.de r3 = r4.g
            r3.a(r2)
            goto L24
        L1d:
            byte[] r1 = r4.o
            r3 = 0
            r4.a(r1, r3, r2)
            r1 = 0
        L24:
            r2 = r0[r1]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 24
            int r3 = r1 + 1
            r3 = r0[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 << 16
            r2 = r2 | r3
            int r3 = r1 + 2
            r3 = r0[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 << 8
            r2 = r2 | r3
            int r1 = r1 + 3
            r0 = r0[r1]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r0 = r0 | r2
            return r0
    }

    @Override // com.umeng.analytics.pro.cq
    public long x() throws com.umeng.analytics.pro.bx {
            r8 = this;
            byte[] r0 = r8.p
            com.umeng.analytics.pro.de r1 = r8.g
            int r1 = r1.h()
            r2 = 8
            if (r1 < r2) goto L1e
            com.umeng.analytics.pro.de r0 = r8.g
            byte[] r0 = r0.f()
            com.umeng.analytics.pro.de r1 = r8.g
            int r1 = r1.g()
            com.umeng.analytics.pro.de r3 = r8.g
            r3.a(r2)
            goto L25
        L1e:
            byte[] r1 = r8.p
            r3 = 0
            r8.a(r1, r3, r2)
            r1 = 0
        L25:
            r3 = r0[r1]
            r3 = r3 & 255(0xff, float:3.57E-43)
            long r3 = (long) r3
            r5 = 56
            long r3 = r3 << r5
            int r5 = r1 + 1
            r5 = r0[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            long r5 = (long) r5
            r7 = 48
            long r5 = r5 << r7
            long r3 = r3 | r5
            int r5 = r1 + 2
            r5 = r0[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            long r5 = (long) r5
            r7 = 40
            long r5 = r5 << r7
            long r3 = r3 | r5
            int r5 = r1 + 3
            r5 = r0[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            long r5 = (long) r5
            r7 = 32
            long r5 = r5 << r7
            long r3 = r3 | r5
            int r5 = r1 + 4
            r5 = r0[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            long r5 = (long) r5
            r7 = 24
            long r5 = r5 << r7
            long r3 = r3 | r5
            int r5 = r1 + 5
            r5 = r0[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            long r5 = (long) r5
            r7 = 16
            long r5 = r5 << r7
            long r3 = r3 | r5
            int r5 = r1 + 6
            r5 = r0[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            long r5 = (long) r5
            long r5 = r5 << r2
            long r3 = r3 | r5
            int r1 = r1 + 7
            r0 = r0[r1]
            r0 = r0 & 255(0xff, float:3.57E-43)
            long r0 = (long) r0
            long r0 = r0 | r3
            return r0
    }

    @Override // com.umeng.analytics.pro.cq
    public double y() throws com.umeng.analytics.pro.bx {
            r2 = this;
            long r0 = r2.x()
            double r0 = java.lang.Double.longBitsToDouble(r0)
            return r0
    }

    @Override // com.umeng.analytics.pro.cq
    public java.lang.String z() throws com.umeng.analytics.pro.bx {
            r5 = this;
            int r0 = r5.w()
            com.umeng.analytics.pro.de r1 = r5.g
            int r1 = r1.h()
            if (r1 < r0) goto L2d
            java.lang.String r1 = new java.lang.String     // Catch: java.io.UnsupportedEncodingException -> L25
            com.umeng.analytics.pro.de r2 = r5.g     // Catch: java.io.UnsupportedEncodingException -> L25
            byte[] r2 = r2.f()     // Catch: java.io.UnsupportedEncodingException -> L25
            com.umeng.analytics.pro.de r3 = r5.g     // Catch: java.io.UnsupportedEncodingException -> L25
            int r3 = r3.g()     // Catch: java.io.UnsupportedEncodingException -> L25
            java.lang.String r4 = "UTF-8"
            r1.<init>(r2, r3, r0, r4)     // Catch: java.io.UnsupportedEncodingException -> L25
            com.umeng.analytics.pro.de r2 = r5.g     // Catch: java.io.UnsupportedEncodingException -> L25
            r2.a(r0)     // Catch: java.io.UnsupportedEncodingException -> L25
            return r1
        L25:
            com.umeng.analytics.pro.bx r0 = new com.umeng.analytics.pro.bx
            java.lang.String r1 = "JVM DOES NOT SUPPORT UTF-8"
            r0.<init>(r1)
            throw r0
        L2d:
            java.lang.String r0 = r5.b(r0)
            return r0
    }
}
