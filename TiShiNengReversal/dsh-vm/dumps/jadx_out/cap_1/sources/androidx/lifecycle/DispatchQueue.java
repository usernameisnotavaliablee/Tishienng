package androidx.lifecycle;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class DispatchQueue {
    private boolean finished;
    private boolean isDraining;
    private boolean paused;

    @org.jetbrains.annotations.NotNull
    private final java.util.Queue<java.lang.Runnable> queue;

    public DispatchQueue() {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.paused = r0
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            r1.queue = r0
            return
    }

    public static /* synthetic */ void a(androidx.lifecycle.DispatchQueue r0, java.lang.Runnable r1) {
            dispatchAndEnqueue$lambda$2$lambda$1(r0, r1)
            return
    }

    private static final void dispatchAndEnqueue$lambda$2$lambda$1(androidx.lifecycle.DispatchQueue r1, java.lang.Runnable r2) {
            java.lang.String r0 = "this$0"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "$runnable"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.enqueue(r2)
            return
    }

    @androidx.annotation.MainThread
    private final void enqueue(java.lang.Runnable r2) {
            r1 = this;
            java.util.Queue<java.lang.Runnable> r0 = r1.queue
            boolean r2 = r0.offer(r2)
            if (r2 == 0) goto Lc
            r1.drainQueue()
            return
        Lc:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "cannot enqueue any more runnables"
            r2.<init>(r0)
            throw r2
    }

    @androidx.annotation.MainThread
    public final boolean canRun() {
            r1 = this;
            boolean r0 = r1.finished
            if (r0 != 0) goto Lb
            boolean r0 = r1.paused
            if (r0 != 0) goto L9
            goto Lb
        L9:
            r0 = 0
            return r0
        Lb:
            r0 = 1
            return r0
    }

    @androidx.annotation.AnyThread
    public final void dispatchAndEnqueue(@org.jetbrains.annotations.NotNull kotlin.coroutines.i r3, @org.jetbrains.annotations.NotNull java.lang.Runnable r4) {
            r2 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "runnable"
            kotlin.jvm.internal.g0.p(r4, r0)
            kotlinx.coroutines.p2 r0 = kotlinx.coroutines.g1.e()
            kotlinx.coroutines.p2 r0 = r0.t()
            boolean r1 = r0.isDispatchNeeded(r3)
            if (r1 != 0) goto L23
            boolean r1 = r2.canRun()
            if (r1 == 0) goto L1f
            goto L23
        L1f:
            r2.enqueue(r4)
            return
        L23:
            androidx.lifecycle.d r1 = new androidx.lifecycle.d
            r1.<init>(r2, r4)
            r0.dispatch(r3, r1)
            return
    }

    @androidx.annotation.MainThread
    public final void drainQueue() {
            r2 = this;
            boolean r0 = r2.isDraining
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r1 = 0
            r2.isDraining = r0     // Catch: java.lang.Throwable -> L26
        L9:
            java.util.Queue<java.lang.Runnable> r0 = r2.queue     // Catch: java.lang.Throwable -> L26
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L26
            if (r0 != 0) goto L28
            boolean r0 = r2.canRun()     // Catch: java.lang.Throwable -> L26
            if (r0 != 0) goto L18
            goto L28
        L18:
            java.util.Queue<java.lang.Runnable> r0 = r2.queue     // Catch: java.lang.Throwable -> L26
            java.lang.Object r0 = r0.poll()     // Catch: java.lang.Throwable -> L26
            java.lang.Runnable r0 = (java.lang.Runnable) r0     // Catch: java.lang.Throwable -> L26
            if (r0 == 0) goto L9
            r0.run()     // Catch: java.lang.Throwable -> L26
            goto L9
        L26:
            r0 = move-exception
            goto L2b
        L28:
            r2.isDraining = r1
            return
        L2b:
            r2.isDraining = r1
            throw r0
    }

    @androidx.annotation.MainThread
    public final void finish() {
            r1 = this;
            r0 = 1
            r1.finished = r0
            r1.drainQueue()
            return
    }

    @androidx.annotation.MainThread
    public final void pause() {
            r1 = this;
            r0 = 1
            r1.paused = r0
            return
    }

    @androidx.annotation.MainThread
    public final void resume() {
            r2 = this;
            boolean r0 = r2.paused
            if (r0 != 0) goto L5
            return
        L5:
            boolean r0 = r2.finished
            if (r0 != 0) goto L10
            r0 = 0
            r2.paused = r0
            r2.drainQueue()
            return
        L10:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Cannot resume a finished dispatcher"
            r0.<init>(r1)
            throw r0
    }
}
