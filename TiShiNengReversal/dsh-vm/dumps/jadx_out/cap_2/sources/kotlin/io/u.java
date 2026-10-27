package kotlin.io;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.JvmName(name = "TextStreamsKt")
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nReadWrite.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReadWrite.kt\nkotlin/io/TextStreamsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,157:1\n57#1:158\n1#2:159\n1#2:162\n1321#3,2:160\n*S KotlinDebug\n*F\n+ 1 ReadWrite.kt\nkotlin/io/TextStreamsKt\n*L\n35#1:158\n35#1:159\n35#1:160,2\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class u {
    public static /* synthetic */ kotlin.n1 a(java.util.ArrayList r0, java.lang.String r1) {
            kotlin.n1 r0 = l(r0, r1)
            return r0
    }

    @kotlin.internal.InlineOnly
    private static final java.io.BufferedReader b(java.io.Reader r1, int r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            boolean r0 = r1 instanceof java.io.BufferedReader
            if (r0 == 0) goto Lc
            java.io.BufferedReader r1 = (java.io.BufferedReader) r1
            return r1
        Lc:
            java.io.BufferedReader r0 = new java.io.BufferedReader
            r0.<init>(r1, r2)
            return r0
    }

    @kotlin.internal.InlineOnly
    private static final java.io.BufferedWriter c(java.io.Writer r1, int r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            boolean r0 = r1 instanceof java.io.BufferedWriter
            if (r0 == 0) goto Lc
            java.io.BufferedWriter r1 = (java.io.BufferedWriter) r1
            return r1
        Lc:
            java.io.BufferedWriter r0 = new java.io.BufferedWriter
            r0.<init>(r1, r2)
            return r0
    }

    static /* synthetic */ java.io.BufferedReader d(java.io.Reader r0, int r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L6
            r1 = 8192(0x2000, float:1.148E-41)
        L6:
            java.lang.String r2 = "<this>"
            kotlin.jvm.internal.g0.p(r0, r2)
            boolean r2 = r0 instanceof java.io.BufferedReader
            if (r2 == 0) goto L12
            java.io.BufferedReader r0 = (java.io.BufferedReader) r0
            return r0
        L12:
            java.io.BufferedReader r2 = new java.io.BufferedReader
            r2.<init>(r0, r1)
            return r2
    }

    static /* synthetic */ java.io.BufferedWriter e(java.io.Writer r0, int r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L6
            r1 = 8192(0x2000, float:1.148E-41)
        L6:
            java.lang.String r2 = "<this>"
            kotlin.jvm.internal.g0.p(r0, r2)
            boolean r2 = r0 instanceof java.io.BufferedWriter
            if (r2 == 0) goto L12
            java.io.BufferedWriter r0 = (java.io.BufferedWriter) r0
            return r0
        L12:
            java.io.BufferedWriter r2 = new java.io.BufferedWriter
            r2.<init>(r0, r1)
            return r2
    }

    public static final long f(@org.jetbrains.annotations.NotNull java.io.Reader r5, @org.jetbrains.annotations.NotNull java.io.Writer r6, int r7) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r0 = "out"
            kotlin.jvm.internal.g0.p(r6, r0)
            char[] r7 = new char[r7]
            int r0 = r5.read(r7)
            r1 = 0
        L12:
            if (r0 < 0) goto L1f
            r3 = 0
            r6.write(r7, r3, r0)
            long r3 = (long) r0
            long r1 = r1 + r3
            int r0 = r5.read(r7)
            goto L12
        L1f:
            return r1
    }

    public static /* synthetic */ long g(java.io.Reader r0, java.io.Writer r1, int r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L6
            r2 = 8192(0x2000, float:1.148E-41)
        L6:
            long r0 = f(r0, r1, r2)
            return r0
    }

    public static final void h(@org.jetbrains.annotations.NotNull java.io.Reader r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.n1> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "action"
            kotlin.jvm.internal.g0.p(r3, r0)
            boolean r0 = r2 instanceof java.io.BufferedReader
            if (r0 == 0) goto L11
            java.io.BufferedReader r2 = (java.io.BufferedReader) r2
            goto L19
        L11:
            java.io.BufferedReader r0 = new java.io.BufferedReader
            r1 = 8192(0x2000, float:1.148E-41)
            r0.<init>(r2, r1)
            r2 = r0
        L19:
            kotlin.sequences.m r0 = i(r2)     // Catch: java.lang.Throwable -> L2f
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L2f
        L21:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L2f
            if (r1 == 0) goto L31
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L2f
            r3.invoke(r1)     // Catch: java.lang.Throwable -> L2f
            goto L21
        L2f:
            r3 = move-exception
            goto L38
        L31:
            kotlin.n1 r3 = kotlin.n1.a     // Catch: java.lang.Throwable -> L2f
            r3 = 0
            kotlin.io.b.a(r2, r3)
            return
        L38:
            throw r3     // Catch: java.lang.Throwable -> L39
        L39:
            r0 = move-exception
            kotlin.io.b.a(r2, r3)
            throw r0
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.sequences.m<java.lang.String> i(@org.jetbrains.annotations.NotNull java.io.BufferedReader r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.io.q r0 = new kotlin.io.q
            r0.<init>(r1)
            kotlin.sequences.m r1 = kotlin.sequences.p.k(r0)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final byte[] j(@org.jetbrains.annotations.NotNull java.net.URL r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.io.InputStream r2 = r2.openStream()
            kotlin.jvm.internal.g0.m(r2)     // Catch: java.lang.Throwable -> L15
            byte[] r0 = kotlin.io.a.p(r2)     // Catch: java.lang.Throwable -> L15
            r1 = 0
            kotlin.io.b.a(r2, r1)
            return r0
        L15:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L17
        L17:
            r1 = move-exception
            kotlin.io.b.a(r2, r0)
            throw r1
    }

    @org.jetbrains.annotations.NotNull
    public static final java.util.List<java.lang.String> k(@org.jetbrains.annotations.NotNull java.io.Reader r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            kotlin.io.t r1 = new kotlin.io.t
            r1.<init>(r0)
            h(r2, r1)
            return r0
    }

    private static final kotlin.n1 l(java.util.ArrayList r1, java.lang.String r2) {
            java.lang.String r0 = "it"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.add(r2)
            kotlin.n1 r1 = kotlin.n1.a
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String m(@org.jetbrains.annotations.NotNull java.io.Reader r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.io.StringWriter r0 = new java.io.StringWriter
            r0.<init>()
            r1 = 2
            r2 = 0
            r3 = 0
            g(r4, r0, r3, r1, r2)
            java.lang.String r4 = r0.toString()
            java.lang.String r0 = "toString(...)"
            kotlin.jvm.internal.g0.o(r4, r0)
            return r4
    }

    @kotlin.internal.InlineOnly
    private static final java.lang.String n(java.net.URL r1, java.nio.charset.Charset r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "charset"
            kotlin.jvm.internal.g0.p(r2, r0)
            byte[] r1 = j(r1)
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1, r2)
            return r0
    }

    static /* synthetic */ java.lang.String o(java.net.URL r0, java.nio.charset.Charset r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L6
            java.nio.charset.Charset r1 = kotlin.text.e.b
        L6:
            java.lang.String r2 = "<this>"
            kotlin.jvm.internal.g0.p(r0, r2)
            java.lang.String r2 = "charset"
            kotlin.jvm.internal.g0.p(r1, r2)
            byte[] r0 = j(r0)
            java.lang.String r2 = new java.lang.String
            r2.<init>(r0, r1)
            return r2
    }

    @kotlin.internal.InlineOnly
    private static final java.io.StringReader p(java.lang.String r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.io.StringReader r0 = new java.io.StringReader
            r0.<init>(r1)
            return r0
    }

    public static final <T> T q(@org.jetbrains.annotations.NotNull java.io.Reader r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super kotlin.sequences.m<java.lang.String>, ? extends T> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "block"
            kotlin.jvm.internal.g0.p(r3, r0)
            boolean r0 = r2 instanceof java.io.BufferedReader
            if (r0 == 0) goto L11
            java.io.BufferedReader r2 = (java.io.BufferedReader) r2
            goto L19
        L11:
            java.io.BufferedReader r0 = new java.io.BufferedReader
            r1 = 8192(0x2000, float:1.148E-41)
            r0.<init>(r2, r1)
            r2 = r0
        L19:
            r0 = 1
            kotlin.sequences.m r1 = i(r2)     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r3 = r3.invoke(r1)     // Catch: java.lang.Throwable -> L2d
            kotlin.jvm.internal.d0.d(r0)
            r1 = 0
            kotlin.io.b.a(r2, r1)
            kotlin.jvm.internal.d0.c(r0)
            return r3
        L2d:
            r3 = move-exception
            throw r3     // Catch: java.lang.Throwable -> L2f
        L2f:
            r1 = move-exception
            kotlin.jvm.internal.d0.d(r0)
            kotlin.io.b.a(r2, r3)
            kotlin.jvm.internal.d0.c(r0)
            throw r1
    }
}
