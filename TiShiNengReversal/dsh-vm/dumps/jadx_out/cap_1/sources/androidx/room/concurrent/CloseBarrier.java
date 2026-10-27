package androidx.room.concurrent;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nCloseBarrier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CloseBarrier.kt\nandroidx/room/concurrent/CloseBarrier\n+ 2 Synchronized.jvmAndroid.kt\nandroidx/room/concurrent/Synchronized_jvmAndroidKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Atomics.kt\nandroidx/room/concurrent/AtomicsKt\n*L\n1#1,106:1\n22#2:107\n22#2:108\n22#2:110\n1#3:109\n40#4,2:111\n*S KotlinDebug\n*F\n+ 1 CloseBarrier.kt\nandroidx/room/concurrent/CloseBarrier\n*L\n53#1:107\n69#1:108\n83#1:110\n89#1:111,2\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class CloseBarrier {

    @org.jetbrains.annotations.NotNull
    private final java.util.concurrent.atomic.AtomicInteger blockers;

    @org.jetbrains.annotations.NotNull
    private final kotlin.jvm.functions.Function0<kotlin.n1> closeAction;

    @org.jetbrains.annotations.NotNull
    private final java.util.concurrent.atomic.AtomicBoolean closeInitiated;

    public CloseBarrier(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<kotlin.n1> r2) {
            r1 = this;
            java.lang.String r0 = "closeAction"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.closeAction = r2
            java.util.concurrent.atomic.AtomicInteger r2 = new java.util.concurrent.atomic.AtomicInteger
            r0 = 0
            r2.<init>(r0)
            r1.blockers = r2
            java.util.concurrent.atomic.AtomicBoolean r2 = new java.util.concurrent.atomic.AtomicBoolean
            r2.<init>(r0)
            r1.closeInitiated = r2
            return
    }

    private final boolean isClosed() {
            r1 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.closeInitiated
            boolean r0 = r0.get()
            return r0
    }

    public final boolean block$room_runtime_release() {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.isClosed()     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto La
            monitor-exit(r1)
            r0 = 0
            return r0
        La:
            java.util.concurrent.atomic.AtomicInteger r0 = r1.blockers     // Catch: java.lang.Throwable -> L12
            r0.incrementAndGet()     // Catch: java.lang.Throwable -> L12
            monitor-exit(r1)
            r0 = 1
            return r0
        L12:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    public final void close$room_runtime_release() {
            r3 = this;
            monitor-enter(r3)
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.closeInitiated     // Catch: java.lang.Throwable -> L1e
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)     // Catch: java.lang.Throwable -> L1e
            if (r0 != 0) goto Ld
            monitor-exit(r3)
            return
        Ld:
            kotlin.n1 r0 = kotlin.n1.a     // Catch: java.lang.Throwable -> L1e
            monitor-exit(r3)
            java.util.concurrent.atomic.AtomicInteger r0 = r3.blockers
        L12:
            int r1 = r0.get()
            if (r1 != 0) goto L12
            kotlin.jvm.functions.Function0<kotlin.n1> r0 = r3.closeAction
            r0.invoke()
            return
        L1e:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
    }

    public final void unblock$room_runtime_release() {
            r2 = this;
            monitor-enter(r2)
            java.util.concurrent.atomic.AtomicInteger r0 = r2.blockers     // Catch: java.lang.Throwable -> L12
            r0.decrementAndGet()     // Catch: java.lang.Throwable -> L12
            java.util.concurrent.atomic.AtomicInteger r0 = r2.blockers     // Catch: java.lang.Throwable -> L12
            int r0 = r0.get()     // Catch: java.lang.Throwable -> L12
            if (r0 < 0) goto L14
            kotlin.n1 r0 = kotlin.n1.a     // Catch: java.lang.Throwable -> L12
            monitor-exit(r2)
            return
        L12:
            r0 = move-exception
            goto L1c
        L14:
            java.lang.String r0 = "Unbalanced call to unblock() detected."
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L12
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L12
            throw r1     // Catch: java.lang.Throwable -> L12
        L1c:
            monitor-exit(r2)
            throw r0
    }
}
