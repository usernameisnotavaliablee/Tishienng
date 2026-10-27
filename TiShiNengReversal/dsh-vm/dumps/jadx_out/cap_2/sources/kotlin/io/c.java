package kotlin.io;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.JvmName(name = "ConsoleKt")
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class c {
    @kotlin.internal.InlineOnly
    private static final void a(byte r0) {
            java.io.PrintStream r0 = java.lang.System.out
            r0.getClass()
            return
    }

    @kotlin.internal.InlineOnly
    private static final void b(char r0) {
            java.io.PrintStream r0 = java.lang.System.out
            r0.getClass()
            return
    }

    @kotlin.internal.InlineOnly
    private static final void c(double r0) {
            java.io.PrintStream r0 = java.lang.System.out
            r0.getClass()
            return
    }

    @kotlin.internal.InlineOnly
    private static final void d(float r0) {
            java.io.PrintStream r0 = java.lang.System.out
            r0.getClass()
            return
    }

    @kotlin.internal.InlineOnly
    private static final void e(int r0) {
            java.io.PrintStream r0 = java.lang.System.out
            r0.getClass()
            return
    }

    @kotlin.internal.InlineOnly
    private static final void f(long r0) {
            java.io.PrintStream r0 = java.lang.System.out
            r0.getClass()
            return
    }

    @kotlin.internal.InlineOnly
    private static final void g(java.lang.Object r0) {
            java.io.PrintStream r0 = java.lang.System.out
            r0.getClass()
            return
    }

    @kotlin.internal.InlineOnly
    private static final void h(short r0) {
            java.io.PrintStream r0 = java.lang.System.out
            r0.getClass()
            return
    }

    @kotlin.internal.InlineOnly
    private static final void i(boolean r0) {
            java.io.PrintStream r0 = java.lang.System.out
            r0.getClass()
            return
    }

    @kotlin.internal.InlineOnly
    private static final void j(char[] r1) {
            java.lang.String r0 = "message"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.getClass()
            return
    }

    @kotlin.internal.InlineOnly
    private static final void k() {
            java.io.PrintStream r0 = java.lang.System.out
            r0.getClass()
            return
    }

    @kotlin.internal.InlineOnly
    private static final void l(byte r0) {
            java.io.PrintStream r0 = java.lang.System.out
            r0.getClass()
            return
    }

    @kotlin.internal.InlineOnly
    private static final void m(char r0) {
            java.io.PrintStream r0 = java.lang.System.out
            r0.getClass()
            return
    }

    @kotlin.internal.InlineOnly
    private static final void n(double r0) {
            java.io.PrintStream r0 = java.lang.System.out
            r0.getClass()
            return
    }

    @kotlin.internal.InlineOnly
    private static final void o(float r0) {
            java.io.PrintStream r0 = java.lang.System.out
            r0.getClass()
            return
    }

    @kotlin.internal.InlineOnly
    private static final void p(int r0) {
            java.io.PrintStream r0 = java.lang.System.out
            r0.getClass()
            return
    }

    @kotlin.internal.InlineOnly
    private static final void q(long r0) {
            java.io.PrintStream r0 = java.lang.System.out
            r0.getClass()
            return
    }

    @kotlin.internal.InlineOnly
    private static final void r(java.lang.Object r0) {
            java.io.PrintStream r0 = java.lang.System.out
            r0.getClass()
            return
    }

    @kotlin.internal.InlineOnly
    private static final void s(short r0) {
            java.io.PrintStream r0 = java.lang.System.out
            r0.getClass()
            return
    }

    @kotlin.internal.InlineOnly
    private static final void t(boolean r0) {
            java.io.PrintStream r0 = java.lang.System.out
            r0.getClass()
            return
    }

    @kotlin.internal.InlineOnly
    private static final void u(char[] r1) {
            java.lang.String r0 = "message"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.getClass()
            return
    }

    @org.jetbrains.annotations.Nullable
    public static final java.lang.String v() {
            kotlin.io.p r0 = kotlin.io.p.a
            java.io.InputStream r1 = java.lang.System.in
            java.lang.String r2 = "in"
            kotlin.jvm.internal.g0.o(r1, r2)
            java.nio.charset.Charset r2 = java.nio.charset.Charset.defaultCharset()
            java.lang.String r3 = "defaultCharset(...)"
            kotlin.jvm.internal.g0.o(r2, r3)
            java.lang.String r0 = r0.d(r1, r2)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.6")
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String w() {
            java.lang.String r0 = x()
            if (r0 == 0) goto L7
            return r0
        L7:
            kotlin.io.ReadAfterEOFException r0 = new kotlin.io.ReadAfterEOFException
            java.lang.String r1 = "EOF has already been reached"
            r0.<init>(r1)
            throw r0
    }

    @kotlin.SinceKotlin(version = "1.6")
    @org.jetbrains.annotations.Nullable
    public static final java.lang.String x() {
            java.lang.String r0 = v()
            return r0
    }
}
