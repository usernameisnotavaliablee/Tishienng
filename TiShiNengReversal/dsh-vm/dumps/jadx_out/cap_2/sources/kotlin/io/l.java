package kotlin.io;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nFileReadWrite.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileReadWrite.kt\nkotlin/io/FilesKt__FileReadWriteKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,290:1\n1#2:291\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
class l extends kotlin.io.j {
    public l() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ java.util.List A(java.io.File r0, java.nio.charset.Charset r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L6
            java.nio.charset.Charset r1 = kotlin.text.e.b
        L6:
            java.util.List r0 = z(r0, r1)
            return r0
    }

    private static final kotlin.n1 B(java.util.ArrayList r1, java.lang.String r2) {
            java.lang.String r0 = "it"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.add(r2)
            kotlin.n1 r1 = kotlin.n1.a
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String C(@org.jetbrains.annotations.NotNull java.io.File r2, @org.jetbrains.annotations.NotNull java.nio.charset.Charset r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "charset"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.io.InputStreamReader r0 = new java.io.InputStreamReader
            java.io.FileInputStream r1 = new java.io.FileInputStream
            r1.<init>(r2)
            r0.<init>(r1, r3)
            java.lang.String r2 = kotlin.io.u.m(r0)     // Catch: java.lang.Throwable -> L1d
            r3 = 0
            kotlin.io.b.a(r0, r3)
            return r2
        L1d:
            r2 = move-exception
            throw r2     // Catch: java.lang.Throwable -> L1f
        L1f:
            r3 = move-exception
            kotlin.io.b.a(r0, r2)
            throw r3
    }

    public static /* synthetic */ java.lang.String D(java.io.File r0, java.nio.charset.Charset r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L6
            java.nio.charset.Charset r1 = kotlin.text.e.b
        L6:
            java.lang.String r0 = C(r0, r1)
            return r0
    }

    @kotlin.internal.InlineOnly
    private static final java.io.InputStreamReader E(java.io.File r2, java.nio.charset.Charset r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "charset"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.io.InputStreamReader r0 = new java.io.InputStreamReader
            java.io.FileInputStream r1 = new java.io.FileInputStream
            r1.<init>(r2)
            r0.<init>(r1, r3)
            return r0
    }

    static /* synthetic */ java.io.InputStreamReader F(java.io.File r0, java.nio.charset.Charset r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L6
            java.nio.charset.Charset r1 = kotlin.text.e.b
        L6:
            java.lang.String r2 = "<this>"
            kotlin.jvm.internal.g0.p(r0, r2)
            java.lang.String r2 = "charset"
            kotlin.jvm.internal.g0.p(r1, r2)
            java.io.InputStreamReader r2 = new java.io.InputStreamReader
            java.io.FileInputStream r3 = new java.io.FileInputStream
            r3.<init>(r0)
            r2.<init>(r3, r1)
            return r2
    }

    public static final <T> T G(@org.jetbrains.annotations.NotNull java.io.File r2, @org.jetbrains.annotations.NotNull java.nio.charset.Charset r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super kotlin.sequences.m<java.lang.String>, ? extends T> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "charset"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "block"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.io.InputStreamReader r0 = new java.io.InputStreamReader
            java.io.FileInputStream r1 = new java.io.FileInputStream
            r1.<init>(r2)
            r0.<init>(r1, r3)
            java.io.BufferedReader r2 = new java.io.BufferedReader
            r3 = 8192(0x2000, float:1.148E-41)
            r2.<init>(r0, r3)
            r3 = 1
            kotlin.sequences.m r0 = kotlin.io.u.i(r2)     // Catch: java.lang.Throwable -> L34
            java.lang.Object r4 = r4.invoke(r0)     // Catch: java.lang.Throwable -> L34
            kotlin.jvm.internal.d0.d(r3)
            r0 = 0
            kotlin.io.b.a(r2, r0)
            kotlin.jvm.internal.d0.c(r3)
            return r4
        L34:
            r4 = move-exception
            throw r4     // Catch: java.lang.Throwable -> L36
        L36:
            r0 = move-exception
            kotlin.jvm.internal.d0.d(r3)
            kotlin.io.b.a(r2, r4)
            kotlin.jvm.internal.d0.c(r3)
            throw r0
    }

    public static /* synthetic */ java.lang.Object H(java.io.File r1, java.nio.charset.Charset r2, kotlin.jvm.functions.Function1 r3, int r4, java.lang.Object r5) {
            r5 = 1
            r4 = r4 & r5
            if (r4 == 0) goto L6
            java.nio.charset.Charset r2 = kotlin.text.e.b
        L6:
            java.lang.String r4 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r4)
            java.lang.String r4 = "charset"
            kotlin.jvm.internal.g0.p(r2, r4)
            java.lang.String r4 = "block"
            kotlin.jvm.internal.g0.p(r3, r4)
            java.io.InputStreamReader r4 = new java.io.InputStreamReader
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r1)
            r4.<init>(r0, r2)
            java.io.BufferedReader r1 = new java.io.BufferedReader
            r2 = 8192(0x2000, float:1.148E-41)
            r1.<init>(r4, r2)
            kotlin.sequences.m r2 = kotlin.io.u.i(r1)     // Catch: java.lang.Throwable -> L39
            java.lang.Object r2 = r3.invoke(r2)     // Catch: java.lang.Throwable -> L39
            kotlin.jvm.internal.d0.d(r5)
            r3 = 0
            kotlin.io.b.a(r1, r3)
            kotlin.jvm.internal.d0.c(r5)
            return r2
        L39:
            r2 = move-exception
            throw r2     // Catch: java.lang.Throwable -> L3b
        L3b:
            r3 = move-exception
            kotlin.jvm.internal.d0.d(r5)
            kotlin.io.b.a(r1, r2)
            kotlin.jvm.internal.d0.c(r5)
            throw r3
    }

    public static final void I(@org.jetbrains.annotations.NotNull java.io.File r1, @org.jetbrains.annotations.NotNull byte[] r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "array"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.io.FileOutputStream r0 = new java.io.FileOutputStream
            r0.<init>(r1)
            r0.write(r2)     // Catch: java.lang.Throwable -> L19
            kotlin.n1 r1 = kotlin.n1.a     // Catch: java.lang.Throwable -> L19
            r1 = 0
            kotlin.io.b.a(r0, r1)
            return
        L19:
            r1 = move-exception
            throw r1     // Catch: java.lang.Throwable -> L1b
        L1b:
            r2 = move-exception
            kotlin.io.b.a(r0, r1)
            throw r2
    }

    public static final void J(@org.jetbrains.annotations.NotNull java.io.File r1, @org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull java.nio.charset.Charset r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "text"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "charset"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.io.FileOutputStream r0 = new java.io.FileOutputStream
            r0.<init>(r1)
            L(r0, r2, r3)     // Catch: java.lang.Throwable -> L1e
            kotlin.n1 r1 = kotlin.n1.a     // Catch: java.lang.Throwable -> L1e
            r1 = 0
            kotlin.io.b.a(r0, r1)
            return
        L1e:
            r1 = move-exception
            throw r1     // Catch: java.lang.Throwable -> L20
        L20:
            r2 = move-exception
            kotlin.io.b.a(r0, r1)
            throw r2
    }

    public static /* synthetic */ void K(java.io.File r0, java.lang.String r1, java.nio.charset.Charset r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L6
            java.nio.charset.Charset r2 = kotlin.text.e.b
        L6:
            J(r0, r1, r2)
            return
    }

    public static void L(@org.jetbrains.annotations.NotNull java.io.OutputStream r9, @org.jetbrains.annotations.NotNull java.lang.String r10, @org.jetbrains.annotations.NotNull java.nio.charset.Charset r11) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r9, r0)
            java.lang.String r0 = "text"
            kotlin.jvm.internal.g0.p(r10, r0)
            java.lang.String r0 = "charset"
            kotlin.jvm.internal.g0.p(r11, r0)
            int r0 = r10.length()
            r1 = 16384(0x4000, float:2.2959E-41)
            if (r0 >= r1) goto L24
            byte[] r10 = r10.getBytes(r11)
            java.lang.String r11 = "getBytes(...)"
            kotlin.jvm.internal.g0.o(r10, r11)
            r9.write(r10)
            return
        L24:
            java.nio.charset.CharsetEncoder r11 = u(r11)
            r0 = 8192(0x2000, float:1.148E-41)
            java.nio.CharBuffer r1 = java.nio.CharBuffer.allocate(r0)
            kotlin.jvm.internal.g0.m(r11)
            java.nio.ByteBuffer r0 = o(r0, r11)
            r2 = 0
            r3 = 0
            r4 = 0
        L38:
            int r5 = r10.length()
            if (r3 >= r5) goto L9d
            int r5 = 8192 - r4
            int r6 = r10.length()
            int r6 = r6 - r3
            int r5 = java.lang.Math.min(r5, r6)
            int r6 = r3 + r5
            char[] r7 = r1.array()
            java.lang.String r8 = "array(...)"
            kotlin.jvm.internal.g0.o(r7, r8)
            r10.getChars(r3, r6, r7, r4)
            int r5 = r5 + r4
            r1.limit(r5)
            int r3 = r10.length()
            r4 = 1
            if (r6 != r3) goto L64
            r3 = 1
            goto L65
        L64:
            r3 = 0
        L65:
            java.nio.charset.CoderResult r3 = r11.encode(r1, r0, r3)
            boolean r3 = r3.isUnderflow()
            if (r3 == 0) goto L95
            byte[] r3 = r0.array()
            int r5 = r0.position()
            r9.write(r3, r2, r5)
            int r3 = r1.position()
            int r5 = r1.limit()
            if (r3 == r5) goto L8c
            char r3 = r1.get()
            r1.put(r2, r3)
            goto L8d
        L8c:
            r4 = 0
        L8d:
            r1.clear()
            r0.clear()
            r3 = r6
            goto L38
        L95:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Check failed."
            r9.<init>(r10)
            throw r9
        L9d:
            return
    }

    @kotlin.internal.InlineOnly
    private static final java.io.OutputStreamWriter M(java.io.File r2, java.nio.charset.Charset r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "charset"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.io.OutputStreamWriter r0 = new java.io.OutputStreamWriter
            java.io.FileOutputStream r1 = new java.io.FileOutputStream
            r1.<init>(r2)
            r0.<init>(r1, r3)
            return r0
    }

    static /* synthetic */ java.io.OutputStreamWriter N(java.io.File r0, java.nio.charset.Charset r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L6
            java.nio.charset.Charset r1 = kotlin.text.e.b
        L6:
            java.lang.String r2 = "<this>"
            kotlin.jvm.internal.g0.p(r0, r2)
            java.lang.String r2 = "charset"
            kotlin.jvm.internal.g0.p(r1, r2)
            java.io.OutputStreamWriter r2 = new java.io.OutputStreamWriter
            java.io.FileOutputStream r3 = new java.io.FileOutputStream
            r3.<init>(r0)
            r2.<init>(r3, r1)
            return r2
    }

    public static /* synthetic */ kotlin.n1 g(java.util.ArrayList r0, java.lang.String r1) {
            kotlin.n1 r0 = B(r0, r1)
            return r0
    }

    public static final void h(@org.jetbrains.annotations.NotNull java.io.File r2, @org.jetbrains.annotations.NotNull byte[] r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "array"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.io.FileOutputStream r0 = new java.io.FileOutputStream
            r1 = 1
            r0.<init>(r2, r1)
            r0.write(r3)     // Catch: java.lang.Throwable -> L1a
            kotlin.n1 r2 = kotlin.n1.a     // Catch: java.lang.Throwable -> L1a
            r2 = 0
            kotlin.io.b.a(r0, r2)
            return
        L1a:
            r2 = move-exception
            throw r2     // Catch: java.lang.Throwable -> L1c
        L1c:
            r3 = move-exception
            kotlin.io.b.a(r0, r2)
            throw r3
    }

    public static final void i(@org.jetbrains.annotations.NotNull java.io.File r2, @org.jetbrains.annotations.NotNull java.lang.String r3, @org.jetbrains.annotations.NotNull java.nio.charset.Charset r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "text"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "charset"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.io.FileOutputStream r0 = new java.io.FileOutputStream
            r1 = 1
            r0.<init>(r2, r1)
            L(r0, r3, r4)     // Catch: java.lang.Throwable -> L1f
            kotlin.n1 r2 = kotlin.n1.a     // Catch: java.lang.Throwable -> L1f
            r2 = 0
            kotlin.io.b.a(r0, r2)
            return
        L1f:
            r2 = move-exception
            throw r2     // Catch: java.lang.Throwable -> L21
        L21:
            r3 = move-exception
            kotlin.io.b.a(r0, r2)
            throw r3
    }

    public static /* synthetic */ void j(java.io.File r0, java.lang.String r1, java.nio.charset.Charset r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L6
            java.nio.charset.Charset r2 = kotlin.text.e.b
        L6:
            i(r0, r1, r2)
            return
    }

    @kotlin.internal.InlineOnly
    private static final java.io.BufferedReader k(java.io.File r2, java.nio.charset.Charset r3, int r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "charset"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.io.InputStreamReader r0 = new java.io.InputStreamReader
            java.io.FileInputStream r1 = new java.io.FileInputStream
            r1.<init>(r2)
            r0.<init>(r1, r3)
            java.io.BufferedReader r2 = new java.io.BufferedReader
            r2.<init>(r0, r4)
            return r2
    }

    static /* synthetic */ java.io.BufferedReader l(java.io.File r0, java.nio.charset.Charset r1, int r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L6
            java.nio.charset.Charset r1 = kotlin.text.e.b
        L6:
            r3 = r3 & 2
            if (r3 == 0) goto Lc
            r2 = 8192(0x2000, float:1.148E-41)
        Lc:
            java.lang.String r3 = "<this>"
            kotlin.jvm.internal.g0.p(r0, r3)
            java.lang.String r3 = "charset"
            kotlin.jvm.internal.g0.p(r1, r3)
            java.io.InputStreamReader r3 = new java.io.InputStreamReader
            java.io.FileInputStream r4 = new java.io.FileInputStream
            r4.<init>(r0)
            r3.<init>(r4, r1)
            java.io.BufferedReader r0 = new java.io.BufferedReader
            r0.<init>(r3, r2)
            return r0
    }

    @kotlin.internal.InlineOnly
    private static final java.io.BufferedWriter m(java.io.File r2, java.nio.charset.Charset r3, int r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "charset"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.io.OutputStreamWriter r0 = new java.io.OutputStreamWriter
            java.io.FileOutputStream r1 = new java.io.FileOutputStream
            r1.<init>(r2)
            r0.<init>(r1, r3)
            java.io.BufferedWriter r2 = new java.io.BufferedWriter
            r2.<init>(r0, r4)
            return r2
    }

    static /* synthetic */ java.io.BufferedWriter n(java.io.File r0, java.nio.charset.Charset r1, int r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L6
            java.nio.charset.Charset r1 = kotlin.text.e.b
        L6:
            r3 = r3 & 2
            if (r3 == 0) goto Lc
            r2 = 8192(0x2000, float:1.148E-41)
        Lc:
            java.lang.String r3 = "<this>"
            kotlin.jvm.internal.g0.p(r0, r3)
            java.lang.String r3 = "charset"
            kotlin.jvm.internal.g0.p(r1, r3)
            java.io.OutputStreamWriter r3 = new java.io.OutputStreamWriter
            java.io.FileOutputStream r4 = new java.io.FileOutputStream
            r4.<init>(r0)
            r3.<init>(r4, r1)
            java.io.BufferedWriter r0 = new java.io.BufferedWriter
            r0.<init>(r3, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static java.nio.ByteBuffer o(int r2, @org.jetbrains.annotations.NotNull java.nio.charset.CharsetEncoder r3) {
            java.lang.String r0 = "encoder"
            kotlin.jvm.internal.g0.p(r3, r0)
            float r3 = r3.maxBytesPerChar()
            double r0 = (double) r3
            double r0 = java.lang.Math.ceil(r0)
            float r3 = (float) r0
            int r3 = (int) r3
            int r2 = r2 * r3
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r2)
            java.lang.String r3 = "allocate(...)"
            kotlin.jvm.internal.g0.o(r2, r3)
            return r2
    }

    public static final void p(@org.jetbrains.annotations.NotNull java.io.File r1, int r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super byte[], ? super java.lang.Integer, kotlin.n1> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "action"
            kotlin.jvm.internal.g0.p(r3, r0)
            r0 = 512(0x200, float:7.17E-43)
            int r2 = kotlin.ranges.t.u(r2, r0)
            byte[] r2 = new byte[r2]
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r1)
        L17:
            int r1 = r0.read(r2)     // Catch: java.lang.Throwable -> L24
            if (r1 > 0) goto L26
            kotlin.n1 r1 = kotlin.n1.a     // Catch: java.lang.Throwable -> L24
            r1 = 0
            kotlin.io.b.a(r0, r1)
            return
        L24:
            r1 = move-exception
            goto L2e
        L26:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L24
            r3.invoke(r2, r1)     // Catch: java.lang.Throwable -> L24
            goto L17
        L2e:
            throw r1     // Catch: java.lang.Throwable -> L2f
        L2f:
            r2 = move-exception
            kotlin.io.b.a(r0, r1)
            throw r2
    }

    public static final void q(@org.jetbrains.annotations.NotNull java.io.File r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super byte[], ? super java.lang.Integer, kotlin.n1> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "action"
            kotlin.jvm.internal.g0.p(r2, r0)
            r0 = 4096(0x1000, float:5.74E-42)
            p(r1, r0, r2)
            return
    }

    public static final void r(@org.jetbrains.annotations.NotNull java.io.File r3, @org.jetbrains.annotations.NotNull java.nio.charset.Charset r4, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.n1> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "charset"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "action"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.io.BufferedReader r0 = new java.io.BufferedReader
            java.io.InputStreamReader r1 = new java.io.InputStreamReader
            java.io.FileInputStream r2 = new java.io.FileInputStream
            r2.<init>(r3)
            r1.<init>(r2, r4)
            r0.<init>(r1)
            kotlin.io.u.h(r0, r5)
            return
    }

    public static /* synthetic */ void s(java.io.File r0, java.nio.charset.Charset r1, kotlin.jvm.functions.Function1 r2, int r3, java.lang.Object r4) {
            r3 = r3 & 1
            if (r3 == 0) goto L6
            java.nio.charset.Charset r1 = kotlin.text.e.b
        L6:
            r(r0, r1, r2)
            return
    }

    @kotlin.internal.InlineOnly
    private static final java.io.FileInputStream t(java.io.File r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r1)
            return r0
    }

    public static java.nio.charset.CharsetEncoder u(@org.jetbrains.annotations.NotNull java.nio.charset.Charset r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.nio.charset.CharsetEncoder r1 = r1.newEncoder()
            java.nio.charset.CodingErrorAction r0 = java.nio.charset.CodingErrorAction.REPLACE
            java.nio.charset.CharsetEncoder r1 = r1.onMalformedInput(r0)
            java.nio.charset.CharsetEncoder r1 = r1.onUnmappableCharacter(r0)
            return r1
    }

    @kotlin.internal.InlineOnly
    private static final java.io.FileOutputStream v(java.io.File r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.io.FileOutputStream r0 = new java.io.FileOutputStream
            r0.<init>(r1)
            return r0
    }

    @kotlin.internal.InlineOnly
    private static final java.io.PrintWriter w(java.io.File r3, java.nio.charset.Charset r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "charset"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.io.PrintWriter r0 = new java.io.PrintWriter
            java.io.OutputStreamWriter r1 = new java.io.OutputStreamWriter
            java.io.FileOutputStream r2 = new java.io.FileOutputStream
            r2.<init>(r3)
            r1.<init>(r2, r4)
            java.io.BufferedWriter r3 = new java.io.BufferedWriter
            r4 = 8192(0x2000, float:1.148E-41)
            r3.<init>(r1, r4)
            r0.<init>(r3)
            return r0
    }

    static /* synthetic */ java.io.PrintWriter x(java.io.File r1, java.nio.charset.Charset r2, int r3, java.lang.Object r4) {
            r3 = r3 & 1
            if (r3 == 0) goto L6
            java.nio.charset.Charset r2 = kotlin.text.e.b
        L6:
            java.lang.String r3 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r3)
            java.lang.String r3 = "charset"
            kotlin.jvm.internal.g0.p(r2, r3)
            java.io.PrintWriter r3 = new java.io.PrintWriter
            java.io.OutputStreamWriter r4 = new java.io.OutputStreamWriter
            java.io.FileOutputStream r0 = new java.io.FileOutputStream
            r0.<init>(r1)
            r4.<init>(r0, r2)
            java.io.BufferedWriter r1 = new java.io.BufferedWriter
            r2 = 8192(0x2000, float:1.148E-41)
            r1.<init>(r4, r2)
            r3.<init>(r1)
            return r3
    }

    @org.jetbrains.annotations.NotNull
    public static final byte[] y(@org.jetbrains.annotations.NotNull java.io.File r10) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r10, r0)
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r10)
            long r1 = r10.length()     // Catch: java.lang.Throwable -> L28
            r3 = 2147483647(0x7fffffff, double:1.060997895E-314)
            java.lang.String r5 = "File "
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 > 0) goto L86
            int r2 = (int) r1
            byte[] r1 = new byte[r2]     // Catch: java.lang.Throwable -> L28
            r3 = 0
            r4 = r2
            r6 = 0
        L1d:
            if (r4 <= 0) goto L2b
            int r7 = r0.read(r1, r6, r4)     // Catch: java.lang.Throwable -> L28
            if (r7 < 0) goto L2b
            int r4 = r4 - r7
            int r6 = r6 + r7
            goto L1d
        L28:
            r10 = move-exception
            goto La8
        L2b:
            java.lang.String r7 = "copyOf(...)"
            r8 = 0
            if (r4 <= 0) goto L38
            byte[] r1 = java.util.Arrays.copyOf(r1, r6)     // Catch: java.lang.Throwable -> L28
            kotlin.jvm.internal.g0.o(r1, r7)     // Catch: java.lang.Throwable -> L28
            goto L68
        L38:
            int r4 = r0.read()     // Catch: java.lang.Throwable -> L28
            r6 = -1
            if (r4 != r6) goto L40
            goto L68
        L40:
            kotlin.io.f r6 = new kotlin.io.f     // Catch: java.lang.Throwable -> L28
            r9 = 8193(0x2001, float:1.1481E-41)
            r6.<init>(r9)     // Catch: java.lang.Throwable -> L28
            r6.write(r4)     // Catch: java.lang.Throwable -> L28
            r4 = 2
            kotlin.io.a.l(r0, r6, r3, r4, r8)     // Catch: java.lang.Throwable -> L28
            int r4 = r6.size()     // Catch: java.lang.Throwable -> L28
            int r4 = r4 + r2
            if (r4 < 0) goto L6c
            byte[] r10 = r6.a()     // Catch: java.lang.Throwable -> L28
            byte[] r1 = java.util.Arrays.copyOf(r1, r4)     // Catch: java.lang.Throwable -> L28
            kotlin.jvm.internal.g0.o(r1, r7)     // Catch: java.lang.Throwable -> L28
            int r4 = r6.size()     // Catch: java.lang.Throwable -> L28
            byte[] r1 = kotlin.collections.n.v0(r10, r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L28
        L68:
            kotlin.io.b.a(r0, r8)
            return r1
        L6c:
            java.lang.OutOfMemoryError r1 = new java.lang.OutOfMemoryError     // Catch: java.lang.Throwable -> L28
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L28
            r2.<init>()     // Catch: java.lang.Throwable -> L28
            r2.append(r5)     // Catch: java.lang.Throwable -> L28
            r2.append(r10)     // Catch: java.lang.Throwable -> L28
            java.lang.String r10 = " is too big to fit in memory."
            r2.append(r10)     // Catch: java.lang.Throwable -> L28
            java.lang.String r10 = r2.toString()     // Catch: java.lang.Throwable -> L28
            r1.<init>(r10)     // Catch: java.lang.Throwable -> L28
            throw r1     // Catch: java.lang.Throwable -> L28
        L86:
            java.lang.OutOfMemoryError r3 = new java.lang.OutOfMemoryError     // Catch: java.lang.Throwable -> L28
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L28
            r4.<init>()     // Catch: java.lang.Throwable -> L28
            r4.append(r5)     // Catch: java.lang.Throwable -> L28
            r4.append(r10)     // Catch: java.lang.Throwable -> L28
            java.lang.String r10 = " is too big ("
            r4.append(r10)     // Catch: java.lang.Throwable -> L28
            r4.append(r1)     // Catch: java.lang.Throwable -> L28
            java.lang.String r10 = " bytes) to fit in memory."
            r4.append(r10)     // Catch: java.lang.Throwable -> L28
            java.lang.String r10 = r4.toString()     // Catch: java.lang.Throwable -> L28
            r3.<init>(r10)     // Catch: java.lang.Throwable -> L28
            throw r3     // Catch: java.lang.Throwable -> L28
        La8:
            throw r10     // Catch: java.lang.Throwable -> La9
        La9:
            r1 = move-exception
            kotlin.io.b.a(r0, r10)
            throw r1
    }

    @org.jetbrains.annotations.NotNull
    public static final java.util.List<java.lang.String> z(@org.jetbrains.annotations.NotNull java.io.File r2, @org.jetbrains.annotations.NotNull java.nio.charset.Charset r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "charset"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            kotlin.io.k r1 = new kotlin.io.k
            r1.<init>(r0)
            r(r2, r3, r1)
            return r0
    }
}
