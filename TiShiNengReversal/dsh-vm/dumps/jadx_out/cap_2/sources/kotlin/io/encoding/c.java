package kotlin.io.encoding;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.io.encoding.ExperimentalEncodingApi
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class c extends java.io.InputStream {

    @org.jetbrains.annotations.NotNull
    private final java.io.InputStream a;

    @org.jetbrains.annotations.NotNull
    private final kotlin.io.encoding.Base64 b;
    private boolean c;
    private boolean d;

    @org.jetbrains.annotations.NotNull
    private final byte[] e;

    @org.jetbrains.annotations.NotNull
    private final byte[] f;

    @org.jetbrains.annotations.NotNull
    private final byte[] g;
    private int h;
    private int i;

    public c(@org.jetbrains.annotations.NotNull java.io.InputStream r2, @org.jetbrains.annotations.NotNull kotlin.io.encoding.Base64 r3) {
            r1 = this;
            java.lang.String r0 = "input"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "base64"
            kotlin.jvm.internal.g0.p(r3, r0)
            r1.<init>()
            r1.a = r2
            r1.b = r3
            r2 = 1
            byte[] r2 = new byte[r2]
            r1.e = r2
            r2 = 1024(0x400, float:1.435E-42)
            byte[] r3 = new byte[r2]
            r1.f = r3
            byte[] r2 = new byte[r2]
            r1.g = r2
            return
    }

    private final void a(byte[] r4, int r5, int r6) {
            r3 = this;
            byte[] r0 = r3.g
            int r1 = r3.h
            int r2 = r1 + r6
            kotlin.collections.n.v0(r0, r4, r5, r1, r2)
            int r4 = r3.h
            int r4 = r4 + r6
            r3.h = r4
            r3.f()
            return
    }

    private final int b(byte[] r7, int r8, int r9, int r10) {
            r6 = this;
            int r3 = r6.i
            kotlin.io.encoding.Base64 r0 = r6.b
            byte[] r1 = r6.f
            byte[] r2 = r6.g
            r4 = 0
            r5 = r10
            int r10 = r0.p(r1, r2, r3, r4, r5)
            int r3 = r3 + r10
            r6.i = r3
            int r10 = r6.c()
            int r9 = r9 - r8
            int r9 = java.lang.Math.min(r10, r9)
            r6.a(r7, r8, r9)
            r6.h()
            return r9
    }

    private final int c() {
            r2 = this;
            int r0 = r2.i
            int r1 = r2.h
            int r0 = r0 - r1
            return r0
    }

    private final int d(int r5) {
            r4 = this;
            byte[] r0 = r4.f
            r1 = 61
            r0[r5] = r1
            r0 = r5 & 3
            r1 = 2
            if (r0 != r1) goto L1a
            int r0 = r4.e()
            if (r0 < 0) goto L18
            byte[] r2 = r4.f
            int r3 = r5 + 1
            byte r0 = (byte) r0
            r2[r3] = r0
        L18:
            int r5 = r5 + r1
            return r5
        L1a:
            int r5 = r5 + 1
            return r5
    }

    private final int e() {
            r2 = this;
            kotlin.io.encoding.Base64 r0 = r2.b
            boolean r0 = r0.H()
            if (r0 != 0) goto Lf
            java.io.InputStream r0 = r2.a
            int r0 = r0.read()
            return r0
        Lf:
            java.io.InputStream r0 = r2.a
            int r0 = r0.read()
            r1 = -1
            if (r0 == r1) goto L1e
            boolean r1 = kotlin.io.encoding.b.e(r0)
            if (r1 == 0) goto Lf
        L1e:
            return r0
    }

    private final void f() {
            r2 = this;
            int r0 = r2.h
            int r1 = r2.i
            if (r0 != r1) goto Lb
            r0 = 0
            r2.h = r0
            r2.i = r0
        Lb:
            return
    }

    private final void h() {
            r4 = this;
            byte[] r0 = r4.g
            int r1 = r0.length
            int r2 = r4.i
            int r1 = r1 - r2
            byte[] r3 = r4.f
            int r3 = r3.length
            int r3 = r3 / 4
            int r3 = r3 * 3
            if (r3 <= r1) goto L1e
            int r1 = r4.h
            r3 = 0
            kotlin.collections.n.v0(r0, r0, r3, r1, r2)
            int r0 = r4.i
            int r1 = r4.h
            int r0 = r0 - r1
            r4.i = r0
            r4.h = r3
        L1e:
            return
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r1 = this;
            boolean r0 = r1.c
            if (r0 != 0) goto Lc
            r0 = 1
            r1.c = r0
            java.io.InputStream r0 = r1.a
            r0.close()
        Lc:
            return
    }

    @Override // java.io.InputStream
    public int read() {
            r4 = this;
            int r0 = r4.h
            int r1 = r4.i
            r2 = 1
            if (r0 >= r1) goto L14
            byte[] r1 = r4.g
            r1 = r1[r0]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r0 = r0 + r2
            r4.h = r0
            r4.f()
            return r1
        L14:
            byte[] r0 = r4.e
            r1 = 0
            int r0 = r4.read(r0, r1, r2)
            r3 = -1
            if (r0 == r3) goto L2f
            if (r0 != r2) goto L27
            byte[] r0 = r4.e
            r0 = r0[r1]
            r0 = r0 & 255(0xff, float:3.57E-43)
            return r0
        L27:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Unreachable"
            r0.<init>(r1)
            throw r0
        L2f:
            return r3
    }

    @Override // java.io.InputStream
    public int read(@org.jetbrains.annotations.NotNull byte[] r10, int r11, int r12) {
            r9 = this;
            java.lang.String r0 = "destination"
            kotlin.jvm.internal.g0.p(r10, r0)
            if (r11 < 0) goto L86
            if (r12 < 0) goto L86
            int r0 = r11 + r12
            int r1 = r10.length
            if (r0 > r1) goto L86
            boolean r1 = r9.c
            if (r1 != 0) goto L7e
            boolean r1 = r9.d
            r2 = -1
            if (r1 == 0) goto L18
            return r2
        L18:
            r1 = 0
            if (r12 != 0) goto L1c
            return r1
        L1c:
            int r3 = r9.c()
            if (r3 < r12) goto L26
            r9.a(r10, r11, r12)
            return r12
        L26:
            int r3 = r9.c()
            int r12 = r12 - r3
            int r12 = r12 + 2
            int r12 = r12 / 3
            int r12 = r12 * 4
            r3 = r11
        L32:
            boolean r4 = r9.d
            if (r4 != 0) goto L77
            if (r12 <= 0) goto L77
            byte[] r4 = r9.f
            int r4 = r4.length
            int r4 = java.lang.Math.min(r4, r12)
            r5 = 0
        L40:
            boolean r6 = r9.d
            if (r6 != 0) goto L63
            if (r5 >= r4) goto L63
            int r6 = r9.e()
            r7 = 1
            if (r6 == r2) goto L60
            r8 = 61
            if (r6 == r8) goto L59
            byte[] r7 = r9.f
            byte r6 = (byte) r6
            r7[r5] = r6
            int r5 = r5 + 1
            goto L40
        L59:
            int r5 = r9.d(r5)
            r9.d = r7
            goto L40
        L60:
            r9.d = r7
            goto L40
        L63:
            if (r6 != 0) goto L70
            if (r5 != r4) goto L68
            goto L70
        L68:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "Check failed."
            r10.<init>(r11)
            throw r10
        L70:
            int r12 = r12 - r5
            int r4 = r9.b(r10, r3, r0, r5)
            int r3 = r3 + r4
            goto L32
        L77:
            if (r3 != r11) goto L7c
            if (r4 == 0) goto L7c
            return r2
        L7c:
            int r3 = r3 - r11
            return r3
        L7e:
            java.io.IOException r10 = new java.io.IOException
            java.lang.String r11 = "The input stream is closed."
            r10.<init>(r11)
            throw r10
        L86:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "offset: "
            r1.append(r2)
            r1.append(r11)
            java.lang.String r11 = ", length: "
            r1.append(r11)
            r1.append(r12)
            java.lang.String r11 = ", buffer size: "
            r1.append(r11)
            int r10 = r10.length
            r1.append(r10)
            java.lang.String r10 = r1.toString()
            r0.<init>(r10)
            throw r0
    }
}
