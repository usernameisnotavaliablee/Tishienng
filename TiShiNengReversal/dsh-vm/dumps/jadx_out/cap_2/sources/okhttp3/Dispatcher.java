package okhttp3;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Dispatcher.kt\nokhttp3/Dispatcher\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 -UtilJvm.kt\nokhttp3/internal/_UtilJvmKt\n*L\n1#1,299:1\n1#2:300\n1563#3:301\n1634#3,3:302\n1563#3:306\n1634#3,3:307\n242#4:305\n242#4:310\n*S KotlinDebug\n*F\n+ 1 Dispatcher.kt\nokhttp3/Dispatcher\n*L\n279#1:301\n279#1:302,3\n283#1:306\n283#1:307,3\n279#1:305\n283#1:310\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class Dispatcher {

    @org.jetbrains.annotations.Nullable
    private java.util.concurrent.ExecutorService executorServiceOrNull;

    @org.jetbrains.annotations.Nullable
    private java.lang.Runnable idleCallback;
    private int maxRequests;
    private int maxRequestsPerHost;

    @org.jetbrains.annotations.NotNull
    private final java.util.ArrayDeque<okhttp3.internal.connection.RealCall.AsyncCall> readyAsyncCalls;

    @org.jetbrains.annotations.NotNull
    private final java.util.ArrayDeque<okhttp3.internal.connection.RealCall.AsyncCall> runningAsyncCalls;

    @org.jetbrains.annotations.NotNull
    private final java.util.ArrayDeque<okhttp3.internal.connection.RealCall> runningSyncCalls;

    public Dispatcher() {
            r1 = this;
            r1.<init>()
            r0 = 64
            r1.maxRequests = r0
            r0 = 5
            r1.maxRequestsPerHost = r0
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            r1.readyAsyncCalls = r0
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            r1.runningAsyncCalls = r0
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            r1.runningSyncCalls = r0
            return
    }

    public Dispatcher(@org.jetbrains.annotations.Nullable java.util.concurrent.ExecutorService r1) {
            r0 = this;
            r0.<init>()
            r0.executorServiceOrNull = r1
            return
    }

    private final okhttp3.internal.connection.RealCall.AsyncCall findExistingCallWithHost(java.lang.String r5) {
            r4 = this;
            java.util.ArrayDeque<okhttp3.internal.connection.RealCall$AsyncCall> r0 = r4.runningAsyncCalls
            java.util.Iterator r0 = r0.iterator()
            java.lang.String r1 = "iterator(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
        Lb:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L22
            java.lang.Object r2 = r0.next()
            okhttp3.internal.connection.RealCall$AsyncCall r2 = (okhttp3.internal.connection.RealCall.AsyncCall) r2
            java.lang.String r3 = r2.getHost()
            boolean r3 = kotlin.jvm.internal.g0.g(r3, r5)
            if (r3 == 0) goto Lb
            return r2
        L22:
            java.util.ArrayDeque<okhttp3.internal.connection.RealCall$AsyncCall> r0 = r4.readyAsyncCalls
            java.util.Iterator r0 = r0.iterator()
            kotlin.jvm.internal.g0.o(r0, r1)
        L2b:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L42
            java.lang.Object r1 = r0.next()
            okhttp3.internal.connection.RealCall$AsyncCall r1 = (okhttp3.internal.connection.RealCall.AsyncCall) r1
            java.lang.String r2 = r1.getHost()
            boolean r2 = kotlin.jvm.internal.g0.g(r2, r5)
            if (r2 == 0) goto L2b
            return r1
        L42:
            r5 = 0
            return r5
    }

    private final void promoteAndExecute(okhttp3.internal.connection.RealCall.AsyncCall r10, okhttp3.internal.connection.RealCall r11, okhttp3.internal.connection.RealCall.AsyncCall r12) {
            r9 = this;
            okhttp3.internal._UtilJvmKt.assertLockNotHeld(r9)
            java.util.concurrent.ExecutorService r0 = r9.executorService()
            boolean r0 = r0.isShutdown()
            monitor-enter(r9)
            if (r11 == 0) goto L22
            java.util.ArrayDeque<okhttp3.internal.connection.RealCall> r1 = r9.runningSyncCalls     // Catch: java.lang.Throwable -> L1f
            boolean r1 = r1.remove(r11)     // Catch: java.lang.Throwable -> L1f
            if (r1 == 0) goto L17
            goto L22
        L17:
            java.lang.String r10 = "Call wasn't in-flight!"
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L1f
            r11.<init>(r10)     // Catch: java.lang.Throwable -> L1f
            throw r11     // Catch: java.lang.Throwable -> L1f
        L1f:
            r10 = move-exception
            goto L12e
        L22:
            if (r12 == 0) goto L3c
            java.util.concurrent.atomic.AtomicInteger r1 = r12.getCallsPerHost()     // Catch: java.lang.Throwable -> L1f
            r1.decrementAndGet()     // Catch: java.lang.Throwable -> L1f
            java.util.ArrayDeque<okhttp3.internal.connection.RealCall$AsyncCall> r1 = r9.runningAsyncCalls     // Catch: java.lang.Throwable -> L1f
            boolean r1 = r1.remove(r12)     // Catch: java.lang.Throwable -> L1f
            if (r1 == 0) goto L34
            goto L3c
        L34:
            java.lang.String r10 = "Call wasn't in-flight!"
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L1f
            r11.<init>(r10)     // Catch: java.lang.Throwable -> L1f
            throw r11     // Catch: java.lang.Throwable -> L1f
        L3c:
            if (r10 == 0) goto L5a
            java.util.ArrayDeque<okhttp3.internal.connection.RealCall$AsyncCall> r1 = r9.readyAsyncCalls     // Catch: java.lang.Throwable -> L1f
            r1.add(r10)     // Catch: java.lang.Throwable -> L1f
            okhttp3.internal.connection.RealCall r1 = r10.getCall()     // Catch: java.lang.Throwable -> L1f
            boolean r1 = r1.getForWebSocket()     // Catch: java.lang.Throwable -> L1f
            if (r1 != 0) goto L5a
            java.lang.String r1 = r10.getHost()     // Catch: java.lang.Throwable -> L1f
            okhttp3.internal.connection.RealCall$AsyncCall r1 = r9.findExistingCallWithHost(r1)     // Catch: java.lang.Throwable -> L1f
            if (r1 == 0) goto L5a
            r10.reuseCallsPerHostFrom(r1)     // Catch: java.lang.Throwable -> L1f
        L5a:
            r1 = 0
            if (r11 != 0) goto L5f
            if (r12 == 0) goto L74
        L5f:
            if (r0 != 0) goto L69
            java.util.ArrayDeque<okhttp3.internal.connection.RealCall$AsyncCall> r11 = r9.runningAsyncCalls     // Catch: java.lang.Throwable -> L1f
            boolean r11 = r11.isEmpty()     // Catch: java.lang.Throwable -> L1f
            if (r11 == 0) goto L74
        L69:
            java.util.ArrayDeque<okhttp3.internal.connection.RealCall> r11 = r9.runningSyncCalls     // Catch: java.lang.Throwable -> L1f
            boolean r11 = r11.isEmpty()     // Catch: java.lang.Throwable -> L1f
            if (r11 == 0) goto L74
            java.lang.Runnable r11 = r9.idleCallback     // Catch: java.lang.Throwable -> L1f
            goto L75
        L74:
            r11 = r1
        L75:
            if (r0 == 0) goto L88
            java.util.ArrayDeque<okhttp3.internal.connection.RealCall$AsyncCall> r12 = r9.readyAsyncCalls     // Catch: java.lang.Throwable -> L1f
            java.util.List r12 = kotlin.collections.f0.a6(r12)     // Catch: java.lang.Throwable -> L1f
            java.util.ArrayDeque<okhttp3.internal.connection.RealCall$AsyncCall> r2 = r9.readyAsyncCalls     // Catch: java.lang.Throwable -> L1f
            r2.clear()     // Catch: java.lang.Throwable -> L1f
            okhttp3.Dispatcher$promoteAndExecute$Effects r2 = new okhttp3.Dispatcher$promoteAndExecute$Effects     // Catch: java.lang.Throwable -> L1f
            r2.<init>(r12, r11)     // Catch: java.lang.Throwable -> L1f
            goto Ld5
        L88:
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L1f
            r12.<init>()     // Catch: java.lang.Throwable -> L1f
            java.util.ArrayDeque<okhttp3.internal.connection.RealCall$AsyncCall> r2 = r9.readyAsyncCalls     // Catch: java.lang.Throwable -> L1f
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L1f
            java.lang.String r3 = "iterator(...)"
            kotlin.jvm.internal.g0.o(r2, r3)     // Catch: java.lang.Throwable -> L1f
        L98:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L1f
            if (r3 == 0) goto Ld0
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L1f
            okhttp3.internal.connection.RealCall$AsyncCall r3 = (okhttp3.internal.connection.RealCall.AsyncCall) r3     // Catch: java.lang.Throwable -> L1f
            java.util.ArrayDeque<okhttp3.internal.connection.RealCall$AsyncCall> r4 = r9.runningAsyncCalls     // Catch: java.lang.Throwable -> L1f
            int r4 = r4.size()     // Catch: java.lang.Throwable -> L1f
            int r5 = r9.maxRequests     // Catch: java.lang.Throwable -> L1f
            if (r4 >= r5) goto Ld0
            java.util.concurrent.atomic.AtomicInteger r4 = r3.getCallsPerHost()     // Catch: java.lang.Throwable -> L1f
            int r4 = r4.get()     // Catch: java.lang.Throwable -> L1f
            int r5 = r9.maxRequestsPerHost     // Catch: java.lang.Throwable -> L1f
            if (r4 >= r5) goto L98
            r2.remove()     // Catch: java.lang.Throwable -> L1f
            java.util.concurrent.atomic.AtomicInteger r4 = r3.getCallsPerHost()     // Catch: java.lang.Throwable -> L1f
            r4.incrementAndGet()     // Catch: java.lang.Throwable -> L1f
            kotlin.jvm.internal.g0.m(r3)     // Catch: java.lang.Throwable -> L1f
            r12.add(r3)     // Catch: java.lang.Throwable -> L1f
            java.util.ArrayDeque<okhttp3.internal.connection.RealCall$AsyncCall> r4 = r9.runningAsyncCalls     // Catch: java.lang.Throwable -> L1f
            r4.add(r3)     // Catch: java.lang.Throwable -> L1f
            goto L98
        Ld0:
            okhttp3.Dispatcher$promoteAndExecute$Effects r2 = new okhttp3.Dispatcher$promoteAndExecute$Effects     // Catch: java.lang.Throwable -> L1f
            r2.<init>(r12, r11)     // Catch: java.lang.Throwable -> L1f
        Ld5:
            monitor-exit(r9)
            java.util.List r11 = r2.getCallsToExecute()
            int r11 = r11.size()
            r12 = 0
            r3 = 1
            r4 = 0
            r5 = 1
        Le2:
            if (r4 >= r11) goto L111
            java.util.List r6 = r2.getCallsToExecute()
            java.lang.Object r6 = r6.get(r4)
            okhttp3.internal.connection.RealCall$AsyncCall r6 = (okhttp3.internal.connection.RealCall.AsyncCall) r6
            if (r6 != r10) goto Lf2
            r5 = 0
            goto L101
        Lf2:
            okhttp3.internal.connection.RealCall r7 = r6.getCall()
            okhttp3.EventListener r7 = r7.getEventListener$okhttp()
            okhttp3.internal.connection.RealCall r8 = r6.getCall()
            r7.dispatcherQueueEnd(r8, r9)
        L101:
            if (r0 == 0) goto L107
            okhttp3.internal.connection.RealCall.AsyncCall.failRejected$okhttp$default(r6, r1, r3, r1)
            goto L10e
        L107:
            java.util.concurrent.ExecutorService r7 = r9.executorService()
            r6.executeOn(r7)
        L10e:
            int r4 = r4 + 1
            goto Le2
        L111:
            if (r5 == 0) goto L124
            if (r10 == 0) goto L124
            okhttp3.internal.connection.RealCall r11 = r10.getCall()
            okhttp3.EventListener r11 = r11.getEventListener$okhttp()
            okhttp3.internal.connection.RealCall r10 = r10.getCall()
            r11.dispatcherQueueStart(r10, r9)
        L124:
            java.lang.Runnable r10 = r2.getIdleCallbackToRun()
            if (r10 == 0) goto L12d
            r10.run()
        L12d:
            return
        L12e:
            monitor-exit(r9)
            throw r10
    }

    static /* synthetic */ void promoteAndExecute$default(okhttp3.Dispatcher r1, okhttp3.internal.connection.RealCall.AsyncCall r2, okhttp3.internal.connection.RealCall r3, okhttp3.internal.connection.RealCall.AsyncCall r4, int r5, java.lang.Object r6) {
            r6 = r5 & 1
            r0 = 0
            if (r6 == 0) goto L6
            r2 = r0
        L6:
            r6 = r5 & 2
            if (r6 == 0) goto Lb
            r3 = r0
        Lb:
            r5 = r5 & 4
            if (r5 == 0) goto L10
            r4 = r0
        L10:
            r1.promoteAndExecute(r2, r3, r4)
            return
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "executorService", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_executorService")
    @org.jetbrains.annotations.NotNull
    /* renamed from: -deprecated_executorService, reason: not valid java name */
    public final java.util.concurrent.ExecutorService m82deprecated_executorService() {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = r1.executorService()
            return r0
    }

    public final synchronized void cancelAll() {
            r2 = this;
            monitor-enter(r2)
            java.util.ArrayDeque<okhttp3.internal.connection.RealCall$AsyncCall> r0 = r2.readyAsyncCalls     // Catch: java.lang.Throwable -> L20
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L20
            java.lang.String r1 = "iterator(...)"
            kotlin.jvm.internal.g0.o(r0, r1)     // Catch: java.lang.Throwable -> L20
        Lc:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L22
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L20
            okhttp3.internal.connection.RealCall$AsyncCall r1 = (okhttp3.internal.connection.RealCall.AsyncCall) r1     // Catch: java.lang.Throwable -> L20
            okhttp3.internal.connection.RealCall r1 = r1.getCall()     // Catch: java.lang.Throwable -> L20
            r1.cancel()     // Catch: java.lang.Throwable -> L20
            goto Lc
        L20:
            r0 = move-exception
            goto L5e
        L22:
            java.util.ArrayDeque<okhttp3.internal.connection.RealCall$AsyncCall> r0 = r2.runningAsyncCalls     // Catch: java.lang.Throwable -> L20
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L20
            java.lang.String r1 = "iterator(...)"
            kotlin.jvm.internal.g0.o(r0, r1)     // Catch: java.lang.Throwable -> L20
        L2d:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L41
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L20
            okhttp3.internal.connection.RealCall$AsyncCall r1 = (okhttp3.internal.connection.RealCall.AsyncCall) r1     // Catch: java.lang.Throwable -> L20
            okhttp3.internal.connection.RealCall r1 = r1.getCall()     // Catch: java.lang.Throwable -> L20
            r1.cancel()     // Catch: java.lang.Throwable -> L20
            goto L2d
        L41:
            java.util.ArrayDeque<okhttp3.internal.connection.RealCall> r0 = r2.runningSyncCalls     // Catch: java.lang.Throwable -> L20
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L20
            java.lang.String r1 = "iterator(...)"
            kotlin.jvm.internal.g0.o(r0, r1)     // Catch: java.lang.Throwable -> L20
        L4c:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L5c
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L20
            okhttp3.internal.connection.RealCall r1 = (okhttp3.internal.connection.RealCall) r1     // Catch: java.lang.Throwable -> L20
            r1.cancel()     // Catch: java.lang.Throwable -> L20
            goto L4c
        L5c:
            monitor-exit(r2)
            return
        L5e:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            throw r0
    }

    public final void enqueue$okhttp(@org.jetbrains.annotations.NotNull okhttp3.internal.connection.RealCall.AsyncCall r8) {
            r7 = this;
            java.lang.String r0 = "call"
            kotlin.jvm.internal.g0.p(r8, r0)
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            promoteAndExecute$default(r1, r2, r3, r4, r5, r6)
            return
    }

    public final synchronized boolean executed$okhttp(@org.jetbrains.annotations.NotNull okhttp3.internal.connection.RealCall r2) {
            r1 = this;
            monitor-enter(r1)
            java.lang.String r0 = "call"
            kotlin.jvm.internal.g0.p(r2, r0)     // Catch: java.lang.Throwable -> Le
            java.util.ArrayDeque<okhttp3.internal.connection.RealCall> r0 = r1.runningSyncCalls     // Catch: java.lang.Throwable -> Le
            boolean r2 = r0.add(r2)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r1)
            return r2
        Le:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Le
            throw r2
    }

    @kotlin.jvm.JvmName(name = "executorService")
    @org.jetbrains.annotations.NotNull
    public final synchronized java.util.concurrent.ExecutorService executorService() {
            r9 = this;
            monitor-enter(r9)
            java.util.concurrent.ExecutorService r0 = r9.executorServiceOrNull     // Catch: java.lang.Throwable -> L32
            if (r0 != 0) goto L34
            java.util.concurrent.ThreadPoolExecutor r1 = new java.util.concurrent.ThreadPoolExecutor     // Catch: java.lang.Throwable -> L32
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> L32
            java.util.concurrent.SynchronousQueue r7 = new java.util.concurrent.SynchronousQueue     // Catch: java.lang.Throwable -> L32
            r7.<init>()     // Catch: java.lang.Throwable -> L32
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L32
            r0.<init>()     // Catch: java.lang.Throwable -> L32
            java.lang.String r2 = okhttp3.internal._UtilJvmKt.okHttpName     // Catch: java.lang.Throwable -> L32
            r0.append(r2)     // Catch: java.lang.Throwable -> L32
            java.lang.String r2 = " Dispatcher"
            r0.append(r2)     // Catch: java.lang.Throwable -> L32
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L32
            r2 = 0
            java.util.concurrent.ThreadFactory r8 = okhttp3.internal._UtilJvmKt.threadFactory(r0, r2)     // Catch: java.lang.Throwable -> L32
            r2 = 0
            r3 = 2147483647(0x7fffffff, float:NaN)
            r4 = 60
            r1.<init>(r2, r3, r4, r6, r7, r8)     // Catch: java.lang.Throwable -> L32
            r9.executorServiceOrNull = r1     // Catch: java.lang.Throwable -> L32
            goto L34
        L32:
            r0 = move-exception
            goto L3b
        L34:
            java.util.concurrent.ExecutorService r0 = r9.executorServiceOrNull     // Catch: java.lang.Throwable -> L32
            kotlin.jvm.internal.g0.m(r0)     // Catch: java.lang.Throwable -> L32
            monitor-exit(r9)
            return r0
        L3b:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L32
            throw r0
    }

    public final void finished$okhttp(@org.jetbrains.annotations.NotNull okhttp3.internal.connection.RealCall.AsyncCall r8) {
            r7 = this;
            java.lang.String r0 = "call"
            kotlin.jvm.internal.g0.p(r8, r0)
            r5 = 3
            r6 = 0
            r2 = 0
            r3 = 0
            r1 = r7
            r4 = r8
            promoteAndExecute$default(r1, r2, r3, r4, r5, r6)
            return
    }

    public final void finished$okhttp(@org.jetbrains.annotations.NotNull okhttp3.internal.connection.RealCall r8) {
            r7 = this;
            java.lang.String r0 = "call"
            kotlin.jvm.internal.g0.p(r8, r0)
            r5 = 5
            r6 = 0
            r2 = 0
            r4 = 0
            r1 = r7
            r3 = r8
            promoteAndExecute$default(r1, r2, r3, r4, r5, r6)
            return
    }

    @org.jetbrains.annotations.Nullable
    public final synchronized java.lang.Runnable getIdleCallback() {
            r1 = this;
            monitor-enter(r1)
            java.lang.Runnable r0 = r1.idleCallback     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5
            throw r0
    }

    public final synchronized int getMaxRequests() {
            r1 = this;
            monitor-enter(r1)
            int r0 = r1.maxRequests     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5
            throw r0
    }

    public final synchronized int getMaxRequestsPerHost() {
            r1 = this;
            monitor-enter(r1)
            int r0 = r1.maxRequestsPerHost     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5
            throw r0
    }

    @org.jetbrains.annotations.NotNull
    public final synchronized java.util.List<okhttp3.Call> queuedCalls() {
            r3 = this;
            monitor-enter(r3)
            java.util.ArrayDeque<okhttp3.internal.connection.RealCall$AsyncCall> r0 = r3.readyAsyncCalls     // Catch: java.lang.Throwable -> L26
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L26
            r2 = 10
            int r2 = kotlin.collections.f0.d0(r0, r2)     // Catch: java.lang.Throwable -> L26
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L26
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L26
        L12:
            boolean r2 = r0.hasNext()     // Catch: java.lang.Throwable -> L26
            if (r2 == 0) goto L28
            java.lang.Object r2 = r0.next()     // Catch: java.lang.Throwable -> L26
            okhttp3.internal.connection.RealCall$AsyncCall r2 = (okhttp3.internal.connection.RealCall.AsyncCall) r2     // Catch: java.lang.Throwable -> L26
            okhttp3.internal.connection.RealCall r2 = r2.getCall()     // Catch: java.lang.Throwable -> L26
            r1.add(r2)     // Catch: java.lang.Throwable -> L26
            goto L12
        L26:
            r0 = move-exception
            goto L33
        L28:
            java.util.List r0 = java.util.Collections.unmodifiableList(r1)     // Catch: java.lang.Throwable -> L26
            java.lang.String r1 = "unmodifiableList(...)"
            kotlin.jvm.internal.g0.o(r0, r1)     // Catch: java.lang.Throwable -> L26
            monitor-exit(r3)
            return r0
        L33:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L26
            throw r0
    }

    public final synchronized int queuedCallsCount() {
            r1 = this;
            monitor-enter(r1)
            java.util.ArrayDeque<okhttp3.internal.connection.RealCall$AsyncCall> r0 = r1.readyAsyncCalls     // Catch: java.lang.Throwable -> L9
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L9
            monitor-exit(r1)
            return r0
        L9:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9
            throw r0
    }

    @org.jetbrains.annotations.NotNull
    public final synchronized java.util.List<okhttp3.Call> runningCalls() {
            r4 = this;
            monitor-enter(r4)
            java.util.ArrayDeque<okhttp3.internal.connection.RealCall> r0 = r4.runningSyncCalls     // Catch: java.lang.Throwable -> L28
            java.util.ArrayDeque<okhttp3.internal.connection.RealCall$AsyncCall> r1 = r4.runningAsyncCalls     // Catch: java.lang.Throwable -> L28
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L28
            r3 = 10
            int r3 = kotlin.collections.f0.d0(r1, r3)     // Catch: java.lang.Throwable -> L28
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L28
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L28
        L14:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> L28
            if (r3 == 0) goto L2a
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> L28
            okhttp3.internal.connection.RealCall$AsyncCall r3 = (okhttp3.internal.connection.RealCall.AsyncCall) r3     // Catch: java.lang.Throwable -> L28
            okhttp3.internal.connection.RealCall r3 = r3.getCall()     // Catch: java.lang.Throwable -> L28
            r2.add(r3)     // Catch: java.lang.Throwable -> L28
            goto L14
        L28:
            r0 = move-exception
            goto L39
        L2a:
            java.util.List r0 = kotlin.collections.f0.I4(r0, r2)     // Catch: java.lang.Throwable -> L28
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)     // Catch: java.lang.Throwable -> L28
            java.lang.String r1 = "unmodifiableList(...)"
            kotlin.jvm.internal.g0.o(r0, r1)     // Catch: java.lang.Throwable -> L28
            monitor-exit(r4)
            return r0
        L39:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L28
            throw r0
    }

    public final synchronized int runningCallsCount() {
            r2 = this;
            monitor-enter(r2)
            java.util.ArrayDeque<okhttp3.internal.connection.RealCall$AsyncCall> r0 = r2.runningAsyncCalls     // Catch: java.lang.Throwable -> L10
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L10
            java.util.ArrayDeque<okhttp3.internal.connection.RealCall> r1 = r2.runningSyncCalls     // Catch: java.lang.Throwable -> L10
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L10
            int r0 = r0 + r1
            monitor-exit(r2)
            return r0
        L10:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L10
            throw r0
    }

    public final synchronized void setIdleCallback(@org.jetbrains.annotations.Nullable java.lang.Runnable r1) {
            r0 = this;
            monitor-enter(r0)
            r0.idleCallback = r1     // Catch: java.lang.Throwable -> L5
            monitor-exit(r0)
            return
        L5:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5
            throw r1
    }

    public final void setMaxRequests(int r8) {
            r7 = this;
            r0 = 1
            if (r8 < r0) goto L18
            monitor-enter(r7)
            r7.maxRequests = r8     // Catch: java.lang.Throwable -> L13
            kotlin.n1 r8 = kotlin.n1.a     // Catch: java.lang.Throwable -> L13
            monitor-exit(r7)
            r5 = 7
            r6 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            promoteAndExecute$default(r1, r2, r3, r4, r5, r6)
            return
        L13:
            r0 = move-exception
            r1 = r7
            r8 = r0
            monitor-exit(r7)
            throw r8
        L18:
            r1 = r7
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "max < 1: "
            r0.append(r2)
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r8 = r8.toString()
            r0.<init>(r8)
            throw r0
    }

    public final void setMaxRequestsPerHost(int r8) {
            r7 = this;
            r0 = 1
            if (r8 < r0) goto L18
            monitor-enter(r7)
            r7.maxRequestsPerHost = r8     // Catch: java.lang.Throwable -> L13
            kotlin.n1 r8 = kotlin.n1.a     // Catch: java.lang.Throwable -> L13
            monitor-exit(r7)
            r5 = 7
            r6 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            promoteAndExecute$default(r1, r2, r3, r4, r5, r6)
            return
        L13:
            r0 = move-exception
            r1 = r7
            r8 = r0
            monitor-exit(r7)
            throw r8
        L18:
            r1 = r7
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "max < 1: "
            r0.append(r2)
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r8 = r8.toString()
            r0.<init>(r8)
            throw r0
    }
}
