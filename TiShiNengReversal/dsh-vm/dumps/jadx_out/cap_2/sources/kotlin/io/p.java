package kotlin.io;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nConsole.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Console.kt\nkotlin/io/LineReader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,302:1\n1#2:303\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class p {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.io.p a = null;
    private static final int b = 32;
    private static java.nio.charset.CharsetDecoder c;
    private static boolean d;

    @org.jetbrains.annotations.NotNull
    private static final byte[] e = null;

    @org.jetbrains.annotations.NotNull
    private static final char[] f = null;

    @org.jetbrains.annotations.NotNull
    private static final java.nio.ByteBuffer g = null;

    @org.jetbrains.annotations.NotNull
    private static final java.nio.CharBuffer h = null;

    @org.jetbrains.annotations.NotNull
    private static final java.lang.StringBuilder i = null;

    static {
            kotlin.io.p r0 = new kotlin.io.p
            r0.<init>()
            kotlin.io.p.a = r0
            r0 = 32
            byte[] r1 = new byte[r0]
            kotlin.io.p.e = r1
            char[] r0 = new char[r0]
            kotlin.io.p.f = r0
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.wrap(r1)
            java.lang.String r2 = "wrap(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            kotlin.io.p.g = r1
            java.nio.CharBuffer r0 = java.nio.CharBuffer.wrap(r0)
            kotlin.jvm.internal.g0.o(r0, r2)
            kotlin.io.p.h = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            kotlin.io.p.i = r0
            return
    }

    private p() {
            r0 = this;
            r0.<init>()
            return
    }

    private final int a() {
            r3 = this;
            java.nio.ByteBuffer r0 = kotlin.io.p.g
            r0.compact()
            int r1 = r0.position()
            r2 = 0
            r0.position(r2)
            return r1
    }

    private final int b(boolean r6) {
            r5 = this;
        L0:
            java.nio.charset.CharsetDecoder r0 = kotlin.io.p.c
            if (r0 != 0) goto La
            java.lang.String r0 = "decoder"
            kotlin.jvm.internal.g0.S(r0)
            r0 = 0
        La:
            java.nio.ByteBuffer r1 = kotlin.io.p.g
            java.nio.CharBuffer r2 = kotlin.io.p.h
            java.nio.charset.CoderResult r0 = r0.decode(r1, r2, r6)
            java.lang.String r1 = "decode(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            boolean r1 = r0.isError()
            if (r1 == 0) goto L23
            r5.e()
            r0.throwException()
        L23:
            int r1 = r2.position()
            boolean r0 = r0.isOverflow()
            if (r0 != 0) goto L2e
            return r1
        L2e:
            java.lang.StringBuilder r0 = kotlin.io.p.i
            char[] r3 = kotlin.io.p.f
            int r1 = r1 + (-1)
            r4 = 0
            r0.append(r3, r4, r1)
            r2.position(r4)
            r0 = 32
            r2.limit(r0)
            char r0 = r3[r1]
            r2.put(r0)
            goto L0
    }

    private final int c(int r2, int r3) {
            r1 = this;
            java.nio.ByteBuffer r0 = kotlin.io.p.g
            r0.limit(r2)
            java.nio.CharBuffer r2 = kotlin.io.p.h
            r2.position(r3)
            r2 = 1
            int r2 = r1.b(r2)
            java.nio.charset.CharsetDecoder r3 = kotlin.io.p.c
            if (r3 != 0) goto L19
            java.lang.String r3 = "decoder"
            kotlin.jvm.internal.g0.S(r3)
            r3 = 0
        L19:
            r3.reset()
            r3 = 0
            r0.position(r3)
            return r2
    }

    private final void e() {
            r2 = this;
            java.nio.charset.CharsetDecoder r0 = kotlin.io.p.c
            if (r0 != 0) goto La
            java.lang.String r0 = "decoder"
            kotlin.jvm.internal.g0.S(r0)
            r0 = 0
        La:
            r0.reset()
            java.nio.ByteBuffer r0 = kotlin.io.p.g
            r1 = 0
            r0.position(r1)
            java.lang.StringBuilder r0 = kotlin.io.p.i
            r0.setLength(r1)
            return
    }

    private final void f() {
            r2 = this;
            java.lang.StringBuilder r0 = kotlin.io.p.i
            r1 = 32
            r0.setLength(r1)
            r0.trimToSize()
            return
    }

    private final void g(java.nio.charset.Charset r5) {
            r4 = this;
            java.nio.charset.CharsetDecoder r5 = r5.newDecoder()
            java.lang.String r0 = "newDecoder(...)"
            kotlin.jvm.internal.g0.o(r5, r0)
            kotlin.io.p.c = r5
            java.nio.ByteBuffer r5 = kotlin.io.p.g
            r5.clear()
            java.nio.CharBuffer r0 = kotlin.io.p.h
            r0.clear()
            r1 = 10
            r5.put(r1)
            r5.flip()
            java.nio.charset.CharsetDecoder r2 = kotlin.io.p.c
            if (r2 != 0) goto L27
            java.lang.String r2 = "decoder"
            kotlin.jvm.internal.g0.S(r2)
            r2 = 0
        L27:
            r3 = 0
            r2.decode(r5, r0, r3)
            int r5 = r0.position()
            r2 = 1
            if (r5 != r2) goto L39
            char r5 = r0.get(r3)
            if (r5 != r1) goto L39
            r3 = 1
        L39:
            kotlin.io.p.d = r3
            r4.e()
            return
    }

    @org.jetbrains.annotations.Nullable
    public final synchronized java.lang.String d(@org.jetbrains.annotations.NotNull java.io.InputStream r10, @org.jetbrains.annotations.NotNull java.nio.charset.Charset r11) {
            r9 = this;
            monitor-enter(r9)
            java.lang.String r0 = "inputStream"
            kotlin.jvm.internal.g0.p(r10, r0)     // Catch: java.lang.Throwable -> L19
            java.lang.String r0 = "charset"
            kotlin.jvm.internal.g0.p(r11, r0)     // Catch: java.lang.Throwable -> L19
            java.nio.charset.CharsetDecoder r0 = kotlin.io.p.c     // Catch: java.lang.Throwable -> L19
            r1 = 0
            if (r0 == 0) goto L26
            if (r0 != 0) goto L1c
            java.lang.String r0 = "decoder"
            kotlin.jvm.internal.g0.S(r0)     // Catch: java.lang.Throwable -> L19
            r0 = r1
            goto L1c
        L19:
            r10 = move-exception
            goto Lc5
        L1c:
            java.nio.charset.Charset r0 = r0.charset()     // Catch: java.lang.Throwable -> L19
            boolean r0 = kotlin.jvm.internal.g0.g(r0, r11)     // Catch: java.lang.Throwable -> L19
            if (r0 != 0) goto L29
        L26:
            r9.g(r11)     // Catch: java.lang.Throwable -> L19
        L29:
            r11 = 0
            r0 = 0
            r2 = 0
        L2c:
            int r3 = r10.read()     // Catch: java.lang.Throwable -> L19
            r4 = 32
            r5 = -1
            r6 = 10
            if (r3 != r5) goto L4a
            java.lang.StringBuilder r10 = kotlin.io.p.i     // Catch: java.lang.Throwable -> L19
            int r10 = r10.length()     // Catch: java.lang.Throwable -> L19
            if (r10 != 0) goto L45
            if (r0 != 0) goto L45
            if (r2 != 0) goto L45
            monitor-exit(r9)
            return r1
        L45:
            int r10 = r9.c(r0, r2)     // Catch: java.lang.Throwable -> L19
            goto L78
        L4a:
            byte[] r5 = kotlin.io.p.e     // Catch: java.lang.Throwable -> L19
            int r7 = r0 + 1
            byte r8 = (byte) r3     // Catch: java.lang.Throwable -> L19
            r5[r0] = r8     // Catch: java.lang.Throwable -> L19
            if (r3 == r6) goto L5c
            if (r7 == r4) goto L5c
            boolean r0 = kotlin.io.p.d     // Catch: java.lang.Throwable -> L19
            if (r0 != 0) goto L5a
            goto L5c
        L5a:
            r0 = r7
            goto L2c
        L5c:
            java.nio.ByteBuffer r0 = kotlin.io.p.g     // Catch: java.lang.Throwable -> L19
            r0.limit(r7)     // Catch: java.lang.Throwable -> L19
            java.nio.CharBuffer r3 = kotlin.io.p.h     // Catch: java.lang.Throwable -> L19
            r3.position(r2)     // Catch: java.lang.Throwable -> L19
            int r2 = r9.b(r11)     // Catch: java.lang.Throwable -> L19
            if (r2 <= 0) goto Lbf
            char[] r3 = kotlin.io.p.f     // Catch: java.lang.Throwable -> L19
            int r5 = r2 + (-1)
            char r3 = r3[r5]     // Catch: java.lang.Throwable -> L19
            if (r3 != r6) goto Lbf
            r0.position(r11)     // Catch: java.lang.Throwable -> L19
            r10 = r2
        L78:
            if (r10 <= 0) goto L92
            char[] r0 = kotlin.io.p.f     // Catch: java.lang.Throwable -> L19
            int r1 = r10 + (-1)
            char r1 = r0[r1]     // Catch: java.lang.Throwable -> L19
            if (r1 != r6) goto L92
            int r1 = r10 + (-1)
            if (r1 <= 0) goto L91
            int r2 = r10 + (-2)
            char r0 = r0[r2]     // Catch: java.lang.Throwable -> L19
            r2 = 13
            if (r0 != r2) goto L91
            int r10 = r10 + (-2)
            goto L92
        L91:
            r10 = r1
        L92:
            java.lang.StringBuilder r0 = kotlin.io.p.i     // Catch: java.lang.Throwable -> L19
            int r1 = r0.length()     // Catch: java.lang.Throwable -> L19
            if (r1 != 0) goto La3
            java.lang.String r0 = new java.lang.String     // Catch: java.lang.Throwable -> L19
            char[] r1 = kotlin.io.p.f     // Catch: java.lang.Throwable -> L19
            r0.<init>(r1, r11, r10)     // Catch: java.lang.Throwable -> L19
            monitor-exit(r9)
            return r0
        La3:
            char[] r1 = kotlin.io.p.f     // Catch: java.lang.Throwable -> L19
            r0.append(r1, r11, r10)     // Catch: java.lang.Throwable -> L19
            java.lang.String r10 = r0.toString()     // Catch: java.lang.Throwable -> L19
            java.lang.String r1 = "toString(...)"
            kotlin.jvm.internal.g0.o(r10, r1)     // Catch: java.lang.Throwable -> L19
            int r1 = r0.length()     // Catch: java.lang.Throwable -> L19
            if (r1 <= r4) goto Lba
            r9.f()     // Catch: java.lang.Throwable -> L19
        Lba:
            r0.setLength(r11)     // Catch: java.lang.Throwable -> L19
            monitor-exit(r9)
            return r10
        Lbf:
            int r0 = r9.a()     // Catch: java.lang.Throwable -> L19
            goto L2c
        Lc5:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L19
            throw r10
    }
}
