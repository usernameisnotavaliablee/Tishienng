package okio;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nInflaterSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InflaterSource.kt\nokio/InflaterSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,132:1\n1#2:133\n85#3:134\n*S KotlinDebug\n*F\n+ 1 InflaterSource.kt\nokio/InflaterSource\n*L\n66#1:134\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class InflaterSource implements okio.Source {
    private int bufferBytesHeldByInflater;
    private boolean closed;

    @org.jetbrains.annotations.NotNull
    private final java.util.zip.Inflater inflater;

    @org.jetbrains.annotations.NotNull
    private final okio.BufferedSource source;

    public InflaterSource(@org.jetbrains.annotations.NotNull okio.BufferedSource r2, @org.jetbrains.annotations.NotNull java.util.zip.Inflater r3) {
            r1 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "inflater"
            kotlin.jvm.internal.g0.p(r3, r0)
            r1.<init>()
            r1.source = r2
            r1.inflater = r3
            return
    }

    public InflaterSource(@org.jetbrains.annotations.NotNull okio.Source r2, @org.jetbrains.annotations.NotNull java.util.zip.Inflater r3) {
            r1 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "inflater"
            kotlin.jvm.internal.g0.p(r3, r0)
            okio.BufferedSource r2 = okio.Okio.buffer(r2)
            r1.<init>(r2, r3)
            return
    }

    private final void releaseBytesAfterInflate() {
            r4 = this;
            int r0 = r4.bufferBytesHeldByInflater
            if (r0 != 0) goto L5
            return
        L5:
            java.util.zip.Inflater r1 = r4.inflater
            int r1 = r1.getRemaining()
            int r0 = r0 - r1
            int r1 = r4.bufferBytesHeldByInflater
            int r1 = r1 - r0
            r4.bufferBytesHeldByInflater = r1
            okio.BufferedSource r1 = r4.source
            long r2 = (long) r0
            r1.skip(r2)
            return
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r1 = this;
            boolean r0 = r1.closed
            if (r0 == 0) goto L5
            return
        L5:
            java.util.zip.Inflater r0 = r1.inflater
            r0.end()
            r0 = 1
            r1.closed = r0
            okio.BufferedSource r0 = r1.source
            r0.close()
            return
    }

    @Override // okio.Source
    public long read(@org.jetbrains.annotations.NotNull okio.Buffer r6, long r7) throws java.io.IOException {
            r5 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.g0.p(r6, r0)
        L5:
            long r0 = r5.readOrInflate(r6, r7)
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L10
            return r0
        L10:
            java.util.zip.Inflater r0 = r5.inflater
            boolean r0 = r0.finished()
            if (r0 != 0) goto L32
            java.util.zip.Inflater r0 = r5.inflater
            boolean r0 = r0.needsDictionary()
            if (r0 == 0) goto L21
            goto L32
        L21:
            okio.BufferedSource r0 = r5.source
            boolean r0 = r0.exhausted()
            if (r0 != 0) goto L2a
            goto L5
        L2a:
            java.io.EOFException r6 = new java.io.EOFException
            java.lang.String r7 = "source exhausted prematurely"
            r6.<init>(r7)
            throw r6
        L32:
            r6 = -1
            return r6
    }

    public final long readOrInflate(@org.jetbrains.annotations.NotNull okio.Buffer r6, long r7) throws java.io.IOException {
            r5 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.g0.p(r6, r0)
            r0 = 0
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 < 0) goto L62
            boolean r3 = r5.closed
            if (r3 != 0) goto L5a
            if (r2 != 0) goto L12
            return r0
        L12:
            r2 = 1
            okio.Segment r2 = r6.writableSegment$okio(r2)     // Catch: java.util.zip.DataFormatException -> L42
            int r3 = r2.limit     // Catch: java.util.zip.DataFormatException -> L42
            int r3 = 8192 - r3
            long r3 = (long) r3     // Catch: java.util.zip.DataFormatException -> L42
            long r7 = java.lang.Math.min(r7, r3)     // Catch: java.util.zip.DataFormatException -> L42
            int r8 = (int) r7     // Catch: java.util.zip.DataFormatException -> L42
            r5.refill()     // Catch: java.util.zip.DataFormatException -> L42
            java.util.zip.Inflater r7 = r5.inflater     // Catch: java.util.zip.DataFormatException -> L42
            byte[] r3 = r2.data     // Catch: java.util.zip.DataFormatException -> L42
            int r4 = r2.limit     // Catch: java.util.zip.DataFormatException -> L42
            int r7 = r7.inflate(r3, r4, r8)     // Catch: java.util.zip.DataFormatException -> L42
            r5.releaseBytesAfterInflate()     // Catch: java.util.zip.DataFormatException -> L42
            if (r7 <= 0) goto L44
            int r8 = r2.limit     // Catch: java.util.zip.DataFormatException -> L42
            int r8 = r8 + r7
            r2.limit = r8     // Catch: java.util.zip.DataFormatException -> L42
            long r0 = r6.size()     // Catch: java.util.zip.DataFormatException -> L42
            long r7 = (long) r7     // Catch: java.util.zip.DataFormatException -> L42
            long r0 = r0 + r7
            r6.setSize$okio(r0)     // Catch: java.util.zip.DataFormatException -> L42
            return r7
        L42:
            r6 = move-exception
            goto L54
        L44:
            int r7 = r2.pos     // Catch: java.util.zip.DataFormatException -> L42
            int r8 = r2.limit     // Catch: java.util.zip.DataFormatException -> L42
            if (r7 != r8) goto L53
            okio.Segment r7 = r2.pop()     // Catch: java.util.zip.DataFormatException -> L42
            r6.head = r7     // Catch: java.util.zip.DataFormatException -> L42
            okio.SegmentPool.recycle(r2)     // Catch: java.util.zip.DataFormatException -> L42
        L53:
            return r0
        L54:
            java.io.IOException r7 = new java.io.IOException
            r7.<init>(r6)
            throw r7
        L5a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "closed"
            r6.<init>(r7)
            throw r6
        L62:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "byteCount < 0: "
            r6.append(r0)
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r6 = r6.toString()
            r7.<init>(r6)
            throw r7
    }

    public final boolean refill() throws java.io.IOException {
            r5 = this;
            java.util.zip.Inflater r0 = r5.inflater
            boolean r0 = r0.needsInput()
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            okio.BufferedSource r0 = r5.source
            boolean r0 = r0.exhausted()
            if (r0 == 0) goto L14
            r0 = 1
            return r0
        L14:
            okio.BufferedSource r0 = r5.source
            okio.Buffer r0 = r0.getBuffer()
            okio.Segment r0 = r0.head
            kotlin.jvm.internal.g0.m(r0)
            int r2 = r0.limit
            int r3 = r0.pos
            int r2 = r2 - r3
            r5.bufferBytesHeldByInflater = r2
            java.util.zip.Inflater r4 = r5.inflater
            byte[] r0 = r0.data
            r4.setInput(r0, r3, r2)
            return r1
    }

    @Override // okio.Source
    @org.jetbrains.annotations.NotNull
    public okio.Timeout timeout() {
            r1 = this;
            okio.BufferedSource r0 = r1.source
            okio.Timeout r0 = r0.timeout()
            return r0
    }
}
