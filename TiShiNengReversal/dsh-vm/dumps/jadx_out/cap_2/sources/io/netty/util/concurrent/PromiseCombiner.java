package io.netty.util.concurrent;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class PromiseCombiner {
    private io.netty.util.concurrent.Promise<java.lang.Void> aggregatePromise;
    private java.lang.Throwable cause;
    private int doneCount;
    private final io.netty.util.concurrent.EventExecutor executor;
    private int expectedCount;
    private final io.netty.util.concurrent.GenericFutureListener<io.netty.util.concurrent.Future<?>> listener;


    @java.lang.Deprecated
    public PromiseCombiner() {
            r1 = this;
            io.netty.util.concurrent.ImmediateEventExecutor r0 = io.netty.util.concurrent.ImmediateEventExecutor.INSTANCE
            r1.<init>(r0)
            return
    }

    public PromiseCombiner(io.netty.util.concurrent.EventExecutor r2) {
            r1 = this;
            r1.<init>()
            io.netty.util.concurrent.PromiseCombiner$1 r0 = new io.netty.util.concurrent.PromiseCombiner$1
            r0.<init>(r1)
            r1.listener = r0
            java.lang.String r0 = "executor"
            java.lang.Object r2 = io.netty.util.internal.ObjectUtil.checkNotNull(r2, r0)
            io.netty.util.concurrent.EventExecutor r2 = (io.netty.util.concurrent.EventExecutor) r2
            r1.executor = r2
            return
    }

    static /* synthetic */ io.netty.util.concurrent.EventExecutor access$000(io.netty.util.concurrent.PromiseCombiner r0) {
            io.netty.util.concurrent.EventExecutor r0 = r0.executor
            return r0
    }

    static /* synthetic */ int access$200(io.netty.util.concurrent.PromiseCombiner r0) {
            int r0 = r0.doneCount
            return r0
    }

    static /* synthetic */ int access$204(io.netty.util.concurrent.PromiseCombiner r1) {
            int r0 = r1.doneCount
            int r0 = r0 + 1
            r1.doneCount = r0
            return r0
    }

    static /* synthetic */ java.lang.Throwable access$300(io.netty.util.concurrent.PromiseCombiner r0) {
            java.lang.Throwable r0 = r0.cause
            return r0
    }

    static /* synthetic */ java.lang.Throwable access$302(io.netty.util.concurrent.PromiseCombiner r0, java.lang.Throwable r1) {
            r0.cause = r1
            return r1
    }

    static /* synthetic */ int access$400(io.netty.util.concurrent.PromiseCombiner r0) {
            int r0 = r0.expectedCount
            return r0
    }

    static /* synthetic */ io.netty.util.concurrent.Promise access$500(io.netty.util.concurrent.PromiseCombiner r0) {
            io.netty.util.concurrent.Promise<java.lang.Void> r0 = r0.aggregatePromise
            return r0
    }

    static /* synthetic */ boolean access$600(io.netty.util.concurrent.PromiseCombiner r0) {
            boolean r0 = r0.tryPromise()
            return r0
    }

    private void checkAddAllowed() {
            r2 = this;
            io.netty.util.concurrent.Promise<java.lang.Void> r0 = r2.aggregatePromise
            if (r0 != 0) goto L5
            return
        L5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Adding promises is not allowed after finished adding"
            r0.<init>(r1)
            throw r0
    }

    private void checkInEventLoop() {
            r2 = this;
            io.netty.util.concurrent.EventExecutor r0 = r2.executor
            boolean r0 = r0.inEventLoop()
            if (r0 == 0) goto L9
            return
        L9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Must be called from EventExecutor thread"
            r0.<init>(r1)
            throw r0
    }

    private boolean tryPromise() {
            r2 = this;
            java.lang.Throwable r0 = r2.cause
            if (r0 != 0) goto Lc
            io.netty.util.concurrent.Promise<java.lang.Void> r0 = r2.aggregatePromise
            r1 = 0
            boolean r0 = r0.trySuccess(r1)
            return r0
        Lc:
            io.netty.util.concurrent.Promise<java.lang.Void> r1 = r2.aggregatePromise
            boolean r0 = r1.tryFailure(r0)
            return r0
    }

    public void add(io.netty.util.concurrent.Future r2) {
            r1 = this;
            r1.checkAddAllowed()
            r1.checkInEventLoop()
            int r0 = r1.expectedCount
            int r0 = r0 + 1
            r1.expectedCount = r0
            io.netty.util.concurrent.GenericFutureListener<io.netty.util.concurrent.Future<?>> r0 = r1.listener
            r2.addListener(r0)
            return
    }

    @java.lang.Deprecated
    public void add(io.netty.util.concurrent.Promise r1) {
            r0 = this;
            r0.add(r1)
            return
    }

    public void addAll(io.netty.util.concurrent.Future... r4) {
            r3 = this;
            int r0 = r4.length
            r1 = 0
        L2:
            if (r1 >= r0) goto Lc
            r2 = r4[r1]
            r3.add(r2)
            int r1 = r1 + 1
            goto L2
        Lc:
            return
    }

    @java.lang.Deprecated
    public void addAll(io.netty.util.concurrent.Promise... r1) {
            r0 = this;
            io.netty.util.concurrent.Future[] r1 = (io.netty.util.concurrent.Future[]) r1
            r0.addAll(r1)
            return
    }

    public void finish(io.netty.util.concurrent.Promise<java.lang.Void> r2) {
            r1 = this;
            java.lang.String r0 = "aggregatePromise"
            io.netty.util.internal.ObjectUtil.checkNotNull(r2, r0)
            r1.checkInEventLoop()
            io.netty.util.concurrent.Promise<java.lang.Void> r0 = r1.aggregatePromise
            if (r0 != 0) goto L18
            r1.aggregatePromise = r2
            int r2 = r1.doneCount
            int r0 = r1.expectedCount
            if (r2 != r0) goto L17
            r1.tryPromise()
        L17:
            return
        L18:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "Already finished"
            r2.<init>(r0)
            throw r2
    }
}
