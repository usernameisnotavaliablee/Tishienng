package kotlin.reflect.jvm.internal.impl.protobuf;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class CodedOutputStream {
    private final byte[] a;
    private final int b;
    private int c;
    private int d;
    private final java.io.OutputStream e;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class OutOfSpaceException extends java.io.IOException {
        OutOfSpaceException() {
                r1 = this;
                java.lang.String r0 = "CodedOutputStream was writing to a flat byte array and ran out of space."
                r1.<init>(r0)
                return
        }
    }

    private CodedOutputStream(java.io.OutputStream r2, byte[] r3) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.d = r0
            r1.e = r2
            r1.a = r3
            r1.c = r0
            int r2 = r3.length
            r1.b = r2
            return
    }

    private CodedOutputStream(byte[] r2, int r3, int r4) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.d = r0
            r0 = 0
            r1.e = r0
            r1.a = r2
            r1.c = r3
            int r3 = r3 + r4
            r1.b = r3
            return
    }

    public static int A(int r0) {
            int r0 = H(r0)
            int r0 = w(r0)
            return r0
    }

    public static int B(int r0, long r1) {
            int r0 = E(r0)
            int r1 = C(r1)
            int r0 = r0 + r1
            return r0
    }

    public static int C(long r0) {
            long r0 = I(r0)
            int r0 = x(r0)
            return r0
    }

    public static int D(java.lang.String r2) {
            java.lang.String r0 = "UTF-8"
            byte[] r2 = r2.getBytes(r0)     // Catch: java.io.UnsupportedEncodingException -> Le
            int r0 = r2.length     // Catch: java.io.UnsupportedEncodingException -> Le
            int r0 = w(r0)     // Catch: java.io.UnsupportedEncodingException -> Le
            int r2 = r2.length     // Catch: java.io.UnsupportedEncodingException -> Le
            int r0 = r0 + r2
            return r0
        Le:
            r2 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "UTF-8 not supported."
            r0.<init>(r1, r2)
            throw r0
    }

    public static int E(int r1) {
            r0 = 0
            int r1 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.c(r1, r0)
            int r1 = w(r1)
            return r1
    }

    public static int F(int r0) {
            int r0 = w(r0)
            return r0
    }

    public static int G(long r0) {
            int r0 = x(r0)
            return r0
    }

    public static int H(int r1) {
            int r0 = r1 << 1
            int r1 = r1 >> 31
            r1 = r1 ^ r0
            return r1
    }

    public static long I(long r3) {
            r0 = 1
            long r0 = r3 << r0
            r2 = 63
            long r3 = r3 >> r2
            long r3 = r3 ^ r0
            return r3
    }

    public static kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream K(java.io.OutputStream r1, int r2) {
            kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream r0 = new kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream
            byte[] r2 = new byte[r2]
            r0.<init>(r1, r2)
            return r0
    }

    public static kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream L(byte[] r2) {
            r0 = 0
            int r1 = r2.length
            kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream r2 = M(r2, r0, r1)
            return r2
    }

    public static kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream M(byte[] r1, int r2, int r3) {
            kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream r0 = new kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream
            r0.<init>(r1, r2, r3)
            return r0
    }

    private void N() throws java.io.IOException {
            r4 = this;
            java.io.OutputStream r0 = r4.e
            if (r0 == 0) goto Lf
            byte[] r1 = r4.a
            int r2 = r4.c
            r3 = 0
            r0.write(r1, r3, r2)
            r4.c = r3
            return
        Lf:
            kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream$OutOfSpaceException r0 = new kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream$OutOfSpaceException
            r0.<init>()
            throw r0
    }

    public static int b(int r0, boolean r1) {
            int r0 = E(r0)
            int r1 = c(r1)
            int r0 = r0 + r1
            return r0
    }

    public static int c(boolean r0) {
            r0 = 1
            return r0
    }

    public static int d(byte[] r1) {
            int r0 = r1.length
            int r0 = w(r0)
            int r1 = r1.length
            int r0 = r0 + r1
            return r0
    }

    public static int e(int r0, kotlin.reflect.jvm.internal.impl.protobuf.d r1) {
            int r0 = E(r0)
            int r1 = f(r1)
            int r0 = r0 + r1
            return r0
    }

    public static int f(kotlin.reflect.jvm.internal.impl.protobuf.d r1) {
            int r0 = r1.size()
            int r0 = w(r0)
            int r1 = r1.size()
            int r0 = r0 + r1
            return r0
    }

    public static int g(int r0, double r1) {
            int r0 = E(r0)
            int r1 = h(r1)
            int r0 = r0 + r1
            return r0
    }

    public static int h(double r0) {
            r0 = 8
            return r0
    }

    public static int i(int r0, int r1) {
            int r0 = E(r0)
            int r1 = j(r1)
            int r0 = r0 + r1
            return r0
    }

    public static int j(int r0) {
            int r0 = q(r0)
            return r0
    }

    public static int k(int r0) {
            r0 = 4
            return r0
    }

    public static int l(long r0) {
            r0 = 8
            return r0
    }

    public static int m(int r0, float r1) {
            int r0 = E(r0)
            int r1 = n(r1)
            int r0 = r0 + r1
            return r0
    }

    public static int n(float r0) {
            r0 = 4
            return r0
    }

    public static int o(kotlin.reflect.jvm.internal.impl.protobuf.n r0) {
            int r0 = r0.getSerializedSize()
            return r0
    }

    public static int p(int r0, int r1) {
            int r0 = E(r0)
            int r1 = q(r1)
            int r0 = r0 + r1
            return r0
    }

    public static int q(int r0) {
            if (r0 < 0) goto L7
            int r0 = w(r0)
            return r0
        L7:
            r0 = 10
            return r0
    }

    public static int r(long r0) {
            int r0 = x(r0)
            return r0
    }

    public static int s(kotlin.reflect.jvm.internal.impl.protobuf.j r1) {
            int r1 = r1.b()
            int r0 = w(r1)
            int r0 = r0 + r1
            return r0
    }

    public static int t(int r0, kotlin.reflect.jvm.internal.impl.protobuf.n r1) {
            int r0 = E(r0)
            int r1 = u(r1)
            int r0 = r0 + r1
            return r0
    }

    public static int u(kotlin.reflect.jvm.internal.impl.protobuf.n r1) {
            int r1 = r1.getSerializedSize()
            int r0 = w(r1)
            int r0 = r0 + r1
            return r0
    }

    static int v(int r1) {
            r0 = 4096(0x1000, float:5.74E-42)
            if (r1 <= r0) goto L5
            return r0
        L5:
            return r1
    }

    public static int w(int r1) {
            r0 = r1 & (-128(0xffffffffffffff80, float:NaN))
            if (r0 != 0) goto L6
            r1 = 1
            return r1
        L6:
            r0 = r1 & (-16384(0xffffffffffffc000, float:NaN))
            if (r0 != 0) goto Lc
            r1 = 2
            return r1
        Lc:
            r0 = -2097152(0xffffffffffe00000, float:NaN)
            r0 = r0 & r1
            if (r0 != 0) goto L13
            r1 = 3
            return r1
        L13:
            r0 = -268435456(0xfffffffff0000000, float:-1.5845633E29)
            r1 = r1 & r0
            if (r1 != 0) goto L1a
            r1 = 4
            return r1
        L1a:
            r1 = 5
            return r1
    }

    public static int x(long r5) {
            r0 = -128(0xffffffffffffff80, double:NaN)
            long r0 = r0 & r5
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto Lb
            r5 = 1
            return r5
        Lb:
            r0 = -16384(0xffffffffffffc000, double:NaN)
            long r0 = r0 & r5
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L14
            r5 = 2
            return r5
        L14:
            r0 = -2097152(0xffffffffffe00000, double:NaN)
            long r0 = r0 & r5
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L1e
            r5 = 3
            return r5
        L1e:
            r0 = -268435456(0xfffffffff0000000, double:NaN)
            long r0 = r0 & r5
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L28
            r5 = 4
            return r5
        L28:
            r0 = -34359738368(0xfffffff800000000, double:NaN)
            long r0 = r0 & r5
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L34
            r5 = 5
            return r5
        L34:
            r0 = -4398046511104(0xfffffc0000000000, double:NaN)
            long r0 = r0 & r5
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L40
            r5 = 6
            return r5
        L40:
            r0 = -562949953421312(0xfffe000000000000, double:NaN)
            long r0 = r0 & r5
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L49
            r5 = 7
            return r5
        L49:
            r0 = -72057594037927936(0xff00000000000000, double:-5.486124068793689E303)
            long r0 = r0 & r5
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L53
            r5 = 8
            return r5
        L53:
            r0 = -9223372036854775808
            long r5 = r5 & r0
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r0 != 0) goto L5d
            r5 = 9
            return r5
        L5d:
            r5 = 10
            return r5
    }

    public static int y(int r0) {
            r0 = 4
            return r0
    }

    public static int z(long r0) {
            r0 = 8
            return r0
    }

    public void A0(int r1, int r2) throws java.io.IOException {
            r0 = this;
            int r1 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.c(r1, r2)
            r0.s0(r1)
            return
    }

    public void B0(int r2, int r3) throws java.io.IOException {
            r1 = this;
            r0 = 0
            r1.A0(r2, r0)
            r1.C0(r3)
            return
    }

    public void C0(int r1) throws java.io.IOException {
            r0 = this;
            r0.s0(r1)
            return
    }

    public void D0(long r1) throws java.io.IOException {
            r0 = this;
            r0.t0(r1)
            return
    }

    public void J() throws java.io.IOException {
            r1 = this;
            java.io.OutputStream r0 = r1.e
            if (r0 == 0) goto L7
            r1.N()
        L7:
            return
    }

    public int O() {
            r2 = this;
            java.io.OutputStream r0 = r2.e
            if (r0 != 0) goto La
            int r0 = r2.b
            int r1 = r2.c
            int r0 = r0 - r1
            return r0
        La:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array."
            r0.<init>(r1)
            throw r0
    }

    public void P(int r2, boolean r3) throws java.io.IOException {
            r1 = this;
            r0 = 0
            r1.A0(r2, r0)
            r1.Q(r3)
            return
    }

    public void Q(boolean r1) throws java.io.IOException {
            r0 = this;
            r0.l0(r1)
            return
    }

    public void R(byte[] r2) throws java.io.IOException {
            r1 = this;
            int r0 = r2.length
            r1.s0(r0)
            r1.o0(r2)
            return
    }

    public void S(int r2, kotlin.reflect.jvm.internal.impl.protobuf.d r3) throws java.io.IOException {
            r1 = this;
            r0 = 2
            r1.A0(r2, r0)
            r1.T(r3)
            return
    }

    public void T(kotlin.reflect.jvm.internal.impl.protobuf.d r2) throws java.io.IOException {
            r1 = this;
            int r0 = r2.size()
            r1.s0(r0)
            r1.m0(r2)
            return
    }

    public void U(int r2, double r3) throws java.io.IOException {
            r1 = this;
            r0 = 1
            r1.A0(r2, r0)
            r1.V(r3)
            return
    }

    public void V(double r1) throws java.io.IOException {
            r0 = this;
            long r1 = java.lang.Double.doubleToRawLongBits(r1)
            r0.r0(r1)
            return
    }

    public void W(int r2, int r3) throws java.io.IOException {
            r1 = this;
            r0 = 0
            r1.A0(r2, r0)
            r1.X(r3)
            return
    }

    public void X(int r1) throws java.io.IOException {
            r0 = this;
            r0.f0(r1)
            return
    }

    public void Y(int r1) throws java.io.IOException {
            r0 = this;
            r0.q0(r1)
            return
    }

    public void Z(long r1) throws java.io.IOException {
            r0 = this;
            r0.r0(r1)
            return
    }

    public void a() {
            r2 = this;
            int r0 = r2.O()
            if (r0 != 0) goto L7
            return
        L7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Did not write as much data as expected."
            r0.<init>(r1)
            throw r0
    }

    public void a0(int r2, float r3) throws java.io.IOException {
            r1 = this;
            r0 = 5
            r1.A0(r2, r0)
            r1.b0(r3)
            return
    }

    public void b0(float r1) throws java.io.IOException {
            r0 = this;
            int r1 = java.lang.Float.floatToRawIntBits(r1)
            r0.q0(r1)
            return
    }

    public void c0(int r2, kotlin.reflect.jvm.internal.impl.protobuf.n r3) throws java.io.IOException {
            r1 = this;
            r0 = 3
            r1.A0(r2, r0)
            r1.d0(r3)
            r3 = 4
            r1.A0(r2, r3)
            return
    }

    public void d0(kotlin.reflect.jvm.internal.impl.protobuf.n r1) throws java.io.IOException {
            r0 = this;
            r1.writeTo(r0)
            return
    }

    public void e0(int r2, int r3) throws java.io.IOException {
            r1 = this;
            r0 = 0
            r1.A0(r2, r0)
            r1.f0(r3)
            return
    }

    public void f0(int r3) throws java.io.IOException {
            r2 = this;
            if (r3 < 0) goto L6
            r2.s0(r3)
            return
        L6:
            long r0 = (long) r3
            r2.t0(r0)
            return
    }

    public void g0(long r1) throws java.io.IOException {
            r0 = this;
            r0.t0(r1)
            return
    }

    public void h0(int r2, kotlin.reflect.jvm.internal.impl.protobuf.n r3) throws java.io.IOException {
            r1 = this;
            r0 = 2
            r1.A0(r2, r0)
            r1.i0(r3)
            return
    }

    public void i0(kotlin.reflect.jvm.internal.impl.protobuf.n r2) throws java.io.IOException {
            r1 = this;
            int r0 = r2.getSerializedSize()
            r1.s0(r0)
            r2.writeTo(r1)
            return
    }

    public void j0(int r4, kotlin.reflect.jvm.internal.impl.protobuf.n r5) throws java.io.IOException {
            r3 = this;
            r0 = 1
            r1 = 3
            r3.A0(r0, r1)
            r2 = 2
            r3.B0(r2, r4)
            r3.h0(r1, r5)
            r4 = 4
            r3.A0(r0, r4)
            return
    }

    public void k0(byte r4) throws java.io.IOException {
            r3 = this;
            int r0 = r3.c
            int r1 = r3.b
            if (r0 != r1) goto L9
            r3.N()
        L9:
            byte[] r0 = r3.a
            int r1 = r3.c
            int r2 = r1 + 1
            r3.c = r2
            r0[r1] = r4
            int r4 = r3.d
            int r4 = r4 + 1
            r3.d = r4
            return
    }

    public void l0(int r1) throws java.io.IOException {
            r0 = this;
            byte r1 = (byte) r1
            r0.k0(r1)
            return
    }

    public void m0(kotlin.reflect.jvm.internal.impl.protobuf.d r3) throws java.io.IOException {
            r2 = this;
            r0 = 0
            int r1 = r3.size()
            r2.n0(r3, r0, r1)
            return
    }

    public void n0(kotlin.reflect.jvm.internal.impl.protobuf.d r4, int r5, int r6) throws java.io.IOException {
            r3 = this;
            int r0 = r3.b
            int r1 = r3.c
            int r2 = r0 - r1
            if (r2 < r6) goto L18
            byte[] r0 = r3.a
            r4.m(r0, r5, r1, r6)
            int r4 = r3.c
            int r4 = r4 + r6
            r3.c = r4
            int r4 = r3.d
            int r4 = r4 + r6
            r3.d = r4
            return
        L18:
            int r0 = r0 - r1
            byte[] r2 = r3.a
            r4.m(r2, r5, r1, r0)
            int r5 = r5 + r0
            int r6 = r6 - r0
            int r1 = r3.b
            r3.c = r1
            int r1 = r3.d
            int r1 = r1 + r0
            r3.d = r1
            r3.N()
            int r0 = r3.b
            if (r6 > r0) goto L39
            byte[] r0 = r3.a
            r1 = 0
            r4.m(r0, r5, r1, r6)
            r3.c = r6
            goto L3e
        L39:
            java.io.OutputStream r0 = r3.e
            r4.A(r0, r5, r6)
        L3e:
            int r4 = r3.d
            int r4 = r4 + r6
            r3.d = r4
            return
    }

    public void o0(byte[] r3) throws java.io.IOException {
            r2 = this;
            r0 = 0
            int r1 = r3.length
            r2.p0(r3, r0, r1)
            return
    }

    public void p0(byte[] r4, int r5, int r6) throws java.io.IOException {
            r3 = this;
            int r0 = r3.b
            int r1 = r3.c
            int r2 = r0 - r1
            if (r2 < r6) goto L18
            byte[] r0 = r3.a
            java.lang.System.arraycopy(r4, r5, r0, r1, r6)
            int r4 = r3.c
            int r4 = r4 + r6
            r3.c = r4
            int r4 = r3.d
            int r4 = r4 + r6
            r3.d = r4
            return
        L18:
            int r0 = r0 - r1
            byte[] r2 = r3.a
            java.lang.System.arraycopy(r4, r5, r2, r1, r0)
            int r5 = r5 + r0
            int r6 = r6 - r0
            int r1 = r3.b
            r3.c = r1
            int r1 = r3.d
            int r1 = r1 + r0
            r3.d = r1
            r3.N()
            int r0 = r3.b
            if (r6 > r0) goto L39
            byte[] r0 = r3.a
            r1 = 0
            java.lang.System.arraycopy(r4, r5, r0, r1, r6)
            r3.c = r6
            goto L3e
        L39:
            java.io.OutputStream r0 = r3.e
            r0.write(r4, r5, r6)
        L3e:
            int r4 = r3.d
            int r4 = r4 + r6
            r3.d = r4
            return
    }

    public void q0(int r2) throws java.io.IOException {
            r1 = this;
            r0 = r2 & 255(0xff, float:3.57E-43)
            r1.l0(r0)
            int r0 = r2 >> 8
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1.l0(r0)
            int r0 = r2 >> 16
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1.l0(r0)
            int r2 = r2 >> 24
            r2 = r2 & 255(0xff, float:3.57E-43)
            r1.l0(r2)
            return
    }

    public void r0(long r3) throws java.io.IOException {
            r2 = this;
            int r0 = (int) r3
            r0 = r0 & 255(0xff, float:3.57E-43)
            r2.l0(r0)
            r0 = 8
            long r0 = r3 >> r0
            int r1 = (int) r0
            r0 = r1 & 255(0xff, float:3.57E-43)
            r2.l0(r0)
            r0 = 16
            long r0 = r3 >> r0
            int r1 = (int) r0
            r0 = r1 & 255(0xff, float:3.57E-43)
            r2.l0(r0)
            r0 = 24
            long r0 = r3 >> r0
            int r1 = (int) r0
            r0 = r1 & 255(0xff, float:3.57E-43)
            r2.l0(r0)
            r0 = 32
            long r0 = r3 >> r0
            int r1 = (int) r0
            r0 = r1 & 255(0xff, float:3.57E-43)
            r2.l0(r0)
            r0 = 40
            long r0 = r3 >> r0
            int r1 = (int) r0
            r0 = r1 & 255(0xff, float:3.57E-43)
            r2.l0(r0)
            r0 = 48
            long r0 = r3 >> r0
            int r1 = (int) r0
            r0 = r1 & 255(0xff, float:3.57E-43)
            r2.l0(r0)
            r0 = 56
            long r3 = r3 >> r0
            int r4 = (int) r3
            r3 = r4 & 255(0xff, float:3.57E-43)
            r2.l0(r3)
            return
    }

    public void s0(int r2) throws java.io.IOException {
            r1 = this;
        L0:
            r0 = r2 & (-128(0xffffffffffffff80, float:NaN))
            if (r0 != 0) goto L8
            r1.l0(r2)
            return
        L8:
            r0 = r2 & 127(0x7f, float:1.78E-43)
            r0 = r0 | 128(0x80, float:1.8E-43)
            r1.l0(r0)
            int r2 = r2 >>> 7
            goto L0
    }

    public void t0(long r6) throws java.io.IOException {
            r5 = this;
        L0:
            r0 = -128(0xffffffffffffff80, double:NaN)
            long r0 = r0 & r6
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto Le
            int r7 = (int) r6
            r5.l0(r7)
            return
        Le:
            int r0 = (int) r6
            r0 = r0 & 127(0x7f, float:1.78E-43)
            r0 = r0 | 128(0x80, float:1.8E-43)
            r5.l0(r0)
            r0 = 7
            long r6 = r6 >>> r0
            goto L0
    }

    public void u0(int r1) throws java.io.IOException {
            r0 = this;
            r0.q0(r1)
            return
    }

    public void v0(long r1) throws java.io.IOException {
            r0 = this;
            r0.r0(r1)
            return
    }

    public void w0(int r1) throws java.io.IOException {
            r0 = this;
            int r1 = H(r1)
            r0.s0(r1)
            return
    }

    public void x0(int r2, long r3) throws java.io.IOException {
            r1 = this;
            r0 = 0
            r1.A0(r2, r0)
            r1.y0(r3)
            return
    }

    public void y0(long r1) throws java.io.IOException {
            r0 = this;
            long r1 = I(r1)
            r0.t0(r1)
            return
    }

    public void z0(java.lang.String r2) throws java.io.IOException {
            r1 = this;
            java.lang.String r0 = "UTF-8"
            byte[] r2 = r2.getBytes(r0)
            int r0 = r2.length
            r1.s0(r0)
            r1.o0(r2)
            return
    }
}
