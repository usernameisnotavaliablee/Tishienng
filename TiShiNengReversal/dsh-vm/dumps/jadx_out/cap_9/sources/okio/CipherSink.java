package okio;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nCipherSink.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CipherSink.kt\nokio/CipherSink\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,148:1\n1#2:149\n85#3:150\n*S KotlinDebug\n*F\n+ 1 CipherSink.kt\nokio/CipherSink\n*L\n47#1:150\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class CipherSink implements okio.Sink {
    private final int blockSize;

    @org.jetbrains.annotations.NotNull
    private final javax.crypto.Cipher cipher;
    private boolean closed;

    @org.jetbrains.annotations.NotNull
    private final okio.BufferedSink sink;

    public CipherSink(@org.jetbrains.annotations.NotNull okio.BufferedSink r2, @org.jetbrains.annotations.NotNull javax.crypto.Cipher r3) {
            r1 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "cipher"
            kotlin.jvm.internal.g0.p(r3, r0)
            r1.<init>()
            r1.sink = r2
            r1.cipher = r3
            int r2 = r3.getBlockSize()
            r1.blockSize = r2
            if (r2 <= 0) goto L1a
            return
        L1a:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "Block cipher required "
            r2.append(r0)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r2 = r2.toString()
            r3.<init>(r2)
            throw r3
    }

    private final java.lang.Throwable doFinal() {
            r8 = this;
            javax.crypto.Cipher r0 = r8.cipher
            r1 = 0
            int r0 = r0.getOutputSize(r1)
            r1 = 0
            if (r0 != 0) goto Lb
            return r1
        Lb:
            r2 = 8192(0x2000, float:1.148E-41)
            if (r0 <= r2) goto L22
            okio.BufferedSink r0 = r8.sink     // Catch: java.lang.Throwable -> L20
            javax.crypto.Cipher r2 = r8.cipher     // Catch: java.lang.Throwable -> L20
            byte[] r2 = r2.doFinal()     // Catch: java.lang.Throwable -> L20
            java.lang.String r3 = "doFinal(...)"
            kotlin.jvm.internal.g0.o(r2, r3)     // Catch: java.lang.Throwable -> L20
            r0.write(r2)     // Catch: java.lang.Throwable -> L20
            return r1
        L20:
            r0 = move-exception
            return r0
        L22:
            okio.BufferedSink r2 = r8.sink
            okio.Buffer r2 = r2.getBuffer()
            okio.Segment r0 = r2.writableSegment$okio(r0)
            javax.crypto.Cipher r3 = r8.cipher     // Catch: java.lang.Throwable -> L45
            byte[] r4 = r0.data     // Catch: java.lang.Throwable -> L45
            int r5 = r0.limit     // Catch: java.lang.Throwable -> L45
            int r3 = r3.doFinal(r4, r5)     // Catch: java.lang.Throwable -> L45
            int r4 = r0.limit     // Catch: java.lang.Throwable -> L45
            int r4 = r4 + r3
            r0.limit = r4     // Catch: java.lang.Throwable -> L45
            long r4 = r2.size()     // Catch: java.lang.Throwable -> L45
            long r6 = (long) r3     // Catch: java.lang.Throwable -> L45
            long r4 = r4 + r6
            r2.setSize$okio(r4)     // Catch: java.lang.Throwable -> L45
            goto L46
        L45:
            r1 = move-exception
        L46:
            int r3 = r0.pos
            int r4 = r0.limit
            if (r3 != r4) goto L55
            okio.Segment r3 = r0.pop()
            r2.head = r3
            okio.SegmentPool.recycle(r0)
        L55:
            return r1
    }

    private final int update(okio.Buffer r11, long r12) {
            r10 = this;
            okio.Segment r0 = r11.head
            kotlin.jvm.internal.g0.m(r0)
            int r1 = r0.limit
            int r2 = r0.pos
            int r1 = r1 - r2
            long r1 = (long) r1
            long r1 = java.lang.Math.min(r12, r1)
            int r2 = (int) r1
            okio.BufferedSink r1 = r10.sink
            okio.Buffer r1 = r1.getBuffer()
            javax.crypto.Cipher r3 = r10.cipher
            int r3 = r3.getOutputSize(r2)
            r7 = r2
        L1d:
            r2 = 8192(0x2000, float:1.148E-41)
            if (r3 <= r2) goto L43
            int r2 = r10.blockSize
            if (r7 > r2) goto L3b
            okio.BufferedSink r0 = r10.sink
            javax.crypto.Cipher r1 = r10.cipher
            byte[] r11 = r11.readByteArray(r12)
            byte[] r11 = r1.update(r11)
            java.lang.String r1 = "update(...)"
            kotlin.jvm.internal.g0.o(r11, r1)
            r0.write(r11)
            int r11 = (int) r12
            return r11
        L3b:
            int r7 = r7 - r2
            javax.crypto.Cipher r2 = r10.cipher
            int r3 = r2.getOutputSize(r7)
            goto L1d
        L43:
            okio.Segment r12 = r1.writableSegment$okio(r3)
            javax.crypto.Cipher r4 = r10.cipher
            byte[] r5 = r0.data
            int r6 = r0.pos
            byte[] r8 = r12.data
            int r9 = r12.limit
            int r13 = r4.update(r5, r6, r7, r8, r9)
            int r2 = r12.limit
            int r2 = r2 + r13
            r12.limit = r2
            long r2 = r1.size()
            long r4 = (long) r13
            long r2 = r2 + r4
            r1.setSize$okio(r2)
            int r13 = r12.pos
            int r2 = r12.limit
            if (r13 != r2) goto L72
            okio.Segment r13 = r12.pop()
            r1.head = r13
            okio.SegmentPool.recycle(r12)
        L72:
            okio.BufferedSink r12 = r10.sink
            r12.emitCompleteSegments()
            long r12 = r11.size()
            long r1 = (long) r7
            long r12 = r12 - r1
            r11.setSize$okio(r12)
            int r12 = r0.pos
            int r12 = r12 + r7
            r0.pos = r12
            int r13 = r0.limit
            if (r12 != r13) goto L92
            okio.Segment r12 = r0.pop()
            r11.head = r12
            okio.SegmentPool.recycle(r0)
        L92:
            return r7
    }

    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r2 = this;
            boolean r0 = r2.closed
            if (r0 == 0) goto L5
            goto L18
        L5:
            r0 = 1
            r2.closed = r0
            java.lang.Throwable r0 = r2.doFinal()
            okio.BufferedSink r1 = r2.sink     // Catch: java.lang.Throwable -> L12
            r1.close()     // Catch: java.lang.Throwable -> L12
            goto L16
        L12:
            r1 = move-exception
            if (r0 != 0) goto L16
            r0 = r1
        L16:
            if (r0 != 0) goto L19
        L18:
            return
        L19:
            throw r0
    }

    @Override // okio.Sink, java.io.Flushable
    public void flush() {
            r1 = this;
            okio.BufferedSink r0 = r1.sink
            r0.flush()
            return
    }

    @org.jetbrains.annotations.NotNull
    public final javax.crypto.Cipher getCipher() {
            r1 = this;
            javax.crypto.Cipher r0 = r1.cipher
            return r0
    }

    @Override // okio.Sink
    @org.jetbrains.annotations.NotNull
    public okio.Timeout timeout() {
            r1 = this;
            okio.BufferedSink r0 = r1.sink
            okio.Timeout r0 = r0.timeout()
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
            boolean r9 = r7.closed
            if (r9 != 0) goto L22
            r9 = r5
        L14:
            r0 = 0
            int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r2 <= 0) goto L21
            int r0 = r7.update(r8, r9)
            long r0 = (long) r0
            long r9 = r9 - r0
            goto L14
        L21:
            return
        L22:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "closed"
            r8.<init>(r9)
            throw r8
    }
}
