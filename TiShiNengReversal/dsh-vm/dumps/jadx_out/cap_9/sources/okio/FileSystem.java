package okio;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nFileSystem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileSystem.kt\nokio/FileSystem\n+ 2 Okio.kt\nokio/Okio__OkioKt\n*L\n1#1,191:1\n58#2,22:192\n58#2,22:214\n*S KotlinDebug\n*F\n+ 1 FileSystem.kt\nokio/FileSystem\n*L\n73#1:192,22\n95#1:214,22\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public abstract class FileSystem implements java.io.Closeable {

    @org.jetbrains.annotations.NotNull
    public static final okio.FileSystem.Companion Companion = null;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final okio.FileSystem RESOURCES = null;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final okio.FileSystem SYSTEM = null;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final okio.Path SYSTEM_TEMPORARY_DIRECTORY = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class Companion {
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

        @kotlin.jvm.JvmStatic
        @kotlin.jvm.JvmName(name = "get")
        @org.jetbrains.annotations.NotNull
        public final okio.FileSystem get(@org.jetbrains.annotations.NotNull java.nio.file.FileSystem r2) {
                r1 = this;
                java.lang.String r0 = "<this>"
                kotlin.jvm.internal.g0.p(r2, r0)
                okio.NioFileSystemWrappingFileSystem r0 = new okio.NioFileSystemWrappingFileSystem
                r0.<init>(r2)
                return r0
        }
    }

    /* renamed from: -write$default, reason: not valid java name */
    public static /* synthetic */ java.lang.Object m54write$default(okio.FileSystem r1, okio.Path r2, boolean r3, kotlin.jvm.functions.Function1 r4, int r5, java.lang.Object r6) throws java.io.IOException {
            if (r6 != 0) goto L45
            r5 = r5 & 2
            if (r5 == 0) goto L7
            r3 = 0
        L7:
            java.lang.String r5 = "file"
            kotlin.jvm.internal.g0.p(r2, r5)
            java.lang.String r5 = "writerAction"
            kotlin.jvm.internal.g0.p(r4, r5)
            okio.Sink r1 = r1.sink(r2, r3)
            okio.BufferedSink r1 = okio.Okio.buffer(r1)
            r2 = 0
            r3 = 1
            java.lang.Object r4 = r4.invoke(r1)     // Catch: java.lang.Throwable -> L30
            kotlin.jvm.internal.d0.d(r3)
            if (r1 == 0) goto L29
            r1.close()     // Catch: java.lang.Throwable -> L28
            goto L29
        L28:
            r2 = move-exception
        L29:
            kotlin.jvm.internal.d0.c(r3)
            r0 = r4
            r4 = r2
            r2 = r0
            goto L41
        L30:
            r4 = move-exception
            kotlin.jvm.internal.d0.d(r3)
            if (r1 == 0) goto L3e
            r1.close()     // Catch: java.lang.Throwable -> L3a
            goto L3e
        L3a:
            r1 = move-exception
            kotlin.l.a(r4, r1)
        L3e:
            kotlin.jvm.internal.d0.c(r3)
        L41:
            if (r4 != 0) goto L44
            return r2
        L44:
            throw r4
        L45:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Super calls with default arguments not supported in this target, function: write"
            r1.<init>(r2)
            throw r1
    }

    static {
            okio.FileSystem$Companion r0 = new okio.FileSystem$Companion
            r1 = 0
            r0.<init>(r1)
            okio.FileSystem.Companion = r0
            java.lang.String r0 = "java.nio.file.Files"
            java.lang.Class.forName(r0)     // Catch: java.lang.ClassNotFoundException -> L13
            okio.NioSystemFileSystem r0 = new okio.NioSystemFileSystem     // Catch: java.lang.ClassNotFoundException -> L13
            r0.<init>()     // Catch: java.lang.ClassNotFoundException -> L13
            goto L18
        L13:
            okio.JvmSystemFileSystem r0 = new okio.JvmSystemFileSystem
            r0.<init>()
        L18:
            okio.FileSystem.SYSTEM = r0
            okio.Path$Companion r0 = okio.Path.Companion
            java.lang.String r2 = "java.io.tmpdir"
            java.lang.String r2 = java.lang.System.getProperty(r2)
            java.lang.String r3 = "getProperty(...)"
            kotlin.jvm.internal.g0.o(r2, r3)
            r3 = 0
            r4 = 1
            okio.Path r0 = okio.Path.Companion.get$default(r0, r2, r3, r4, r1)
            okio.FileSystem.SYSTEM_TEMPORARY_DIRECTORY = r0
            okio.internal.ResourceFileSystem r1 = new okio.internal.ResourceFileSystem
            java.lang.Class<okio.internal.ResourceFileSystem> r0 = okio.internal.ResourceFileSystem.class
            java.lang.ClassLoader r2 = r0.getClassLoader()
            java.lang.String r0 = "getClassLoader(...)"
            kotlin.jvm.internal.g0.o(r2, r0)
            r5 = 4
            r6 = 0
            r4 = 0
            r1.<init>(r2, r3, r4, r5, r6)
            okio.FileSystem.RESOURCES = r1
            return
    }

    public FileSystem() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ okio.Sink appendingSink$default(okio.FileSystem r0, okio.Path r1, boolean r2, int r3, java.lang.Object r4) throws java.io.IOException {
            if (r4 != 0) goto Lc
            r3 = r3 & 2
            if (r3 == 0) goto L7
            r2 = 0
        L7:
            okio.Sink r0 = r0.appendingSink(r1, r2)
            return r0
        Lc:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Super calls with default arguments not supported in this target, function: appendingSink"
            r0.<init>(r1)
            throw r0
    }

    public static /* synthetic */ void createDirectories$default(okio.FileSystem r0, okio.Path r1, boolean r2, int r3, java.lang.Object r4) throws java.io.IOException {
            if (r4 != 0) goto Lb
            r3 = r3 & 2
            if (r3 == 0) goto L7
            r2 = 0
        L7:
            r0.createDirectories(r1, r2)
            return
        Lb:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Super calls with default arguments not supported in this target, function: createDirectories"
            r0.<init>(r1)
            throw r0
    }

    public static /* synthetic */ void createDirectory$default(okio.FileSystem r0, okio.Path r1, boolean r2, int r3, java.lang.Object r4) throws java.io.IOException {
            if (r4 != 0) goto Lb
            r3 = r3 & 2
            if (r3 == 0) goto L7
            r2 = 0
        L7:
            r0.createDirectory(r1, r2)
            return
        Lb:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Super calls with default arguments not supported in this target, function: createDirectory"
            r0.<init>(r1)
            throw r0
    }

    public static /* synthetic */ void delete$default(okio.FileSystem r0, okio.Path r1, boolean r2, int r3, java.lang.Object r4) throws java.io.IOException {
            if (r4 != 0) goto Lb
            r3 = r3 & 2
            if (r3 == 0) goto L7
            r2 = 0
        L7:
            r0.delete(r1, r2)
            return
        Lb:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Super calls with default arguments not supported in this target, function: delete"
            r0.<init>(r1)
            throw r0
    }

    public static /* synthetic */ void deleteRecursively$default(okio.FileSystem r0, okio.Path r1, boolean r2, int r3, java.lang.Object r4) throws java.io.IOException {
            if (r4 != 0) goto Lb
            r3 = r3 & 2
            if (r3 == 0) goto L7
            r2 = 0
        L7:
            r0.deleteRecursively(r1, r2)
            return
        Lb:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Super calls with default arguments not supported in this target, function: deleteRecursively"
            r0.<init>(r1)
            throw r0
    }

    @kotlin.jvm.JvmStatic
    @kotlin.jvm.JvmName(name = "get")
    @org.jetbrains.annotations.NotNull
    public static final okio.FileSystem get(@org.jetbrains.annotations.NotNull java.nio.file.FileSystem r1) {
            okio.FileSystem$Companion r0 = okio.FileSystem.Companion
            okio.FileSystem r1 = r0.get(r1)
            return r1
    }

    public static /* synthetic */ kotlin.sequences.m listRecursively$default(okio.FileSystem r0, okio.Path r1, boolean r2, int r3, java.lang.Object r4) {
            if (r4 != 0) goto Lc
            r3 = r3 & 2
            if (r3 == 0) goto L7
            r2 = 0
        L7:
            kotlin.sequences.m r0 = r0.listRecursively(r1, r2)
            return r0
        Lc:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Super calls with default arguments not supported in this target, function: listRecursively"
            r0.<init>(r1)
            throw r0
    }

    public static /* synthetic */ okio.FileHandle openReadWrite$default(okio.FileSystem r1, okio.Path r2, boolean r3, boolean r4, int r5, java.lang.Object r6) throws java.io.IOException {
            if (r6 != 0) goto L12
            r6 = r5 & 2
            r0 = 0
            if (r6 == 0) goto L8
            r3 = 0
        L8:
            r5 = r5 & 4
            if (r5 == 0) goto Ld
            r4 = 0
        Ld:
            okio.FileHandle r1 = r1.openReadWrite(r2, r3, r4)
            return r1
        L12:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Super calls with default arguments not supported in this target, function: openReadWrite"
            r1.<init>(r2)
            throw r1
    }

    public static /* synthetic */ okio.Sink sink$default(okio.FileSystem r0, okio.Path r1, boolean r2, int r3, java.lang.Object r4) throws java.io.IOException {
            if (r4 != 0) goto Lc
            r3 = r3 & 2
            if (r3 == 0) goto L7
            r2 = 0
        L7:
            okio.Sink r0 = r0.sink(r1, r2)
            return r0
        Lc:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Super calls with default arguments not supported in this target, function: sink"
            r0.<init>(r1)
            throw r0
    }

    @kotlin.jvm.JvmName(name = "-read")
    /* renamed from: -read, reason: not valid java name */
    public final <T> T m55read(@org.jetbrains.annotations.NotNull okio.Path r4, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super okio.BufferedSource, ? extends T> r5) throws java.io.IOException {
            r3 = this;
            java.lang.String r0 = "file"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "readerAction"
            kotlin.jvm.internal.g0.p(r5, r0)
            okio.Source r4 = r3.source(r4)
            okio.BufferedSource r4 = okio.Okio.buffer(r4)
            r0 = 1
            r1 = 0
            java.lang.Object r5 = r5.invoke(r4)     // Catch: java.lang.Throwable -> L29
            kotlin.jvm.internal.d0.d(r0)
            if (r4 == 0) goto L22
            r4.close()     // Catch: java.lang.Throwable -> L21
            goto L22
        L21:
            r1 = move-exception
        L22:
            kotlin.jvm.internal.d0.c(r0)
            r2 = r1
            r1 = r5
            r5 = r2
            goto L3a
        L29:
            r5 = move-exception
            kotlin.jvm.internal.d0.d(r0)
            if (r4 == 0) goto L37
            r4.close()     // Catch: java.lang.Throwable -> L33
            goto L37
        L33:
            r4 = move-exception
            kotlin.l.a(r5, r4)
        L37:
            kotlin.jvm.internal.d0.c(r0)
        L3a:
            if (r5 != 0) goto L3d
            return r1
        L3d:
            throw r5
    }

    @kotlin.jvm.JvmName(name = "-write")
    /* renamed from: -write, reason: not valid java name */
    public final <T> T m56write(@org.jetbrains.annotations.NotNull okio.Path r3, boolean r4, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super okio.BufferedSink, ? extends T> r5) throws java.io.IOException {
            r2 = this;
            java.lang.String r0 = "file"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "writerAction"
            kotlin.jvm.internal.g0.p(r5, r0)
            okio.Sink r3 = r2.sink(r3, r4)
            okio.BufferedSink r3 = okio.Okio.buffer(r3)
            r4 = 1
            r0 = 0
            java.lang.Object r5 = r5.invoke(r3)     // Catch: java.lang.Throwable -> L29
            kotlin.jvm.internal.d0.d(r4)
            if (r3 == 0) goto L22
            r3.close()     // Catch: java.lang.Throwable -> L21
            goto L22
        L21:
            r0 = move-exception
        L22:
            kotlin.jvm.internal.d0.c(r4)
            r1 = r0
            r0 = r5
            r5 = r1
            goto L3a
        L29:
            r5 = move-exception
            kotlin.jvm.internal.d0.d(r4)
            if (r3 == 0) goto L37
            r3.close()     // Catch: java.lang.Throwable -> L33
            goto L37
        L33:
            r3 = move-exception
            kotlin.l.a(r5, r3)
        L37:
            kotlin.jvm.internal.d0.c(r4)
        L3a:
            if (r5 != 0) goto L3d
            return r0
        L3d:
            throw r5
    }

    @org.jetbrains.annotations.NotNull
    public final okio.Sink appendingSink(@org.jetbrains.annotations.NotNull okio.Path r2) throws java.io.IOException {
            r1 = this;
            java.lang.String r0 = "file"
            kotlin.jvm.internal.g0.p(r2, r0)
            r0 = 0
            okio.Sink r2 = r1.appendingSink(r2, r0)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public abstract okio.Sink appendingSink(@org.jetbrains.annotations.NotNull okio.Path r1, boolean r2) throws java.io.IOException;

    public abstract void atomicMove(@org.jetbrains.annotations.NotNull okio.Path r1, @org.jetbrains.annotations.NotNull okio.Path r2) throws java.io.IOException;

    @org.jetbrains.annotations.NotNull
    public abstract okio.Path canonicalize(@org.jetbrains.annotations.NotNull okio.Path r1) throws java.io.IOException;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r0 = this;
            return
    }

    public void copy(@org.jetbrains.annotations.NotNull okio.Path r2, @org.jetbrains.annotations.NotNull okio.Path r3) throws java.io.IOException {
            r1 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "target"
            kotlin.jvm.internal.g0.p(r3, r0)
            okio.internal.FileSystem.commonCopy(r1, r2, r3)
            return
    }

    public final void createDirectories(@org.jetbrains.annotations.NotNull okio.Path r2) throws java.io.IOException {
            r1 = this;
            java.lang.String r0 = "dir"
            kotlin.jvm.internal.g0.p(r2, r0)
            r0 = 0
            r1.createDirectories(r2, r0)
            return
    }

    public final void createDirectories(@org.jetbrains.annotations.NotNull okio.Path r2, boolean r3) throws java.io.IOException {
            r1 = this;
            java.lang.String r0 = "dir"
            kotlin.jvm.internal.g0.p(r2, r0)
            okio.internal.FileSystem.commonCreateDirectories(r1, r2, r3)
            return
    }

    public final void createDirectory(@org.jetbrains.annotations.NotNull okio.Path r2) throws java.io.IOException {
            r1 = this;
            java.lang.String r0 = "dir"
            kotlin.jvm.internal.g0.p(r2, r0)
            r0 = 0
            r1.createDirectory(r2, r0)
            return
    }

    public abstract void createDirectory(@org.jetbrains.annotations.NotNull okio.Path r1, boolean r2) throws java.io.IOException;

    public abstract void createSymlink(@org.jetbrains.annotations.NotNull okio.Path r1, @org.jetbrains.annotations.NotNull okio.Path r2) throws java.io.IOException;

    public final void delete(@org.jetbrains.annotations.NotNull okio.Path r2) throws java.io.IOException {
            r1 = this;
            java.lang.String r0 = "path"
            kotlin.jvm.internal.g0.p(r2, r0)
            r0 = 0
            r1.delete(r2, r0)
            return
    }

    public abstract void delete(@org.jetbrains.annotations.NotNull okio.Path r1, boolean r2) throws java.io.IOException;

    public final void deleteRecursively(@org.jetbrains.annotations.NotNull okio.Path r2) throws java.io.IOException {
            r1 = this;
            java.lang.String r0 = "fileOrDirectory"
            kotlin.jvm.internal.g0.p(r2, r0)
            r0 = 0
            r1.deleteRecursively(r2, r0)
            return
    }

    public void deleteRecursively(@org.jetbrains.annotations.NotNull okio.Path r2, boolean r3) throws java.io.IOException {
            r1 = this;
            java.lang.String r0 = "fileOrDirectory"
            kotlin.jvm.internal.g0.p(r2, r0)
            okio.internal.FileSystem.commonDeleteRecursively(r1, r2, r3)
            return
    }

    public final boolean exists(@org.jetbrains.annotations.NotNull okio.Path r2) throws java.io.IOException {
            r1 = this;
            java.lang.String r0 = "path"
            kotlin.jvm.internal.g0.p(r2, r0)
            boolean r2 = okio.internal.FileSystem.commonExists(r1, r2)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public abstract java.util.List<okio.Path> list(@org.jetbrains.annotations.NotNull okio.Path r1) throws java.io.IOException;

    @org.jetbrains.annotations.Nullable
    public abstract java.util.List<okio.Path> listOrNull(@org.jetbrains.annotations.NotNull okio.Path r1);

    @org.jetbrains.annotations.NotNull
    public final kotlin.sequences.m<okio.Path> listRecursively(@org.jetbrains.annotations.NotNull okio.Path r2) {
            r1 = this;
            java.lang.String r0 = "dir"
            kotlin.jvm.internal.g0.p(r2, r0)
            r0 = 0
            kotlin.sequences.m r2 = r1.listRecursively(r2, r0)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.sequences.m<okio.Path> listRecursively(@org.jetbrains.annotations.NotNull okio.Path r2, boolean r3) {
            r1 = this;
            java.lang.String r0 = "dir"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.sequences.m r2 = okio.internal.FileSystem.commonListRecursively(r1, r2, r3)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public final okio.FileMetadata metadata(@org.jetbrains.annotations.NotNull okio.Path r2) throws java.io.IOException {
            r1 = this;
            java.lang.String r0 = "path"
            kotlin.jvm.internal.g0.p(r2, r0)
            okio.FileMetadata r2 = okio.internal.FileSystem.commonMetadata(r1, r2)
            return r2
    }

    @org.jetbrains.annotations.Nullable
    public abstract okio.FileMetadata metadataOrNull(@org.jetbrains.annotations.NotNull okio.Path r1) throws java.io.IOException;

    @org.jetbrains.annotations.NotNull
    public abstract okio.FileHandle openReadOnly(@org.jetbrains.annotations.NotNull okio.Path r1) throws java.io.IOException;

    @org.jetbrains.annotations.NotNull
    public final okio.FileHandle openReadWrite(@org.jetbrains.annotations.NotNull okio.Path r2) throws java.io.IOException {
            r1 = this;
            java.lang.String r0 = "file"
            kotlin.jvm.internal.g0.p(r2, r0)
            r0 = 0
            okio.FileHandle r2 = r1.openReadWrite(r2, r0, r0)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public abstract okio.FileHandle openReadWrite(@org.jetbrains.annotations.NotNull okio.Path r1, boolean r2, boolean r3) throws java.io.IOException;

    @org.jetbrains.annotations.NotNull
    public final okio.Sink sink(@org.jetbrains.annotations.NotNull okio.Path r2) throws java.io.IOException {
            r1 = this;
            java.lang.String r0 = "file"
            kotlin.jvm.internal.g0.p(r2, r0)
            r0 = 0
            okio.Sink r2 = r1.sink(r2, r0)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public abstract okio.Sink sink(@org.jetbrains.annotations.NotNull okio.Path r1, boolean r2) throws java.io.IOException;

    @org.jetbrains.annotations.NotNull
    public abstract okio.Source source(@org.jetbrains.annotations.NotNull okio.Path r1) throws java.io.IOException;
}
