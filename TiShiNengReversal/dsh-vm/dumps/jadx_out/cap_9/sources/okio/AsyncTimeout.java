package okio;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nAsyncTimeout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AsyncTimeout.kt\nokio/AsyncTimeout\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,504:1\n1#2:505\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class AsyncTimeout extends okio.Timeout {

    @org.jetbrains.annotations.NotNull
    private static final okio.AsyncTimeout.Companion Companion = null;
    private static final long IDLE_TIMEOUT_MILLIS = 0;
    private static final long IDLE_TIMEOUT_NANOS = 0;
    private static final int STATE_CANCELED = 3;
    private static final int STATE_IDLE = 0;
    private static final int STATE_IN_QUEUE = 1;
    private static final int STATE_TIMED_OUT = 2;
    private static final int TIMEOUT_WRITE_SIZE = 65536;

    @org.jetbrains.annotations.NotNull
    private static final java.util.concurrent.locks.Condition condition = null;

    @org.jetbrains.annotations.Nullable
    private static okio.AsyncTimeout idleSentinel;

    @org.jetbrains.annotations.NotNull
    private static final java.util.concurrent.locks.ReentrantLock lock = null;

    @org.jetbrains.annotations.NotNull
    private static final okio.PriorityQueue queue = null;

    @kotlin.jvm.JvmField
    public int index;
    private int state;
    private long timeoutAt;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class Companion {
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

        public static final /* synthetic */ void access$insertIntoQueue(okio.AsyncTimeout.Companion r0, okio.AsyncTimeout r1, long r2, boolean r4) {
                r0.insertIntoQueue(r1, r2, r4)
                return
        }

        private final void insertIntoQueue(okio.AsyncTimeout r6, long r7, boolean r9) {
                r5 = this;
                okio.AsyncTimeout r0 = r5.getIdleSentinel()
                if (r0 != 0) goto L16
                okio.AsyncTimeout r0 = new okio.AsyncTimeout
                r0.<init>()
                r5.setIdleSentinel(r0)
                okio.AsyncTimeout$Watchdog r0 = new okio.AsyncTimeout$Watchdog
                r0.<init>()
                r0.start()
            L16:
                long r0 = java.lang.System.nanoTime()
                r2 = 0
                int r4 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
                if (r4 == 0) goto L30
                if (r9 == 0) goto L30
                long r2 = r6.deadlineNanoTime()
                long r2 = r2 - r0
                long r7 = java.lang.Math.min(r7, r2)
                long r0 = r0 + r7
                okio.AsyncTimeout.access$setTimeoutAt$p(r6, r0)
                goto L40
            L30:
                if (r4 == 0) goto L37
                long r0 = r0 + r7
                okio.AsyncTimeout.access$setTimeoutAt$p(r6, r0)
                goto L40
            L37:
                if (r9 == 0) goto L54
                long r7 = r6.deadlineNanoTime()
                okio.AsyncTimeout.access$setTimeoutAt$p(r6, r7)
            L40:
                okio.PriorityQueue r7 = r5.getQueue()
                r7.add(r6)
                int r6 = r6.index
                r7 = 1
                if (r6 != r7) goto L53
                java.util.concurrent.locks.Condition r6 = r5.getCondition()
                r6.signal()
            L53:
                return
            L54:
                java.lang.AssertionError r6 = new java.lang.AssertionError
                r6.<init>()
                throw r6
        }

        @org.jetbrains.annotations.Nullable
        public final okio.AsyncTimeout awaitTimeout() throws java.lang.InterruptedException {
                r7 = this;
                okio.PriorityQueue r0 = r7.getQueue()
                okio.AsyncTimeout r0 = r0.first()
                r1 = 0
                if (r0 != 0) goto L39
                long r2 = java.lang.System.nanoTime()
                java.util.concurrent.locks.Condition r0 = r7.getCondition()
                long r4 = okio.AsyncTimeout.access$getIDLE_TIMEOUT_MILLIS$cp()
                java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MILLISECONDS
                r0.await(r4, r6)
                okio.PriorityQueue r0 = r7.getQueue()
                okio.AsyncTimeout r0 = r0.first()
                if (r0 != 0) goto L38
                long r4 = java.lang.System.nanoTime()
                long r4 = r4 - r2
                long r2 = okio.AsyncTimeout.access$getIDLE_TIMEOUT_NANOS$cp()
                int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
                if (r0 < 0) goto L38
                okio.AsyncTimeout r0 = r7.getIdleSentinel()
                return r0
            L38:
                return r1
            L39:
                long r2 = java.lang.System.nanoTime()
                long r2 = r0.remainingNanos$okio(r2)
                r4 = 0
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 <= 0) goto L51
                java.util.concurrent.locks.Condition r0 = r7.getCondition()
                java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.NANOSECONDS
                r0.await(r2, r4)
                return r1
            L51:
                okio.PriorityQueue r1 = r7.getQueue()
                r1.remove(r0)
                r1 = 2
                okio.AsyncTimeout.access$setState$p(r0, r1)
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final java.util.concurrent.locks.Condition getCondition() {
                r1 = this;
                java.util.concurrent.locks.Condition r0 = okio.AsyncTimeout.access$getCondition$cp()
                return r0
        }

        @org.jetbrains.annotations.Nullable
        public final okio.AsyncTimeout getIdleSentinel() {
                r1 = this;
                okio.AsyncTimeout r0 = okio.AsyncTimeout.access$getIdleSentinel$cp()
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final java.util.concurrent.locks.ReentrantLock getLock() {
                r1 = this;
                java.util.concurrent.locks.ReentrantLock r0 = okio.AsyncTimeout.access$getLock$cp()
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final okio.PriorityQueue getQueue() {
                r1 = this;
                okio.PriorityQueue r0 = okio.AsyncTimeout.access$getQueue$cp()
                return r0
        }

        public final void setIdleSentinel(@org.jetbrains.annotations.Nullable okio.AsyncTimeout r1) {
                r0 = this;
                okio.AsyncTimeout.access$setIdleSentinel$cp(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class Watchdog extends java.lang.Thread {
        public Watchdog() {
                r1 = this;
                java.lang.String r0 = "Okio Watchdog"
                r1.<init>(r0)
                r0 = 1
                r1.setDaemon(r0)
                return
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
                r3 = this;
            L0:
                okio.AsyncTimeout$Companion r0 = okio.AsyncTimeout.access$getCompanion$p()     // Catch: java.lang.InterruptedException -> L0
                java.util.concurrent.locks.ReentrantLock r0 = r0.getLock()     // Catch: java.lang.InterruptedException -> L0
                r0.lock()     // Catch: java.lang.InterruptedException -> L0
                okio.AsyncTimeout$Companion r1 = okio.AsyncTimeout.access$getCompanion$p()     // Catch: java.lang.Throwable -> L29
                okio.AsyncTimeout r1 = r1.awaitTimeout()     // Catch: java.lang.Throwable -> L29
                okio.AsyncTimeout$Companion r2 = okio.AsyncTimeout.access$getCompanion$p()     // Catch: java.lang.Throwable -> L29
                okio.AsyncTimeout r2 = r2.getIdleSentinel()     // Catch: java.lang.Throwable -> L29
                if (r1 != r2) goto L2b
                okio.AsyncTimeout$Companion r1 = okio.AsyncTimeout.access$getCompanion$p()     // Catch: java.lang.Throwable -> L29
                r2 = 0
                r1.setIdleSentinel(r2)     // Catch: java.lang.Throwable -> L29
                r0.unlock()     // Catch: java.lang.InterruptedException -> L0
                return
            L29:
                r1 = move-exception
                goto L36
            L2b:
                kotlin.n1 r2 = kotlin.n1.a     // Catch: java.lang.Throwable -> L29
                r0.unlock()     // Catch: java.lang.InterruptedException -> L0
                if (r1 == 0) goto L0
                r1.timedOut()     // Catch: java.lang.InterruptedException -> L0
                goto L0
            L36:
                r0.unlock()     // Catch: java.lang.InterruptedException -> L0
                throw r1     // Catch: java.lang.InterruptedException -> L0
        }
    }

    static {
            okio.AsyncTimeout$Companion r0 = new okio.AsyncTimeout$Companion
            r1 = 0
            r0.<init>(r1)
            okio.AsyncTimeout.Companion = r0
            okio.PriorityQueue r0 = new okio.PriorityQueue
            r0.<init>()
            okio.AsyncTimeout.queue = r0
            java.util.concurrent.locks.ReentrantLock r0 = new java.util.concurrent.locks.ReentrantLock
            r0.<init>()
            okio.AsyncTimeout.lock = r0
            java.util.concurrent.locks.Condition r0 = r0.newCondition()
            java.lang.String r1 = "newCondition(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            okio.AsyncTimeout.condition = r0
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS
            r1 = 60
            long r0 = r0.toMillis(r1)
            okio.AsyncTimeout.IDLE_TIMEOUT_MILLIS = r0
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r0 = r2.toNanos(r0)
            okio.AsyncTimeout.IDLE_TIMEOUT_NANOS = r0
            return
    }

    public AsyncTimeout() {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.index = r0
            return
    }

    public static final /* synthetic */ okio.AsyncTimeout.Companion access$getCompanion$p() {
            okio.AsyncTimeout$Companion r0 = okio.AsyncTimeout.Companion
            return r0
    }

    public static final /* synthetic */ java.util.concurrent.locks.Condition access$getCondition$cp() {
            java.util.concurrent.locks.Condition r0 = okio.AsyncTimeout.condition
            return r0
    }

    public static final /* synthetic */ long access$getIDLE_TIMEOUT_MILLIS$cp() {
            long r0 = okio.AsyncTimeout.IDLE_TIMEOUT_MILLIS
            return r0
    }

    public static final /* synthetic */ long access$getIDLE_TIMEOUT_NANOS$cp() {
            long r0 = okio.AsyncTimeout.IDLE_TIMEOUT_NANOS
            return r0
    }

    public static final /* synthetic */ okio.AsyncTimeout access$getIdleSentinel$cp() {
            okio.AsyncTimeout r0 = okio.AsyncTimeout.idleSentinel
            return r0
    }

    public static final /* synthetic */ java.util.concurrent.locks.ReentrantLock access$getLock$cp() {
            java.util.concurrent.locks.ReentrantLock r0 = okio.AsyncTimeout.lock
            return r0
    }

    public static final /* synthetic */ okio.PriorityQueue access$getQueue$cp() {
            okio.PriorityQueue r0 = okio.AsyncTimeout.queue
            return r0
    }

    public static final /* synthetic */ void access$setIdleSentinel$cp(okio.AsyncTimeout r0) {
            okio.AsyncTimeout.idleSentinel = r0
            return
    }

    public static final /* synthetic */ void access$setState$p(okio.AsyncTimeout r0, int r1) {
            r0.state = r1
            return
    }

    public static final /* synthetic */ void access$setTimeoutAt$p(okio.AsyncTimeout r0, long r1) {
            r0.timeoutAt = r1
            return
    }

    @kotlin.PublishedApi
    @org.jetbrains.annotations.NotNull
    public final java.io.IOException access$newTimeoutException(@org.jetbrains.annotations.Nullable java.io.IOException r1) {
            r0 = this;
            java.io.IOException r1 = r0.newTimeoutException(r1)
            return r1
    }

    @Override // okio.Timeout
    public void cancel() {
            r3 = this;
            super.cancel()
            java.util.concurrent.locks.ReentrantLock r0 = okio.AsyncTimeout.lock
            r0.lock()
            int r1 = r3.state     // Catch: java.lang.Throwable -> L16
            r2 = 1
            if (r1 != r2) goto L18
            okio.PriorityQueue r1 = okio.AsyncTimeout.queue     // Catch: java.lang.Throwable -> L16
            r1.remove(r3)     // Catch: java.lang.Throwable -> L16
            r1 = 3
            r3.state = r1     // Catch: java.lang.Throwable -> L16
            goto L18
        L16:
            r1 = move-exception
            goto L1e
        L18:
            kotlin.n1 r1 = kotlin.n1.a     // Catch: java.lang.Throwable -> L16
            r0.unlock()
            return
        L1e:
            r0.unlock()
            throw r1
    }

    public final void enter() {
            r6 = this;
            long r0 = r6.timeoutNanos()
            boolean r2 = r6.hasDeadline()
            r3 = 0
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 != 0) goto L11
            if (r2 != 0) goto L11
            return
        L11:
            java.util.concurrent.locks.ReentrantLock r3 = okio.AsyncTimeout.lock
            r3.lock()
            int r4 = r6.state     // Catch: java.lang.Throwable -> L28
            if (r4 != 0) goto L2a
            r4 = 1
            r6.state = r4     // Catch: java.lang.Throwable -> L28
            okio.AsyncTimeout$Companion r4 = okio.AsyncTimeout.Companion     // Catch: java.lang.Throwable -> L28
            okio.AsyncTimeout.Companion.access$insertIntoQueue(r4, r6, r0, r2)     // Catch: java.lang.Throwable -> L28
            kotlin.n1 r0 = kotlin.n1.a     // Catch: java.lang.Throwable -> L28
            r3.unlock()
            return
        L28:
            r0 = move-exception
            goto L32
        L2a:
            java.lang.String r0 = "Unbalanced enter/exit"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L28
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L28
            throw r1     // Catch: java.lang.Throwable -> L28
        L32:
            r3.unlock()
            throw r0
    }

    public final boolean exit() {
            r5 = this;
            java.util.concurrent.locks.ReentrantLock r0 = okio.AsyncTimeout.lock
            r0.lock()
            int r1 = r5.state     // Catch: java.lang.Throwable -> L16
            r2 = 0
            r5.state = r2     // Catch: java.lang.Throwable -> L16
            r3 = 1
            if (r1 != r3) goto L18
            okio.PriorityQueue r1 = okio.AsyncTimeout.queue     // Catch: java.lang.Throwable -> L16
            r1.remove(r5)     // Catch: java.lang.Throwable -> L16
            r0.unlock()
            return r2
        L16:
            r1 = move-exception
            goto L20
        L18:
            r4 = 2
            if (r1 != r4) goto L1c
            r2 = 1
        L1c:
            r0.unlock()
            return r2
        L20:
            r0.unlock()
            throw r1
    }

    @org.jetbrains.annotations.NotNull
    protected java.io.IOException newTimeoutException(@org.jetbrains.annotations.Nullable java.io.IOException r3) {
            r2 = this;
            java.io.InterruptedIOException r0 = new java.io.InterruptedIOException
            java.lang.String r1 = "timeout"
            r0.<init>(r1)
            if (r3 == 0) goto Lc
            r0.initCause(r3)
        Lc:
            return r0
    }

    public final long remainingNanos$okio(long r3) {
            r2 = this;
            long r0 = r2.timeoutAt
            long r0 = r0 - r3
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final okio.Sink sink(@org.jetbrains.annotations.NotNull okio.Sink r2) {
            r1 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.g0.p(r2, r0)
            okio.AsyncTimeout$sink$1 r0 = new okio.AsyncTimeout$sink$1
            r0.<init>(r1, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final okio.Source source(@org.jetbrains.annotations.NotNull okio.Source r2) {
            r1 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.g0.p(r2, r0)
            okio.AsyncTimeout$source$1 r0 = new okio.AsyncTimeout$source$1
            r0.<init>(r1, r2)
            return r0
    }

    protected void timedOut() {
            r0 = this;
            return
    }

    public final <T> T withTimeout(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<? extends T> r3) {
            r2 = this;
            java.lang.String r0 = "block"
            kotlin.jvm.internal.g0.p(r3, r0)
            r2.enter()
            r0 = 1
            java.lang.Object r3 = r3.invoke()     // Catch: java.lang.Throwable -> L20 java.io.IOException -> L22
            kotlin.jvm.internal.d0.d(r0)
            boolean r1 = r2.exit()
            if (r1 != 0) goto L1a
            kotlin.jvm.internal.d0.c(r0)
            return r3
        L1a:
            r3 = 0
            java.io.IOException r3 = r2.access$newTimeoutException(r3)
            throw r3
        L20:
            r3 = move-exception
            goto L2f
        L22:
            r3 = move-exception
            boolean r1 = r2.exit()     // Catch: java.lang.Throwable -> L20
            if (r1 != 0) goto L2a
            goto L2e
        L2a:
            java.io.IOException r3 = r2.access$newTimeoutException(r3)     // Catch: java.lang.Throwable -> L20
        L2e:
            throw r3     // Catch: java.lang.Throwable -> L20
        L2f:
            kotlin.jvm.internal.d0.d(r0)
            r2.exit()
            kotlin.jvm.internal.d0.c(r0)
            throw r3
    }
}
