package okio;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nGzipSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GzipSource.kt\nokio/GzipSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 RealBufferedSource.kt\nokio/RealBufferedSource\n+ 4 GzipSource.kt\nokio/-GzipSourceExtensions\n+ 5 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,222:1\n1#2:223\n63#3:224\n63#3:226\n63#3:228\n63#3:229\n63#3:230\n63#3:232\n63#3:234\n204#4:225\n204#4:227\n204#4:231\n204#4:233\n88#5:235\n*S KotlinDebug\n*F\n+ 1 GzipSource.kt\nokio/GzipSource\n*L\n103#1:224\n105#1:226\n117#1:228\n118#1:229\n120#1:230\n131#1:232\n142#1:234\n104#1:225\n115#1:227\n128#1:231\n139#1:233\n185#1:235\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class GzipSource implements okio.Source {

    @org.jetbrains.annotations.NotNull
    private final java.util.zip.CRC32 crc;

    @org.jetbrains.annotations.NotNull
    private final java.util.zip.Inflater inflater;

    @org.jetbrains.annotations.NotNull
    private final okio.InflaterSource inflaterSource;
    private byte section;

    @org.jetbrains.annotations.NotNull
    private final okio.RealBufferedSource source;

    public GzipSource(@org.jetbrains.annotations.NotNull okio.Source r3) {
            r2 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.g0.p(r3, r0)
            r2.<init>()
            okio.RealBufferedSource r0 = new okio.RealBufferedSource
            r0.<init>(r3)
            r2.source = r0
            java.util.zip.Inflater r3 = new java.util.zip.Inflater
            r1 = 1
            r3.<init>(r1)
            r2.inflater = r3
            okio.InflaterSource r1 = new okio.InflaterSource
            r1.<init>(r0, r3)
            r2.inflaterSource = r1
            java.util.zip.CRC32 r3 = new java.util.zip.CRC32
            r3.<init>()
            r2.crc = r3
            return
    }

    private final void checkEqual(java.lang.String r4, int r5, int r6) {
            r3 = this;
            if (r6 != r5) goto L3
            return
        L3:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            java.lang.String r4 = ": actual 0x"
            r1.append(r4)
            java.lang.String r4 = okio.SegmentedByteString.toHexString(r6)
            r6 = 8
            r2 = 48
            java.lang.String r4 = kotlin.text.u.k4(r4, r6, r2)
            r1.append(r4)
            java.lang.String r4 = " != expected 0x"
            r1.append(r4)
            java.lang.String r4 = okio.SegmentedByteString.toHexString(r5)
            java.lang.String r4 = kotlin.text.u.k4(r4, r6, r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    private final void consumeHeader() throws java.io.IOException {
            r16 = this;
            r0 = r16
            okio.RealBufferedSource r1 = r0.source
            r2 = 10
            r1.require(r2)
            okio.RealBufferedSource r1 = r0.source
            okio.Buffer r1 = r1.bufferField
            r2 = 3
            byte r6 = r1.getByte(r2)
            int r1 = r6 >> 1
            r7 = 1
            r1 = r1 & r7
            r8 = 0
            if (r1 != r7) goto L1c
            r9 = 1
            goto L1d
        L1c:
            r9 = 0
        L1d:
            if (r9 == 0) goto L2a
            okio.RealBufferedSource r1 = r0.source
            okio.Buffer r1 = r1.bufferField
            r2 = 0
            r4 = 10
            r0.updateCrc(r1, r2, r4)
        L2a:
            okio.RealBufferedSource r1 = r0.source
            short r1 = r1.readShort()
            java.lang.String r2 = "ID1ID2"
            r3 = 8075(0x1f8b, float:1.1315E-41)
            r0.checkEqual(r2, r3, r1)
            okio.RealBufferedSource r1 = r0.source
            r2 = 8
            r1.skip(r2)
            int r1 = r6 >> 2
            r1 = r1 & r7
            if (r1 != r7) goto L79
            okio.RealBufferedSource r1 = r0.source
            r2 = 2
            r1.require(r2)
            if (r9 == 0) goto L57
            okio.RealBufferedSource r1 = r0.source
            okio.Buffer r1 = r1.bufferField
            r2 = 0
            r4 = 2
            r0.updateCrc(r1, r2, r4)
        L57:
            okio.RealBufferedSource r1 = r0.source
            okio.Buffer r1 = r1.bufferField
            short r1 = r1.readShortLe()
            r2 = 65535(0xffff, float:9.1834E-41)
            r1 = r1 & r2
            long r4 = (long) r1
            okio.RealBufferedSource r1 = r0.source
            r1.require(r4)
            if (r9 == 0) goto L74
            okio.RealBufferedSource r1 = r0.source
            okio.Buffer r1 = r1.bufferField
            r2 = 0
            r0.updateCrc(r1, r2, r4)
        L74:
            okio.RealBufferedSource r1 = r0.source
            r1.skip(r4)
        L79:
            int r1 = r6 >> 3
            r1 = r1 & r7
            r10 = -1
            r12 = 1
            if (r1 != r7) goto La6
            okio.RealBufferedSource r1 = r0.source
            long r14 = r1.indexOf(r8)
            int r1 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r1 == 0) goto La0
            if (r9 == 0) goto L99
            okio.RealBufferedSource r1 = r0.source
            okio.Buffer r1 = r1.bufferField
            r2 = 0
            long r4 = r14 + r12
            r0.updateCrc(r1, r2, r4)
        L99:
            okio.RealBufferedSource r1 = r0.source
            long r14 = r14 + r12
            r1.skip(r14)
            goto La6
        La0:
            java.io.EOFException r1 = new java.io.EOFException
            r1.<init>()
            throw r1
        La6:
            int r1 = r6 >> 4
            r1 = r1 & r7
            if (r1 != r7) goto Lcf
            okio.RealBufferedSource r1 = r0.source
            long r6 = r1.indexOf(r8)
            int r1 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r1 == 0) goto Lc9
            if (r9 == 0) goto Lc2
            okio.RealBufferedSource r1 = r0.source
            okio.Buffer r1 = r1.bufferField
            r2 = 0
            long r4 = r6 + r12
            r0.updateCrc(r1, r2, r4)
        Lc2:
            okio.RealBufferedSource r1 = r0.source
            long r6 = r6 + r12
            r1.skip(r6)
            goto Lcf
        Lc9:
            java.io.EOFException r1 = new java.io.EOFException
            r1.<init>()
            throw r1
        Lcf:
            if (r9 == 0) goto Le9
            okio.RealBufferedSource r1 = r0.source
            short r1 = r1.readShortLe()
            java.util.zip.CRC32 r2 = r0.crc
            long r2 = r2.getValue()
            int r3 = (int) r2
            short r2 = (short) r3
            java.lang.String r3 = "FHCRC"
            r0.checkEqual(r3, r1, r2)
            java.util.zip.CRC32 r1 = r0.crc
            r1.reset()
        Le9:
            return
    }

    private final void consumeTrailer() throws java.io.IOException {
            r3 = this;
            okio.RealBufferedSource r0 = r3.source
            int r0 = r0.readIntLe()
            java.util.zip.CRC32 r1 = r3.crc
            long r1 = r1.getValue()
            int r2 = (int) r1
            java.lang.String r1 = "CRC"
            r3.checkEqual(r1, r0, r2)
            okio.RealBufferedSource r0 = r3.source
            int r0 = r0.readIntLe()
            java.util.zip.Inflater r1 = r3.inflater
            long r1 = r1.getBytesWritten()
            int r2 = (int) r1
            java.lang.String r1 = "ISIZE"
            r3.checkEqual(r1, r0, r2)
            return
    }

    private final void updateCrc(okio.Buffer r6, long r7, long r9) {
            r5 = this;
            okio.Segment r6 = r6.head
            kotlin.jvm.internal.g0.m(r6)
        L5:
            int r0 = r6.limit
            int r1 = r6.pos
            int r2 = r0 - r1
            long r2 = (long) r2
            int r4 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r4 < 0) goto L19
            int r0 = r0 - r1
            long r0 = (long) r0
            long r7 = r7 - r0
            okio.Segment r6 = r6.next
            kotlin.jvm.internal.g0.m(r6)
            goto L5
        L19:
            r0 = 0
            int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r2 <= 0) goto L3d
            int r2 = r6.pos
            long r2 = (long) r2
            long r2 = r2 + r7
            int r7 = (int) r2
            int r8 = r6.limit
            int r8 = r8 - r7
            long r2 = (long) r8
            long r2 = java.lang.Math.min(r2, r9)
            int r8 = (int) r2
            java.util.zip.CRC32 r2 = r5.crc
            byte[] r3 = r6.data
            r2.update(r3, r7, r8)
            long r7 = (long) r8
            long r9 = r9 - r7
            okio.Segment r6 = r6.next
            kotlin.jvm.internal.g0.m(r6)
            r7 = r0
            goto L19
        L3d:
            return
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r1 = this;
            okio.InflaterSource r0 = r1.inflaterSource
            r0.close()
            return
    }

    @Override // okio.Source
    public long read(@org.jetbrains.annotations.NotNull okio.Buffer r12, long r13) throws java.io.IOException {
            r11 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.g0.p(r12, r0)
            r0 = 0
            int r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r2 < 0) goto L54
            if (r2 != 0) goto Le
            return r0
        Le:
            byte r0 = r11.section
            r1 = 1
            if (r0 != 0) goto L18
            r11.consumeHeader()
            r11.section = r1
        L18:
            byte r0 = r11.section
            r2 = 2
            r3 = -1
            if (r0 != r1) goto L37
            long r7 = r12.size()
            okio.InflaterSource r0 = r11.inflaterSource
            long r9 = r0.read(r12, r13)
            int r13 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r13 == 0) goto L33
            r5 = r11
            r6 = r12
            r5.updateCrc(r6, r7, r9)
            return r9
        L33:
            r5 = r11
            r5.section = r2
            goto L38
        L37:
            r5 = r11
        L38:
            byte r12 = r5.section
            if (r12 != r2) goto L53
            r11.consumeTrailer()
            r12 = 3
            r5.section = r12
            okio.RealBufferedSource r12 = r5.source
            boolean r12 = r12.exhausted()
            if (r12 == 0) goto L4b
            goto L53
        L4b:
            java.io.IOException r12 = new java.io.IOException
            java.lang.String r13 = "gzip finished without exhausting source"
            r12.<init>(r13)
            throw r12
        L53:
            return r3
        L54:
            r5 = r11
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r0 = "byteCount < 0: "
            r12.append(r0)
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r12 = r12.toString()
            r13.<init>(r12)
            throw r13
    }

    @Override // okio.Source
    @org.jetbrains.annotations.NotNull
    public okio.Timeout timeout() {
            r1 = this;
            okio.RealBufferedSource r0 = r1.source
            okio.Timeout r0 = r0.timeout()
            return r0
    }
}
