package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class x9 {
    static final java.nio.charset.Charset o = null;
    static final /* synthetic */ boolean p = true;
    java.nio.ByteBuffer a;

    /* renamed from: b, reason: collision with root package name */
    int f4203b;

    /* renamed from: c, reason: collision with root package name */
    int f4204c;

    /* renamed from: d, reason: collision with root package name */
    int[] f4205d;

    /* renamed from: e, reason: collision with root package name */
    int f4206e;

    /* renamed from: f, reason: collision with root package name */
    boolean f4207f;

    /* renamed from: g, reason: collision with root package name */
    boolean f4208g;

    /* renamed from: h, reason: collision with root package name */
    int f4209h;

    /* renamed from: i, reason: collision with root package name */
    int[] f4210i;

    /* renamed from: j, reason: collision with root package name */
    int f4211j;

    /* renamed from: k, reason: collision with root package name */
    int f4212k;
    boolean l;
    java.nio.charset.CharsetEncoder m;
    java.nio.ByteBuffer n;

    static {
            java.lang.String r0 = "UTF-8"
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)
            com.amap.api.col.p0003l.x9.o = r0
            return
    }

    private x9() {
            r2 = this;
            r2.<init>()
            r0 = 1
            r2.f4204c = r0
            r0 = 0
            r2.f4205d = r0
            r0 = 0
            r2.f4206e = r0
            r2.f4207f = r0
            r2.f4208g = r0
            r1 = 16
            int[] r1 = new int[r1]
            r2.f4210i = r1
            r2.f4211j = r0
            r2.f4212k = r0
            r2.l = r0
            java.nio.charset.Charset r0 = com.amap.api.col.p0003l.x9.o
            java.nio.charset.CharsetEncoder r0 = r0.newEncoder()
            r2.m = r0
            r0 = 1024(0x400, float:1.435E-42)
            r2.f4203b = r0
            java.nio.ByteBuffer r0 = B(r0)
            r2.a = r0
            return
    }

    public x9(java.nio.ByteBuffer r3) {
            r2 = this;
            r2.<init>()
            r0 = 1
            r2.f4204c = r0
            r0 = 0
            r2.f4205d = r0
            r0 = 0
            r2.f4206e = r0
            r2.f4207f = r0
            r2.f4208g = r0
            r1 = 16
            int[] r1 = new int[r1]
            r2.f4210i = r1
            r2.f4211j = r0
            r2.f4212k = r0
            r2.l = r0
            java.nio.charset.Charset r0 = com.amap.api.col.p0003l.x9.o
            java.nio.charset.CharsetEncoder r0 = r0.newEncoder()
            r2.m = r0
            r2.c(r3)
            return
    }

    private int A() {
            r2 = this;
            java.nio.ByteBuffer r0 = r2.a
            int r0 = r0.capacity()
            int r1 = r2.f4203b
            int r0 = r0 - r1
            return r0
    }

    private static java.nio.ByteBuffer B(int r1) {
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r1)
            java.nio.ByteOrder r0 = java.nio.ByteOrder.LITTLE_ENDIAN
            r1.order(r0)
            return r1
    }

    private byte[] C(int r2, int r3) {
            r1 = this;
            r1.D()
            byte[] r3 = new byte[r3]
            java.nio.ByteBuffer r0 = r1.a
            r0.position(r2)
            java.nio.ByteBuffer r2 = r1.a
            r2.get(r3)
            return r3
    }

    private void D() {
            r2 = this;
            boolean r0 = r2.f4208g
            if (r0 == 0) goto L5
            return
        L5:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.String r1 = "FlatBuffers: you can only access the serialized buffer after it has been finished by FlatBufferBuilder.finish()."
            r0.<init>(r1)
            throw r0
    }

    private void E(int r5) {
            r4 = this;
            r0 = 0
            r1 = 0
        L2:
            if (r1 >= r5) goto L12
            java.nio.ByteBuffer r2 = r4.a
            int r3 = r4.f4203b
            int r3 = r3 + (-1)
            r4.f4203b = r3
            r2.put(r3, r0)
            int r1 = r1 + 1
            goto L2
        L12:
            return
    }

    private void F() {
            r2 = this;
            boolean r0 = r2.f4207f
            if (r0 != 0) goto L5
            return
        L5:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.String r1 = "FlatBuffers: object serialization must not be nested."
            r0.<init>(r1)
            throw r0
    }

    private void G(int r3) {
            r2 = this;
            java.nio.ByteBuffer r0 = r2.a
            int r1 = r2.f4203b
            int r1 = r1 + (-4)
            r2.f4203b = r1
            r0.putInt(r1, r3)
            return
    }

    private void H(int r3) {
            r2 = this;
            r0 = 4
            r1 = 0
            r2.x(r0, r1)
            r2.G(r3)
            return
    }

    private void I(int r3) {
            r2 = this;
            int[] r0 = r2.f4205d
            int r1 = r2.A()
            r0[r3] = r1
            return
    }

    private void k(long r3) {
            r2 = this;
            java.nio.ByteBuffer r0 = r2.a
            int r1 = r2.f4203b
            int r1 = r1 + (-8)
            r2.f4203b = r1
            r0.putLong(r1, r3)
            return
    }

    private void l(short r3) {
            r2 = this;
            java.nio.ByteBuffer r0 = r2.a
            int r1 = r2.f4203b
            int r1 = r1 + (-2)
            r2.f4203b = r1
            r0.putShort(r1, r3)
            return
    }

    private static java.nio.ByteBuffer o(java.nio.ByteBuffer r3) {
            int r0 = r3.capacity()
            r1 = -1073741824(0xffffffffc0000000, float:-2.0)
            r1 = r1 & r0
            if (r1 != 0) goto L1b
            int r1 = r0 << 1
            r2 = 0
            r3.position(r2)
            java.nio.ByteBuffer r2 = B(r1)
            int r1 = r1 - r0
            r2.position(r1)
            r2.put(r3)
            return r2
        L1b:
            java.lang.AssertionError r3 = new java.lang.AssertionError
            java.lang.String r0 = "FlatBuffers: cannot grow buffer beyond 2 gigabytes."
            r3.<init>(r0)
            throw r3
    }

    private void p(byte r3) {
            r2 = this;
            java.nio.ByteBuffer r0 = r2.a
            int r1 = r2.f4203b
            int r1 = r1 + (-1)
            r2.f4203b = r1
            r0.put(r1, r3)
            return
    }

    private void s(long r3) {
            r2 = this;
            r0 = 8
            r1 = 0
            r2.x(r0, r1)
            r2.k(r3)
            return
    }

    private void t(short r3) {
            r2 = this;
            r0 = 2
            r1 = 0
            r2.x(r0, r1)
            r2.l(r3)
            return
    }

    private void u(boolean r3) {
            r2 = this;
            java.nio.ByteBuffer r0 = r2.a
            int r1 = r2.f4203b
            int r1 = r1 + (-1)
            r2.f4203b = r1
            byte r3 = (byte) r3
            r0.put(r1, r3)
            return
    }

    private int v(java.nio.ByteBuffer r4) {
            r3 = this;
            int r0 = r4.remaining()
            r1 = 0
            r3.d(r1)
            r1 = 1
            r3.h(r1, r0, r1)
            java.nio.ByteBuffer r1 = r3.a
            int r2 = r3.f4203b
            int r2 = r2 - r0
            r3.f4203b = r2
            r1.position(r2)
            java.nio.ByteBuffer r0 = r3.a
            r0.put(r4)
            int r4 = r3.a()
            return r4
    }

    private void x(int r5, int r6) {
            r4 = this;
            int r0 = r4.f4204c
            if (r5 <= r0) goto L6
            r4.f4204c = r5
        L6:
            java.nio.ByteBuffer r0 = r4.a
            int r0 = r0.capacity()
            int r1 = r4.f4203b
            int r0 = r0 - r1
            int r0 = r0 + r6
            int r0 = ~r0
            int r0 = r0 + 1
            int r1 = r5 + (-1)
            r0 = r0 & r1
        L16:
            int r1 = r4.f4203b
            int r2 = r0 + r5
            int r2 = r2 + r6
            if (r1 >= r2) goto L36
            java.nio.ByteBuffer r1 = r4.a
            int r1 = r1.capacity()
            java.nio.ByteBuffer r2 = r4.a
            java.nio.ByteBuffer r2 = o(r2)
            r4.a = r2
            int r3 = r4.f4203b
            int r2 = r2.capacity()
            int r2 = r2 - r1
            int r3 = r3 + r2
            r4.f4203b = r3
            goto L16
        L36:
            r4.E(r0)
            return
    }

    private void y(boolean r3) {
            r2 = this;
            r0 = 1
            r1 = 0
            r2.x(r0, r1)
            r2.u(r3)
            return
    }

    public final int a() {
            r2 = this;
            boolean r0 = r2.f4207f
            if (r0 == 0) goto L11
            r0 = 0
            r2.f4207f = r0
            int r0 = r2.f4212k
            r2.G(r0)
            int r0 = r2.A()
            return r0
        L11:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.String r1 = "FlatBuffers: endVector called without startVector"
            r0.<init>(r1)
            throw r0
    }

    public int b(java.lang.CharSequence r4) {
            r3 = this;
            int r0 = r4.length()
            float r0 = (float) r0
            java.nio.charset.CharsetEncoder r1 = r3.m
            float r1 = r1.maxBytesPerChar()
            float r0 = r0 * r1
            int r0 = (int) r0
            java.nio.ByteBuffer r1 = r3.n
            if (r1 == 0) goto L18
            int r1 = r1.capacity()
            if (r1 >= r0) goto L24
        L18:
            r1 = 128(0x80, float:1.8E-43)
            int r0 = java.lang.Math.max(r1, r0)
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            r3.n = r0
        L24:
            java.nio.ByteBuffer r0 = r3.n
            r0.clear()
            boolean r0 = r4 instanceof java.nio.CharBuffer
            if (r0 == 0) goto L30
            java.nio.CharBuffer r4 = (java.nio.CharBuffer) r4
            goto L34
        L30:
            java.nio.CharBuffer r4 = java.nio.CharBuffer.wrap(r4)
        L34:
            java.nio.charset.CharsetEncoder r0 = r3.m
            java.nio.ByteBuffer r1 = r3.n
            r2 = 1
            java.nio.charset.CoderResult r4 = r0.encode(r4, r1, r2)
            boolean r0 = r4.isError()
            if (r0 == 0) goto L4e
            r4.throwException()     // Catch: java.nio.charset.CharacterCodingException -> L47
            goto L4e
        L47:
            r4 = move-exception
            java.lang.Error r0 = new java.lang.Error
            r0.<init>(r4)
            throw r0
        L4e:
            java.nio.ByteBuffer r4 = r3.n
            r4.flip()
            java.nio.ByteBuffer r4 = r3.n
            int r4 = r3.v(r4)
            return r4
    }

    public final com.amap.api.col.p0003l.x9 c(java.nio.ByteBuffer r2) {
            r1 = this;
            r1.a = r2
            r2.clear()
            java.nio.ByteBuffer r2 = r1.a
            java.nio.ByteOrder r0 = java.nio.ByteOrder.LITTLE_ENDIAN
            r2.order(r0)
            r2 = 1
            r1.f4204c = r2
            java.nio.ByteBuffer r2 = r1.a
            int r2 = r2.capacity()
            r1.f4203b = r2
            r2 = 0
            r1.f4206e = r2
            r1.f4207f = r2
            r1.f4208g = r2
            r1.f4209h = r2
            r1.f4211j = r2
            r1.f4212k = r2
            return r1
    }

    public final void d(byte r3) {
            r2 = this;
            r0 = 1
            r1 = 0
            r2.x(r0, r1)
            r2.p(r3)
            return
    }

    public final void e(int r3) {
            r2 = this;
            r0 = 0
            r1 = 4
            r2.x(r1, r0)
            boolean r0 = com.amap.api.col.p0003l.x9.p
            if (r0 != 0) goto L16
            int r0 = r2.A()
            if (r3 > r0) goto L10
            goto L16
        L10:
            java.lang.AssertionError r3 = new java.lang.AssertionError
            r3.<init>()
            throw r3
        L16:
            int r0 = r2.A()
            int r0 = r0 - r3
            int r0 = r0 + r1
            r2.G(r0)
            return
    }

    public final void f(int r2, byte r3) {
            r1 = this;
            boolean r0 = r1.l
            if (r0 != 0) goto L8
            if (r3 == 0) goto L7
            goto L8
        L7:
            return
        L8:
            r1.d(r3)
            r1.I(r2)
            return
    }

    public final void g(int r2, int r3) {
            r1 = this;
            boolean r0 = r1.l
            if (r0 != 0) goto L8
            if (r3 == 0) goto L7
            goto L8
        L7:
            return
        L8:
            r1.H(r3)
            r1.I(r2)
            return
    }

    public final void h(int r1, int r2, int r3) {
            r0 = this;
            r0.F()
            r0.f4212k = r2
            int r1 = r1 * r2
            r2 = 4
            r0.x(r2, r1)
            r0.x(r3, r1)
            r1 = 1
            r0.f4207f = r1
            return
    }

    public final void i(int r4, long r5) {
            r3 = this;
            boolean r0 = r3.l
            if (r0 != 0) goto Lc
            r0 = 0
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 == 0) goto Lb
            goto Lc
        Lb:
            return
        Lc:
            r3.s(r5)
            r3.I(r4)
            return
    }

    public final void j(int r2, short r3) {
            r1 = this;
            boolean r0 = r1.l
            if (r0 != 0) goto L8
            if (r3 == 0) goto L7
            goto L8
        L7:
            return
        L8:
            r1.t(r3)
            r1.I(r2)
            return
    }

    public final void m(boolean r2) {
            r1 = this;
            boolean r0 = r1.l
            if (r0 != 0) goto L8
            if (r2 == 0) goto L7
            goto L8
        L7:
            return
        L8:
            r1.y(r2)
            r2 = 0
            r1.I(r2)
            return
    }

    public final int n() {
            r11 = this;
            int[] r0 = r11.f4205d
            if (r0 == 0) goto Lbb
            boolean r0 = r11.f4207f
            if (r0 == 0) goto Lbb
            r0 = 0
            r11.H(r0)
            int r1 = r11.A()
            int r2 = r11.f4206e
            int r2 = r2 + (-1)
        L14:
            if (r2 < 0) goto L27
            int[] r3 = r11.f4205d
            r3 = r3[r2]
            if (r3 == 0) goto L1f
            int r3 = r1 - r3
            goto L20
        L1f:
            r3 = 0
        L20:
            short r3 = (short) r3
            r11.t(r3)
            int r2 = r2 + (-1)
            goto L14
        L27:
            int r2 = r11.f4209h
            int r2 = r1 - r2
            short r2 = (short) r2
            r11.t(r2)
            int r2 = r11.f4206e
            r3 = 2
            int r2 = r2 + r3
            int r2 = r2 * 2
            short r2 = (short) r2
            r11.t(r2)
            r2 = 0
        L3a:
            int r4 = r11.f4211j
            if (r2 >= r4) goto L79
            java.nio.ByteBuffer r4 = r11.a
            int r4 = r4.capacity()
            int[] r5 = r11.f4210i
            r5 = r5[r2]
            int r4 = r4 - r5
            int r5 = r11.f4203b
            java.nio.ByteBuffer r6 = r11.a
            short r6 = r6.getShort(r4)
            java.nio.ByteBuffer r7 = r11.a
            short r7 = r7.getShort(r5)
            if (r6 != r7) goto L76
            r7 = 2
        L5a:
            if (r7 >= r6) goto L71
            java.nio.ByteBuffer r8 = r11.a
            int r9 = r4 + r7
            short r8 = r8.getShort(r9)
            java.nio.ByteBuffer r9 = r11.a
            int r10 = r5 + r7
            short r9 = r9.getShort(r10)
            if (r8 != r9) goto L76
            int r7 = r7 + 2
            goto L5a
        L71:
            int[] r4 = r11.f4210i
            r2 = r4[r2]
            goto L7a
        L76:
            int r2 = r2 + 1
            goto L3a
        L79:
            r2 = 0
        L7a:
            if (r2 == 0) goto L8c
            java.nio.ByteBuffer r3 = r11.a
            int r3 = r3.capacity()
            int r3 = r3 - r1
            r11.f4203b = r3
            java.nio.ByteBuffer r4 = r11.a
            int r2 = r2 - r1
            r4.putInt(r3, r2)
            goto Lb8
        L8c:
            int r2 = r11.f4211j
            int[] r4 = r11.f4210i
            int r5 = r4.length
            if (r2 != r5) goto L9b
            int r2 = r2 * 2
            int[] r2 = java.util.Arrays.copyOf(r4, r2)
            r11.f4210i = r2
        L9b:
            int[] r2 = r11.f4210i
            int r3 = r11.f4211j
            int r4 = r3 + 1
            r11.f4211j = r4
            int r4 = r11.A()
            r2[r3] = r4
            java.nio.ByteBuffer r2 = r11.a
            int r3 = r2.capacity()
            int r3 = r3 - r1
            int r4 = r11.A()
            int r4 = r4 - r1
            r2.putInt(r3, r4)
        Lb8:
            r11.f4207f = r0
            return r1
        Lbb:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.String r1 = "FlatBuffers: endObject called without startObject"
            r0.<init>(r1)
            throw r0
    }

    public final void q(int r3) {
            r2 = this;
            r2.F()
            int[] r0 = r2.f4205d
            if (r0 == 0) goto La
            int r0 = r0.length
            if (r0 >= r3) goto Le
        La:
            int[] r0 = new int[r3]
            r2.f4205d = r0
        Le:
            r2.f4206e = r3
            int[] r0 = r2.f4205d
            r1 = 0
            java.util.Arrays.fill(r0, r1, r3, r1)
            r3 = 1
            r2.f4207f = r3
            int r3 = r2.A()
            r2.f4209h = r3
            return
    }

    public final void r(int r2, int r3) {
            r1 = this;
            boolean r0 = r1.l
            if (r0 != 0) goto L8
            if (r3 == 0) goto L7
            goto L8
        L7:
            return
        L8:
            r1.e(r3)
            r1.I(r2)
            return
    }

    public final void w(int r3) {
            r2 = this;
            int r0 = r2.f4204c
            r1 = 4
            r2.x(r0, r1)
            r2.e(r3)
            java.nio.ByteBuffer r3 = r2.a
            int r0 = r2.f4203b
            r3.position(r0)
            r3 = 1
            r2.f4208g = r3
            return
    }

    public final byte[] z() {
            r3 = this;
            int r0 = r3.f4203b
            java.nio.ByteBuffer r1 = r3.a
            int r1 = r1.capacity()
            int r2 = r3.f4203b
            int r1 = r1 - r2
            byte[] r0 = r3.C(r0, r1)
            return r0
    }
}
