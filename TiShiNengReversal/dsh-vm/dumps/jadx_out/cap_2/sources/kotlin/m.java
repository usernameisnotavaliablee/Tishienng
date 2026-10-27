package kotlin;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
class m {
    public m() {
            r0 = this;
            r0.<init>()
            return
    }

    @kotlin.SinceKotlin(version = "1.1")
    @kotlin.internal.HidesMembers
    public static void a(@org.jetbrains.annotations.NotNull java.lang.Throwable r1, @org.jetbrains.annotations.NotNull java.lang.Throwable r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "exception"
            kotlin.jvm.internal.g0.p(r2, r0)
            if (r1 == r2) goto L11
            kotlin.internal.a r0 = kotlin.internal.b.a
            r0.a(r1, r2)
        L11:
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.StackTraceElement[] b(@org.jetbrains.annotations.NotNull java.lang.Throwable r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.StackTraceElement[] r1 = r1.getStackTrace()
            kotlin.jvm.internal.g0.m(r1)
            return r1
    }

    public static /* synthetic */ void c(java.lang.Throwable r0) {
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final java.util.List<java.lang.Throwable> d(@org.jetbrains.annotations.NotNull java.lang.Throwable r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.internal.a r0 = kotlin.internal.b.a
            java.util.List r1 = r0.d(r1)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.4")
    public static /* synthetic */ void e(java.lang.Throwable r0) {
            return
    }

    @kotlin.internal.InlineOnly
    private static final void f(java.lang.Throwable r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            r1.getClass()
            return
    }

    @kotlin.internal.InlineOnly
    private static final void g(java.lang.Throwable r1, java.io.PrintStream r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "stream"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.getClass()
            return
    }

    @kotlin.internal.InlineOnly
    private static final void h(java.lang.Throwable r1, java.io.PrintWriter r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "writer"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.getClass()
            return
    }

    @kotlin.SinceKotlin(version = "1.4")
    @org.jetbrains.annotations.NotNull
    public static java.lang.String i(@org.jetbrains.annotations.NotNull java.lang.Throwable r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.io.StringWriter r0 = new java.io.StringWriter
            r0.<init>()
            java.io.PrintWriter r1 = new java.io.PrintWriter
            r1.<init>(r0)
            r2.getClass()
            r1.flush()
            java.lang.String r2 = r0.toString()
            java.lang.String r0 = "toString(...)"
            kotlin.jvm.internal.g0.o(r2, r0)
            return r2
    }
}
