package okhttp3.internal.connection;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nRealCall.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealCall.kt\nokhttp3/internal/connection/RealCall\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Lockable.kt\nokhttp3/internal/concurrent/LockableKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,612:1\n1#2:613\n63#3:614\n63#3:615\n63#3:616\n55#3,4:617\n63#3:621\n63#3:622\n49#3,4:623\n49#3,4:627\n63#3:631\n55#3,4:632\n63#3:643\n63#3:644\n360#4,7:636\n*S KotlinDebug\n*F\n+ 1 RealCall.kt\nokhttp3/internal/connection/RealCall\n*L\n257#1:614\n292#1:615\n303#1:616\n313#1:617,4\n340#1:621\n373#1:622\n401#1:623,4\n405#1:627,4\n407#1:631\n438#1:632,4\n479#1:643\n495#1:644\n441#1:636,7\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class RealCall implements okhttp3.Call, java.lang.Cloneable, okhttp3.internal.concurrent.Lockable {

    @org.jetbrains.annotations.Nullable
    private java.lang.Object callStackTrace;
    private volatile boolean canceled;

    @org.jetbrains.annotations.NotNull
    private final okhttp3.OkHttpClient client;

    @org.jetbrains.annotations.Nullable
    private okhttp3.internal.connection.RealConnection connection;

    @org.jetbrains.annotations.NotNull
    private final okhttp3.internal.connection.RealConnectionPool connectionPool;

    @org.jetbrains.annotations.NotNull
    private final okhttp3.EventListener eventListener;

    @org.jetbrains.annotations.Nullable
    private volatile okhttp3.internal.connection.Exchange exchange;

    @org.jetbrains.annotations.Nullable
    private okhttp3.internal.connection.ExchangeFinder exchangeFinder;

    @org.jetbrains.annotations.NotNull
    private final java.util.concurrent.atomic.AtomicBoolean executed;
    private boolean expectMoreExchanges;
    private final boolean forWebSocket;

    @org.jetbrains.annotations.Nullable
    private okhttp3.internal.connection.Exchange interceptorScopedExchange;

    @org.jetbrains.annotations.NotNull
    private final okhttp3.Request originalRequest;

    @org.jetbrains.annotations.NotNull
    private final java.util.concurrent.CopyOnWriteArrayList<okhttp3.internal.connection.RoutePlanner.Plan> plansToCancel;
    private boolean requestBodyOpen;
    private boolean responseBodyOpen;
    private boolean socketSinkOpen;
    private boolean socketSourceOpen;

    @org.jetbrains.annotations.NotNull
    private final java.util.concurrent.atomic.AtomicReference<okhttp3.internal.Tags> tags;

    @org.jetbrains.annotations.NotNull
    private final okhttp3.internal.connection.RealCall$timeout$1 timeout;
    private boolean timeoutEarlyExit;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nRealCall.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealCall.kt\nokhttp3/internal/connection/RealCall$AsyncCall\n+ 2 -UtilJvm.kt\nokhttp3/internal/_UtilJvmKt\n*L\n1#1,612:1\n227#2,9:613\n*S KotlinDebug\n*F\n+ 1 RealCall.kt\nokhttp3/internal/connection/RealCall$AsyncCall\n*L\n570#1:613,9\n*E\n"})
    public final class AsyncCall implements java.lang.Runnable {

        @org.jetbrains.annotations.NotNull
        private volatile java.util.concurrent.atomic.AtomicInteger callsPerHost;

        @org.jetbrains.annotations.NotNull
        private final okhttp3.Callback responseCallback;
        final /* synthetic */ okhttp3.internal.connection.RealCall this$0;

        public AsyncCall(@org.jetbrains.annotations.NotNull okhttp3.internal.connection.RealCall r2, okhttp3.Callback r3) {
                r1 = this;
                java.lang.String r0 = "responseCallback"
                kotlin.jvm.internal.g0.p(r3, r0)
                r1.this$0 = r2
                r1.<init>()
                r1.responseCallback = r3
                java.util.concurrent.atomic.AtomicInteger r2 = new java.util.concurrent.atomic.AtomicInteger
                r3 = 0
                r2.<init>(r3)
                r1.callsPerHost = r2
                return
        }

        public static /* synthetic */ void failRejected$okhttp$default(okhttp3.internal.connection.RealCall.AsyncCall r0, java.util.concurrent.RejectedExecutionException r1, int r2, java.lang.Object r3) {
                r2 = r2 & 1
                if (r2 == 0) goto L5
                r1 = 0
            L5:
                r0.failRejected$okhttp(r1)
                return
        }

        public final void executeOn(@org.jetbrains.annotations.NotNull java.util.concurrent.ExecutorService r2) {
                r1 = this;
                java.lang.String r0 = "executorService"
                kotlin.jvm.internal.g0.p(r2, r0)
                okhttp3.internal.connection.RealCall r0 = r1.this$0
                okhttp3.OkHttpClient r0 = r0.getClient()
                okhttp3.Dispatcher r0 = r0.dispatcher()
                okhttp3.internal._UtilJvmKt.assertLockNotHeld(r0)
                r2.execute(r1)     // Catch: java.lang.Throwable -> L16 java.util.concurrent.RejectedExecutionException -> L18
                return
            L16:
                r2 = move-exception
                goto L2a
            L18:
                r2 = move-exception
                r1.failRejected$okhttp(r2)     // Catch: java.lang.Throwable -> L16
                okhttp3.internal.connection.RealCall r2 = r1.this$0
                okhttp3.OkHttpClient r2 = r2.getClient()
                okhttp3.Dispatcher r2 = r2.dispatcher()
                r2.finished$okhttp(r1)
                return
            L2a:
                okhttp3.internal.connection.RealCall r0 = r1.this$0
                okhttp3.OkHttpClient r0 = r0.getClient()
                okhttp3.Dispatcher r0 = r0.dispatcher()
                r0.finished$okhttp(r1)
                throw r2
        }

        public final void failRejected$okhttp(@org.jetbrains.annotations.Nullable java.util.concurrent.RejectedExecutionException r3) {
                r2 = this;
                java.io.InterruptedIOException r0 = new java.io.InterruptedIOException
                java.lang.String r1 = "executor rejected"
                r0.<init>(r1)
                r0.initCause(r3)
                okhttp3.internal.connection.RealCall r3 = r2.this$0
                r3.noMoreExchanges$okhttp(r0)
                okhttp3.Callback r3 = r2.responseCallback
                okhttp3.internal.connection.RealCall r1 = r2.this$0
                r3.onFailure(r1, r0)
                return
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.internal.connection.RealCall getCall() {
                r1 = this;
                okhttp3.internal.connection.RealCall r0 = r1.this$0
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final java.util.concurrent.atomic.AtomicInteger getCallsPerHost() {
                r1 = this;
                java.util.concurrent.atomic.AtomicInteger r0 = r1.callsPerHost
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final java.lang.String getHost() {
                r1 = this;
                okhttp3.internal.connection.RealCall r0 = r1.this$0
                okhttp3.Request r0 = r0.getOriginalRequest()
                okhttp3.HttpUrl r0 = r0.url()
                java.lang.String r0 = r0.host()
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.Request getRequest() {
                r1 = this;
                okhttp3.internal.connection.RealCall r0 = r1.this$0
                okhttp3.Request r0 = r0.getOriginalRequest()
                return r0
        }

        public final void reuseCallsPerHostFrom(@org.jetbrains.annotations.NotNull okhttp3.internal.connection.RealCall.AsyncCall r2) {
                r1 = this;
                java.lang.String r0 = "other"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.util.concurrent.atomic.AtomicInteger r2 = r2.callsPerHost
                r1.callsPerHost = r2
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r7 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "OkHttp "
                r0.append(r1)
                okhttp3.internal.connection.RealCall r1 = r7.this$0
                java.lang.String r1 = r1.redactedUrl$okhttp()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                okhttp3.internal.connection.RealCall r1 = r7.this$0
                java.lang.Thread r2 = java.lang.Thread.currentThread()
                java.lang.String r3 = r2.getName()
                r2.setName(r0)
                okhttp3.internal.connection.RealCall$timeout$1 r0 = okhttp3.internal.connection.RealCall.access$getTimeout$p(r1)     // Catch: java.lang.Throwable -> L43
                r0.enter()     // Catch: java.lang.Throwable -> L43
                r0 = 0
                okhttp3.Response r0 = r1.getResponseWithInterceptorChain$okhttp()     // Catch: java.lang.Throwable -> L4a java.io.IOException -> L84
                r4 = 1
                okhttp3.Callback r5 = r7.responseCallback     // Catch: java.lang.Throwable -> L46 java.io.IOException -> L48
                r5.onResponse(r1, r0)     // Catch: java.lang.Throwable -> L46 java.io.IOException -> L48
                okhttp3.OkHttpClient r0 = r1.getClient()     // Catch: java.lang.Throwable -> L43
            L3a:
                okhttp3.Dispatcher r0 = r0.dispatcher()     // Catch: java.lang.Throwable -> L43
                r0.finished$okhttp(r7)     // Catch: java.lang.Throwable -> L43
                goto Lb3
            L43:
                r0 = move-exception
                goto Lc3
            L46:
                r0 = move-exception
                goto L4d
            L48:
                r0 = move-exception
                goto L87
            L4a:
                r4 = move-exception
                r0 = r4
                r4 = 0
            L4d:
                r1.cancel()     // Catch: java.lang.Throwable -> L71
                if (r4 != 0) goto L73
                java.io.IOException r4 = new java.io.IOException     // Catch: java.lang.Throwable -> L71
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L71
                r5.<init>()     // Catch: java.lang.Throwable -> L71
                java.lang.String r6 = "canceled due to "
                r5.append(r6)     // Catch: java.lang.Throwable -> L71
                r5.append(r0)     // Catch: java.lang.Throwable -> L71
                java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L71
                r4.<init>(r5)     // Catch: java.lang.Throwable -> L71
                r4.initCause(r0)     // Catch: java.lang.Throwable -> L71
                okhttp3.Callback r5 = r7.responseCallback     // Catch: java.lang.Throwable -> L71
                r5.onFailure(r1, r4)     // Catch: java.lang.Throwable -> L71
                goto L73
            L71:
                r0 = move-exception
                goto Lb7
            L73:
                boolean r4 = r0 instanceof java.lang.InterruptedException     // Catch: java.lang.Throwable -> L71
                if (r4 == 0) goto L83
                java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L71
                r0.interrupt()     // Catch: java.lang.Throwable -> L71
                okhttp3.OkHttpClient r0 = r1.getClient()     // Catch: java.lang.Throwable -> L43
                goto L3a
            L83:
                throw r0     // Catch: java.lang.Throwable -> L71
            L84:
                r4 = move-exception
                r0 = r4
                r4 = 0
            L87:
                if (r4 == 0) goto La9
                okhttp3.internal.platform.Platform$Companion r4 = okhttp3.internal.platform.Platform.Companion     // Catch: java.lang.Throwable -> L71
                okhttp3.internal.platform.Platform r4 = r4.get()     // Catch: java.lang.Throwable -> L71
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L71
                r5.<init>()     // Catch: java.lang.Throwable -> L71
                java.lang.String r6 = "Callback failure for "
                r5.append(r6)     // Catch: java.lang.Throwable -> L71
                java.lang.String r6 = okhttp3.internal.connection.RealCall.access$toLoggableString(r1)     // Catch: java.lang.Throwable -> L71
                r5.append(r6)     // Catch: java.lang.Throwable -> L71
                java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L71
                r6 = 4
                r4.log(r5, r6, r0)     // Catch: java.lang.Throwable -> L71
                goto Lae
            La9:
                okhttp3.Callback r4 = r7.responseCallback     // Catch: java.lang.Throwable -> L71
                r4.onFailure(r1, r0)     // Catch: java.lang.Throwable -> L71
            Lae:
                okhttp3.OkHttpClient r0 = r1.getClient()     // Catch: java.lang.Throwable -> L43
                goto L3a
            Lb3:
                r2.setName(r3)
                return
            Lb7:
                okhttp3.OkHttpClient r1 = r1.getClient()     // Catch: java.lang.Throwable -> L43
                okhttp3.Dispatcher r1 = r1.dispatcher()     // Catch: java.lang.Throwable -> L43
                r1.finished$okhttp(r7)     // Catch: java.lang.Throwable -> L43
                throw r0     // Catch: java.lang.Throwable -> L43
            Lc3:
                r2.setName(r3)
                throw r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class CallReference extends java.lang.ref.WeakReference<okhttp3.internal.connection.RealCall> {

        @org.jetbrains.annotations.Nullable
        private final java.lang.Object callStackTrace;

        public CallReference(@org.jetbrains.annotations.NotNull okhttp3.internal.connection.RealCall r2, @org.jetbrains.annotations.Nullable java.lang.Object r3) {
                r1 = this;
                java.lang.String r0 = "referent"
                kotlin.jvm.internal.g0.p(r2, r0)
                r1.<init>(r2)
                r1.callStackTrace = r3
                return
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.Object getCallStackTrace() {
                r1 = this;
                java.lang.Object r0 = r1.callStackTrace
                return r0
        }
    }

    public RealCall(@org.jetbrains.annotations.NotNull okhttp3.OkHttpClient r3, @org.jetbrains.annotations.NotNull okhttp3.Request r4, boolean r5) {
            r2 = this;
            java.lang.String r0 = "client"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "originalRequest"
            kotlin.jvm.internal.g0.p(r4, r0)
            r2.<init>()
            r2.client = r3
            r2.originalRequest = r4
            r2.forWebSocket = r5
            okhttp3.ConnectionPool r5 = r3.connectionPool()
            okhttp3.internal.connection.RealConnectionPool r5 = r5.getDelegate$okhttp()
            r2.connectionPool = r5
            okhttp3.EventListener$Factory r5 = r3.eventListenerFactory()
            okhttp3.EventListener r5 = r5.create(r2)
            r2.eventListener = r5
            okhttp3.internal.connection.RealCall$timeout$1 r5 = new okhttp3.internal.connection.RealCall$timeout$1
            r5.<init>(r2)
            int r3 = r3.callTimeoutMillis()
            long r0 = (long) r3
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS
            r5.timeout(r0, r3)
            r2.timeout = r5
            java.util.concurrent.atomic.AtomicBoolean r3 = new java.util.concurrent.atomic.AtomicBoolean
            r3.<init>()
            r2.executed = r3
            r3 = 1
            r2.expectMoreExchanges = r3
            java.util.concurrent.CopyOnWriteArrayList r3 = new java.util.concurrent.CopyOnWriteArrayList
            r3.<init>()
            r2.plansToCancel = r3
            java.util.concurrent.atomic.AtomicReference r3 = new java.util.concurrent.atomic.AtomicReference
            okhttp3.internal.Tags r4 = r4.getTags$okhttp()
            r3.<init>(r4)
            r2.tags = r3
            return
    }

    public static final /* synthetic */ okhttp3.internal.connection.RealCall$timeout$1 access$getTimeout$p(okhttp3.internal.connection.RealCall r0) {
            okhttp3.internal.connection.RealCall$timeout$1 r0 = r0.timeout
            return r0
    }

    public static final /* synthetic */ java.lang.String access$toLoggableString(okhttp3.internal.connection.RealCall r0) {
            java.lang.String r0 = r0.toLoggableString()
            return r0
    }

    private final java.io.IOException callDone(java.io.IOException r4) {
            r3 = this;
            boolean r0 = okhttp3.internal._UtilJvmKt.assertionsEnabled
            if (r0 == 0) goto L32
            boolean r1 = java.lang.Thread.holdsLock(r3)
            if (r1 != 0) goto Lb
            goto L32
        Lb:
            java.lang.AssertionError r4 = new java.lang.AssertionError
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Thread "
            r0.append(r1)
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            java.lang.String r1 = " MUST NOT hold lock on "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            r4.<init>(r0)
            throw r4
        L32:
            okhttp3.internal.connection.RealConnection r1 = r3.connection
            if (r1 == 0) goto L99
            if (r0 == 0) goto L66
            boolean r0 = java.lang.Thread.holdsLock(r1)
            if (r0 != 0) goto L3f
            goto L66
        L3f:
            java.lang.AssertionError r4 = new java.lang.AssertionError
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Thread "
            r0.append(r2)
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            java.lang.String r2 = r2.getName()
            r0.append(r2)
            java.lang.String r2 = " MUST NOT hold lock on "
            r0.append(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r4.<init>(r0)
            throw r4
        L66:
            monitor-enter(r1)
            java.net.Socket r0 = r3.releaseConnectionNoEvents$okhttp()     // Catch: java.lang.Throwable -> L96
            monitor-exit(r1)
            okhttp3.internal.connection.RealConnection r2 = r3.connection
            if (r2 != 0) goto L8b
            if (r0 == 0) goto L75
            okhttp3.internal._UtilJvmKt.closeQuietly(r0)
        L75:
            okhttp3.EventListener r2 = r3.eventListener
            r2.connectionReleased(r3, r1)
            okhttp3.internal.connection.ConnectionListener r2 = r1.getConnectionListener$okhttp()
            r2.connectionReleased(r1, r3)
            if (r0 == 0) goto L99
            okhttp3.internal.connection.ConnectionListener r0 = r1.getConnectionListener$okhttp()
            r0.connectionClosed(r1)
            goto L99
        L8b:
            if (r0 != 0) goto L8e
            goto L99
        L8e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "Check failed."
            r4.<init>(r0)
            throw r4
        L96:
            r4 = move-exception
            monitor-exit(r1)
            throw r4
        L99:
            java.io.IOException r0 = r3.timeoutExit(r4)
            if (r4 == 0) goto La8
            okhttp3.EventListener r4 = r3.eventListener
            kotlin.jvm.internal.g0.m(r0)
            r4.callFailed(r3, r0)
            return r0
        La8:
            okhttp3.EventListener r4 = r3.eventListener
            r4.callEnd(r3)
            return r0
    }

    private final void callStart() {
            r2 = this;
            okhttp3.internal.platform.Platform$Companion r0 = okhttp3.internal.platform.Platform.Companion
            okhttp3.internal.platform.Platform r0 = r0.get()
            java.lang.String r1 = "response.body().close()"
            java.lang.Object r0 = r0.getStackTraceForCloseable(r1)
            r2.callStackTrace = r0
            okhttp3.EventListener r0 = r2.eventListener
            r0.callStart(r2)
            return
    }

    public static /* synthetic */ java.io.IOException messageDone$okhttp$default(okhttp3.internal.connection.RealCall r1, okhttp3.internal.connection.Exchange r2, boolean r3, boolean r4, boolean r5, boolean r6, java.io.IOException r7, int r8, java.lang.Object r9) {
            r9 = r8 & 2
            r0 = 0
            if (r9 == 0) goto L6
            r3 = 0
        L6:
            r9 = r8 & 4
            if (r9 == 0) goto Lb
            r4 = 0
        Lb:
            r9 = r8 & 8
            if (r9 == 0) goto L10
            r5 = 0
        L10:
            r8 = r8 & 16
            if (r8 == 0) goto L15
            r6 = 0
        L15:
            java.io.IOException r1 = r1.messageDone$okhttp(r2, r3, r4, r5, r6, r7)
            return r1
    }

    private final java.io.IOException timeoutExit(java.io.IOException r3) {
            r2 = this;
            boolean r0 = r2.timeoutEarlyExit
            if (r0 == 0) goto L5
            goto Ld
        L5:
            okhttp3.internal.connection.RealCall$timeout$1 r0 = r2.timeout
            boolean r0 = r0.exit()
            if (r0 != 0) goto Le
        Ld:
            return r3
        Le:
            java.io.InterruptedIOException r0 = new java.io.InterruptedIOException
            java.lang.String r1 = "timeout"
            r0.<init>(r1)
            if (r3 == 0) goto L1a
            r0.initCause(r3)
        L1a:
            return r0
    }

    private final java.lang.String toLoggableString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            boolean r1 = r2.isCanceled()
            if (r1 == 0) goto Le
            java.lang.String r1 = "canceled "
            goto L10
        Le:
            java.lang.String r1 = ""
        L10:
            r0.append(r1)
            boolean r1 = r2.forWebSocket
            if (r1 == 0) goto L1a
            java.lang.String r1 = "web socket"
            goto L1c
        L1a:
            java.lang.String r1 = "call"
        L1c:
            r0.append(r1)
            java.lang.String r1 = " to "
            r0.append(r1)
            java.lang.String r1 = r2.redactedUrl$okhttp()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public final void acquireConnectionNoEvents(@org.jetbrains.annotations.NotNull okhttp3.internal.connection.RealConnection r4) {
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
            okhttp3.internal.connection.RealConnection r0 = r3.connection
            if (r0 != 0) goto L4c
            r3.connection = r4
            java.util.List r4 = r4.getCalls()
            okhttp3.internal.connection.RealCall$CallReference r0 = new okhttp3.internal.connection.RealCall$CallReference
            java.lang.Object r1 = r3.callStackTrace
            r0.<init>(r3, r1)
            r4.add(r0)
            return
        L4c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "Check failed."
            r4.<init>(r0)
            throw r4
    }

    public void cancel() {
            r2 = this;
            boolean r0 = r2.canceled
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r2.canceled = r0
            okhttp3.internal.connection.Exchange r0 = r2.exchange
            if (r0 == 0) goto Lf
            r0.cancel()
        Lf:
            java.util.concurrent.CopyOnWriteArrayList<okhttp3.internal.connection.RoutePlanner$Plan> r0 = r2.plansToCancel
            java.util.Iterator r0 = r0.iterator()
            java.lang.String r1 = "iterator(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
        L1a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2a
            java.lang.Object r1 = r0.next()
            okhttp3.internal.connection.RoutePlanner$Plan r1 = (okhttp3.internal.connection.RoutePlanner.Plan) r1
            r1.mo5cancel()
            goto L1a
        L2a:
            okhttp3.EventListener r0 = r2.eventListener
            r0.canceled(r2)
            return
    }

    public /* bridge */ /* synthetic */ java.lang.Object clone() {
            r1 = this;
            okhttp3.Call r0 = r1.m8clone()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: clone, reason: collision with other method in class */
    public okhttp3.Call m8clone() {
            r4 = this;
            okhttp3.internal.connection.RealCall r0 = new okhttp3.internal.connection.RealCall
            okhttp3.OkHttpClient r1 = r4.client
            okhttp3.Request r2 = r4.originalRequest
            boolean r3 = r4.forWebSocket
            r0.<init>(r1, r2, r3)
            return r0
    }

    public void enqueue(@org.jetbrains.annotations.NotNull okhttp3.Callback r4) {
            r3 = this;
            java.lang.String r0 = "responseCallback"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.executed
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            if (r0 == 0) goto L21
            r3.callStart()
            okhttp3.OkHttpClient r0 = r3.client
            okhttp3.Dispatcher r0 = r0.dispatcher()
            okhttp3.internal.connection.RealCall$AsyncCall r1 = new okhttp3.internal.connection.RealCall$AsyncCall
            r1.<init>(r3, r4)
            r0.enqueue$okhttp(r1)
            return
        L21:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "Already Executed"
            r4.<init>(r0)
            throw r4
    }

    public final void enterNetworkInterceptorExchange(@org.jetbrains.annotations.NotNull okhttp3.Request r15, boolean r16, @org.jetbrains.annotations.NotNull okhttp3.internal.http.RealInterceptorChain r17) {
            r14 = this;
            java.lang.String r0 = "request"
            kotlin.jvm.internal.g0.p(r15, r0)
            java.lang.String r0 = "chain"
            r1 = r17
            kotlin.jvm.internal.g0.p(r1, r0)
            okhttp3.internal.connection.Exchange r0 = r14.interceptorScopedExchange
            if (r0 != 0) goto L9c
            monitor-enter(r14)
            boolean r0 = r14.responseBodyOpen     // Catch: java.lang.Throwable -> L88
            if (r0 != 0) goto L92
            boolean r0 = r14.requestBodyOpen     // Catch: java.lang.Throwable -> L88
            if (r0 != 0) goto L8a
            boolean r0 = r14.socketSourceOpen     // Catch: java.lang.Throwable -> L88
            if (r0 != 0) goto L8a
            boolean r0 = r14.socketSinkOpen     // Catch: java.lang.Throwable -> L88
            if (r0 != 0) goto L8a
            kotlin.n1 r0 = kotlin.n1.a     // Catch: java.lang.Throwable -> L88
            monitor-exit(r14)
            if (r16 == 0) goto L87
            okhttp3.internal.connection.RealRoutePlanner r0 = new okhttp3.internal.connection.RealRoutePlanner
            okhttp3.OkHttpClient r2 = r14.client
            okhttp3.internal.concurrent.TaskRunner r2 = r2.getTaskRunner$okhttp()
            r1 = r2
            okhttp3.internal.connection.RealConnectionPool r2 = r14.connectionPool
            okhttp3.OkHttpClient r3 = r14.client
            int r3 = r3.readTimeoutMillis()
            okhttp3.OkHttpClient r4 = r14.client
            int r4 = r4.writeTimeoutMillis()
            int r5 = r17.getConnectTimeoutMillis$okhttp()
            int r6 = r17.getReadTimeoutMillis$okhttp()
            okhttp3.OkHttpClient r7 = r14.client
            int r7 = r7.pingIntervalMillis()
            okhttp3.OkHttpClient r8 = r14.client
            boolean r8 = r8.retryOnConnectionFailure()
            okhttp3.OkHttpClient r9 = r14.client
            boolean r9 = r9.fastFallback()
            okhttp3.OkHttpClient r10 = r14.client
            okhttp3.HttpUrl r11 = r15.url()
            okhttp3.Address r10 = r10.address(r11)
            okhttp3.OkHttpClient r11 = r14.client
            okhttp3.internal.connection.RouteDatabase r11 = r11.getRouteDatabase$okhttp()
            r12 = r14
            r13 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            okhttp3.OkHttpClient r1 = r14.client
            boolean r1 = r1.fastFallback()
            if (r1 == 0) goto L80
            okhttp3.internal.connection.FastFallbackExchangeFinder r1 = new okhttp3.internal.connection.FastFallbackExchangeFinder
            okhttp3.OkHttpClient r2 = r14.client
            okhttp3.internal.concurrent.TaskRunner r2 = r2.getTaskRunner$okhttp()
            r1.<init>(r0, r2)
            goto L85
        L80:
            okhttp3.internal.connection.SequentialExchangeFinder r1 = new okhttp3.internal.connection.SequentialExchangeFinder
            r1.<init>(r0)
        L85:
            r14.exchangeFinder = r1
        L87:
            return
        L88:
            r0 = move-exception
            goto L9a
        L8a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L88
            java.lang.String r1 = "Check failed."
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L88
            throw r0     // Catch: java.lang.Throwable -> L88
        L92:
            java.lang.String r0 = "cannot make a new request because the previous response is still open: please call response.close()"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L88
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L88
            throw r1     // Catch: java.lang.Throwable -> L88
        L9a:
            monitor-exit(r14)
            throw r0
        L9c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Check failed."
            r0.<init>(r1)
            throw r0
    }

    @org.jetbrains.annotations.NotNull
    public okhttp3.Response execute() {
            r3 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.executed
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            if (r0 == 0) goto L34
            okhttp3.internal.connection.RealCall$timeout$1 r0 = r3.timeout
            r0.enter()
            r3.callStart()
            okhttp3.OkHttpClient r0 = r3.client     // Catch: java.lang.Throwable -> L29
            okhttp3.Dispatcher r0 = r0.dispatcher()     // Catch: java.lang.Throwable -> L29
            r0.executed$okhttp(r3)     // Catch: java.lang.Throwable -> L29
            okhttp3.Response r0 = r3.getResponseWithInterceptorChain$okhttp()     // Catch: java.lang.Throwable -> L29
            okhttp3.OkHttpClient r1 = r3.client
            okhttp3.Dispatcher r1 = r1.dispatcher()
            r1.finished$okhttp(r3)
            return r0
        L29:
            r0 = move-exception
            okhttp3.OkHttpClient r1 = r3.client
            okhttp3.Dispatcher r1 = r1.dispatcher()
            r1.finished$okhttp(r3)
            throw r0
        L34:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Already Executed"
            r0.<init>(r1)
            throw r0
    }

    public final void exitNetworkInterceptorExchange$okhttp(boolean r2) {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.expectMoreExchanges     // Catch: java.lang.Throwable -> L15
            if (r0 == 0) goto L17
            kotlin.n1 r0 = kotlin.n1.a     // Catch: java.lang.Throwable -> L15
            monitor-exit(r1)
            if (r2 == 0) goto L11
            okhttp3.internal.connection.Exchange r2 = r1.exchange
            if (r2 == 0) goto L11
            r2.detachWithViolence()
        L11:
            r2 = 0
            r1.interceptorScopedExchange = r2
            return
        L15:
            r2 = move-exception
            goto L1f
        L17:
            java.lang.String r2 = "released"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L15
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L15
            throw r0     // Catch: java.lang.Throwable -> L15
        L1f:
            monitor-exit(r1)
            throw r2
    }

    @org.jetbrains.annotations.NotNull
    public final okhttp3.OkHttpClient getClient() {
            r1 = this;
            okhttp3.OkHttpClient r0 = r1.client
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final okhttp3.internal.connection.RealConnection getConnection() {
            r1 = this;
            okhttp3.internal.connection.RealConnection r0 = r1.connection
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final okhttp3.EventListener getEventListener$okhttp() {
            r1 = this;
            okhttp3.EventListener r0 = r1.eventListener
            return r0
    }

    public final boolean getForWebSocket() {
            r1 = this;
            boolean r0 = r1.forWebSocket
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final okhttp3.internal.connection.Exchange getInterceptorScopedExchange$okhttp() {
            r1 = this;
            okhttp3.internal.connection.Exchange r0 = r1.interceptorScopedExchange
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final okhttp3.Request getOriginalRequest() {
            r1 = this;
            okhttp3.Request r0 = r1.originalRequest
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.concurrent.CopyOnWriteArrayList<okhttp3.internal.connection.RoutePlanner.Plan> getPlansToCancel$okhttp() {
            r1 = this;
            java.util.concurrent.CopyOnWriteArrayList<okhttp3.internal.connection.RoutePlanner$Plan> r0 = r1.plansToCancel
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final okhttp3.Response getResponseWithInterceptorChain$okhttp() throws java.io.IOException {
            r9 = this;
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            okhttp3.OkHttpClient r0 = r9.client
            java.util.List r0 = r0.interceptors()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            kotlin.collections.f0.s0(r2, r0)
            okhttp3.internal.http.RetryAndFollowUpInterceptor r0 = new okhttp3.internal.http.RetryAndFollowUpInterceptor
            okhttp3.OkHttpClient r1 = r9.client
            r0.<init>(r1)
            r2.add(r0)
            okhttp3.internal.http.BridgeInterceptor r0 = new okhttp3.internal.http.BridgeInterceptor
            okhttp3.OkHttpClient r1 = r9.client
            okhttp3.CookieJar r1 = r1.cookieJar()
            r0.<init>(r1)
            r2.add(r0)
            okhttp3.internal.cache.CacheInterceptor r0 = new okhttp3.internal.cache.CacheInterceptor
            okhttp3.OkHttpClient r1 = r9.client
            okhttp3.Cache r1 = r1.cache()
            r0.<init>(r1)
            r2.add(r0)
            okhttp3.internal.connection.ConnectInterceptor r0 = okhttp3.internal.connection.ConnectInterceptor.INSTANCE
            r2.add(r0)
            boolean r0 = r9.forWebSocket
            if (r0 != 0) goto L4a
            okhttp3.OkHttpClient r0 = r9.client
            java.util.List r0 = r0.networkInterceptors()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            kotlin.collections.f0.s0(r2, r0)
        L4a:
            okhttp3.internal.http.CallServerInterceptor r0 = okhttp3.internal.http.CallServerInterceptor.INSTANCE
            r2.add(r0)
            okhttp3.internal.http.RealInterceptorChain r0 = new okhttp3.internal.http.RealInterceptorChain
            okhttp3.Request r5 = r9.originalRequest
            okhttp3.OkHttpClient r1 = r9.client
            int r6 = r1.connectTimeoutMillis()
            okhttp3.OkHttpClient r1 = r9.client
            int r7 = r1.readTimeoutMillis()
            okhttp3.OkHttpClient r1 = r9.client
            int r8 = r1.writeTimeoutMillis()
            r3 = 0
            r4 = 0
            r1 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r2 = 0
            r3 = 0
            okhttp3.Request r4 = r1.originalRequest     // Catch: java.lang.Throwable -> L88 java.io.IOException -> L8a
            okhttp3.Response r0 = r0.proceed(r4)     // Catch: java.lang.Throwable -> L88 java.io.IOException -> L8a
            boolean r4 = r9.isCanceled()     // Catch: java.lang.Throwable -> L88 java.io.IOException -> L8a
            if (r4 != 0) goto L7d
            r9.noMoreExchanges$okhttp(r2)
            return r0
        L7d:
            okhttp3.internal._UtilCommonKt.closeQuietly(r0)     // Catch: java.lang.Throwable -> L88 java.io.IOException -> L8a
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L88 java.io.IOException -> L8a
            java.lang.String r4 = "Canceled"
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L88 java.io.IOException -> L8a
            throw r0     // Catch: java.lang.Throwable -> L88 java.io.IOException -> L8a
        L88:
            r0 = move-exception
            goto L96
        L8a:
            r0 = move-exception
            r3 = 1
            java.io.IOException r0 = r9.noMoreExchanges$okhttp(r0)     // Catch: java.lang.Throwable -> L88
            java.lang.String r4 = "null cannot be cast to non-null type kotlin.Throwable"
            kotlin.jvm.internal.g0.n(r0, r4)     // Catch: java.lang.Throwable -> L88
            throw r0     // Catch: java.lang.Throwable -> L88
        L96:
            if (r3 != 0) goto L9b
            r9.noMoreExchanges$okhttp(r2)
        L9b:
            throw r0
    }

    @org.jetbrains.annotations.NotNull
    public final okhttp3.internal.connection.Exchange initExchange$okhttp(@org.jetbrains.annotations.NotNull okhttp3.internal.http.RealInterceptorChain r4) {
            r3 = this;
            java.lang.String r0 = "chain"
            kotlin.jvm.internal.g0.p(r4, r0)
            monitor-enter(r3)
            boolean r0 = r3.expectMoreExchanges     // Catch: java.lang.Throwable -> L4e
            if (r0 == 0) goto L58
            boolean r0 = r3.responseBodyOpen     // Catch: java.lang.Throwable -> L4e
            if (r0 != 0) goto L50
            boolean r0 = r3.requestBodyOpen     // Catch: java.lang.Throwable -> L4e
            if (r0 != 0) goto L50
            boolean r0 = r3.socketSourceOpen     // Catch: java.lang.Throwable -> L4e
            if (r0 != 0) goto L50
            boolean r0 = r3.socketSinkOpen     // Catch: java.lang.Throwable -> L4e
            if (r0 != 0) goto L50
            kotlin.n1 r0 = kotlin.n1.a     // Catch: java.lang.Throwable -> L4e
            monitor-exit(r3)
            okhttp3.internal.connection.ExchangeFinder r0 = r3.exchangeFinder
            kotlin.jvm.internal.g0.m(r0)
            okhttp3.internal.connection.RealConnection r1 = r0.find()
            okhttp3.OkHttpClient r2 = r3.client
            okhttp3.internal.http.ExchangeCodec r4 = r1.newCodec$okhttp(r2, r4)
            okhttp3.internal.connection.Exchange r1 = new okhttp3.internal.connection.Exchange
            okhttp3.EventListener r2 = r3.eventListener
            r1.<init>(r3, r2, r0, r4)
            r3.interceptorScopedExchange = r1
            r3.exchange = r1
            monitor-enter(r3)
            r4 = 1
            r3.requestBodyOpen = r4     // Catch: java.lang.Throwable -> L4b
            r3.responseBodyOpen = r4     // Catch: java.lang.Throwable -> L4b
            monitor-exit(r3)
            boolean r4 = r3.canceled
            if (r4 != 0) goto L43
            return r1
        L43:
            java.io.IOException r4 = new java.io.IOException
            java.lang.String r0 = "Canceled"
            r4.<init>(r0)
            throw r4
        L4b:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        L4e:
            r4 = move-exception
            goto L60
        L50:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L4e
            java.lang.String r0 = "Check failed."
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L4e
            throw r4     // Catch: java.lang.Throwable -> L4e
        L58:
            java.lang.String r4 = "released"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L4e
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L4e
            throw r0     // Catch: java.lang.Throwable -> L4e
        L60:
            monitor-exit(r3)
            throw r4
    }

    public boolean isCanceled() {
            r1 = this;
            boolean r0 = r1.canceled
            return r0
    }

    public boolean isExecuted() {
            r1 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.executed
            boolean r0 = r0.get()
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.io.IOException messageDone$okhttp(@org.jetbrains.annotations.NotNull okhttp3.internal.connection.Exchange r3, boolean r4, boolean r5, boolean r6, boolean r7, @org.jetbrains.annotations.Nullable java.io.IOException r8) {
            r2 = this;
            java.lang.String r0 = "exchange"
            kotlin.jvm.internal.g0.p(r3, r0)
            okhttp3.internal.connection.Exchange r0 = r2.exchange
            boolean r3 = kotlin.jvm.internal.g0.g(r3, r0)
            if (r3 != 0) goto Lf
            goto L72
        Lf:
            monitor-enter(r2)
            r3 = 0
            if (r4 == 0) goto L1a
            boolean r0 = r2.requestBodyOpen     // Catch: java.lang.Throwable -> L18
            if (r0 != 0) goto L2c
            goto L1a
        L18:
            r3 = move-exception
            goto L73
        L1a:
            if (r5 == 0) goto L20
            boolean r0 = r2.responseBodyOpen     // Catch: java.lang.Throwable -> L18
            if (r0 != 0) goto L2c
        L20:
            if (r7 == 0) goto L26
            boolean r0 = r2.socketSinkOpen     // Catch: java.lang.Throwable -> L18
            if (r0 != 0) goto L2c
        L26:
            if (r6 == 0) goto L5b
            boolean r0 = r2.socketSourceOpen     // Catch: java.lang.Throwable -> L18
            if (r0 == 0) goto L5b
        L2c:
            if (r4 == 0) goto L30
            r2.requestBodyOpen = r3     // Catch: java.lang.Throwable -> L18
        L30:
            if (r5 == 0) goto L34
            r2.responseBodyOpen = r3     // Catch: java.lang.Throwable -> L18
        L34:
            if (r7 == 0) goto L38
            r2.socketSinkOpen = r3     // Catch: java.lang.Throwable -> L18
        L38:
            if (r6 == 0) goto L3c
            r2.socketSourceOpen = r3     // Catch: java.lang.Throwable -> L18
        L3c:
            boolean r4 = r2.requestBodyOpen     // Catch: java.lang.Throwable -> L18
            r5 = 1
            if (r4 != 0) goto L4f
            boolean r4 = r2.responseBodyOpen     // Catch: java.lang.Throwable -> L18
            if (r4 != 0) goto L4f
            boolean r4 = r2.socketSinkOpen     // Catch: java.lang.Throwable -> L18
            if (r4 != 0) goto L4f
            boolean r4 = r2.socketSourceOpen     // Catch: java.lang.Throwable -> L18
            if (r4 != 0) goto L4f
            r4 = 1
            goto L50
        L4f:
            r4 = 0
        L50:
            if (r4 == 0) goto L57
            boolean r6 = r2.expectMoreExchanges     // Catch: java.lang.Throwable -> L18
            if (r6 != 0) goto L57
            r3 = 1
        L57:
            r1 = r4
            r4 = r3
            r3 = r1
            goto L5c
        L5b:
            r4 = 0
        L5c:
            kotlin.n1 r5 = kotlin.n1.a     // Catch: java.lang.Throwable -> L18
            monitor-exit(r2)
            if (r3 == 0) goto L6b
            r3 = 0
            r2.exchange = r3
            okhttp3.internal.connection.RealConnection r3 = r2.connection
            if (r3 == 0) goto L6b
            r3.incrementSuccessCount$okhttp()
        L6b:
            if (r4 == 0) goto L72
            java.io.IOException r3 = r2.callDone(r8)
            return r3
        L72:
            return r8
        L73:
            monitor-exit(r2)
            throw r3
    }

    @org.jetbrains.annotations.Nullable
    public final java.io.IOException noMoreExchanges$okhttp(@org.jetbrains.annotations.Nullable java.io.IOException r3) {
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.expectMoreExchanges     // Catch: java.lang.Throwable -> L1a
            r1 = 0
            if (r0 == 0) goto L1c
            r2.expectMoreExchanges = r1     // Catch: java.lang.Throwable -> L1a
            boolean r0 = r2.requestBodyOpen     // Catch: java.lang.Throwable -> L1a
            if (r0 != 0) goto L1c
            boolean r0 = r2.responseBodyOpen     // Catch: java.lang.Throwable -> L1a
            if (r0 != 0) goto L1c
            boolean r0 = r2.socketSinkOpen     // Catch: java.lang.Throwable -> L1a
            if (r0 != 0) goto L1c
            boolean r0 = r2.socketSourceOpen     // Catch: java.lang.Throwable -> L1a
            if (r0 != 0) goto L1c
            r1 = 1
            goto L1c
        L1a:
            r3 = move-exception
            goto L26
        L1c:
            kotlin.n1 r0 = kotlin.n1.a     // Catch: java.lang.Throwable -> L1a
            monitor-exit(r2)
            if (r1 == 0) goto L25
            java.io.IOException r3 = r2.callDone(r3)
        L25:
            return r3
        L26:
            monitor-exit(r2)
            throw r3
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String redactedUrl$okhttp() {
            r1 = this;
            okhttp3.Request r0 = r1.originalRequest
            okhttp3.HttpUrl r0 = r0.url()
            java.lang.String r0 = r0.redact()
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.net.Socket releaseConnectionNoEvents$okhttp() {
            r6 = this;
            okhttp3.internal.connection.RealConnection r0 = r6.connection
            kotlin.jvm.internal.g0.m(r0)
            boolean r1 = okhttp3.internal._UtilJvmKt.assertionsEnabled
            if (r1 == 0) goto L37
            boolean r1 = java.lang.Thread.holdsLock(r0)
            if (r1 == 0) goto L10
            goto L37
        L10:
            java.lang.AssertionError r1 = new java.lang.AssertionError
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Thread "
            r2.append(r3)
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.String r3 = r3.getName()
            r2.append(r3)
            java.lang.String r3 = " MUST hold lock on "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L37:
            java.util.List r1 = r0.getCalls()
            java.util.Iterator r2 = r1.iterator()
            r3 = 0
        L40:
            boolean r4 = r2.hasNext()
            r5 = -1
            if (r4 == 0) goto L5b
            java.lang.Object r4 = r2.next()
            java.lang.ref.Reference r4 = (java.lang.ref.Reference) r4
            java.lang.Object r4 = r4.get()
            boolean r4 = kotlin.jvm.internal.g0.g(r4, r6)
            if (r4 == 0) goto L58
            goto L5c
        L58:
            int r3 = r3 + 1
            goto L40
        L5b:
            r3 = -1
        L5c:
            if (r3 == r5) goto L7f
            r1.remove(r3)
            r2 = 0
            r6.connection = r2
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L7e
            long r3 = java.lang.System.nanoTime()
            r0.setIdleAtNs(r3)
            okhttp3.internal.connection.RealConnectionPool r1 = r6.connectionPool
            boolean r1 = r1.connectionBecameIdle(r0)
            if (r1 == 0) goto L7e
            java.net.Socket r0 = r0.socket()
            return r0
        L7e:
            return r2
        L7f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Check failed."
            r0.<init>(r1)
            throw r0
    }

    @org.jetbrains.annotations.NotNull
    public okhttp3.Request request() {
            r1 = this;
            okhttp3.Request r0 = r1.originalRequest
            return r0
    }

    public final boolean retryAfterFailure() {
            r3 = this;
            okhttp3.internal.connection.Exchange r0 = r3.exchange
            if (r0 == 0) goto L25
            boolean r0 = r0.getHasFailure$okhttp()
            r1 = 1
            if (r0 != r1) goto L25
            okhttp3.internal.connection.ExchangeFinder r0 = r3.exchangeFinder
            kotlin.jvm.internal.g0.m(r0)
            okhttp3.internal.connection.RoutePlanner r0 = r0.getRoutePlanner()
            okhttp3.internal.connection.Exchange r2 = r3.exchange
            if (r2 == 0) goto L1d
            okhttp3.internal.connection.RealConnection r2 = r2.getConnection$okhttp()
            goto L1e
        L1d:
            r2 = 0
        L1e:
            boolean r0 = r0.hasNext(r2)
            if (r0 == 0) goto L25
            return r1
        L25:
            r0 = 0
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public <T> T tag(@org.jetbrains.annotations.NotNull java.lang.Class<? extends T> r2) {
            r1 = this;
            java.lang.String r0 = "type"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.reflect.d r2 = k3.a.i(r2)
            java.lang.Object r2 = r1.tag(r2)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public <T> T tag(@org.jetbrains.annotations.NotNull java.lang.Class<T> r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<? extends T> r3) {
            r1 = this;
            java.lang.String r0 = "type"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "computeIfAbsent"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.util.concurrent.atomic.AtomicReference<okhttp3.internal.Tags> r0 = r1.tags
            kotlin.reflect.d r2 = k3.a.i(r2)
            java.lang.Object r2 = okhttp3.internal.TagsKt.computeIfAbsent(r0, r2, r3)
            return r2
    }

    @org.jetbrains.annotations.Nullable
    public <T> T tag(@org.jetbrains.annotations.NotNull kotlin.reflect.d<T> r3) {
            r2 = this;
            java.lang.String r0 = "type"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.Class r0 = k3.a.e(r3)
            java.util.concurrent.atomic.AtomicReference<okhttp3.internal.Tags> r1 = r2.tags
            java.lang.Object r1 = r1.get()
            okhttp3.internal.Tags r1 = (okhttp3.internal.Tags) r1
            java.lang.Object r3 = r1.get(r3)
            java.lang.Object r3 = r0.cast(r3)
            return r3
    }

    @org.jetbrains.annotations.NotNull
    public <T> T tag(@org.jetbrains.annotations.NotNull kotlin.reflect.d<T> r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<? extends T> r3) {
            r1 = this;
            java.lang.String r0 = "type"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "computeIfAbsent"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.util.concurrent.atomic.AtomicReference<okhttp3.internal.Tags> r0 = r1.tags
            java.lang.Object r2 = okhttp3.internal.TagsKt.computeIfAbsent(r0, r2, r3)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public okio.Timeout timeout() {
            r1 = this;
            okhttp3.internal.connection.RealCall$timeout$1 r0 = r1.timeout
            return r0
    }

    public final void timeoutEarlyExit() {
            r2 = this;
            boolean r0 = r2.timeoutEarlyExit
            if (r0 != 0) goto Ld
            r0 = 1
            r2.timeoutEarlyExit = r0
            okhttp3.internal.connection.RealCall$timeout$1 r0 = r2.timeout
            r0.exit()
            return
        Ld:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Check failed."
            r0.<init>(r1)
            throw r0
    }

    public final void upgradeToSocket() {
            r2 = this;
            r2.timeoutEarlyExit()
            monitor-enter(r2)
            okhttp3.internal.connection.Exchange r0 = r2.exchange     // Catch: java.lang.Throwable -> L24
            if (r0 == 0) goto L3e
            boolean r0 = r2.socketSinkOpen     // Catch: java.lang.Throwable -> L24
            if (r0 != 0) goto L36
            boolean r0 = r2.socketSourceOpen     // Catch: java.lang.Throwable -> L24
            if (r0 != 0) goto L36
            boolean r0 = r2.requestBodyOpen     // Catch: java.lang.Throwable -> L24
            if (r0 != 0) goto L2e
            boolean r0 = r2.responseBodyOpen     // Catch: java.lang.Throwable -> L24
            if (r0 == 0) goto L26
            r0 = 0
            r2.responseBodyOpen = r0     // Catch: java.lang.Throwable -> L24
            r0 = 1
            r2.socketSinkOpen = r0     // Catch: java.lang.Throwable -> L24
            r2.socketSourceOpen = r0     // Catch: java.lang.Throwable -> L24
            kotlin.n1 r0 = kotlin.n1.a     // Catch: java.lang.Throwable -> L24
            monitor-exit(r2)
            return
        L24:
            r0 = move-exception
            goto L46
        L26:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L24
            java.lang.String r1 = "Check failed."
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L24
            throw r0     // Catch: java.lang.Throwable -> L24
        L2e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L24
            java.lang.String r1 = "Check failed."
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L24
            throw r0     // Catch: java.lang.Throwable -> L24
        L36:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L24
            java.lang.String r1 = "Check failed."
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L24
            throw r0     // Catch: java.lang.Throwable -> L24
        L3e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L24
            java.lang.String r1 = "Check failed."
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L24
            throw r0     // Catch: java.lang.Throwable -> L24
        L46:
            monitor-exit(r2)
            throw r0
    }
}
