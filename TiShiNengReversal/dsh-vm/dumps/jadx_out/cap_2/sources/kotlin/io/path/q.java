package kotlin.io.path;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class q {
    private final int a;
    private int b;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<java.lang.Exception> c;

    @org.jetbrains.annotations.Nullable
    private java.nio.file.Path d;

    public q() {
            r3 = this;
            r0 = 1
            r1 = 0
            r2 = 0
            r3.<init>(r2, r0, r1)
            return
    }

    public q(int r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.c = r1
            return
    }

    public /* synthetic */ q(int r1, int r2, kotlin.jvm.internal.v r3) {
            r0 = this;
            r2 = r2 & 1
            if (r2 == 0) goto L6
            r1 = 64
        L6:
            r0.<init>(r1)
            return
    }

    public final void a(@org.jetbrains.annotations.NotNull java.lang.Exception r3) {
            r2 = this;
            java.lang.String r0 = "exception"
            kotlin.jvm.internal.g0.p(r3, r0)
            int r0 = r2.b
            int r0 = r0 + 1
            r2.b = r0
            java.util.List<java.lang.Exception> r0 = r2.c
            int r0 = r0.size()
            int r1 = r2.a
            if (r0 >= r1) goto L38
            java.nio.file.Path r0 = r2.d
            if (r0 == 0) goto L33
            kotlin.io.path.p.a()
            java.nio.file.Path r0 = r2.d
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.nio.file.FileSystemException r0 = kotlin.io.path.o.a(r0)
            java.lang.Throwable r3 = kotlin.io.path.m.a(r0, r3)
            java.lang.String r0 = "null cannot be cast to non-null type java.nio.file.FileSystemException"
            kotlin.jvm.internal.g0.n(r3, r0)
            java.nio.file.FileSystemException r3 = kotlin.io.path.n.a(r3)
        L33:
            java.util.List<java.lang.Exception> r0 = r2.c
            r0.add(r3)
        L38:
            return
    }

    public final void b(@org.jetbrains.annotations.NotNull java.nio.file.Path r2) {
            r1 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.nio.file.Path r0 = r1.d
            if (r0 == 0) goto Le
            java.nio.file.Path r2 = kotlin.io.path.j.a(r0, r2)
            goto Lf
        Le:
            r2 = 0
        Lf:
            r1.d = r2
            return
    }

    public final void c(@org.jetbrains.annotations.NotNull java.nio.file.Path r3) {
            r2 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.nio.file.Path r0 = r2.d
            r1 = 0
            if (r0 == 0) goto Lf
            java.nio.file.Path r0 = kotlin.io.path.k.a(r0)
            goto L10
        Lf:
            r0 = r1
        L10:
            boolean r3 = kotlin.jvm.internal.g0.g(r3, r0)
            if (r3 == 0) goto L21
            java.nio.file.Path r3 = r2.d
            if (r3 == 0) goto L1e
            java.nio.file.Path r1 = kotlin.io.path.l.a(r3)
        L1e:
            r2.d = r1
            return
        L21:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Failed requirement."
            r3.<init>(r0)
            throw r3
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.Exception> d() {
            r1 = this;
            java.util.List<java.lang.Exception> r0 = r1.c
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.nio.file.Path e() {
            r1 = this;
            java.nio.file.Path r0 = r1.d
            return r0
    }

    public final int f() {
            r1 = this;
            int r0 = r1.b
            return r0
    }

    public final void g(@org.jetbrains.annotations.Nullable java.nio.file.Path r1) {
            r0 = this;
            r0.d = r1
            return
    }
}
