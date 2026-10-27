package kotlinx.coroutines;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class u1 extends kotlinx.coroutines.t1 implements kotlinx.coroutines.z0 {

    @org.jetbrains.annotations.NotNull
    private final java.util.concurrent.Executor b;

    public u1(@org.jetbrains.annotations.NotNull java.util.concurrent.Executor r1) {
            r0 = this;
            r0.<init>()
            r0.b = r1
            java.util.concurrent.Executor r1 = r0.t()
            kotlinx.coroutines.internal.e.c(r1)
            return
    }

    private final void u(kotlin.coroutines.i r2, java.util.concurrent.RejectedExecutionException r3) {
            r1 = this;
            java.lang.String r0 = "The task was rejected"
            java.util.concurrent.CancellationException r3 = kotlinx.coroutines.s1.a(r0, r3)
            kotlinx.coroutines.h2.f(r2, r3)
            return
    }

    private final java.util.concurrent.ScheduledFuture<?> v(java.util.concurrent.ScheduledExecutorService r2, java.lang.Runnable r3, kotlin.coroutines.i r4, long r5) {
            r1 = this;
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.util.concurrent.RejectedExecutionException -> L7
            java.util.concurrent.ScheduledFuture r2 = r2.schedule(r3, r5, r0)     // Catch: java.util.concurrent.RejectedExecutionException -> L7
            return r2
        L7:
            r2 = move-exception
            r1.u(r4, r2)
            r2 = 0
            return r2
    }

    @Override // kotlinx.coroutines.t1, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r2 = this;
            java.util.concurrent.Executor r0 = r2.t()
            boolean r1 = r0 instanceof java.util.concurrent.ExecutorService
            if (r1 == 0) goto Lb
            java.util.concurrent.ExecutorService r0 = (java.util.concurrent.ExecutorService) r0
            goto Lc
        Lb:
            r0 = 0
        Lc:
            if (r0 == 0) goto L11
            r0.shutdown()
        L11:
            return
    }

    @Override // kotlinx.coroutines.m0
    public void dispatch(@org.jetbrains.annotations.NotNull kotlin.coroutines.i r3, @org.jetbrains.annotations.NotNull java.lang.Runnable r4) {
            r2 = this;
            java.util.concurrent.Executor r0 = r2.t()     // Catch: java.util.concurrent.RejectedExecutionException -> L11
            kotlinx.coroutines.b r1 = kotlinx.coroutines.c.b()     // Catch: java.util.concurrent.RejectedExecutionException -> L11
            if (r1 == 0) goto L13
            java.lang.Runnable r1 = r1.i(r4)     // Catch: java.util.concurrent.RejectedExecutionException -> L11
            if (r1 != 0) goto L14
            goto L13
        L11:
            r0 = move-exception
            goto L18
        L13:
            r1 = r4
        L14:
            r0.execute(r1)     // Catch: java.util.concurrent.RejectedExecutionException -> L11
            return
        L18:
            kotlinx.coroutines.b r1 = kotlinx.coroutines.c.b()
            if (r1 == 0) goto L21
            r1.f()
        L21:
            r2.u(r3, r0)
            kotlinx.coroutines.m0 r0 = kotlinx.coroutines.g1.c()
            r0.dispatch(r3, r4)
            return
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof kotlinx.coroutines.u1
            if (r0 == 0) goto L12
            kotlinx.coroutines.u1 r2 = (kotlinx.coroutines.u1) r2
            java.util.concurrent.Executor r2 = r2.t()
            java.util.concurrent.Executor r0 = r1.t()
            if (r2 != r0) goto L12
            r2 = 1
            return r2
        L12:
            r2 = 0
            return r2
    }

    public int hashCode() {
            r1 = this;
            java.util.concurrent.Executor r0 = r1.t()
            int r0 = java.lang.System.identityHashCode(r0)
            return r0
    }

    @Override // kotlinx.coroutines.z0
    public void i(long r10, @org.jetbrains.annotations.NotNull kotlinx.coroutines.p<? super kotlin.n1> r12) {
            r9 = this;
            java.util.concurrent.Executor r0 = r9.t()
            boolean r1 = r0 instanceof java.util.concurrent.ScheduledExecutorService
            r2 = 0
            if (r1 == 0) goto Ld
            java.util.concurrent.ScheduledExecutorService r0 = (java.util.concurrent.ScheduledExecutorService) r0
            r4 = r0
            goto Le
        Ld:
            r4 = r2
        Le:
            if (r4 == 0) goto L20
            kotlinx.coroutines.x2 r5 = new kotlinx.coroutines.x2
            r5.<init>(r9, r12)
            kotlin.coroutines.i r6 = r12.getContext()
            r3 = r9
            r7 = r10
            java.util.concurrent.ScheduledFuture r2 = r3.v(r4, r5, r6, r7)
            goto L21
        L20:
            r7 = r10
        L21:
            if (r2 == 0) goto L27
            kotlinx.coroutines.h2.w(r12, r2)
            return
        L27:
            kotlinx.coroutines.v0 r10 = kotlinx.coroutines.v0.g
            r10.i(r7, r12)
            return
    }

    @Override // kotlinx.coroutines.z0
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.j1 m(long r10, @org.jetbrains.annotations.NotNull java.lang.Runnable r12, @org.jetbrains.annotations.NotNull kotlin.coroutines.i r13) {
            r9 = this;
            java.util.concurrent.Executor r0 = r9.t()
            boolean r1 = r0 instanceof java.util.concurrent.ScheduledExecutorService
            r2 = 0
            if (r1 == 0) goto Ld
            java.util.concurrent.ScheduledExecutorService r0 = (java.util.concurrent.ScheduledExecutorService) r0
            r4 = r0
            goto Le
        Ld:
            r4 = r2
        Le:
            if (r4 == 0) goto L19
            r3 = r9
            r7 = r10
            r5 = r12
            r6 = r13
            java.util.concurrent.ScheduledFuture r2 = r3.v(r4, r5, r6, r7)
            goto L1c
        L19:
            r7 = r10
            r5 = r12
            r6 = r13
        L1c:
            if (r2 == 0) goto L24
            kotlinx.coroutines.i1 r10 = new kotlinx.coroutines.i1
            r10.<init>(r2)
            return r10
        L24:
            kotlinx.coroutines.v0 r10 = kotlinx.coroutines.v0.g
            kotlinx.coroutines.j1 r10 = r10.m(r7, r5, r6)
            return r10
    }

    @Override // kotlinx.coroutines.z0
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
    @org.jetbrains.annotations.Nullable
    public java.lang.Object r(long r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r3) {
            r0 = this;
            java.lang.Object r1 = kotlinx.coroutines.z0.a.a(r0, r1, r3)
            return r1
    }

    @Override // kotlinx.coroutines.t1
    @org.jetbrains.annotations.NotNull
    public java.util.concurrent.Executor t() {
            r1 = this;
            java.util.concurrent.Executor r0 = r1.b
            return r0
    }

    @Override // kotlinx.coroutines.m0
    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r1 = this;
            java.util.concurrent.Executor r0 = r1.t()
            java.lang.String r0 = r0.toString()
            return r0
    }
}
