package androidx.collection.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nLockExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LockExt.kt\nandroidx/collection/internal/LockExtKt\n+ 2 Lock.jvm.kt\nandroidx/collection/internal/Lock\n*L\n1#1,27:1\n26#2:28\n*S KotlinDebug\n*F\n+ 1 LockExt.kt\nandroidx/collection/internal/LockExtKt\n*L\n25#1:28\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class LockExtKt {
    /* renamed from: synchronized, reason: not valid java name */
    public static final <T> T m45synchronized(@org.jetbrains.annotations.NotNull androidx.collection.internal.Lock r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<? extends T> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "block"
            kotlin.jvm.internal.g0.p(r2, r0)
            monitor-enter(r1)
            r0 = 1
            java.lang.Object r2 = r2.invoke()     // Catch: java.lang.Throwable -> L18
            kotlin.jvm.internal.d0.d(r0)
            monitor-exit(r1)
            kotlin.jvm.internal.d0.c(r0)
            return r2
        L18:
            r2 = move-exception
            kotlin.jvm.internal.d0.d(r0)
            monitor-exit(r1)
            kotlin.jvm.internal.d0.c(r0)
            throw r2
    }
}
