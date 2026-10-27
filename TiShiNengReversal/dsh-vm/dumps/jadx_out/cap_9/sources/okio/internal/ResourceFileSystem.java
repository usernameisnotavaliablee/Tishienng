package okio.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nResourceFileSystem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ResourceFileSystem.kt\nokio/internal/ResourceFileSystem\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,215:1\n774#2:216\n865#2,2:217\n1563#2:219\n1634#2,3:220\n774#2:223\n865#2,2:224\n1563#2:226\n1634#2,3:227\n1617#2,9:230\n1869#2:239\n1870#2:241\n1626#2:242\n1617#2,9:243\n1869#2:252\n1870#2:254\n1626#2:255\n1#3:240\n1#3:253\n*S KotlinDebug\n*F\n+ 1 ResourceFileSystem.kt\nokio/internal/ResourceFileSystem\n*L\n75#1:216\n75#1:217,2\n76#1:219\n76#1:220,3\n91#1:223\n91#1:224,2\n92#1:226\n92#1:227,3\n178#1:230,9\n178#1:239\n178#1:241\n178#1:242\n179#1:243,9\n179#1:252\n179#1:254\n179#1:255\n178#1:240\n179#1:253\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class ResourceFileSystem extends okio.FileSystem {

    @org.jetbrains.annotations.NotNull
    private static final okio.internal.ResourceFileSystem.Companion Companion = null;

    @org.jetbrains.annotations.NotNull
    private static final okio.Path ROOT = null;

    @org.jetbrains.annotations.NotNull
    private final java.lang.ClassLoader classLoader;

    @org.jetbrains.annotations.NotNull
    private final kotlin.s roots$delegate;

    @org.jetbrains.annotations.NotNull
    private final okio.FileSystem systemFileSystem;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.v r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public static final /* synthetic */ boolean access$keepPath(okio.internal.ResourceFileSystem.Companion r0, okio.Path r1) {
                boolean r0 = r0.keepPath(r1)
                return r0
        }

        private final boolean keepPath(okio.Path r3) {
                r2 = this;
                java.lang.String r3 = r3.name()
                java.lang.String r0 = ".class"
                r1 = 1
                boolean r3 = kotlin.text.u.Y1(r3, r0, r1)
                r3 = r3 ^ r1
                return r3
        }

        @org.jetbrains.annotations.NotNull
        public final okio.Path getROOT() {
                r1 = this;
                okio.Path r0 = okio.internal.ResourceFileSystem.access$getROOT$cp()
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final okio.Path removeBase(@org.jetbrains.annotations.NotNull okio.Path r8, @org.jetbrains.annotations.NotNull okio.Path r9) {
                r7 = this;
                java.lang.String r0 = "<this>"
                kotlin.jvm.internal.g0.p(r8, r0)
                java.lang.String r0 = "base"
                kotlin.jvm.internal.g0.p(r9, r0)
                java.lang.String r9 = r9.toString()
                okio.Path r0 = r7.getROOT()
                java.lang.String r8 = r8.toString()
                java.lang.String r1 = kotlin.text.u.v4(r8, r9)
                r5 = 4
                r6 = 0
                r2 = 92
                r3 = 47
                r4 = 0
                java.lang.String r8 = kotlin.text.u.w2(r1, r2, r3, r4, r5, r6)
                okio.Path r8 = r0.resolve(r8)
                return r8
        }
    }

    static {
            okio.internal.ResourceFileSystem$Companion r0 = new okio.internal.ResourceFileSystem$Companion
            r1 = 0
            r0.<init>(r1)
            okio.internal.ResourceFileSystem.Companion = r0
            okio.Path$Companion r0 = okio.Path.Companion
            r2 = 0
            r3 = 1
            java.lang.String r4 = "/"
            okio.Path r0 = okio.Path.Companion.get$default(r0, r4, r2, r3, r1)
            okio.internal.ResourceFileSystem.ROOT = r0
            return
    }

    public ResourceFileSystem(@org.jetbrains.annotations.NotNull java.lang.ClassLoader r2, boolean r3, @org.jetbrains.annotations.NotNull okio.FileSystem r4) {
            r1 = this;
            java.lang.String r0 = "classLoader"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "systemFileSystem"
            kotlin.jvm.internal.g0.p(r4, r0)
            r1.<init>()
            r1.classLoader = r2
            r1.systemFileSystem = r4
            okio.internal.b r2 = new okio.internal.b
            r2.<init>(r1)
            kotlin.s r2 = kotlin.t.c(r2)
            r1.roots$delegate = r2
            if (r3 == 0) goto L25
            java.util.List r2 = r1.getRoots()
            r2.size()
        L25:
            return
    }

    public /* synthetic */ ResourceFileSystem(java.lang.ClassLoader r1, boolean r2, okio.FileSystem r3, int r4, kotlin.jvm.internal.v r5) {
            r0 = this;
            r4 = r4 & 4
            if (r4 == 0) goto L6
            okio.FileSystem r3 = okio.FileSystem.SYSTEM
        L6:
            r0.<init>(r1, r2, r3)
            return
    }

    public static /* synthetic */ boolean a(okio.internal.ZipEntry r0) {
            boolean r0 = toJarRoot$lambda$0(r0)
            return r0
    }

    public static final /* synthetic */ okio.Path access$getROOT$cp() {
            okio.Path r0 = okio.internal.ResourceFileSystem.ROOT
            return r0
    }

    public static /* synthetic */ java.util.List b(okio.internal.ResourceFileSystem r0) {
            java.util.List r0 = roots_delegate$lambda$0(r0)
            return r0
    }

    private final okio.Path canonicalizeInternal(okio.Path r3) {
            r2 = this;
            okio.Path r0 = okio.internal.ResourceFileSystem.ROOT
            r1 = 1
            okio.Path r3 = r0.resolve(r3, r1)
            return r3
    }

    private final java.util.List<kotlin.Pair<okio.FileSystem, okio.Path>> getRoots() {
            r1 = this;
            kotlin.s r0 = r1.roots$delegate
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            return r0
    }

    private static final java.util.List roots_delegate$lambda$0(okio.internal.ResourceFileSystem r1) {
            java.lang.ClassLoader r0 = r1.classLoader
            java.util.List r1 = r1.toClasspathRoots(r0)
            return r1
    }

    private final java.util.List<kotlin.Pair<okio.FileSystem, okio.Path>> toClasspathRoots(java.lang.ClassLoader r6) {
            r5 = this;
            java.lang.String r0 = ""
            java.util.Enumeration r0 = r6.getResources(r0)
            java.lang.String r1 = "getResources(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            java.util.ArrayList r0 = java.util.Collections.list(r0)
            java.lang.String r2 = "list(...)"
            kotlin.jvm.internal.g0.o(r0, r2)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r0 = r0.iterator()
        L1d:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L36
            java.lang.Object r4 = r0.next()
            java.net.URL r4 = (java.net.URL) r4
            kotlin.jvm.internal.g0.m(r4)
            kotlin.Pair r4 = r5.toFileRoot(r4)
            if (r4 == 0) goto L1d
            r3.add(r4)
            goto L1d
        L36:
            java.lang.String r0 = "META-INF/MANIFEST.MF"
            java.util.Enumeration r6 = r6.getResources(r0)
            kotlin.jvm.internal.g0.o(r6, r1)
            java.util.ArrayList r6 = java.util.Collections.list(r6)
            kotlin.jvm.internal.g0.o(r6, r2)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r6 = r6.iterator()
        L4f:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L68
            java.lang.Object r1 = r6.next()
            java.net.URL r1 = (java.net.URL) r1
            kotlin.jvm.internal.g0.m(r1)
            kotlin.Pair r1 = r5.toJarRoot(r1)
            if (r1 == 0) goto L4f
            r0.add(r1)
            goto L4f
        L68:
            java.util.List r6 = kotlin.collections.f0.I4(r3, r0)
            return r6
    }

    private final kotlin.Pair<okio.FileSystem, okio.Path> toFileRoot(java.net.URL r6) {
            r5 = this;
            java.lang.String r0 = r6.getProtocol()
            java.lang.String r1 = "file"
            boolean r0 = kotlin.jvm.internal.g0.g(r0, r1)
            r1 = 0
            if (r0 != 0) goto Le
            return r1
        Le:
            okio.FileSystem r0 = r5.systemFileSystem
            okio.Path$Companion r2 = okio.Path.Companion
            java.io.File r3 = new java.io.File
            java.net.URI r6 = r6.toURI()
            r3.<init>(r6)
            r6 = 0
            r4 = 1
            okio.Path r6 = okio.Path.Companion.get$default(r2, r3, r6, r4, r1)
            kotlin.Pair r6 = kotlin.o0.a(r0, r6)
            return r6
    }

    private final kotlin.Pair<okio.FileSystem, okio.Path> toJarRoot(java.net.URL r9) {
            r8 = this;
            java.lang.String r0 = r9.toString()
            java.lang.String r9 = "toString(...)"
            kotlin.jvm.internal.g0.o(r0, r9)
            java.lang.String r9 = "jar:file:"
            r6 = 0
            r1 = 2
            r7 = 0
            boolean r9 = kotlin.text.u.H2(r0, r9, r6, r1, r7)
            if (r9 != 0) goto L15
            return r7
        L15:
            r4 = 6
            r5 = 0
            java.lang.String r1 = "!"
            r2 = 0
            r3 = 0
            int r9 = kotlin.text.u.W3(r0, r1, r2, r3, r4, r5)
            r1 = -1
            if (r9 != r1) goto L23
            return r7
        L23:
            okio.Path$Companion r1 = okio.Path.Companion
            java.io.File r2 = new java.io.File
            r3 = 4
            java.lang.String r9 = r0.substring(r3, r9)
            java.lang.String r0 = "substring(...)"
            kotlin.jvm.internal.g0.o(r9, r0)
            java.net.URI r9 = java.net.URI.create(r9)
            r2.<init>(r9)
            r9 = 1
            okio.Path r9 = okio.Path.Companion.get$default(r1, r2, r6, r9, r7)
            okio.FileSystem r0 = r8.systemFileSystem
            okio.internal.a r1 = new okio.internal.a
            r1.<init>()
            okio.ZipFileSystem r9 = okio.internal.ZipFilesKt.openZip(r9, r0, r1)
            okio.Path r0 = okio.internal.ResourceFileSystem.ROOT
            kotlin.Pair r9 = kotlin.o0.a(r9, r0)
            return r9
    }

    private static final boolean toJarRoot$lambda$0(okio.internal.ZipEntry r1) {
            java.lang.String r0 = "entry"
            kotlin.jvm.internal.g0.p(r1, r0)
            okio.internal.ResourceFileSystem$Companion r0 = okio.internal.ResourceFileSystem.Companion
            okio.Path r1 = r1.getCanonicalPath()
            boolean r1 = okio.internal.ResourceFileSystem.Companion.access$keepPath(r0, r1)
            return r1
    }

    private final java.lang.String toRelativePath(okio.Path r2) {
            r1 = this;
            okio.Path r2 = r1.canonicalizeInternal(r2)
            okio.Path r0 = okio.internal.ResourceFileSystem.ROOT
            okio.Path r2 = r2.relativeTo(r0)
            java.lang.String r2 = r2.toString()
            return r2
    }

    @Override // okio.FileSystem
    @org.jetbrains.annotations.NotNull
    public okio.Sink appendingSink(@org.jetbrains.annotations.NotNull okio.Path r2, boolean r3) {
            r1 = this;
            java.lang.String r3 = "file"
            kotlin.jvm.internal.g0.p(r2, r3)
            java.io.IOException r2 = new java.io.IOException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            java.lang.String r0 = " is read-only"
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }

    @Override // okio.FileSystem
    public void atomicMove(@org.jetbrains.annotations.NotNull okio.Path r2, @org.jetbrains.annotations.NotNull okio.Path r3) {
            r1 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r2 = "target"
            kotlin.jvm.internal.g0.p(r3, r2)
            java.io.IOException r2 = new java.io.IOException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            java.lang.String r0 = " is read-only"
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }

    @Override // okio.FileSystem
    @org.jetbrains.annotations.NotNull
    public okio.Path canonicalize(@org.jetbrains.annotations.NotNull okio.Path r2) {
            r1 = this;
            java.lang.String r0 = "path"
            kotlin.jvm.internal.g0.p(r2, r0)
            okio.Path r2 = r1.canonicalizeInternal(r2)
            return r2
    }

    @Override // okio.FileSystem
    public void createDirectory(@org.jetbrains.annotations.NotNull okio.Path r2, boolean r3) {
            r1 = this;
            java.lang.String r3 = "dir"
            kotlin.jvm.internal.g0.p(r2, r3)
            java.io.IOException r2 = new java.io.IOException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            java.lang.String r0 = " is read-only"
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }

    @Override // okio.FileSystem
    public void createSymlink(@org.jetbrains.annotations.NotNull okio.Path r2, @org.jetbrains.annotations.NotNull okio.Path r3) {
            r1 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r2 = "target"
            kotlin.jvm.internal.g0.p(r3, r2)
            java.io.IOException r2 = new java.io.IOException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            java.lang.String r0 = " is read-only"
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }

    @Override // okio.FileSystem
    public void delete(@org.jetbrains.annotations.NotNull okio.Path r2, boolean r3) {
            r1 = this;
            java.lang.String r3 = "path"
            kotlin.jvm.internal.g0.p(r2, r3)
            java.io.IOException r2 = new java.io.IOException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            java.lang.String r0 = " is read-only"
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }

    @Override // okio.FileSystem
    @org.jetbrains.annotations.NotNull
    public java.util.List<okio.Path> list(@org.jetbrains.annotations.NotNull okio.Path r11) {
            r10 = this;
            java.lang.String r0 = "dir"
            kotlin.jvm.internal.g0.p(r11, r0)
            java.lang.String r0 = r10.toRelativePath(r11)
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            java.util.List r2 = r10.getRoots()
            java.util.Iterator r2 = r2.iterator()
            r3 = 0
        L17:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L87
            java.lang.Object r4 = r2.next()
            kotlin.Pair r4 = (kotlin.Pair) r4
            java.lang.Object r5 = r4.component1()
            okio.FileSystem r5 = (okio.FileSystem) r5
            java.lang.Object r4 = r4.component2()
            okio.Path r4 = (okio.Path) r4
            okio.Path r6 = r4.resolve(r0)     // Catch: java.io.IOException -> L5b
            java.util.List r5 = r5.list(r6)     // Catch: java.io.IOException -> L5b
            java.lang.Iterable r5 = (java.lang.Iterable) r5     // Catch: java.io.IOException -> L5b
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.io.IOException -> L5b
            r6.<init>()     // Catch: java.io.IOException -> L5b
            java.util.Iterator r5 = r5.iterator()     // Catch: java.io.IOException -> L5b
        L42:
            boolean r7 = r5.hasNext()     // Catch: java.io.IOException -> L5b
            if (r7 == 0) goto L5d
            java.lang.Object r7 = r5.next()     // Catch: java.io.IOException -> L5b
            r8 = r7
            okio.Path r8 = (okio.Path) r8     // Catch: java.io.IOException -> L5b
            okio.internal.ResourceFileSystem$Companion r9 = okio.internal.ResourceFileSystem.Companion     // Catch: java.io.IOException -> L5b
            boolean r8 = okio.internal.ResourceFileSystem.Companion.access$keepPath(r9, r8)     // Catch: java.io.IOException -> L5b
            if (r8 == 0) goto L42
            r6.add(r7)     // Catch: java.io.IOException -> L5b
            goto L42
        L5b:
            goto L17
        L5d:
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.io.IOException -> L5b
            r7 = 10
            int r7 = kotlin.collections.f0.d0(r6, r7)     // Catch: java.io.IOException -> L5b
            r5.<init>(r7)     // Catch: java.io.IOException -> L5b
            java.util.Iterator r6 = r6.iterator()     // Catch: java.io.IOException -> L5b
        L6c:
            boolean r7 = r6.hasNext()     // Catch: java.io.IOException -> L5b
            if (r7 == 0) goto L82
            java.lang.Object r7 = r6.next()     // Catch: java.io.IOException -> L5b
            okio.Path r7 = (okio.Path) r7     // Catch: java.io.IOException -> L5b
            okio.internal.ResourceFileSystem$Companion r8 = okio.internal.ResourceFileSystem.Companion     // Catch: java.io.IOException -> L5b
            okio.Path r7 = r8.removeBase(r7, r4)     // Catch: java.io.IOException -> L5b
            r5.add(r7)     // Catch: java.io.IOException -> L5b
            goto L6c
        L82:
            kotlin.collections.f0.s0(r1, r5)     // Catch: java.io.IOException -> L5b
            r3 = 1
            goto L17
        L87:
            if (r3 == 0) goto L8e
            java.util.List r11 = kotlin.collections.f0.a6(r1)
            return r11
        L8e:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "file not found: "
            r1.append(r2)
            r1.append(r11)
            java.lang.String r11 = r1.toString()
            r0.<init>(r11)
            throw r0
    }

    @Override // okio.FileSystem
    @org.jetbrains.annotations.Nullable
    public java.util.List<okio.Path> listOrNull(@org.jetbrains.annotations.NotNull okio.Path r10) {
            r9 = this;
            java.lang.String r0 = "dir"
            kotlin.jvm.internal.g0.p(r10, r0)
            java.lang.String r10 = r9.toRelativePath(r10)
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            java.util.List r1 = r9.getRoots()
            java.util.Iterator r1 = r1.iterator()
            r2 = 0
        L17:
            boolean r3 = r1.hasNext()
            r4 = 0
            if (r3 == 0) goto L8b
            java.lang.Object r3 = r1.next()
            kotlin.Pair r3 = (kotlin.Pair) r3
            java.lang.Object r5 = r3.component1()
            okio.FileSystem r5 = (okio.FileSystem) r5
            java.lang.Object r3 = r3.component2()
            okio.Path r3 = (okio.Path) r3
            okio.Path r6 = r3.resolve(r10)
            java.util.List r5 = r5.listOrNull(r6)
            if (r5 == 0) goto L84
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r5 = r5.iterator()
        L45:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L5e
            java.lang.Object r6 = r5.next()
            r7 = r6
            okio.Path r7 = (okio.Path) r7
            okio.internal.ResourceFileSystem$Companion r8 = okio.internal.ResourceFileSystem.Companion
            boolean r7 = okio.internal.ResourceFileSystem.Companion.access$keepPath(r8, r7)
            if (r7 == 0) goto L45
            r4.add(r6)
            goto L45
        L5e:
            java.util.ArrayList r5 = new java.util.ArrayList
            r6 = 10
            int r6 = kotlin.collections.f0.d0(r4, r6)
            r5.<init>(r6)
            java.util.Iterator r4 = r4.iterator()
        L6d:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L83
            java.lang.Object r6 = r4.next()
            okio.Path r6 = (okio.Path) r6
            okio.internal.ResourceFileSystem$Companion r7 = okio.internal.ResourceFileSystem.Companion
            okio.Path r6 = r7.removeBase(r6, r3)
            r5.add(r6)
            goto L6d
        L83:
            r4 = r5
        L84:
            if (r4 == 0) goto L17
            kotlin.collections.f0.s0(r0, r4)
            r2 = 1
            goto L17
        L8b:
            if (r2 == 0) goto L92
            java.util.List r10 = kotlin.collections.f0.a6(r0)
            return r10
        L92:
            return r4
    }

    @Override // okio.FileSystem
    @org.jetbrains.annotations.Nullable
    public okio.FileMetadata metadataOrNull(@org.jetbrains.annotations.NotNull okio.Path r5) {
            r4 = this;
            java.lang.String r0 = "path"
            kotlin.jvm.internal.g0.p(r5, r0)
            okio.internal.ResourceFileSystem$Companion r0 = okio.internal.ResourceFileSystem.Companion
            boolean r0 = okio.internal.ResourceFileSystem.Companion.access$keepPath(r0, r5)
            r1 = 0
            if (r0 != 0) goto Lf
            return r1
        Lf:
            java.lang.String r5 = r4.toRelativePath(r5)
            java.util.List r0 = r4.getRoots()
            java.util.Iterator r0 = r0.iterator()
        L1b:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L3f
            java.lang.Object r2 = r0.next()
            kotlin.Pair r2 = (kotlin.Pair) r2
            java.lang.Object r3 = r2.component1()
            okio.FileSystem r3 = (okio.FileSystem) r3
            java.lang.Object r2 = r2.component2()
            okio.Path r2 = (okio.Path) r2
            okio.Path r2 = r2.resolve(r5)
            okio.FileMetadata r2 = r3.metadataOrNull(r2)
            if (r2 != 0) goto L3e
            goto L1b
        L3e:
            return r2
        L3f:
            return r1
    }

    @Override // okio.FileSystem
    @org.jetbrains.annotations.NotNull
    public okio.FileHandle openReadOnly(@org.jetbrains.annotations.NotNull okio.Path r6) {
            r5 = this;
            java.lang.String r0 = "file"
            kotlin.jvm.internal.g0.p(r6, r0)
            okio.internal.ResourceFileSystem$Companion r0 = okio.internal.ResourceFileSystem.Companion
            boolean r0 = okio.internal.ResourceFileSystem.Companion.access$keepPath(r0, r6)
            java.lang.String r1 = "file not found: "
            if (r0 == 0) goto L53
            java.lang.String r0 = r5.toRelativePath(r6)
            java.util.List r2 = r5.getRoots()
            java.util.Iterator r2 = r2.iterator()
        L1b:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L3e
            java.lang.Object r3 = r2.next()
            kotlin.Pair r3 = (kotlin.Pair) r3
            java.lang.Object r4 = r3.component1()
            okio.FileSystem r4 = (okio.FileSystem) r4
            java.lang.Object r3 = r3.component2()
            okio.Path r3 = (okio.Path) r3
            okio.Path r3 = r3.resolve(r0)     // Catch: java.io.FileNotFoundException -> L3c
            okio.FileHandle r6 = r4.openReadOnly(r3)     // Catch: java.io.FileNotFoundException -> L3c
            return r6
        L3c:
            goto L1b
        L3e:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            r2.append(r6)
            java.lang.String r6 = r2.toString()
            r0.<init>(r6)
            throw r0
        L53:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            r2.append(r6)
            java.lang.String r6 = r2.toString()
            r0.<init>(r6)
            throw r0
    }

    @Override // okio.FileSystem
    @org.jetbrains.annotations.NotNull
    public okio.FileHandle openReadWrite(@org.jetbrains.annotations.NotNull okio.Path r1, boolean r2, boolean r3) {
            r0 = this;
            java.lang.String r2 = "file"
            kotlin.jvm.internal.g0.p(r1, r2)
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "resources are not writable"
            r1.<init>(r2)
            throw r1
    }

    @Override // okio.FileSystem
    @org.jetbrains.annotations.NotNull
    public okio.Sink sink(@org.jetbrains.annotations.NotNull okio.Path r2, boolean r3) {
            r1 = this;
            java.lang.String r3 = "file"
            kotlin.jvm.internal.g0.p(r2, r3)
            java.io.IOException r2 = new java.io.IOException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            java.lang.String r0 = " is read-only"
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }

    @Override // okio.FileSystem
    @org.jetbrains.annotations.NotNull
    public okio.Source source(@org.jetbrains.annotations.NotNull okio.Path r6) {
            r5 = this;
            java.lang.String r0 = "file"
            kotlin.jvm.internal.g0.p(r6, r0)
            okio.internal.ResourceFileSystem$Companion r0 = okio.internal.ResourceFileSystem.Companion
            boolean r0 = okio.internal.ResourceFileSystem.Companion.access$keepPath(r0, r6)
            java.lang.String r1 = "file not found: "
            if (r0 == 0) goto L59
            okio.Path r0 = okio.internal.ResourceFileSystem.ROOT
            r2 = 2
            r3 = 0
            r4 = 0
            okio.Path r2 = okio.Path.resolve$default(r0, r6, r4, r2, r3)
            okio.Path r0 = r2.relativeTo(r0)
            java.lang.ClassLoader r2 = r5.classLoader
            java.lang.String r0 = r0.toString()
            java.net.URL r0 = r2.getResource(r0)
            if (r0 == 0) goto L44
            java.net.URLConnection r6 = r0.openConnection()
            boolean r0 = r6 instanceof java.net.JarURLConnection
            if (r0 == 0) goto L36
            r0 = r6
            java.net.JarURLConnection r0 = (java.net.JarURLConnection) r0
            r0.setUseCaches(r4)
        L36:
            java.io.InputStream r6 = r6.getInputStream()
            java.lang.String r0 = "getInputStream(...)"
            kotlin.jvm.internal.g0.o(r6, r0)
            okio.Source r6 = okio.Okio.source(r6)
            return r6
        L44:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            r2.append(r6)
            java.lang.String r6 = r2.toString()
            r0.<init>(r6)
            throw r0
        L59:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            r2.append(r6)
            java.lang.String r6 = r2.toString()
            r0.<init>(r6)
            throw r0
    }
}
