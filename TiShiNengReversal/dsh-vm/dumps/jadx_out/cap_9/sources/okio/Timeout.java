package okio;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nTimeout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Timeout.kt\nokio/Timeout\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,358:1\n1#2:359\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class Timeout {

    @org.jetbrains.annotations.NotNull
    public static final okio.Timeout.Companion Companion = null;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final okio.Timeout NONE = null;

    @org.jetbrains.annotations.Nullable
    private volatile java.lang.Object cancelMark;
    private long deadlineNanoTime;
    private boolean hasDeadline;
    private long timeoutNanos;

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

        public final long minTimeout(long r4, long r6) {
                r3 = this;
                r0 = 0
                int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r2 != 0) goto L7
                goto L11
            L7:
                int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
                if (r2 != 0) goto Lc
                goto L10
            Lc:
                int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r0 >= 0) goto L11
            L10:
                return r4
            L11:
                return r6
        }

        @org.jetbrains.annotations.NotNull
        public final okio.Timeout timeout(@org.jetbrains.annotations.NotNull okio.Timeout r2, long r3, @org.jetbrains.annotations.NotNull kotlin.time.DurationUnit r5) {
                r1 = this;
                java.lang.String r0 = "<this>"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r0 = "unit"
                kotlin.jvm.internal.g0.p(r5, r0)
                java.util.concurrent.TimeUnit r5 = kotlin.time.k.e(r5)
                okio.Timeout r2 = r2.timeout(r3, r5)
                return r2
        }

        @org.jetbrains.annotations.NotNull
        /* renamed from: timeout-HG0u8IE, reason: not valid java name */
        public final okio.Timeout m66timeoutHG0u8IE(@org.jetbrains.annotations.NotNull okio.Timeout r2, long r3) {
                r1 = this;
                java.lang.String r0 = "$this$timeout"
                kotlin.jvm.internal.g0.p(r2, r0)
                long r3 = kotlin.time.h.z(r3)
                java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.NANOSECONDS
                okio.Timeout r2 = r2.timeout(r3, r0)
                return r2
        }
    }

    static {
            okio.Timeout$Companion r0 = new okio.Timeout$Companion
            r1 = 0
            r0.<init>(r1)
            okio.Timeout.Companion = r0
            okio.Timeout$Companion$NONE$1 r0 = new okio.Timeout$Companion$NONE$1
            r0.<init>()
            okio.Timeout.NONE = r0
            return
    }

    public Timeout() {
            r0 = this;
            r0.<init>()
            return
    }

    public void awaitSignal(@org.jetbrains.annotations.NotNull java.util.concurrent.locks.Condition r10) throws java.io.InterruptedIOException {
            r9 = this;
            java.lang.String r0 = "condition"
            kotlin.jvm.internal.g0.p(r10, r0)
            boolean r0 = r9.hasDeadline()     // Catch: java.lang.InterruptedException -> L5b
            long r1 = r9.timeoutNanos()     // Catch: java.lang.InterruptedException -> L5b
            r3 = 0
            if (r0 != 0) goto L19
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L19
            r10.await()     // Catch: java.lang.InterruptedException -> L5b
            return
        L19:
            if (r0 == 0) goto L2d
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L2d
            long r5 = r9.deadlineNanoTime()     // Catch: java.lang.InterruptedException -> L5b
            long r7 = java.lang.System.nanoTime()     // Catch: java.lang.InterruptedException -> L5b
            long r5 = r5 - r7
            long r1 = java.lang.Math.min(r1, r5)     // Catch: java.lang.InterruptedException -> L5b
            goto L39
        L2d:
            if (r0 == 0) goto L39
            long r0 = r9.deadlineNanoTime()     // Catch: java.lang.InterruptedException -> L5b
            long r5 = java.lang.System.nanoTime()     // Catch: java.lang.InterruptedException -> L5b
            long r0 = r0 - r5
            r1 = r0
        L39:
            java.lang.String r0 = "timeout"
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L55
            java.lang.Object r5 = r9.cancelMark     // Catch: java.lang.InterruptedException -> L5b
            long r1 = r10.awaitNanos(r1)     // Catch: java.lang.InterruptedException -> L5b
            int r10 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r10 <= 0) goto L4a
            goto L4e
        L4a:
            java.lang.Object r10 = r9.cancelMark     // Catch: java.lang.InterruptedException -> L5b
            if (r10 == r5) goto L4f
        L4e:
            return
        L4f:
            java.io.InterruptedIOException r10 = new java.io.InterruptedIOException     // Catch: java.lang.InterruptedException -> L5b
            r10.<init>(r0)     // Catch: java.lang.InterruptedException -> L5b
            throw r10     // Catch: java.lang.InterruptedException -> L5b
        L55:
            java.io.InterruptedIOException r10 = new java.io.InterruptedIOException     // Catch: java.lang.InterruptedException -> L5b
            r10.<init>(r0)     // Catch: java.lang.InterruptedException -> L5b
            throw r10     // Catch: java.lang.InterruptedException -> L5b
        L5b:
            java.lang.Thread r10 = java.lang.Thread.currentThread()
            r10.interrupt()
            java.io.InterruptedIOException r10 = new java.io.InterruptedIOException
            java.lang.String r0 = "interrupted"
            r10.<init>(r0)
            throw r10
    }

    public void cancel() {
            r1 = this;
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.cancelMark = r0
            return
    }

    @org.jetbrains.annotations.NotNull
    public okio.Timeout clearDeadline() {
            r1 = this;
            r0 = 0
            r1.hasDeadline = r0
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public okio.Timeout clearTimeout() {
            r2 = this;
            r0 = 0
            r2.timeoutNanos = r0
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public final okio.Timeout deadline(long r4, @org.jetbrains.annotations.NotNull java.util.concurrent.TimeUnit r6) {
            r3 = this;
            java.lang.String r0 = "unit"
            kotlin.jvm.internal.g0.p(r6, r0)
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 <= 0) goto L19
            long r0 = java.lang.System.nanoTime()
            long r4 = r6.toNanos(r4)
            long r0 = r0 + r4
            okio.Timeout r4 = r3.deadlineNanoTime(r0)
            return r4
        L19:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "duration <= 0: "
            r6.append(r0)
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r4 = r4.toString()
            r5.<init>(r4)
            throw r5
    }

    public long deadlineNanoTime() {
            r2 = this;
            boolean r0 = r2.hasDeadline
            if (r0 == 0) goto L7
            long r0 = r2.deadlineNanoTime
            return r0
        L7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "No deadline"
            r0.<init>(r1)
            throw r0
    }

    @org.jetbrains.annotations.NotNull
    public okio.Timeout deadlineNanoTime(long r2) {
            r1 = this;
            r0 = 1
            r1.hasDeadline = r0
            r1.deadlineNanoTime = r2
            return r1
    }

    public boolean hasDeadline() {
            r1 = this;
            boolean r0 = r1.hasDeadline
            return r0
    }

    public final <T> T intersectWith(@org.jetbrains.annotations.NotNull okio.Timeout r12, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<? extends T> r13) {
            r11 = this;
            java.lang.String r0 = "other"
            kotlin.jvm.internal.g0.p(r12, r0)
            java.lang.String r0 = "block"
            kotlin.jvm.internal.g0.p(r13, r0)
            long r0 = r11.timeoutNanos()
            okio.Timeout$Companion r2 = okio.Timeout.Companion
            long r3 = r12.timeoutNanos()
            long r5 = r11.timeoutNanos()
            long r2 = r2.minTimeout(r3, r5)
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.NANOSECONDS
            r11.timeout(r2, r4)
            boolean r2 = r11.hasDeadline()
            r3 = 1
            if (r2 == 0) goto L6e
            long r5 = r11.deadlineNanoTime()
            boolean r2 = r12.hasDeadline()
            if (r2 == 0) goto L41
            long r7 = r11.deadlineNanoTime()
            long r9 = r12.deadlineNanoTime()
            long r7 = java.lang.Math.min(r7, r9)
            r11.deadlineNanoTime(r7)
        L41:
            java.lang.Object r13 = r13.invoke()     // Catch: java.lang.Throwable -> L58
            kotlin.jvm.internal.d0.d(r3)
            r11.timeout(r0, r4)
            boolean r12 = r12.hasDeadline()
            if (r12 == 0) goto L54
            r11.deadlineNanoTime(r5)
        L54:
            kotlin.jvm.internal.d0.c(r3)
            return r13
        L58:
            r13 = move-exception
            kotlin.jvm.internal.d0.d(r3)
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.NANOSECONDS
            r11.timeout(r0, r2)
            boolean r12 = r12.hasDeadline()
            if (r12 == 0) goto L6a
            r11.deadlineNanoTime(r5)
        L6a:
            kotlin.jvm.internal.d0.c(r3)
            throw r13
        L6e:
            boolean r2 = r12.hasDeadline()
            if (r2 == 0) goto L7b
            long r5 = r12.deadlineNanoTime()
            r11.deadlineNanoTime(r5)
        L7b:
            java.lang.Object r13 = r13.invoke()     // Catch: java.lang.Throwable -> L92
            kotlin.jvm.internal.d0.d(r3)
            r11.timeout(r0, r4)
            boolean r12 = r12.hasDeadline()
            if (r12 == 0) goto L8e
            r11.clearDeadline()
        L8e:
            kotlin.jvm.internal.d0.c(r3)
            return r13
        L92:
            r13 = move-exception
            kotlin.jvm.internal.d0.d(r3)
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.NANOSECONDS
            r11.timeout(r0, r2)
            boolean r12 = r12.hasDeadline()
            if (r12 == 0) goto La4
            r11.clearDeadline()
        La4:
            kotlin.jvm.internal.d0.c(r3)
            throw r13
    }

    public void throwIfReached() throws java.io.IOException {
            r5 = this;
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            boolean r0 = r0.isInterrupted()
            if (r0 != 0) goto L25
            boolean r0 = r5.hasDeadline
            if (r0 == 0) goto L24
            long r0 = r5.deadlineNanoTime
            long r2 = java.lang.System.nanoTime()
            long r0 = r0 - r2
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L1c
            goto L24
        L1c:
            java.io.InterruptedIOException r0 = new java.io.InterruptedIOException
            java.lang.String r1 = "deadline reached"
            r0.<init>(r1)
            throw r0
        L24:
            return
        L25:
            java.io.InterruptedIOException r0 = new java.io.InterruptedIOException
            java.lang.String r1 = "interrupted"
            r0.<init>(r1)
            throw r0
    }

    @org.jetbrains.annotations.NotNull
    public okio.Timeout timeout(long r4, @org.jetbrains.annotations.NotNull java.util.concurrent.TimeUnit r6) {
            r3 = this;
            java.lang.String r0 = "unit"
            kotlin.jvm.internal.g0.p(r6, r0)
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 < 0) goto L12
            long r4 = r6.toNanos(r4)
            r3.timeoutNanos = r4
            return r3
        L12:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "timeout < 0: "
            r6.append(r0)
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r4 = r4.toString()
            r5.<init>(r4)
            throw r5
    }

    public long timeoutNanos() {
            r2 = this;
            long r0 = r2.timeoutNanos
            return r0
    }

    public void waitUntilNotified(@org.jetbrains.annotations.NotNull java.lang.Object r12) throws java.io.InterruptedIOException {
            r11 = this;
            java.lang.String r0 = "monitor"
            kotlin.jvm.internal.g0.p(r12, r0)
            boolean r0 = r11.hasDeadline()     // Catch: java.lang.InterruptedException -> L68
            long r1 = r11.timeoutNanos()     // Catch: java.lang.InterruptedException -> L68
            r3 = 0
            if (r0 != 0) goto L19
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L19
            r12.wait()     // Catch: java.lang.InterruptedException -> L68
            return
        L19:
            long r5 = java.lang.System.nanoTime()     // Catch: java.lang.InterruptedException -> L68
            if (r0 == 0) goto L2d
            int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r7 == 0) goto L2d
            long r7 = r11.deadlineNanoTime()     // Catch: java.lang.InterruptedException -> L68
            long r7 = r7 - r5
            long r1 = java.lang.Math.min(r1, r7)     // Catch: java.lang.InterruptedException -> L68
            goto L35
        L2d:
            if (r0 == 0) goto L35
            long r0 = r11.deadlineNanoTime()     // Catch: java.lang.InterruptedException -> L68
            long r0 = r0 - r5
            r1 = r0
        L35:
            java.lang.String r0 = "timeout"
            int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r7 <= 0) goto L62
            java.lang.Object r3 = r11.cancelMark     // Catch: java.lang.InterruptedException -> L68
            r7 = 1000000(0xf4240, double:4.940656E-318)
            long r9 = r1 / r7
            java.lang.Long.signum(r9)
            long r7 = r7 * r9
            long r7 = r1 - r7
            int r4 = (int) r7
            r12.wait(r9, r4)     // Catch: java.lang.InterruptedException -> L68
            long r7 = java.lang.System.nanoTime()     // Catch: java.lang.InterruptedException -> L68
            long r7 = r7 - r5
            int r12 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r12 >= 0) goto L57
            goto L5b
        L57:
            java.lang.Object r12 = r11.cancelMark     // Catch: java.lang.InterruptedException -> L68
            if (r12 == r3) goto L5c
        L5b:
            return
        L5c:
            java.io.InterruptedIOException r12 = new java.io.InterruptedIOException     // Catch: java.lang.InterruptedException -> L68
            r12.<init>(r0)     // Catch: java.lang.InterruptedException -> L68
            throw r12     // Catch: java.lang.InterruptedException -> L68
        L62:
            java.io.InterruptedIOException r12 = new java.io.InterruptedIOException     // Catch: java.lang.InterruptedException -> L68
            r12.<init>(r0)     // Catch: java.lang.InterruptedException -> L68
            throw r12     // Catch: java.lang.InterruptedException -> L68
        L68:
            java.lang.Thread r12 = java.lang.Thread.currentThread()
            r12.interrupt()
            java.io.InterruptedIOException r12 = new java.io.InterruptedIOException
            java.lang.String r0 = "interrupted"
            r12.<init>(r0)
            throw r12
    }
}
