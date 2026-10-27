package kotlin.io.path;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nPathTreeWalk.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathTreeWalk.kt\nkotlin/io/path/DirectoryEntriesReader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,180:1\n1#2:181\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class i extends java.nio.file.SimpleFileVisitor<java.nio.file.Path> {
    private final boolean a;

    @org.jetbrains.annotations.Nullable
    private kotlin.io.path.x b;

    @org.jetbrains.annotations.NotNull
    private kotlin.collections.m<kotlin.io.path.x> c;

    public i(boolean r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            kotlin.collections.m r1 = new kotlin.collections.m
            r1.<init>()
            r0.c = r1
            return
    }

    public final boolean a() {
            r1 = this;
            boolean r0 = r1.a
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.nio.file.FileVisitResult b(@org.jetbrains.annotations.NotNull java.nio.file.Path r4, @org.jetbrains.annotations.NotNull java.nio.file.attribute.BasicFileAttributes r5) {
            r3 = this;
            java.lang.String r0 = "dir"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "attrs"
            kotlin.jvm.internal.g0.p(r5, r0)
            kotlin.io.path.x r0 = new kotlin.io.path.x
            java.lang.Object r1 = kotlin.io.path.e.a(r5)
            kotlin.io.path.x r2 = r3.b
            r0.<init>(r4, r1, r2)
            kotlin.collections.m<kotlin.io.path.x> r1 = r3.c
            r1.add(r0)
            java.nio.file.FileVisitResult r4 = super.preVisitDirectory(r4, r5)
            java.lang.String r5 = "preVisitDirectory(...)"
            kotlin.jvm.internal.g0.o(r4, r5)
            return r4
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<kotlin.io.path.x> c(@org.jetbrains.annotations.NotNull kotlin.io.path.x r4) {
            r3 = this;
            java.lang.String r0 = "directoryNode"
            kotlin.jvm.internal.g0.p(r4, r0)
            r3.b = r4
            java.nio.file.Path r4 = r4.d()
            kotlin.io.path.w r0 = kotlin.io.path.w.a
            boolean r1 = r3.a
            java.util.Set r0 = r0.b(r1)
            r1 = 1
            java.nio.file.FileVisitor r2 = kotlin.io.path.g.a(r3)
            kotlin.io.path.h.a(r4, r0, r1, r2)
            kotlin.collections.m<kotlin.io.path.x> r4 = r3.c
            r4.removeFirst()
            kotlin.collections.m<kotlin.io.path.x> r4 = r3.c
            kotlin.collections.m r0 = new kotlin.collections.m
            r0.<init>()
            r3.c = r0
            return r4
    }

    @org.jetbrains.annotations.NotNull
    public java.nio.file.FileVisitResult d(@org.jetbrains.annotations.NotNull java.nio.file.Path r4, @org.jetbrains.annotations.NotNull java.nio.file.attribute.BasicFileAttributes r5) {
            r3 = this;
            java.lang.String r0 = "file"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "attrs"
            kotlin.jvm.internal.g0.p(r5, r0)
            kotlin.io.path.x r0 = new kotlin.io.path.x
            r1 = 0
            kotlin.io.path.x r2 = r3.b
            r0.<init>(r4, r1, r2)
            kotlin.collections.m<kotlin.io.path.x> r1 = r3.c
            r1.add(r0)
            java.nio.file.FileVisitResult r4 = super.visitFile(r4, r5)
            java.lang.String r5 = "visitFile(...)"
            kotlin.jvm.internal.g0.o(r4, r5)
            return r4
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
            java.nio.file.FileVisitResult r1 = r0.d(r1, r2)
            return r1
    }
}
