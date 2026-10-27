package okio;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nJvmSystemFileSystem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JvmSystemFileSystem.kt\nokio/JvmSystemFileSystem\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,158:1\n11896#2,3:159\n*S KotlinDebug\n*F\n+ 1 JvmSystemFileSystem.kt\nokio/JvmSystemFileSystem\n*L\n77#1:159,3\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class JvmSystemFileSystem extends okio.FileSystem {
    public JvmSystemFileSystem() {
            r0 = this;
            r0.<init>()
            return
    }

    private final java.util.List<okio.Path> list(okio.Path r5, boolean r6) {
            r4 = this;
            java.io.File r0 = r5.toFile()
            java.lang.String[] r1 = r0.list()
            if (r1 != 0) goto L42
            if (r6 == 0) goto L40
            boolean r6 = r0.exists()
            if (r6 != 0) goto L29
            java.io.FileNotFoundException r6 = new java.io.FileNotFoundException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "no such file: "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r6.<init>(r5)
            throw r6
        L29:
            java.io.IOException r6 = new java.io.IOException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "failed to list "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r6.<init>(r5)
            throw r6
        L40:
            r5 = 0
            return r5
        L42:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            int r0 = r1.length
            r2 = 0
        L49:
            if (r2 >= r0) goto L5a
            r3 = r1[r2]
            kotlin.jvm.internal.g0.m(r3)
            okio.Path r3 = r5.resolve(r3)
            r6.add(r3)
            int r2 = r2 + 1
            goto L49
        L5a:
            kotlin.collections.f0.o0(r6)
            return r6
    }

    private final void requireCreate(okio.Path r3) {
            r2 = this;
            boolean r0 = r2.exists(r3)
            if (r0 != 0) goto L7
            return
        L7:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r3 = " already exists."
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    private final void requireExist(okio.Path r3) {
            r2 = this;
            boolean r0 = r2.exists(r3)
            if (r0 == 0) goto L7
            return
        L7:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r3 = " doesn't exist."
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    @Override // okio.FileSystem
    @org.jetbrains.annotations.NotNull
    public okio.Sink appendingSink(@org.jetbrains.annotations.NotNull okio.Path r2, boolean r3) {
            r1 = this;
            java.lang.String r0 = "file"
            kotlin.jvm.internal.g0.p(r2, r0)
            if (r3 == 0) goto La
            r1.requireExist(r2)
        La:
            java.io.File r2 = r2.toFile()
            r3 = 1
            okio.Sink r2 = okio.Okio.sink(r2, r3)
            return r2
    }

    @Override // okio.FileSystem
    public void atomicMove(@org.jetbrains.annotations.NotNull okio.Path r4, @org.jetbrains.annotations.NotNull okio.Path r5) {
            r3 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "target"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.io.File r0 = r4.toFile()
            java.io.File r1 = r5.toFile()
            boolean r0 = r0.renameTo(r1)
            if (r0 == 0) goto L19
            return
        L19:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "failed to move "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = " to "
            r1.append(r4)
            r1.append(r5)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    @Override // okio.FileSystem
    @org.jetbrains.annotations.NotNull
    public okio.Path canonicalize(@org.jetbrains.annotations.NotNull okio.Path r5) {
            r4 = this;
            java.lang.String r0 = "path"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.io.File r5 = r5.toFile()
            java.io.File r5 = r5.getCanonicalFile()
            boolean r0 = r5.exists()
            if (r0 == 0) goto L20
            okio.Path$Companion r0 = okio.Path.Companion
            kotlin.jvm.internal.g0.m(r5)
            r1 = 1
            r2 = 0
            r3 = 0
            okio.Path r5 = okio.Path.Companion.get$default(r0, r5, r3, r1, r2)
            return r5
        L20:
            java.io.FileNotFoundException r5 = new java.io.FileNotFoundException
            java.lang.String r0 = "no such file"
            r5.<init>(r0)
            throw r5
    }

    @Override // okio.FileSystem
    public void createDirectory(@org.jetbrains.annotations.NotNull okio.Path r3, boolean r4) {
            r2 = this;
            java.lang.String r0 = "dir"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.io.File r0 = r3.toFile()
            boolean r0 = r0.mkdir()
            if (r0 != 0) goto L4d
            okio.FileMetadata r0 = r2.metadataOrNull(r3)
            if (r0 == 0) goto L36
            boolean r0 = r0.isDirectory()
            r1 = 1
            if (r0 != r1) goto L36
            if (r4 != 0) goto L1f
            goto L4d
        L1f:
            java.io.IOException r4 = new java.io.IOException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            java.lang.String r3 = " already exists."
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3)
            throw r4
        L36:
            java.io.IOException r4 = new java.io.IOException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "failed to create directory: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3)
            throw r4
        L4d:
            return
    }

    @Override // okio.FileSystem
    public void createSymlink(@org.jetbrains.annotations.NotNull okio.Path r2, @org.jetbrains.annotations.NotNull okio.Path r3) {
            r1 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r2 = "target"
            kotlin.jvm.internal.g0.p(r3, r2)
            java.io.IOException r2 = new java.io.IOException
            java.lang.String r3 = "unsupported"
            r2.<init>(r3)
            throw r2
    }

    @Override // okio.FileSystem
    public void delete(@org.jetbrains.annotations.NotNull okio.Path r3, boolean r4) {
            r2 = this;
            java.lang.String r0 = "path"
            kotlin.jvm.internal.g0.p(r3, r0)
            boolean r0 = java.lang.Thread.interrupted()
            if (r0 != 0) goto L4d
            java.io.File r0 = r3.toFile()
            boolean r1 = r0.delete()
            if (r1 != 0) goto L4c
            boolean r0 = r0.exists()
            if (r0 != 0) goto L35
            if (r4 != 0) goto L1e
            goto L4c
        L1e:
            java.io.FileNotFoundException r4 = new java.io.FileNotFoundException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "no such file: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3)
            throw r4
        L35:
            java.io.IOException r4 = new java.io.IOException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "failed to delete "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3)
            throw r4
        L4c:
            return
        L4d:
            java.io.InterruptedIOException r3 = new java.io.InterruptedIOException
            java.lang.String r4 = "interrupted"
            r3.<init>(r4)
            throw r3
    }

    @Override // okio.FileSystem
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

    @Override // okio.FileSystem
    @org.jetbrains.annotations.Nullable
    public java.util.List<okio.Path> listOrNull(@org.jetbrains.annotations.NotNull okio.Path r2) {
            r1 = this;
            java.lang.String r0 = "dir"
            kotlin.jvm.internal.g0.p(r2, r0)
            r0 = 0
            java.util.List r2 = r1.list(r2, r0)
            return r2
    }

    @Override // okio.FileSystem
    @org.jetbrains.annotations.Nullable
    public okio.FileMetadata metadataOrNull(@org.jetbrains.annotations.NotNull okio.Path r12) {
            r11 = this;
            java.lang.String r0 = "path"
            kotlin.jvm.internal.g0.p(r12, r0)
            java.io.File r12 = r12.toFile()
            boolean r1 = r12.isFile()
            boolean r2 = r12.isDirectory()
            long r3 = r12.lastModified()
            long r5 = r12.length()
            if (r1 != 0) goto L2f
            if (r2 != 0) goto L2f
            r7 = 0
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 != 0) goto L2f
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 != 0) goto L2f
            boolean r12 = r12.exists()
            if (r12 != 0) goto L2f
            r12 = 0
            return r12
        L2f:
            okio.FileMetadata r0 = new okio.FileMetadata
            java.lang.Long r12 = java.lang.Long.valueOf(r5)
            java.lang.Long r6 = java.lang.Long.valueOf(r3)
            r9 = 128(0x80, float:1.8E-43)
            r10 = 0
            r3 = 0
            r5 = 0
            r7 = 0
            r8 = 0
            r4 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r0
    }

    @Override // okio.FileSystem
    @org.jetbrains.annotations.NotNull
    public okio.FileHandle openReadOnly(@org.jetbrains.annotations.NotNull okio.Path r4) {
            r3 = this;
            java.lang.String r0 = "file"
            kotlin.jvm.internal.g0.p(r4, r0)
            okio.JvmFileHandle r0 = new okio.JvmFileHandle
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile
            java.io.File r4 = r4.toFile()
            java.lang.String r2 = "r"
            r1.<init>(r4, r2)
            r4 = 0
            r0.<init>(r4, r1)
            return r0
    }

    @Override // okio.FileSystem
    @org.jetbrains.annotations.NotNull
    public okio.FileHandle openReadWrite(@org.jetbrains.annotations.NotNull okio.Path r2, boolean r3, boolean r4) {
            r1 = this;
            java.lang.String r0 = "file"
            kotlin.jvm.internal.g0.p(r2, r0)
            if (r3 == 0) goto L12
            if (r4 != 0) goto La
            goto L12
        La:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Cannot require mustCreate and mustExist at the same time."
            r2.<init>(r3)
            throw r2
        L12:
            if (r3 == 0) goto L17
            r1.requireCreate(r2)
        L17:
            if (r4 == 0) goto L1c
            r1.requireExist(r2)
        L1c:
            okio.JvmFileHandle r3 = new okio.JvmFileHandle
            java.io.RandomAccessFile r4 = new java.io.RandomAccessFile
            java.io.File r2 = r2.toFile()
            java.lang.String r0 = "rw"
            r4.<init>(r2, r0)
            r2 = 1
            r3.<init>(r2, r4)
            return r3
    }

    @Override // okio.FileSystem
    @org.jetbrains.annotations.NotNull
    public okio.Sink sink(@org.jetbrains.annotations.NotNull okio.Path r3, boolean r4) {
            r2 = this;
            java.lang.String r0 = "file"
            kotlin.jvm.internal.g0.p(r3, r0)
            if (r4 == 0) goto La
            r2.requireCreate(r3)
        La:
            java.io.File r3 = r3.toFile()
            r4 = 1
            r0 = 0
            r1 = 0
            okio.Sink r3 = okio.Okio.sink$default(r3, r1, r4, r0)
            return r3
    }

    @Override // okio.FileSystem
    @org.jetbrains.annotations.NotNull
    public okio.Source source(@org.jetbrains.annotations.NotNull okio.Path r2) {
            r1 = this;
            java.lang.String r0 = "file"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.io.File r2 = r2.toFile()
            okio.Source r2 = okio.Okio.source(r2)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = "JvmSystemFileSystem"
            return r0
    }
}
