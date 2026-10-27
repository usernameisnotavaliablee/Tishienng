package kotlinx.coroutines.scheduling;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class h extends kotlinx.coroutines.t1 {
    private final int b;
    private final int c;
    private final long d;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String e;

    @org.jetbrains.annotations.NotNull
    private kotlinx.coroutines.scheduling.CoroutineScheduler f;

    public h() {
            r8 = this;
            r6 = 15
            r7 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            r5 = 0
            r0 = r8
            r0.<init>(r1, r2, r3, r5, r6, r7)
            return
    }

    public h(int r1, int r2, long r3, @org.jetbrains.annotations.NotNull java.lang.String r5) {
            r0 = this;
            r0.<init>()
            r0.b = r1
            r0.c = r2
            r0.d = r3
            r0.e = r5
            kotlinx.coroutines.scheduling.CoroutineScheduler r1 = r0.u()
            r0.f = r1
            return
    }

    public /* synthetic */ h(int r1, int r2, long r3, java.lang.String r5, int r6, kotlin.jvm.internal.v r7) {
            r0 = this;
            r7 = r6 & 1
            if (r7 == 0) goto L6
            int r1 = kotlinx.coroutines.scheduling.n.c
        L6:
            r7 = r6 & 2
            if (r7 == 0) goto Lc
            int r2 = kotlinx.coroutines.scheduling.n.d
        Lc:
            r7 = r6 & 4
            if (r7 == 0) goto L12
            long r3 = kotlinx.coroutines.scheduling.n.e
        L12:
            r6 = r6 & 8
            if (r6 == 0) goto L18
            java.lang.String r5 = "CoroutineScheduler"
        L18:
            r7 = r5
            r5 = r3
            r3 = r1
            r4 = r2
            r2 = r0
            r2.<init>(r3, r4, r5, r7)
            return
    }

    private final kotlinx.coroutines.scheduling.CoroutineScheduler u() {
            r6 = this;
            kotlinx.coroutines.scheduling.CoroutineScheduler r0 = new kotlinx.coroutines.scheduling.CoroutineScheduler
            int r1 = r6.b
            int r2 = r6.c
            long r3 = r6.d
            java.lang.String r5 = r6.e
            r0.<init>(r1, r2, r3, r5)
            return r0
    }

    @Override // kotlinx.coroutines.t1, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r1 = this;
            kotlinx.coroutines.scheduling.CoroutineScheduler r0 = r1.f
            r0.close()
            return
    }

    @Override // kotlinx.coroutines.m0
    public void dispatch(@org.jetbrains.annotations.NotNull kotlin.coroutines.i r7, @org.jetbrains.annotations.NotNull java.lang.Runnable r8) {
            r6 = this;
            kotlinx.coroutines.scheduling.CoroutineScheduler r0 = r6.f
            r4 = 6
            r5 = 0
            r2 = 0
            r3 = 0
            r1 = r8
            kotlinx.coroutines.scheduling.CoroutineScheduler.n(r0, r1, r2, r3, r4, r5)
            return
    }

    @Override // kotlinx.coroutines.m0
    public void dispatchYield(@org.jetbrains.annotations.NotNull kotlin.coroutines.i r7, @org.jetbrains.annotations.NotNull java.lang.Runnable r8) {
            r6 = this;
            kotlinx.coroutines.scheduling.CoroutineScheduler r0 = r6.f
            r4 = 2
            r5 = 0
            r2 = 0
            r3 = 1
            r1 = r8
            kotlinx.coroutines.scheduling.CoroutineScheduler.n(r0, r1, r2, r3, r4, r5)
            return
    }

    @Override // kotlinx.coroutines.t1
    @org.jetbrains.annotations.NotNull
    public java.util.concurrent.Executor t() {
            r1 = this;
            kotlinx.coroutines.scheduling.CoroutineScheduler r0 = r1.f
            return r0
    }

    public final void v(@org.jetbrains.annotations.NotNull java.lang.Runnable r2, @org.jetbrains.annotations.NotNull kotlinx.coroutines.scheduling.k r3, boolean r4) {
            r1 = this;
            kotlinx.coroutines.scheduling.CoroutineScheduler r0 = r1.f
            r0.m(r2, r3, r4)
            return
    }

    public final void w() {
            r0 = this;
            r0.z()
            return
    }

    public final synchronized void x(long r2) {
            r1 = this;
            monitor-enter(r1)
            kotlinx.coroutines.scheduling.CoroutineScheduler r0 = r1.f     // Catch: java.lang.Throwable -> L8
            r0.A(r2)     // Catch: java.lang.Throwable -> L8
            monitor-exit(r1)
            return
        L8:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8
            throw r2
    }

    public final synchronized void z() {
            r3 = this;
            monitor-enter(r3)
            kotlinx.coroutines.scheduling.CoroutineScheduler r0 = r3.f     // Catch: java.lang.Throwable -> L10
            r1 = 1000(0x3e8, double:4.94E-321)
            r0.A(r1)     // Catch: java.lang.Throwable -> L10
            kotlinx.coroutines.scheduling.CoroutineScheduler r0 = r3.u()     // Catch: java.lang.Throwable -> L10
            r3.f = r0     // Catch: java.lang.Throwable -> L10
            monitor-exit(r3)
            return
        L10:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L10
            throw r0
    }
}
