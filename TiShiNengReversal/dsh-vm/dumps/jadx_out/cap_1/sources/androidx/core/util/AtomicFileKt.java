package androidx.core.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nAtomicFile.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AtomicFile.kt\nandroidx/core/util/AtomicFileKt\n*L\n1#1,76:1\n30#1,13:77\n*S KotlinDebug\n*F\n+ 1 AtomicFile.kt\nandroidx/core/util/AtomicFileKt\n*L\n48#1:77,13\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class AtomicFileKt {
    @org.jetbrains.annotations.NotNull
    public static final byte[] readBytes(@org.jetbrains.annotations.NotNull android.util.AtomicFile r0) {
            byte[] r0 = r0.readFully()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String readText(@org.jetbrains.annotations.NotNull android.util.AtomicFile r1, @org.jetbrains.annotations.NotNull java.nio.charset.Charset r2) {
            java.lang.String r0 = new java.lang.String
            byte[] r1 = r1.readFully()
            r0.<init>(r1, r2)
            return r0
    }

    public static /* synthetic */ java.lang.String readText$default(android.util.AtomicFile r0, java.nio.charset.Charset r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L6
            java.nio.charset.Charset r1 = kotlin.text.e.b
        L6:
            java.lang.String r0 = readText(r0, r1)
            return r0
    }

    public static final void tryWrite(@org.jetbrains.annotations.NotNull android.util.AtomicFile r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.io.FileOutputStream, kotlin.n1> r3) {
            java.io.FileOutputStream r0 = r2.startWrite()
            r1 = 1
            r3.invoke(r0)     // Catch: java.lang.Throwable -> L12
            kotlin.jvm.internal.d0.d(r1)
            r2.finishWrite(r0)
            kotlin.jvm.internal.d0.c(r1)
            return
        L12:
            r3 = move-exception
            kotlin.jvm.internal.d0.d(r1)
            r2.failWrite(r0)
            kotlin.jvm.internal.d0.c(r1)
            throw r3
    }

    public static final void writeBytes(@org.jetbrains.annotations.NotNull android.util.AtomicFile r1, @org.jetbrains.annotations.NotNull byte[] r2) {
            java.io.FileOutputStream r0 = r1.startWrite()
            r0.write(r2)     // Catch: java.lang.Throwable -> Lb
            r1.finishWrite(r0)
            return
        Lb:
            r2 = move-exception
            r1.failWrite(r0)
            throw r2
    }

    public static final void writeText(@org.jetbrains.annotations.NotNull android.util.AtomicFile r0, @org.jetbrains.annotations.NotNull java.lang.String r1, @org.jetbrains.annotations.NotNull java.nio.charset.Charset r2) {
            byte[] r1 = r1.getBytes(r2)
            java.lang.String r2 = "this as java.lang.String).getBytes(charset)"
            kotlin.jvm.internal.g0.o(r1, r2)
            writeBytes(r0, r1)
            return
    }

    public static /* synthetic */ void writeText$default(android.util.AtomicFile r0, java.lang.String r1, java.nio.charset.Charset r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L6
            java.nio.charset.Charset r2 = kotlin.text.e.b
        L6:
            writeText(r0, r1, r2)
            return
    }
}
