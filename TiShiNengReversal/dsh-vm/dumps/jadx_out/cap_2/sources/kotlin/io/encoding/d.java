package kotlin.io.encoding;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.io.encoding.ExperimentalEncodingApi
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class d extends java.io.OutputStream {

    @org.jetbrains.annotations.NotNull
    private final java.io.OutputStream a;

    @org.jetbrains.annotations.NotNull
    private final kotlin.io.encoding.Base64 b;
    private boolean c;
    private int d;

    @org.jetbrains.annotations.NotNull
    private final byte[] e;

    @org.jetbrains.annotations.NotNull
    private final byte[] f;
    private int g;

    public d(@org.jetbrains.annotations.NotNull java.io.OutputStream r2, @org.jetbrains.annotations.NotNull kotlin.io.encoding.Base64 r3) {
            r1 = this;
            java.lang.String r0 = "output"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "base64"
            kotlin.jvm.internal.g0.p(r3, r0)
            r1.<init>()
            r1.a = r2
            r1.b = r3
            boolean r2 = r3.H()
            if (r2 == 0) goto L1c
            int r2 = r3.E()
            goto L1d
        L1c:
            r2 = -1
        L1d:
            r1.d = r2
            r2 = 1024(0x400, float:1.435E-42)
            byte[] r2 = new byte[r2]
            r1.e = r2
            r2 = 3
            byte[] r2 = new byte[r2]
            r1.f = r2
            return
    }

    private final void a() {
            r2 = this;
            boolean r0 = r2.c
            if (r0 != 0) goto L5
            return
        L5:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "The output stream is closed."
            r0.<init>(r1)
            throw r0
    }

    private final int b(byte[] r5, int r6, int r7) {
            r4 = this;
            int r0 = r4.g
            r1 = 3
            int r0 = 3 - r0
            int r7 = r7 - r6
            int r7 = java.lang.Math.min(r0, r7)
            byte[] r0 = r4.f
            int r2 = r4.g
            int r3 = r6 + r7
            kotlin.collections.n.v0(r5, r0, r2, r6, r3)
            int r5 = r4.g
            int r5 = r5 + r7
            r4.g = r5
            if (r5 != r1) goto L1d
            r4.c()
        L1d:
            return r7
    }

    private final void c() {
            r3 = this;
            byte[] r0 = r3.f
            int r1 = r3.g
            r2 = 0
            int r0 = r3.d(r0, r2, r1)
            r1 = 4
            if (r0 != r1) goto Lf
            r3.g = r2
            return
        Lf:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Check failed."
            r0.<init>(r1)
            throw r0
    }

    private final int d(byte[] r7, int r8, int r9) {
            r6 = this;
            kotlin.io.encoding.Base64 r0 = r6.b
            byte[] r2 = r6.e
            r3 = 0
            r1 = r7
            r4 = r8
            r5 = r9
            int r7 = r0.v(r1, r2, r3, r4, r5)
            int r8 = r6.d
            if (r8 != 0) goto L34
            java.io.OutputStream r8 = r6.a
            kotlin.io.encoding.Base64$a r9 = kotlin.io.encoding.Base64.f
            byte[] r9 = r9.N()
            r8.write(r9)
            kotlin.io.encoding.Base64 r8 = r6.b
            int r8 = r8.E()
            r6.d = r8
            kotlin.io.encoding.Base64 r8 = r6.b
            int r8 = r8.E()
            if (r7 > r8) goto L2c
            goto L34
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "Check failed."
            r7.<init>(r8)
            throw r7
        L34:
            java.io.OutputStream r8 = r6.a
            byte[] r9 = r6.e
            r0 = 0
            r8.write(r9, r0, r7)
            int r8 = r6.d
            int r8 = r8 - r7
            r6.d = r8
            return r7
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r1 = this;
            boolean r0 = r1.c
            if (r0 != 0) goto L13
            r0 = 1
            r1.c = r0
            int r0 = r1.g
            if (r0 == 0) goto Le
            r1.c()
        Le:
            java.io.OutputStream r0 = r1.a
            r0.close()
        L13:
            return
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
            r1 = this;
            r1.a()
            java.io.OutputStream r0 = r1.a
            r0.flush()
            return
    }

    @Override // java.io.OutputStream
    public void write(int r4) {
            r3 = this;
            r3.a()
            byte[] r0 = r3.f
            int r1 = r3.g
            int r2 = r1 + 1
            r3.g = r2
            byte r4 = (byte) r4
            r0[r1] = r4
            r4 = 3
            if (r2 != r4) goto L14
            r3.c()
        L14:
            return
    }

    @Override // java.io.OutputStream
    public void write(@org.jetbrains.annotations.NotNull byte[] r5, int r6, int r7) {
            r4 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.g0.p(r5, r0)
            r4.a()
            if (r6 < 0) goto L65
            if (r7 < 0) goto L65
            int r0 = r6 + r7
            int r1 = r5.length
            if (r0 > r1) goto L65
            if (r7 != 0) goto L14
            goto L26
        L14:
            int r7 = r4.g
            java.lang.String r1 = "Check failed."
            r2 = 3
            if (r7 >= r2) goto L5f
            if (r7 == 0) goto L27
            int r7 = r4.b(r5, r6, r0)
            int r6 = r6 + r7
            int r7 = r4.g
            if (r7 == 0) goto L27
        L26:
            return
        L27:
            int r7 = r6 + 3
            if (r7 > r0) goto L55
            kotlin.io.encoding.Base64 r7 = r4.b
            boolean r7 = r7.H()
            if (r7 == 0) goto L36
            int r7 = r4.d
            goto L39
        L36:
            byte[] r7 = r4.e
            int r7 = r7.length
        L39:
            int r7 = r7 / 4
            int r3 = r0 - r6
            int r3 = r3 / r2
            int r7 = java.lang.Math.min(r7, r3)
            int r3 = r7 * 3
            int r3 = r3 + r6
            int r6 = r4.d(r5, r6, r3)
            int r7 = r7 * 4
            if (r6 != r7) goto L4f
            r6 = r3
            goto L27
        L4f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            r5.<init>(r1)
            throw r5
        L55:
            byte[] r7 = r4.f
            r1 = 0
            kotlin.collections.n.v0(r5, r7, r1, r6, r0)
            int r0 = r0 - r6
            r4.g = r0
            return
        L5f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            r5.<init>(r1)
            throw r5
        L65:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "offset: "
            r1.append(r2)
            r1.append(r6)
            java.lang.String r6 = ", length: "
            r1.append(r6)
            r1.append(r7)
            java.lang.String r6 = ", source size: "
            r1.append(r6)
            int r5 = r5.length
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5)
            throw r0
    }
}
