package kotlinx.coroutines;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nThreadPoolDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThreadPoolDispatcher.kt\nkotlinx/coroutines/ThreadPoolDispatcherKt__ThreadPoolDispatcherKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,47:1\n1#2:48\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final /* synthetic */ class k3 {
    public static /* synthetic */ java.lang.Thread a(int r0, java.lang.String r1, java.util.concurrent.atomic.AtomicInteger r2, java.lang.Runnable r3) {
            java.lang.Thread r0 = c(r0, r1, r2, r3)
            return r0
    }

    @kotlinx.coroutines.DelicateCoroutinesApi
    @org.jetbrains.annotations.NotNull
    public static final kotlinx.coroutines.t1 b(int r2, @org.jetbrains.annotations.NotNull java.lang.String r3) {
            r0 = 1
            if (r2 < r0) goto L16
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r0.<init>()
            kotlinx.coroutines.j3 r1 = new kotlinx.coroutines.j3
            r1.<init>(r2, r3, r0)
            java.util.concurrent.ScheduledExecutorService r2 = java.util.concurrent.Executors.newScheduledThreadPool(r2, r1)
            kotlinx.coroutines.t1 r2 = kotlinx.coroutines.v1.d(r2)
            return r2
        L16:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "Expected at least one thread, but "
            r3.append(r0)
            r3.append(r2)
            java.lang.String r2 = " specified"
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r2 = r2.toString()
            r3.<init>(r2)
            throw r3
    }

    private static final java.lang.Thread c(int r2, java.lang.String r3, java.util.concurrent.atomic.AtomicInteger r4, java.lang.Runnable r5) {
            java.lang.Thread r0 = new java.lang.Thread
            r1 = 1
            if (r2 != r1) goto L6
            goto L1e
        L6:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r3)
            r3 = 45
            r2.append(r3)
            int r3 = r4.incrementAndGet()
            r2.append(r3)
            java.lang.String r3 = r2.toString()
        L1e:
            r0.<init>(r5, r3)
            r0.setDaemon(r1)
            return r0
    }
}
