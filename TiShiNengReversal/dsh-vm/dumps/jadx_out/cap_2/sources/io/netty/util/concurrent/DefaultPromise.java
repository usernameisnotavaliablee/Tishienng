package io.netty.util.concurrent;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class DefaultPromise<V> extends io.netty.util.concurrent.AbstractFuture<V> implements io.netty.util.concurrent.Promise<V> {
    private static final int MAX_LISTENER_STACK_DEPTH = 0;
    private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater<io.netty.util.concurrent.DefaultPromise, java.lang.Object> RESULT_UPDATER = null;
    private static final java.lang.Object SUCCESS = null;
    private static final java.lang.Object UNCANCELLABLE = null;
    private static final io.netty.util.internal.logging.InternalLogger logger = null;
    private static final io.netty.util.internal.logging.InternalLogger rejectedExecutionLogger = null;
    private final io.netty.util.concurrent.EventExecutor executor;
    private java.lang.Object listeners;
    private boolean notifyingListeners;
    private volatile java.lang.Object result;
    private short waiters;





    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class CauseHolder {
        final java.lang.Throwable cause;

        CauseHolder(java.lang.Throwable r1) {
                r0 = this;
                r0.<init>()
                r0.cause = r1
                return
        }
    }

    static {
            java.lang.Class<io.netty.util.concurrent.DefaultPromise> r0 = io.netty.util.concurrent.DefaultPromise.class
            io.netty.util.internal.logging.InternalLogger r1 = io.netty.util.internal.logging.InternalLoggerFactory.getInstance(r0)
            io.netty.util.concurrent.DefaultPromise.logger = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r0.getName()
            r1.append(r2)
            java.lang.String r2 = ".rejectedExecution"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            io.netty.util.internal.logging.InternalLogger r1 = io.netty.util.internal.logging.InternalLoggerFactory.getInstance(r1)
            io.netty.util.concurrent.DefaultPromise.rejectedExecutionLogger = r1
            java.lang.String r1 = "io.netty.defaultPromise.maxListenerStackDepth"
            r2 = 8
            int r1 = io.netty.util.internal.SystemPropertyUtil.getInt(r1, r2)
            int r1 = java.lang.Math.min(r2, r1)
            io.netty.util.concurrent.DefaultPromise.MAX_LISTENER_STACK_DEPTH = r1
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            java.lang.String r2 = "result"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r1, r2)
            io.netty.util.concurrent.DefaultPromise.RESULT_UPDATER = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            io.netty.util.concurrent.DefaultPromise.SUCCESS = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            io.netty.util.concurrent.DefaultPromise.UNCANCELLABLE = r0
            return
    }

    protected DefaultPromise() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.executor = r0
            return
    }

    public DefaultPromise(io.netty.util.concurrent.EventExecutor r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "executor"
            java.lang.Object r2 = io.netty.util.internal.ObjectUtil.checkNotNull(r2, r0)
            io.netty.util.concurrent.EventExecutor r2 = (io.netty.util.concurrent.EventExecutor) r2
            r1.executor = r2
            return
    }

    static /* synthetic */ void access$000(io.netty.util.concurrent.DefaultPromise r0) {
            r0.notifyListenersNow()
            return
    }

    static /* synthetic */ void access$100(io.netty.util.concurrent.Future r0, io.netty.util.concurrent.GenericFutureListener r1) {
            notifyListener0(r0, r1)
            return
    }

    static /* synthetic */ void access$200(io.netty.util.concurrent.ProgressiveFuture r0, io.netty.util.concurrent.GenericProgressiveFutureListener[] r1, long r2, long r4) {
            notifyProgressiveListeners0(r0, r1, r2, r4)
            return
    }

    static /* synthetic */ void access$300(io.netty.util.concurrent.ProgressiveFuture r0, io.netty.util.concurrent.GenericProgressiveFutureListener r1, long r2, long r4) {
            notifyProgressiveListener0(r0, r1, r2, r4)
            return
    }

    private void addListener0(io.netty.util.concurrent.GenericFutureListener<? extends io.netty.util.concurrent.Future<? super V>> r3) {
            r2 = this;
            java.lang.Object r0 = r2.listeners
            if (r0 != 0) goto L7
            r2.listeners = r3
            return
        L7:
            boolean r1 = r0 instanceof io.netty.util.concurrent.DefaultFutureListeners
            if (r1 == 0) goto L11
            io.netty.util.concurrent.DefaultFutureListeners r0 = (io.netty.util.concurrent.DefaultFutureListeners) r0
            r0.add(r3)
            return
        L11:
            io.netty.util.concurrent.DefaultFutureListeners r1 = new io.netty.util.concurrent.DefaultFutureListeners
            io.netty.util.concurrent.GenericFutureListener r0 = (io.netty.util.concurrent.GenericFutureListener) r0
            r1.<init>(r0, r3)
            r2.listeners = r1
            return
    }

    private boolean await0(long r13, boolean r15) throws java.lang.InterruptedException {
            r12 = this;
            boolean r0 = r12.isDone()
            r1 = 1
            if (r0 == 0) goto L8
            return r1
        L8:
            r2 = 0
            int r0 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r0 > 0) goto L13
            boolean r13 = r12.isDone()
            return r13
        L13:
            if (r15 == 0) goto L26
            boolean r0 = java.lang.Thread.interrupted()
            if (r0 != 0) goto L1c
            goto L26
        L1c:
            java.lang.InterruptedException r13 = new java.lang.InterruptedException
            java.lang.String r14 = r12.toString()
            r13.<init>(r14)
            throw r13
        L26:
            r12.checkDeadLock()
            long r4 = java.lang.System.nanoTime()
            r0 = 0
            r6 = r13
        L2f:
            monitor-enter(r12)     // Catch: java.lang.Throwable -> L88
            boolean r8 = r12.isDone()     // Catch: java.lang.Throwable -> L41
            if (r8 == 0) goto L44
            monitor-exit(r12)     // Catch: java.lang.Throwable -> L41
            if (r0 == 0) goto L40
            java.lang.Thread r13 = java.lang.Thread.currentThread()
            r13.interrupt()
        L40:
            return r1
        L41:
            r13 = move-exception
            r1 = r0
            goto L91
        L44:
            r12.incWaiters()     // Catch: java.lang.Throwable -> L41
            r8 = 1000000(0xf4240, double:4.940656E-318)
            long r10 = r6 / r8
            long r6 = r6 % r8
            int r7 = (int) r6     // Catch: java.lang.Throwable -> L55 java.lang.InterruptedException -> L57
            r12.wait(r10, r7)     // Catch: java.lang.Throwable -> L55 java.lang.InterruptedException -> L57
            r12.decWaiters()     // Catch: java.lang.Throwable -> L41
            goto L5e
        L55:
            r13 = move-exception
            goto L8d
        L57:
            r6 = move-exception
            if (r15 != 0) goto L8c
            r12.decWaiters()     // Catch: java.lang.Throwable -> L8a
            r0 = 1
        L5e:
            monitor-exit(r12)     // Catch: java.lang.Throwable -> L41
            boolean r6 = r12.isDone()     // Catch: java.lang.Throwable -> L88
            if (r6 == 0) goto L6f
            if (r0 == 0) goto L6e
            java.lang.Thread r13 = java.lang.Thread.currentThread()
            r13.interrupt()
        L6e:
            return r1
        L6f:
            long r6 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L88
            long r6 = r6 - r4
            long r6 = r13 - r6
            int r8 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r8 > 0) goto L2f
            boolean r13 = r12.isDone()     // Catch: java.lang.Throwable -> L88
            if (r0 == 0) goto L87
            java.lang.Thread r14 = java.lang.Thread.currentThread()
            r14.interrupt()
        L87:
            return r13
        L88:
            r13 = move-exception
            goto L95
        L8a:
            r13 = move-exception
            goto L91
        L8c:
            throw r6     // Catch: java.lang.Throwable -> L55
        L8d:
            r12.decWaiters()     // Catch: java.lang.Throwable -> L41
            throw r13     // Catch: java.lang.Throwable -> L41
        L91:
            monitor-exit(r12)     // Catch: java.lang.Throwable -> L8a
            throw r13     // Catch: java.lang.Throwable -> L93
        L93:
            r13 = move-exception
            r0 = r1
        L95:
            if (r0 == 0) goto L9e
            java.lang.Thread r14 = java.lang.Thread.currentThread()
            r14.interrupt()
        L9e:
            throw r13
    }

    private synchronized boolean checkNotifyWaiters() {
            r1 = this;
            monitor-enter(r1)
            short r0 = r1.waiters     // Catch: java.lang.Throwable -> L9
            if (r0 <= 0) goto Lb
            r1.notifyAll()     // Catch: java.lang.Throwable -> L9
            goto Lb
        L9:
            r0 = move-exception
            goto L14
        Lb:
            java.lang.Object r0 = r1.listeners     // Catch: java.lang.Throwable -> L9
            if (r0 == 0) goto L11
            r0 = 1
            goto L12
        L11:
            r0 = 0
        L12:
            monitor-exit(r1)
            return r0
        L14:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9
            throw r0
    }

    private void decWaiters() {
            r1 = this;
            short r0 = r1.waiters
            int r0 = r0 + (-1)
            short r0 = (short) r0
            r1.waiters = r0
            return
    }

    private void incWaiters() {
            r3 = this;
            short r0 = r3.waiters
            r1 = 32767(0x7fff, float:4.5916E-41)
            if (r0 == r1) goto Lc
            int r0 = r0 + 1
            short r0 = (short) r0
            r3.waiters = r0
            return
        Lc:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "too many waiters: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    private static boolean isCancelled0(java.lang.Object r1) {
            boolean r0 = r1 instanceof io.netty.util.concurrent.DefaultPromise.CauseHolder
            if (r0 == 0) goto Le
            io.netty.util.concurrent.DefaultPromise$CauseHolder r1 = (io.netty.util.concurrent.DefaultPromise.CauseHolder) r1
            java.lang.Throwable r1 = r1.cause
            boolean r1 = r1 instanceof java.util.concurrent.CancellationException
            if (r1 == 0) goto Le
            r1 = 1
            return r1
        Le:
            r1 = 0
            return r1
    }

    private static boolean isDone0(java.lang.Object r1) {
            if (r1 == 0) goto L8
            java.lang.Object r0 = io.netty.util.concurrent.DefaultPromise.UNCANCELLABLE
            if (r1 == r0) goto L8
            r1 = 1
            return r1
        L8:
            r1 = 0
            return r1
    }

    protected static void notifyListener(io.netty.util.concurrent.EventExecutor r1, io.netty.util.concurrent.Future<?> r2, io.netty.util.concurrent.GenericFutureListener<?> r3) {
            java.lang.String r0 = "eventExecutor"
            io.netty.util.internal.ObjectUtil.checkNotNull(r1, r0)
            java.lang.String r0 = "future"
            io.netty.util.internal.ObjectUtil.checkNotNull(r2, r0)
            java.lang.String r0 = "listener"
            io.netty.util.internal.ObjectUtil.checkNotNull(r3, r0)
            notifyListenerWithStackOverFlowProtection(r1, r2, r3)
            return
    }

    private static void notifyListener0(io.netty.util.concurrent.Future r3, io.netty.util.concurrent.GenericFutureListener r4) {
            r4.operationComplete(r3)     // Catch: java.lang.Throwable -> L4
            return
        L4:
            r3 = move-exception
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.util.concurrent.DefaultPromise.logger
            boolean r0 = r0.isWarnEnabled()
            if (r0 == 0) goto L30
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.util.concurrent.DefaultPromise.logger
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "An exception was thrown by "
            r1.append(r2)
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getName()
            r1.append(r4)
            java.lang.String r4 = ".operationComplete()"
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.warn(r4, r3)
        L30:
            return
    }

    private static void notifyListenerWithStackOverFlowProtection(io.netty.util.concurrent.EventExecutor r3, io.netty.util.concurrent.Future<?> r4, io.netty.util.concurrent.GenericFutureListener<?> r5) {
            boolean r0 = r3.inEventLoop()
            if (r0 == 0) goto L23
            io.netty.util.internal.InternalThreadLocalMap r0 = io.netty.util.internal.InternalThreadLocalMap.get()
            int r1 = r0.futureListenerStackDepth()
            int r2 = io.netty.util.concurrent.DefaultPromise.MAX_LISTENER_STACK_DEPTH
            if (r1 >= r2) goto L23
            int r3 = r1 + 1
            r0.setFutureListenerStackDepth(r3)
            notifyListener0(r4, r5)     // Catch: java.lang.Throwable -> L1e
            r0.setFutureListenerStackDepth(r1)
            return
        L1e:
            r3 = move-exception
            r0.setFutureListenerStackDepth(r1)
            throw r3
        L23:
            io.netty.util.concurrent.DefaultPromise$2 r0 = new io.netty.util.concurrent.DefaultPromise$2
            r0.<init>(r4, r5)
            safeExecute(r3, r0)
            return
    }

    private void notifyListeners() {
            r4 = this;
            io.netty.util.concurrent.EventExecutor r0 = r4.executor()
            boolean r1 = r0.inEventLoop()
            if (r1 == 0) goto L27
            io.netty.util.internal.InternalThreadLocalMap r1 = io.netty.util.internal.InternalThreadLocalMap.get()
            int r2 = r1.futureListenerStackDepth()
            int r3 = io.netty.util.concurrent.DefaultPromise.MAX_LISTENER_STACK_DEPTH
            if (r2 >= r3) goto L27
            int r0 = r2 + 1
            r1.setFutureListenerStackDepth(r0)
            r4.notifyListenersNow()     // Catch: java.lang.Throwable -> L22
            r1.setFutureListenerStackDepth(r2)
            return
        L22:
            r0 = move-exception
            r1.setFutureListenerStackDepth(r2)
            throw r0
        L27:
            io.netty.util.concurrent.DefaultPromise$1 r1 = new io.netty.util.concurrent.DefaultPromise$1
            r1.<init>(r4)
            safeExecute(r0, r1)
            return
    }

    private void notifyListeners0(io.netty.util.concurrent.DefaultFutureListeners r4) {
            r3 = this;
            io.netty.util.concurrent.GenericFutureListener[] r0 = r4.listeners()
            int r4 = r4.size()
            r1 = 0
        L9:
            if (r1 >= r4) goto L13
            r2 = r0[r1]
            notifyListener0(r3, r2)
            int r1 = r1 + 1
            goto L9
        L13:
            return
    }

    private void notifyListenersNow() {
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.notifyingListeners     // Catch: java.lang.Throwable -> L32
            if (r0 != 0) goto L34
            java.lang.Object r0 = r3.listeners     // Catch: java.lang.Throwable -> L32
            if (r0 != 0) goto La
            goto L34
        La:
            r1 = 1
            r3.notifyingListeners = r1     // Catch: java.lang.Throwable -> L32
            r1 = 0
            r3.listeners = r1     // Catch: java.lang.Throwable -> L32
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L32
        L11:
            boolean r2 = r0 instanceof io.netty.util.concurrent.DefaultFutureListeners
            if (r2 == 0) goto L1b
            io.netty.util.concurrent.DefaultFutureListeners r0 = (io.netty.util.concurrent.DefaultFutureListeners) r0
            r3.notifyListeners0(r0)
            goto L20
        L1b:
            io.netty.util.concurrent.GenericFutureListener r0 = (io.netty.util.concurrent.GenericFutureListener) r0
            notifyListener0(r3, r0)
        L20:
            monitor-enter(r3)
            java.lang.Object r0 = r3.listeners     // Catch: java.lang.Throwable -> L2a
            if (r0 != 0) goto L2c
            r0 = 0
            r3.notifyingListeners = r0     // Catch: java.lang.Throwable -> L2a
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L2a
            return
        L2a:
            r0 = move-exception
            goto L30
        L2c:
            r3.listeners = r1     // Catch: java.lang.Throwable -> L2a
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L2a
            goto L11
        L30:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L2a
            throw r0
        L32:
            r0 = move-exception
            goto L36
        L34:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L32
            return
        L36:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L32
            throw r0
    }

    private static void notifyProgressiveListener0(io.netty.util.concurrent.ProgressiveFuture r2, io.netty.util.concurrent.GenericProgressiveFutureListener r3, long r4, long r6) {
            r1 = r3
            r3 = r2
            r2 = r1
            r2.operationProgressed(r3, r4, r6)     // Catch: java.lang.Throwable -> L7
            return
        L7:
            r0 = move-exception
            r3 = r0
            io.netty.util.internal.logging.InternalLogger r4 = io.netty.util.concurrent.DefaultPromise.logger
            boolean r4 = r4.isWarnEnabled()
            if (r4 == 0) goto L34
            io.netty.util.internal.logging.InternalLogger r4 = io.netty.util.concurrent.DefaultPromise.logger
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "An exception was thrown by "
            r5.append(r6)
            java.lang.Class r2 = r2.getClass()
            java.lang.String r2 = r2.getName()
            r5.append(r2)
            java.lang.String r2 = ".operationProgressed()"
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            r4.warn(r2, r3)
        L34:
            return
    }

    private static void notifyProgressiveListeners0(io.netty.util.concurrent.ProgressiveFuture<?> r8, io.netty.util.concurrent.GenericProgressiveFutureListener<?>[] r9, long r10, long r12) {
            int r0 = r9.length
            r1 = 0
        L2:
            if (r1 >= r0) goto L12
            r3 = r9[r1]
            if (r3 != 0) goto L9
            goto L12
        L9:
            r2 = r8
            r4 = r10
            r6 = r12
            notifyProgressiveListener0(r2, r3, r4, r6)
            int r1 = r1 + 1
            goto L2
        L12:
            return
    }

    private synchronized java.lang.Object progressiveListeners() {
            r7 = this;
            monitor-enter(r7)
            java.lang.Object r0 = r7.listeners     // Catch: java.lang.Throwable -> L2f
            r1 = 0
            if (r0 != 0) goto L8
            monitor-exit(r7)
            return r1
        L8:
            boolean r2 = r0 instanceof io.netty.util.concurrent.DefaultFutureListeners     // Catch: java.lang.Throwable -> L2f
            if (r2 == 0) goto L4c
            io.netty.util.concurrent.DefaultFutureListeners r0 = (io.netty.util.concurrent.DefaultFutureListeners) r0     // Catch: java.lang.Throwable -> L2f
            int r2 = r0.progressiveSize()     // Catch: java.lang.Throwable -> L2f
            if (r2 == 0) goto L4a
            r3 = 0
            r4 = 1
            if (r2 == r4) goto L36
            io.netty.util.concurrent.GenericFutureListener[] r0 = r0.listeners()     // Catch: java.lang.Throwable -> L2f
            io.netty.util.concurrent.GenericProgressiveFutureListener[] r1 = new io.netty.util.concurrent.GenericProgressiveFutureListener[r2]     // Catch: java.lang.Throwable -> L2f
            r4 = 0
        L1f:
            if (r3 >= r2) goto L34
            r5 = r0[r4]     // Catch: java.lang.Throwable -> L2f
            boolean r6 = r5 instanceof io.netty.util.concurrent.GenericProgressiveFutureListener     // Catch: java.lang.Throwable -> L2f
            if (r6 == 0) goto L31
            int r6 = r3 + 1
            io.netty.util.concurrent.GenericProgressiveFutureListener r5 = (io.netty.util.concurrent.GenericProgressiveFutureListener) r5     // Catch: java.lang.Throwable -> L2f
            r1[r3] = r5     // Catch: java.lang.Throwable -> L2f
            r3 = r6
            goto L31
        L2f:
            r0 = move-exception
            goto L54
        L31:
            int r4 = r4 + 1
            goto L1f
        L34:
            monitor-exit(r7)
            return r1
        L36:
            io.netty.util.concurrent.GenericFutureListener[] r0 = r0.listeners()     // Catch: java.lang.Throwable -> L2f
            int r2 = r0.length     // Catch: java.lang.Throwable -> L2f
        L3b:
            if (r3 >= r2) goto L48
            r4 = r0[r3]     // Catch: java.lang.Throwable -> L2f
            boolean r5 = r4 instanceof io.netty.util.concurrent.GenericProgressiveFutureListener     // Catch: java.lang.Throwable -> L2f
            if (r5 == 0) goto L45
            monitor-exit(r7)
            return r4
        L45:
            int r3 = r3 + 1
            goto L3b
        L48:
            monitor-exit(r7)
            return r1
        L4a:
            monitor-exit(r7)
            return r1
        L4c:
            boolean r2 = r0 instanceof io.netty.util.concurrent.GenericProgressiveFutureListener     // Catch: java.lang.Throwable -> L2f
            if (r2 == 0) goto L52
            monitor-exit(r7)
            return r0
        L52:
            monitor-exit(r7)
            return r1
        L54:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L2f
            throw r0
    }

    private void removeListener0(io.netty.util.concurrent.GenericFutureListener<? extends io.netty.util.concurrent.Future<? super V>> r3) {
            r2 = this;
            java.lang.Object r0 = r2.listeners
            boolean r1 = r0 instanceof io.netty.util.concurrent.DefaultFutureListeners
            if (r1 == 0) goto Lc
            io.netty.util.concurrent.DefaultFutureListeners r0 = (io.netty.util.concurrent.DefaultFutureListeners) r0
            r0.remove(r3)
            return
        Lc:
            if (r0 != r3) goto L11
            r3 = 0
            r2.listeners = r3
        L11:
            return
    }

    private void rethrowIfFailed() {
            r1 = this;
            java.lang.Throwable r0 = r1.cause()
            if (r0 != 0) goto L7
            return
        L7:
            io.netty.util.internal.PlatformDependent.throwException(r0)
            return
    }

    private static void safeExecute(io.netty.util.concurrent.EventExecutor r1, java.lang.Runnable r2) {
            r1.execute(r2)     // Catch: java.lang.Throwable -> L4
            return
        L4:
            r1 = move-exception
            io.netty.util.internal.logging.InternalLogger r2 = io.netty.util.concurrent.DefaultPromise.rejectedExecutionLogger
            java.lang.String r0 = "Failed to submit a listener notification task. Event loop shut down?"
            r2.error(r0, r1)
            return
    }

    private boolean setFailure0(java.lang.Throwable r3) {
            r2 = this;
            io.netty.util.concurrent.DefaultPromise$CauseHolder r0 = new io.netty.util.concurrent.DefaultPromise$CauseHolder
            java.lang.String r1 = "cause"
            java.lang.Object r3 = io.netty.util.internal.ObjectUtil.checkNotNull(r3, r1)
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            r0.<init>(r3)
            boolean r3 = r2.setValue0(r0)
            return r3
    }

    private boolean setSuccess0(V r1) {
            r0 = this;
            if (r1 != 0) goto L4
            java.lang.Object r1 = io.netty.util.concurrent.DefaultPromise.SUCCESS
        L4:
            boolean r1 = r0.setValue0(r1)
            return r1
    }

    private boolean setValue0(java.lang.Object r3) {
            r2 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater<io.netty.util.concurrent.DefaultPromise, java.lang.Object> r0 = io.netty.util.concurrent.DefaultPromise.RESULT_UPDATER
            r1 = 0
            boolean r1 = androidx.concurrent.futures.a.a(r0, r2, r1, r3)
            if (r1 != 0) goto L14
            java.lang.Object r1 = io.netty.util.concurrent.DefaultPromise.UNCANCELLABLE
            boolean r3 = androidx.concurrent.futures.a.a(r0, r2, r1, r3)
            if (r3 == 0) goto L12
            goto L14
        L12:
            r3 = 0
            return r3
        L14:
            boolean r3 = r2.checkNotifyWaiters()
            if (r3 == 0) goto L1d
            r2.notifyListeners()
        L1d:
            r3 = 1
            return r3
    }

    @Override // io.netty.util.concurrent.Future
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.Future addListener(io.netty.util.concurrent.GenericFutureListener r1) {
            r0 = this;
            io.netty.util.concurrent.Promise r1 = r0.addListener(r1)
            return r1
    }

    @Override // io.netty.util.concurrent.Future
    public io.netty.util.concurrent.Promise<V> addListener(io.netty.util.concurrent.GenericFutureListener<? extends io.netty.util.concurrent.Future<? super V>> r2) {
            r1 = this;
            java.lang.String r0 = "listener"
            io.netty.util.internal.ObjectUtil.checkNotNull(r2, r0)
            monitor-enter(r1)
            r1.addListener0(r2)     // Catch: java.lang.Throwable -> L14
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L14
            boolean r2 = r1.isDone()
            if (r2 == 0) goto L13
            r1.notifyListeners()
        L13:
            return r1
        L14:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L14
            throw r2
    }

    @Override // io.netty.util.concurrent.Future
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.Future addListeners(io.netty.util.concurrent.GenericFutureListener[] r1) {
            r0 = this;
            io.netty.util.concurrent.Promise r1 = r0.addListeners(r1)
            return r1
    }

    @Override // io.netty.util.concurrent.Future
    public io.netty.util.concurrent.Promise<V> addListeners(io.netty.util.concurrent.GenericFutureListener<? extends io.netty.util.concurrent.Future<? super V>>... r4) {
            r3 = this;
            java.lang.String r0 = "listeners"
            io.netty.util.internal.ObjectUtil.checkNotNull(r4, r0)
            monitor-enter(r3)
            int r0 = r4.length     // Catch: java.lang.Throwable -> L15
            r1 = 0
        L8:
            if (r1 >= r0) goto L17
            r2 = r4[r1]     // Catch: java.lang.Throwable -> L15
            if (r2 != 0) goto Lf
            goto L17
        Lf:
            r3.addListener0(r2)     // Catch: java.lang.Throwable -> L15
            int r1 = r1 + 1
            goto L8
        L15:
            r4 = move-exception
            goto L22
        L17:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L15
            boolean r4 = r3.isDone()
            if (r4 == 0) goto L21
            r3.notifyListeners()
        L21:
            return r3
        L22:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L15
            throw r4
    }

    @Override // io.netty.util.concurrent.Future
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.Future await() throws java.lang.InterruptedException {
            r1 = this;
            io.netty.util.concurrent.Promise r0 = r1.await()
            return r0
    }

    @Override // io.netty.util.concurrent.Future
    public io.netty.util.concurrent.Promise<V> await() throws java.lang.InterruptedException {
            r2 = this;
            boolean r0 = r2.isDone()
            if (r0 == 0) goto L7
            return r2
        L7:
            boolean r0 = java.lang.Thread.interrupted()
            if (r0 != 0) goto L2c
            r2.checkDeadLock()
            monitor-enter(r2)
        L11:
            boolean r0 = r2.isDone()     // Catch: java.lang.Throwable -> L21
            if (r0 != 0) goto L28
            r2.incWaiters()     // Catch: java.lang.Throwable -> L21
            r2.wait()     // Catch: java.lang.Throwable -> L23
            r2.decWaiters()     // Catch: java.lang.Throwable -> L21
            goto L11
        L21:
            r0 = move-exception
            goto L2a
        L23:
            r0 = move-exception
            r2.decWaiters()     // Catch: java.lang.Throwable -> L21
            throw r0     // Catch: java.lang.Throwable -> L21
        L28:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L21
            return r2
        L2a:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L21
            throw r0
        L2c:
            java.lang.InterruptedException r0 = new java.lang.InterruptedException
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
    }

    @Override // io.netty.util.concurrent.Future
    public boolean await(long r2) throws java.lang.InterruptedException {
            r1 = this;
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r2 = r0.toNanos(r2)
            r0 = 1
            boolean r2 = r1.await0(r2, r0)
            return r2
    }

    @Override // io.netty.util.concurrent.Future
    public boolean await(long r1, java.util.concurrent.TimeUnit r3) throws java.lang.InterruptedException {
            r0 = this;
            long r1 = r3.toNanos(r1)
            r3 = 1
            boolean r1 = r0.await0(r1, r3)
            return r1
    }

    @Override // io.netty.util.concurrent.Future
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.Future awaitUninterruptibly() {
            r1 = this;
            io.netty.util.concurrent.Promise r0 = r1.awaitUninterruptibly()
            return r0
    }

    @Override // io.netty.util.concurrent.Future
    public io.netty.util.concurrent.Promise<V> awaitUninterruptibly() {
            r2 = this;
            boolean r0 = r2.isDone()
            if (r0 == 0) goto L7
            goto L32
        L7:
            r2.checkDeadLock()
            monitor-enter(r2)
            r0 = 0
        Lc:
            boolean r1 = r2.isDone()     // Catch: java.lang.Throwable -> L1c
            if (r1 != 0) goto L28
            r2.incWaiters()     // Catch: java.lang.Throwable -> L1c
            r2.wait()     // Catch: java.lang.Throwable -> L1e java.lang.InterruptedException -> L23
            r2.decWaiters()     // Catch: java.lang.Throwable -> L1c
            goto Lc
        L1c:
            r0 = move-exception
            goto L33
        L1e:
            r0 = move-exception
            r2.decWaiters()     // Catch: java.lang.Throwable -> L1c
            throw r0     // Catch: java.lang.Throwable -> L1c
        L23:
            r2.decWaiters()     // Catch: java.lang.Throwable -> L1c
            r0 = 1
            goto Lc
        L28:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
            if (r0 == 0) goto L32
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L32:
            return r2
        L33:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
            throw r0
    }

    @Override // io.netty.util.concurrent.Future
    public boolean awaitUninterruptibly(long r2) {
            r1 = this;
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.InterruptedException -> Lc
            long r2 = r0.toNanos(r2)     // Catch: java.lang.InterruptedException -> Lc
            r0 = 0
            boolean r2 = r1.await0(r2, r0)     // Catch: java.lang.InterruptedException -> Lc
            return r2
        Lc:
            java.lang.InternalError r2 = new java.lang.InternalError
            r2.<init>()
            throw r2
    }

    @Override // io.netty.util.concurrent.Future
    public boolean awaitUninterruptibly(long r1, java.util.concurrent.TimeUnit r3) {
            r0 = this;
            long r1 = r3.toNanos(r1)     // Catch: java.lang.InterruptedException -> La
            r3 = 0
            boolean r1 = r0.await0(r1, r3)     // Catch: java.lang.InterruptedException -> La
            return r1
        La:
            java.lang.InternalError r1 = new java.lang.InternalError
            r1.<init>()
            throw r1
    }

    @Override // io.netty.util.concurrent.Future, java.util.concurrent.Future
    public boolean cancel(boolean r3) {
            r2 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater<io.netty.util.concurrent.DefaultPromise, java.lang.Object> r3 = io.netty.util.concurrent.DefaultPromise.RESULT_UPDATER
            java.lang.Object r0 = r3.get(r2)
            if (r0 != 0) goto L24
            io.netty.util.concurrent.DefaultPromise$CauseHolder r0 = new io.netty.util.concurrent.DefaultPromise$CauseHolder
            java.util.concurrent.CancellationException r1 = new java.util.concurrent.CancellationException
            r1.<init>()
            r0.<init>(r1)
            r1 = 0
            boolean r3 = androidx.concurrent.futures.a.a(r3, r2, r1, r0)
            if (r3 == 0) goto L24
            boolean r3 = r2.checkNotifyWaiters()
            if (r3 == 0) goto L22
            r2.notifyListeners()
        L22:
            r3 = 1
            return r3
        L24:
            r3 = 0
            return r3
    }

    @Override // io.netty.util.concurrent.Future
    public java.lang.Throwable cause() {
            r2 = this;
            java.lang.Object r0 = r2.result
            boolean r1 = r0 instanceof io.netty.util.concurrent.DefaultPromise.CauseHolder
            if (r1 == 0) goto Lb
            io.netty.util.concurrent.DefaultPromise$CauseHolder r0 = (io.netty.util.concurrent.DefaultPromise.CauseHolder) r0
            java.lang.Throwable r0 = r0.cause
            return r0
        Lb:
            r0 = 0
            return r0
    }

    protected void checkDeadLock() {
            r2 = this;
            io.netty.util.concurrent.EventExecutor r0 = r2.executor()
            if (r0 == 0) goto L17
            boolean r0 = r0.inEventLoop()
            if (r0 != 0) goto Ld
            goto L17
        Ld:
            io.netty.util.concurrent.BlockingOperationException r0 = new io.netty.util.concurrent.BlockingOperationException
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L17:
            return
    }

    protected io.netty.util.concurrent.EventExecutor executor() {
            r1 = this;
            io.netty.util.concurrent.EventExecutor r0 = r1.executor
            return r0
    }

    @Override // io.netty.util.concurrent.Future
    public V getNow() {
            r2 = this;
            java.lang.Object r0 = r2.result
            boolean r1 = r0 instanceof io.netty.util.concurrent.DefaultPromise.CauseHolder
            if (r1 != 0) goto L10
            java.lang.Object r1 = io.netty.util.concurrent.DefaultPromise.SUCCESS
            if (r0 == r1) goto L10
            java.lang.Object r1 = io.netty.util.concurrent.DefaultPromise.UNCANCELLABLE
            if (r0 != r1) goto Lf
            goto L10
        Lf:
            return r0
        L10:
            r0 = 0
            return r0
    }

    @Override // io.netty.util.concurrent.Future
    public boolean isCancellable() {
            r1 = this;
            java.lang.Object r0 = r1.result
            if (r0 != 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
            r1 = this;
            java.lang.Object r0 = r1.result
            boolean r0 = isCancelled0(r0)
            return r0
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
            r1 = this;
            java.lang.Object r0 = r1.result
            boolean r0 = isDone0(r0)
            return r0
    }

    @Override // io.netty.util.concurrent.Future
    public boolean isSuccess() {
            r2 = this;
            java.lang.Object r0 = r2.result
            if (r0 == 0) goto Le
            java.lang.Object r1 = io.netty.util.concurrent.DefaultPromise.UNCANCELLABLE
            if (r0 == r1) goto Le
            boolean r0 = r0 instanceof io.netty.util.concurrent.DefaultPromise.CauseHolder
            if (r0 != 0) goto Le
            r0 = 1
            return r0
        Le:
            r0 = 0
            return r0
    }

    void notifyProgressiveListeners(long r11, long r13) {
            r10 = this;
            java.lang.Object r0 = r10.progressiveListeners()
            if (r0 != 0) goto L7
            return
        L7:
            r1 = r10
            io.netty.util.concurrent.ProgressiveFuture r1 = (io.netty.util.concurrent.ProgressiveFuture) r1
            io.netty.util.concurrent.EventExecutor r9 = r10.executor()
            boolean r2 = r9.inEventLoop()
            if (r2 == 0) goto L2c
            boolean r2 = r0 instanceof io.netty.util.concurrent.GenericProgressiveFutureListener[]
            if (r2 == 0) goto L23
            io.netty.util.concurrent.GenericProgressiveFutureListener[] r0 = (io.netty.util.concurrent.GenericProgressiveFutureListener[]) r0
            r2 = r0
            io.netty.util.concurrent.GenericProgressiveFutureListener[] r2 = (io.netty.util.concurrent.GenericProgressiveFutureListener[]) r2
            r3 = r11
            r5 = r13
            notifyProgressiveListeners0(r1, r2, r3, r5)
            return
        L23:
            r3 = r11
            r5 = r13
            r2 = r0
            io.netty.util.concurrent.GenericProgressiveFutureListener r2 = (io.netty.util.concurrent.GenericProgressiveFutureListener) r2
            notifyProgressiveListener0(r1, r2, r3, r5)
            return
        L2c:
            r3 = r11
            r5 = r13
            boolean r11 = r0 instanceof io.netty.util.concurrent.GenericProgressiveFutureListener[]
            if (r11 == 0) goto L44
            io.netty.util.concurrent.GenericProgressiveFutureListener[] r0 = (io.netty.util.concurrent.GenericProgressiveFutureListener[]) r0
            io.netty.util.concurrent.GenericProgressiveFutureListener[] r0 = (io.netty.util.concurrent.GenericProgressiveFutureListener[]) r0
            r7 = r5
            r5 = r3
            r3 = r1
            io.netty.util.concurrent.DefaultPromise$3 r1 = new io.netty.util.concurrent.DefaultPromise$3
            r2 = r10
            r4 = r0
            r1.<init>(r2, r3, r4, r5, r7)
            safeExecute(r9, r1)
            return
        L44:
            io.netty.util.concurrent.GenericProgressiveFutureListener r0 = (io.netty.util.concurrent.GenericProgressiveFutureListener) r0
            r7 = r5
            r5 = r3
            r3 = r1
            io.netty.util.concurrent.DefaultPromise$4 r1 = new io.netty.util.concurrent.DefaultPromise$4
            r2 = r10
            r4 = r0
            r1.<init>(r2, r3, r4, r5, r7)
            safeExecute(r9, r1)
            return
    }

    @Override // io.netty.util.concurrent.Future
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.Future removeListener(io.netty.util.concurrent.GenericFutureListener r1) {
            r0 = this;
            io.netty.util.concurrent.Promise r1 = r0.removeListener(r1)
            return r1
    }

    @Override // io.netty.util.concurrent.Future
    public io.netty.util.concurrent.Promise<V> removeListener(io.netty.util.concurrent.GenericFutureListener<? extends io.netty.util.concurrent.Future<? super V>> r2) {
            r1 = this;
            java.lang.String r0 = "listener"
            io.netty.util.internal.ObjectUtil.checkNotNull(r2, r0)
            monitor-enter(r1)
            r1.removeListener0(r2)     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb
            return r1
        Lb:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb
            throw r2
    }

    @Override // io.netty.util.concurrent.Future
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.Future removeListeners(io.netty.util.concurrent.GenericFutureListener[] r1) {
            r0 = this;
            io.netty.util.concurrent.Promise r1 = r0.removeListeners(r1)
            return r1
    }

    @Override // io.netty.util.concurrent.Future
    public io.netty.util.concurrent.Promise<V> removeListeners(io.netty.util.concurrent.GenericFutureListener<? extends io.netty.util.concurrent.Future<? super V>>... r4) {
            r3 = this;
            java.lang.String r0 = "listeners"
            io.netty.util.internal.ObjectUtil.checkNotNull(r4, r0)
            monitor-enter(r3)
            int r0 = r4.length     // Catch: java.lang.Throwable -> L15
            r1 = 0
        L8:
            if (r1 >= r0) goto L17
            r2 = r4[r1]     // Catch: java.lang.Throwable -> L15
            if (r2 != 0) goto Lf
            goto L17
        Lf:
            r3.removeListener0(r2)     // Catch: java.lang.Throwable -> L15
            int r1 = r1 + 1
            goto L8
        L15:
            r4 = move-exception
            goto L19
        L17:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L15
            return r3
        L19:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L15
            throw r4
    }

    public io.netty.util.concurrent.Promise<V> setFailure(java.lang.Throwable r4) {
            r3 = this;
            boolean r0 = r3.setFailure0(r4)
            if (r0 == 0) goto L7
            return r3
        L7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "complete already: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1, r4)
            throw r0
    }

    public io.netty.util.concurrent.Promise<V> setSuccess(V r3) {
            r2 = this;
            boolean r3 = r2.setSuccess0(r3)
            if (r3 == 0) goto L7
            return r2
        L7:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "complete already: "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0)
            throw r3
    }

    @Override // io.netty.util.concurrent.Promise
    public boolean setUncancellable() {
            r3 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater<io.netty.util.concurrent.DefaultPromise, java.lang.Object> r0 = io.netty.util.concurrent.DefaultPromise.RESULT_UPDATER
            r1 = 0
            java.lang.Object r2 = io.netty.util.concurrent.DefaultPromise.UNCANCELLABLE
            boolean r0 = androidx.concurrent.futures.a.a(r0, r3, r1, r2)
            r1 = 1
            if (r0 == 0) goto Ld
            return r1
        Ld:
            java.lang.Object r0 = r3.result
            boolean r2 = isDone0(r0)
            if (r2 == 0) goto L1e
            boolean r0 = isCancelled0(r0)
            if (r0 != 0) goto L1c
            goto L1e
        L1c:
            r0 = 0
            return r0
        L1e:
            return r1
    }

    @Override // io.netty.util.concurrent.Future
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.Future sync() throws java.lang.InterruptedException {
            r1 = this;
            io.netty.util.concurrent.Promise r0 = r1.sync()
            return r0
    }

    @Override // io.netty.util.concurrent.Future
    public io.netty.util.concurrent.Promise<V> sync() throws java.lang.InterruptedException {
            r0 = this;
            r0.await()
            r0.rethrowIfFailed()
            return r0
    }

    @Override // io.netty.util.concurrent.Future
    public /* bridge */ /* synthetic */ io.netty.util.concurrent.Future syncUninterruptibly() {
            r1 = this;
            io.netty.util.concurrent.Promise r0 = r1.syncUninterruptibly()
            return r0
    }

    @Override // io.netty.util.concurrent.Future
    public io.netty.util.concurrent.Promise<V> syncUninterruptibly() {
            r0 = this;
            r0.awaitUninterruptibly()
            r0.rethrowIfFailed()
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.StringBuilder r0 = r1.toStringBuilder()
            java.lang.String r0 = r0.toString()
            return r0
    }

    protected java.lang.StringBuilder toStringBuilder() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 64
            r0.<init>(r1)
            java.lang.String r2 = io.netty.util.internal.StringUtil.simpleClassName(r4)
            r0.append(r2)
            r0.append(r1)
            int r1 = r4.hashCode()
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            java.lang.Object r1 = r4.result
            java.lang.Object r2 = io.netty.util.concurrent.DefaultPromise.SUCCESS
            if (r1 != r2) goto L28
            java.lang.String r1 = "(success)"
            r0.append(r1)
            return r0
        L28:
            java.lang.Object r2 = io.netty.util.concurrent.DefaultPromise.UNCANCELLABLE
            if (r1 != r2) goto L32
            java.lang.String r1 = "(uncancellable)"
            r0.append(r1)
            return r0
        L32:
            boolean r2 = r1 instanceof io.netty.util.concurrent.DefaultPromise.CauseHolder
            r3 = 41
            if (r2 == 0) goto L48
            java.lang.String r2 = "(failure: "
            r0.append(r2)
            io.netty.util.concurrent.DefaultPromise$CauseHolder r1 = (io.netty.util.concurrent.DefaultPromise.CauseHolder) r1
            java.lang.Throwable r1 = r1.cause
            r0.append(r1)
            r0.append(r3)
            return r0
        L48:
            if (r1 == 0) goto L56
            java.lang.String r2 = "(success: "
            r0.append(r2)
            r0.append(r1)
            r0.append(r3)
            return r0
        L56:
            java.lang.String r1 = "(incomplete)"
            r0.append(r1)
            return r0
    }

    @Override // io.netty.util.concurrent.Promise
    public boolean tryFailure(java.lang.Throwable r1) {
            r0 = this;
            boolean r1 = r0.setFailure0(r1)
            return r1
    }

    @Override // io.netty.util.concurrent.Promise
    public boolean trySuccess(V r1) {
            r0 = this;
            boolean r1 = r0.setSuccess0(r1)
            return r1
    }
}
