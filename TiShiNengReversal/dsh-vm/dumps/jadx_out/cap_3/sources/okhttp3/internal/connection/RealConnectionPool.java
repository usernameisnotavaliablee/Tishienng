package okhttp3.internal.connection;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nRealConnectionPool.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealConnectionPool.kt\nokhttp3/internal/connection/RealConnectionPool\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Lockable.kt\nokhttp3/internal/concurrent/LockableKt\n*L\n1#1,326:1\n1#2:327\n1788#3,3:328\n1791#3:332\n63#4:331\n63#4:333\n63#4:334\n55#4,4:335\n55#4,4:339\n63#4:343\n63#4:344\n63#4:345\n55#4,4:346\n*S KotlinDebug\n*F\n+ 1 RealConnectionPool.kt\nokhttp3/internal/connection/RealConnectionPool\n*L\n64#1:328,3\n64#1:332\n65#1:331\n92#1:333\n111#1:334\n127#1:335,4\n139#1:339,4\n157#1:343\n201#1:344\n247#1:345\n287#1:346,4\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class RealConnectionPool {

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.internal.connection.RealConnectionPool.Companion Companion = null;

    @org.jetbrains.annotations.NotNull
    private final okhttp3.internal.concurrent.TaskQueue cleanupQueue;

    @org.jetbrains.annotations.NotNull
    private final okhttp3.internal.connection.RealConnectionPool$cleanupTask$1 cleanupTask;

    @org.jetbrains.annotations.NotNull
    private final okhttp3.internal.connection.ConnectionListener connectionListener;

    @org.jetbrains.annotations.NotNull
    private final java.util.concurrent.ConcurrentLinkedQueue<okhttp3.internal.connection.RealConnection> connections;
    private final long keepAliveDurationNs;
    private final int maxIdleConnections;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.v r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.internal.connection.RealConnectionPool get(@org.jetbrains.annotations.NotNull okhttp3.ConnectionPool r2) {
                r1 = this;
                java.lang.String r0 = "connectionPool"
                kotlin.jvm.internal.g0.p(r2, r0)
                okhttp3.internal.connection.RealConnectionPool r2 = r2.getDelegate$okhttp()
                return r2
        }
    }

    static {
            okhttp3.internal.connection.RealConnectionPool$Companion r0 = new okhttp3.internal.connection.RealConnectionPool$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.internal.connection.RealConnectionPool.Companion = r0
            return
    }

    public RealConnectionPool(@org.jetbrains.annotations.NotNull okhttp3.internal.concurrent.TaskRunner r2, int r3, long r4, @org.jetbrains.annotations.NotNull java.util.concurrent.TimeUnit r6, @org.jetbrains.annotations.NotNull okhttp3.internal.connection.ConnectionListener r7) {
            r1 = this;
            java.lang.String r0 = "taskRunner"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "timeUnit"
            kotlin.jvm.internal.g0.p(r6, r0)
            java.lang.String r0 = "connectionListener"
            kotlin.jvm.internal.g0.p(r7, r0)
            r1.<init>()
            r1.maxIdleConnections = r3
            r1.connectionListener = r7
            long r6 = r6.toNanos(r4)
            r1.keepAliveDurationNs = r6
            okhttp3.internal.concurrent.TaskQueue r2 = r2.newQueue()
            r1.cleanupQueue = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = okhttp3.internal._UtilJvmKt.okHttpName
            r2.append(r3)
            java.lang.String r3 = " ConnectionPool connection closer"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            okhttp3.internal.connection.RealConnectionPool$cleanupTask$1 r3 = new okhttp3.internal.connection.RealConnectionPool$cleanupTask$1
            r3.<init>(r1, r2)
            r1.cleanupTask = r3
            java.util.concurrent.ConcurrentLinkedQueue r2 = new java.util.concurrent.ConcurrentLinkedQueue
            r2.<init>()
            r1.connections = r2
            r2 = 0
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 <= 0) goto L4a
            return
        L4a:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "keepAliveDuration <= 0: "
            r2.append(r3)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r2 = r2.toString()
            r3.<init>(r2)
            throw r3
    }

    private final int pruneAndGetAllocationCount(okhttp3.internal.connection.RealConnection r7, long r8) {
            r6 = this;
            boolean r0 = okhttp3.internal._UtilJvmKt.assertionsEnabled
            if (r0 == 0) goto L32
            boolean r0 = java.lang.Thread.holdsLock(r7)
            if (r0 == 0) goto Lb
            goto L32
        Lb:
            java.lang.AssertionError r8 = new java.lang.AssertionError
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "Thread "
            r9.append(r0)
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.String r0 = r0.getName()
            r9.append(r0)
            java.lang.String r0 = " MUST hold lock on "
            r9.append(r0)
            r9.append(r7)
            java.lang.String r7 = r9.toString()
            r8.<init>(r7)
            throw r8
        L32:
            java.util.List r0 = r7.getCalls()
            r1 = 0
            r2 = 0
        L38:
            int r3 = r0.size()
            if (r2 >= r3) goto L93
            java.lang.Object r3 = r0.get(r2)
            java.lang.ref.Reference r3 = (java.lang.ref.Reference) r3
            java.lang.Object r4 = r3.get()
            if (r4 == 0) goto L4d
            int r2 = r2 + 1
            goto L38
        L4d:
            java.lang.String r4 = "null cannot be cast to non-null type okhttp3.internal.connection.RealCall.CallReference"
            kotlin.jvm.internal.g0.n(r3, r4)
            okhttp3.internal.connection.RealCall$CallReference r3 = (okhttp3.internal.connection.RealCall.CallReference) r3
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "A connection to "
            r4.append(r5)
            okhttp3.Route r5 = r7.route()
            okhttp3.Address r5 = r5.address()
            okhttp3.HttpUrl r5 = r5.url()
            r4.append(r5)
            java.lang.String r5 = " was leaked. Did you forget to close a response body?"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            okhttp3.internal.platform.Platform$Companion r5 = okhttp3.internal.platform.Platform.Companion
            okhttp3.internal.platform.Platform r5 = r5.get()
            java.lang.Object r3 = r3.getCallStackTrace()
            r5.logCloseableLeak(r4, r3)
            r0.remove(r2)
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L38
            long r2 = r6.keepAliveDurationNs
            long r8 = r8 - r2
            r7.setIdleAtNs(r8)
            return r1
        L93:
            int r7 = r0.size()
            return r7
    }

    @org.jetbrains.annotations.Nullable
    public final okhttp3.internal.connection.RealConnection callAcquirePooledConnection$okhttp(boolean r6, @org.jetbrains.annotations.NotNull okhttp3.Address r7, @org.jetbrains.annotations.NotNull okhttp3.internal.connection.RealCall r8, @org.jetbrains.annotations.Nullable java.util.List<okhttp3.Route> r9, boolean r10) {
            r5 = this;
            java.lang.String r0 = "address"
            kotlin.jvm.internal.g0.p(r7, r0)
            java.lang.String r0 = "call"
            kotlin.jvm.internal.g0.p(r8, r0)
            java.util.concurrent.ConcurrentLinkedQueue<okhttp3.internal.connection.RealConnection> r0 = r5.connections
            java.util.Iterator r0 = r0.iterator()
            java.lang.String r1 = "iterator(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
        L15:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L6c
            java.lang.Object r1 = r0.next()
            okhttp3.internal.connection.RealConnection r1 = (okhttp3.internal.connection.RealConnection) r1
            kotlin.jvm.internal.g0.m(r1)
            monitor-enter(r1)
            r2 = 1
            r3 = 0
            if (r10 == 0) goto L32
            boolean r4 = r1.isMultiplexed$okhttp()     // Catch: java.lang.Throwable -> L30
            if (r4 != 0) goto L32
            goto L3d
        L30:
            r6 = move-exception
            goto L6a
        L32:
            boolean r4 = r1.isEligible$okhttp(r7, r9)     // Catch: java.lang.Throwable -> L30
            if (r4 != 0) goto L39
            goto L3d
        L39:
            r8.acquireConnectionNoEvents(r1)     // Catch: java.lang.Throwable -> L30
            r3 = 1
        L3d:
            monitor-exit(r1)
            if (r3 == 0) goto L15
            boolean r3 = r1.isHealthy(r6)
            if (r3 == 0) goto L47
            return r1
        L47:
            monitor-enter(r1)
            boolean r3 = r1.getNoNewExchanges()     // Catch: java.lang.Throwable -> L67
            r1.setNoNewExchanges(r2)     // Catch: java.lang.Throwable -> L67
            java.net.Socket r2 = r8.releaseConnectionNoEvents$okhttp()     // Catch: java.lang.Throwable -> L67
            monitor-exit(r1)
            if (r2 == 0) goto L5f
            okhttp3.internal._UtilJvmKt.closeQuietly(r2)
            okhttp3.internal.connection.ConnectionListener r2 = r5.connectionListener
            r2.connectionClosed(r1)
            goto L15
        L5f:
            if (r3 != 0) goto L15
            okhttp3.internal.connection.ConnectionListener r2 = r5.connectionListener
            r2.noNewExchanges(r1)
            goto L15
        L67:
            r6 = move-exception
            monitor-exit(r1)
            throw r6
        L6a:
            monitor-exit(r1)
            throw r6
        L6c:
            r6 = 0
            return r6
    }

    public final long closeConnections(long r18) {
            r17 = this;
            r1 = r17
            r2 = r18
            long r4 = r1.keepAliveDurationNs
            long r4 = r2 - r4
            r6 = 1
            long r4 = r4 + r6
            java.util.concurrent.ConcurrentLinkedQueue<okhttp3.internal.connection.RealConnection> r0 = r1.connections
            java.util.Iterator r0 = r0.iterator()
            java.lang.String r6 = "iterator(...)"
            kotlin.jvm.internal.g0.o(r0, r6)
            r6 = 0
            r7 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r9 = 0
            r11 = r6
            r12 = r11
            r10 = 0
        L20:
            boolean r13 = r0.hasNext()
            if (r13 == 0) goto L52
            java.lang.Object r13 = r0.next()
            okhttp3.internal.connection.RealConnection r13 = (okhttp3.internal.connection.RealConnection) r13
            kotlin.jvm.internal.g0.m(r13)
            monitor-enter(r13)
            int r14 = r1.pruneAndGetAllocationCount(r13, r2)     // Catch: java.lang.Throwable -> L4f
            if (r14 <= 0) goto L39
            int r10 = r10 + 1
            goto L4b
        L39:
            long r14 = r13.getIdleAtNs()     // Catch: java.lang.Throwable -> L4f
            int r16 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r16 >= 0) goto L43
            r11 = r13
            r4 = r14
        L43:
            int r9 = r9 + 1
            int r16 = (r14 > r7 ? 1 : (r14 == r7 ? 0 : -1))
            if (r16 >= 0) goto L4b
            r12 = r13
            r7 = r14
        L4b:
            kotlin.n1 r14 = kotlin.n1.a     // Catch: java.lang.Throwable -> L4f
            monitor-exit(r13)
            goto L20
        L4f:
            r0 = move-exception
            monitor-exit(r13)
            throw r0
        L52:
            r13 = -1
            if (r11 == 0) goto L58
            r6 = r11
            goto L60
        L58:
            int r0 = r1.maxIdleConnections
            if (r9 <= r0) goto L5f
            r4 = r7
            r6 = r12
            goto L60
        L5f:
            r4 = r13
        L60:
            if (r6 == 0) goto La4
            monitor-enter(r6)
            java.util.List r0 = r6.getCalls()     // Catch: java.lang.Throwable -> La1
            java.util.Collection r0 = (java.util.Collection) r0     // Catch: java.lang.Throwable -> La1
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> La1
            r2 = 0
            if (r0 != 0) goto L73
            monitor-exit(r6)
            return r2
        L73:
            long r7 = r6.getIdleAtNs()     // Catch: java.lang.Throwable -> La1
            int r0 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r0 == 0) goto L7d
            monitor-exit(r6)
            return r2
        L7d:
            r0 = 1
            r6.setNoNewExchanges(r0)     // Catch: java.lang.Throwable -> La1
            java.util.concurrent.ConcurrentLinkedQueue<okhttp3.internal.connection.RealConnection> r0 = r1.connections     // Catch: java.lang.Throwable -> La1
            r0.remove(r6)     // Catch: java.lang.Throwable -> La1
            monitor-exit(r6)
            java.net.Socket r0 = r6.socket()
            okhttp3.internal._UtilJvmKt.closeQuietly(r0)
            okhttp3.internal.connection.ConnectionListener r0 = r1.connectionListener
            r0.connectionClosed(r6)
            java.util.concurrent.ConcurrentLinkedQueue<okhttp3.internal.connection.RealConnection> r0 = r1.connections
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto La0
            okhttp3.internal.concurrent.TaskQueue r0 = r1.cleanupQueue
            r0.cancelAll()
        La0:
            return r2
        La1:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        La4:
            if (r12 == 0) goto Lab
            long r4 = r1.keepAliveDurationNs
            long r7 = r7 + r4
            long r7 = r7 - r2
            return r7
        Lab:
            if (r10 <= 0) goto Lb0
            long r2 = r1.keepAliveDurationNs
            return r2
        Lb0:
            return r13
    }

    public final boolean connectionBecameIdle(@org.jetbrains.annotations.NotNull okhttp3.internal.connection.RealConnection r4) {
            r3 = this;
            java.lang.String r0 = "connection"
            kotlin.jvm.internal.g0.p(r4, r0)
            boolean r0 = okhttp3.internal._UtilJvmKt.assertionsEnabled
            if (r0 == 0) goto L37
            boolean r0 = java.lang.Thread.holdsLock(r4)
            if (r0 == 0) goto L10
            goto L37
        L10:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Thread "
            r1.append(r2)
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            java.lang.String r2 = r2.getName()
            r1.append(r2)
            java.lang.String r2 = " MUST hold lock on "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        L37:
            boolean r0 = r4.getNoNewExchanges()
            if (r0 != 0) goto L47
            int r0 = r3.maxIdleConnections
            if (r0 != 0) goto L42
            goto L47
        L42:
            r3.scheduleCloser()
            r4 = 0
            return r4
        L47:
            r0 = 1
            r4.setNoNewExchanges(r0)
            java.util.concurrent.ConcurrentLinkedQueue<okhttp3.internal.connection.RealConnection> r1 = r3.connections
            r1.remove(r4)
            java.util.concurrent.ConcurrentLinkedQueue<okhttp3.internal.connection.RealConnection> r4 = r3.connections
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L5d
            okhttp3.internal.concurrent.TaskQueue r4 = r3.cleanupQueue
            r4.cancelAll()
        L5d:
            return r0
    }

    public final int connectionCount() {
            r1 = this;
            java.util.concurrent.ConcurrentLinkedQueue<okhttp3.internal.connection.RealConnection> r0 = r1.connections
            int r0 = r0.size()
            return r0
    }

    public final void evictAll() {
            r3 = this;
            java.util.concurrent.ConcurrentLinkedQueue<okhttp3.internal.connection.RealConnection> r0 = r3.connections
            java.util.Iterator r0 = r0.iterator()
            java.lang.String r1 = "iterator(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
        Lb:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L42
            java.lang.Object r1 = r0.next()
            okhttp3.internal.connection.RealConnection r1 = (okhttp3.internal.connection.RealConnection) r1
            kotlin.jvm.internal.g0.m(r1)
            monitor-enter(r1)
            java.util.List r2 = r1.getCalls()     // Catch: java.lang.Throwable -> L31
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L31
            if (r2 == 0) goto L33
            r0.remove()     // Catch: java.lang.Throwable -> L31
            r2 = 1
            r1.setNoNewExchanges(r2)     // Catch: java.lang.Throwable -> L31
            java.net.Socket r2 = r1.socket()     // Catch: java.lang.Throwable -> L31
            goto L34
        L31:
            r0 = move-exception
            goto L40
        L33:
            r2 = 0
        L34:
            monitor-exit(r1)
            if (r2 == 0) goto Lb
            okhttp3.internal._UtilJvmKt.closeQuietly(r2)
            okhttp3.internal.connection.ConnectionListener r2 = r3.connectionListener
            r2.connectionClosed(r1)
            goto Lb
        L40:
            monitor-exit(r1)
            throw r0
        L42:
            java.util.concurrent.ConcurrentLinkedQueue<okhttp3.internal.connection.RealConnection> r0 = r3.connections
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L4f
            okhttp3.internal.concurrent.TaskQueue r0 = r3.cleanupQueue
            r0.cancelAll()
        L4f:
            return
    }

    @org.jetbrains.annotations.NotNull
    public final okhttp3.internal.connection.ConnectionListener getConnectionListener$okhttp() {
            r1 = this;
            okhttp3.internal.connection.ConnectionListener r0 = r1.connectionListener
            return r0
    }

    public final long getKeepAliveDurationNs$okhttp() {
            r2 = this;
            long r0 = r2.keepAliveDurationNs
            return r0
    }

    public final int idleConnectionCount() {
            r4 = this;
            java.util.concurrent.ConcurrentLinkedQueue<okhttp3.internal.connection.RealConnection> r0 = r4.connections
            boolean r1 = androidx.activity.k.a(r0)
            r2 = 0
            if (r1 == 0) goto L10
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L10
            return r2
        L10:
            java.util.Iterator r0 = r0.iterator()
        L14:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L3a
            java.lang.Object r1 = r0.next()
            okhttp3.internal.connection.RealConnection r1 = (okhttp3.internal.connection.RealConnection) r1
            kotlin.jvm.internal.g0.m(r1)
            monitor-enter(r1)
            java.util.List r3 = r1.getCalls()     // Catch: java.lang.Throwable -> L37
            boolean r3 = r3.isEmpty()     // Catch: java.lang.Throwable -> L37
            monitor-exit(r1)
            if (r3 == 0) goto L14
            int r2 = r2 + 1
            if (r2 >= 0) goto L14
            kotlin.collections.f0.a0()
            goto L14
        L37:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L3a:
            return r2
    }

    public final void put(@org.jetbrains.annotations.NotNull okhttp3.internal.connection.RealConnection r4) {
            r3 = this;
            java.lang.String r0 = "connection"
            kotlin.jvm.internal.g0.p(r4, r0)
            boolean r0 = okhttp3.internal._UtilJvmKt.assertionsEnabled
            if (r0 == 0) goto L37
            boolean r0 = java.lang.Thread.holdsLock(r4)
            if (r0 == 0) goto L10
            goto L37
        L10:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Thread "
            r1.append(r2)
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            java.lang.String r2 = r2.getName()
            r1.append(r2)
            java.lang.String r2 = " MUST hold lock on "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        L37:
            java.util.concurrent.ConcurrentLinkedQueue<okhttp3.internal.connection.RealConnection> r0 = r3.connections
            r0.add(r4)
            r3.scheduleCloser()
            return
    }

    public final void scheduleCloser() {
            r6 = this;
            okhttp3.internal.concurrent.TaskQueue r0 = r6.cleanupQueue
            okhttp3.internal.connection.RealConnectionPool$cleanupTask$1 r1 = r6.cleanupTask
            r4 = 2
            r5 = 0
            r2 = 0
            okhttp3.internal.concurrent.TaskQueue.schedule$default(r0, r1, r2, r4, r5)
            return
    }
}
