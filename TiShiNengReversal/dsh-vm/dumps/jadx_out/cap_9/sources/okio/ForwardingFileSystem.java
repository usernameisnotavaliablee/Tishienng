package okio;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nForwardingFileSystem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ForwardingFileSystem.kt\nokio/ForwardingFileSystem\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,252:1\n1634#2,3:253\n1634#2,3:256\n*S KotlinDebug\n*F\n+ 1 ForwardingFileSystem.kt\nokio/ForwardingFileSystem\n*L\n170#1:253,3\n178#1:256,3\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public abstract class ForwardingFileSystem extends okio.FileSystem {

    @org.jetbrains.annotations.NotNull
    private final okio.FileSystem delegate;

    public ForwardingFileSystem(@org.jetbrains.annotations.NotNull okio.FileSystem r2) {
            r1 = this;
            java.lang.String r0 = "delegate"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.delegate = r2
            return
    }

    public static /* synthetic */ okio.Path a(okio.ForwardingFileSystem r0, okio.Path r1) {
            okio.Path r0 = listRecursively$lambda$0(r0, r1)
            return r0
    }

    private static final okio.Path listRecursively$lambda$0(okio.ForwardingFileSystem r1, okio.Path r2) {
            java.lang.String r0 = "it"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "listRecursively"
            okio.Path r1 = r1.onPathResult(r2, r0)
            return r1
    }

    @Override // okio.FileSystem
    @org.jetbrains.annotations.NotNull
    public okio.Sink appendingSink(@org.jetbrains.annotations.NotNull okio.Path r3, boolean r4) throws java.io.IOException {
            r2 = this;
            java.lang.String r0 = "file"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r1 = "appendingSink"
            okio.Path r3 = r2.onPathParameter(r3, r1, r0)
            okio.FileSystem r0 = r2.delegate
            okio.Sink r3 = r0.appendingSink(r3, r4)
            return r3
    }

    @Override // okio.FileSystem
    public void atomicMove(@org.jetbrains.annotations.NotNull okio.Path r4, @org.jetbrains.annotations.NotNull okio.Path r5) throws java.io.IOException {
            r3 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r1 = "target"
            kotlin.jvm.internal.g0.p(r5, r1)
            java.lang.String r2 = "atomicMove"
            okio.Path r4 = r3.onPathParameter(r4, r2, r0)
            okio.Path r5 = r3.onPathParameter(r5, r2, r1)
            okio.FileSystem r0 = r3.delegate
            r0.atomicMove(r4, r5)
            return
    }

    @Override // okio.FileSystem
    @org.jetbrains.annotations.NotNull
    public okio.Path canonicalize(@org.jetbrains.annotations.NotNull okio.Path r3) throws java.io.IOException {
            r2 = this;
            java.lang.String r0 = "path"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r1 = "canonicalize"
            okio.Path r3 = r2.onPathParameter(r3, r1, r0)
            okio.FileSystem r0 = r2.delegate
            okio.Path r3 = r0.canonicalize(r3)
            okio.Path r3 = r2.onPathResult(r3, r1)
            return r3
    }

    @Override // okio.FileSystem, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r1 = this;
            okio.FileSystem r0 = r1.delegate
            r0.close()
            return
    }

    @Override // okio.FileSystem
    public void createDirectory(@org.jetbrains.annotations.NotNull okio.Path r3, boolean r4) throws java.io.IOException {
            r2 = this;
            java.lang.String r0 = "dir"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r1 = "createDirectory"
            okio.Path r3 = r2.onPathParameter(r3, r1, r0)
            okio.FileSystem r0 = r2.delegate
            r0.createDirectory(r3, r4)
            return
    }

    @Override // okio.FileSystem
    public void createSymlink(@org.jetbrains.annotations.NotNull okio.Path r4, @org.jetbrains.annotations.NotNull okio.Path r5) throws java.io.IOException {
            r3 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r1 = "target"
            kotlin.jvm.internal.g0.p(r5, r1)
            java.lang.String r2 = "createSymlink"
            okio.Path r4 = r3.onPathParameter(r4, r2, r0)
            okio.Path r5 = r3.onPathParameter(r5, r2, r1)
            okio.FileSystem r0 = r3.delegate
            r0.createSymlink(r4, r5)
            return
    }

    @kotlin.jvm.JvmName(name = "delegate")
    @org.jetbrains.annotations.NotNull
    public final okio.FileSystem delegate() {
            r1 = this;
            okio.FileSystem r0 = r1.delegate
            return r0
    }

    @Override // okio.FileSystem
    public void delete(@org.jetbrains.annotations.NotNull okio.Path r3, boolean r4) throws java.io.IOException {
            r2 = this;
            java.lang.String r0 = "path"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r1 = "delete"
            okio.Path r3 = r2.onPathParameter(r3, r1, r0)
            okio.FileSystem r0 = r2.delegate
            r0.delete(r3, r4)
            return
    }

    @Override // okio.FileSystem
    @org.jetbrains.annotations.NotNull
    public java.util.List<okio.Path> list(@org.jetbrains.annotations.NotNull okio.Path r4) throws java.io.IOException {
            r3 = this;
            java.lang.String r0 = "dir"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r1 = "list"
            okio.Path r4 = r3.onPathParameter(r4, r1, r0)
            okio.FileSystem r0 = r3.delegate
            java.util.List r4 = r0.list(r4)
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r4 = r4.iterator()
        L1c:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L30
            java.lang.Object r2 = r4.next()
            okio.Path r2 = (okio.Path) r2
            okio.Path r2 = r3.onPathResult(r2, r1)
            r0.add(r2)
            goto L1c
        L30:
            kotlin.collections.f0.o0(r0)
            return r0
    }

    @Override // okio.FileSystem
    @org.jetbrains.annotations.Nullable
    public java.util.List<okio.Path> listOrNull(@org.jetbrains.annotations.NotNull okio.Path r4) {
            r3 = this;
            java.lang.String r0 = "dir"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r1 = "listOrNull"
            okio.Path r4 = r3.onPathParameter(r4, r1, r0)
            okio.FileSystem r0 = r3.delegate
            java.util.List r4 = r0.listOrNull(r4)
            if (r4 != 0) goto L15
            r4 = 0
            return r4
        L15:
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r4 = r4.iterator()
        L20:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L34
            java.lang.Object r2 = r4.next()
            okio.Path r2 = (okio.Path) r2
            okio.Path r2 = r3.onPathResult(r2, r1)
            r0.add(r2)
            goto L20
        L34:
            kotlin.collections.f0.o0(r0)
            return r0
    }

    @Override // okio.FileSystem
    @org.jetbrains.annotations.NotNull
    public kotlin.sequences.m<okio.Path> listRecursively(@org.jetbrains.annotations.NotNull okio.Path r3, boolean r4) {
            r2 = this;
            java.lang.String r0 = "dir"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r1 = "listRecursively"
            okio.Path r3 = r2.onPathParameter(r3, r1, r0)
            okio.FileSystem r0 = r2.delegate
            kotlin.sequences.m r3 = r0.listRecursively(r3, r4)
            okio.a r4 = new okio.a
            r4.<init>(r2)
            kotlin.sequences.m r3 = kotlin.sequences.p.N1(r3, r4)
            return r3
    }

    @Override // okio.FileSystem
    @org.jetbrains.annotations.Nullable
    public okio.FileMetadata metadataOrNull(@org.jetbrains.annotations.NotNull okio.Path r14) throws java.io.IOException {
            r13 = this;
            java.lang.String r0 = "path"
            kotlin.jvm.internal.g0.p(r14, r0)
            java.lang.String r1 = "metadataOrNull"
            okio.Path r14 = r13.onPathParameter(r14, r1, r0)
            okio.FileSystem r0 = r13.delegate
            okio.FileMetadata r2 = r0.metadataOrNull(r14)
            if (r2 != 0) goto L15
            r14 = 0
            return r14
        L15:
            okio.Path r14 = r2.getSymlinkTarget()
            if (r14 != 0) goto L1c
            return r2
        L1c:
            okio.Path r14 = r2.getSymlinkTarget()
            okio.Path r5 = r13.onPathResult(r14, r1)
            r11 = 251(0xfb, float:3.52E-43)
            r12 = 0
            r3 = 0
            r4 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            okio.FileMetadata r14 = okio.FileMetadata.copy$default(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r14
    }

    @org.jetbrains.annotations.NotNull
    public okio.Path onPathParameter(@org.jetbrains.annotations.NotNull okio.Path r2, @org.jetbrains.annotations.NotNull java.lang.String r3, @org.jetbrains.annotations.NotNull java.lang.String r4) {
            r1 = this;
            java.lang.String r0 = "path"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "functionName"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r3 = "parameterName"
            kotlin.jvm.internal.g0.p(r4, r3)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public okio.Path onPathResult(@org.jetbrains.annotations.NotNull okio.Path r2, @org.jetbrains.annotations.NotNull java.lang.String r3) {
            r1 = this;
            java.lang.String r0 = "path"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "functionName"
            kotlin.jvm.internal.g0.p(r3, r0)
            return r2
    }

    @Override // okio.FileSystem
    @org.jetbrains.annotations.NotNull
    public okio.FileHandle openReadOnly(@org.jetbrains.annotations.NotNull okio.Path r3) throws java.io.IOException {
            r2 = this;
            java.lang.String r0 = "file"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r1 = "openReadOnly"
            okio.Path r3 = r2.onPathParameter(r3, r1, r0)
            okio.FileSystem r0 = r2.delegate
            okio.FileHandle r3 = r0.openReadOnly(r3)
            return r3
    }

    @Override // okio.FileSystem
    @org.jetbrains.annotations.NotNull
    public okio.FileHandle openReadWrite(@org.jetbrains.annotations.NotNull okio.Path r3, boolean r4, boolean r5) throws java.io.IOException {
            r2 = this;
            java.lang.String r0 = "file"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r1 = "openReadWrite"
            okio.Path r3 = r2.onPathParameter(r3, r1, r0)
            okio.FileSystem r0 = r2.delegate
            okio.FileHandle r3 = r0.openReadWrite(r3, r4, r5)
            return r3
    }

    @Override // okio.FileSystem
    @org.jetbrains.annotations.NotNull
    public okio.Sink sink(@org.jetbrains.annotations.NotNull okio.Path r3, boolean r4) throws java.io.IOException {
            r2 = this;
            java.lang.String r0 = "file"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r1 = "sink"
            okio.Path r3 = r2.onPathParameter(r3, r1, r0)
            okio.FileSystem r0 = r2.delegate
            okio.Sink r3 = r0.sink(r3, r4)
            return r3
    }

    @Override // okio.FileSystem
    @org.jetbrains.annotations.NotNull
    public okio.Source source(@org.jetbrains.annotations.NotNull okio.Path r3) throws java.io.IOException {
            r2 = this;
            java.lang.String r0 = "file"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r1 = "source"
            okio.Path r3 = r2.onPathParameter(r3, r1, r0)
            okio.FileSystem r0 = r2.delegate
            okio.Source r3 = r0.source(r3)
            return r3
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r2.getClass()
            kotlin.reflect.d r1 = kotlin.jvm.internal.o0.d(r1)
            java.lang.String r1 = r1.D()
            r0.append(r1)
            r1 = 40
            r0.append(r1)
            okio.FileSystem r1 = r2.delegate
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
