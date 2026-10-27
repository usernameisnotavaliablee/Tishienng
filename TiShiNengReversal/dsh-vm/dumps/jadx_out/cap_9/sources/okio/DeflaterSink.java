package okio;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nDeflaterSink.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeflaterSink.kt\nokio/DeflaterSink\n+ 2 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,140:1\n85#2:141\n*S KotlinDebug\n*F\n+ 1 DeflaterSink.kt\nokio/DeflaterSink\n*L\n39#1:141\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class DeflaterSink implements okio.Sink {
    private boolean closed;

    @org.jetbrains.annotations.NotNull
    private final java.util.zip.Deflater deflater;

    @org.jetbrains.annotations.NotNull
    private final okio.BufferedSink sink;

    public DeflaterSink(@org.jetbrains.annotations.NotNull okio.BufferedSink r2, @org.jetbrains.annotations.NotNull java.util.zip.Deflater r3) {
            r1 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "deflater"
            kotlin.jvm.internal.g0.p(r3, r0)
            r1.<init>()
            r1.sink = r2
            r1.deflater = r3
            return
    }

    public DeflaterSink(@org.jetbrains.annotations.NotNull okio.Sink r2, @org.jetbrains.annotations.NotNull java.util.zip.Deflater r3) {
            r1 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "deflater"
            kotlin.jvm.internal.g0.p(r3, r0)
            okio.BufferedSink r2 = okio.Okio.buffer(r2)
            r1.<init>(r2, r3)
            return
    }

    private final void deflate(boolean r8) {
            r7 = this;
            okio.BufferedSink r0 = r7.sink
            okio.Buffer r0 = r0.getBuffer()
        L6:
            r1 = 1
            okio.Segment r1 = r0.writableSegment$okio(r1)
            if (r8 == 0) goto L1d
            java.util.zip.Deflater r2 = r7.deflater     // Catch: java.lang.NullPointerException -> L1b
            byte[] r3 = r1.data     // Catch: java.lang.NullPointerException -> L1b
            int r4 = r1.limit     // Catch: java.lang.NullPointerException -> L1b
            int r5 = 8192 - r4
            r6 = 2
            int r2 = r2.deflate(r3, r4, r5, r6)     // Catch: java.lang.NullPointerException -> L1b
            goto L29
        L1b:
            r8 = move-exception
            goto L57
        L1d:
            java.util.zip.Deflater r2 = r7.deflater     // Catch: java.lang.NullPointerException -> L1b
            byte[] r3 = r1.data     // Catch: java.lang.NullPointerException -> L1b
            int r4 = r1.limit     // Catch: java.lang.NullPointerException -> L1b
            int r5 = 8192 - r4
            int r2 = r2.deflate(r3, r4, r5)     // Catch: java.lang.NullPointerException -> L1b
        L29:
            if (r2 <= 0) goto L3f
            int r3 = r1.limit
            int r3 = r3 + r2
            r1.limit = r3
            long r3 = r0.size()
            long r1 = (long) r2
            long r3 = r3 + r1
            r0.setSize$okio(r3)
            okio.BufferedSink r1 = r7.sink
            r1.emitCompleteSegments()
            goto L6
        L3f:
            java.util.zip.Deflater r2 = r7.deflater
            boolean r2 = r2.needsInput()
            if (r2 == 0) goto L6
            int r8 = r1.pos
            int r2 = r1.limit
            if (r8 != r2) goto L56
            okio.Segment r8 = r1.pop()
            r0.head = r8
            okio.SegmentPool.recycle(r1)
        L56:
            return
        L57:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Deflater already closed"
            r0.<init>(r1, r8)
            throw r0
    }

    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r2 = this;
            boolean r0 = r2.closed
            if (r0 == 0) goto L5
            goto L24
        L5:
            r2.finishDeflate$okio()     // Catch: java.lang.Throwable -> La
            r0 = 0
            goto Lb
        La:
            r0 = move-exception
        Lb:
            java.util.zip.Deflater r1 = r2.deflater     // Catch: java.lang.Throwable -> L11
            r1.end()     // Catch: java.lang.Throwable -> L11
            goto L15
        L11:
            r1 = move-exception
            if (r0 != 0) goto L15
            r0 = r1
        L15:
            okio.BufferedSink r1 = r2.sink     // Catch: java.lang.Throwable -> L1b
            r1.close()     // Catch: java.lang.Throwable -> L1b
            goto L1f
        L1b:
            r1 = move-exception
            if (r0 != 0) goto L1f
            r0 = r1
        L1f:
            r1 = 1
            r2.closed = r1
            if (r0 != 0) goto L25
        L24:
            return
        L25:
            throw r0
    }

    public final void finishDeflate$okio() {
            r1 = this;
            java.util.zip.Deflater r0 = r1.deflater
            r0.finish()
            r0 = 0
            r1.deflate(r0)
            return
    }

    @Override // okio.Sink, java.io.Flushable
    public void flush() throws java.io.IOException {
            r1 = this;
            r0 = 1
            r1.deflate(r0)
            okio.BufferedSink r0 = r1.sink
            r0.flush()
            return
    }

    @Override // okio.Sink
    @org.jetbrains.annotations.NotNull
    public okio.Timeout timeout() {
            r1 = this;
            okio.BufferedSink r0 = r1.sink
            okio.Timeout r0 = r0.timeout()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "DeflaterSink("
            r0.append(r1)
            okio.BufferedSink r1 = r2.sink
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // okio.Sink
    public void write(@org.jetbrains.annotations.NotNull okio.Buffer r8, long r9) throws java.io.IOException {
            r7 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.g0.p(r8, r0)
            long r1 = r8.size()
            r3 = 0
            r5 = r9
            okio.SegmentedByteString.checkOffsetAndCount(r1, r3, r5)
        Lf:
            r0 = 0
            r2 = 0
            int r3 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r3 <= 0) goto L4f
            okio.Segment r0 = r8.head
            kotlin.jvm.internal.g0.m(r0)
            int r1 = r0.limit
            int r3 = r0.pos
            int r1 = r1 - r3
            long r3 = (long) r1
            long r3 = java.lang.Math.min(r9, r3)
            int r1 = (int) r3
            java.util.zip.Deflater r3 = r7.deflater
            byte[] r4 = r0.data
            int r5 = r0.pos
            r3.setInput(r4, r5, r1)
            r7.deflate(r2)
            long r2 = r8.size()
            long r4 = (long) r1
            long r2 = r2 - r4
            r8.setSize$okio(r2)
            int r2 = r0.pos
            int r2 = r2 + r1
            r0.pos = r2
            int r1 = r0.limit
            if (r2 != r1) goto L4d
            okio.Segment r1 = r0.pop()
            r8.head = r1
            okio.SegmentPool.recycle(r0)
        L4d:
            long r9 = r9 - r4
            goto Lf
        L4f:
            java.util.zip.Deflater r8 = r7.deflater
            byte[] r9 = okio.internal._ZlibJvmKt.getEMPTY_BYTE_ARRAY()
            r8.setInput(r9, r2, r2)
            return
    }
}
