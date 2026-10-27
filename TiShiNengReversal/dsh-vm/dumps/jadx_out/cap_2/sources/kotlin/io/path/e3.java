package kotlin.io.path;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nPathUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathUtils.kt\nkotlin/io/path/PathsKt__PathUtilsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1195:1\n1#2:1196\n1869#3,2:1197\n*S KotlinDebug\n*F\n+ 1 PathUtils.kt\nkotlin/io/path/PathsKt__PathUtilsKt\n*L\n415#1:1197,2\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
class e3 extends kotlin.io.path.y1 {
    public e3() {
            r0 = this;
            r0.<init>()
            return
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.internal.InlineOnly
    private static final java.nio.file.Path A0(java.lang.String r1, java.nio.file.attribute.FileAttribute<?>... r2) throws java.io.IOException {
            java.lang.String r0 = "attributes"
            kotlin.jvm.internal.g0.p(r2, r0)
            int r0 = r2.length
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r0)
            java.nio.file.attribute.FileAttribute[] r2 = (java.nio.file.attribute.FileAttribute[]) r2
            java.nio.file.Path r1 = kotlin.io.path.a2.a(r1, r2)
            java.lang.String r2 = "createTempDirectory(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.internal.InlineOnly
    private static final java.util.Map<java.lang.String, java.lang.Object> A1(java.nio.file.Path r1, java.lang.String r2, java.nio.file.LinkOption... r3) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "attributes"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "options"
            kotlin.jvm.internal.g0.p(r3, r0)
            int r0 = r3.length
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r0)
            java.nio.file.LinkOption[] r3 = (java.nio.file.LinkOption[]) r3
            java.util.Map r1 = kotlin.io.path.t2.a(r1, r2, r3)
            java.lang.String r2 = "readAttributes(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.5")
    @org.jetbrains.annotations.NotNull
    public static final java.nio.file.Path B0(@org.jetbrains.annotations.Nullable java.nio.file.Path r2, @org.jetbrains.annotations.Nullable java.lang.String r3, @org.jetbrains.annotations.NotNull java.nio.file.attribute.FileAttribute<?>... r4) throws java.io.IOException {
            java.lang.String r0 = "attributes"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "createTempDirectory(...)"
            if (r2 == 0) goto L18
            int r1 = r4.length
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r1)
            java.nio.file.attribute.FileAttribute[] r4 = (java.nio.file.attribute.FileAttribute[]) r4
            java.nio.file.Path r2 = kotlin.io.path.b3.a(r2, r3, r4)
            kotlin.jvm.internal.g0.o(r2, r0)
            return r2
        L18:
            int r2 = r4.length
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r4, r2)
            java.nio.file.attribute.FileAttribute[] r2 = (java.nio.file.attribute.FileAttribute[]) r2
            java.nio.file.Path r2 = kotlin.io.path.a2.a(r3, r2)
            kotlin.jvm.internal.g0.o(r2, r0)
            return r2
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.internal.InlineOnly
    private static final java.nio.file.Path B1(java.nio.file.Path r1) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.nio.file.Path r1 = com.huawei.secure.android.common.util.h0.a(r1)
            java.lang.String r0 = "readSymbolicLink(...)"
            kotlin.jvm.internal.g0.o(r1, r0)
            return r1
    }

    static /* synthetic */ java.nio.file.Path C0(java.lang.String r0, java.nio.file.attribute.FileAttribute[] r1, int r2, java.lang.Object r3) throws java.io.IOException {
            r2 = r2 & 1
            if (r2 == 0) goto L5
            r0 = 0
        L5:
            java.lang.String r2 = "attributes"
            kotlin.jvm.internal.g0.p(r1, r2)
            int r2 = r1.length
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r2)
            java.nio.file.attribute.FileAttribute[] r1 = (java.nio.file.attribute.FileAttribute[]) r1
            java.nio.file.Path r0 = kotlin.io.path.a2.a(r0, r1)
            java.lang.String r1 = "createTempDirectory(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.5")
    @org.jetbrains.annotations.NotNull
    public static final java.nio.file.Path C1(@org.jetbrains.annotations.NotNull java.nio.file.Path r4, @org.jetbrains.annotations.NotNull java.nio.file.Path r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "base"
            kotlin.jvm.internal.g0.p(r5, r0)
            kotlin.io.path.d0 r0 = kotlin.io.path.d0.a     // Catch: java.lang.IllegalArgumentException -> L11
            java.nio.file.Path r4 = r0.a(r4, r5)     // Catch: java.lang.IllegalArgumentException -> L11
            return r4
        L11:
            r0 = move-exception
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r0.getMessage()
            r2.append(r3)
            java.lang.String r3 = "\nthis path: "
            r2.append(r3)
            r2.append(r4)
            java.lang.String r4 = "\nbase path: "
            r2.append(r4)
            r2.append(r5)
            java.lang.String r4 = r2.toString()
            r1.<init>(r4, r0)
            throw r1
    }

    public static /* synthetic */ java.nio.file.Path D0(java.nio.file.Path r0, java.lang.String r1, java.nio.file.attribute.FileAttribute[] r2, int r3, java.lang.Object r4) throws java.io.IOException {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r1 = 0
        L5:
            java.nio.file.Path r0 = B0(r0, r1, r2)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.5")
    @org.jetbrains.annotations.Nullable
    public static final java.nio.file.Path D1(@org.jetbrains.annotations.NotNull java.nio.file.Path r1, @org.jetbrains.annotations.NotNull java.nio.file.Path r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "base"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.io.path.d0 r0 = kotlin.io.path.d0.a     // Catch: java.lang.IllegalArgumentException -> L11
            java.nio.file.Path r1 = r0.a(r1, r2)     // Catch: java.lang.IllegalArgumentException -> L11
            return r1
        L11:
            r1 = 0
            return r1
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.internal.InlineOnly
    private static final java.nio.file.Path E0(java.lang.String r1, java.lang.String r2, java.nio.file.attribute.FileAttribute<?>... r3) throws java.io.IOException {
            java.lang.String r0 = "attributes"
            kotlin.jvm.internal.g0.p(r3, r0)
            int r0 = r3.length
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r0)
            java.nio.file.attribute.FileAttribute[] r3 = (java.nio.file.attribute.FileAttribute[]) r3
            java.nio.file.Path r1 = kotlin.io.path.d2.a(r1, r2, r3)
            java.lang.String r2 = "createTempFile(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.5")
    @org.jetbrains.annotations.NotNull
    public static final java.nio.file.Path E1(@org.jetbrains.annotations.NotNull java.nio.file.Path r1, @org.jetbrains.annotations.NotNull java.nio.file.Path r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "base"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.nio.file.Path r2 = D1(r1, r2)
            if (r2 != 0) goto L11
            return r1
        L11:
            return r2
    }

    @kotlin.SinceKotlin(version = "1.5")
    @org.jetbrains.annotations.NotNull
    public static final java.nio.file.Path F0(@org.jetbrains.annotations.Nullable java.nio.file.Path r2, @org.jetbrains.annotations.Nullable java.lang.String r3, @org.jetbrains.annotations.Nullable java.lang.String r4, @org.jetbrains.annotations.NotNull java.nio.file.attribute.FileAttribute<?>... r5) throws java.io.IOException {
            java.lang.String r0 = "attributes"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r0 = "createTempFile(...)"
            if (r2 == 0) goto L18
            int r1 = r5.length
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r5, r1)
            java.nio.file.attribute.FileAttribute[] r5 = (java.nio.file.attribute.FileAttribute[]) r5
            java.nio.file.Path r2 = kotlin.io.path.q2.a(r2, r3, r4, r5)
            kotlin.jvm.internal.g0.o(r2, r0)
            return r2
        L18:
            int r2 = r5.length
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r5, r2)
            java.nio.file.attribute.FileAttribute[] r2 = (java.nio.file.attribute.FileAttribute[]) r2
            java.nio.file.Path r2 = kotlin.io.path.d2.a(r3, r4, r2)
            kotlin.jvm.internal.g0.o(r2, r0)
            return r2
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.internal.InlineOnly
    private static final java.nio.file.Path F1(java.nio.file.Path r1, java.lang.String r2, java.lang.Object r3, java.nio.file.LinkOption... r4) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "attribute"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "options"
            kotlin.jvm.internal.g0.p(r4, r0)
            int r0 = r4.length
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r0)
            java.nio.file.LinkOption[] r4 = (java.nio.file.LinkOption[]) r4
            java.nio.file.Path r1 = kotlin.io.path.g2.a(r1, r2, r3, r4)
            java.lang.String r2 = "setAttribute(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            return r1
    }

    static /* synthetic */ java.nio.file.Path G0(java.lang.String r1, java.lang.String r2, java.nio.file.attribute.FileAttribute[] r3, int r4, java.lang.Object r5) throws java.io.IOException {
            r5 = r4 & 1
            r0 = 0
            if (r5 == 0) goto L6
            r1 = r0
        L6:
            r4 = r4 & 2
            if (r4 == 0) goto Lb
            r2 = r0
        Lb:
            java.lang.String r4 = "attributes"
            kotlin.jvm.internal.g0.p(r3, r4)
            int r4 = r3.length
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r4)
            java.nio.file.attribute.FileAttribute[] r3 = (java.nio.file.attribute.FileAttribute[]) r3
            java.nio.file.Path r1 = kotlin.io.path.d2.a(r1, r2, r3)
            java.lang.String r2 = "createTempFile(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.internal.InlineOnly
    private static final java.nio.file.Path G1(java.nio.file.Path r1, java.nio.file.attribute.FileTime r2) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "value"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.nio.file.Path r1 = kotlin.io.path.n2.a(r1, r2)
            java.lang.String r2 = "setLastModifiedTime(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            return r1
    }

    public static /* synthetic */ java.nio.file.Path H0(java.nio.file.Path r1, java.lang.String r2, java.lang.String r3, java.nio.file.attribute.FileAttribute[] r4, int r5, java.lang.Object r6) throws java.io.IOException {
            r6 = r5 & 2
            r0 = 0
            if (r6 == 0) goto L6
            r2 = r0
        L6:
            r5 = r5 & 4
            if (r5 == 0) goto Lb
            r3 = r0
        Lb:
            java.nio.file.Path r1 = F0(r1, r2, r3, r4)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.internal.InlineOnly
    private static final java.nio.file.Path H1(java.nio.file.Path r1, java.nio.file.attribute.UserPrincipal r2) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "value"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.nio.file.Path r1 = kotlin.io.path.o2.a(r1, r2)
            java.lang.String r2 = "setOwner(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.internal.InlineOnly
    private static final void I0(java.nio.file.Path r1) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.io.path.l2.a(r1)
            return
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.internal.InlineOnly
    private static final java.nio.file.Path I1(java.nio.file.Path r1, java.util.Set<? extends java.nio.file.attribute.PosixFilePermission> r2) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "value"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.nio.file.Path r1 = io.netty.util.internal.f.a(r1, r2)
            java.lang.String r2 = "setPosixFilePermissions(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.internal.InlineOnly
    private static final boolean J0(java.nio.file.Path r1) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            boolean r1 = kotlin.io.path.s1.a(r1)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.internal.InlineOnly
    private static final java.nio.file.Path J1(java.net.URI r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.nio.file.Path r1 = kotlin.io.path.c2.a(r1)
            java.lang.String r0 = "get(...)"
            kotlin.jvm.internal.g0.o(r1, r0)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.internal.InlineOnly
    private static final java.nio.file.Path K0(java.nio.file.Path r1, java.lang.String r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "other"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.nio.file.Path r1 = kotlin.io.path.e1.a(r1, r2)
            java.lang.String r2 = "resolve(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.internal.InlineOnly
    private static final <T> T K1(java.nio.file.Path r1, java.lang.String r2, kotlin.jvm.functions.Function1<? super kotlin.sequences.m<? extends java.nio.file.Path>, ? extends T> r3) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "glob"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "block"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.nio.file.DirectoryStream r1 = kotlin.io.path.j2.a(r1, r2)
            r2 = 1
            java.nio.file.DirectoryStream r0 = kotlin.io.path.m1.a(r1)     // Catch: java.lang.Throwable -> L2e
            kotlin.jvm.internal.g0.m(r0)     // Catch: java.lang.Throwable -> L2e
            kotlin.sequences.m r0 = kotlin.collections.f0.E1(r0)     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r3 = r3.invoke(r0)     // Catch: java.lang.Throwable -> L2e
            kotlin.jvm.internal.d0.d(r2)
            r0 = 0
            kotlin.io.b.a(r1, r0)
            kotlin.jvm.internal.d0.c(r2)
            return r3
        L2e:
            r3 = move-exception
            throw r3     // Catch: java.lang.Throwable -> L30
        L30:
            r0 = move-exception
            kotlin.jvm.internal.d0.d(r2)
            kotlin.io.b.a(r1, r3)
            kotlin.jvm.internal.d0.c(r2)
            throw r0
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.internal.InlineOnly
    private static final java.nio.file.Path L0(java.nio.file.Path r1, java.nio.file.Path r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "other"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.nio.file.Path r1 = kotlin.io.path.j.a(r1, r2)
            java.lang.String r2 = "resolve(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            return r1
    }

    static /* synthetic */ java.lang.Object L1(java.nio.file.Path r0, java.lang.String r1, kotlin.jvm.functions.Function1 r2, int r3, java.lang.Object r4) throws java.io.IOException {
            r4 = 1
            r3 = r3 & r4
            if (r3 == 0) goto L6
            java.lang.String r1 = "*"
        L6:
            java.lang.String r3 = "<this>"
            kotlin.jvm.internal.g0.p(r0, r3)
            java.lang.String r3 = "glob"
            kotlin.jvm.internal.g0.p(r1, r3)
            java.lang.String r3 = "block"
            kotlin.jvm.internal.g0.p(r2, r3)
            java.nio.file.DirectoryStream r0 = kotlin.io.path.j2.a(r0, r1)
            java.nio.file.DirectoryStream r1 = kotlin.io.path.m1.a(r0)     // Catch: java.lang.Throwable -> L33
            kotlin.jvm.internal.g0.m(r1)     // Catch: java.lang.Throwable -> L33
            kotlin.sequences.m r1 = kotlin.collections.f0.E1(r1)     // Catch: java.lang.Throwable -> L33
            java.lang.Object r1 = r2.invoke(r1)     // Catch: java.lang.Throwable -> L33
            kotlin.jvm.internal.d0.d(r4)
            r2 = 0
            kotlin.io.b.a(r0, r2)
            kotlin.jvm.internal.d0.c(r4)
            return r1
        L33:
            r1 = move-exception
            throw r1     // Catch: java.lang.Throwable -> L35
        L35:
            r2 = move-exception
            kotlin.jvm.internal.d0.d(r4)
            kotlin.io.b.a(r0, r1)
            kotlin.jvm.internal.d0.c(r4)
            throw r2
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.internal.InlineOnly
    private static final boolean M0(java.nio.file.Path r1, java.nio.file.LinkOption... r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "options"
            kotlin.jvm.internal.g0.p(r2, r0)
            int r0 = r2.length
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r0)
            java.nio.file.LinkOption[] r2 = (java.nio.file.LinkOption[]) r2
            boolean r1 = kotlin.io.path.e0.a(r1, r2)
            return r1
    }

    @kotlin.SinceKotlin(version = "2.1")
    @kotlin.WasExperimental(markerClass = {kotlin.io.path.ExperimentalPathApi.class})
    public static final void M1(@org.jetbrains.annotations.NotNull java.nio.file.Path r1, int r2, boolean r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super kotlin.io.path.r, kotlin.n1> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "builderAction"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.nio.file.FileVisitor r4 = S0(r4)
            N1(r1, r4, r2, r3)
            return
    }

    @kotlin.PublishedApi
    @org.jetbrains.annotations.NotNull
    public static final java.lang.Void N0(@org.jetbrains.annotations.NotNull java.nio.file.Path r3, @org.jetbrains.annotations.NotNull java.lang.Class<?> r4) {
            java.lang.String r0 = "path"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "attributeViewClass"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "The desired attribute view type "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = " is not available for the file "
            r1.append(r4)
            r1.append(r3)
            r3 = 46
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    @kotlin.SinceKotlin(version = "2.1")
    @kotlin.WasExperimental(markerClass = {kotlin.io.path.ExperimentalPathApi.class})
    public static final void N1(@org.jetbrains.annotations.NotNull java.nio.file.Path r1, @org.jetbrains.annotations.NotNull java.nio.file.FileVisitor<java.nio.file.Path> r2, int r3, boolean r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "visitor"
            kotlin.jvm.internal.g0.p(r2, r0)
            if (r4 == 0) goto L15
            java.nio.file.FileVisitOption r4 = kotlin.io.path.v.a()
            java.util.Set r4 = kotlin.collections.u1.f(r4)
            goto L19
        L15:
            java.util.Set r4 = kotlin.collections.u1.k()
        L19:
            kotlin.io.path.h.a(r1, r4, r3, r2)
            return
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.internal.InlineOnly
    private static final /* synthetic */ <V extends java.nio.file.attribute.FileAttributeView> V O0(java.nio.file.Path r4, java.nio.file.LinkOption... r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "options"
            kotlin.jvm.internal.g0.p(r5, r0)
            r0 = 4
            java.lang.String r1 = "V"
            kotlin.jvm.internal.g0.y(r0, r1)
            java.lang.Class r2 = kotlin.io.path.c3.a()
            int r3 = r5.length
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r5, r3)
            java.nio.file.LinkOption[] r5 = (java.nio.file.LinkOption[]) r5
            java.nio.file.attribute.FileAttributeView r5 = kotlin.io.path.d3.a(r4, r2, r5)
            if (r5 == 0) goto L26
            java.nio.file.attribute.FileAttributeView r4 = kotlin.io.path.b2.a(r5)
            return r4
        L26:
            kotlin.jvm.internal.g0.y(r0, r1)
            java.lang.Class r5 = kotlin.io.path.c3.a()
            N0(r4, r5)
            kotlin.KotlinNothingValueException r4 = new kotlin.KotlinNothingValueException
            r4.<init>()
            throw r4
    }

    public static /* synthetic */ void O1(java.nio.file.Path r0, int r1, boolean r2, kotlin.jvm.functions.Function1 r3, int r4, java.lang.Object r5) {
            r5 = r4 & 1
            if (r5 == 0) goto L7
            r1 = 2147483647(0x7fffffff, float:NaN)
        L7:
            r4 = r4 & 2
            if (r4 == 0) goto Lc
            r2 = 0
        Lc:
            M1(r0, r1, r2, r3)
            return
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.internal.InlineOnly
    private static final /* synthetic */ <V extends java.nio.file.attribute.FileAttributeView> V P0(java.nio.file.Path r2, java.nio.file.LinkOption... r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "options"
            kotlin.jvm.internal.g0.p(r3, r0)
            r0 = 4
            java.lang.String r1 = "V"
            kotlin.jvm.internal.g0.y(r0, r1)
            java.lang.Class r0 = kotlin.io.path.c3.a()
            int r1 = r3.length
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r1)
            java.nio.file.LinkOption[] r3 = (java.nio.file.LinkOption[]) r3
            java.nio.file.attribute.FileAttributeView r2 = kotlin.io.path.d3.a(r2, r0, r3)
            return r2
    }

    public static /* synthetic */ void P1(java.nio.file.Path r0, java.nio.file.FileVisitor r1, int r2, boolean r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L7
            r2 = 2147483647(0x7fffffff, float:NaN)
        L7:
            r4 = r4 & 4
            if (r4 == 0) goto Lc
            r3 = 0
        Lc:
            N1(r0, r1, r2, r3)
            return
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.internal.InlineOnly
    private static final long Q0(java.nio.file.Path r2) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            long r0 = kotlin.io.path.e2.a(r2)
            return r0
    }

    @kotlin.SinceKotlin(version = "2.1")
    @kotlin.WasExperimental(markerClass = {kotlin.io.path.ExperimentalPathApi.class})
    @org.jetbrains.annotations.NotNull
    public static final kotlin.sequences.m<java.nio.file.Path> Q1(@org.jetbrains.annotations.NotNull java.nio.file.Path r1, @org.jetbrains.annotations.NotNull kotlin.io.path.PathWalkOption... r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "options"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.io.path.h0 r0 = new kotlin.io.path.h0
            r0.<init>(r1, r2)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.internal.InlineOnly
    private static final java.nio.file.FileStore R0(java.nio.file.Path r1) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.nio.file.FileStore r1 = kotlin.io.path.h2.a(r1)
            java.lang.String r0 = "getFileStore(...)"
            kotlin.jvm.internal.g0.o(r1, r0)
            return r1
    }

    @kotlin.SinceKotlin(version = "2.1")
    @kotlin.WasExperimental(markerClass = {kotlin.io.path.ExperimentalPathApi.class})
    @org.jetbrains.annotations.NotNull
    public static final java.nio.file.FileVisitor<java.nio.file.Path> S0(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super kotlin.io.path.r, kotlin.n1> r1) {
            java.lang.String r0 = "builderAction"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.io.path.s r0 = new kotlin.io.path.s
            r0.<init>()
            r1.invoke(r0)
            java.nio.file.FileVisitor r1 = r0.e()
            return r1
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.internal.InlineOnly
    private static final void T0(java.nio.file.Path r2, java.lang.String r3, kotlin.jvm.functions.Function1<? super java.nio.file.Path, kotlin.n1> r4) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "glob"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "action"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.nio.file.DirectoryStream r2 = kotlin.io.path.j2.a(r2, r3)
            r3 = 1
            java.nio.file.DirectoryStream r0 = kotlin.io.path.m1.a(r2)     // Catch: java.lang.Throwable -> L2d
            kotlin.jvm.internal.g0.m(r0)     // Catch: java.lang.Throwable -> L2d
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L2d
        L1f:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L2d
            if (r1 == 0) goto L2f
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L2d
            r4.invoke(r1)     // Catch: java.lang.Throwable -> L2d
            goto L1f
        L2d:
            r4 = move-exception
            goto L3c
        L2f:
            kotlin.n1 r4 = kotlin.n1.a     // Catch: java.lang.Throwable -> L2d
            kotlin.jvm.internal.d0.d(r3)
            r4 = 0
            kotlin.io.b.a(r2, r4)
            kotlin.jvm.internal.d0.c(r3)
            return
        L3c:
            throw r4     // Catch: java.lang.Throwable -> L3d
        L3d:
            r0 = move-exception
            kotlin.jvm.internal.d0.d(r3)
            kotlin.io.b.a(r2, r4)
            kotlin.jvm.internal.d0.c(r3)
            throw r0
    }

    static /* synthetic */ void U0(java.nio.file.Path r0, java.lang.String r1, kotlin.jvm.functions.Function1 r2, int r3, java.lang.Object r4) throws java.io.IOException {
            r4 = 1
            r3 = r3 & r4
            if (r3 == 0) goto L6
            java.lang.String r1 = "*"
        L6:
            java.lang.String r3 = "<this>"
            kotlin.jvm.internal.g0.p(r0, r3)
            java.lang.String r3 = "glob"
            kotlin.jvm.internal.g0.p(r1, r3)
            java.lang.String r3 = "action"
            kotlin.jvm.internal.g0.p(r2, r3)
            java.nio.file.DirectoryStream r0 = kotlin.io.path.j2.a(r0, r1)
            java.nio.file.DirectoryStream r1 = kotlin.io.path.m1.a(r0)     // Catch: java.lang.Throwable -> L32
            kotlin.jvm.internal.g0.m(r1)     // Catch: java.lang.Throwable -> L32
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L32
        L24:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> L32
            if (r3 == 0) goto L34
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> L32
            r2.invoke(r3)     // Catch: java.lang.Throwable -> L32
            goto L24
        L32:
            r1 = move-exception
            goto L41
        L34:
            kotlin.n1 r1 = kotlin.n1.a     // Catch: java.lang.Throwable -> L32
            kotlin.jvm.internal.d0.d(r4)
            r1 = 0
            kotlin.io.b.a(r0, r1)
            kotlin.jvm.internal.d0.c(r4)
            return
        L41:
            throw r1     // Catch: java.lang.Throwable -> L42
        L42:
            r2 = move-exception
            kotlin.jvm.internal.d0.d(r4)
            kotlin.io.b.a(r0, r1)
            kotlin.jvm.internal.d0.c(r4)
            throw r2
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.internal.InlineOnly
    private static final java.lang.Object V0(java.nio.file.Path r1, java.lang.String r2, java.nio.file.LinkOption... r3) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "attribute"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "options"
            kotlin.jvm.internal.g0.p(r3, r0)
            int r0 = r3.length
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r0)
            java.nio.file.LinkOption[] r3 = (java.nio.file.LinkOption[]) r3
            java.lang.Object r1 = kotlin.io.path.m2.a(r1, r2, r3)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String W0(@org.jetbrains.annotations.NotNull java.nio.file.Path r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.nio.file.Path r2 = kotlin.io.path.k.a(r2)
            java.lang.String r0 = ""
            if (r2 == 0) goto L1d
            java.lang.String r2 = r2.toString()
            if (r2 == 0) goto L1d
            r1 = 46
            java.lang.String r2 = kotlin.text.u.L5(r2, r1, r0)
            if (r2 != 0) goto L1c
            goto L1d
        L1c:
            return r2
        L1d:
            return r0
    }

    @kotlin.SinceKotlin(version = "1.5")
    public static /* synthetic */ void X0(java.nio.file.Path r0) {
            return
    }

    private static final java.lang.String Y0(java.nio.file.Path r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r1 = a1(r1)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.4")
    @kotlin.internal.InlineOnly
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Use invariantSeparatorsPathString property instead.", replaceWith = @kotlin.ReplaceWith(expression = "invariantSeparatorsPathString", imports = {}))
    @kotlin.io.path.ExperimentalPathApi
    public static /* synthetic */ void Z0(java.nio.file.Path r0) {
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String a1(@org.jetbrains.annotations.NotNull java.nio.file.Path r7) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r7, r0)
            java.nio.file.FileSystem r0 = com.huawei.secure.android.common.util.w.a(r7)
            java.lang.String r2 = kotlin.io.path.z.a(r0)
            java.lang.String r0 = "/"
            boolean r0 = kotlin.jvm.internal.g0.g(r2, r0)
            if (r0 != 0) goto L26
            java.lang.String r1 = r7.toString()
            kotlin.jvm.internal.g0.m(r2)
            r5 = 4
            r6 = 0
            java.lang.String r3 = "/"
            r4 = 0
            java.lang.String r7 = kotlin.text.u.x2(r1, r2, r3, r4, r5, r6)
            return r7
        L26:
            java.lang.String r7 = r7.toString()
            return r7
    }

    @kotlin.SinceKotlin(version = "1.5")
    public static /* synthetic */ void b1(java.nio.file.Path r0) {
            return
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.internal.InlineOnly
    private static final java.nio.file.attribute.FileTime c1(java.nio.file.Path r1, java.nio.file.LinkOption... r2) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "options"
            kotlin.jvm.internal.g0.p(r2, r0)
            int r0 = r2.length
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r0)
            java.nio.file.LinkOption[] r2 = (java.nio.file.LinkOption[]) r2
            java.nio.file.attribute.FileTime r1 = kotlin.io.path.i2.a(r1, r2)
            java.lang.String r2 = "getLastModifiedTime(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String d1(@org.jetbrains.annotations.NotNull java.nio.file.Path r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.nio.file.Path r1 = kotlin.io.path.k.a(r1)
            if (r1 == 0) goto L10
            java.lang.String r1 = r1.toString()
            goto L11
        L10:
            r1 = 0
        L11:
            if (r1 != 0) goto L15
            java.lang.String r1 = ""
        L15:
            return r1
    }

    @kotlin.SinceKotlin(version = "1.5")
    public static /* synthetic */ void e1(java.nio.file.Path r0) {
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String f1(@org.jetbrains.annotations.NotNull java.nio.file.Path r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.nio.file.Path r3 = kotlin.io.path.k.a(r3)
            if (r3 == 0) goto L1d
            java.lang.String r3 = r3.toString()
            if (r3 == 0) goto L1d
            java.lang.String r0 = "."
            r1 = 2
            r2 = 0
            java.lang.String r3 = kotlin.text.u.W5(r3, r0, r2, r1, r2)
            if (r3 != 0) goto L1c
            goto L1d
        L1c:
            return r3
        L1d:
            java.lang.String r3 = ""
            return r3
    }

    @kotlin.SinceKotlin(version = "1.5")
    public static /* synthetic */ void g1(java.nio.file.Path r0) {
            return
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.internal.InlineOnly
    private static final java.nio.file.attribute.UserPrincipal h1(java.nio.file.Path r1, java.nio.file.LinkOption... r2) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "options"
            kotlin.jvm.internal.g0.p(r2, r0)
            int r0 = r2.length
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r0)
            java.nio.file.LinkOption[] r2 = (java.nio.file.LinkOption[]) r2
            java.nio.file.attribute.UserPrincipal r1 = com.huawei.secure.android.common.util.i0.a(r1, r2)
            return r1
    }

    private static final java.lang.String i1(java.nio.file.Path r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r1 = r1.toString()
            return r1
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.internal.InlineOnly
    public static /* synthetic */ void j1(java.nio.file.Path r0) {
            return
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.internal.InlineOnly
    private static final java.util.Set<java.nio.file.attribute.PosixFilePermission> k1(java.nio.file.Path r1, java.nio.file.LinkOption... r2) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "options"
            kotlin.jvm.internal.g0.p(r2, r0)
            int r0 = r2.length
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r0)
            java.nio.file.LinkOption[] r2 = (java.nio.file.LinkOption[]) r2
            java.util.Set r1 = io.netty.util.internal.b.a(r1, r2)
            java.lang.String r2 = "getPosixFilePermissions(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.internal.InlineOnly
    private static final boolean l1(java.nio.file.Path r1, java.nio.file.LinkOption... r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "options"
            kotlin.jvm.internal.g0.p(r2, r0)
            int r0 = r2.length
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r0)
            java.nio.file.LinkOption[] r2 = (java.nio.file.LinkOption[]) r2
            boolean r1 = kotlin.io.path.b.a(r1, r2)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.internal.InlineOnly
    private static final boolean m1(java.nio.file.Path r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            boolean r1 = kotlin.io.path.a3.a(r1)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.internal.InlineOnly
    private static final java.nio.file.Path n0(java.lang.String r1) {
            java.lang.String r0 = "path"
            kotlin.jvm.internal.g0.p(r1, r0)
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]
            java.nio.file.Path r1 = com.huawei.secure.android.common.util.g0.a(r1, r0)
            java.lang.String r0 = "get(...)"
            kotlin.jvm.internal.g0.o(r1, r0)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.internal.InlineOnly
    private static final boolean n1(java.nio.file.Path r1) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            boolean r1 = kotlin.io.path.r2.a(r1)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.internal.InlineOnly
    private static final java.nio.file.Path o0(java.lang.String r1, java.lang.String... r2) {
            java.lang.String r0 = "base"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "subpaths"
            kotlin.jvm.internal.g0.p(r2, r0)
            int r0 = r2.length
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r0)
            java.lang.String[] r2 = (java.lang.String[]) r2
            java.nio.file.Path r1 = com.huawei.secure.android.common.util.g0.a(r1, r2)
            java.lang.String r2 = "get(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.internal.InlineOnly
    private static final boolean o1(java.nio.file.Path r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            boolean r1 = kotlin.io.path.u2.a(r1)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.internal.InlineOnly
    private static final java.nio.file.Path p0(java.nio.file.Path r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.nio.file.Path r1 = com.huawei.secure.android.common.util.j0.a(r1)
            java.lang.String r0 = "toAbsolutePath(...)"
            kotlin.jvm.internal.g0.o(r1, r0)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.internal.InlineOnly
    private static final boolean p1(java.nio.file.Path r1, java.nio.file.LinkOption... r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "options"
            kotlin.jvm.internal.g0.p(r2, r0)
            int r0 = r2.length
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r0)
            java.nio.file.LinkOption[] r2 = (java.nio.file.LinkOption[]) r2
            boolean r1 = kotlin.io.path.f2.a(r1, r2)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.internal.InlineOnly
    private static final java.lang.String q0(java.nio.file.Path r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.nio.file.Path r1 = com.huawei.secure.android.common.util.j0.a(r1)
            java.lang.String r1 = r1.toString()
            return r1
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.internal.InlineOnly
    private static final boolean q1(java.nio.file.Path r1, java.nio.file.Path r2) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "other"
            kotlin.jvm.internal.g0.p(r2, r0)
            boolean r1 = kotlin.io.path.i0.a(r1, r2)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.internal.InlineOnly
    private static final java.nio.file.Path r0(java.nio.file.Path r2, java.nio.file.Path r3, boolean r4) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "target"
            kotlin.jvm.internal.g0.p(r3, r0)
            r0 = 0
            if (r4 == 0) goto L17
            r4 = 1
            java.nio.file.CopyOption[] r4 = new java.nio.file.CopyOption[r4]
            java.nio.file.StandardCopyOption r1 = kotlin.io.path.r1.a()
            r4[r0] = r1
            goto L19
        L17:
            java.nio.file.CopyOption[] r4 = new java.nio.file.CopyOption[r0]
        L19:
            int r0 = r4.length
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r0)
            java.nio.file.CopyOption[] r4 = (java.nio.file.CopyOption[]) r4
            java.nio.file.Path r2 = kotlin.io.path.c.a(r2, r3, r4)
            java.lang.String r3 = "copy(...)"
            kotlin.jvm.internal.g0.o(r2, r3)
            return r2
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.internal.InlineOnly
    private static final boolean r1(java.nio.file.Path r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            boolean r1 = cn.jiguang.av.d0.a(r1)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.internal.InlineOnly
    private static final java.nio.file.Path s0(java.nio.file.Path r1, java.nio.file.Path r2, java.nio.file.CopyOption... r3) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "target"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "options"
            kotlin.jvm.internal.g0.p(r3, r0)
            int r0 = r3.length
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r0)
            java.nio.file.CopyOption[] r3 = (java.nio.file.CopyOption[]) r3
            java.nio.file.Path r1 = kotlin.io.path.c.a(r1, r2, r3)
            java.lang.String r2 = "copy(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.internal.InlineOnly
    private static final boolean s1(java.nio.file.Path r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            boolean r1 = kotlin.io.path.s2.a(r1)
            return r1
    }

    static /* synthetic */ java.nio.file.Path t0(java.nio.file.Path r0, java.nio.file.Path r1, boolean r2, int r3, java.lang.Object r4) throws java.io.IOException {
            r3 = r3 & 2
            r4 = 0
            if (r3 == 0) goto L6
            r2 = 0
        L6:
            java.lang.String r3 = "<this>"
            kotlin.jvm.internal.g0.p(r0, r3)
            java.lang.String r3 = "target"
            kotlin.jvm.internal.g0.p(r1, r3)
            if (r2 == 0) goto L1c
            r2 = 1
            java.nio.file.CopyOption[] r2 = new java.nio.file.CopyOption[r2]
            java.nio.file.StandardCopyOption r3 = kotlin.io.path.r1.a()
            r2[r4] = r3
            goto L1e
        L1c:
            java.nio.file.CopyOption[] r2 = new java.nio.file.CopyOption[r4]
        L1e:
            int r3 = r2.length
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r3)
            java.nio.file.CopyOption[] r2 = (java.nio.file.CopyOption[]) r2
            java.nio.file.Path r0 = kotlin.io.path.c.a(r0, r1, r2)
            java.lang.String r1 = "copy(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.5")
    @org.jetbrains.annotations.NotNull
    public static final java.util.List<java.nio.file.Path> t1(@org.jetbrains.annotations.NotNull java.nio.file.Path r1, @org.jetbrains.annotations.NotNull java.lang.String r2) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "glob"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.nio.file.DirectoryStream r1 = kotlin.io.path.j2.a(r1, r2)
            java.nio.file.DirectoryStream r2 = kotlin.io.path.m1.a(r1)     // Catch: java.lang.Throwable -> L1e
            kotlin.jvm.internal.g0.m(r2)     // Catch: java.lang.Throwable -> L1e
            java.util.List r2 = kotlin.collections.f0.a6(r2)     // Catch: java.lang.Throwable -> L1e
            r0 = 0
            kotlin.io.b.a(r1, r0)
            return r2
        L1e:
            r2 = move-exception
            throw r2     // Catch: java.lang.Throwable -> L20
        L20:
            r0 = move-exception
            kotlin.io.b.a(r1, r2)
            throw r0
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.internal.InlineOnly
    private static final java.nio.file.Path u0(java.nio.file.Path r1, java.nio.file.attribute.FileAttribute<?>... r2) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "attributes"
            kotlin.jvm.internal.g0.p(r2, r0)
            int r0 = r2.length
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r0)
            java.nio.file.attribute.FileAttribute[] r2 = (java.nio.file.attribute.FileAttribute[]) r2
            java.nio.file.Path r1 = kotlin.io.path.x2.a(r1, r2)
            java.lang.String r2 = "createDirectories(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            return r1
    }

    public static /* synthetic */ java.util.List u1(java.nio.file.Path r0, java.lang.String r1, int r2, java.lang.Object r3) throws java.io.IOException {
            r2 = r2 & 1
            if (r2 == 0) goto L6
            java.lang.String r1 = "*"
        L6:
            java.util.List r0 = t1(r0, r1)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.internal.InlineOnly
    private static final java.nio.file.Path v0(java.nio.file.Path r1, java.nio.file.attribute.FileAttribute<?>... r2) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "attributes"
            kotlin.jvm.internal.g0.p(r2, r0)
            int r0 = r2.length
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r0)
            java.nio.file.attribute.FileAttribute[] r2 = (java.nio.file.attribute.FileAttribute[]) r2
            java.nio.file.Path r1 = kotlin.io.path.p2.a(r1, r2)
            java.lang.String r2 = "createDirectory(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.internal.InlineOnly
    private static final java.nio.file.Path v1(java.nio.file.Path r2, java.nio.file.Path r3, boolean r4) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "target"
            kotlin.jvm.internal.g0.p(r3, r0)
            r0 = 0
            if (r4 == 0) goto L17
            r4 = 1
            java.nio.file.CopyOption[] r4 = new java.nio.file.CopyOption[r4]
            java.nio.file.StandardCopyOption r1 = kotlin.io.path.r1.a()
            r4[r0] = r1
            goto L19
        L17:
            java.nio.file.CopyOption[] r4 = new java.nio.file.CopyOption[r0]
        L19:
            int r0 = r4.length
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r0)
            java.nio.file.CopyOption[] r4 = (java.nio.file.CopyOption[]) r4
            java.nio.file.Path r2 = kotlin.io.path.w2.a(r2, r3, r4)
            java.lang.String r3 = "move(...)"
            kotlin.jvm.internal.g0.o(r2, r3)
            return r2
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.internal.InlineOnly
    private static final java.nio.file.Path w0(java.nio.file.Path r1, java.nio.file.attribute.FileAttribute<?>... r2) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "attributes"
            kotlin.jvm.internal.g0.p(r2, r0)
            int r0 = r2.length
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r0)
            java.nio.file.attribute.FileAttribute[] r2 = (java.nio.file.attribute.FileAttribute[]) r2
            java.nio.file.Path r1 = kotlin.io.path.z2.a(r1, r2)
            java.lang.String r2 = "createFile(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.internal.InlineOnly
    private static final java.nio.file.Path w1(java.nio.file.Path r1, java.nio.file.Path r2, java.nio.file.CopyOption... r3) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "target"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "options"
            kotlin.jvm.internal.g0.p(r3, r0)
            int r0 = r3.length
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r0)
            java.nio.file.CopyOption[] r3 = (java.nio.file.CopyOption[]) r3
            java.nio.file.Path r1 = kotlin.io.path.w2.a(r1, r2, r3)
            java.lang.String r2 = "move(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.internal.InlineOnly
    private static final java.nio.file.Path x0(java.nio.file.Path r1, java.nio.file.Path r2) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "target"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.nio.file.Path r1 = kotlin.io.path.v2.a(r1, r2)
            java.lang.String r2 = "createLink(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            return r1
    }

    static /* synthetic */ java.nio.file.Path x1(java.nio.file.Path r0, java.nio.file.Path r1, boolean r2, int r3, java.lang.Object r4) throws java.io.IOException {
            r3 = r3 & 2
            r4 = 0
            if (r3 == 0) goto L6
            r2 = 0
        L6:
            java.lang.String r3 = "<this>"
            kotlin.jvm.internal.g0.p(r0, r3)
            java.lang.String r3 = "target"
            kotlin.jvm.internal.g0.p(r1, r3)
            if (r2 == 0) goto L1c
            r2 = 1
            java.nio.file.CopyOption[] r2 = new java.nio.file.CopyOption[r2]
            java.nio.file.StandardCopyOption r3 = kotlin.io.path.r1.a()
            r2[r4] = r3
            goto L1e
        L1c:
            java.nio.file.CopyOption[] r2 = new java.nio.file.CopyOption[r4]
        L1e:
            int r3 = r2.length
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r3)
            java.nio.file.CopyOption[] r2 = (java.nio.file.CopyOption[]) r2
            java.nio.file.Path r0 = kotlin.io.path.w2.a(r0, r1, r2)
            java.lang.String r1 = "move(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            return r0
    }

    @kotlin.SinceKotlin(version = "1.9")
    @org.jetbrains.annotations.NotNull
    public static final java.nio.file.Path y0(@org.jetbrains.annotations.NotNull java.nio.file.Path r3, @org.jetbrains.annotations.NotNull java.nio.file.attribute.FileAttribute<?>... r4) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "attributes"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.nio.file.Path r0 = kotlin.io.path.l.a(r3)
            if (r0 == 0) goto L48
            r1 = 0
            java.nio.file.LinkOption[] r2 = new java.nio.file.LinkOption[r1]
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r1)
            java.nio.file.LinkOption[] r2 = (java.nio.file.LinkOption[]) r2
            boolean r2 = kotlin.io.path.b.a(r0, r2)
            if (r2 != 0) goto L48
            int r2 = r4.length     // Catch: java.nio.file.FileAlreadyExistsException -> L37
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r2)     // Catch: java.nio.file.FileAlreadyExistsException -> L37
            java.nio.file.attribute.FileAttribute[] r4 = (java.nio.file.attribute.FileAttribute[]) r4     // Catch: java.nio.file.FileAlreadyExistsException -> L37
            int r2 = r4.length     // Catch: java.nio.file.FileAlreadyExistsException -> L37
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r2)     // Catch: java.nio.file.FileAlreadyExistsException -> L37
            java.nio.file.attribute.FileAttribute[] r4 = (java.nio.file.attribute.FileAttribute[]) r4     // Catch: java.nio.file.FileAlreadyExistsException -> L37
            java.nio.file.Path r4 = kotlin.io.path.x2.a(r0, r4)     // Catch: java.nio.file.FileAlreadyExistsException -> L37
            java.lang.String r2 = "createDirectories(...)"
            kotlin.jvm.internal.g0.o(r4, r2)     // Catch: java.nio.file.FileAlreadyExistsException -> L37
            return r3
        L37:
            r4 = move-exception
            java.nio.file.LinkOption[] r2 = new java.nio.file.LinkOption[r1]
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r2, r1)
            java.nio.file.LinkOption[] r1 = (java.nio.file.LinkOption[]) r1
            boolean r0 = kotlin.io.path.b.a(r0, r1)
            if (r0 == 0) goto L47
            goto L48
        L47:
            throw r4
        L48:
            return r3
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.internal.InlineOnly
    private static final boolean y1(java.nio.file.Path r1, java.nio.file.LinkOption... r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "options"
            kotlin.jvm.internal.g0.p(r2, r0)
            int r0 = r2.length
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r0)
            java.nio.file.LinkOption[] r2 = (java.nio.file.LinkOption[]) r2
            boolean r1 = kotlin.io.path.y2.a(r1, r2)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.internal.InlineOnly
    private static final java.nio.file.Path z0(java.nio.file.Path r1, java.nio.file.Path r2, java.nio.file.attribute.FileAttribute<?>... r3) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "target"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "attributes"
            kotlin.jvm.internal.g0.p(r3, r0)
            int r0 = r3.length
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r0)
            java.nio.file.attribute.FileAttribute[] r3 = (java.nio.file.attribute.FileAttribute[]) r3
            java.nio.file.Path r1 = kotlin.io.path.k2.a(r1, r2, r3)
            java.lang.String r2 = "createSymbolicLink(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.5")
    @kotlin.internal.InlineOnly
    private static final /* synthetic */ <A extends java.nio.file.attribute.BasicFileAttributes> A z1(java.nio.file.Path r2, java.nio.file.LinkOption... r3) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "options"
            kotlin.jvm.internal.g0.p(r3, r0)
            r0 = 4
            java.lang.String r1 = "A"
            kotlin.jvm.internal.g0.y(r0, r1)
            java.lang.Class r0 = com.huawei.secure.android.common.util.z.a()
            int r1 = r3.length
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r1)
            java.nio.file.LinkOption[] r3 = (java.nio.file.LinkOption[]) r3
            java.nio.file.attribute.BasicFileAttributes r2 = com.huawei.secure.android.common.util.q.a(r2, r0, r3)
            java.lang.String r3 = "readAttributes(...)"
            kotlin.jvm.internal.g0.o(r2, r3)
            java.nio.file.attribute.BasicFileAttributes r2 = kotlin.io.path.z1.a(r2)
            return r2
    }
}
