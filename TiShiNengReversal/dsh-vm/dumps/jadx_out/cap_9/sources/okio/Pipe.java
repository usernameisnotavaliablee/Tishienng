package okio;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nPipe.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Pipe.kt\nokio/Pipe\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Timeout.kt\nokio/Timeout\n*L\n1#1,262:1\n1#2:263\n302#3,26:264\n*S KotlinDebug\n*F\n+ 1 Pipe.kt\nokio/Pipe\n*L\n222#1:264,26\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class Pipe {

    @org.jetbrains.annotations.NotNull
    private final okio.Buffer buffer;
    private boolean canceled;

    @org.jetbrains.annotations.NotNull
    private final java.util.concurrent.locks.Condition condition;

    @org.jetbrains.annotations.Nullable
    private okio.Sink foldedSink;

    @org.jetbrains.annotations.NotNull
    private final java.util.concurrent.locks.ReentrantLock lock;
    private final long maxBufferSize;

    @org.jetbrains.annotations.NotNull
    private final okio.Sink sink;
    private boolean sinkClosed;

    @org.jetbrains.annotations.NotNull
    private final okio.Source source;
    private boolean sourceClosed;

    public Pipe(long r4) {
            r3 = this;
            r3.<init>()
            r3.maxBufferSize = r4
            okio.Buffer r0 = new okio.Buffer
            r0.<init>()
            r3.buffer = r0
            java.util.concurrent.locks.ReentrantLock r0 = new java.util.concurrent.locks.ReentrantLock
            r0.<init>()
            r3.lock = r0
            java.util.concurrent.locks.Condition r0 = r0.newCondition()
            java.lang.String r1 = "newCondition(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            r3.condition = r0
            r0 = 1
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 < 0) goto L33
            okio.Pipe$sink$1 r4 = new okio.Pipe$sink$1
            r4.<init>(r3)
            r3.sink = r4
            okio.Pipe$source$1 r4 = new okio.Pipe$source$1
            r4.<init>(r3)
            r3.source = r4
            return
        L33:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "maxBufferSize < 1: "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r4 = r4.toString()
            r5.<init>(r4)
            throw r5
    }

    private final void forward(okio.Sink r14, kotlin.jvm.functions.Function1<? super okio.Sink, kotlin.n1> r15) {
            r13 = this;
            okio.Timeout r0 = r14.timeout()
            okio.Sink r1 = r13.sink()
            okio.Timeout r1 = r1.timeout()
            long r2 = r0.timeoutNanos()
            okio.Timeout$Companion r4 = okio.Timeout.Companion
            long r5 = r1.timeoutNanos()
            long r7 = r0.timeoutNanos()
            long r4 = r4.minTimeout(r5, r7)
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.NANOSECONDS
            r0.timeout(r4, r6)
            boolean r4 = r0.hasDeadline()
            r5 = 1
            if (r4 == 0) goto L71
            long r7 = r0.deadlineNanoTime()
            boolean r4 = r1.hasDeadline()
            if (r4 == 0) goto L43
            long r9 = r0.deadlineNanoTime()
            long r11 = r1.deadlineNanoTime()
            long r9 = java.lang.Math.min(r9, r11)
            r0.deadlineNanoTime(r9)
        L43:
            r15.invoke(r14)     // Catch: java.lang.Throwable -> L5b
            kotlin.n1 r14 = kotlin.n1.a     // Catch: java.lang.Throwable -> L5b
            kotlin.jvm.internal.d0.d(r5)
            r0.timeout(r2, r6)
            boolean r14 = r1.hasDeadline()
            if (r14 == 0) goto L57
            r0.deadlineNanoTime(r7)
        L57:
            kotlin.jvm.internal.d0.c(r5)
            return
        L5b:
            r14 = move-exception
            kotlin.jvm.internal.d0.d(r5)
            java.util.concurrent.TimeUnit r15 = java.util.concurrent.TimeUnit.NANOSECONDS
            r0.timeout(r2, r15)
            boolean r15 = r1.hasDeadline()
            if (r15 == 0) goto L6d
            r0.deadlineNanoTime(r7)
        L6d:
            kotlin.jvm.internal.d0.c(r5)
            throw r14
        L71:
            boolean r4 = r1.hasDeadline()
            if (r4 == 0) goto L7e
            long r7 = r1.deadlineNanoTime()
            r0.deadlineNanoTime(r7)
        L7e:
            r15.invoke(r14)     // Catch: java.lang.Throwable -> L96
            kotlin.n1 r14 = kotlin.n1.a     // Catch: java.lang.Throwable -> L96
            kotlin.jvm.internal.d0.d(r5)
            r0.timeout(r2, r6)
            boolean r14 = r1.hasDeadline()
            if (r14 == 0) goto L92
            r0.clearDeadline()
        L92:
            kotlin.jvm.internal.d0.c(r5)
            return
        L96:
            r14 = move-exception
            kotlin.jvm.internal.d0.d(r5)
            java.util.concurrent.TimeUnit r15 = java.util.concurrent.TimeUnit.NANOSECONDS
            r0.timeout(r2, r15)
            boolean r15 = r1.hasDeadline()
            if (r15 == 0) goto La8
            r0.clearDeadline()
        La8:
            kotlin.jvm.internal.d0.c(r5)
            throw r14
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "sink", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_sink")
    @org.jetbrains.annotations.NotNull
    /* renamed from: -deprecated_sink, reason: not valid java name */
    public final okio.Sink m64deprecated_sink() {
            r1 = this;
            okio.Sink r0 = r1.sink
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "source", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_source")
    @org.jetbrains.annotations.NotNull
    /* renamed from: -deprecated_source, reason: not valid java name */
    public final okio.Source m65deprecated_source() {
            r1 = this;
            okio.Source r0 = r1.source
            return r0
    }

    public final void cancel() {
            r2 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r2.lock
            r0.lock()
            r1 = 1
            r2.canceled = r1     // Catch: java.lang.Throwable -> L18
            okio.Buffer r1 = r2.buffer     // Catch: java.lang.Throwable -> L18
            r1.clear()     // Catch: java.lang.Throwable -> L18
            java.util.concurrent.locks.Condition r1 = r2.condition     // Catch: java.lang.Throwable -> L18
            r1.signalAll()     // Catch: java.lang.Throwable -> L18
            kotlin.n1 r1 = kotlin.n1.a     // Catch: java.lang.Throwable -> L18
            r0.unlock()
            return
        L18:
            r1 = move-exception
            r0.unlock()
            throw r1
    }

    public final void fold(@org.jetbrains.annotations.NotNull okio.Sink r9) throws java.io.IOException {
            r8 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.g0.p(r9, r0)
        L5:
            java.util.concurrent.locks.ReentrantLock r0 = r8.lock
            r0.lock()
            okio.Sink r1 = r8.foldedSink     // Catch: java.lang.Throwable -> L25
            if (r1 != 0) goto L7f
            boolean r1 = r8.canceled     // Catch: java.lang.Throwable -> L25
            if (r1 != 0) goto L75
            boolean r1 = r8.sinkClosed     // Catch: java.lang.Throwable -> L25
            okio.Buffer r2 = r8.buffer     // Catch: java.lang.Throwable -> L25
            boolean r2 = r2.exhausted()     // Catch: java.lang.Throwable -> L25
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L27
            r8.sourceClosed = r4     // Catch: java.lang.Throwable -> L25
            r8.foldedSink = r9     // Catch: java.lang.Throwable -> L25
            r2 = r3
            r5 = 1
            goto L3b
        L25:
            r9 = move-exception
            goto L87
        L27:
            okio.Buffer r2 = new okio.Buffer     // Catch: java.lang.Throwable -> L25
            r2.<init>()     // Catch: java.lang.Throwable -> L25
            okio.Buffer r5 = r8.buffer     // Catch: java.lang.Throwable -> L25
            long r6 = r5.size()     // Catch: java.lang.Throwable -> L25
            r2.write(r5, r6)     // Catch: java.lang.Throwable -> L25
            java.util.concurrent.locks.Condition r5 = r8.condition     // Catch: java.lang.Throwable -> L25
            r5.signalAll()     // Catch: java.lang.Throwable -> L25
            r5 = 0
        L3b:
            kotlin.n1 r6 = kotlin.n1.a     // Catch: java.lang.Throwable -> L25
            r0.unlock()
            if (r5 == 0) goto L48
            if (r1 == 0) goto L47
            r9.close()
        L47:
            return
        L48:
            if (r2 != 0) goto L52
            java.lang.String r0 = "sinkBuffer"
            kotlin.jvm.internal.g0.S(r0)     // Catch: java.lang.Throwable -> L50
            goto L53
        L50:
            r9 = move-exception
            goto L5e
        L52:
            r3 = r2
        L53:
            long r0 = r2.size()     // Catch: java.lang.Throwable -> L50
            r9.write(r3, r0)     // Catch: java.lang.Throwable -> L50
            r9.flush()     // Catch: java.lang.Throwable -> L50
            goto L5
        L5e:
            java.util.concurrent.locks.ReentrantLock r0 = r8.lock
            r0.lock()
            r8.sourceClosed = r4     // Catch: java.lang.Throwable -> L70
            java.util.concurrent.locks.Condition r1 = r8.condition     // Catch: java.lang.Throwable -> L70
            r1.signalAll()     // Catch: java.lang.Throwable -> L70
            kotlin.n1 r1 = kotlin.n1.a     // Catch: java.lang.Throwable -> L70
            r0.unlock()
            throw r9
        L70:
            r9 = move-exception
            r0.unlock()
            throw r9
        L75:
            r8.foldedSink = r9     // Catch: java.lang.Throwable -> L25
            java.io.IOException r9 = new java.io.IOException     // Catch: java.lang.Throwable -> L25
            java.lang.String r1 = "canceled"
            r9.<init>(r1)     // Catch: java.lang.Throwable -> L25
            throw r9     // Catch: java.lang.Throwable -> L25
        L7f:
            java.lang.String r9 = "sink already folded"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L25
            r1.<init>(r9)     // Catch: java.lang.Throwable -> L25
            throw r1     // Catch: java.lang.Throwable -> L25
        L87:
            r0.unlock()
            throw r9
    }

    @org.jetbrains.annotations.NotNull
    public final okio.Buffer getBuffer$okio() {
            r1 = this;
            okio.Buffer r0 = r1.buffer
            return r0
    }

    public final boolean getCanceled$okio() {
            r1 = this;
            boolean r0 = r1.canceled
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.concurrent.locks.Condition getCondition() {
            r1 = this;
            java.util.concurrent.locks.Condition r0 = r1.condition
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final okio.Sink getFoldedSink$okio() {
            r1 = this;
            okio.Sink r0 = r1.foldedSink
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.concurrent.locks.ReentrantLock getLock() {
            r1 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r1.lock
            return r0
    }

    public final long getMaxBufferSize$okio() {
            r2 = this;
            long r0 = r2.maxBufferSize
            return r0
    }

    public final boolean getSinkClosed$okio() {
            r1 = this;
            boolean r0 = r1.sinkClosed
            return r0
    }

    public final boolean getSourceClosed$okio() {
            r1 = this;
            boolean r0 = r1.sourceClosed
            return r0
    }

    public final void setCanceled$okio(boolean r1) {
            r0 = this;
            r0.canceled = r1
            return
    }

    public final void setFoldedSink$okio(@org.jetbrains.annotations.Nullable okio.Sink r1) {
            r0 = this;
            r0.foldedSink = r1
            return
    }

    public final void setSinkClosed$okio(boolean r1) {
            r0 = this;
            r0.sinkClosed = r1
            return
    }

    public final void setSourceClosed$okio(boolean r1) {
            r0 = this;
            r0.sourceClosed = r1
            return
    }

    @kotlin.jvm.JvmName(name = "sink")
    @org.jetbrains.annotations.NotNull
    public final okio.Sink sink() {
            r1 = this;
            okio.Sink r0 = r1.sink
            return r0
    }

    @kotlin.jvm.JvmName(name = "source")
    @org.jetbrains.annotations.NotNull
    public final okio.Source source() {
            r1 = this;
            okio.Source r0 = r1.source
            return r0
    }
}
