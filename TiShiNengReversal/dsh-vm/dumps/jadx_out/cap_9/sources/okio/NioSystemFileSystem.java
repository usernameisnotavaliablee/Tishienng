package okio;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nNioSystemFileSystem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NioSystemFileSystem.kt\nokio/NioSystemFileSystem\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,92:1\n1#2:93\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class NioSystemFileSystem extends okio.JvmSystemFileSystem {
    public NioSystemFileSystem() {
            r0 = this;
            r0.<init>()
            return
    }

    private final java.lang.Long zeroToNull(java.nio.file.attribute.FileTime r6) {
            r5 = this;
            long r0 = okio.i.a(r6)
            java.lang.Long r6 = java.lang.Long.valueOf(r0)
            long r0 = r6.longValue()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L13
            return r6
        L13:
            r6 = 0
            return r6
    }

    @Override // okio.JvmSystemFileSystem, okio.FileSystem
    public void atomicMove(@org.jetbrains.annotations.NotNull okio.Path r4, @org.jetbrains.annotations.NotNull okio.Path r5) {
            r3 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "target"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.nio.file.Path r4 = r4.toNioPath()     // Catch: java.nio.file.NoSuchFileException -> L27 java.lang.UnsupportedOperationException -> L29
            java.nio.file.Path r5 = r5.toNioPath()     // Catch: java.nio.file.NoSuchFileException -> L27 java.lang.UnsupportedOperationException -> L29
            r0 = 2
            java.nio.file.CopyOption[] r0 = new java.nio.file.CopyOption[r0]     // Catch: java.nio.file.NoSuchFileException -> L27 java.lang.UnsupportedOperationException -> L29
            java.nio.file.StandardCopyOption r1 = okio.b.a()     // Catch: java.nio.file.NoSuchFileException -> L27 java.lang.UnsupportedOperationException -> L29
            r2 = 0
            r0[r2] = r1     // Catch: java.nio.file.NoSuchFileException -> L27 java.lang.UnsupportedOperationException -> L29
            java.nio.file.StandardCopyOption r1 = kotlin.io.path.r1.a()     // Catch: java.nio.file.NoSuchFileException -> L27 java.lang.UnsupportedOperationException -> L29
            r2 = 1
            r0[r2] = r1     // Catch: java.nio.file.NoSuchFileException -> L27 java.lang.UnsupportedOperationException -> L29
            kotlin.io.path.w2.a(r4, r5, r0)     // Catch: java.nio.file.NoSuchFileException -> L27 java.lang.UnsupportedOperationException -> L29
            return
        L27:
            r4 = move-exception
            goto L31
        L29:
            java.io.IOException r4 = new java.io.IOException
            java.lang.String r5 = "atomic move not supported"
            r4.<init>(r5)
            throw r4
        L31:
            java.io.FileNotFoundException r5 = new java.io.FileNotFoundException
            java.lang.String r4 = okio.c.a(r4)
            r5.<init>(r4)
            throw r5
    }

    @Override // okio.JvmSystemFileSystem, okio.FileSystem
    public void createSymlink(@org.jetbrains.annotations.NotNull okio.Path r2, @org.jetbrains.annotations.NotNull okio.Path r3) {
            r1 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "target"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.nio.file.Path r2 = r2.toNioPath()
            java.nio.file.Path r3 = r3.toNioPath()
            r0 = 0
            java.nio.file.attribute.FileAttribute[] r0 = new java.nio.file.attribute.FileAttribute[r0]
            kotlin.io.path.k2.a(r2, r3, r0)
            return
    }

    @org.jetbrains.annotations.Nullable
    protected final okio.FileMetadata metadataOrNull(@org.jetbrains.annotations.NotNull java.nio.file.Path r20) {
            r19 = this;
            r0 = r19
            r1 = r20
            java.lang.String r2 = "nioPath"
            kotlin.jvm.internal.g0.p(r1, r2)
            r2 = 0
            java.lang.Class r3 = com.huawei.secure.android.common.util.z.a()     // Catch: java.lang.Throwable -> L74
            r4 = 1
            java.nio.file.LinkOption[] r5 = new java.nio.file.LinkOption[r4]     // Catch: java.lang.Throwable -> L74
            java.nio.file.LinkOption r6 = com.huawei.secure.android.common.util.b0.a()     // Catch: java.lang.Throwable -> L74
            r7 = 0
            r5[r7] = r6     // Catch: java.lang.Throwable -> L74
            java.nio.file.attribute.BasicFileAttributes r3 = com.huawei.secure.android.common.util.q.a(r1, r3, r5)     // Catch: java.lang.Throwable -> L74
            boolean r5 = okio.k.a(r3)
            if (r5 == 0) goto L27
            java.nio.file.Path r1 = com.huawei.secure.android.common.util.h0.a(r1)
            goto L28
        L27:
            r1 = r2
        L28:
            okio.FileMetadata r8 = new okio.FileMetadata
            boolean r9 = com.huawei.secure.android.common.util.c0.a(r3)
            boolean r10 = kotlin.io.path.c1.a(r3)
            if (r1 == 0) goto L3c
            okio.Path$Companion r5 = okio.Path.Companion
            okio.Path r1 = okio.Path.Companion.get$default(r5, r1, r7, r4, r2)
            r11 = r1
            goto L3d
        L3c:
            r11 = r2
        L3d:
            long r4 = okio.l.a(r3)
            java.lang.Long r12 = java.lang.Long.valueOf(r4)
            java.nio.file.attribute.FileTime r1 = okio.m.a(r3)
            if (r1 == 0) goto L51
            java.lang.Long r1 = r0.zeroToNull(r1)
            r13 = r1
            goto L52
        L51:
            r13 = r2
        L52:
            java.nio.file.attribute.FileTime r1 = okio.n.a(r3)
            if (r1 == 0) goto L5e
            java.lang.Long r1 = r0.zeroToNull(r1)
            r14 = r1
            goto L5f
        L5e:
            r14 = r2
        L5f:
            java.nio.file.attribute.FileTime r1 = okio.j.a(r3)
            if (r1 == 0) goto L69
            java.lang.Long r2 = r0.zeroToNull(r1)
        L69:
            r15 = r2
            r17 = 128(0x80, float:1.8E-43)
            r18 = 0
            r16 = 0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return r8
        L74:
            return r2
    }

    @Override // okio.JvmSystemFileSystem, okio.FileSystem
    @org.jetbrains.annotations.Nullable
    public okio.FileMetadata metadataOrNull(@org.jetbrains.annotations.NotNull okio.Path r2) {
            r1 = this;
            java.lang.String r0 = "path"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.nio.file.Path r2 = r2.toNioPath()
            okio.FileMetadata r2 = r1.metadataOrNull(r2)
            return r2
    }

    @Override // okio.JvmSystemFileSystem
    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = "NioSystemFileSystem"
            return r0
    }
}
