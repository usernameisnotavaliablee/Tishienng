package okio;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nGzipSink.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GzipSink.kt\nokio/GzipSink\n+ 2 RealBufferedSink.kt\nokio/RealBufferedSink\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,152:1\n51#2:153\n1#3:154\n85#4:155\n*S KotlinDebug\n*F\n+ 1 GzipSink.kt\nokio/GzipSink\n*L\n62#1:153\n130#1:155\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class GzipSink implements okio.Sink {
    private boolean closed;

    @org.jetbrains.annotations.NotNull
    private final java.util.zip.CRC32 crc;

    @org.jetbrains.annotations.NotNull
    private final java.util.zip.Deflater deflater;

    @org.jetbrains.annotations.NotNull
    private final okio.DeflaterSink deflaterSink;

    @org.jetbrains.annotations.NotNull
    private final okio.RealBufferedSink sink;

    public GzipSink(@org.jetbrains.annotations.NotNull okio.Sink r4) {
            r3 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.g0.p(r4, r0)
            r3.<init>()
            okio.RealBufferedSink r0 = new okio.RealBufferedSink
            r0.<init>(r4)
            r3.sink = r0
            java.util.zip.Deflater r4 = new java.util.zip.Deflater
            int r1 = okio.internal._ZlibJvmKt.getDEFAULT_COMPRESSION()
            r2 = 1
            r4.<init>(r1, r2)
            r3.deflater = r4
            okio.DeflaterSink r1 = new okio.DeflaterSink
            r1.<init>(r0, r4)
            r3.deflaterSink = r1
            java.util.zip.CRC32 r4 = new java.util.zip.CRC32
            r4.<init>()
            r3.crc = r4
            okio.Buffer r4 = r0.bufferField
            r0 = 8075(0x1f8b, float:1.1315E-41)
            r4.writeShort(r0)
            r0 = 8
            r4.writeByte(r0)
            r0 = 0
            r4.writeByte(r0)
            r4.writeInt(r0)
            r4.writeByte(r0)
            r4.writeByte(r0)
            return
    }

    private final void updateCrc(okio.Buffer r5, long r6) {
            r4 = this;
            okio.Segment r5 = r5.head
            kotlin.jvm.internal.g0.m(r5)
        L5:
            r0 = 0
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 <= 0) goto L27
            int r0 = r5.limit
            int r1 = r5.pos
            int r0 = r0 - r1
            long r0 = (long) r0
            long r0 = java.lang.Math.min(r6, r0)
            int r1 = (int) r0
            java.util.zip.CRC32 r0 = r4.crc
            byte[] r2 = r5.data
            int r3 = r5.pos
            r0.update(r2, r3, r1)
            long r0 = (long) r1
            long r6 = r6 - r0
            okio.Segment r5 = r5.next
            kotlin.jvm.internal.g0.m(r5)
            goto L5
        L27:
            return
    }

    private final void writeFooter() {
            r3 = this;
            okio.RealBufferedSink r0 = r3.sink
            java.util.zip.CRC32 r1 = r3.crc
            long r1 = r1.getValue()
            int r2 = (int) r1
            r0.writeIntLe(r2)
            okio.RealBufferedSink r0 = r3.sink
            java.util.zip.Deflater r1 = r3.deflater
            long r1 = r1.getBytesRead()
            int r2 = (int) r1
            r0.writeIntLe(r2)
            return
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "deflater", imports = {}))
    @kotlin.jvm.JvmName(name = "-deprecated_deflater")
    @org.jetbrains.annotations.NotNull
    /* renamed from: -deprecated_deflater, reason: not valid java name */
    public final java.util.zip.Deflater m60deprecated_deflater() {
            r1 = this;
            java.util.zip.Deflater r0 = r1.deflater
            return r0
    }

    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r2 = this;
            boolean r0 = r2.closed
            if (r0 == 0) goto L5
            goto L29
        L5:
            okio.DeflaterSink r0 = r2.deflaterSink     // Catch: java.lang.Throwable -> Lf
            r0.finishDeflate$okio()     // Catch: java.lang.Throwable -> Lf
            r2.writeFooter()     // Catch: java.lang.Throwable -> Lf
            r0 = 0
            goto L10
        Lf:
            r0 = move-exception
        L10:
            java.util.zip.Deflater r1 = r2.deflater     // Catch: java.lang.Throwable -> L16
            r1.end()     // Catch: java.lang.Throwable -> L16
            goto L1a
        L16:
            r1 = move-exception
            if (r0 != 0) goto L1a
            r0 = r1
        L1a:
            okio.RealBufferedSink r1 = r2.sink     // Catch: java.lang.Throwable -> L20
            r1.close()     // Catch: java.lang.Throwable -> L20
            goto L24
        L20:
            r1 = move-exception
            if (r0 != 0) goto L24
            r0 = r1
        L24:
            r1 = 1
            r2.closed = r1
            if (r0 != 0) goto L2a
        L29:
            return
        L2a:
            throw r0
    }

    @kotlin.jvm.JvmName(name = "deflater")
    @org.jetbrains.annotations.NotNull
    public final java.util.zip.Deflater deflater() {
            r1 = this;
            java.util.zip.Deflater r0 = r1.deflater
            return r0
    }

    @Override // okio.Sink, java.io.Flushable
    public void flush() throws java.io.IOException {
            r1 = this;
            okio.DeflaterSink r0 = r1.deflaterSink
            r0.flush()
            return
    }

    @Override // okio.Sink
    @org.jetbrains.annotations.NotNull
    public okio.Timeout timeout() {
            r1 = this;
            okio.RealBufferedSink r0 = r1.sink
            okio.Timeout r0 = r0.timeout()
            return r0
    }

    @Override // okio.Sink
    public void write(@org.jetbrains.annotations.NotNull okio.Buffer r4, long r5) throws java.io.IOException {
            r3 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.g0.p(r4, r0)
            r0 = 0
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 < 0) goto L17
            if (r2 != 0) goto Le
            return
        Le:
            r3.updateCrc(r4, r5)
            okio.DeflaterSink r0 = r3.deflaterSink
            r0.write(r4, r5)
            return
        L17:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "byteCount < 0: "
            r4.append(r0)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r4 = r4.toString()
            r5.<init>(r4)
            throw r5
    }
}
