package androidx.room.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
@kotlin.jvm.JvmName(name = "FileUtil")
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nFileUtil.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileUtil.android.kt\nandroidx/room/util/FileUtil\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,59:1\n1#2:60\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class FileUtil {
    @android.annotation.SuppressLint({"LambdaLast"})
    public static final void copy(@org.jetbrains.annotations.NotNull java.nio.channels.ReadableByteChannel r9, @org.jetbrains.annotations.NotNull java.nio.channels.FileChannel r10) throws java.io.IOException {
            java.lang.String r0 = "input"
            kotlin.jvm.internal.g0.p(r9, r0)
            java.lang.String r0 = "output"
            kotlin.jvm.internal.g0.p(r10, r0)
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L43
            r1 = 23
            r2 = 0
            if (r0 <= r1) goto L21
            r5 = 0
            r7 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r4 = r9
            r3 = r10
            r3.transferFrom(r4, r5, r7)     // Catch: java.lang.Throwable -> L1e
            goto L39
        L1e:
            r0 = move-exception
        L1f:
            r9 = r0
            goto L47
        L21:
            r4 = r9
            r3 = r10
            java.io.InputStream r9 = java.nio.channels.Channels.newInputStream(r4)     // Catch: java.lang.Throwable -> L1e
            java.io.OutputStream r10 = java.nio.channels.Channels.newOutputStream(r3)     // Catch: java.lang.Throwable -> L1e
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r0 = new byte[r0]     // Catch: java.lang.Throwable -> L1e
        L2f:
            int r1 = r9.read(r0)     // Catch: java.lang.Throwable -> L1e
            if (r1 <= 0) goto L39
            r10.write(r0, r2, r1)     // Catch: java.lang.Throwable -> L1e
            goto L2f
        L39:
            r3.force(r2)     // Catch: java.lang.Throwable -> L1e
            r4.close()
            r3.close()
            return
        L43:
            r0 = move-exception
            r4 = r9
            r3 = r10
            goto L1f
        L47:
            r4.close()
            r3.close()
            throw r9
    }
}
