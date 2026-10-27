package kotlin.io.path;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nPathReadWrite.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathReadWrite.kt\nkotlin/io/path/PathsKt__PathReadWriteKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ReadWrite.kt\nkotlin/io/TextStreamsKt\n+ 4 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,327:1\n1#2:328\n1#2:330\n57#3:329\n1321#4,2:331\n*S KotlinDebug\n*F\n+ 1 PathReadWrite.kt\nkotlin/io/path/PathsKt__PathReadWriteKt\n*L\n208#1:330\n208#1:329\n208#1:331,2\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
class t0 {
    public t0() {
            r0 = this;
            r0.<init>()
            return
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.internal.InlineOnly
    private static final java.nio.file.Path A(java.nio.file.Path r1, kotlin.sequences.m<? extends java.lang.CharSequence> r2, java.nio.charset.Charset r3, java.nio.file.OpenOption... r4) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "lines"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "charset"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "options"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.Iterable r2 = kotlin.sequences.p.l0(r2)
            int r0 = r4.length
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r0)
            java.nio.file.OpenOption[] r4 = (java.nio.file.OpenOption[]) r4
            java.nio.file.Path r1 = kotlin.io.path.n0.a(r1, r2, r3, r4)
            java.lang.String r2 = "write(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            return r1
    }

    static /* synthetic */ java.nio.file.Path B(java.nio.file.Path r0, java.lang.Iterable r1, java.nio.charset.Charset r2, java.nio.file.OpenOption[] r3, int r4, java.lang.Object r5) throws java.io.IOException {
            r4 = r4 & 2
            if (r4 == 0) goto L6
            java.nio.charset.Charset r2 = kotlin.text.e.b
        L6:
            java.lang.String r4 = "<this>"
            kotlin.jvm.internal.g0.p(r0, r4)
            java.lang.String r4 = "lines"
            kotlin.jvm.internal.g0.p(r1, r4)
            java.lang.String r4 = "charset"
            kotlin.jvm.internal.g0.p(r2, r4)
            java.lang.String r4 = "options"
            kotlin.jvm.internal.g0.p(r3, r4)
            int r4 = r3.length
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r4)
            java.nio.file.OpenOption[] r3 = (java.nio.file.OpenOption[]) r3
            java.nio.file.Path r0 = kotlin.io.path.n0.a(r0, r1, r2, r3)
            java.lang.String r1 = "write(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            return r0
    }

    static /* synthetic */ java.nio.file.Path C(java.nio.file.Path r0, kotlin.sequences.m r1, java.nio.charset.Charset r2, java.nio.file.OpenOption[] r3, int r4, java.lang.Object r5) throws java.io.IOException {
            r4 = r4 & 2
            if (r4 == 0) goto L6
            java.nio.charset.Charset r2 = kotlin.text.e.b
        L6:
            java.lang.String r4 = "<this>"
            kotlin.jvm.internal.g0.p(r0, r4)
            java.lang.String r4 = "lines"
            kotlin.jvm.internal.g0.p(r1, r4)
            java.lang.String r4 = "charset"
            kotlin.jvm.internal.g0.p(r2, r4)
            java.lang.String r4 = "options"
            kotlin.jvm.internal.g0.p(r3, r4)
            java.lang.Iterable r1 = kotlin.sequences.p.l0(r1)
            int r4 = r3.length
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r4)
            java.nio.file.OpenOption[] r3 = (java.nio.file.OpenOption[]) r3
            java.nio.file.Path r0 = kotlin.io.path.n0.a(r0, r1, r2, r3)
            java.lang.String r1 = "write(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.5")
    public static final void D(@org.jetbrains.annotations.NotNull java.nio.file.Path r3, @org.jetbrains.annotations.NotNull java.lang.CharSequence r4, @org.jetbrains.annotations.NotNull java.nio.charset.Charset r5, @org.jetbrains.annotations.NotNull java.nio.file.OpenOption... r6) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "text"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "charset"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r0 = "options"
            kotlin.jvm.internal.g0.p(r6, r0)
            int r0 = r6.length
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r0)
            java.nio.file.OpenOption[] r6 = (java.nio.file.OpenOption[]) r6
            java.io.OutputStream r3 = kotlin.io.path.p0.a(r3, r6)
            boolean r6 = r4 instanceof java.lang.String     // Catch: java.lang.Throwable -> L2c
            if (r6 == 0) goto L2e
            kotlin.jvm.internal.g0.m(r3)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L2c
            kotlin.io.i.L(r3, r4, r5)     // Catch: java.lang.Throwable -> L2c
            goto L7c
        L2c:
            r4 = move-exception
            goto L83
        L2e:
            java.nio.charset.CharsetEncoder r5 = kotlin.io.i.u(r5)     // Catch: java.lang.Throwable -> L2c
            boolean r6 = r4 instanceof java.nio.CharBuffer     // Catch: java.lang.Throwable -> L2c
            if (r6 == 0) goto L3e
            r6 = r4
            java.nio.CharBuffer r6 = (java.nio.CharBuffer) r6     // Catch: java.lang.Throwable -> L2c
            java.nio.CharBuffer r6 = r6.asReadOnlyBuffer()     // Catch: java.lang.Throwable -> L2c
            goto L42
        L3e:
            java.nio.CharBuffer r6 = java.nio.CharBuffer.wrap(r4)     // Catch: java.lang.Throwable -> L2c
        L42:
            int r4 = r4.length()     // Catch: java.lang.Throwable -> L2c
            r0 = 8192(0x2000, float:1.148E-41)
            int r4 = java.lang.Math.min(r4, r0)     // Catch: java.lang.Throwable -> L2c
            kotlin.jvm.internal.g0.m(r5)     // Catch: java.lang.Throwable -> L2c
            java.nio.ByteBuffer r4 = kotlin.io.i.o(r4, r5)     // Catch: java.lang.Throwable -> L2c
        L53:
            boolean r0 = r6.hasRemaining()     // Catch: java.lang.Throwable -> L2c
            if (r0 == 0) goto L7c
            r0 = 1
            java.nio.charset.CoderResult r0 = r5.encode(r6, r4, r0)     // Catch: java.lang.Throwable -> L2c
            boolean r0 = r0.isError()     // Catch: java.lang.Throwable -> L2c
            if (r0 != 0) goto L74
            byte[] r0 = r4.array()     // Catch: java.lang.Throwable -> L2c
            int r1 = r4.position()     // Catch: java.lang.Throwable -> L2c
            r2 = 0
            r3.write(r0, r2, r1)     // Catch: java.lang.Throwable -> L2c
            r4.clear()     // Catch: java.lang.Throwable -> L2c
            goto L53
        L74:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2c
            java.lang.String r5 = "Check failed."
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L2c
            throw r4     // Catch: java.lang.Throwable -> L2c
        L7c:
            kotlin.n1 r4 = kotlin.n1.a     // Catch: java.lang.Throwable -> L2c
            r4 = 0
            kotlin.io.b.a(r3, r4)
            return
        L83:
            throw r4     // Catch: java.lang.Throwable -> L84
        L84:
            r5 = move-exception
            kotlin.io.b.a(r3, r4)
            throw r5
    }

    public static /* synthetic */ void E(java.nio.file.Path r0, java.lang.CharSequence r1, java.nio.charset.Charset r2, java.nio.file.OpenOption[] r3, int r4, java.lang.Object r5) throws java.io.IOException {
            r4 = r4 & 2
            if (r4 == 0) goto L6
            java.nio.charset.Charset r2 = kotlin.text.e.b
        L6:
            D(r0, r1, r2, r3)
            return
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.internal.InlineOnly
    private static final java.io.OutputStreamWriter F(java.nio.file.Path r2, java.nio.charset.Charset r3, java.nio.file.OpenOption... r4) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "charset"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "options"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.io.OutputStreamWriter r0 = new java.io.OutputStreamWriter
            int r1 = r4.length
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r1)
            java.nio.file.OpenOption[] r4 = (java.nio.file.OpenOption[]) r4
            java.io.OutputStream r2 = kotlin.io.path.p0.a(r2, r4)
            r0.<init>(r2, r3)
            return r0
    }

    static /* synthetic */ java.io.OutputStreamWriter G(java.nio.file.Path r0, java.nio.charset.Charset r1, java.nio.file.OpenOption[] r2, int r3, java.lang.Object r4) throws java.io.IOException {
            r3 = r3 & 1
            if (r3 == 0) goto L6
            java.nio.charset.Charset r1 = kotlin.text.e.b
        L6:
            java.lang.String r3 = "<this>"
            kotlin.jvm.internal.g0.p(r0, r3)
            java.lang.String r3 = "charset"
            kotlin.jvm.internal.g0.p(r1, r3)
            java.lang.String r3 = "options"
            kotlin.jvm.internal.g0.p(r2, r3)
            java.io.OutputStreamWriter r3 = new java.io.OutputStreamWriter
            int r4 = r2.length
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r4)
            java.nio.file.OpenOption[] r2 = (java.nio.file.OpenOption[]) r2
            java.io.OutputStream r0 = kotlin.io.path.p0.a(r0, r2)
            r3.<init>(r0, r1)
            return r3
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.internal.InlineOnly
    private static final void a(java.nio.file.Path r3, byte[] r4) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "array"
            kotlin.jvm.internal.g0.p(r4, r0)
            r0 = 1
            java.nio.file.OpenOption[] r0 = new java.nio.file.OpenOption[r0]
            r1 = 0
            java.nio.file.StandardOpenOption r2 = kotlin.io.path.m0.a()
            r0[r1] = r2
            kotlin.io.path.q0.a(r3, r4, r0)
            return
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.internal.InlineOnly
    private static final java.nio.file.Path b(java.nio.file.Path r3, java.lang.Iterable<? extends java.lang.CharSequence> r4, java.nio.charset.Charset r5) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "lines"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "charset"
            kotlin.jvm.internal.g0.p(r5, r0)
            r0 = 1
            java.nio.file.OpenOption[] r0 = new java.nio.file.OpenOption[r0]
            r1 = 0
            java.nio.file.StandardOpenOption r2 = kotlin.io.path.m0.a()
            r0[r1] = r2
            java.nio.file.Path r3 = kotlin.io.path.n0.a(r3, r4, r5, r0)
            java.lang.String r4 = "write(...)"
            kotlin.jvm.internal.g0.o(r3, r4)
            return r3
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.internal.InlineOnly
    private static final java.nio.file.Path c(java.nio.file.Path r3, kotlin.sequences.m<? extends java.lang.CharSequence> r4, java.nio.charset.Charset r5) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "lines"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "charset"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.Iterable r4 = kotlin.sequences.p.l0(r4)
            r0 = 1
            java.nio.file.OpenOption[] r0 = new java.nio.file.OpenOption[r0]
            r1 = 0
            java.nio.file.StandardOpenOption r2 = kotlin.io.path.m0.a()
            r0[r1] = r2
            java.nio.file.Path r3 = kotlin.io.path.n0.a(r3, r4, r5, r0)
            java.lang.String r4 = "write(...)"
            kotlin.jvm.internal.g0.o(r3, r4)
            return r3
    }

    static /* synthetic */ java.nio.file.Path d(java.nio.file.Path r1, java.lang.Iterable r2, java.nio.charset.Charset r3, int r4, java.lang.Object r5) throws java.io.IOException {
            r4 = r4 & 2
            if (r4 == 0) goto L6
            java.nio.charset.Charset r3 = kotlin.text.e.b
        L6:
            java.lang.String r4 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r4)
            java.lang.String r4 = "lines"
            kotlin.jvm.internal.g0.p(r2, r4)
            java.lang.String r4 = "charset"
            kotlin.jvm.internal.g0.p(r3, r4)
            r4 = 1
            java.nio.file.OpenOption[] r4 = new java.nio.file.OpenOption[r4]
            r5 = 0
            java.nio.file.StandardOpenOption r0 = kotlin.io.path.m0.a()
            r4[r5] = r0
            java.nio.file.Path r1 = kotlin.io.path.n0.a(r1, r2, r3, r4)
            java.lang.String r2 = "write(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            return r1
    }

    static /* synthetic */ java.nio.file.Path e(java.nio.file.Path r1, kotlin.sequences.m r2, java.nio.charset.Charset r3, int r4, java.lang.Object r5) throws java.io.IOException {
            r4 = r4 & 2
            if (r4 == 0) goto L6
            java.nio.charset.Charset r3 = kotlin.text.e.b
        L6:
            java.lang.String r4 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r4)
            java.lang.String r4 = "lines"
            kotlin.jvm.internal.g0.p(r2, r4)
            java.lang.String r4 = "charset"
            kotlin.jvm.internal.g0.p(r3, r4)
            java.lang.Iterable r2 = kotlin.sequences.p.l0(r2)
            r4 = 1
            java.nio.file.OpenOption[] r4 = new java.nio.file.OpenOption[r4]
            r5 = 0
            java.nio.file.StandardOpenOption r0 = kotlin.io.path.m0.a()
            r4[r5] = r0
            java.nio.file.Path r1 = kotlin.io.path.n0.a(r1, r2, r3, r4)
            java.lang.String r2 = "write(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.5")
    public static final void f(@org.jetbrains.annotations.NotNull java.nio.file.Path r3, @org.jetbrains.annotations.NotNull java.lang.CharSequence r4, @org.jetbrains.annotations.NotNull java.nio.charset.Charset r5) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "text"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "charset"
            kotlin.jvm.internal.g0.p(r5, r0)
            r0 = 1
            java.nio.file.OpenOption[] r0 = new java.nio.file.OpenOption[r0]
            r1 = 0
            java.nio.file.StandardOpenOption r2 = kotlin.io.path.m0.a()
            r0[r1] = r2
            D(r3, r4, r5, r0)
            return
    }

    public static /* synthetic */ void g(java.nio.file.Path r0, java.lang.CharSequence r1, java.nio.charset.Charset r2, int r3, java.lang.Object r4) throws java.io.IOException {
            r3 = r3 & 2
            if (r3 == 0) goto L6
            java.nio.charset.Charset r2 = kotlin.text.e.b
        L6:
            f(r0, r1, r2)
            return
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.internal.InlineOnly
    private static final java.io.BufferedReader h(java.nio.file.Path r3, java.nio.charset.Charset r4, int r5, java.nio.file.OpenOption... r6) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "charset"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "options"
            kotlin.jvm.internal.g0.p(r6, r0)
            java.io.BufferedReader r0 = new java.io.BufferedReader
            java.io.InputStreamReader r1 = new java.io.InputStreamReader
            int r2 = r6.length
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r2)
            java.nio.file.OpenOption[] r6 = (java.nio.file.OpenOption[]) r6
            java.io.InputStream r3 = kotlin.io.path.r0.a(r3, r6)
            r1.<init>(r3, r4)
            r0.<init>(r1, r5)
            return r0
    }

    static /* synthetic */ java.io.BufferedReader i(java.nio.file.Path r1, java.nio.charset.Charset r2, int r3, java.nio.file.OpenOption[] r4, int r5, java.lang.Object r6) throws java.io.IOException {
            r6 = r5 & 1
            if (r6 == 0) goto L6
            java.nio.charset.Charset r2 = kotlin.text.e.b
        L6:
            r5 = r5 & 2
            if (r5 == 0) goto Lc
            r3 = 8192(0x2000, float:1.148E-41)
        Lc:
            java.lang.String r5 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r5)
            java.lang.String r5 = "charset"
            kotlin.jvm.internal.g0.p(r2, r5)
            java.lang.String r5 = "options"
            kotlin.jvm.internal.g0.p(r4, r5)
            java.io.BufferedReader r5 = new java.io.BufferedReader
            java.io.InputStreamReader r6 = new java.io.InputStreamReader
            int r0 = r4.length
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r0)
            java.nio.file.OpenOption[] r4 = (java.nio.file.OpenOption[]) r4
            java.io.InputStream r1 = kotlin.io.path.r0.a(r1, r4)
            r6.<init>(r1, r2)
            r5.<init>(r6, r3)
            return r5
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.internal.InlineOnly
    private static final java.io.BufferedWriter j(java.nio.file.Path r3, java.nio.charset.Charset r4, int r5, java.nio.file.OpenOption... r6) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "charset"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "options"
            kotlin.jvm.internal.g0.p(r6, r0)
            java.io.BufferedWriter r0 = new java.io.BufferedWriter
            java.io.OutputStreamWriter r1 = new java.io.OutputStreamWriter
            int r2 = r6.length
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r2)
            java.nio.file.OpenOption[] r6 = (java.nio.file.OpenOption[]) r6
            java.io.OutputStream r3 = kotlin.io.path.p0.a(r3, r6)
            r1.<init>(r3, r4)
            r0.<init>(r1, r5)
            return r0
    }

    static /* synthetic */ java.io.BufferedWriter k(java.nio.file.Path r1, java.nio.charset.Charset r2, int r3, java.nio.file.OpenOption[] r4, int r5, java.lang.Object r6) throws java.io.IOException {
            r6 = r5 & 1
            if (r6 == 0) goto L6
            java.nio.charset.Charset r2 = kotlin.text.e.b
        L6:
            r5 = r5 & 2
            if (r5 == 0) goto Lc
            r3 = 8192(0x2000, float:1.148E-41)
        Lc:
            java.lang.String r5 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r5)
            java.lang.String r5 = "charset"
            kotlin.jvm.internal.g0.p(r2, r5)
            java.lang.String r5 = "options"
            kotlin.jvm.internal.g0.p(r4, r5)
            java.io.BufferedWriter r5 = new java.io.BufferedWriter
            java.io.OutputStreamWriter r6 = new java.io.OutputStreamWriter
            int r0 = r4.length
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r0)
            java.nio.file.OpenOption[] r4 = (java.nio.file.OpenOption[]) r4
            java.io.OutputStream r1 = kotlin.io.path.p0.a(r1, r4)
            r6.<init>(r1, r2)
            r5.<init>(r6, r3)
            return r5
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.internal.InlineOnly
    private static final void l(java.nio.file.Path r2, java.nio.charset.Charset r3, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.n1> r4) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "charset"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "action"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.io.BufferedReader r2 = kotlin.io.path.l0.a(r2, r3)
            java.lang.String r3 = "newBufferedReader(...)"
            kotlin.jvm.internal.g0.o(r2, r3)
            r3 = 1
            kotlin.sequences.m r0 = kotlin.io.u.i(r2)     // Catch: java.lang.Throwable -> L2f
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L2f
        L21:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L2f
            if (r1 == 0) goto L31
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L2f
            r4.invoke(r1)     // Catch: java.lang.Throwable -> L2f
            goto L21
        L2f:
            r4 = move-exception
            goto L3e
        L31:
            kotlin.n1 r4 = kotlin.n1.a     // Catch: java.lang.Throwable -> L2f
            kotlin.jvm.internal.d0.d(r3)
            r4 = 0
            kotlin.io.b.a(r2, r4)
            kotlin.jvm.internal.d0.c(r3)
            return
        L3e:
            throw r4     // Catch: java.lang.Throwable -> L3f
        L3f:
            r0 = move-exception
            kotlin.jvm.internal.d0.d(r3)
            kotlin.io.b.a(r2, r4)
            kotlin.jvm.internal.d0.c(r3)
            throw r0
    }

    static /* synthetic */ void m(java.nio.file.Path r0, java.nio.charset.Charset r1, kotlin.jvm.functions.Function1 r2, int r3, java.lang.Object r4) throws java.io.IOException {
            r4 = 1
            r3 = r3 & r4
            if (r3 == 0) goto L6
            java.nio.charset.Charset r1 = kotlin.text.e.b
        L6:
            java.lang.String r3 = "<this>"
            kotlin.jvm.internal.g0.p(r0, r3)
            java.lang.String r3 = "charset"
            kotlin.jvm.internal.g0.p(r1, r3)
            java.lang.String r3 = "action"
            kotlin.jvm.internal.g0.p(r2, r3)
            java.io.BufferedReader r0 = kotlin.io.path.l0.a(r0, r1)
            java.lang.String r1 = "newBufferedReader(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            kotlin.sequences.m r1 = kotlin.io.u.i(r0)     // Catch: java.lang.Throwable -> L34
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L34
        L26:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> L34
            if (r3 == 0) goto L36
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> L34
            r2.invoke(r3)     // Catch: java.lang.Throwable -> L34
            goto L26
        L34:
            r1 = move-exception
            goto L43
        L36:
            kotlin.n1 r1 = kotlin.n1.a     // Catch: java.lang.Throwable -> L34
            kotlin.jvm.internal.d0.d(r4)
            r1 = 0
            kotlin.io.b.a(r0, r1)
            kotlin.jvm.internal.d0.c(r4)
            return
        L43:
            throw r1     // Catch: java.lang.Throwable -> L44
        L44:
            r2 = move-exception
            kotlin.jvm.internal.d0.d(r4)
            kotlin.io.b.a(r0, r1)
            kotlin.jvm.internal.d0.c(r4)
            throw r2
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.internal.InlineOnly
    private static final java.io.InputStream n(java.nio.file.Path r1, java.nio.file.OpenOption... r2) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "options"
            kotlin.jvm.internal.g0.p(r2, r0)
            int r0 = r2.length
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r0)
            java.nio.file.OpenOption[] r2 = (java.nio.file.OpenOption[]) r2
            java.io.InputStream r1 = kotlin.io.path.r0.a(r1, r2)
            java.lang.String r2 = "newInputStream(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.internal.InlineOnly
    private static final java.io.OutputStream o(java.nio.file.Path r1, java.nio.file.OpenOption... r2) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "options"
            kotlin.jvm.internal.g0.p(r2, r0)
            int r0 = r2.length
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r0)
            java.nio.file.OpenOption[] r2 = (java.nio.file.OpenOption[]) r2
            java.io.OutputStream r1 = kotlin.io.path.p0.a(r1, r2)
            java.lang.String r2 = "newOutputStream(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.internal.InlineOnly
    private static final byte[] p(java.nio.file.Path r1) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            byte[] r1 = kotlin.io.path.o0.a(r1)
            java.lang.String r0 = "readAllBytes(...)"
            kotlin.jvm.internal.g0.o(r1, r0)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.internal.InlineOnly
    private static final java.util.List<java.lang.String> q(java.nio.file.Path r1, java.nio.charset.Charset r2) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "charset"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.List r1 = kotlin.io.path.s0.a(r1, r2)
            java.lang.String r2 = "readAllLines(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            return r1
    }

    static /* synthetic */ java.util.List r(java.nio.file.Path r0, java.nio.charset.Charset r1, int r2, java.lang.Object r3) throws java.io.IOException {
            r2 = r2 & 1
            if (r2 == 0) goto L6
            java.nio.charset.Charset r1 = kotlin.text.e.b
        L6:
            java.lang.String r2 = "<this>"
            kotlin.jvm.internal.g0.p(r0, r2)
            java.lang.String r2 = "charset"
            kotlin.jvm.internal.g0.p(r1, r2)
            java.util.List r0 = kotlin.io.path.s0.a(r0, r1)
            java.lang.String r1 = "readAllLines(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.5")
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String s(@org.jetbrains.annotations.NotNull java.nio.file.Path r3, @org.jetbrains.annotations.NotNull java.nio.charset.Charset r4) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "charset"
            kotlin.jvm.internal.g0.p(r4, r0)
            r0 = 0
            java.nio.file.OpenOption[] r1 = new java.nio.file.OpenOption[r0]
            java.io.InputStreamReader r2 = new java.io.InputStreamReader
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r0)
            java.nio.file.OpenOption[] r0 = (java.nio.file.OpenOption[]) r0
            java.io.InputStream r3 = kotlin.io.path.r0.a(r3, r0)
            r2.<init>(r3, r4)
            java.lang.String r3 = kotlin.io.u.m(r2)     // Catch: java.lang.Throwable -> L25
            r4 = 0
            kotlin.io.b.a(r2, r4)
            return r3
        L25:
            r3 = move-exception
            throw r3     // Catch: java.lang.Throwable -> L27
        L27:
            r4 = move-exception
            kotlin.io.b.a(r2, r3)
            throw r4
    }

    public static /* synthetic */ java.lang.String t(java.nio.file.Path r0, java.nio.charset.Charset r1, int r2, java.lang.Object r3) throws java.io.IOException {
            r2 = r2 & 1
            if (r2 == 0) goto L6
            java.nio.charset.Charset r1 = kotlin.text.e.b
        L6:
            java.lang.String r0 = s(r0, r1)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.internal.InlineOnly
    private static final java.io.InputStreamReader u(java.nio.file.Path r2, java.nio.charset.Charset r3, java.nio.file.OpenOption... r4) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "charset"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "options"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.io.InputStreamReader r0 = new java.io.InputStreamReader
            int r1 = r4.length
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r1)
            java.nio.file.OpenOption[] r4 = (java.nio.file.OpenOption[]) r4
            java.io.InputStream r2 = kotlin.io.path.r0.a(r2, r4)
            r0.<init>(r2, r3)
            return r0
    }

    static /* synthetic */ java.io.InputStreamReader v(java.nio.file.Path r0, java.nio.charset.Charset r1, java.nio.file.OpenOption[] r2, int r3, java.lang.Object r4) throws java.io.IOException {
            r3 = r3 & 1
            if (r3 == 0) goto L6
            java.nio.charset.Charset r1 = kotlin.text.e.b
        L6:
            java.lang.String r3 = "<this>"
            kotlin.jvm.internal.g0.p(r0, r3)
            java.lang.String r3 = "charset"
            kotlin.jvm.internal.g0.p(r1, r3)
            java.lang.String r3 = "options"
            kotlin.jvm.internal.g0.p(r2, r3)
            java.io.InputStreamReader r3 = new java.io.InputStreamReader
            int r4 = r2.length
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r4)
            java.nio.file.OpenOption[] r2 = (java.nio.file.OpenOption[]) r2
            java.io.InputStream r0 = kotlin.io.path.r0.a(r0, r2)
            r3.<init>(r0, r1)
            return r3
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.internal.InlineOnly
    private static final <T> T w(java.nio.file.Path r1, java.nio.charset.Charset r2, kotlin.jvm.functions.Function1<? super kotlin.sequences.m<java.lang.String>, ? extends T> r3) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "charset"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "block"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.io.BufferedReader r1 = kotlin.io.path.l0.a(r1, r2)
            r2 = 1
            kotlin.jvm.internal.g0.m(r1)     // Catch: java.lang.Throwable -> L2a
            kotlin.sequences.m r0 = kotlin.io.u.i(r1)     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r3 = r3.invoke(r0)     // Catch: java.lang.Throwable -> L2a
            kotlin.jvm.internal.d0.d(r2)
            r0 = 0
            kotlin.io.b.a(r1, r0)
            kotlin.jvm.internal.d0.c(r2)
            return r3
        L2a:
            r3 = move-exception
            throw r3     // Catch: java.lang.Throwable -> L2c
        L2c:
            r0 = move-exception
            kotlin.jvm.internal.d0.d(r2)
            kotlin.io.b.a(r1, r3)
            kotlin.jvm.internal.d0.c(r2)
            throw r0
    }

    static /* synthetic */ java.lang.Object x(java.nio.file.Path r0, java.nio.charset.Charset r1, kotlin.jvm.functions.Function1 r2, int r3, java.lang.Object r4) throws java.io.IOException {
            r4 = 1
            r3 = r3 & r4
            if (r3 == 0) goto L6
            java.nio.charset.Charset r1 = kotlin.text.e.b
        L6:
            java.lang.String r3 = "<this>"
            kotlin.jvm.internal.g0.p(r0, r3)
            java.lang.String r3 = "charset"
            kotlin.jvm.internal.g0.p(r1, r3)
            java.lang.String r3 = "block"
            kotlin.jvm.internal.g0.p(r2, r3)
            java.io.BufferedReader r0 = kotlin.io.path.l0.a(r0, r1)
            kotlin.jvm.internal.g0.m(r0)     // Catch: java.lang.Throwable -> L2f
            kotlin.sequences.m r1 = kotlin.io.u.i(r0)     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r1 = r2.invoke(r1)     // Catch: java.lang.Throwable -> L2f
            kotlin.jvm.internal.d0.d(r4)
            r2 = 0
            kotlin.io.b.a(r0, r2)
            kotlin.jvm.internal.d0.c(r4)
            return r1
        L2f:
            r1 = move-exception
            throw r1     // Catch: java.lang.Throwable -> L31
        L31:
            r2 = move-exception
            kotlin.jvm.internal.d0.d(r4)
            kotlin.io.b.a(r0, r1)
            kotlin.jvm.internal.d0.c(r4)
            throw r2
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.internal.InlineOnly
    private static final void y(java.nio.file.Path r1, byte[] r2, java.nio.file.OpenOption... r3) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "array"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "options"
            kotlin.jvm.internal.g0.p(r3, r0)
            int r0 = r3.length
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r0)
            java.nio.file.OpenOption[] r3 = (java.nio.file.OpenOption[]) r3
            kotlin.io.path.q0.a(r1, r2, r3)
            return
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.internal.InlineOnly
    private static final java.nio.file.Path z(java.nio.file.Path r1, java.lang.Iterable<? extends java.lang.CharSequence> r2, java.nio.charset.Charset r3, java.nio.file.OpenOption... r4) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "lines"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "charset"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "options"
            kotlin.jvm.internal.g0.p(r4, r0)
            int r0 = r4.length
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r0)
            java.nio.file.OpenOption[] r4 = (java.nio.file.OpenOption[]) r4
            java.nio.file.Path r1 = kotlin.io.path.n0.a(r1, r2, r3, r4)
            java.lang.String r2 = "write(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            return r1
    }
}
