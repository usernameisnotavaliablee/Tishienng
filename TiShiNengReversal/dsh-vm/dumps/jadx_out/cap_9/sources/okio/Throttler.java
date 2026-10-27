package okio;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class Throttler {
    private long allocatedUntil;
    private long bytesPerSecond;

    @org.jetbrains.annotations.NotNull
    private final java.util.concurrent.locks.Condition condition;

    @org.jetbrains.annotations.NotNull
    private final java.util.concurrent.locks.ReentrantLock lock;
    private long maxByteCount;
    private long waitByteCount;

    public Throttler() {
            r2 = this;
            long r0 = java.lang.System.nanoTime()
            r2.<init>(r0)
            return
    }

    public Throttler(long r1) {
            r0 = this;
            r0.<init>()
            r0.allocatedUntil = r1
            r1 = 8192(0x2000, double:4.0474E-320)
            r0.waitByteCount = r1
            r1 = 262144(0x40000, double:1.295163E-318)
            r0.maxByteCount = r1
            java.util.concurrent.locks.ReentrantLock r1 = new java.util.concurrent.locks.ReentrantLock
            r1.<init>()
            r0.lock = r1
            java.util.concurrent.locks.Condition r1 = r1.newCondition()
            java.lang.String r2 = "newCondition(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            r0.condition = r1
            return
    }

    public static /* synthetic */ void bytesPerSecond$default(okio.Throttler r7, long r8, long r10, long r12, int r14, java.lang.Object r15) {
            r15 = r14 & 2
            if (r15 == 0) goto L6
            long r10 = r7.waitByteCount
        L6:
            r3 = r10
            r10 = r14 & 4
            if (r10 == 0) goto Ld
            long r12 = r7.maxByteCount
        Ld:
            r0 = r7
            r1 = r8
            r5 = r12
            r0.bytesPerSecond(r1, r3, r5)
            return
    }

    private final long bytesToNanos(long r3) {
            r2 = this;
            r0 = 1000000000(0x3b9aca00, double:4.94065646E-315)
            long r3 = r3 * r0
            long r0 = r2.bytesPerSecond
            long r3 = r3 / r0
            return r3
    }

    private final long nanosToBytes(long r3) {
            r2 = this;
            long r0 = r2.bytesPerSecond
            long r3 = r3 * r0
            r0 = 1000000000(0x3b9aca00, double:4.94065646E-315)
            long r3 = r3 / r0
            return r3
    }

    public final long byteCountOrWaitNanos$okio(long r10, long r12) {
            r9 = this;
            long r0 = r9.bytesPerSecond
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L9
            return r12
        L9:
            long r0 = r9.allocatedUntil
            long r0 = r0 - r10
            long r0 = java.lang.Math.max(r0, r2)
            long r4 = r9.maxByteCount
            long r6 = r9.nanosToBytes(r0)
            long r4 = r4 - r6
            int r6 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r6 < 0) goto L24
            long r10 = r10 + r0
            long r0 = r9.bytesToNanos(r12)
            long r10 = r10 + r0
            r9.allocatedUntil = r10
            return r12
        L24:
            long r6 = r9.waitByteCount
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 < 0) goto L34
            long r12 = r9.maxByteCount
            long r12 = r9.bytesToNanos(r12)
            long r10 = r10 + r12
            r9.allocatedUntil = r10
            return r4
        L34:
            long r12 = java.lang.Math.min(r6, r12)
            long r4 = r9.maxByteCount
            long r4 = r12 - r4
            long r4 = r9.bytesToNanos(r4)
            long r0 = r0 + r4
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L4f
            long r0 = r9.maxByteCount
            long r0 = r9.bytesToNanos(r0)
            long r10 = r10 + r0
            r9.allocatedUntil = r10
            return r12
        L4f:
            long r10 = -r0
            return r10
    }

    @kotlin.jvm.JvmOverloads
    public final void bytesPerSecond(long r10) {
            r9 = this;
            r7 = 6
            r8 = 0
            r3 = 0
            r5 = 0
            r0 = r9
            r1 = r10
            bytesPerSecond$default(r0, r1, r3, r5, r7, r8)
            return
    }

    @kotlin.jvm.JvmOverloads
    public final void bytesPerSecond(long r10, long r12) {
            r9 = this;
            r7 = 4
            r8 = 0
            r5 = 0
            r0 = r9
            r1 = r10
            r3 = r12
            bytesPerSecond$default(r0, r1, r3, r5, r7, r8)
            return
    }

    @kotlin.jvm.JvmOverloads
    public final void bytesPerSecond(long r6, long r8, long r10) {
            r5 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r5.lock
            r0.lock()
            java.lang.String r1 = "Failed requirement."
            r2 = 0
            int r4 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r4 < 0) goto L34
            int r4 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r4 <= 0) goto L2e
            int r2 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r2 < 0) goto L28
            r5.bytesPerSecond = r6     // Catch: java.lang.Throwable -> L26
            r5.waitByteCount = r8     // Catch: java.lang.Throwable -> L26
            r5.maxByteCount = r10     // Catch: java.lang.Throwable -> L26
            java.util.concurrent.locks.Condition r6 = r5.condition     // Catch: java.lang.Throwable -> L26
            r6.signalAll()     // Catch: java.lang.Throwable -> L26
            kotlin.n1 r6 = kotlin.n1.a     // Catch: java.lang.Throwable -> L26
            r0.unlock()
            return
        L26:
            r6 = move-exception
            goto L3a
        L28:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L26
            r6.<init>(r1)     // Catch: java.lang.Throwable -> L26
            throw r6     // Catch: java.lang.Throwable -> L26
        L2e:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L26
            r6.<init>(r1)     // Catch: java.lang.Throwable -> L26
            throw r6     // Catch: java.lang.Throwable -> L26
        L34:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L26
            r6.<init>(r1)     // Catch: java.lang.Throwable -> L26
            throw r6     // Catch: java.lang.Throwable -> L26
        L3a:
            r0.unlock()
            throw r6
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.concurrent.locks.Condition getCondition() {
            r1 = this;
            java.util.concurrent.locks.Condition r0 = r1.condition
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.concurrent.locks.ReentrantLock getLock() {
            r1 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r1.lock
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final okio.Sink sink(@org.jetbrains.annotations.NotNull okio.Sink r2) {
            r1 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.g0.p(r2, r0)
            okio.Throttler$sink$1 r0 = new okio.Throttler$sink$1
            r0.<init>(r2, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final okio.Source source(@org.jetbrains.annotations.NotNull okio.Source r2) {
            r1 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.g0.p(r2, r0)
            okio.Throttler$source$1 r0 = new okio.Throttler$source$1
            r0.<init>(r2, r1)
            return r0
    }

    public final long take$okio(long r7) {
            r6 = this;
            r0 = 0
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 <= 0) goto L27
            java.util.concurrent.locks.ReentrantLock r2 = r6.lock
            r2.lock()
        Lb:
            long r3 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L22
            long r3 = r6.byteCountOrWaitNanos$okio(r3, r7)     // Catch: java.lang.Throwable -> L22
            int r5 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r5 < 0) goto L1b
            r2.unlock()
            return r3
        L1b:
            java.util.concurrent.locks.Condition r5 = r6.condition     // Catch: java.lang.Throwable -> L22
            long r3 = -r3
            r5.awaitNanos(r3)     // Catch: java.lang.Throwable -> L22
            goto Lb
        L22:
            r7 = move-exception
            r2.unlock()
            throw r7
        L27:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "Failed requirement."
            r7.<init>(r8)
            throw r7
    }
}
