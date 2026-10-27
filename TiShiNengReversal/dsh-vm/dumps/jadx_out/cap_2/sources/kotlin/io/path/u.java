package kotlin.io.path;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class u extends java.nio.file.SimpleFileVisitor<java.nio.file.Path> {

    @org.jetbrains.annotations.Nullable
    private final kotlin.jvm.functions.Function2<java.nio.file.Path, java.nio.file.attribute.BasicFileAttributes, java.nio.file.FileVisitResult> a;

    @org.jetbrains.annotations.Nullable
    private final kotlin.jvm.functions.Function2<java.nio.file.Path, java.nio.file.attribute.BasicFileAttributes, java.nio.file.FileVisitResult> b;

    @org.jetbrains.annotations.Nullable
    private final kotlin.jvm.functions.Function2<java.nio.file.Path, java.io.IOException, java.nio.file.FileVisitResult> c;

    @org.jetbrains.annotations.Nullable
    private final kotlin.jvm.functions.Function2<java.nio.file.Path, java.io.IOException, java.nio.file.FileVisitResult> d;

    public u(@org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super java.nio.file.Path, ? super java.nio.file.attribute.BasicFileAttributes, ? extends java.nio.file.FileVisitResult> r1, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super java.nio.file.Path, ? super java.nio.file.attribute.BasicFileAttributes, ? extends java.nio.file.FileVisitResult> r2, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super java.nio.file.Path, ? super java.io.IOException, ? extends java.nio.file.FileVisitResult> r3, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super java.nio.file.Path, ? super java.io.IOException, ? extends java.nio.file.FileVisitResult> r4) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            return
    }

    @org.jetbrains.annotations.NotNull
    public java.nio.file.FileVisitResult a(@org.jetbrains.annotations.NotNull java.nio.file.Path r2, @org.jetbrains.annotations.Nullable java.io.IOException r3) {
            r1 = this;
            java.lang.String r0 = "dir"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.jvm.functions.Function2<java.nio.file.Path, java.io.IOException, java.nio.file.FileVisitResult> r0 = r1.d
            if (r0 == 0) goto L15
            java.lang.Object r0 = r0.invoke(r2, r3)
            java.nio.file.FileVisitResult r0 = kotlin.io.path.t.a(r0)
            if (r0 != 0) goto L14
            goto L15
        L14:
            return r0
        L15:
            java.nio.file.FileVisitResult r2 = super.postVisitDirectory(r2, r3)
            java.lang.String r3 = "postVisitDirectory(...)"
            kotlin.jvm.internal.g0.o(r2, r3)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public java.nio.file.FileVisitResult b(@org.jetbrains.annotations.NotNull java.nio.file.Path r2, @org.jetbrains.annotations.NotNull java.nio.file.attribute.BasicFileAttributes r3) {
            r1 = this;
            java.lang.String r0 = "dir"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "attrs"
            kotlin.jvm.internal.g0.p(r3, r0)
            kotlin.jvm.functions.Function2<java.nio.file.Path, java.nio.file.attribute.BasicFileAttributes, java.nio.file.FileVisitResult> r0 = r1.a
            if (r0 == 0) goto L1a
            java.lang.Object r0 = r0.invoke(r2, r3)
            java.nio.file.FileVisitResult r0 = kotlin.io.path.t.a(r0)
            if (r0 != 0) goto L19
            goto L1a
        L19:
            return r0
        L1a:
            java.nio.file.FileVisitResult r2 = super.preVisitDirectory(r2, r3)
            java.lang.String r3 = "preVisitDirectory(...)"
            kotlin.jvm.internal.g0.o(r2, r3)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public java.nio.file.FileVisitResult c(@org.jetbrains.annotations.NotNull java.nio.file.Path r2, @org.jetbrains.annotations.NotNull java.nio.file.attribute.BasicFileAttributes r3) {
            r1 = this;
            java.lang.String r0 = "file"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "attrs"
            kotlin.jvm.internal.g0.p(r3, r0)
            kotlin.jvm.functions.Function2<java.nio.file.Path, java.nio.file.attribute.BasicFileAttributes, java.nio.file.FileVisitResult> r0 = r1.b
            if (r0 == 0) goto L1a
            java.lang.Object r0 = r0.invoke(r2, r3)
            java.nio.file.FileVisitResult r0 = kotlin.io.path.t.a(r0)
            if (r0 != 0) goto L19
            goto L1a
        L19:
            return r0
        L1a:
            java.nio.file.FileVisitResult r2 = super.visitFile(r2, r3)
            java.lang.String r3 = "visitFile(...)"
            kotlin.jvm.internal.g0.o(r2, r3)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public java.nio.file.FileVisitResult d(@org.jetbrains.annotations.NotNull java.nio.file.Path r2, @org.jetbrains.annotations.NotNull java.io.IOException r3) {
            r1 = this;
            java.lang.String r0 = "file"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "exc"
            kotlin.jvm.internal.g0.p(r3, r0)
            kotlin.jvm.functions.Function2<java.nio.file.Path, java.io.IOException, java.nio.file.FileVisitResult> r0 = r1.c
            if (r0 == 0) goto L1a
            java.lang.Object r0 = r0.invoke(r2, r3)
            java.nio.file.FileVisitResult r0 = kotlin.io.path.t.a(r0)
            if (r0 != 0) goto L19
            goto L1a
        L19:
            return r0
        L1a:
            java.nio.file.FileVisitResult r2 = super.visitFileFailed(r2, r3)
            java.lang.String r3 = "visitFileFailed(...)"
            kotlin.jvm.internal.g0.o(r2, r3)
            return r2
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ java.nio.file.FileVisitResult postVisitDirectory(java.lang.Object r1, java.io.IOException r2) {
            r0 = this;
            java.nio.file.Path r1 = kotlin.io.path.f.a(r1)
            java.nio.file.FileVisitResult r1 = r0.a(r1, r2)
            return r1
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ java.nio.file.FileVisitResult preVisitDirectory(java.lang.Object r1, java.nio.file.attribute.BasicFileAttributes r2) {
            r0 = this;
            java.nio.file.Path r1 = kotlin.io.path.f.a(r1)
            java.nio.file.FileVisitResult r1 = r0.b(r1, r2)
            return r1
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ java.nio.file.FileVisitResult visitFile(java.lang.Object r1, java.nio.file.attribute.BasicFileAttributes r2) {
            r0 = this;
            java.nio.file.Path r1 = kotlin.io.path.f.a(r1)
            java.nio.file.FileVisitResult r1 = r0.c(r1, r2)
            return r1
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ java.nio.file.FileVisitResult visitFileFailed(java.lang.Object r1, java.io.IOException r2) {
            r0 = this;
            java.nio.file.Path r1 = kotlin.io.path.f.a(r1)
            java.nio.file.FileVisitResult r1 = r0.d(r1, r2)
            return r1
    }
}
