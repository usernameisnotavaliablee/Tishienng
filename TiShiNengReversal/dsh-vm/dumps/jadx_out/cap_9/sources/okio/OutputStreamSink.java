package okio;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nJvmOkio.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JvmOkio.kt\nokio/OutputStreamSink\n+ 2 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,234:1\n85#2:235\n*S KotlinDebug\n*F\n+ 1 JvmOkio.kt\nokio/OutputStreamSink\n*L\n56#1:235\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class OutputStreamSink implements okio.Sink {

    @org.jetbrains.annotations.NotNull
    private final java.io.OutputStream out;

    @org.jetbrains.annotations.NotNull
    private final okio.Timeout timeout;

    public OutputStreamSink(@org.jetbrains.annotations.NotNull java.io.OutputStream r2, @org.jetbrains.annotations.NotNull okio.Timeout r3) {
            r1 = this;
            java.lang.String r0 = "out"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "timeout"
            kotlin.jvm.internal.g0.p(r3, r0)
            r1.<init>()
            r1.out = r2
            r1.timeout = r3
            return
    }

    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r1 = this;
            java.io.OutputStream r0 = r1.out
            r0.close()
            return
    }

    @Override // okio.Sink, java.io.Flushable
    public void flush() {
            r1 = this;
            java.io.OutputStream r0 = r1.out
            r0.flush()
            return
    }

    @Override // okio.Sink
    @org.jetbrains.annotations.NotNull
    public okio.Timeout timeout() {
            r1 = this;
            okio.Timeout r0 = r1.timeout
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "sink("
            r0.append(r1)
            java.io.OutputStream r1 = r2.out
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // okio.Sink
    public void write(@org.jetbrains.annotations.NotNull okio.Buffer r8, long r9) {
            r7 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.g0.p(r8, r0)
            long r1 = r8.size()
            r3 = 0
            r5 = r9
            okio.SegmentedByteString.checkOffsetAndCount(r1, r3, r5)
        Lf:
            r0 = 0
            int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r2 <= 0) goto L52
            okio.Timeout r0 = r7.timeout
            r0.throwIfReached()
            okio.Segment r0 = r8.head
            kotlin.jvm.internal.g0.m(r0)
            int r1 = r0.limit
            int r2 = r0.pos
            int r1 = r1 - r2
            long r1 = (long) r1
            long r1 = java.lang.Math.min(r9, r1)
            int r2 = (int) r1
            java.io.OutputStream r1 = r7.out
            byte[] r3 = r0.data
            int r4 = r0.pos
            r1.write(r3, r4, r2)
            int r1 = r0.pos
            int r1 = r1 + r2
            r0.pos = r1
            long r1 = (long) r2
            long r9 = r9 - r1
            long r3 = r8.size()
            long r3 = r3 - r1
            r8.setSize$okio(r3)
            int r1 = r0.pos
            int r2 = r0.limit
            if (r1 != r2) goto Lf
            okio.Segment r1 = r0.pop()
            r8.head = r1
            okio.SegmentPool.recycle(r0)
            goto Lf
        L52:
            return
    }
}
