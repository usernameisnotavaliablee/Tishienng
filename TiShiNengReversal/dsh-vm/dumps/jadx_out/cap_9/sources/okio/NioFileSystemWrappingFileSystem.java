package okio;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nNioFileSystemWrappingFileSystem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NioFileSystemWrappingFileSystem.kt\nokio/NioFileSystemWrappingFileSystem\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,196:1\n1634#2,3:197\n1#3:200\n37#4,2:201\n37#4,2:203\n37#4,2:205\n*S KotlinDebug\n*F\n+ 1 NioFileSystemWrappingFileSystem.kt\nokio/NioFileSystemWrappingFileSystem\n*L\n77#1:197,3\n104#1:201,2\n125#1:203,2\n138#1:205,2\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class NioFileSystemWrappingFileSystem extends okio.NioSystemFileSystem {

    @org.jetbrains.annotations.NotNull
    private final java.nio.file.FileSystem nioFileSystem;

    public NioFileSystemWrappingFileSystem(@org.jetbrains.annotations.NotNull java.nio.file.FileSystem r2) {
            r1 = this;
            java.lang.String r0 = "nioFileSystem"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.nioFileSystem = r2
            return
    }

    private final java.util.List<okio.Path> list(okio.Path r6, boolean r7) {
            r5 = this;
            java.nio.file.Path r0 = r5.resolve(r6)
            r1 = 0
            r2 = 1
            r3 = 0
            java.util.List r6 = kotlin.io.path.k0.u1(r0, r3, r2, r3)     // Catch: java.lang.Exception -> L32
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r6 = r6.iterator()
        L16:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L2e
            java.lang.Object r0 = r6.next()
            java.nio.file.Path r0 = kotlin.io.path.f.a(r0)
            okio.Path$Companion r4 = okio.Path.Companion
            okio.Path r0 = okio.Path.Companion.get$default(r4, r0, r1, r2, r3)
            r7.add(r0)
            goto L16
        L2e:
            kotlin.collections.f0.o0(r7)
            return r7
        L32:
            if (r7 == 0) goto L70
            java.nio.file.LinkOption[] r7 = new java.nio.file.LinkOption[r1]
            java.lang.Object[] r7 = java.util.Arrays.copyOf(r7, r1)
            java.nio.file.LinkOption[] r7 = (java.nio.file.LinkOption[]) r7
            boolean r7 = kotlin.io.path.e0.a(r0, r7)
            if (r7 != 0) goto L59
            java.io.FileNotFoundException r7 = new java.io.FileNotFoundException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "no such file: "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r7.<init>(r6)
            throw r7
        L59:
            java.io.IOException r7 = new java.io.IOException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "failed to list "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r7.<init>(r6)
            throw r7
        L70:
            return r3
    }

    private final java.nio.file.Path resolve(okio.Path r3) {
            r2 = this;
            java.nio.file.FileSystem r0 = r2.nioFileSystem
            java.lang.String r3 = r3.toString()
            r1 = 0
            java.lang.String[] r1 = new java.lang.String[r1]
            java.nio.file.Path r3 = kotlin.io.path.a0.a(r0, r3, r1)
            java.lang.String r0 = "getPath(...)"
            kotlin.jvm.internal.g0.o(r3, r0)
            return r3
    }

    @Override // okio.JvmSystemFileSystem, okio.FileSystem
    @org.jetbrains.annotations.NotNull
    public okio.Sink appendingSink(@org.jetbrains.annotations.NotNull okio.Path r3, boolean r4) {
            r2 = this;
            java.lang.String r0 = "file"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.util.List r0 = kotlin.collections.f0.j()
            java.nio.file.StandardOpenOption r1 = kotlin.io.path.m0.a()
            r0.add(r1)
            if (r4 != 0) goto L19
            java.nio.file.StandardOpenOption r4 = okio.g.a()
            r0.add(r4)
        L19:
            java.util.List r4 = kotlin.collections.f0.b(r0)
            java.nio.file.Path r3 = r2.resolve(r3)
            java.util.Collection r4 = (java.util.Collection) r4
            r0 = 0
            java.nio.file.StandardOpenOption[] r0 = new java.nio.file.StandardOpenOption[r0]
            java.lang.Object[] r4 = r4.toArray(r0)
            java.nio.file.StandardOpenOption[] r4 = (java.nio.file.StandardOpenOption[]) r4
            int r0 = r4.length
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r0)
            java.nio.file.OpenOption[] r4 = (java.nio.file.OpenOption[]) r4
            int r0 = r4.length
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r0)
            java.nio.file.OpenOption[] r4 = (java.nio.file.OpenOption[]) r4
            java.io.OutputStream r3 = kotlin.io.path.p0.a(r3, r4)
            java.lang.String r4 = "newOutputStream(...)"
            kotlin.jvm.internal.g0.o(r3, r4)
            okio.Sink r3 = okio.Okio.sink(r3)
            return r3
    }

    @Override // okio.NioSystemFileSystem, okio.JvmSystemFileSystem, okio.FileSystem
    public void atomicMove(@org.jetbrains.annotations.NotNull okio.Path r5, @org.jetbrains.annotations.NotNull okio.Path r6) {
            r4 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r0 = "target"
            kotlin.jvm.internal.g0.p(r6, r0)
            java.nio.file.Path r5 = r4.resolve(r5)     // Catch: java.nio.file.NoSuchFileException -> L33 java.lang.UnsupportedOperationException -> L35
            java.nio.file.Path r6 = r4.resolve(r6)     // Catch: java.nio.file.NoSuchFileException -> L33 java.lang.UnsupportedOperationException -> L35
            r0 = 2
            java.nio.file.CopyOption[] r1 = new java.nio.file.CopyOption[r0]     // Catch: java.nio.file.NoSuchFileException -> L33 java.lang.UnsupportedOperationException -> L35
            java.nio.file.StandardCopyOption r2 = okio.b.a()     // Catch: java.nio.file.NoSuchFileException -> L33 java.lang.UnsupportedOperationException -> L35
            r3 = 0
            r1[r3] = r2     // Catch: java.nio.file.NoSuchFileException -> L33 java.lang.UnsupportedOperationException -> L35
            java.nio.file.StandardCopyOption r2 = kotlin.io.path.r1.a()     // Catch: java.nio.file.NoSuchFileException -> L33 java.lang.UnsupportedOperationException -> L35
            r3 = 1
            r1[r3] = r2     // Catch: java.nio.file.NoSuchFileException -> L33 java.lang.UnsupportedOperationException -> L35
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r0)     // Catch: java.nio.file.NoSuchFileException -> L33 java.lang.UnsupportedOperationException -> L35
            java.nio.file.CopyOption[] r0 = (java.nio.file.CopyOption[]) r0     // Catch: java.nio.file.NoSuchFileException -> L33 java.lang.UnsupportedOperationException -> L35
            java.nio.file.Path r5 = kotlin.io.path.w2.a(r5, r6, r0)     // Catch: java.nio.file.NoSuchFileException -> L33 java.lang.UnsupportedOperationException -> L35
            java.lang.String r6 = "move(...)"
            kotlin.jvm.internal.g0.o(r5, r6)     // Catch: java.nio.file.NoSuchFileException -> L33 java.lang.UnsupportedOperationException -> L35
            return
        L33:
            r5 = move-exception
            goto L3d
        L35:
            java.io.IOException r5 = new java.io.IOException
            java.lang.String r6 = "atomic move not supported"
            r5.<init>(r6)
            throw r5
        L3d:
            java.io.FileNotFoundException r6 = new java.io.FileNotFoundException
            java.lang.String r5 = okio.c.a(r5)
            r6.<init>(r5)
            throw r6
    }

    @Override // okio.JvmSystemFileSystem, okio.FileSystem
    @org.jetbrains.annotations.NotNull
    public okio.Path canonicalize(@org.jetbrains.annotations.NotNull okio.Path r6) {
            r5 = this;
            java.lang.String r0 = "path"
            kotlin.jvm.internal.g0.p(r6, r0)
            okio.Path$Companion r0 = okio.Path.Companion     // Catch: java.nio.file.NoSuchFileException -> L1e
            java.nio.file.Path r1 = r5.resolve(r6)     // Catch: java.nio.file.NoSuchFileException -> L1e
            r2 = 0
            java.nio.file.LinkOption[] r3 = new java.nio.file.LinkOption[r2]     // Catch: java.nio.file.NoSuchFileException -> L1e
            java.nio.file.Path r1 = kotlin.io.path.q1.a(r1, r3)     // Catch: java.nio.file.NoSuchFileException -> L1e
            java.lang.String r3 = "toRealPath(...)"
            kotlin.jvm.internal.g0.o(r1, r3)     // Catch: java.nio.file.NoSuchFileException -> L1e
            r3 = 1
            r4 = 0
            okio.Path r6 = okio.Path.Companion.get$default(r0, r1, r2, r3, r4)     // Catch: java.nio.file.NoSuchFileException -> L1e
            return r6
        L1e:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "no such file: "
            r1.append(r2)
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            r0.<init>(r6)
            throw r0
    }

    @Override // okio.FileSystem, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r1 = this;
            java.nio.file.FileSystem r0 = r1.nioFileSystem
            com.huawei.secure.android.common.util.v.a(r0)
            return
    }

    @Override // okio.JvmSystemFileSystem, okio.FileSystem
    public void createDirectory(@org.jetbrains.annotations.NotNull okio.Path r4, boolean r5) {
            r3 = this;
            java.lang.String r0 = "dir"
            kotlin.jvm.internal.g0.p(r4, r0)
            okio.FileMetadata r0 = r3.metadataOrNull(r4)
            r1 = 0
            if (r0 == 0) goto L14
            boolean r0 = r0.isDirectory()
            r2 = 1
            if (r0 != r2) goto L14
            goto L15
        L14:
            r2 = 0
        L15:
            if (r2 == 0) goto L31
            if (r5 != 0) goto L1a
            goto L31
        L1a:
            java.io.IOException r5 = new java.io.IOException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            java.lang.String r4 = " already exists."
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r5.<init>(r4)
            throw r5
        L31:
            java.nio.file.Path r5 = r3.resolve(r4)     // Catch: java.io.IOException -> L47
            java.nio.file.attribute.FileAttribute[] r0 = new java.nio.file.attribute.FileAttribute[r1]     // Catch: java.io.IOException -> L47
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)     // Catch: java.io.IOException -> L47
            java.nio.file.attribute.FileAttribute[] r0 = (java.nio.file.attribute.FileAttribute[]) r0     // Catch: java.io.IOException -> L47
            java.nio.file.Path r5 = kotlin.io.path.p2.a(r5, r0)     // Catch: java.io.IOException -> L47
            java.lang.String r0 = "createDirectory(...)"
            kotlin.jvm.internal.g0.o(r5, r0)     // Catch: java.io.IOException -> L47
            return
        L47:
            r5 = move-exception
            if (r2 == 0) goto L4b
            return
        L4b:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "failed to create directory: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4, r5)
            throw r0
    }

    @Override // okio.NioSystemFileSystem, okio.JvmSystemFileSystem, okio.FileSystem
    public void createSymlink(@org.jetbrains.annotations.NotNull okio.Path r3, @org.jetbrains.annotations.NotNull okio.Path r4) {
            r2 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "target"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.nio.file.Path r3 = r2.resolve(r3)
            java.nio.file.Path r4 = r2.resolve(r4)
            r0 = 0
            java.nio.file.attribute.FileAttribute[] r1 = new java.nio.file.attribute.FileAttribute[r0]
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r0)
            java.nio.file.attribute.FileAttribute[] r0 = (java.nio.file.attribute.FileAttribute[]) r0
            java.nio.file.Path r3 = kotlin.io.path.k2.a(r3, r4, r0)
            java.lang.String r4 = "createSymbolicLink(...)"
            kotlin.jvm.internal.g0.o(r3, r4)
            return
    }

    @Override // okio.JvmSystemFileSystem, okio.FileSystem
    public void delete(@org.jetbrains.annotations.NotNull okio.Path r3, boolean r4) {
            r2 = this;
            java.lang.String r0 = "path"
            kotlin.jvm.internal.g0.p(r3, r0)
            boolean r0 = java.lang.Thread.interrupted()
            if (r0 != 0) goto L54
            java.nio.file.Path r0 = r2.resolve(r3)
            kotlin.io.path.l2.a(r0)     // Catch: java.io.IOException -> L13 java.nio.file.NoSuchFileException -> L3a
            return
        L13:
            r4 = 0
            java.nio.file.LinkOption[] r1 = new java.nio.file.LinkOption[r4]
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r1, r4)
            java.nio.file.LinkOption[] r4 = (java.nio.file.LinkOption[]) r4
            boolean r4 = kotlin.io.path.e0.a(r0, r4)
            if (r4 != 0) goto L23
            goto L3c
        L23:
            java.io.IOException r4 = new java.io.IOException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "failed to delete "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3)
            throw r4
        L3a:
            if (r4 != 0) goto L3d
        L3c:
            return
        L3d:
            java.io.FileNotFoundException r4 = new java.io.FileNotFoundException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "no such file: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3)
            throw r4
        L54:
            java.io.InterruptedIOException r3 = new java.io.InterruptedIOException
            java.lang.String r4 = "interrupted"
            r3.<init>(r4)
            throw r3
    }

    @Override // okio.JvmSystemFileSystem, okio.FileSystem
    @org.jetbrains.annotations.NotNull
    public java.util.List<okio.Path> list(@org.jetbrains.annotations.NotNull okio.Path r2) {
            r1 = this;
            java.lang.String r0 = "dir"
            kotlin.jvm.internal.g0.p(r2, r0)
            r0 = 1
            java.util.List r2 = r1.list(r2, r0)
            kotlin.jvm.internal.g0.m(r2)
            return r2
    }

    @Override // okio.JvmSystemFileSystem, okio.FileSystem
    @org.jetbrains.annotations.Nullable
    public java.util.List<okio.Path> listOrNull(@org.jetbrains.annotations.NotNull okio.Path r2) {
            r1 = this;
            java.lang.String r0 = "dir"
            kotlin.jvm.internal.g0.p(r2, r0)
            r0 = 0
            java.util.List r2 = r1.list(r2, r0)
            return r2
    }

    @Override // okio.NioSystemFileSystem, okio.JvmSystemFileSystem, okio.FileSystem
    @org.jetbrains.annotations.Nullable
    public okio.FileMetadata metadataOrNull(@org.jetbrains.annotations.NotNull okio.Path r2) {
            r1 = this;
            java.lang.String r0 = "path"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.nio.file.Path r2 = r1.resolve(r2)
            okio.FileMetadata r2 = r1.metadataOrNull(r2)
            return r2
    }

    @Override // okio.JvmSystemFileSystem, okio.FileSystem
    @org.jetbrains.annotations.NotNull
    public okio.FileHandle openReadOnly(@org.jetbrains.annotations.NotNull okio.Path r5) {
            r4 = this;
            java.lang.String r0 = "file"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.nio.file.Path r0 = r4.resolve(r5)     // Catch: java.nio.file.NoSuchFileException -> L20
            r1 = 1
            java.nio.file.OpenOption[] r1 = new java.nio.file.OpenOption[r1]     // Catch: java.nio.file.NoSuchFileException -> L20
            java.nio.file.StandardOpenOption r2 = okio.d.a()     // Catch: java.nio.file.NoSuchFileException -> L20
            r3 = 0
            r1[r3] = r2     // Catch: java.nio.file.NoSuchFileException -> L20
            java.nio.channels.FileChannel r5 = okio.h.a(r0, r1)     // Catch: java.nio.file.NoSuchFileException -> L20
            okio.NioFileSystemFileHandle r0 = new okio.NioFileSystemFileHandle
            kotlin.jvm.internal.g0.m(r5)
            r0.<init>(r3, r5)
            return r0
        L20:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "no such file: "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5)
            throw r0
    }

    @Override // okio.JvmSystemFileSystem, okio.FileSystem
    @org.jetbrains.annotations.NotNull
    public okio.FileHandle openReadWrite(@org.jetbrains.annotations.NotNull okio.Path r3, boolean r4, boolean r5) {
            r2 = this;
            java.lang.String r0 = "file"
            kotlin.jvm.internal.g0.p(r3, r0)
            if (r4 == 0) goto L12
            if (r5 != 0) goto La
            goto L12
        La:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "Cannot require mustCreate and mustExist at the same time."
            r3.<init>(r4)
            throw r3
        L12:
            java.util.List r0 = kotlin.collections.f0.j()
            java.nio.file.StandardOpenOption r1 = okio.d.a()
            r0.add(r1)
            java.nio.file.StandardOpenOption r1 = okio.e.a()
            r0.add(r1)
            if (r4 == 0) goto L2e
            java.nio.file.StandardOpenOption r4 = okio.f.a()
            r0.add(r4)
            goto L37
        L2e:
            if (r5 != 0) goto L37
            java.nio.file.StandardOpenOption r4 = okio.g.a()
            r0.add(r4)
        L37:
            java.util.List r4 = kotlin.collections.f0.b(r0)
            java.nio.file.Path r5 = r2.resolve(r3)     // Catch: java.nio.file.NoSuchFileException -> L5f
            java.util.Collection r4 = (java.util.Collection) r4     // Catch: java.nio.file.NoSuchFileException -> L5f
            r0 = 0
            java.nio.file.StandardOpenOption[] r0 = new java.nio.file.StandardOpenOption[r0]     // Catch: java.nio.file.NoSuchFileException -> L5f
            java.lang.Object[] r4 = r4.toArray(r0)     // Catch: java.nio.file.NoSuchFileException -> L5f
            java.nio.file.StandardOpenOption[] r4 = (java.nio.file.StandardOpenOption[]) r4     // Catch: java.nio.file.NoSuchFileException -> L5f
            int r0 = r4.length     // Catch: java.nio.file.NoSuchFileException -> L5f
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r0)     // Catch: java.nio.file.NoSuchFileException -> L5f
            java.nio.file.OpenOption[] r4 = (java.nio.file.OpenOption[]) r4     // Catch: java.nio.file.NoSuchFileException -> L5f
            java.nio.channels.FileChannel r3 = okio.h.a(r5, r4)     // Catch: java.nio.file.NoSuchFileException -> L5f
            okio.NioFileSystemFileHandle r4 = new okio.NioFileSystemFileHandle
            kotlin.jvm.internal.g0.m(r3)
            r5 = 1
            r4.<init>(r5, r3)
            return r4
        L5f:
            java.io.FileNotFoundException r4 = new java.io.FileNotFoundException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "no such file: "
            r5.append(r0)
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            r4.<init>(r3)
            throw r4
    }

    @Override // okio.JvmSystemFileSystem, okio.FileSystem
    @org.jetbrains.annotations.NotNull
    public okio.Sink sink(@org.jetbrains.annotations.NotNull okio.Path r3, boolean r4) {
            r2 = this;
            java.lang.String r0 = "file"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.util.List r0 = kotlin.collections.f0.j()
            if (r4 == 0) goto L12
            java.nio.file.StandardOpenOption r4 = okio.f.a()
            r0.add(r4)
        L12:
            java.util.List r4 = kotlin.collections.f0.b(r0)
            java.nio.file.Path r0 = r2.resolve(r3)     // Catch: java.nio.file.NoSuchFileException -> L41
            java.util.Collection r4 = (java.util.Collection) r4     // Catch: java.nio.file.NoSuchFileException -> L41
            r1 = 0
            java.nio.file.StandardOpenOption[] r1 = new java.nio.file.StandardOpenOption[r1]     // Catch: java.nio.file.NoSuchFileException -> L41
            java.lang.Object[] r4 = r4.toArray(r1)     // Catch: java.nio.file.NoSuchFileException -> L41
            java.nio.file.StandardOpenOption[] r4 = (java.nio.file.StandardOpenOption[]) r4     // Catch: java.nio.file.NoSuchFileException -> L41
            int r1 = r4.length     // Catch: java.nio.file.NoSuchFileException -> L41
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r1)     // Catch: java.nio.file.NoSuchFileException -> L41
            java.nio.file.OpenOption[] r4 = (java.nio.file.OpenOption[]) r4     // Catch: java.nio.file.NoSuchFileException -> L41
            int r1 = r4.length     // Catch: java.nio.file.NoSuchFileException -> L41
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r1)     // Catch: java.nio.file.NoSuchFileException -> L41
            java.nio.file.OpenOption[] r4 = (java.nio.file.OpenOption[]) r4     // Catch: java.nio.file.NoSuchFileException -> L41
            java.io.OutputStream r4 = kotlin.io.path.p0.a(r0, r4)     // Catch: java.nio.file.NoSuchFileException -> L41
            java.lang.String r0 = "newOutputStream(...)"
            kotlin.jvm.internal.g0.o(r4, r0)     // Catch: java.nio.file.NoSuchFileException -> L41
            okio.Sink r3 = okio.Okio.sink(r4)     // Catch: java.nio.file.NoSuchFileException -> L41
            return r3
        L41:
            java.io.FileNotFoundException r4 = new java.io.FileNotFoundException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "no such file: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3)
            throw r4
    }

    @Override // okio.JvmSystemFileSystem, okio.FileSystem
    @org.jetbrains.annotations.NotNull
    public okio.Source source(@org.jetbrains.annotations.NotNull okio.Path r4) {
            r3 = this;
            java.lang.String r0 = "file"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.nio.file.Path r0 = r3.resolve(r4)     // Catch: java.nio.file.NoSuchFileException -> L20
            r1 = 0
            java.nio.file.OpenOption[] r2 = new java.nio.file.OpenOption[r1]     // Catch: java.nio.file.NoSuchFileException -> L20
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r2, r1)     // Catch: java.nio.file.NoSuchFileException -> L20
            java.nio.file.OpenOption[] r1 = (java.nio.file.OpenOption[]) r1     // Catch: java.nio.file.NoSuchFileException -> L20
            java.io.InputStream r0 = kotlin.io.path.r0.a(r0, r1)     // Catch: java.nio.file.NoSuchFileException -> L20
            java.lang.String r1 = "newInputStream(...)"
            kotlin.jvm.internal.g0.o(r0, r1)     // Catch: java.nio.file.NoSuchFileException -> L20
            okio.Source r4 = okio.Okio.source(r0)     // Catch: java.nio.file.NoSuchFileException -> L20
            return r4
        L20:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "no such file: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    @Override // okio.NioSystemFileSystem, okio.JvmSystemFileSystem
    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r1 = this;
            java.nio.file.FileSystem r0 = r1.nioFileSystem
            java.lang.Class r0 = r0.getClass()
            kotlin.reflect.d r0 = kotlin.jvm.internal.o0.d(r0)
            java.lang.String r0 = r0.D()
            kotlin.jvm.internal.g0.m(r0)
            return r0
    }
}
