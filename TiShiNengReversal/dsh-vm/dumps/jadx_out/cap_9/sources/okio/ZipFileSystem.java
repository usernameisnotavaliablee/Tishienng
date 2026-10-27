package okio;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nZipFileSystem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ZipFileSystem.kt\nokio/ZipFileSystem\n+ 2 Okio.kt\nokio/Okio__OkioKt\n*L\n1#1,142:1\n58#2,4:143\n58#2,22:147\n66#2,10:169\n62#2,3:179\n77#2,3:182\n58#2,22:185\n*S KotlinDebug\n*F\n+ 1 ZipFileSystem.kt\nokio/ZipFileSystem\n*L\n55#1:143,4\n56#1:147,22\n55#1:169,10\n55#1:179,3\n55#1:182,3\n99#1:185,22\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class ZipFileSystem extends okio.FileSystem {

    @org.jetbrains.annotations.NotNull
    private static final okio.ZipFileSystem.Companion Companion = null;

    @org.jetbrains.annotations.NotNull
    private static final okio.Path ROOT = null;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String comment;

    @org.jetbrains.annotations.NotNull
    private final java.util.Map<okio.Path, okio.internal.ZipEntry> entries;

    @org.jetbrains.annotations.NotNull
    private final okio.FileSystem fileSystem;

    @org.jetbrains.annotations.NotNull
    private final okio.Path zipPath;

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

        @org.jetbrains.annotations.NotNull
        public final okio.Path getROOT() {
                r1 = this;
                okio.Path r0 = okio.ZipFileSystem.access$getROOT$cp()
                return r0
        }
    }

    static {
            okio.ZipFileSystem$Companion r0 = new okio.ZipFileSystem$Companion
            r1 = 0
            r0.<init>(r1)
            okio.ZipFileSystem.Companion = r0
            okio.Path$Companion r0 = okio.Path.Companion
            r2 = 0
            r3 = 1
            java.lang.String r4 = "/"
            okio.Path r0 = okio.Path.Companion.get$default(r0, r4, r2, r3, r1)
            okio.ZipFileSystem.ROOT = r0
            return
    }

    public ZipFileSystem(@org.jetbrains.annotations.NotNull okio.Path r2, @org.jetbrains.annotations.NotNull okio.FileSystem r3, @org.jetbrains.annotations.NotNull java.util.Map<okio.Path, okio.internal.ZipEntry> r4, @org.jetbrains.annotations.Nullable java.lang.String r5) {
            r1 = this;
            java.lang.String r0 = "zipPath"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "fileSystem"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "entries"
            kotlin.jvm.internal.g0.p(r4, r0)
            r1.<init>()
            r1.zipPath = r2
            r1.fileSystem = r3
            r1.entries = r4
            r1.comment = r5
            return
    }

    public static final /* synthetic */ okio.Path access$getROOT$cp() {
            okio.Path r0 = okio.ZipFileSystem.ROOT
            return r0
    }

    private final okio.Path canonicalizeInternal(okio.Path r3) {
            r2 = this;
            okio.Path r0 = okio.ZipFileSystem.ROOT
            r1 = 1
            okio.Path r3 = r0.resolve(r3, r1)
            return r3
    }

    private final java.util.List<okio.Path> list(okio.Path r3, boolean r4) {
            r2 = this;
            okio.Path r0 = r2.canonicalizeInternal(r3)
            java.util.Map<okio.Path, okio.internal.ZipEntry> r1 = r2.entries
            java.lang.Object r0 = r1.get(r0)
            okio.internal.ZipEntry r0 = (okio.internal.ZipEntry) r0
            if (r0 != 0) goto L29
            if (r4 != 0) goto L12
            r3 = 0
            return r3
        L12:
            java.io.IOException r4 = new java.io.IOException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "not a directory: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3)
            throw r4
        L29:
            java.util.List r3 = r0.getChildren()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.List r3 = kotlin.collections.f0.a6(r3)
            return r3
    }

    @Override // okio.FileSystem
    @org.jetbrains.annotations.NotNull
    public okio.Sink appendingSink(@org.jetbrains.annotations.NotNull okio.Path r1, boolean r2) {
            r0 = this;
            java.lang.String r2 = "file"
            kotlin.jvm.internal.g0.p(r1, r2)
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "zip file systems are read-only"
            r1.<init>(r2)
            throw r1
    }

    @Override // okio.FileSystem
    public void atomicMove(@org.jetbrains.annotations.NotNull okio.Path r2, @org.jetbrains.annotations.NotNull okio.Path r3) {
            r1 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r2 = "target"
            kotlin.jvm.internal.g0.p(r3, r2)
            java.io.IOException r2 = new java.io.IOException
            java.lang.String r3 = "zip file systems are read-only"
            r2.<init>(r3)
            throw r2
    }

    @Override // okio.FileSystem
    @org.jetbrains.annotations.NotNull
    public okio.Path canonicalize(@org.jetbrains.annotations.NotNull okio.Path r3) {
            r2 = this;
            java.lang.String r0 = "path"
            kotlin.jvm.internal.g0.p(r3, r0)
            okio.Path r0 = r2.canonicalizeInternal(r3)
            java.util.Map<okio.Path, okio.internal.ZipEntry> r1 = r2.entries
            boolean r1 = r1.containsKey(r0)
            if (r1 == 0) goto L12
            return r0
        L12:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r0.<init>(r3)
            throw r0
    }

    @Override // okio.FileSystem
    public void createDirectory(@org.jetbrains.annotations.NotNull okio.Path r1, boolean r2) {
            r0 = this;
            java.lang.String r2 = "dir"
            kotlin.jvm.internal.g0.p(r1, r2)
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "zip file systems are read-only"
            r1.<init>(r2)
            throw r1
    }

    @Override // okio.FileSystem
    public void createSymlink(@org.jetbrains.annotations.NotNull okio.Path r2, @org.jetbrains.annotations.NotNull okio.Path r3) {
            r1 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r2 = "target"
            kotlin.jvm.internal.g0.p(r3, r2)
            java.io.IOException r2 = new java.io.IOException
            java.lang.String r3 = "zip file systems are read-only"
            r2.<init>(r3)
            throw r2
    }

    @Override // okio.FileSystem
    public void delete(@org.jetbrains.annotations.NotNull okio.Path r1, boolean r2) {
            r0 = this;
            java.lang.String r2 = "path"
            kotlin.jvm.internal.g0.p(r1, r2)
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "zip file systems are read-only"
            r1.<init>(r2)
            throw r1
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
    public okio.FileMetadata metadataOrNull(@org.jetbrains.annotations.NotNull okio.Path r14) {
            r13 = this;
            java.lang.String r0 = "path"
            kotlin.jvm.internal.g0.p(r14, r0)
            okio.Path r14 = r13.canonicalizeInternal(r14)
            java.util.Map<okio.Path, okio.internal.ZipEntry> r0 = r13.entries
            java.lang.Object r14 = r0.get(r14)
            okio.internal.ZipEntry r14 = (okio.internal.ZipEntry) r14
            r1 = 0
            if (r14 != 0) goto L15
            return r1
        L15:
            long r2 = r14.getOffset()
            r4 = -1
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L70
            okio.FileSystem r0 = r13.fileSystem
            okio.Path r2 = r13.zipPath
            okio.FileHandle r2 = r0.openReadOnly(r2)
            long r3 = r14.getOffset()     // Catch: java.lang.Throwable -> L4e
            okio.Source r0 = r2.source(r3)     // Catch: java.lang.Throwable -> L4e
            okio.BufferedSource r3 = okio.Okio.buffer(r0)     // Catch: java.lang.Throwable -> L4e
            okio.internal.ZipEntry r14 = okio.internal.ZipFilesKt.readLocalHeader(r3, r14)     // Catch: java.lang.Throwable -> L41
            if (r3 == 0) goto L3f
            r3.close()     // Catch: java.lang.Throwable -> L3d
            goto L3f
        L3d:
            r0 = move-exception
            goto L53
        L3f:
            r0 = r1
            goto L53
        L41:
            r0 = move-exception
            r14 = r0
            if (r3 == 0) goto L51
            r3.close()     // Catch: java.lang.Throwable -> L49
            goto L51
        L49:
            r0 = move-exception
            kotlin.l.a(r14, r0)     // Catch: java.lang.Throwable -> L4e
            goto L51
        L4e:
            r0 = move-exception
            r14 = r0
            goto L60
        L51:
            r0 = r14
            r14 = r1
        L53:
            if (r0 != 0) goto L5f
            if (r2 == 0) goto L5d
            r2.close()     // Catch: java.lang.Throwable -> L5b
            goto L5d
        L5b:
            r0 = move-exception
            goto L6c
        L5d:
            r0 = r1
            goto L6c
        L5f:
            throw r0     // Catch: java.lang.Throwable -> L4e
        L60:
            if (r2 == 0) goto L6a
            r2.close()     // Catch: java.lang.Throwable -> L66
            goto L6a
        L66:
            r0 = move-exception
            kotlin.l.a(r14, r0)
        L6a:
            r0 = r14
            r14 = r1
        L6c:
            if (r0 != 0) goto L6f
            goto L70
        L6f:
            throw r0
        L70:
            okio.FileMetadata r2 = new okio.FileMetadata
            boolean r0 = r14.isDirectory()
            r3 = r0 ^ 1
            boolean r4 = r14.isDirectory()
            boolean r0 = r14.isDirectory()
            if (r0 == 0) goto L84
        L82:
            r6 = r1
            goto L8d
        L84:
            long r0 = r14.getSize()
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            goto L82
        L8d:
            java.lang.Long r7 = r14.getCreatedAtMillis$okio()
            java.lang.Long r8 = r14.getLastModifiedAtMillis$okio()
            java.lang.Long r9 = r14.getLastAccessedAtMillis$okio()
            r11 = 128(0x80, float:1.8E-43)
            r12 = 0
            r5 = 0
            r10 = 0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r2
    }

    @Override // okio.FileSystem
    @org.jetbrains.annotations.NotNull
    public okio.FileHandle openReadOnly(@org.jetbrains.annotations.NotNull okio.Path r2) {
            r1 = this;
            java.lang.String r0 = "file"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "not implemented yet!"
            r2.<init>(r0)
            throw r2
    }

    @Override // okio.FileSystem
    @org.jetbrains.annotations.NotNull
    public okio.FileHandle openReadWrite(@org.jetbrains.annotations.NotNull okio.Path r1, boolean r2, boolean r3) {
            r0 = this;
            java.lang.String r2 = "file"
            kotlin.jvm.internal.g0.p(r1, r2)
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "zip entries are not writable"
            r1.<init>(r2)
            throw r1
    }

    @Override // okio.FileSystem
    @org.jetbrains.annotations.NotNull
    public okio.Sink sink(@org.jetbrains.annotations.NotNull okio.Path r1, boolean r2) {
            r0 = this;
            java.lang.String r2 = "file"
            kotlin.jvm.internal.g0.p(r1, r2)
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "zip file systems are read-only"
            r1.<init>(r2)
            throw r1
    }

    @Override // okio.FileSystem
    @org.jetbrains.annotations.NotNull
    public okio.Source source(@org.jetbrains.annotations.NotNull okio.Path r8) throws java.io.IOException {
            r7 = this;
            java.lang.String r0 = "file"
            kotlin.jvm.internal.g0.p(r8, r0)
            okio.Path r0 = r7.canonicalizeInternal(r8)
            java.util.Map<okio.Path, okio.internal.ZipEntry> r1 = r7.entries
            java.lang.Object r0 = r1.get(r0)
            okio.internal.ZipEntry r0 = (okio.internal.ZipEntry) r0
            if (r0 == 0) goto L74
            okio.FileSystem r8 = r7.fileSystem
            okio.Path r1 = r7.zipPath
            okio.FileHandle r8 = r8.openReadOnly(r1)
            r1 = 0
            long r2 = r0.getOffset()     // Catch: java.lang.Throwable -> L33
            okio.Source r2 = r8.source(r2)     // Catch: java.lang.Throwable -> L33
            okio.BufferedSource r2 = okio.Okio.buffer(r2)     // Catch: java.lang.Throwable -> L33
            if (r8 == 0) goto L2f
            r8.close()     // Catch: java.lang.Throwable -> L2e
            goto L2f
        L2e:
            r1 = move-exception
        L2f:
            r6 = r2
            r2 = r1
            r1 = r6
            goto L3e
        L33:
            r2 = move-exception
            if (r8 == 0) goto L3e
            r8.close()     // Catch: java.lang.Throwable -> L3a
            goto L3e
        L3a:
            r8 = move-exception
            kotlin.l.a(r2, r8)
        L3e:
            if (r2 != 0) goto L73
            okio.internal.ZipFilesKt.skipLocalHeader(r1)
            int r8 = r0.getCompressionMethod()
            r2 = 1
            if (r8 != 0) goto L54
            okio.internal.FixedLengthSource r8 = new okio.internal.FixedLengthSource
            long r3 = r0.getSize()
            r8.<init>(r1, r3, r2)
            goto L72
        L54:
            okio.InflaterSource r8 = new okio.InflaterSource
            okio.internal.FixedLengthSource r3 = new okio.internal.FixedLengthSource
            long r4 = r0.getCompressedSize()
            r3.<init>(r1, r4, r2)
            java.util.zip.Inflater r1 = new java.util.zip.Inflater
            r1.<init>(r2)
            r8.<init>(r3, r1)
            okio.internal.FixedLengthSource r1 = new okio.internal.FixedLengthSource
            long r2 = r0.getSize()
            r0 = 0
            r1.<init>(r8, r2, r0)
            r8 = r1
        L72:
            return r8
        L73:
            throw r2
        L74:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "no such file: "
            r1.append(r2)
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            r0.<init>(r8)
            throw r0
    }
}
