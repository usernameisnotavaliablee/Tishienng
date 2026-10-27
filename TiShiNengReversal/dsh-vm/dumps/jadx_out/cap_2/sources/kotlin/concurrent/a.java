package kotlin.concurrent;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.JvmName(name = "LocksKt")
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nLocks.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Locks.kt\nkotlin/concurrent/LocksKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,74:1\n1#2:75\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class a {
    @kotlin.internal.InlineOnly
    private static final <T> T a(java.util.concurrent.locks.ReentrantReadWriteLock r1, kotlin.jvm.functions.Function0<? extends T> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "action"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r1.readLock()
            r1.lock()
            r0 = 1
            java.lang.Object r2 = r2.invoke()     // Catch: java.lang.Throwable -> L20
            kotlin.jvm.internal.d0.d(r0)
            r1.unlock()
            kotlin.jvm.internal.d0.c(r0)
            return r2
        L20:
            r2 = move-exception
            kotlin.jvm.internal.d0.d(r0)
            r1.unlock()
            kotlin.jvm.internal.d0.c(r0)
            throw r2
    }

    @kotlin.internal.InlineOnly
    private static final <T> T b(java.util.concurrent.locks.Lock r1, kotlin.jvm.functions.Function0<? extends T> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "action"
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

    @kotlin.internal.InlineOnly
    private static final <T> T c(java.util.concurrent.locks.ReentrantReadWriteLock r4, kotlin.jvm.functions.Function0<? extends T> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "action"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r4.readLock()
            int r1 = r4.getWriteHoldCount()
            r2 = 0
            if (r1 != 0) goto L1a
            int r1 = r4.getReadHoldCount()
            goto L1b
        L1a:
            r1 = 0
        L1b:
            r3 = 0
        L1c:
            if (r3 >= r1) goto L24
            r0.unlock()
            int r3 = r3 + 1
            goto L1c
        L24:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r4 = r4.writeLock()
            r4.lock()
            r3 = 1
            java.lang.Object r5 = r5.invoke()     // Catch: java.lang.Throwable -> L42
            kotlin.jvm.internal.d0.d(r3)
        L33:
            if (r2 >= r1) goto L3b
            r0.lock()
            int r2 = r2 + 1
            goto L33
        L3b:
            r4.unlock()
            kotlin.jvm.internal.d0.c(r3)
            return r5
        L42:
            r5 = move-exception
            kotlin.jvm.internal.d0.d(r3)
        L46:
            if (r2 >= r1) goto L4e
            r0.lock()
            int r2 = r2 + 1
            goto L46
        L4e:
            r4.unlock()
            kotlin.jvm.internal.d0.c(r3)
            throw r5
    }
}
