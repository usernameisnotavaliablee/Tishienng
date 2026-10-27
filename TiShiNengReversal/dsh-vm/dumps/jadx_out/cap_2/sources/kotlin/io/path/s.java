package kotlin.io.path;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class s implements kotlin.io.path.r {

    @org.jetbrains.annotations.Nullable
    private kotlin.jvm.functions.Function2<? super java.nio.file.Path, ? super java.nio.file.attribute.BasicFileAttributes, ? extends java.nio.file.FileVisitResult> a;

    @org.jetbrains.annotations.Nullable
    private kotlin.jvm.functions.Function2<? super java.nio.file.Path, ? super java.nio.file.attribute.BasicFileAttributes, ? extends java.nio.file.FileVisitResult> b;

    @org.jetbrains.annotations.Nullable
    private kotlin.jvm.functions.Function2<? super java.nio.file.Path, ? super java.io.IOException, ? extends java.nio.file.FileVisitResult> c;

    @org.jetbrains.annotations.Nullable
    private kotlin.jvm.functions.Function2<? super java.nio.file.Path, ? super java.io.IOException, ? extends java.nio.file.FileVisitResult> d;
    private boolean e;

    public s() {
            r0 = this;
            r0.<init>()
            return
    }

    private final void f() {
            r2 = this;
            boolean r0 = r2.e
            if (r0 != 0) goto L5
            return
        L5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "This builder was already built"
            r0.<init>(r1)
            throw r0
    }

    private final void g(java.lang.Object r2, java.lang.String r3) {
            r1 = this;
            if (r2 != 0) goto L3
            return
        L3:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            java.lang.String r3 = " was already defined"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.<init>(r3)
            throw r2
    }

    @Override // kotlin.io.path.r
    public void a(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super java.nio.file.Path, ? super java.io.IOException, ? extends java.nio.file.FileVisitResult> r3) {
            r2 = this;
            java.lang.String r0 = "function"
            kotlin.jvm.internal.g0.p(r3, r0)
            r2.f()
            kotlin.jvm.functions.Function2<? super java.nio.file.Path, ? super java.io.IOException, ? extends java.nio.file.FileVisitResult> r0 = r2.d
            java.lang.String r1 = "onPostVisitDirectory"
            r2.g(r0, r1)
            r2.d = r3
            return
    }

    @Override // kotlin.io.path.r
    public void b(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super java.nio.file.Path, ? super java.nio.file.attribute.BasicFileAttributes, ? extends java.nio.file.FileVisitResult> r3) {
            r2 = this;
            java.lang.String r0 = "function"
            kotlin.jvm.internal.g0.p(r3, r0)
            r2.f()
            kotlin.jvm.functions.Function2<? super java.nio.file.Path, ? super java.nio.file.attribute.BasicFileAttributes, ? extends java.nio.file.FileVisitResult> r0 = r2.b
            java.lang.String r1 = "onVisitFile"
            r2.g(r0, r1)
            r2.b = r3
            return
    }

    @Override // kotlin.io.path.r
    public void c(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super java.nio.file.Path, ? super java.nio.file.attribute.BasicFileAttributes, ? extends java.nio.file.FileVisitResult> r3) {
            r2 = this;
            java.lang.String r0 = "function"
            kotlin.jvm.internal.g0.p(r3, r0)
            r2.f()
            kotlin.jvm.functions.Function2<? super java.nio.file.Path, ? super java.nio.file.attribute.BasicFileAttributes, ? extends java.nio.file.FileVisitResult> r0 = r2.a
            java.lang.String r1 = "onPreVisitDirectory"
            r2.g(r0, r1)
            r2.a = r3
            return
    }

    @Override // kotlin.io.path.r
    public void d(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super java.nio.file.Path, ? super java.io.IOException, ? extends java.nio.file.FileVisitResult> r3) {
            r2 = this;
            java.lang.String r0 = "function"
            kotlin.jvm.internal.g0.p(r3, r0)
            r2.f()
            kotlin.jvm.functions.Function2<? super java.nio.file.Path, ? super java.io.IOException, ? extends java.nio.file.FileVisitResult> r0 = r2.c
            java.lang.String r1 = "onVisitFileFailed"
            r2.g(r0, r1)
            r2.c = r3
            return
    }

    @org.jetbrains.annotations.NotNull
    public final java.nio.file.FileVisitor<java.nio.file.Path> e() {
            r5 = this;
            r5.f()
            r0 = 1
            r5.e = r0
            kotlin.io.path.u r0 = new kotlin.io.path.u
            kotlin.jvm.functions.Function2<? super java.nio.file.Path, ? super java.nio.file.attribute.BasicFileAttributes, ? extends java.nio.file.FileVisitResult> r1 = r5.a
            kotlin.jvm.functions.Function2<? super java.nio.file.Path, ? super java.nio.file.attribute.BasicFileAttributes, ? extends java.nio.file.FileVisitResult> r2 = r5.b
            kotlin.jvm.functions.Function2<? super java.nio.file.Path, ? super java.io.IOException, ? extends java.nio.file.FileVisitResult> r3 = r5.c
            kotlin.jvm.functions.Function2<? super java.nio.file.Path, ? super java.io.IOException, ? extends java.nio.file.FileVisitResult> r4 = r5.d
            r0.<init>(r1, r2, r3, r4)
            java.nio.file.FileVisitor r0 = kotlin.io.path.g.a(r0)
            return r0
    }
}
