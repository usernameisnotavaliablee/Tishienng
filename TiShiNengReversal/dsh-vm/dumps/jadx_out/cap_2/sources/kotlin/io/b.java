package kotlin.io;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.JvmName(name = "CloseableKt")
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class b {
    @kotlin.SinceKotlin(version = "1.1")
    @kotlin.PublishedApi
    public static final void a(@org.jetbrains.annotations.Nullable java.io.Closeable r0, @org.jetbrains.annotations.Nullable java.lang.Throwable r1) {
            if (r0 == 0) goto L10
            if (r1 != 0) goto L8
            r0.close()
            return
        L8:
            r0.close()     // Catch: java.lang.Throwable -> Lc
            return
        Lc:
            r0 = move-exception
            kotlin.l.a(r1, r0)
        L10:
            return
    }

    @kotlin.internal.InlineOnly
    private static final <T extends java.io.Closeable, R> R b(T r2, kotlin.jvm.functions.Function1<? super T, ? extends R> r3) {
            java.lang.String r0 = "block"
            kotlin.jvm.internal.g0.p(r3, r0)
            r0 = 1
            java.lang.Object r3 = r3.invoke(r2)     // Catch: java.lang.Throwable -> L15
            kotlin.jvm.internal.d0.d(r0)
            r1 = 0
            a(r2, r1)
            kotlin.jvm.internal.d0.c(r0)
            return r3
        L15:
            r3 = move-exception
            throw r3     // Catch: java.lang.Throwable -> L17
        L17:
            r1 = move-exception
            kotlin.jvm.internal.d0.d(r0)
            a(r2, r3)
            kotlin.jvm.internal.d0.c(r0)
            throw r1
    }
}
