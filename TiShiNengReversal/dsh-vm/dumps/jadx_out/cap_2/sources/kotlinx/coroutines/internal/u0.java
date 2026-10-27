package kotlinx.coroutines.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nSynchronized.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 2 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n*L\n1#1,33:1\n20#2:34\n*S KotlinDebug\n*F\n+ 1 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n*L\n31#1:34\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class u0 {
    @kotlinx.coroutines.InternalCoroutinesApi
    public static final <T> T a(@org.jetbrains.annotations.NotNull java.lang.Object r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<? extends T> r2) {
            monitor-enter(r1)
            r0 = 1
            java.lang.Object r2 = r2.invoke()     // Catch: java.lang.Throwable -> Le
            kotlin.jvm.internal.d0.d(r0)
            monitor-exit(r1)
            kotlin.jvm.internal.d0.c(r0)
            return r2
        Le:
            r2 = move-exception
            kotlin.jvm.internal.d0.d(r0)
            monitor-exit(r1)
            kotlin.jvm.internal.d0.c(r0)
            throw r2
    }
}
