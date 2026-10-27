package androidx.room.concurrent;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class ReentrantLockKt {
    public static final <T> T withLock(@org.jetbrains.annotations.NotNull java.util.concurrent.locks.ReentrantLock r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<? extends T> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "block"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.lock()
            r0 = 1
            java.lang.Object r2 = r2.invoke()     // Catch: java.lang.Throwable -> L1c
            kotlin.jvm.internal.d0.d(r0)
            r1.unlock()
            kotlin.jvm.internal.d0.c(r0)
            return r2
        L1c:
            r2 = move-exception
            kotlin.jvm.internal.d0.d(r0)
            r1.unlock()
            kotlin.jvm.internal.d0.c(r0)
            throw r2
    }
}
